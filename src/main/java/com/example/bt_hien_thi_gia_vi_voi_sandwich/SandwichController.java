package com.example.bt_hien_thi_gia_vi_voi_sandwich;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/sandwichs")
public class SandwichController {

    @Autowired
    private SandwichRepository sandwichRepository;

    @GetMapping()
    public String displayCondiments() {
        return "select";
    }

    @PostMapping("/list")
    public String showSelect(@RequestParam(defaultValue = "") String lettuce,
                             @RequestParam(defaultValue = "") String tomato,
                             @RequestParam(defaultValue = "") String mustard,
                             @RequestParam(defaultValue = "") String sprouts,
                             Model model) {
     List<String> condiments = sandwichRepository.save(lettuce,tomato,mustard,sprouts);
    model.addAttribute("condiments",condiments);
    return "list";
    }

}
