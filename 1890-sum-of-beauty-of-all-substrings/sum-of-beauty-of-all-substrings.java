class Solution {
    public int beautySum(String s) {
        int sum = 0;

        for (int i = 0; i < s.length(); i++) {

            for (int j = i; j < s.length(); j++) {

                String sub = s.substring(i, j + 1);

                int max = maxfrequency(sub);
                int min = minfrequency(sub);

                sum += max - min;
            }
        }

        return sum;
    }

    private int maxfrequency(String ans) {
        int[] freq = new int[26];

        for (char ch : ans.toCharArray()) {
            freq[ch - 'a']++;
        }

        int max = 0;

        for (int i = 0; i < 26; i++) {
            max = Math.max(max, freq[i]);
        }

        return max;
    }

    private int minfrequency(String ans) {
        int[] freq = new int[26];

        for (char ch : ans.toCharArray()) {
            freq[ch - 'a']++;
        }

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < 26; i++) {
            if (freq[i] > 0) {
                min = Math.min(min, freq[i]);
            }
        }

        return min;
    }
}