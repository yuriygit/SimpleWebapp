package ua.yuriyb.mavenwebapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class AppController {

   @RequestMapping(value="/test", method = RequestMethod.GET)
   public String test(ModelMap model) {
      model.addAttribute("msgArgument", "Test : Success!");
      return "index";
   }

   @RequestMapping(value="/print/{arg}", method = RequestMethod.GET)
   public String print(@PathVariable String arg, ModelMap model) {
      model.addAttribute("msgArgument", "Test, input variable: " + arg);
      return "index";
   }
}