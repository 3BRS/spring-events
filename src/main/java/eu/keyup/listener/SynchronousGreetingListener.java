package eu.keyup.listener;

import eu.keyup.event.UserGreeted;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class SynchronousGreetingListener implements ApplicationListener<UserGreeted> {
    @Override
    public void onApplicationEvent(UserGreeted event) {
        String greeting = event.getGreetingData().getName();
        greeting += ", I wish you a pleasant day";
        event.getGreetingData().setName(greeting);
        LogFactory.getLog(this.getClass()).info("Greeted:" + greeting);
    }
}
