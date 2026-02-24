class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        int res=0; // code here
        int i=0;
        int j =0;
        HashMap<Character,Integer> map = new HashMap<>();
        while(j<n){
            if(map.containsKey(s.charAt(j))){
                map.remove(s.charAt(i));
                i++;
            }
            else{
                map.put(s.charAt(j),1);
                j++;
            }
        res = Math.max(res,j-i);    
        }
        return res;
    }
}