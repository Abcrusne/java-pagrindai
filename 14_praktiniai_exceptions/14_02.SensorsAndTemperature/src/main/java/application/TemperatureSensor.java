package application;

import java.util.Random;

public class TemperatureSensor implements Sensor {

	private boolean isOn;
	private int temperature;

	public TemperatureSensor() {
		this.isOn = false;
	}

	@Override
	public boolean isOn() {
		if (this.isOn == true) {
			return true;
		}
		return false;
	}

	@Override
	public void setOn() {
		if (this.isOn == false) {
			this.isOn = true;
		}

	}

	@Override
	public void setOff() {
		if (this.isOn == true) {
			this.isOn = false;
		}

	}

	@Override
	public int read() {

		if (this.isOn == false) {

			throw new IllegalStateException("TemperatureSensor is Off");
		}
		int numberRand = new Random().nextInt(61);
		return numberRand - 30;
	}

}
