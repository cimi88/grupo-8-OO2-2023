package com.unla.grupo8.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.unla.grupo8.helpers.ViewRouteHelpers;
import com.unla.grupo8.models.DispositivoEstacionamientoModelo;
import com.unla.grupo8.models.MedicionEstacionamientoModelo;
import com.unla.grupo8.services.implementations.DispositivoEstacionamientoService;

@Controller
@RequestMapping("/medicion")
public class MedicionEstacionamientoController { 
	
	@Autowired
	@Qualifier("dispositivoEstacionamientoService")
	private DispositivoEstacionamientoService dispositivoEstacionamientoService;
 
	 
	@GetMapping("/estacionamiento/{id}") 
	public ModelAndView mostrarTablaMedicionesEstacionamiento(@PathVariable("id")int id) {
		
	    ModelAndView mV = new ModelAndView(ViewRouteHelpers.LISTA_MEDICION_ESTACIONAMIENTO);
	    mV.addObject("mediciones", dispositivoEstacionamientoService.traerPorId(id).getMediciones());
	    return mV;
	}  
	 
	@GetMapping("/crearmedicion/{id}")
	public ModelAndView crearMedicion(@PathVariable("id")int id, Model model) {
		
		ModelAndView modelAndView = new ModelAndView(ViewRouteHelpers.CREAR_MEDICION_ESTACIONAMIENTO);

		model.addAttribute("medicion", new MedicionEstacionamientoModelo());
		
		
		return modelAndView;
	}
} 
