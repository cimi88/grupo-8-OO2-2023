package com.unla.grupo8.controllers;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


import com.unla.grupo8.helpers.ViewRouteHelpers;
import com.unla.grupo8.models.DispositivoBasuraModelo;
import com.unla.grupo8.repositories.IEspacioRepository;
import com.unla.grupo8.services.IDispositivoBasuraService;

import jakarta.validation.Valid;
import org.springframework.web.servlet.view.RedirectView;
@Controller
@PreAuthorize("hasRole('ROLE_ADMIN')")
@RequestMapping("basura") 
public class BasuraController {
	@Autowired
	@Qualifier("dispositivoBasuraService")
	private IDispositivoBasuraService dispositivoBasuraService;
	
	@Autowired
	@Qualifier("espacioRepository")
	private IEspacioRepository espacioRepository;
	
	@GetMapping("/creardispositivo")
	public ModelAndView crearDispositivoBasura(Model model) {
		
		ModelAndView modelAndView = new ModelAndView(ViewRouteHelpers.DISPOSITIVOBASURA_FORM);
		model.addAttribute("espacios", espacioRepository.findAll());
		model.addAttribute("dispositivo", new DispositivoBasuraModelo());
		
		return modelAndView;
	}
	
	@GetMapping("/lista")
	public ModelAndView mostrarTablaDispositivos() {
		
	    ModelAndView mV = new ModelAndView(ViewRouteHelpers.LISTA_BASURA);
	    mV.addObject("listaBasura", dispositivoBasuraService.getAll());
	    return mV;
	}

	@GetMapping("/eliminar/{id}")
	
	public ModelAndView eliminarDispositivo(@PathVariable("id")int id, Model model) {	
		
		dispositivoBasuraService.remove(id);
			
		return mostrarTablaDispositivos();	
	} 

	
	
	@PostMapping("/nuevodispositivo")
	public ModelAndView agregarDispositivo(@Valid @ModelAttribute("dispositivo") DispositivoBasuraModelo dispBasMod, BindingResult b) {
		ModelAndView modelAndView = new ModelAndView();
		if (b.hasErrors()) {
			modelAndView.setViewName(ViewRouteHelpers.DISPOSITIVOBASURA_FORM);
			modelAndView.addObject("espacios", espacioRepository.findAll());
			return modelAndView;
		}

		dispositivoBasuraService.insertOrUpdate(dispBasMod);
		return mostrarTablaDispositivos();
	}
}
