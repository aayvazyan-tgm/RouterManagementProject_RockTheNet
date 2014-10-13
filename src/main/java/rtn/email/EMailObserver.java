package rtn.email;


import org.apache.commons.mail.EmailException;
import org.apache.log4j.*;
import rtn.observer.*;

public class EMailObserver implements Observer<Observable> {

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
            Logger rtnlog=Logger.getLogger("rtn");
            rtnlog.log(Level.ERROR,"The E-Mail could not be sent: "+e.getMessage());
        } catch (CloneNotSupportedException e) {
            Logger rtnlog=Logger.getLogger("rtn");
            rtnlog.log(Level.ERROR,"(Internal Error) The E-Mail could not be sent: "+e.getMessage());
            e.printStackTrace();
        }
    }
}
