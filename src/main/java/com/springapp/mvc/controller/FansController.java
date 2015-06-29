package com.springapp.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by hujiaxuan on 2015/6/28.
 */
@Controller
public class FansController {
    @RequestMapping("/fans")
    public ModelAndView start(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("fans");
        return mv;
    }

}
