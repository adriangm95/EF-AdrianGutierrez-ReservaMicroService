package com.idat.ReservaMicroService.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.idat.ReservaMicroService.model.Reserva;
import com.idat.ReservaMicroService.service.ReservaService;

@Controller
@RequestMapping("/api/reserva/v1")
public class ReservaController {
	@Autowired
	private ReservaService service;
	
	@PostMapping("/guardar")
	public @ResponseBody void guardar(@RequestBody Reserva Rrserva) {
		service.guardar(Rrserva);
	}
}
