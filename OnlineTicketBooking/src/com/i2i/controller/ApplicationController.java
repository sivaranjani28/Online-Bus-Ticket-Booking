package com.i2i.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


import com.i2i.model.User;
import com.i2i.service.UserService;
@Controller
public class ApplicationController {
    @Autowired   
    UserService userService;
     
    @RequestMapping(value = "/UserLogin")
    public ModelAndView getRegisterForm(@ModelAttribute("user") User user, BindingResult result) {
        /*Map<String, Object> model = new HashMap<String, Object>();
        model.put("user", user);
        System.out.println(user.getName());*/
        return new ModelAndView("UserLogin");
        
    }
   
   @RequestMapping("/saveUser")
    public ModelAndView saveUserData(@ModelAttribute("user") User user, BindingResult result) {
        System.out.println("Save User Data");
        System.out.println(userService);
        System.out.println(user);
        userService.addUser(user);
        return new ModelAndView("UserLogin");
        //return new ModelAndView("redirect:/Response.html");
    }
   
   @RequestMapping("/authenticate")
   public ModelAndView authenticateUser(@ModelAttribute("user") User user, BindingResult result) {
       System.out.println("Authenticate");
       System.out.println(userService);
       System.out.println(user);
       boolean isValid = userService.isValid(user.getEmail(), user.getPassword());
       if (isValid){
           return new ModelAndView("UserRegister");
       } else {
    	   return new ModelAndView("UserLogin");
       }
       //return new ModelAndView("redirect:/Response.html");
   }
   
   @RequestMapping(value = "/SearchBus")
   public ModelAndView getSearchForm() {
       /*Map<String, Object> model = new HashMap<String, Object>();
       model.put("user", user);
       System.out.println(user.getName());*/
       return new ModelAndView("SearchBus");
       
   }
   @RequestMapping(value = "/test",method = RequestMethod.POST)
   public ModelAndView test(@RequestParam("source") String source,@RequestParam("destination") String destination,@RequestParam("dateOfTravel") String dateOfTravel) {
       /*Map<String, Object> model = new HashMap<String, Object>();
       model.put("user", user);
       System.out.println(user.getName());*/
       System.out.println(source);
       System.out.println(destination);
       System.out.println(dateOfTravel);
       return new ModelAndView("SearchBus");

   }
   
   
}
   
