package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import models.Distionary;



@Controller
public class DistionaryController {
    Distionary dictionary = new Distionary();

    @RequestMapping(value = "/form")
    public String showForm(Model model){
        return "/form";
    }

    @RequestMapping(value = "search")
    public String result(@RequestParam("eng") String eng,Model model){
        String search = this.dictionary.translate(eng);
        model.addAttribute("search", search);
        return "/search";
    }
}
