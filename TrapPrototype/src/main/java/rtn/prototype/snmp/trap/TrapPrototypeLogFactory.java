package rtn.prototype.snmp.trap;

import org.slf4j.Logger;
import org.snmp4j.log.LogAdapter;
import org.snmp4j.log.LogFactory;
import org.snmp4j.log.LogLevel;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;

/**
 * Overriding the SNMP4J LogFactory
 */
public class TrapPrototypeLogFactory extends LogFactory {
    private LogAdapter rootLogger;
    private HashMap<String, LogAdapter> logAdapters;

    public TrapPrototypeLogFactory() {
        this.rootLogger = new SLFAdapter(org.slf4j.LoggerFactory.getLogger(""));
         logAdapters = new HashMap<>();
    }

    @Override
    public LogAdapter getRootLogger() {
        return rootLogger;
    }

    @Override
    protected LogAdapter createLogger(Class c) {
        return createLogger(c.getName());
    }

    @Override
    protected LogAdapter createLogger(String className) {
        LogAdapter logAdapter;
        if(logAdapters.containsKey(className)) {
            logAdapter = logAdapters.get(className);
        } else {
            logAdapter = new SLFAdapter(org.slf4j.LoggerFactory.getLogger(className));
            logAdapters.put(className, logAdapter);
        }
        return logAdapter;
    }

    public static void override() {
        TrapPrototypeLogFactory factory = new TrapPrototypeLogFactory();
        LogFactory.setLogFactory(factory);
    }

    private class SLFAdapter implements LogAdapter {
        private Logger wrapped;
        private LogLevel level;

        public SLFAdapter(Logger wrapped) {
            this.wrapped = wrapped;
        }

        @Override
        public boolean isDebugEnabled() {
            return wrapped.isDebugEnabled();
        }

        @Override
        public boolean isInfoEnabled() {
            return wrapped.isInfoEnabled();
        }

        @Override
        public boolean isWarnEnabled() {
            return wrapped.isInfoEnabled();
        }

        @Override
        public void debug(Serializable message) {
            if(message instanceof String) {
                wrapped.debug((String) message);
                return;
            }
            if(message instanceof Throwable) {
                wrapped.debug("Thrown: ", (Throwable) message);
                return;
            }
            wrapped.debug(message.toString());
        }

        @Override
        public void info(CharSequence message) {
            wrapped.info(message.toString());
        }

        @Override
        public void warn(Serializable message) {
            if(message instanceof String) {
                wrapped.warn((String) message);
                return;
            }
            if(message instanceof Throwable) {
                wrapped.warn("Thrown: ", (Throwable) message);
                return;
            }
            wrapped.warn(message.toString());
        }

        @Override
        public void error(Serializable message) {
            fatal(message);
        }

        @Override
        public void error(CharSequence message, Throwable throwable) {
            wrapped.error(message.toString(), throwable);
        }

        @Override
        public void fatal(Object message) {
            if(message instanceof String) {
                wrapped.error((String) message);
                return;
            }
            if(message instanceof Throwable) {
                wrapped.error("Thrown: ", (Throwable) message);
                return;
            }
            wrapped.error(message.toString());
        }

        @Override
        public void fatal(CharSequence message, Throwable throwable) {
            wrapped.error(message.toString(), throwable);
        }

        @Override
        public void setLogLevel(LogLevel level) {
            this.level = level;
        }

        @Override
        public LogLevel getLogLevel() {
            return level;
        }

        @Override
        public LogLevel getEffectiveLogLevel() {
            return LogLevel.ALL;
        }

        @Override
        public String getName() {
            return wrapped.getName();
        }

        @Override
        public Iterator getLogHandler() {
            return new Iterator() {
                @Override
                public boolean hasNext() {
                    return false;
                }

                @Override
                public Object next() {
                    return null;
                }
            };
        }
    }
}
