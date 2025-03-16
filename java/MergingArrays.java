import java.util.Arrays;

class MergingArrays {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int ct=0;
        for(int i=m;i<(m+n);i++){

            nums1[i]=nums2[ct++];

        }
        Arrays.sort(nums1);

        //Display the elements
        for(int i=0;i<(m+n);i++){
            System.out.println(nums1[i]);
        }
    }

    public static void main(String args[]){
        MergingArrays ma=new MergingArrays();
        int nums1[]={1,2,3,0,0,0};
        int nums2[]={2,5,6};
        ma.merge(nums1, 3, nums2, 3);
    }
}