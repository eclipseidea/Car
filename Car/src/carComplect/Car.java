package carComplect;

public class Car {
	private String engin;
	private Wheel wheel;
	private Handlebar handlebar;
	private Ñab ñab;
	public Car(String engin, Wheel wheel, Handlebar handlebar, Ñab ñab) {
		super();
		this.engin = engin;
		this.wheel = wheel;
		this.handlebar = handlebar;
		this.ñab = ñab;
	}
	public String getEngin() {
		return engin;
	}
	public void setEngin(String engin) {
		this.engin = engin;
	}
	public Wheel getWheel() {
		return wheel;
	}
	public void setWheel(Wheel wheel) {
		this.wheel = wheel;
	}
	public Handlebar getHandlebar() {
		return handlebar;
	}
	public void setHandlebar(Handlebar handlebar) {
		this.handlebar = handlebar;
	}
	public Ñab getÑab() {
		return ñab;
	}
	public void setÑab(Ñab ñab) {
		this.ñab = ñab;
	}
	@Override
	public String toString() {
		return "Car [engin=" + engin + ", wheel=" + wheel + ", handlebar="
				+ handlebar + ", ñab=" + ñab + "]";
	}

}
