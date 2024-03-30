package com.leonardo.davila.cuentamovimientosservice.business.impl;

import com.leonardo.davila.cuentamovimientosservice.business.MovementService;
import com.leonardo.davila.cuentamovimientosservice.dao.entity.Movement;
import com.leonardo.davila.cuentamovimientosservice.dao.repository.MovementDao;
import org.springframework.stereotype.Service;

@Service
public class MovementServiceImpl implements MovementService {

	private final MovementDao movimientoDao;

	public MovementServiceImpl(MovementDao movimientoDao) {
		this.movimientoDao = movimientoDao;
	}

	@Override
	public Movement save(Movement cuenta) {
		return movimientoDao.save(cuenta);
	}

	@Override
	public Movement update(Long movimientoId, Movement movimiento) {

		Movement movimientoActualizado = movimientoDao.findById(movimientoId).orElse(null);
		if (movimientoActualizado != null) {
			movimientoActualizado.setFecha(movimiento.getFecha());
			movimientoActualizado.setTipoMovimiento(movimiento.getTipoMovimiento());
			movimientoActualizado.setValor(movimiento.getValor());
			movimientoActualizado.setSaldo(movimiento.getSaldo());
			return movimientoActualizado;
		} else {
			return null;
		}
	}

	@Override
	public void deleteById(Long movimientoId) {
		Movement movimiento = movimientoDao.findById(movimientoId).orElse(null);
		if (movimiento != null) {
			movimientoDao.deleteById(movimientoId);
		}else {
			throw new RuntimeException("Movimiento no encontrado");
		}
	}

	@Override
	public Movement getById(Long movimientoId) {
		return movimientoDao.findById(movimientoId).orElse(null);
	}
}
