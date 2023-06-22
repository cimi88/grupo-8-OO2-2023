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

import com.unla.grupo8.entities.DispositivoAlumbrado;
import com.unla.grupo8.helpers.ViewRouteHelpers;
import com.unla.grupo8.models.DispositivoAlumbradoModelo;
import com.unla.grupo8.services.IDispositivoAlumbradoService;
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
			mV.setViewName(ViewRouteHelpers.FORMULARIO_DISPOSITIVO_ALUMBRADO);
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
	
	// Formulario para editar un dispositivo de LucesAutomaticas
	@GetMapping("/editardispositivo/{id}")
	public String editarDispositivo(@PathVariable("id")int id, Model model) {
		
		DispositivoAlumbradoModelo dispositivoAlumbradoModel = dispositivoAlumbradoService.traerPorId(id);
		model.addAttribute("dispositivo", dispositivoAlumbradoModel);		
		model.addAttribute("espacios", espacioService.getAll());
		return ViewRouteHelpers.EDITAR_DISPOSITIVO_ALUMBRADO;
	}
	
	//modificar para setear traigo el dispositivo y editamos
	@PostMapping("/dispositivoNuevoEditado")
	public ModelAndView dispositivoEditado(@Valid @ModelAttribute("dispositivo") DispositivoAlumbradoModelo dispoAluModel, 
			BindingResult b) {
		DispositivoAlumbrado dispositivo = new DispositivoAlumbrado();
		ModelAndView mV = new ModelAndView();
		if(b.hasErrors()) {
			mV.setViewName(ViewRouteHelpers.EDITAR_DISPOSITIVO_ALUMBRADO);
		}else {
			DispositivoAlumbrado dispositivoViejo = dispositivoAlumbradoService.traerEntidad(dispoAluModel.getId());
			dispositivo.setNombre(dispositivoViejo.getNombre());
			dispositivo.setNumeracion(dispositivoViejo.getNumeracion());
			dispositivo.setSenda(dispositivoViejo.getSenda());
			dispositivo.setPotencia(dispositivoViejo.getPotencia());
			dispositivo.setEspacio(dispositivoViejo.getEspacio());
		}
		dispositivoAlumbradoService.insertOrUpdate(dispoAluModel);
		return mostrarTablaDispositivos();
	}

	@GetMapping("/bajaAlumbrado/{id}")
	public ModelAndView bajaDispositivo (@PathVariable("id")int id) {
		dispositivoAlumbradoService.baja(id);
		return mostrarTablaDispositivos();
	}
}