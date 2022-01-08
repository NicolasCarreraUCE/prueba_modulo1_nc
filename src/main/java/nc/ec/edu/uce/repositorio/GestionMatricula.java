package nc.ec.edu.uce.repositorio;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import nc.ec.edu.uce.modelo.Propietario;
import nc.ec.edu.uce.service.AVehiculo;

@Repository
public class GestionMatricula {
	
	@Autowired
	private AVehiculo vehiculo;
	
	private static final Logger LOG = LoggerFactory.getLogger(GestionMatricula.class);
	
	
	public void matricualrVehiculo(AVehiculo vehiculo, Propietario propietario) {
		this.LOG.info("El vehiculo " + vehiculo.toString() + " se ha matriculado con exito");
		this.LOG.info("con el propietario " + propietario.toString());
	}
	
	public void imprimirVehiculo() {
		this.LOG.info(this.vehiculo.toString());
	}

	// SET-GET
	public AVehiculo getVehiculo() {
		return vehiculo;
	}

	public void setVehiculo(AVehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}
	
	
	
}
