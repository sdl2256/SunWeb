package dl.sun.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by SDL on 2015/12/2.
 */
@Controller
@RequestMapping(value="/shop")
public class ShopController {

    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public String test(){
        return "test";
    }
}
