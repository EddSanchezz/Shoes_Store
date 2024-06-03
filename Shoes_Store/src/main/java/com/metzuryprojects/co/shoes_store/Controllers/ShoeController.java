package com.metzuryprojects.co.shoes_store.Controllers;

import com.metzuryprojects.co.shoes_store.Models.Shoe;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ShoeController {

    @GetMapping("/shoe")
    public String showShoe(Model model) {
        Shoe shoe = new Shoe("Nike Air Max", "Comfortable running shoes", 120.00);
        model.addAttribute("shoe", shoe);
        return "shoe";
    }
}