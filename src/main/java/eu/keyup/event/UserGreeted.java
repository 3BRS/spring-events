package eu.keyup.event;

import eu.keyup.dto.GreetingData;
import org.springframework.context.ApplicationEvent;

/**
 * Event for greeting.
 */
public class UserGreeted extends ApplicationEvent {
    private final GreetingData greetingData;

    public UserGreeted(Object source, GreetingData greetingData) {
        super(source);
        this.greetingData = greetingData;
    }

    public GreetingData getGreetingData() {
        return greetingData;
    }
}
