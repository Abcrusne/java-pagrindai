package solid.isp.solution;

public class JumpingAthlete implements Jumper {

    private final String name;

    public JumpingAthlete(String name) {
        this.name = name;
    }

    @Override
    public void jump() {
        System.out.println(name + " is jumping");
    }
}
