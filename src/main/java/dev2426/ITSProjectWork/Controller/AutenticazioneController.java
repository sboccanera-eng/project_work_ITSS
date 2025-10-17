package dev2426.ITSProjectWork.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import dev2426.ITSProjectWork.Model.Utente;
import dev2426.ITSProjectWork.Services.UtentiService;

@Controller
public class AutenticazioneController {

	    @Autowired
	    private UtentiService serv;
	    
	    @GetMapping("/login")
	    public String showLogin() {
	        return "login"; 
	    }
	    
	    @GetMapping("/register")
	    public String showRegister(Model model) {
	        model.addAttribute("utente", new Utente());
	        return "registrazione"; 
	    }

	    @PostMapping("/register")
	    public String processRegistration(@ModelAttribute("utente") Utente utente) {
	    	System.out.println(utente.getNome());
	        serv.insert(utente);
	        return "redirect:/login?success";
	    }

}