
class Solution {
public:

    vector<vector<int>> threeSum(vector<int>& nums) {
        sort(nums.begin(),nums.end());
        set<vector<int>> output;
        int a,b,c,sum;
        a=0;

        while(a < nums.size() && nums[a] <= 0)
        {
            b=a+1;
            c=nums.size()-1;
            while(b<c)
            {
                sum=nums[a]+nums[b]+nums[c];
                if(sum==0){
                    output.insert({nums[a],nums[b],nums[c]});
                    ++b;
                    continue;
                }
                
                if(sum<0)++b;
                if(sum>0)--c;
            }
            ++a;
        }
        return vector<vector<int>>(output.begin(), output.end());
    }
};
