package solid.isp.solution;

public class SwimmingAthlete implements Swimmer {

    private final String name;

    public SwimmingAthlete(String name) {
        this.name = name;
    }

    @Override
    public void swim() {
        System.out.println(name + " is swimming");
    }
}
