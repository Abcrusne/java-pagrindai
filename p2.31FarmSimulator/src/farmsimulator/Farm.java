package farmsimulator;

import java.util.ArrayList;
import java.util.List;

public class Farm implements Alive {
	private String owner;
	private CowHouse barn;
	private List<Cow> herd;

	public Farm(String owner, CowHouse barn) {
		this.owner = owner;
		this.barn = barn;
		this.herd = new ArrayList<Cow>();

	}

	public String getOwner() {
		return owner;
	}

	@Override
	public void liveHour() {
		for (Cow cow : herd) {
			cow.liveHour();
		}

	}

	public void manageCows() {
		this.barn.takeCareOf(herd);
	}

	public void addCow(Cow cow) {
		this.herd.add(cow);
	}

	public void installMilkingRobot(MilkingRobot robot) {
		this.barn.installMilkingRobot(robot);
	}

	public String toString() {
		String title = "Farm owner: " + this.owner + "\n" + "Barn bulk tank: " + this.barn.toString() + "\n"
				+ "Animals:" + "\n";
		for (Cow c : herd) {
			title += "        " + c.toString() + "\n";
		}
		return title;
	}

}
