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
import com.unla.grupo8.services.implementations.EventoService;

@Controller
@PreAuthorize("hasRole('ROLE_AUDITOR')")
@RequestMapping("evento")
public class EventoBasuraAuditorController {
	
	@Autowired
	@Qualifier("dispositivoBasuraService")
	private IDispositivoBasuraService dispositivoBasuraService;
	@Autowired
	@Qualifier("eventoService")
	private EventoService eventoService;
	
	@GetMapping("/listaEventoDispositivoAuditor/{id}")
	public ModelAndView mostrarEventosDispositivoaUDITOR(@PathVariable("id")int id) {
		
		ModelAndView mV = new ModelAndView(ViewRouteHelpers.LISTA_EVENTOS);
		DispositivoBasuraModelo dispBasModel = dispositivoBasuraService.traerPorId(id);
		mV.addObject("listaEventos", dispBasModel.getEventos());
	    return mV;
	}	
	
	@GetMapping("/listaEventos/{id}")  
	public ModelAndView mostrarTablaEventos(@PathVariable("id")int id) {
		
	    ModelAndView mV = new ModelAndView(ViewRouteHelpers.LISTA_EVENTOS);
	    mV.addObject("eventos", eventoService.traerEventosIdDispositivo(id));  
	    return mV; 
	}
}
