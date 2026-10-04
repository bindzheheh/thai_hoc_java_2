package E_1_7;
/**make by :nguyen van thai
2611130213
* This class is used to store weather information
*/
public class WeatherRecord {
	/**
	 * cau truc
	 */
	Date date;//trong class date
	TemperatureRange today;//
	TemperatureRange normal;// ca ba cai nay deu trong class temperaturerange
	TemperatureRange record;//
	double precipitation;
	WeatherRecord(Date date,TemperatureRange today,TemperatureRange normal,TemperatureRange record,double precipitation){
		this.date=date;
		this.today=today;
		this.normal=normal;
		this.record=record;
		this.precipitation=precipitation;
	}

}
