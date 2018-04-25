package com.eksamen.eksamensprojekt;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class Controlleren {

    @GetMapping(value = {"/", "index"})
    public String index(){
        return "index";
    }
}
