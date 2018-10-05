package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 10/1/2018.
 * Project: demo
 * *******************************
 */
@Controller

public class MyController {

    @RequestMapping("/")
    public String home(Model model) {
        HashMap <String, String> map = new HashMap <>();
        map.put("home_attr1", "333");
        model.addAllAttributes(map);
        model.addAttribute("home_attr2", 555);
        return "home";
    }

    @RequestMapping("/test4")
    public ModelAndView test4() {

        ModelAndView mav = new ModelAndView();
        Map <String, String> mymap = new HashMap <>();
        mymap.put("aaa", "aaa");
        mav.addAllObjects(mymap);
        mav.setViewName("test4");
        return mav;
    }

    @RequestMapping("/test3")
    @ModelAttribute("foo")
    public Foo test3() {
        return new Foo("foo");
    }
}
