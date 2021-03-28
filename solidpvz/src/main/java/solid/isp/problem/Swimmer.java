package solid.isp.problem;

public class Swimmer implements Athlete {

    private final String name;

    public Swimmer(String name) {
        this.name = name;
    }

    @Override
    public void swim() {
        System.out.println(name + " is swimming");
    }

    @Override
    public void run() {

    }

    @Override
    public void jump() {

    }
}
