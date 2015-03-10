package eu.keyup.controller;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping(method = RequestMethod.GET)
public class DefaultController {

    @RequestMapping("/hello/{name}")
    public String greetAction(@PathVariable String name, Model model) {
        model.addAttribute("name", name);
        return "/greet";
    }
}
