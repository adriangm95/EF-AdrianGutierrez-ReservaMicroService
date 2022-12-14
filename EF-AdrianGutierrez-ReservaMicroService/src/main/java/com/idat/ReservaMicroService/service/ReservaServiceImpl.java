package com.idat.ReservaMicroService.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
import com.idat.ReservaMicroService.model.Reserva;
import com.idat.ReservaMicroService.repository.ReservaRepository;
 
@Service
public class ReservaServiceImpl implements ReservaService{
	@Autowired
	private ReservaRepository repository;
	
	@Override
	public void guardar(Reserva reserva) {
		
		Reserva res = new Reserva();
		res.setIdReserva(reserva.getIdReserva());
		res.setCosto(reserva.getCosto());
		
		repository.save(res);
	}
}
