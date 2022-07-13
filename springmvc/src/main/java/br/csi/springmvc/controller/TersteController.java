package br.csi.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TersteController {


    @GetMapping("/teste")
    public void teste(){
        System.out.println("..... teste spring mvc");
    }


}
