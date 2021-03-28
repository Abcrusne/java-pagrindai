package solid.isp.problem;

import java.util.List;

public class JumpingContest implements Contest {

    private List<Athlete> athletes;

    public JumpingContest(List<Athlete> athletes) {
        this.athletes = athletes;
    }

    @Override
    public void compete() {
        System.out.println("*** Starting jumping contest");

        for (Athlete athlete : athletes) {
            athlete.jump();
        }
    }

}
