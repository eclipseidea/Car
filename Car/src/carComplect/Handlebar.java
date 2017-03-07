package carComplect;

public class Handlebar {
	private double diametrHandlebar;
	private String colorHandlebar;

	public Handlebar(double diametrHandlebar, String colorHandlebar) {
		super();
		this.diametrHandlebar = diametrHandlebar;
		this.colorHandlebar = colorHandlebar;
	}

	public double getDiametrHandlebar() {
		return diametrHandlebar;
	}

	public void setDiametrHandlebar(double diametrHandlebar) {
		this.diametrHandlebar = diametrHandlebar;
	}

	public String getColorHandlebar() {
		return colorHandlebar;
	}

	public void setColorHandlebar(String colorHandlebar) {
		this.colorHandlebar = colorHandlebar;
	}

	@Override
	public String toString() {
		return "Handlebar [diametrHandlebar="  + diametrHandlebar
				+ ", colorHandlebar=" + colorHandlebar + "]";
	}
}