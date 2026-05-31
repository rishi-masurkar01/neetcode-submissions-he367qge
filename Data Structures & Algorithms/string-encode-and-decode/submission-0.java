class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        
        for (String s : strs) {
            sb.append(s.length()).append('#').append(s);
        }
        
        return sb.toString();
    }

    // Notice the parameter here is exactly "String s"
    public List<String> decode(String s) {
        List<String> result = new ArrayList<>();
        int i = 0;
        
        // Now all of these calls to 's' will work perfectly
        while (i < s.length()) {
            int j = i;
            
            while (s.charAt(j) != '#') {
                j++;
            }
            
            int length = Integer.parseInt(s.substring(i, j));
            
            int stringStart = j + 1;
            int stringEnd = stringStart + length;
            
            result.add(s.substring(stringStart, stringEnd));
            
            i = stringEnd;
        }
        
        return result;
    }
}