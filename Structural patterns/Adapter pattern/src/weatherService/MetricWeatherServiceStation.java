package weatherService;

import java.util.concurrent.ThreadLocalRandom;

public class MetricWeatherServiceStation implements PrimaryInterface {

	private double temperature, windSpeed;
	
	
	
	@Override
	public void readTempC() {
		this.temperature = ThreadLocalRandom.current().nextDouble(-20, 48);
	}

	@Override
	public void readWindSpeedms() {
		this.temperature = ThreadLocalRandom.current().nextDouble(0, 35);
	}

	@Override
	public void showWeatherData() {
		System.out.println("***** Weather data *****");
		System.out.println(toString());
	}

	@Override
	public String toString() {
		return "MetricWeatherServiceStation [temperature=" + temperature + " °C, windSpeed=" + windSpeed + " m/s]";
	}
	
	

}
