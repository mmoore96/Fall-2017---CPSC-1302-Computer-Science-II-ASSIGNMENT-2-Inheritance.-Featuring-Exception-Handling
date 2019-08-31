/**
 * A program that organizes fountain pens.
 * 
 * George Moore 10/10/2017
 */
public class FountainPen {
	protected String Manufacturer;
	private String Model;
	private String BarrelType;
	private String NibType;
	private String FillingMechanism;
	private double PenLength;
	private int ReleaseDate;
	private boolean LimitedEdition;
	protected String OrginCity;

	public FountainPen(){
        this.setManufacturer("Montblanc");
        this.setModel("Meisterstuck 149");
        this.setBarrelType("Precious resin");
        this.setNibType("Gold");
        this.setFillingMechanism("Piston");
        this.setPenLength(14.7);
        this.setReleaseDate(1952);
        this.setLimitedEdition(false);

    }

	public FountainPen(String newManufacturer, String newModel,
			String newBarrelType, String newNibType,
			String newFillingMechanism, double newPenLength, int newReleaseDate,
			boolean newLimitedEdition) {
		this.setManufacturer(newManufacturer);
		this.setModel(newModel);
		this.setBarrelType(newBarrelType);
		this.setNibType(newNibType);
		this.setFillingMechanism(newFillingMechanism);
		this.setPenLength(newPenLength);
		this.setReleaseDate(newReleaseDate);
		this.setLimitedEdition(newLimitedEdition);

	}

	// get methods
	public String getManufacturer() {
		return Manufacturer;
	}

	public String getModel() {
		return Model;
	}

	public String getBarrelType() {
		return BarrelType;
	}

	public String getNibType() {
		return NibType;
	}

	public String getFillingMechanism() {
		return FillingMechanism;
	}

	public double getPenLength() {
		return PenLength;
	}

	public int getReleaseDate() {
		return ReleaseDate;
	}

	public boolean getLimitedEdition() {
		return LimitedEdition;
	}

	public void setManufacturer(String newManufacturer) {
		this.Manufacturer = newManufacturer;

	}

	public void setModel(String newModel) {
		this.Model = newModel;

	}

	public void setBarrelType(String newBarrelType) {
		this.BarrelType = newBarrelType;
	}

	public void setNibType(String newNibType) {
		this.NibType = newNibType;
	}

	public void setFillingMechanism(String newFillingMechanism) {
		this.FillingMechanism = newFillingMechanism;
	}

	public void setPenLength(double newPenLength) {
		if (newPenLength < 0) {
			System.out.println("Please give a number greater than 0.\n");
			return;
		} else {
			this.PenLength = newPenLength;
		}
	}

	public void setReleaseDate(int newReleaseDate) {
		if (newReleaseDate < 0) {
			System.out.println("Please give a number greater than 0.\n");
			return;
		} else {
			this.ReleaseDate = newReleaseDate;
		}

	}

	public void setLimitedEdition(boolean newLimitedEdition) {
		this.LimitedEdition = newLimitedEdition;
	}

	public String toString() {

		String s = "Manufacturer: " + Manufacturer + "\nModel: " + Model
				+ "\nBarrel Type: " + BarrelType + "\nNib Type: " + NibType
				+ "\nFilling Mechanism: " + FillingMechanism + "\nPen Length: "
				+ PenLength + "\nRelease Date: " + ReleaseDate
				+ "\nLimitedEdition? " + LimitedEdition;
		return s;
	}

}
