class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;

        char[] schars = s.toCharArray();
        Arrays.sort(schars);
        char[] tchars = t.toCharArray();
        Arrays.sort(tchars);

        for(int i=0;i<schars.length;i++) {
            if(schars[i] != tchars[i]) return false;
        }
        return true;
    }
}
