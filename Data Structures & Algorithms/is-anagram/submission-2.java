class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;

        char[] schars = s.toCharArray();
        char[] tchars = t.toCharArray();
    

        Map<Character,Integer> smap = new HashMap<>();
        Map<Character,Integer> tmap = new HashMap<>();


        for(int i=0;i<schars.length;i++) {
            smap.put(schars[i], smap.getOrDefault(schars[i], 0)+1);
            tmap.put(tchars[i], tmap.getOrDefault(tchars[i], 0)+1);
        }
        return smap.equals(tmap);
    }
}
