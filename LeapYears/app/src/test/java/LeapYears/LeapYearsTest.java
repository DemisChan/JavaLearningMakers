/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package LeapYears;

import org.junit.Test;
import static org.junit.Assert.*;

public class LeapYearsTest {
    @Test 
    public void isDivisiblebyFourHundred() {
      int num = 2000;
      LeapYears year = new LeapYears();
      assertTrue("Shout be a leap year", year.checkLeap(num));

    }
    @Test 
    public void isDivisiblebyHundredandNotFourhundred() {
      for (int i = 0; i < 2030; i=i+100) {
        LeapYears year = new LeapYears();
        if (i % 100 == 0 && i % 400 != 0) {
          assertFalse("Shout not be a leap year", year.checkLeap(i));
        }
      }
    }

    @Test 
    public void isDivisiblebyFourandNotHundred() {
      int num = 2008;
      LeapYears year = new LeapYears();
      assertTrue("Shout be a leap year", year.checkLeap(num));

    }
}
