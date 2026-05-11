class TimeMap {
    Map<String, List<Integer>> times;
    Map<String, List<String>> values;

    public TimeMap() {
        times = new HashMap<>();
        values = new HashMap<>();
    }

    public void set(String key, String value, int timestamp) {
        times.computeIfAbsent(key, k -> new ArrayList<>()).add(timestamp);
        values.computeIfAbsent(key, k -> new ArrayList<>()).add(value);
    }

    public String get(String key, int timestamp) {
        if (!times.containsKey(key)) return "";
        List<Integer> ts = times.get(key);
        List<String> vs = values.get(key);
        int left = 0, right = ts.size() - 1;
        String result = "";
        while (left <= right) {
            int mid = (left + right) / 2;
            if (ts.get(mid) <= timestamp) {
                result = vs.get(mid);
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return result;
    }
}
