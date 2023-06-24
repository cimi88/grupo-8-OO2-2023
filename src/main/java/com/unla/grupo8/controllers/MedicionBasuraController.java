package com.unla.grupo8.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.unla.grupo8.models.EventoModelo;
import com.unla.grupo8.converters.DispositivoBasuraConverter;
import com.unla.grupo8.converters.EventoBasuraConverter;
import com.unla.grupo8.converters.MedicionBasuraConverter;
import com.unla.grupo8.helpers.ViewRouteHelpers;

import com.unla.grupo8.models.MedicionBasuraModelo;
import com.unla.grupo8.repositories.IDispositivoBasuraRepository;
import com.unla.grupo8.services.implementations.DispositivoBasuraService;
import com.unla.grupo8.services.implementations.EventoService;
import com.unla.grupo8.services.implementations.MedicionBasuraService;

import jakarta.validation.Valid;
@Controller
@PreAuthorize("hasRole('ROLE_ADMIN')")
@RequestMapping("medicionBasura")
public class MedicionBasuraController {
	@Autowired
	@Qualifier("medicionBasuraService")
	private MedicionBasuraService medicionBasuraService;
	@Autowired
	@Qualifier("dispositivoBasuraService")
	private DispositivoBasuraService dispositivoBasuraService;
	@Autowired
	@Qualifier("eventoService")
	private EventoService eventoService;
	@Autowired
	@Qualifier("medicionBasuraConverter")
	private MedicionBasuraConverter medicionBasuraConverter;
	@Autowired
	@Qualifier("dispositivoBasuraRepository")
	private IDispositivoBasuraRepository dispositivoBasuraRepository;
	@Autowired
	@Qualifier("eventoConverter")
	private EventoBasuraConverter eventoConverter;
	@Autowired
	@Qualifier("dispositivoBasuraConverter")
	private DispositivoBasuraConverter dispositivoBasuraConverter;
	
	@GetMapping("/crearmedicion")
	public ModelAndView crearMedicion(Model model) {
		
		ModelAndView modelAndView = new ModelAndView(ViewRouteHelpers.FORMULARIO_MEDICION_BASURA);
		model.addAttribute("dispositivos", dispositivoBasuraService.getAll());
		model.addAttribute("medicion", new MedicionBasuraModelo());
		
		return modelAndView;
	}

	@PostMapping("/nuevamedicion")
	public ModelAndView nuevamedicion(@Valid @ModelAttribute("medicion") MedicionBasuraModelo medicion, 
			BindingResult b) {
	
		ModelAndView mV = new ModelAndView();
		if(b.hasErrors()) {
			mV.setViewName(ViewRouteHelpers.FORMULARIO_MEDICION_BASURA);
		}else {
			medicionBasuraService.insertOrUpdate(medicion);
			EventoModelo evento = new EventoModelo(medicion.getId(), medicion.getFechaHoraRegistro());
			
			if(medicion.getLitrosOcupados() <= 85) {
				evento.setDescripcionEvento("CAPACIDAD AUN INCOMPLETA");
			}else {
				evento.setDescripcionEvento("RECOGER BASURA");
			}
			eventoService.insertOrUpdate(evento);
			mV.setViewName(ViewRouteHelpers.NUEVA_MEDICION_BASURA);
		}
		return mV;
	}
}