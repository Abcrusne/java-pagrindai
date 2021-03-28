package solid.isp.solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Application {

    public static void main(String[] args) {
        TriathlonAthlete triathlonAthlete = new TriathlonAthlete("Mark");

        Contest runningContest = new RunningContest(Arrays.asList(
                new RunningAthlete("Joe"),
                new RunningAthlete("Steve"),
                triathlonAthlete));
        runningContest.compete();

        Contest jumpingContest = new JumpingContest(Arrays.asList(
                new JumpingAthlete("Matt"),
                new JumpingAthlete("John"),
                triathlonAthlete));
        jumpingContest.compete();

        Contest swimmingContest = new SwimmingContest(Arrays.asList(
                new SwimmingAthlete("Joshua"),
                new SwimmingAthlete("Albert"),
                triathlonAthlete));
        swimmingContest.compete();
    }

}
