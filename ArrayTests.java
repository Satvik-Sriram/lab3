import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    int[] input2 = { 4, 5, 6, 99, 10 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
    ArrayExamples.reverseInPlace(input2);
    assertArrayEquals(new int[]{ 10,99,6,5,4 }, input2);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    int[] input2 = {3, 5};
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
    assertArrayEquals(new int[] {5,3}, ArrayExamples.reversed(input2));
  }

  @Test
  public void testAverageWithoutLowest() {
      double[] zeroInput = {};
      double[] oneInput = {5};
      double[] intInput = {10,9,5,2,1};
      double[] doubleInput = {5.9, 3.1, 0.1, 11.0, 7.4};
      double[] sameMinInput= {10,9,5,2,2};
      assertEquals(0.0, ArrayExamples.averageWithoutLowest(zeroInput), 0.0);
      assertEquals(0.0, ArrayExamples.averageWithoutLowest(oneInput), 0.0);
      assertEquals(6.5, ArrayExamples.averageWithoutLowest(intInput), 0.0);
      assertEquals(6.85, ArrayExamples.averageWithoutLowest(doubleInput), 0.0);
      assertEquals(6.5, ArrayExamples.averageWithoutLowest(sameMinInput), 0.0);

  }
}
