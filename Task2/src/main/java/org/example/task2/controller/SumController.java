package org.example.task2.controller;

import org.example.task2.service.NumberService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SumController {
    private final NumberService numberService;


    public SumController(NumberService numberService) {
        this.numberService = numberService;
    }
    @GetMapping("/")
    public String display() {
        return "sum";
    }

    @PostMapping("/cal")
    public String sum(@RequestParam("num1") String num1,
                      @RequestParam("num2") String num2,
                      Model model) {
        String result = numberService.addNumberService(num1,num2);
        model.addAttribute("num1", num1);
        model.addAttribute("num2", num2);
        model.addAttribute("result", result);
        return "sum";
    }

}
