class Solution {
    public String longestCommonPrefix(String[] strs) {
        int word = strs[0].length();
        for (int i=0; i<strs.length; i++){
            if (strs[i].length()<word){

                word=strs[i].length();
            }
        }
        String ans = "";
        int i;
        for (int j =0;j<word; j++){
                for (i=0; i<strs.length-1; i++){
                    if(strs[i].charAt(j) != strs[i+1].charAt(j)){
                        return ans;
                    }

                }
                if (strs.length-1 == i){
                    ans=ans+strs[0].charAt(j);
                }

        }
    return ans;
    }
}