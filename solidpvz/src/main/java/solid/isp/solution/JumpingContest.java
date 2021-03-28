package solid.isp.solution;

import java.util.List;

public class JumpingContest implements Contest {

    private List<? extends Jumper> athletes;

    public JumpingContest(List<? extends Jumper> athletes) {
        this.athletes = athletes;
    }

    @Override
    public void compete() {
        System.out.println("*** Starting jumping contest");

        for (Jumper athlete : athletes) {
            athlete.jump();
        }
    }

}
