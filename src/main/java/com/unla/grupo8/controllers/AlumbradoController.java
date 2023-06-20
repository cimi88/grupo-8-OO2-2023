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
import org.springframework.web.servlet.view.RedirectView;

import com.unla.grupo8.helpers.ViewRouteHelpers;
import com.unla.grupo8.models.DispositivoAlumbradoModelo;
import com.unla.grupo8.repositories.IEspacioRepository;
import com.unla.grupo8.services.IDispositivoAlumbradoService;
import com.unla.grupo8.services.IEspacioService;

import jakarta.validation.Valid;

@Controller
@PreAuthorize("hasRole('ROLE_ADMIN')")
@RequestMapping("alumbrado")
public class AlumbradoController {
	
	@Autowired
	@Qualifier("dispositivoAlumbradoService")
	private IDispositivoAlumbradoService dispositivoAlumbradoService;
	
	@Autowired
	@Qualifier("espacioRepository")
	private IEspacioRepository espacioRepository;
	
	@GetMapping("/nuevodispositivo")
	public ModelAndView crearDispositivoAlumbrado(Model model) {
		
		model.addAttribute("espacios", espacioRepository.findAll());
		model.addAttribute("dispositivo", new DispositivoAlumbradoModelo());
		//User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		ModelAndView modelAndView = new ModelAndView(ViewRouteHelpers.FORMULARIO_DISPOSITIVO_ALUMBRADO);
		//modelAndView.addAllObjects("usuario", user);
		return modelAndView;
	}
	
	@PostMapping("/nuevodispositivo")
	public RedirectView nuevodispositivo(@Valid @ModelAttribute("dispositivo") DispositivoAlumbradoModelo disAluModel, 
			BindingResult b) {
		
		if(b.hasErrors()) {
			System.out.println(b.hasErrors());
			return new RedirectView (ViewRouteHelpers.FORMULARIO_DISPOSITIVO_ALUMBRADO);
		}else {
				
			//Modificamos el insertar de la persona para que se inserte el avatar tambien...
			dispositivoAlumbradoService.insertOrUpdate(disAluModel);
			return new RedirectView("/alumbrado/lista");
			}
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
