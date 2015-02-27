package net.bounceme.doge.ejb;

import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class ContactsSessionBean implements ContactsSessionBeanRemote {

    @EJB
    private ContactsFacadeLocal contactsFacade;

    @Override
    public String getAllContacts() {
        List<Contacts> all = contactsFacade.findAll();
        return all.toString();
    }

}
