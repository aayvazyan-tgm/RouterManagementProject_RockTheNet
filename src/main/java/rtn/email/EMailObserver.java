package rtn.email;


import org.apache.commons.mail.EmailException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import rtn.observer.Observable;
import rtn.observer.Observer;

public class EMailObserver implements Observer<Observable> {
    private static final Logger logger = LoggerFactory.getLogger(EMailObserver.class);

	private EMailWorker eMailWorker;

    /**
     * notifies the observable
     * @param observable the notifier
     */
    @Override
    public void notify(Observable observable) {
        try {
            eMailWorker.send(EMailFactory.getMail());
        } catch (EmailException e) {
            logger.error("The E-Mail could not be sent.", e);
        } catch (CloneNotSupportedException e) {
            logger.error("(Internal Error) The E-Mail could not be sent.", e);
            //e.printStackTrace();
        }
    }
}
