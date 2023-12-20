public class SearchInsert {


    public int searchInsert(int[] nums, int target) {

        int len = nums.length;

        int mid = len/2;
        int pos=0;
        
        System.out.printf("mid : %d\n",mid);

        if(target == nums[mid])
            return mid;

        else if(target > nums[mid]){

            for(int i=mid;i<len;i++){

                if(target == nums[i])
                    return i;

                else if(target > nums[i] && target<nums[i+1]){
                    pos = i+1;
                    

                }
                    



            }

            return pos;
        }


        else{

            for(int i=0;i<=mid;i++){

                if(target == nums[i])
                    return i;

                else if(target > nums[i])
                    pos = i+1;

                else{
                    return i;
                }

            }

            return pos;

            
        }
    }


    public static void main(String[] args){

        SearchInsert obj = new SearchInsert();

        int nums[] = {1,3,5};

        System.out.println(obj.searchInsert(nums,4 ));
    }
    
}
