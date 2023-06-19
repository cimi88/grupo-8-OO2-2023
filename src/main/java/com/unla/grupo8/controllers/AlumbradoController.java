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
import com.unla.grupo8.services.IDispositivoAlumbradoService;

@Controller
@PreAuthorize("hasRole('ROLE_ADMIN')")
@RequestMapping("alumbrado")
public class AlumbradoController {
	
	@Autowired
	@Qualifier("dispositivoAlumbradoService")
	private IDispositivoAlumbradoService dispositivoAlumbradoService;
	
	@GetMapping("/lista")
	public ModelAndView mostrarTablaDispositivos() {
		
	    ModelAndView mV = new ModelAndView(ViewRouteHelpers.LISTA_ALUMBRADO);
	    mV.addObject("listaAlumbrado", dispositivoAlumbradoService.getAll());
	    return mV;
	}

	@GetMapping("/eliminar/{id}")
	public ModelAndView eliminarDispositivo(@PathVariable("id")int id, Model model) {	
		
		dispositivoAlumbradoService.remove(id);
			
		return mostrarTablaDispositivos();	
	}
}
