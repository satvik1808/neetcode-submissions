class Solution {
    public boolean isAnagram(String s, String t) {

        int a=0;
        int b=0;

        s=s.toLowerCase();
        t=t.toLowerCase();
        for (char c : s.toCharArray()) {
            a+=c*c;
        }

        for (char c : t.toCharArray()) {
            b+=c*c;
        }


        if(a==b)return true;
        return false; 
    }
}


