class Solution {
    public int[][] merge(int[][] intervals) {
        int[][] a = intervals;
        Arrays.sort(intervals, (i,j) -> i[0] - j[0]);
        int[] curr = a[0];
        List<int[]> merged = new ArrayList<>();
        merged.add(curr);

        for(int i=1;i<a.length;i++) {
            int nextStart = a[i][0];
            int nextEnd = a[i][1];
            int currEnd = curr[1];

            if(nextStart <=currEnd) {
                curr[1] = Math.max(currEnd, nextEnd);
            } else {
                curr = a[i];
                merged.add(curr);
            }
        }
        return merged.toArray(new int[merged.size()][]);
    }
}
