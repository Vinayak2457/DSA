class Solution {
    public List<String> letterCombinations(String digits) {
        HashMap<Character,List<Character>> map= new HashMap<>();
        map.put('2', Arrays.asList('a', 'b', 'c'));
        map.put('3', Arrays.asList('d', 'e', 'f'));
        map.put('4', Arrays.asList('g', 'h', 'i'));
        map.put('5', Arrays.asList('j', 'k', 'l'));
        map.put('6', Arrays.asList('m', 'n', 'o'));
        map.put('7', Arrays.asList('p', 'q', 'r', 's'));
        map.put('8', Arrays.asList('t', 'u', 'v'));
        map.put('9', Arrays.asList('w', 'x', 'y', 'z'));
        List<String> ans=new ArrayList<>();
        StringBuilder s=new StringBuilder();
        generate(ans,map,digits,0,s);
        return ans;
    }
    private void generate(List<String> ans,HashMap<Character,List<Character>> map,String digits,int index,StringBuilder s){
        if(index>=digits.length()){
            ans.add(s.toString());
            return;
        }
        for (Character ch : map.get(digits.charAt(index))) {
             s.append(ch);
             generate(ans,map,digits, index + 1, s);
            s.deleteCharAt(s.length() - 1);
        }
    }
}