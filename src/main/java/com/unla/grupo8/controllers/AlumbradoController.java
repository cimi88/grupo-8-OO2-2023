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
import org.springframework.web.servlet.ModelAndView;
import com.unla.grupo8.helpers.ViewRouteHelpers;
import com.unla.grupo8.models.DispositivoAlumbradoModelo;
import com.unla.grupo8.services.IDispositivoAlumbradoService;

import jakarta.validation.Valid;

@Controller
@PreAuthorize("hasRole('ROLE_ADMIN')")
@RequestMapping("alumbrado")
public class AlumbradoController {
	
	@Autowired
	@Qualifier("dispositivoAlumbradoService")
	private IDispositivoAlumbradoService dispositivoAlumbradoService;
	
	@PostMapping("/nuevoDispositivoAlumbrado")
	public ModelAndView nuevoDispositivoAlumbrado(@Valid @ModelAttribute("dispositivo") DispositivoAlumbradoModelo dAlumbrado, 
			BindingResult b) {
		
		ModelAndView mV = new ModelAndView();
		if(b.hasErrors()) {
			mV.setViewName(ViewRouteHelpers.FORMULARIO_DISPOSITIVO_ALUMBRADO);
		}else {
				
			//Modificamos el insertar de la persona para que se inserte el avatar tambien...
			dispositivoAlumbradoService.insertOrUpdate(dAlumbrado);
			
			mV.setViewName(ViewRouteHelpers.LISTA_ALUMBRADO);
			mV.addObject("dispositivo", dAlumbrado);
			
			//Podriamos tambien agregarle las personas que tenemos en la Base de Datos
			mV.addObject("listaDispositivos" , dispositivoAlumbradoService.getAll());
			}
		return mV;
		}
	
	
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
