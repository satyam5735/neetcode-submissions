class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> res = new HashMap<>();
        for(String s : strs) {
            char[] t = s.toCharArray();
            Arrays.sort(t);
            String gluebackt = new String(t);
            res.putIfAbsent(gluebackt, new ArrayList<>());
            res.get(gluebackt).add(s);
        }
        return new ArrayList<>(res.values());
    }
}
