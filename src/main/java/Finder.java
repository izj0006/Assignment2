import java.util.Arrays;

public class Finder {
    //Finder with two functions: findMax(int[] intArray) and findMin(int[] intArray)
    public Finder(){
        System.out.println("Initializing Finder.");
    }

    public Integer findMax(int[] intArray){
        if(intArray != null && intArray.length>0) {
            Arrays.sort(intArray);
            System.out.println("Result:" + intArray[intArray.length - 1]);
            return intArray[intArray.length - 1];
        }
        else
            return null;
    }

    public Integer findMin(int[] intArray){
        if(intArray != null && intArray.length>0) {
            Arrays.sort(intArray);
            System.out.println("Result:" + intArray[0]);
            return intArray[0];
        }
        else
            return null;
    }
}
