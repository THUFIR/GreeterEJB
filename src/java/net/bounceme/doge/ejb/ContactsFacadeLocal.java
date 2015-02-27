package net.bounceme.doge.ejb;

import java.util.List;
import javax.ejb.Local;

@Local
public interface ContactsFacadeLocal {

    void create(Contacts contacts);

    void edit(Contacts contacts);

    void remove(Contacts contacts);

    Contacts find(Object id);

    List<Contacts> findAll();

    List<Contacts> findRange(int[] range);

    int count();
    
}
