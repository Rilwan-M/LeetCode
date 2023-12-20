
import java.util.*;


public class TwoSum {


    // public int[] twoSum(int[] nums, int target) {

    //     Map<Integer,Integer> numMap = new HashMap<>();

    //     for(int i=0;i<nums.length;i++){

    //         numMap.put(nums[i],i);

    //     }


    //     // for(Map.Entry<Integer,Integer> entry : numMap.entrySet()){

    //     //     System.out.println("key : " +entry.getKey()+ "\t\t\tvalue : "+entry.getValue());
    //     // }


    //     // for(int i=0;i<nums.length;i++){

    //     //     int complement = target - nums[i];
    //     //     if (numMap.containsKey(complement) && numMap.get(complement)!= i) {
    //     //         return new int[]{i, numMap.get(complement)};
    //     //     }


    //     // }

    //      // Find the complement
    //     for (int i = 0; i < nums.length; i++) {
    //         int complement = target - nums[i];
    //         if (numMap.containsKey(complement) && numMap.get(complement) != i) {
    //             return new int[]{i, numMap.get(complement)};
    //         }
    //     }


    //     return new int[] {};



    // }

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        int n = nums.length;

        for (int i = 0; i < n; i++) {


            numMap.put(nums[i], i); 
            // cant ad here because it can search the same element again
            // after checking the complement only we need to add to the HashMap

            // for(Map.Entry<Integer,Integer> entry : numMap.entrySet()){

            //     System.out.println("Key\t\t:\t"+entry.getKey()+"\tvalue :"+entry.getValue());
            // }
            

            
            int complement = target - nums[i];
            if (numMap.containsKey(complement) && numMap.get(complement) != i) {
                return new int[]{numMap.get(complement), i};
            }

            // numMap.put(nums[i], i); 
            
            
        }

        System.out.println(numMap.get(3));

        return new int[]{}; // No solution found
    }
    





    public static void main(String[] args){

        TwoSum obj = new TwoSum();

        int[] result = new int[2];
        result = obj.twoSum(new int[]{3,3},6);
        
        for(int i=0;i<result.length;i++){

            System.out.println(result[i]);
        }




    }
}
