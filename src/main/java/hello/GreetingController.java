package hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.io.IOException;

@Controller
public class GreetingController {

    @RequestMapping(value="/tweetHandler", method=RequestMethod.GET)
    public String greetingForm(Model model) {
        model.addAttribute("greeting", new URL());
        return "greeting";
    }

    @RequestMapping(value="/tweetHandler", method=RequestMethod.POST)
    public String greetingSubmit(@ModelAttribute URL greeting, Model model) throws IOException {
        String url = greeting.getContent();
        ParsePage p = new ParsePage(url);
        TweetHandler tweetHandler = new TweetHandler();
        tweetHandler.setAuthorHandle(p.getTwitterAuthorHandle());
        tweetHandler.setTweetHandles(p.getTwitterHandlers());
        model.addAttribute("twitter",tweetHandler);
        return "result";
    }

}
