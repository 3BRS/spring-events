package eu.keyup.listener;

import eu.keyup.event.UserGreeted;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class GreetingListener implements ApplicationListener<UserGreeted> {
    @Override
    public void onApplicationEvent(UserGreeted event) {
        String name = event.getGreetingData().getName();
        name += " (sorry, but " + name + " sounds really stupid...)";
        event.getGreetingData().setName(name);
        LogFactory.getLog(this.getClass()).info("Greeted:" + name);
    }
}
