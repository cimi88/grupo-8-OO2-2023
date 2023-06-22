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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.unla.grupo8.converters.DispositivoAlumbradoConverter;
import com.unla.grupo8.converters.MedicionAlumbradoConverter;
import com.unla.grupo8.entities.DispositivoAlumbrado;
import com.unla.grupo8.entities.MedicionAlumbrado;
import com.unla.grupo8.helpers.ViewRouteHelpers;
import com.unla.grupo8.models.DispositivoAlumbradoModelo;
import com.unla.grupo8.models.MedicionAlumbradoModelo;
import com.unla.grupo8.services.implementations.DispositivoAlumbradoService;
import com.unla.grupo8.services.implementations.EspacioService;
import com.unla.grupo8.services.implementations.MedicionAlumbradoService;

import jakarta.validation.Valid;

@Controller
@PreAuthorize("hasRole('ROLE_ADMIN')")
@RequestMapping("medicion")
public class MedicionController {
	
	@Autowired
	@Qualifier("medicionAlumbradoService")
	private MedicionAlumbradoService medicionAlumbradoService;
	@Autowired
	@Qualifier("dispositivoAlumbradoService")
	private DispositivoAlumbradoService dispositivoAlumbradoService;
	@Autowired
	@Qualifier("medicionAlumbradoConverter")
	private MedicionAlumbradoConverter medicionAlumbradoConverter;
	
	@Autowired
	@Qualifier("dispositivoAlumbradoConverter")
	private DispositivoAlumbradoConverter dispositivoAlumbradoConverter;
	
	@GetMapping("/crearmedicion/{id}")
	public ModelAndView crearMedicion(@PathVariable("id") int id, Model model) {
		
		ModelAndView modelAndView = new ModelAndView(ViewRouteHelpers.FORMULARIO_MEDICION_ALUMBRADO);
		model.addAttribute("idDispositivo", id);
		model.addAttribute("medicion", new MedicionAlumbradoModelo());
		
		return modelAndView;
	}

	@PostMapping("/nuevamedicion")
	public String agregarNuevaMedicion(@RequestParam("idDispositivo") int idDispositivo, @ModelAttribute("nuevamedicion") MedicionAlumbradoModelo nuevaMedicion) {
	    DispositivoAlumbradoModelo dispositivo = dispositivoAlumbradoService.traerPorId(idDispositivo);
	    // Asociar la nueva medición al dispositivo
	    dispositivo.getMediciones().add(medicionAlumbradoConverter.modelToEntity(nuevaMedicion));
	    dispositivoAlumbradoService.insertOrUpdate(dispositivo);
	    return "redirect:/evento/listaEventos/" + idDispositivo;
	}

}
