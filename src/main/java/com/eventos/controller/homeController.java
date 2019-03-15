package com.eventos.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.eventos.models.Evento;
import com.eventos.repositoty.EventoRepository;


@Controller

public class homeController {
	@Autowired
	private EventoRepository er;
	
	@RequestMapping(value="/cadastrarEvento", method=RequestMethod.GET)
	public String form() {
		
		return "evento/formEvento";
	}
	
	@RequestMapping(value="/cadastrarEvento", method=RequestMethod.POST)
	public String form(Evento evento) {
		er.save(evento);
		return "redirect:/listaEventos";
		
	}
	
	@RequestMapping(value="/listaEventos")
	public ModelAndView listaEventos() {
		ModelAndView mv = new ModelAndView("evento/listaEventos");
		Iterable<Evento> eventos = er.findAll();
		mv.addObject("eventos", eventos);
		return mv;
	}
}
