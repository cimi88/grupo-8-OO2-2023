package com.unla.grupo8.controllers;

import com.unla.grupo8.models.EventoModelo;

import java.util.List;

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
import com.unla.grupo8.converters.EventoAlumbradoConverter;
import com.unla.grupo8.converters.MedicionAlumbradoConverter;
import com.unla.grupo8.entities.DispositivoAlumbrado;
import com.unla.grupo8.entities.MedicionAlumbrado;
import com.unla.grupo8.helpers.ViewRouteHelpers;
import com.unla.grupo8.models.DispositivoAlumbradoModelo;
import com.unla.grupo8.models.MedicionAlumbradoModelo;
import com.unla.grupo8.repositories.IDispositivoAlumbradoRepository;
import com.unla.grupo8.services.implementations.DispositivoAlumbradoService;
import com.unla.grupo8.services.implementations.EspacioService;
import com.unla.grupo8.services.implementations.EventoService;
import com.unla.grupo8.services.implementations.MedicionAlumbradoService;

import jakarta.validation.Valid;

@Controller
@PreAuthorize("hasRole('ROLE_ADMIN')")
@RequestMapping("medicion")
public class MedicionAlumbradoController {
	
	@Autowired
	@Qualifier("medicionAlumbradoService")
	private MedicionAlumbradoService medicionAlumbradoService;
	@Autowired
	@Qualifier("dispositivoAlumbradoService")
	private DispositivoAlumbradoService dispositivoAlumbradoService;
	@Autowired
	@Qualifier("eventoService")
	private EventoService eventoService;
	@Autowired
	@Qualifier("medicionAlumbradoConverter")
	private MedicionAlumbradoConverter medicionAlumbradoConverter;
	@Autowired
	@Qualifier("dispositivoAlumbradoRepository")
	private IDispositivoAlumbradoRepository dispositivoAlumbradoRepository;
	@Autowired
	@Qualifier("eventoConverter")
	private EventoAlumbradoConverter eventoConverter;
	@Autowired
	@Qualifier("dispositivoAlumbradoConverter")
	private DispositivoAlumbradoConverter dispositivoAlumbradoConverter;
	
	@GetMapping("/crearmedicion")
	public ModelAndView crearMedicion(Model model) {
		
		ModelAndView modelAndView = new ModelAndView(ViewRouteHelpers.FORMULARIO_MEDICION_ALUMBRADO);
		model.addAttribute("dispositivos", dispositivoAlumbradoService.getAll());
		model.addAttribute("medicion", new MedicionAlumbradoModelo());
		
		return modelAndView;
	}

	@PostMapping("/nuevamedicion")
	public ModelAndView nuevamedicion(@Valid @ModelAttribute("medicion") MedicionAlumbradoModelo medicion, 
			BindingResult b) {
		
		ModelAndView mV = new ModelAndView();
		if(b.hasErrors()) {
			mV.setViewName(ViewRouteHelpers.FORMULARIO_MEDICION_ALUMBRADO);
		}else {
			medicionAlumbradoService.insertOrUpdate(medicion);
			EventoModelo evento = new EventoModelo(medicion.getIdDispositivo(),medicion.getFechaHoraRegistro());
			List<DispositivoAlumbrado> dispositivos = dispositivoAlumbradoService.getAll();
			if(medicion.getLuminiscencia() <= 40) {
				evento.setDescripcionEvento("APAGAR LUCES");
				for(DispositivoAlumbrado da : dispositivos) {
					da.setEncendido(false);
					dispositivoAlumbradoService.insertOrUpdate(dispositivoAlumbradoConverter.entityToModel(da));
				}
			}else {
				evento.setDescripcionEvento("ENCENDER LUCES");
				for(DispositivoAlumbrado da : dispositivos) {
					da.setEncendido(true);
					dispositivoAlumbradoService.insertOrUpdate(dispositivoAlumbradoConverter.entityToModel(da));
					}
			}
			eventoService.insertOrUpdate(evento);
			mV.setViewName(ViewRouteHelpers.NUEVA_MEDICION_ALUMBRADO);
		}
		return mV;
	}

}
