package net.bounceme.doge.ejb;

import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class NewSessionBeanRemote implements NewSessionBeanRemoteRemote {

    @EJB
    private ContactsFacadeLocal contactsFacade;

    @Override
    public String businessMethod() {
        List<Contacts> all = contactsFacade.findAll();
        return all.toString();
    }

}
