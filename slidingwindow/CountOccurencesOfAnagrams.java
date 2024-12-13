class CountOccurencesOfAnagrams
{
    int search(String pat, String txt) {
        int ans = 0;
        int start = 0;
        int end = 0;
        int count = 0;
        int k=pat.length();
        Map<Character, Integer> patCount = new HashMap<>();
    
        for (char c: pat.toCharArray()) {
            patCount.put(c, patCount.getOrDefault(c, 0) + 1);
        }
    
        count = patCount.size();
    
        while (end < txt.length()) {
            //calculation
            char c = txt.charAt(end);
            patCount.put(c, patCount.getOrDefault(c, 0) - 1);
            if (patCount.get(c) == 0) {
                count--;
            }
    
            if (end - start + 1 < k) {
                end++;
            } else if (end - start + 1 == k) {
                //ans
                if (count == 0) {
                    ans++;
                }
    
                if (patCount.containsKey(txt.charAt(start))) {
                    if (patCount.get(txt.charAt(start)) == 0) {
                        count++;
                    }
                    patCount.put(txt.charAt(start), patCount.getOrDefault(txt.charAt(start), 0) + 1);
                }
                start++;
                end++;
            }
        }
        return ans;
    }
}
