package part1;

import org.testng.annotations.Test;

public class c_For {
    @Test
    public void cyclesInt() {
        for (int i = 1; i++ < 100; i++) {
            System.out.println(i);
        }
    }
}
