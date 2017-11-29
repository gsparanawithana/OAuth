package org.apache;

/**
 * Created by Dexter on 11/24/2017.
 */
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class AppController {

    @RequestMapping("/")
    public String index() {

        return "index.html";
    }
}