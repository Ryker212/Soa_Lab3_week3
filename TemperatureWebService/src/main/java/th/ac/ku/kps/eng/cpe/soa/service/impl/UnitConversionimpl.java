package th.ac.ku.kps.eng.cpe.soa.service.impl;


import jakarta.jws.WebService;
import th.ac.ku.kps.eng.cpe.soa.service.UnitConversion;

@WebService
public class UnitConversionimpl implements UnitConversion {
	@Override
	public double c2f(double degrees) {
		return degrees * 9.0 / 5.0 + 32;
	}

	@Override
	public double cm2in(double cm) {
		return cm / 2.54;
	}

	@Override
	public double f2c(double degrees) {
		return (degrees - 32) * 5.0 / 9.0;
	}

	@Override
	public double in2cm(double in) {
		return in * 2.54;
	}
}
