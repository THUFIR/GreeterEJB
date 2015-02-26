package net.bounceme.doge.ejb;

import javax.ejb.Stateless;

@Stateless
public class NewSessionBeanRemote implements NewSessionBeanRemoteRemote {

    @Override
    public String businessMethod() {
        return "wow";
    }

}
