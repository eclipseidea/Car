package carComplect;

public class Wheel {
	private double diametrWheel;
	private String colorWheel;

	public Wheel(double diametrWheel, String colorWheel) {
		super();
		this.diametrWheel = diametrWheel;
		this.colorWheel = colorWheel;
	}

	public double getDiametrWheel() {
		return diametrWheel;
	}

	public void setDiametrWheel(double diametrWheel) {
		this.diametrWheel = diametrWheel;
	}

	public String getColorWheel() {
		return colorWheel;
	}

	public void setColorWheel(String colorWheel) {
		this.colorWheel = colorWheel;
	}

	@Override
	public String toString() {
		return "Wheel [diametrWheel=" + diametrWheel + ", colorWheel="
				+ colorWheel + "]";
	}

}
