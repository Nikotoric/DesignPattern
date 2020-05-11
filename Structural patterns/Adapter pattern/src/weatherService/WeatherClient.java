package weatherService;

public class WeatherClient {

	private static PrimaryInterface objMes;

	public static void main(String[] args) {

		objMes = new MetricWeatherServiceStation();
		objMes.readTempC();
		objMes.readWindSpeedms();
		objMes.showWeatherData();
		objMes = new Adapter(new NonMetricWthrServiceAdaptee());
		objMes.readTempC();
		objMes.readWindSpeedms();
		objMes.showWeatherData();

	}

}
