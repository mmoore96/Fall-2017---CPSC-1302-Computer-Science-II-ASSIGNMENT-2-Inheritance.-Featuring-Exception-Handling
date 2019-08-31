public class AmericanFountainPen extends FountainPen {

	private String OrginCity;
	//use a city the pen was manufactured in.

	public AmericanFountainPen() {
		super();
		setOrginCity("New York City");
	}

	public AmericanFountainPen(String newManufacturer, String newModel,
			String newBarrelType, String newNibType,
			String newFillingMechanism, double newPenLength, int newReleaseDate,
			boolean newLimitedEdition, String OrginCity) {
		super(newManufacturer, newModel,
				newBarrelType, newNibType,
				newFillingMechanism, newPenLength, newReleaseDate,
				newLimitedEdition);
		if(Manufacturer.equals("Montblanc")) setManufacturer("Waterman");
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
