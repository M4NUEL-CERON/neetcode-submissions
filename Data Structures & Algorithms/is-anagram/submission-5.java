class Solution {
    public boolean isAnagram(String s, String t) {
     if (!(s.length() == t.length())) {
            return false;
        }
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            hashMap.put(s.charAt(i), hashMap.getOrDefault(s.charAt(i), 0) + 1);
            
        }
        HashMap<Character, Integer> hashMap2 = new HashMap<>();
        for  (int i = 0; i < t.length(); i++) {
            hashMap2.put(t.charAt(i), hashMap2.getOrDefault(t.charAt(i), 0) + 1);
        }
        return hashMap.equals(hashMap2);
    }
}
