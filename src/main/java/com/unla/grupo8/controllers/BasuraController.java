package com.unla.grupo8.controllers;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;


import com.unla.grupo8.helpers.ViewRouteHelpers;
import com.unla.grupo8.models.DispositivoBasuraModelo;
import com.unla.grupo8.services.IDispositivoBasuraService;

import jakarta.validation.Valid;

@Controller
@PreAuthorize("hasRole('ROLE_ADMIN')")
@RequestMapping("basura") 
public class BasuraController {
	@Autowired
	@Qualifier("dispositivoBasuraService")
	private IDispositivoBasuraService dispositivoBasuraService;
	
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
	
	@GetMapping("/crearDispositivo")
	public ModelAndView crearPersona(Model model) {
		model.addAttribute("dispositivo", new DispositivoBasuraModelo());
		
		//User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		ModelAndView modelAndView = new ModelAndView(ViewRouteHelpers.DISPOSITIVOBASURA_FORM);
		//modelAndView.addAllObjects("usuario", user);
		return modelAndView;
	}
	
	@PostMapping("/nuevapersona")
	public ModelAndView nuevaPersona(@Valid @ModelAttribute("dispositivo") DispositivoBasuraModelo dispBasMod, 
			BindingResult b, @RequestParam("file") MultipartFile imagen) {
		
		ModelAndView mV = new ModelAndView();
		if(b.hasErrors()) {
			mV.setViewName(ViewRouteHelpers.DISPOSITIVOBASURA_FORM);
		}else {
			
			//Modificamos el insertar de la persona para que se inserte el avatar tambien...
			dispositivoBasuraService.insertOrUpdate(dispBasMod);
			
			mV.setViewName(ViewRouteHelpers.DISPOSITIVOBASURA_NEW);
			mV.addObject("persona", dispBasMod);
			
			//Podriamos tambien agregarle las personas que tenemos en la Base de Datos
			mV.addObject("listaPersonas" , dispositivoBasuraService.getAll());
		}
		
		return mV;
	}
}
