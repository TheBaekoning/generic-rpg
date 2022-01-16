package model.system;

import org.junit.Test;

public class InstanceTest {
    @Test
    public void lookingForTroubleSuccess() {
        // assemble
        Instance instance = new Instance();

        // act

        /*
         * Start instance
         * Either Trouble or Exit
         * If neither, back to prompt
         * While loop until 2
         */

        instance.start();
        instance.command(1);



        // assert
    }
}
