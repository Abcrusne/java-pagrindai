package solid.isp.problem;

import java.util.List;

public class RunningContest implements Contest {

    private List<Athlete> athletes;

    public RunningContest(List<Athlete> athletes) {
        this.athletes = athletes;
    }

    @Override
    public void compete() {
        System.out.println("*** Starting running contest");

        for (Athlete athlete : athletes) {
            athlete.run();
        }
    }

}
