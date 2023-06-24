package com.unla.grupo8.controllers;

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
import org.springframework.web.servlet.ModelAndView;

import com.unla.grupo8.entities.DispositivoAspersor;
import com.unla.grupo8.helpers.ViewRouteHelpers;
import com.unla.grupo8.models.DispositivoAspersorModelo;
import com.unla.grupo8.repositories.IEspacioRepository;
import com.unla.grupo8.services.IDispositivoAspersorService;
import com.unla.grupo8.services.IEspacioService;

import jakarta.validation.Valid;

@Controller
@PreAuthorize("hasRole('ROLE_ADMIN')")
@RequestMapping("riego")
public class AspersorControllerAdmin {
	
	@Autowired @Qualifier("dispositivoAspersorService")
	private IDispositivoAspersorService dispositivoAspersorService;
	
	@Autowired @Qualifier("espacioRepository")
	private IEspacioRepository espacioRepository;
	
	@Autowired @Qualifier("espacioService")
	IEspacioService espacioService;
	
	
	@GetMapping("/cargaraspersor")
	public ModelAndView cargarAspersor(Model model) {
		ModelAndView modelAndView = new ModelAndView(ViewRouteHelpers.FORM_DISPOSITIVO_ASPERSOR);
		model.addAttribute("espacios", espacioRepository.findAll());
		model.addAttribute("dispositivo", new DispositivoAspersorModelo());
		return modelAndView;
	}
	
	@PostMapping("/nuevodispositivo")
	public ModelAndView agregarDispositivo(@Validated @ModelAttribute("dispositivo") DispositivoAspersorModelo aspersorModelo, BindingResult bindingResult) {
		ModelAndView modelAndView = new ModelAndView();
		if (bindingResult.hasErrors()) {
			modelAndView.setViewName(ViewRouteHelpers.FORM_DISPOSITIVO_ASPERSOR);
			modelAndView.addObject("espacios", espacioRepository.findAll());
			return modelAndView;
		}
		dispositivoAspersorService.insertOrUpdate(aspersorModelo);
		return mostrarTablaDispositivos();
	}
	
	//modificar para setear traigo el dispositivo y editamos
	@PostMapping("/nuevodispositivoeditado")
	public ModelAndView dispositivoEditado(@Valid @ModelAttribute("dispositivo") DispositivoAspersorModelo dispoAluModel, 
			BindingResult b) {
		DispositivoAspersor dispositivo = new DispositivoAspersor();
		ModelAndView mV = new ModelAndView();
		if(b.hasErrors()) {
			mV.setViewName(ViewRouteHelpers.EDITAR_DISPOSITIVO_ASPERSOR);
		}else {
			DispositivoAspersor dispositivoViejo = dispositivoAspersorService.traerEntidad(dispoAluModel.getId());
			dispositivo.setNombre(dispositivoViejo.getNombre());
			dispositivo.setEspacio(dispositivoViejo.getEspacio());
		}
		dispositivoAspersorService.insertOrUpdate(dispoAluModel);
		return mostrarTablaDispositivos();
	}
	
	@GetMapping("/lista")
	public ModelAndView mostrarTablaDispositivos(){
		ModelAndView mV = new ModelAndView(ViewRouteHelpers.LISTA_ASPERSOR);
		mV.addObject("listaAspersor", dispositivoAspersorService.getAll());
		return mV;
	}
	
	@GetMapping("/eliminar/{id}")
	public ModelAndView eliminarDispositivo(@PathVariable("id")int id) {
		dispositivoAspersorService.remove(id);
		return mostrarTablaDispositivos();
	}
	
	@GetMapping("/editarDispositivo/{id}")
	public ModelAndView editarDispositivo(@PathVariable("id")int id, Model model) {	
		DispositivoAspersorModelo dispoAspModel = dispositivoAspersorService.traerPorId(id);
		model.addAttribute("dispositivo", dispoAspModel);
		model.addAttribute("espacios", espacioService.getAll());	
		return new ModelAndView(ViewRouteHelpers.EDITAR_DISPOSITIVO_ASPERSOR);
	}
	
	@GetMapping("/bajaAspersor/{id}")
	public ModelAndView bajaDispositivoAspesor (@PathVariable("id")int id) {
		dispositivoAspersorService.baja(id);
		return mostrarTablaDispositivos();
	}
} 
