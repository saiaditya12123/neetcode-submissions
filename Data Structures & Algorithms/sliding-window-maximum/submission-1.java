class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
                if (nums == null || nums.length == 0) {
            return new int[0];
        }
        int n = nums.length;
        int[] result = new int[n - k + 1];
        int resultIndex = 0;
        // Deque stores indices
        Deque<Integer> q = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            // Remove indices out of the current window
            if (!q.isEmpty() && q.peekFirst() == i - k) {
                q.pollFirst();
            }
            // Remove smaller numbers in k range as they are useless
            while (!q.isEmpty() && nums[q.peekLast()] < nums[i]) {
                q.pollLast();
            }
            q.offerLast(i);
            if (i >= k - 1) {
                result[resultIndex++] = nums[q.peekFirst()];
            }
        }
        return result;
    }
}
