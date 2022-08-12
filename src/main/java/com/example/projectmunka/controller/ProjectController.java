package com.example.projectmunka.controller;

import com.example.projectmunka.model.ProjectModel;
import com.example.projectmunka.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.time.LocalDate;

@Controller
public class ProjectController {

    private ProjectService projectService;

    @Autowired
    public ProjectController(ProjectService projectService){
        this.projectService = projectService;
    }
    @GetMapping(value = "/maintenance")
    public String MainPage (Model model) {
        ProjectModel projectmodel = new ProjectModel("Name", 12345678, "Valami", LocalDate.now());

        model.addAttribute("product", projectmodel);

        return "maintenance";
    }
    @GetMapping(value = "/newitem")
    public String newItem (Model model) {
        ProjectModel projectmodel = new ProjectModel();

        model.addAttribute("UserProduct", projectmodel);
        return "newitem";
    }
    @PostMapping(value = "/newitem")
    public String useritem (Model model, ProjectModel projectModel) {
        this.projectService.manager(projectModel);
        return "redirect:/success";
    }
    @GetMapping(value = "/success")
    public String success () {
        return "success";
    }
    @GetMapping(value = "/allitem")
    public String allItem (Model model) {
        // this.projectService.List();
        model.addAttribute("inventory", projectService.List());
        return "allitem";
    }
    @GetMapping(value = "/shopinfo")
    public String Shopinfo (Model model) {
        return "shopinfo";
    }
    @GetMapping(value = "/about")
    public String about (Model model) {
        return "about";
    }

}
