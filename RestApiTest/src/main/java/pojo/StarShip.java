package pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class StarShip {
	@JsonProperty("max_atmosphering_speed")
	private String maxAtmospheringSpeed;
	@JsonProperty("cargo_capacity")
	private String cargoCapacity;
	private List<String> films;
	private String passengers;
	private List<Object> pilots;
	private String edited;
	private String consumables;
	private String mGLT;
	private String created;
	private String length;
	private String starshipClass;
	private String url;
	private String manufacturer;
	private String crew;
	private String hyperdriveRating;
	@JsonProperty("cost_in_credit")
	private String costInCredits;
	private String name;
	private String model;

	public String getMaxAtmospheringSpeed(){
		return maxAtmospheringSpeed;
	}

	public String getCargoCapacity(){
		return cargoCapacity;
	}

	public List<String> getFilms(){
		return films;
	}

	public String getPassengers(){
		return passengers;
	}

	public List<Object> getPilots(){
		return pilots;
	}

	public String getEdited(){
		return edited;
	}

	public String getConsumables(){
		return consumables;
	}

	public String getMGLT(){
		return mGLT;
	}

	public String getCreated(){
		return created;
	}

	public String getLength(){
		return length;
	}

	public String getStarshipClass(){
		return starshipClass;
	}

	public String getUrl(){
		return url;
	}

	public String getManufacturer(){
		return manufacturer;
	}

	public String getCrew(){
		return crew;
	}

	public String getHyperdriveRating(){
		return hyperdriveRating;
	}

	public String getCostInCredits(){
		return costInCredits;
	}

	public String getName(){
		return name;
	}

	public String getModel(){
		return model;
	}
}