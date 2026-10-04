class Solution {
    public boolean checkIfPangram(String sentence) {
        HashMap<Character, Boolean> map = new HashMap<>();

        for (char ch : sentence.toCharArray()) {
            map.put(ch, true);
        }

        return map.size() == 26;
    }
}
