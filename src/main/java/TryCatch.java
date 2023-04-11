import java.util.Random;

public class TryCatch {
    public Integer[] creatRandom(){
        Random abc= new Random();
        Integer[] arr= new Integer[100];
        System.out.println(" The list of instance array ");
        for(int i=0; i< arr.length;i++) {
            arr[i] = abc.nextInt(100);
        }
        for (Integer ab: arr) {
            System.out.printf(ab + "  ");
        }
        return arr;
    }



}
