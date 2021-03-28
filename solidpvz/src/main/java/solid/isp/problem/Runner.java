package solid.isp.problem;

public class Runner implements Athlete {

    private final String name;

    public Runner(String name) {
        this.name = name;
    }

    @Override
    public void swim() {

    }

    @Override
    public void run() {
        System.out.println(name + " is running");
    }

    @Override
    public void jump() {

    }
}
