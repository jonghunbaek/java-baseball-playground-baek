package fuelinjection_test;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

import fuelinjection.Avante;
import fuelinjection.K5;
import fuelinjection.RentCompany;
import fuelinjection.Sonata;

public class FuelInjectionTest {

	private static final String NEWLINE = System.getProperty("line.separator");
	
	@Test
	public void report() {
		RentCompany rentCompany = RentCompany.create();
		rentCompany.addCar(new Sonata(150));
		rentCompany.addCar(new K5(260));
		rentCompany.addCar(new Sonata(120));
		rentCompany.addCar(new Avante(300));
		rentCompany.addCar(new K5(390));
		
		String report = rentCompany.generateReport();
		assertThat(report).isEqualTo(
				"Sonata : 15리터" + NEWLINE +
				"K5 : 20리터" + NEWLINE +
				"Sonata : 12리터" + NEWLINE +
				"Avante : 20리터" + NEWLINE +
				"K5 : 30리터" + NEWLINE
				);
		
	}
}
