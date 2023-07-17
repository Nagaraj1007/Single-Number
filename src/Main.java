
public class Main {

    public static int singleNumber(int[] array){
        int result = 0;
        for (int element : array){
            result = result ^ element;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(singleNumber(new int[]{1,2,2,3,3}));
    }
}