package com.spring.session.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.spring.session.entity.Application;
import com.spring.session.service.ApplicationService;
import com.spring.session.service.ReleaseService;
import com.spring.session.service.TicketService;

@Controller

public class JiraController {
	@Autowired
    private ApplicationService applicationService;
	@Autowired
    private TicketService ticketService;
	@Autowired
    private ReleaseService releaseService;

  
    @GetMapping("/applications")
    public String retrieveApplications(Model model){
        model.addAttribute("applications", applicationService.listApplications());
        return "applications";
    }
    
    @GetMapping("/applications/new")
    public String showApplicationCreate(Model model){
    	model.addAttribute("application", new Application());
    	return "addApplication";
    }
    
    @PostMapping("/applications/create")
    public String postApplication(Application application){
    	applicationService.saveApplication(application);
    	return "redirect:/applications";
    }

    @GetMapping("/tickets")
    public String retrieveTickets(Model model){
        model.addAttribute("tickets", ticketService.listTickets());
        return "tickets";
    }

    @GetMapping("/releases")
    public String retrieveReleases(Model model){
        model.addAttribute("releases", releaseService.listReleases());
        return "releases";
    }
}