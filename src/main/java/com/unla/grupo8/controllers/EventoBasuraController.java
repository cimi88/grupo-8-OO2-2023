package com.unla.grupo8.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.unla.grupo8.helpers.ViewRouteHelpers;
import com.unla.grupo8.models.DispositivoBasuraModelo;
import com.unla.grupo8.services.IDispositivoBasuraService;


@Controller
@PreAuthorize("hasRole('ROLE_ADMIN')")
@RequestMapping("evento")
public class EventoBasuraController {
	
	@Autowired
	@Qualifier("dispositivoBasuraService")
	private IDispositivoBasuraService dispositivoBasuraService;
	
	@Autowired
	@Qualifier("eventoBasuraService")
	private EventoBasuraService eventoBasuraService;
	
	@GetMapping("/lista")
	public ModelAndView mostrarEventos() {
		ModelAndView mV = new ModelAndView(ViewRouteHelpers.LISTA_EVENTOS);
		mV.addObject("listaEventos", eventoBasuraService.getAll());
	    return mV;
	}
	
	@GetMapping("/listaEventoDispositivo/{id}")
	public ModelAndView mostrarEventosDispositivo(@PathVariable("id")int id) {
		
		ModelAndView mV = new ModelAndView(ViewRouteHelpers.LISTA_EVENTOS);
		DispositivoBasuraModelo dispBasModel = dispositivoBasuraService.traerPorId(id);
		mV.addObject("listaEventos", dispBasModel.getEventos());
	    return mV;
	}	
}
