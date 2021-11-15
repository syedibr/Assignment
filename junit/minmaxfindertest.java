import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MinMaxFinderTest {
	MinMaxFinder minmax;
	@BeforeEach
	void init() {
		minmax=new MinMaxFinder();
	}
	@Test
	@DisplayName("This is FindMinMax")
	void test() {
		int a[]= {56,34,7,3,54,3,34,34,53};
		int []expected= {3,56};
		int []actual=minmax.findMinMax(a);
		for(int i=0;i<2;i++) {
			assertEquals(expected[i], actual[i]);
			System.out.println("Expected" +expected[i]);
			System.out.println("Actual=" +actual[i]);
		}
		System.out.println("Test Cases Passed");
	}

}
