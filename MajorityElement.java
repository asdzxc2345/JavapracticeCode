import java.util.*;

class MajorityElement{
    public int majority(int[] nums){
        HashMap<Integer , Integer> hash = new HashMap<>();
        int res=0;
        int majorityy=0;

        for(int n : nums){
            hash.put(n, hash.getOrDefault(n,0)+1);
            if(hash.get(n)> majorityy){
                res =n ;
                majorityy = hash.get(n);
            }
        }
        return res;
    }

    public static void main(String [] args){
        MajorityElement obj = new MajorityElement();
        int [] nums = { 3,3,4};
        System.out.println(obj.majority(nums));
    }
}