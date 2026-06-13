class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> ans = new HashMap <> ();
        for(int i = 0;i<strs.length;i++){
            char freq[] = new char[26];
            for(int j = 0;j<strs[i].length();j++){
                char currChar = strs[i].charAt(j);
                freq[currChar - 'a']+=1;
            }

            String key = Arrays.toString(freq);
            ans.putIfAbsent(key,new ArrayList<>());
            ans.get(key).add(strs[i]);
        }
        return new ArrayList<>(ans.values());
    }
}
