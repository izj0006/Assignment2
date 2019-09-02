import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class JUnitFinder {

    Finder objFinder = new Finder();
    @Test
    public void testFindMaxValid(){
        int[] intArray = new int[]{10,9,8,7,6};
        int expectedResult = 10;
        int actualResult = objFinder.findMax(intArray);
        assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testFindMaxNull(){
        int[] intArray = null;
        Integer actualResult = objFinder.findMax(intArray);
        assertEquals(actualResult, null);
    }

    @Test
    public void testFindMaxEmpty(){
        int[] intArray = new int[0];
        Integer actualResult = objFinder.findMax(intArray);
        assertEquals(actualResult, null);
    }

    @Test
    public void testFindMinValid(){
        int[] intArray = new int[]{1,2,3,4,5};
        int expectedResult = 1;
        int actualResult = objFinder.findMin(intArray);
        assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testFindMinNull(){
        int[] intArray = null;
        Integer actualResult = objFinder.findMin(intArray);
        assertEquals(actualResult, null);
    }

    @Test
    public void testFindMinEmpty(){
        int[] intArray = new int[0];
        Integer actualResult = objFinder.findMin(intArray);
        assertEquals(actualResult, null);
    }
}
