import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace1() {
    int[] input1 = {1, 2, 3};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{3, 2, 1}, input1);
	}

  @Test 
	public void testReverseInPlace2() {
    int[] input1 = {1, 2};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{2, 1}, input1);
	}

  @Test 
	public void testReverseInPlace3() {
    int[] input1 = {1, 2, 3, 4};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{4, 3, 2, 1}, input1);
	}

  @Test 
	public void testReverseInPlace4() {
    int[] input1 = {1, 2, 3, 4, 5};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{5, 4, 3, 2, 1}, input1);
	}

  @Test 
	public void testReverseInPlace5() {
    int[] input1 = {2, 3};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{3, 2}, input1);
	}

  @Test
  public void testReversed1() {
    int[] input1 = {1, 2, 3, 4};
    assertArrayEquals(new int[]{4, 3, 2, 1}, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReversed2() {
    int[] input1 = {1, 2, 3};
    assertArrayEquals(new int[]{3, 2, 1}, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReversed3() {
    int[] input1 = {1, 2};
    assertArrayEquals(new int[]{2, 1}, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReversed4() {
    int[] input1 = {3, 4};
    assertArrayEquals(new int[]{4, 3}, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReversed5() {
    int[] input1 = {1, 2, 3, 4, 5};
    assertArrayEquals(new int[]{5, 4, 3, 2, 1}, ArrayExamples.reversed(input1));
  }

  @Test
  public void testAverageWithoutLowest1(){
    double[] input1 = {5, 4, 3, 2, 1};
    assertEquals(3.5, ArrayExamples.averageWithoutLowest(input1), 0.1);
  }

  @Test
  public void testAverageWithoutLowest2(){
    double[] input1 = {4, 3, 2, 1};
    assertEquals(3.0, ArrayExamples.averageWithoutLowest(input1), 0.1);
  }

  @Test
  public void testAverageWithoutLowest3(){
    double[] input1 = {4, 3, 2, 2};
    assertEquals(3.0, ArrayExamples.averageWithoutLowest(input1), 0.1);
  }
}

