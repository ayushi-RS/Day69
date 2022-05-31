class Solution {
    public int lengthOfLongestSubstring(String s) {
        Queue<Character> list = new LinkedList<>();
        int max = 0;
        for(char ch: s.toCharArray()) {
            if(list.contains(ch)) {
                while(list.peek() != ch) {
                    list.poll();
                }
                list.poll();
            }
            list.add(ch);
            max = Math.max(max, list.size());
        }
        return max;
    }
}