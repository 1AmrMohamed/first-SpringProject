package com.mvc.precentation;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
// @RequestMapping(value = {"/home/*", "/*"})
public class AppController {

    @RequestMapping(value = {"/*", "/personData"}, method = RequestMethod.GET)
    public String personData() {
        System.out.println("Person data ...");
        return "personData";
    }

    /*
    @RequestMapping(value = "displayData", method = RequestMethod.GET)
    public String displayData() {
        System.out.println("display Data");
        return "displayData";
    }
     */
 /*
    @RequestMapping(value = "displayData", method = RequestMethod.GET)
    public String displayData(HttpServletRequest request) {
        String personName = request.getParameter("personName");
        System.out.println("Person Name : " + personName);
        request.setAttribute("personNameAtt", personName);
        return "displayData";
    }
     */
 /*
    @RequestMapping(value = "displayData", method = RequestMethod.GET)
    public String displayData(@RequestParam("personName") String perName, @RequestParam("personAge") String perAge, Model model) {
        System.out.println("Person Name .. : " + perName);
        model.addAttribute("personNameAtt", perName);
        return "displayData";
    }
     */
    @RequestMapping(value = "displayData", method = RequestMethod.GET)
    public ModelAndView displayData(@RequestParam("personName") String perName, @RequestParam("personAge") String perAge) {
        System.out.println("Person Name ..... : " + perName);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("displayData");
        modelAndView.addObject("personNameAtt", perName);
        return modelAndView;
    }

}
