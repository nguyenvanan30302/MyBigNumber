package org.example.task2.controller;

import org.example.task2.dto.SumRequest;
import org.example.task2.service.NumberService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
    public String sum(@RequestBody SumRequest sumRequest, Model model) {
        String result = numberService.addNumberService(sumRequest.getNum1(), sumRequest.getNum2());
        model.addAttribute("num1", sumRequest.getNum1());
        model.addAttribute("num2", sumRequest.getNum2());
        model.addAttribute("result", result);
        return "sum";
    }

}
