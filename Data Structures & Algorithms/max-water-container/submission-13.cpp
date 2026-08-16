class Solution {
public:
    int maxArea(vector<int>& heights) {

        int a=0;
        int b=heights.size()-1;
        int area=0;
        int area_max=0;
        int f=0;
        while(a<b)
        {

            area=min(heights[a],heights[b])*(b-a);
            if(area_max<area)
            {
                area_max=area;
            }

            if(heights[a]>heights[b])b--;
            else a++;
        }
        return area_max;
    }
};
