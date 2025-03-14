package Ch19;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;

import com.fasterxml.jackson.databind.ObjectMapper;

public class C13Ex {

	public static void main(String[] args) throws Exception {

		// OPENWEATHER MAP API 를 이용해서 날씨 정보 받아옵니다
		// (https://openweathermap.org/api/one-call-3)

		String url = "https://api.openweathermap.org/data/2.5/weather";
		String lat = "35.8";
		String lon = "128.55";
		String appid = "5fbf2c8fb5e6b90163b7f01e1bb93f95";

		url = url + "?lat=" + lat + "&lon=" + lon + "&appid=" + appid;

		HttpRequest httpRequest = HttpRequest.newBuilder().uri(URI.create(url)).GET().build();

		HttpClient httpClient = HttpClient.newHttpClient();
		HttpResponse<String> response = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());
//		System.out.println(response.body());

		ObjectMapper objectMapper = new ObjectMapper();

		Root root = objectMapper.readValue(response.body(), Root.class);
		System.out.println(root.toString());

	}

	private static class Clouds {
		public int all;

		Clouds() {
		}

		public Clouds(int all) {
			super();
			this.all = all;
		}

		public int getAll() {
			return all;
		}

		public void setAll(int all) {
			this.all = all;
		}

		@Override
		public String toString() {
			return "Clouds [all=" + all + "]";
		}

	}

	private static class Coord {
		public double lon;
		public double lat;

		Coord() {
		}

		public Coord(double lon, double lat) {
			super();
			this.lon = lon;
			this.lat = lat;
		}

		public double getLon() {
			return lon;
		}

		public void setLon(double lon) {
			this.lon = lon;
		}

		public double getLat() {
			return lat;
		}

		public void setLat(double lat) {
			this.lat = lat;
		}

		@Override
		public String toString() {
			return "Coord [lon=" + lon + ", lat=" + lat + "]";
		}

	}

	private static class Main {
		public double temp;
		public double feels_like;
		public double temp_min;
		public double temp_max;
		public int pressure;
		public int humidity;
		public int sea_level;
		public int grnd_level;

		Main() {
		}

		public Main(double temp, double feels_like, double temp_min, double temp_max, int pressure, int humidity,
				int sea_level, int grnd_level) {
			super();
			this.temp = temp;
			this.feels_like = feels_like;
			this.temp_min = temp_min;
			this.temp_max = temp_max;
			this.pressure = pressure;
			this.humidity = humidity;
			this.sea_level = sea_level;
			this.grnd_level = grnd_level;
		}

		public double getTemp() {
			return temp;
		}

		public void setTemp(double temp) {
			this.temp = temp;
		}

		public double getFeels_like() {
			return feels_like;
		}

		public void setFeels_like(double feels_like) {
			this.feels_like = feels_like;
		}

		public double getTemp_min() {
			return temp_min;
		}

		public void setTemp_min(double temp_min) {
			this.temp_min = temp_min;
		}

		public double getTemp_max() {
			return temp_max;
		}

		public void setTemp_max(double temp_max) {
			this.temp_max = temp_max;
		}

		public int getPressure() {
			return pressure;
		}

		public void setPressure(int pressure) {
			this.pressure = pressure;
		}

		public int getHumidity() {
			return humidity;
		}

		public void setHumidity(int humidity) {
			this.humidity = humidity;
		}

		public int getSea_level() {
			return sea_level;
		}

		public void setSea_level(int sea_level) {
			this.sea_level = sea_level;
		}

		public int getGrnd_level() {
			return grnd_level;
		}

		public void setGrnd_level(int grnd_level) {
			this.grnd_level = grnd_level;
		}

		@Override
		public String toString() {
			return "Main [temp=" + temp + ", feels_like=" + feels_like + ", temp_min=" + temp_min + ", temp_max="
					+ temp_max + ", pressure=" + pressure + ", humidity=" + humidity + ", sea_level=" + sea_level
					+ ", grnd_level=" + grnd_level + "]";
		}

	}

	private static class Sys {
		public String country;
		public int sunrise;
		public int sunset;

		Sys() {
		}

		public Sys(String country, int sunrise, int sunset) {
			super();
			this.country = country;
			this.sunrise = sunrise;
			this.sunset = sunset;
		}

		public String getCountry() {
			return country;
		}

		public void setCountry(String country) {
			this.country = country;
		}

		public int getSunrise() {
			return sunrise;
		}

		public void setSunrise(int sunrise) {
			this.sunrise = sunrise;
		}

		public int getSunset() {
			return sunset;
		}

		public void setSunset(int sunset) {
			this.sunset = sunset;
		}

		@Override
		public String toString() {
			return "Sys [country=" + country + ", sunrise=" + sunrise + ", sunset=" + sunset + "]";
		}

	}

	private static class Weather {
		public int id;
		public String main;
		public String description;
		public String icon;

		Weather() {
		}

		public Weather(int id, String main, String description, String icon) {
			super();
			this.id = id;
			this.main = main;
			this.description = description;
			this.icon = icon;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getMain() {
			return main;
		}

		public void setMain(String main) {
			this.main = main;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getIcon() {
			return icon;
		}

		public void setIcon(String icon) {
			this.icon = icon;
		}

		@Override
		public String toString() {
			return "Weather [id=" + id + ", main=" + main + ", description=" + description + ", icon=" + icon + "]";
		}

	}

	private static class Wind {
		public double speed;
		public int deg;
		public double gust;

		Wind() {
		}

		public Wind(double speed, int deg, double gust) {
			super();
			this.speed = speed;
			this.deg = deg;
			this.gust = gust;
		}

		public double getSpeed() {
			return speed;
		}

		public void setSpeed(double speed) {
			this.speed = speed;
		}

		public int getDeg() {
			return deg;
		}

		public void setDeg(int deg) {
			this.deg = deg;
		}

		public double getGust() {
			return gust;
		}

		public void setGust(double gust) {
			this.gust = gust;
		}

		@Override
		public String toString() {
			return "Wind [speed=" + speed + ", deg=" + deg + ", gust=" + gust + "]";
		}

	}

	private static class Root {
		public Coord coord;
		public ArrayList<Weather> weather;
		public String base;
		public Main main;
		public int visibility;
		public Wind wind;
		public Clouds clouds;
		public int dt;
		public Sys sys;
		public int timezone;
		public int id;
		public String name;
		public int cod;

		Root() {
		}

		public Root(Coord coord, ArrayList<Weather> weather, String base, Main main, int visibility, Wind wind,
				Clouds clouds, int dt, Sys sys, int timezone, int id, String name, int cod) {
			super();
			this.coord = coord;
			this.weather = weather;
			this.base = base;
			this.main = main;
			this.visibility = visibility;
			this.wind = wind;
			this.clouds = clouds;
			this.dt = dt;
			this.sys = sys;
			this.timezone = timezone;
			this.id = id;
			this.name = name;
			this.cod = cod;
		}

		public Coord getCoord() {
			return coord;
		}

		public void setCoord(Coord coord) {
			this.coord = coord;
		}

		public ArrayList<Weather> getWeather() {
			return weather;
		}

		public void setWeather(ArrayList<Weather> weather) {
			this.weather = weather;
		}

		public String getBase() {
			return base;
		}

		public void setBase(String base) {
			this.base = base;
		}

		public Main getMain() {
			return main;
		}

		public void setMain(Main main) {
			this.main = main;
		}

		public int getVisibility() {
			return visibility;
		}

		public void setVisibility(int visibility) {
			this.visibility = visibility;
		}

		public Wind getWind() {
			return wind;
		}

		public void setWind(Wind wind) {
			this.wind = wind;
		}

		public Clouds getClouds() {
			return clouds;
		}

		public void setClouds(Clouds clouds) {
			this.clouds = clouds;
		}

		public int getDt() {
			return dt;
		}

		public void setDt(int dt) {
			this.dt = dt;
		}

		public Sys getSys() {
			return sys;
		}

		public void setSys(Sys sys) {
			this.sys = sys;
		}

		public int getTimezone() {
			return timezone;
		}

		public void setTimezone(int timezone) {
			this.timezone = timezone;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getCod() {
			return cod;
		}

		public void setCod(int cod) {
			this.cod = cod;
		}

		@Override
		public String toString() {
			return "Root [coord=" + coord + ", weather=" + weather + ", base=" + base + ", main=" + main
					+ ", visibility=" + visibility + ", wind=" + wind + ", clouds=" + clouds + ", dt=" + dt + ", sys="
					+ sys + ", timezone=" + timezone + ", id=" + id + ", name=" + name + ", cod=" + cod + "]";
		}

	}

}
