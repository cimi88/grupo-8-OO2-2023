package com.unla.grupo8.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.unla.grupo8.helpers.ViewRouteHelpers;
import com.unla.grupo8.models.DispositivoAlumbradoModelo;
import com.unla.grupo8.services.IDispositivoAlumbradoService;
import com.unla.grupo8.services.IEventoService;

@Controller
@PreAuthorize("hasRole('ROLE_ADMIN')")
@RequestMapping("evento")
public class EventoController {
	
	@Autowired
	@Qualifier("dispositivoAlumbradoService")
	private IDispositivoAlumbradoService dispositivoAlumbradoService;
	
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
		DispositivoAlumbradoModelo dispAluModel = dispositivoAlumbradoService.traerPorId(id);
		mV.addObject("listaEventos", dispAluModel.getEventos());
	    return mV;
	}	

}
