package sequality;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculateTest{
  @Test
  public void testSum(){
    Calculate calculate = new Calculate();
    int expected = 5;
    assertEquals(expected,calculate.sum(2,3));
  }

  @Test
  public void testave(){
    Calculate calculate = new Calculate();
    double expected = 2.5;
    assertEquals(expected,calculate.ave(2,3),0.01);
  }

  @Test
  public void testSumAtoB(){
    Calculate calculate = new Calculate();
    int expected = 55;
    assertEquals(expected,calculate.sumAtoB(1,10));
  }

  @Test
  public void testaveAtoB(){
    Calculate calculate = new Calculate();
    double expected = 5.5;
    assertEquals(expected,calculate.aveAtoB(1,10),0.01);
  }

  @Test
  public void testoddAtoB(){
    Calculate calculate = new Calculate();
    int expected = 25;
    assertEquals(expected,calculate.oddAtoB(1,10));
  }

  @Test
  public void testevenAtoB(){
    Calculate calculate = new Calculate();
    int expected = 30;
    assertEquals(expected,calculate.evenAtoB(1,10));
  }
}
