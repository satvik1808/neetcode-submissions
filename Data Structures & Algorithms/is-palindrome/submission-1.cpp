class Solution {
public:
    bool isPalindrome(string s) {
        int i=0;
        int j=s.length()-1;
        while(i<j){
            while((!isalnum(s.at(i)))&&(i<j)){i++;}
            while((!isalnum(s.at(j)))&&(i<j)){j--;}

            if(tolower(s.at(i++))!=tolower(s.at(j--)))return false;
        }
        return true;
    }
};
