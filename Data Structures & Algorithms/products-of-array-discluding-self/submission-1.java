class Solution {
    public int[] productExceptSelf(int[] nums) 
    {
        int count_zeros=0;
        int prod=1;
        for (int i :nums)
        {   
            if(i==0)    {prod=prod;count_zeros+=1;}
            else        prod*=i;
        }
        int output []=new int [nums.length];

        for(int i=0;i<nums.length;i++)
        {
            if((nums[i]==0)&(count_zeros==1))  output[i]=prod;
            else if (count_zeros>=1) output[i]=0; 
            else           output[i]=prod/nums[i];
        }

        return output;
    }
}  
