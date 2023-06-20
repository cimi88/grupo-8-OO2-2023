package com.unla.grupo8.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.unla.grupo8.helpers.ViewRouteHelper;
import com.unla.grupo8.models.DispositivoAspersorModelo;
import com.unla.grupo8.services.IDispositivoAspersorService;

@Controller
@PreAuthorize("hasRole('ROLE_ADMIN')")
@RequestMapping("riego")
public class AspersorController {
	
	@Autowired
	@Qualifier("dispositivoAspersorService")
	private IDispositivoAspersorService dispositivoAspersorService;
	
	@PostMapping("/nuevoDispositivoAspersor")
	public ModelAndView cargarAspersor(@ModelAttribute("dispositivo") DispositivoAspersorModelo dAspersor) {
		ModelAndView mV = new ModelAndView(ViewRouteHelper.FORM_DISPOSITIVO_ASPERSOR);
		
		dispositivoAspersorService.insertOrUpdate(dAspersor);
		mV.setViewName(ViewRouteHelper.LISTA_DISPOSITIVO_ASPERSOR);
		mV.addObject("dispositivo", dAspersor);
		mV.addObject("listaDispositivos", dispositivoAspersorService.getAll());
		return mV;
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
