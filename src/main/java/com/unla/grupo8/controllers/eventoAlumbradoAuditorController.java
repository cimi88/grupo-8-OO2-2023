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
import com.unla.grupo8.models.DispositivoAlumbradoModelo;
import com.unla.grupo8.services.IDispositivoAlumbradoService;

@Controller
@PreAuthorize("hasRole('ROLE_AUDITOR')")
@RequestMapping("evento")
public class eventoAlumbradoAuditorController {
	
	@Autowired 
	@Qualifier("dispositivoAlumbradoService")
	private IDispositivoAlumbradoService dispositivoAlumbradoService;
	
	@GetMapping("/listaEventoDispositivoAuditor/{id}")
	public ModelAndView mostrarEventosDispositivoaUDITOR(@PathVariable("id")int id) {
		
		ModelAndView mV = new ModelAndView(ViewRouteHelpers.LISTA_EVENTOS_ALUMBRADO);
		DispositivoAlumbradoModelo disAluModel = dispositivoAlumbradoService.traerPorId(id);
		mV.addObject("listaEventos", disAluModel.getEventos());
	    return mV;
	}

}
