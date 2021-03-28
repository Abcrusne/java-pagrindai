package application;

public class StandardSensor implements Sensor {

	private int temperature;

	public StandardSensor(int temperature) {
		this.temperature = temperature;
	}

	@Override
	public boolean isOn() {

		return true;
	}

	@Override
	public void setOn() {
	}

	@Override
	public void setOff() {

	}

	@Override
	public int read() {
//		if (this.temperature == 0) {
//			throw new IllegalStateException("Sensor is off");
//		}
		return this.temperature;
	}

}
