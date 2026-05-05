class Solution {
    public boolean isPalindrome(String s) {
            String newsString = s.replaceAll("[^a-zA-Z0-9]", "");
        int left = 0;
        int right = newsString.length() - 1;

        while (left < right) {

            if (String.valueOf(newsString.charAt(right)).toLowerCase()
                    .equals(String.valueOf(newsString.charAt(left)).toLowerCase())) {
                left++;
                right--;
            } else {
                return false;
            }
        }
        return true;
    }
}
