class RemoveElements {
    public int removeElement(int[] nums, int val) {
        int k=0;
        int j=nums.length-1;
        if(nums == null || nums.length==0){
            return 0;
        }

        for(int i=0;i<=j;i++){
            if(nums[i]==val){
                while(i<j && nums[j] == val){
                    j--;
                }

                if(i>=j){
                    break;
                }
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                j--;
            }
            k++;
        }

        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ,");
        }

        return k;
    }

    public static void main(String args[]){
        RemoveElements sol=new RemoveElements();
        int nums[]={3,2,2,3};
        sol.removeElement(nums, 3);

    }
}