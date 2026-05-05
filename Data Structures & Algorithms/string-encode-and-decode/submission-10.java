class Solution {
 // Encodes a list of strings to a single string.
    public String encode(List<String> strs) {
        StringBuilder encodedString = new StringBuilder();
        for (String s : strs) {
            encodedString.append(s.length());
            encodedString.append('#');
            encodedString.append(s);
        }
        return encodedString.toString();
    }

    // Decodes a single string to a list of strings.
    public List<String> decode(String s) {
        List<String> decodedStrings = new ArrayList<>();
        int currentIndex = 0;
        while (currentIndex < s.length()) {
            int delimiterIndex = s.indexOf('#', currentIndex);
            int length = Integer.parseInt(s.substring(currentIndex, delimiterIndex));
            currentIndex = delimiterIndex + 1;
            String str = s.substring(currentIndex, currentIndex + length);
            decodedStrings.add(str);
            currentIndex += length;
        }
        return decodedStrings;
    }
}
