class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) {
            return new ArrayList<>();
        }

      
        Map<String, List<String>> map = new HashMap<>();

        
        for (String currentString : strs) {
            
            
            char[] characters = currentString.toCharArray();
            Arrays.sort(characters);
            String signature = new String(characters);

           
            if (!map.containsKey(signature)) {
                map.put(signature, new ArrayList<>());
            }

            
            map.get(signature).add(currentString);
        }

    
        return new ArrayList<>(map.values());
    }
}
