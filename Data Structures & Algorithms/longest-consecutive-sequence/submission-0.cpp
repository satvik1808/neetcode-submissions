
using namespace std;

class Solution {
public:
    int longestConsecutive(vector<int>& nums) {
        unordered_set<int> ns(nums.begin(),nums.end());
        int longest=0;

        for(int n:ns){
            int streak=1;
            if(!ns.count(n-1)){
                int i=1;
                while(ns.count(n+i))
                {
                    i+=1;
                    streak+=1;
                }
            }
            longest=max(longest,streak);
        }
        return longest;
    }
};
