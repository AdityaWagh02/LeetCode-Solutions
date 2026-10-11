class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1=nums1.length;
        int n2=nums2.length;
       

        List<Integer> nums=new ArrayList<>();
    
        for(int i:nums1){
        nums.add(i);
        }
        for(int i:nums2){
        nums.add(i);
        }

        int n=(nums.size()/2);

        Collections.sort(nums);

        if(nums.size()%2==0){
            double ans=(nums.get(n-1)+nums.get(n))/(double)2;
            return ans;
        }
        else{
        return nums.get(n);
    }
}}