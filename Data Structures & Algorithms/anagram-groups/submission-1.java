class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
         HashMap<String, List<String>> grupos = new HashMap<>();
        for (String palabra : strs) {
            char[] caracteres = palabra.toCharArray();
            Arrays.sort(caracteres);
            String ordenado = new String(caracteres);

            grupos.putIfAbsent(ordenado, new ArrayList<>());
            grupos.get(ordenado).add(palabra);
        }

        return new ArrayList<>(grupos.values());
    
    }
}
