package com.MaksDenysov.Controll;

import com.MaksDenysov.Serv.Servis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/App")
public class Controllerr {

    @Autowired
    private Servis servis;

    @RequestMapping(value = "/plus" , method = RequestMethod.GET)
    public @ResponseBody
    Integer plusData(@RequestParam int a,@RequestParam int b){


        return servis.add(a,b);

    }





}
