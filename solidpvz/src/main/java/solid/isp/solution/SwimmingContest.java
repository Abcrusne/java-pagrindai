package solid.isp.solution;

import java.util.List;

public class SwimmingContest implements Contest {

    private List<? extends Swimmer> athletes;

    public SwimmingContest(List<? extends Swimmer> athletes) {
        this.athletes = athletes;
    }

    @Override
    public void compete() {
        System.out.println("*** Starting swimming contest");

        for (Swimmer athlete : athletes) {
            athlete.swim();
        }
    }

}
