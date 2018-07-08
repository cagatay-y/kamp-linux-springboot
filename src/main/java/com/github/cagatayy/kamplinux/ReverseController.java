package com.github.cagatayy.kamplinux;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ReverseController {

    @GetMapping("/")
    public String reverse(@RequestParam(name="input") String input, Model model) {
        model.addAttribute("reverse", new StringBuilder(input).reverse().toString());
        return "reverse";
    }

}
