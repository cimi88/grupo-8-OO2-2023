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
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.example.ejemplos_video.models.PersonaModelo;
import com.unla.grupo8.helpers.ViewRouteHelpers;
import com.unla.grupo8.models.DispositivoAlumbradoModelo;
import com.unla.grupo8.repositories.IEspacioRepository;
import com.unla.grupo8.services.IDispositivoAlumbradoService;
import com.unla.grupo8.services.IEspacioService;
import com.unla.grupo8.services.implementations.EspacioService;

import jakarta.validation.Valid;

@Controller
@PreAuthorize("hasRole('ROLE_ADMIN')")
@RequestMapping("alumbrado")
public class AlumbradoController {
	
	@Autowired
	@Qualifier("dispositivoAlumbradoService")
	private IDispositivoAlumbradoService dispositivoAlumbradoService;
	
	@Autowired
	@Qualifier("espacioService")
	private EspacioService espacioService;
	
	@GetMapping("/creardispositivo")
	public ModelAndView crearDispositivoAlumbrado(Model model) {
		
		ModelAndView modelAndView = new ModelAndView(ViewRouteHelpers.FORMULARIO_DISPOSITIVO_ALUMBRADO);
		model.addAttribute("espacios", espacioService.getAll());
		model.addAttribute("dispositivo", new DispositivoAlumbradoModelo());
		
		return modelAndView;
	}
	
	@PostMapping("/nuevodispositivo")
	public ModelAndView nuevoDispositivo(@Valid @ModelAttribute("dispositivo") DispositivoAlumbradoModelo dispoAluModel, 
			BindingResult b) {
		
		ModelAndView mV = new ModelAndView();
		if(b.hasErrors()) {
			mV.setViewName(ViewRouteHelpers.EDITAR_DISPOSITIVO_ALUMBRADO);
		}else {
			
			dispositivoAlumbradoService.insertOrUpdate(dispoAluModel);
			
			mV = mostrarTablaDispositivos();
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
	public ModelAndView eliminarDispositivo(@PathVariable("id")int id) {	
		
		dispositivoAlumbradoService.remove(id);
			
		return mostrarTablaDispositivos();	
	}
	
	@GetMapping("/editarDispositivo/{id}")
	public ModelAndView  editarDispositivo(@PathVariable("id")int id, Model model) {	
		
		DispositivoAlumbradoModelo dispoAluModel = dispositivoAlumbradoService.traerPorId(id);

		model.addAttribute("dispositivo", dispoAluModel);
		model.addAttribute("espacios", espacioService.getAll());	
		ModelAndView modelAndView = new ModelAndView(ViewRouteHelpers.EDITAR_DISPOSITIVO_ALUMBRADO);
		
		
		return modelAndView;	
	}
	
	
	@GetMapping("/bajaAlumbrado/{id}")
	public ModelAndView bajaDispositivoLucesAutomaticas (@PathVariable("id")int id) {
		dispositivoAlumbradoService.baja(id);
		return mostrarTablaDispositivos();
	}
}