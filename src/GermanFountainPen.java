public class GermanFountainPen extends FountainPen {
	private String OrginCity;
	//use a city the pen was manufactured in.

	public GermanFountainPen() {
		super();
		setOrginCity("Hamburg");
	}

	public GermanFountainPen(String newManufacturer, String newModel,
			String newBarrelType, String newNibType,
			String newFillingMechanism, double newPenLength, int newReleaseDate,
			boolean newLimitedEdition, String OrginCity) {
		super(newManufacturer, newModel,
				newBarrelType, newNibType,
				newFillingMechanism, newPenLength, newReleaseDate,
				newLimitedEdition);
		if(Manufacturer.equals("Waterman")) setManufacturer("Montblanc");
		setOrginCity(OrginCity);
	}

	public void setOrginCity(String OrginCity) {
		this.OrginCity = OrginCity;
	}

	public String getOrginCity() {
		return OrginCity;
	}

	public String toString() {
		String s = super.toString() + "\nCity of orgin: " + OrginCity;
		return s;

	}
}
