package solid.isp.solution;

public class TriathlonAthlete implements Runner, Jumper, Swimmer {

    private final String name;

    public TriathlonAthlete(String name) {
        this.name = name;
    }

    @Override
    public void jump() {
        System.out.println(name + " is jumping");
    }

    @Override
    public void run() {
        System.out.println(name + " is running");
    }

    @Override
    public void swim() {
        System.out.println(name + " is swimming");
    }
}
