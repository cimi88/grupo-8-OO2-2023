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
import com.unla.grupo8.services.implementations.EspacioService;

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
	
	@Autowired
	@Qualifier("espacioService")
	private EspacioService espacioService;
	
	@GetMapping("/creardispositivo")
	public ModelAndView crearDispositivoBasura(Model model) {
		
		ModelAndView modelAndView = new ModelAndView(ViewRouteHelpers.DISPOSITIVOBASURA_FORM);
		model.addAttribute("espacios", espacioRepository.findAll());
		model.addAttribute("dispositivo", new DispositivoBasuraModelo());
		
		return modelAndView;
	}
	
	@PostMapping("/nuevodispositivo")
	public ModelAndView nuevoDispositivo(@Valid @ModelAttribute("dispositivo") DispositivoBasuraModelo dispoBasModel, 
			BindingResult b) {
		
		ModelAndView mV = new ModelAndView();
		if(b.hasErrors()) {
			mV.setViewName(ViewRouteHelpers.EDITAR_DISPOSITIVO_BASURA);
		}else {
			
			dispositivoBasuraService.insertOrUpdate(dispoBasModel);
			
			mV = mostrarTablaDispositivos();
		}
		return mV;
	}
	
	@PreAuthorize("hasRole('ROLE_AUDITOR')")
	@GetMapping("/listaAuditor")
	public ModelAndView mostrarTablaDispositivosAuditor() {
		
	    ModelAndView mV = new ModelAndView(ViewRouteHelpers.LISTA_BASURA_AUDITOR);
	    mV.addObject("listaBasura", dispositivoBasuraService.getAll());
	    return mV;
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

	@GetMapping("/editarDispositivo/{id}")
	public ModelAndView  editarDispositivo(@PathVariable("id")int id, Model model) {	
		
		DispositivoBasuraModelo dispoBasModel = dispositivoBasuraService.traerPorId(id);
		model.addAttribute("dispositivo", dispoBasModel);
		model.addAttribute("espacios", espacioService.getAll());	
		ModelAndView modelAndView = new ModelAndView(ViewRouteHelpers.EDITAR_DISPOSITIVO_BASURA);
		
		
		return modelAndView;	
	}
	
	//modificar para setear traigo el dispositivo y editamos
		@PostMapping("/editarDispositivo/{id}")
		public ModelAndView nuevoDispositivo(@PathVariable("id")int id, @Valid @ModelAttribute("dispositivo") DispositivoBasuraModelo dispoBasModel, 
				BindingResult b) {
			
			ModelAndView mV = new ModelAndView();
			if(b.hasErrors()) {
				mV.setViewName(ViewRouteHelpers.EDITAR_DISPOSITIVO_BASURA);
			}else {
				
				dispositivoBasuraService.insertOrUpdate(dispoBasModel);
				
				mV = mostrarTablaDispositivos();
			}
			return mV;
		}
	
	
	@GetMapping("/bajaBasura/{id}")
	public ModelAndView bajaDispositivoBasura (@PathVariable("id")int id) {
		dispositivoBasuraService.baja(id);
		return mostrarTablaDispositivos();
	}
}
