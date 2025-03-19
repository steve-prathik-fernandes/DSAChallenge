class removeduplicate2 {
    public void removeDuplicates(int[] nums) {
        int k=2;

        for(int i=2;i<nums.length;i++){
          if(nums[k-2]!=nums[i]){
            nums[k]=nums[i];
            k++;
          }

        }

        for(int l=0;l<nums.length;l++){
            System.out.println(nums[l]);
        }
    }

    public static void main(String[] args) {
        removeduplicate2 re=new removeduplicate2();
        int nums[]={0,0,1,1,1,1,2,3,3};
        re.removeDuplicates(nums);
    }
}