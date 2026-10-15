class Solution {
    public int[] topKFrequent(int[] nums, int k) {
       HashMap <Integer, Integer> map = new HashMap<>();
       for (int i = 0; i < nums.length; i++){
        map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        
       }
     System.out.println(map);
     List<Map.Entry<Integer, Integer>> lista = new ArrayList<>(map.entrySet());

     lista.sort((a, b) -> b.getValue() - a.getValue());
     int[] resultado = new int[k];

     for (int i = 0; i< k; i++){
        resultado[i] = lista.get(i).getKey();
     }

     return resultado;

    }
}
