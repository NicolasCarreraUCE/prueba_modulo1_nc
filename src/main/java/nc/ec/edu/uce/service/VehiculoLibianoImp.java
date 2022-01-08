package nc.ec.edu.uce.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VehiculoLibianoImp extends AVehiculo {

	@Autowired
	private String clindrajeTurbo;;
	
	@Override
	public BigDecimal calcualrValorMatricula() {
		// TODO Auto-generated method stub
		double valMatricula = super.valorMatricula.doubleValue();
		double valPrecio = super.precio.doubleValue();
		valMatricula = valPrecio * 0.10;
		super.valorMatricula = new BigDecimal(valMatricula);
		return super.valorMatricula;
	}
	
	
	
	@Override
	public String toString() {
		return super.toString() + " VehiculoLibiano [clindrajeTurbo=" + clindrajeTurbo + "]";
	}



	// SET-GET
	public String getClindrajeTurbo() {
		return clindrajeTurbo;
	}

	public void setClindrajeTurbo(String clindrajeTurbo) {
		this.clindrajeTurbo = clindrajeTurbo;
	}

	
	
}
