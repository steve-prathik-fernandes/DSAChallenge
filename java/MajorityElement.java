//Boyer–Moore majority vote algorithm

public class MajorityElement {
    public int majorElements(int nums[]){
        int candidate = 0,count=0;

        for(int i=0;i<nums.length;i++){
            if(count==0)
                candidate=nums[i];
            if(candidate==nums[i]){
                count++;
            }
            else{
                count--;
            }
        }

            return candidate;
        
    }
    public static void main(String[] args) {
        MajorityElement me=new MajorityElement();
        int nums[]={2,2,1,1,1,2,2};
        System.out.println("Majority Element= "+me.majorElements(nums));
    }
}
