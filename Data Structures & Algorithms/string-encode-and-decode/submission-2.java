class Solution {

    public String format(int a)
    {
        if(a/10==0)         return("#00"+a);
        else if(a/100==0)   return("#0"+a);
                            return ("#"+a);
    }
    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for (String word : strs) {
            // Fixed the syntax error here (.word -> .append(word))
            sb.append(format(word.length())).append(word);
        }

        return sb.toString();
    }
    int jump;

    public List<String> decode(String str) {
        StringBuilder sb = new StringBuilder(str);
        List<String> list = new ArrayList<>();
        for (int i = 0; i < sb.length();) 
        {
            if(sb.charAt(i)=='#')
                {
                    jump=Integer.parseInt(sb.substring(i+1, i+4));
                    i=i+4;
                } 
            list.add(sb.substring(i,i+jump));
            i=i+jump;      
        }
        // Added return statement so the code compiles
        return list; 
    }
}