import java.util.Arrays;

public class Main {

    static boolean isFind(int [] arr, int value){
        for(int i : arr){
            if (i == value){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {

        int [] list = {12,2,5,2,5,6,8,13,13,8,10,2};
        int [] duplicate = new int[list.length];
        int startIndex = 0;
        for (int i = 0; i < list.length; i++){

            for (int j = 0; j < list.length; j++){
                if ((i != j) && (list[i] == list[j])) {
                    if (list[i] % 2 == 0) {
                        if (!isFind(duplicate, list[i])) {
                            duplicate[startIndex++] = list[i];
                        }
                    }
                }
            }
        }
        for (int val : duplicate) {
            if ( (val != 0) ){
                System.out.println(val);
            }
        }
    }
}