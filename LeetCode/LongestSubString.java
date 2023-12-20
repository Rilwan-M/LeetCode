import java.util.*;

class LongestSubString{

    public int lengthOfLongestSubstring(String s) {

        int start=0,end=0;
        int max_length = 0;

        List<Character> list = new ArrayList<Character>();

        while(end < s.length()){

            if(!list.contains(s.charAt(end))){

                list.add(s.charAt(end));
                max_length = Math.max(max_length, list.size());
                end++;
            }

            else{

                list.remove(Character.valueOf(s.charAt(start)));
                start++;
            }

            System.out.println("Start = " + start + "\tEnd : " + end + "\tMax_length : " + max_length);
            System.out.println("List at end = " + end + ": " + list);
            System.out.println();


        }           

        return max_length;
            
        }


    public static void main(String[] args) {
        
        LongestSubString obj = new LongestSubString();

        System.out.println(obj.lengthOfLongestSubstring("abcabcbb"));

    }


}