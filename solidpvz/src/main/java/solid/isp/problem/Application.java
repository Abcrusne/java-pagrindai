package solid.isp.problem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Application {

    public static void main(String[] args) {
        Contest runningContest = new RunningContest(Arrays.asList(new Runner("Joe"), new Runner("Steve")));
        runningContest.compete();

        Contest jumpingContest = new JumpingContest(Arrays.asList(new Jumper("Matt"), new Jumper("John")));
        jumpingContest.compete();

        Contest swimmingContest = new SwimmingContest(Arrays.asList(new Swimmer("Joshua"), new Swimmer("Albert")));
        swimmingContest.compete();
    }

}
