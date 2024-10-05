package leetCodeProblems;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MissingNumber {

    public static void main(String[] args) {
        int[] x = {3, 5,5, 7, 9,9,9, 13,15,15,16,18,21,27,27,27,27,27,27};

        int[] uniqueArray=Arrays.stream(x).distinct().toArray();

        int n=27;

        Set<Integer> allNumber=new HashSet<>();
        for(int i=3;i<=n; i++){
            allNumber.add(i);
        }
        for(int num: uniqueArray){
            allNumber.remove(num);
        }

        System.out.println("Missing Number"+ allNumber);
    }

}
