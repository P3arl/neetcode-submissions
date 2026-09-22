class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            // char[] chars = s.toCharArray();
            // Arrays.sort(chars);
            // String sorted = new String(chars);
            // map.putIfAbsent(sorted, new ArrayList<>());
            // map.get(sorted).add(s);

            //
            int[] counts = new int[26];
            char[] chars = s.toCharArray();
            for (char c : chars) {
                counts[c - 'a']++;
            }
            String key = Arrays.toString(counts);
            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
