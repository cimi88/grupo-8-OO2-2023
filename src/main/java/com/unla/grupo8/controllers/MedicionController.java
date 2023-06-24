package com.unla.grupo8.controllers;

import com.unla.grupo8.models.EventoModelo;
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

import com.unla.grupo8.converters.DispositivoAspersorConverter;
import com.unla.grupo8.converters.EventoConverter;
import com.unla.grupo8.converters.MedicionAspersorConverter;
import com.unla.grupo8.helpers.ViewRouteHelpers;
import com.unla.grupo8.models.MedicionAspersorModelo;
import com.unla.grupo8.repositories.IDispositivoAspersorRepository;
import com.unla.grupo8.services.implementations.DispositivoAspersorService;
import com.unla.grupo8.services.implementations.EventoService;
import com.unla.grupo8.services.implementations.MedicionAspersorService;

import jakarta.validation.Valid;

@Controller
@PreAuthorize("hasRole('ROLE_ADMIN')")
@RequestMapping("medicion")
public class MedicionController {

	@Autowired
	@Qualifier("medicionAspersorService")
	private MedicionAspersorService medicionAspersorService;
	@Autowired
	@Qualifier("dispositivoAspersorService")
	private DispositivoAspersorService dispositivoAspersorService;
	@Autowired
	@Qualifier("eventoService")
	private EventoService eventoService;
	@Autowired
	@Qualifier("medicionAspersorConverter")
	private MedicionAspersorConverter medicionAspersorConverter;
	@Autowired
	@Qualifier("dispositivoAspersorRepository")
	private IDispositivoAspersorRepository dispositivoAspersorRepository;
	@Autowired
	@Qualifier("eventoConverter")
	private EventoConverter eventoConverter;
	@Autowired
	@Qualifier("dispositivoAspersorConverter")
	private DispositivoAspersorConverter dispositivoAspersorConverter;

	@GetMapping("/crearmedicion")
	public ModelAndView crearMedicion(Model model) {

		ModelAndView modelAndView = new ModelAndView(ViewRouteHelpers.FORMULARIO_MEDICION_ASPERSOR);
		model.addAttribute("dispositivos", dispositivoAspersorService.getAll());
		model.addAttribute("medicion", new MedicionAspersorModelo());

		return modelAndView;
	}

	@PostMapping("/nuevamedicion")
	public ModelAndView nuevamedicion(@Valid @ModelAttribute("medicion") MedicionAspersorModelo medicion,
			BindingResult b) {

		ModelAndView mV = new ModelAndView();
		if (b.hasErrors()) {
			mV.setViewName(ViewRouteHelpers.FORMULARIO_MEDICION_ASPERSOR);
		} else {
			medicionAspersorService.insertOrUpdate(medicion);
			EventoModelo evento = new EventoModelo(medicion.getIdDispositivo(), medicion.getFechaHoraRegistro());
			if (medicion.getHumedad() <= 70) {
				evento.setDescripcionEvento("Encender aspersores");
			} else {
				evento.setDescripcionEvento("Apagar aspersores");
			}
			eventoService.insertOrUpdate(evento);
			mV.setViewName(ViewRouteHelpers.NUEVA_MEDICION);
		}
		return mV;
	}
}