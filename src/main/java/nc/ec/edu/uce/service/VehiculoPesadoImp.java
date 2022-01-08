package nc.ec.edu.uce.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VehiculoPesadoImp extends AVehiculo {

	@Autowired
	private String pesoToneladas;
	
	@Override
	public BigDecimal calcualrValorMatricula() {
		// TODO Auto-generated method stub
		double valMatricula = super.valorMatricula.doubleValue();
		double valPrecio = super.precio.doubleValue();
		valMatricula = valPrecio * 0.25;
		super.valorMatricula = new BigDecimal(valMatricula);
		return super.valorMatricula;
	}

	@Override
	public String toString() {
		return super.toString() + " VehiculoPesado [pesoToneladas=" + pesoToneladas + "]";
	}



	// SET-GET
	public String getPesoToneladas() {
		return pesoToneladas;
	}

	public void setPesoToneladas(String pesoToneladas) {
		this.pesoToneladas = pesoToneladas;
	}

	
}
