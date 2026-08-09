
class Solution {

    public String format(int a)
    {
        if(a/10==0)         return("#00"+a);
        else if(a/100==0)   return("#0"+a);
                            return ("#"+a);
    }

    public String encode(List<String> strs) {
        String result = "";
        for (String word : strs) {
            // Replaced StringBuilder with standard String concatenation
            result += format(word.length()) + word;
        }

        return result;
    }
    
    int jump;

    public List<String> decode(String str) {
        // Removed StringBuilder; directly using the passed 'str' string
        List<String> list = new ArrayList<>();
        for (int i = 0; i < str.length();) 
        {
            if(str.charAt(i)=='#')
                {
                    jump=Integer.parseInt(str.substring(i+1, i+4));
                    i=i+4;
                } 
            list.add(str.substring(i,i+jump));
            i=i+jump;      
        }
        // Added return statement so the code compiles
        return list; 
    }
}