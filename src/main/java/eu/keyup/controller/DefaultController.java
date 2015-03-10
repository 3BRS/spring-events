package eu.keyup.controller;

import eu.keyup.dto.GreetingData;
import eu.keyup.event.UserGreeted;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping(method = RequestMethod.GET)
public class DefaultController {
    @Autowired
    private ApplicationEventPublisher eventPublisher;

    @RequestMapping("/hello/{name}")
    public String greetAction(@PathVariable String name, Model model) {
        // create the event with data
        GreetingData greetingData = new GreetingData(name);
        UserGreeted userGreeted = new UserGreeted(this, greetingData);
        // publish it
        eventPublisher.publishEvent(userGreeted);
        // put the data to the model
        model.addAttribute("name", greetingData.getName());
        return "/greet";
    }
}
