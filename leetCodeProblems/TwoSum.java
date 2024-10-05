package leetCodeProblems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    private static int[] twoSum(int[] nums, int target) {
        /*
          curValue+x=target
          x=target-x
          need to add x value into map
          if the x value found in the map return it
         */
        Map<Integer,Integer> hm=new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int currentValue=nums[i];
            int x=target-currentValue;
            if(hm.containsKey(x)){
                return new int[] {hm.get(x),i};
            }
            hm.put(currentValue,i);
        }
        return null;
    }

    public static void main(String[] args) {

        int[] nums={2,7,11,15};
        int target=9;
        int[] result=twoSum(nums,target);
        System.out.println("The Two sum result is ::"+ Arrays.toString(result));

    }


}
