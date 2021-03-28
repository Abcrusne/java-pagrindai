package solid.isp.problem;

import java.util.List;

public class SwimmingContest implements Contest {

    private List<Athlete> athletes;

    public SwimmingContest(List<Athlete> athletes) {
        this.athletes = athletes;
    }

    @Override
    public void compete() {
        System.out.println("*** Starting swimming contest");

        for (Athlete athlete : athletes) {
            athlete.swim();
        }
    }

}
