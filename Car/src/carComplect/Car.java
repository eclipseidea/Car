package carComplect;

public class Car {
	private String engin;
	private Wheel wheel;
	private Handlebar handlebar;
	private �ab �ab;
	public Car(String engin, Wheel wheel, Handlebar handlebar, �ab �ab) {
		super();
		this.engin = engin;
		this.wheel = wheel;
		this.handlebar = handlebar;
		this.�ab = �ab;
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
	public �ab get�ab() {
		return �ab;
	}
	public void set�ab(�ab �ab) {
		this.�ab = �ab;
	}
	@Override
	public String toString() {
		return "Car [engin=" + engin + ", wheel=" + wheel + ", handlebar="
				+ handlebar + ", �ab=" + �ab + "]";
	}

}
