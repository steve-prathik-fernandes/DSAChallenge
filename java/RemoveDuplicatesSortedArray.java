 class RemoveDuplicatesSortedArray {
    
        public int removeDuplicates(int[] nums) {
            int i=0;
    
            for(int j=1;j<nums.length;j++){
                if(nums[i]!=nums[j]){
                    i=i+1;
                    nums[i]=nums[j];
                    
                }   
            }

            for(int k=0;k<=i;k++){
                System.out.println(nums[k]);
            }

            return i+1;        
    }

    public static void main(String args[]){
        RemoveDuplicatesSortedArray re=new RemoveDuplicatesSortedArray();

        int nums[]={0,0,1,1,1,2,2,3,3,4};
        re.removeDuplicates(nums);
    }
    }

