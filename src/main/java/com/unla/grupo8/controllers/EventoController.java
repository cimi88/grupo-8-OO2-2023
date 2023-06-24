package com.unla.grupo8.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.unla.grupo8.helpers.ViewRouteHelpers;
import com.unla.grupo8.models.DispositivoAspersorModelo;
import com.unla.grupo8.services.IDispositivoAspersorService;
import com.unla.grupo8.services.IEventoEstacionamientoService.IEventoService;

@Controller
@PreAuthorize("hasRole('ROLE_ADMIN')")
@RequestMapping("evento")
public class EventoController {
	
	@Autowired
	@Qualifier("dispositivoAspersorService")
	private IDispositivoAspersorService dispositivoAspersorService;
	
	@Autowired
	@Qualifier("eventoService")
	private IEventoService eventoService;
	
	@GetMapping("/lista")
	public ModelAndView mostrarEventos() {
		ModelAndView mV = new ModelAndView(ViewRouteHelpers.LISTA_EVENTOS);
		mV.addObject("listaEventos", eventoService.getAll());
	    return mV;
	}
	
	@GetMapping("/listaEventoDispositivo/{id}")
	public ModelAndView mostrarEventosDispositivo(@PathVariable("id")int id) {
		ModelAndView mV = new ModelAndView(ViewRouteHelpers.LISTA_EVENTOS);
		DispositivoAspersorModelo dispAluModel = dispositivoAspersorService.traerPorId(id);
		mV.addObject("listaEventos", dispAluModel.getEventos());
	    return mV;
	}	

}