package solid.isp.solution;

import java.util.List;

public class RunningContest implements Contest {

    private List<? extends Runner> athletes;

    public RunningContest(List<? extends Runner> athletes) {
        this.athletes = athletes;
    }

    @Override
    public void compete() {
        System.out.println("*** Starting running contest");

        for (Runner athlete : athletes) {
            athlete.run();
        }
    }

}
