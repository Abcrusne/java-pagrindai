package solid.isp.solution;

public class RunningAthlete implements Runner {

    private final String name;

    public RunningAthlete(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(name + " is running");
    }
}
