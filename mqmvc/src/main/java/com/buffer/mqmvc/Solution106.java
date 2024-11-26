package com.buffer.mqmvc;

public class Solution106 {
    public static int[] twoSum3(int[] nums, int target) {
        
        int arr[]= new int[] {0,0};
        for(int i=0;i<nums.length;i++){
          for(int j=i+1;j<nums.length;j++) {
              if(i!=j){
                  
                   if((nums[i]+nums[j])==target) {
               	   arr[0]=i;
               	   arr[1]=j;
               	   return arr;
               }
              }
          }
        }
        return arr;
    }
    
    public static int[] twoSum2(int[] nums, int target) {
        int max=0;
        int arr[]= new int[] {0,0};
        for(int i=0;i<nums.length;i++){
          for(int j=i+1;j<nums.length;j++) {
        	  if((max+1)>=nums.length) {
           	   max=nums.length-1;
              }else {
           	   max++;
              }
              if(i!=max){
                  //System.out.println("i="+i+",max="+max);
                   if((nums[i]+nums[j])==target) {
               	   arr[0]=i;
               	   arr[1]=j;
               	   return arr;
               }
              }
          }
        }
        return arr;
    }
    
    public static int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
            	System.out.println("nums[j]="+nums[j]+",max="+(target- nums[i])+",i="+i+",j="+j);
                if (nums[j] == target- nums[i]) {
                    ans[0] = i;
                    ans[1] = j;
                    return ans;
                }
            }
        }
        return ans;
    }
    
    public static void main(String arrs[]) {
    	int arr[]= new int[] {3,2,3};
    	int arr2[]= twoSum3(arr,6);
    	System.out.println(arr2[0]);
    	System.out.println(arr2[1]);
    }
}
