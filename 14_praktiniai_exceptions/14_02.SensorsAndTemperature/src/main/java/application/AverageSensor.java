package application;

import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor {

	private List<Sensor> sensorList = new ArrayList<>();

	private List<Integer> readings = new ArrayList<>();

	public AverageSensor() {

	}

	public void addSensor(Sensor toAdd) {
		sensorList.add(toAdd);
	}

	@Override
	public boolean isOn() {
		for (Sensor sensor : sensorList) {
			if (sensor.isOn() == true) {
				return true;
			}
		}
		return false;
	}

	@Override
	public void setOn() {
		for (Sensor sensor : sensorList) {
			sensor.setOn();
		}
	}

	@Override
	public void setOff() {
		for (Sensor sensor : sensorList) {
			sensor.setOff();
		}
	}

	@Override
	public int read() {
		if (isOn() == false || sensorList.isEmpty()) {
			throw new IllegalStateException("Sensor is off");
		}
		int sum = 0;

		for (Sensor sensor : sensorList) {
			sum = sum + sensor.read();

		}
		this.readings.add(sum / sensorList.size());
		return (sum / sensorList.size());
	}

	public List<Integer> readings() {
		return readings;
	}

}
