package com.unla.grupo8.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.unla.grupo8.helpers.ViewRouteHelper;
import com.unla.grupo8.models.DispositivoAspersorModelo;
import com.unla.grupo8.repositories.IEspacioRepository;
import com.unla.grupo8.services.IDispositivoAspersorService;

@Controller
@PreAuthorize("hasRole('ROLE_ADMIN')")
@RequestMapping("riego")
public class AspersorController {
	
	@Autowired 	@Qualifier("dispositivoAspersorService")
	private IDispositivoAspersorService dispositivoAspersorService;
	
	@Autowired 	@Qualifier("espacioRepository")
	private IEspacioRepository espacioRepository;
	
	@GetMapping("/cargaraspersor")
	public ModelAndView cargarAspersor(Model model) {
		
		ModelAndView modelAndView = new ModelAndView(ViewRouteHelper.FORM_DISPOSITIVO_ASPERSOR);
		model.addAttribute("espacios", espacioRepository.findAll());
		model.addAttribute("dispositivo", new DispositivoAspersorModelo());
		
		return modelAndView;
	}
	
	@PostMapping("/nuevodispositivo")
	public ModelAndView agregarDispositivo(@Validated @ModelAttribute("dispositivo") DispositivoAspersorModelo aspersorModelo,
			BindingResult bindingResult) {
		ModelAndView modelAndView = new ModelAndView();

		if (bindingResult.hasErrors()) {
			modelAndView.setViewName(ViewRouteHelper.FORM_DISPOSITIVO_ASPERSOR);
			modelAndView.addObject("espacios", espacioRepository.findAll());
			return modelAndView;
		}

		dispositivoAspersorService.insertOrUpdate(aspersorModelo);
		return mostrarTablaDispositivos();
	}
	
	@GetMapping("/lista")
	public ModelAndView mostrarTablaDispositivos(){
		ModelAndView mV = new ModelAndView(ViewRouteHelper.LISTA_DISPOSITIVO_ASPERSOR);
		mV.addObject("listaAspersor", dispositivoAspersorService.getAll());
		return mV;
	}
	
	@GetMapping("/eliminar/{id}")
	public ModelAndView eliminarDispositivo(@PathVariable("id")int id, Model model) {	
		dispositivoAspersorService.remove(id);
		return mostrarTablaDispositivos();	
	}
} 
