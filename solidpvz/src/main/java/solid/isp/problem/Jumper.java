package solid.isp.problem;

public class Jumper implements Athlete {

    private final String name;

    public Jumper(String name) {
        this.name = name;
    }

    @Override
    public void swim() {

    }

    @Override
    public void run() {

    }

    @Override
    public void jump() {
        System.out.println(name + " is jumping");
    }
}
