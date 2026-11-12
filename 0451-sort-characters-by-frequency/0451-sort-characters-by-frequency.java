class Solution {
    public String frequencySort(String s) {
        int n=s.length();
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0 ; i<n ; i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }

        Map<Character, Integer> sortedMap = map.entrySet()
            .stream()
            .sorted(Map.Entry.<Character, Integer>comparingByValue().reversed())
            .collect(Collectors.toMap(
                Map.Entry::getKey,
                Map.Entry::getValue,
                (e1, e2) -> e1,
                LinkedHashMap::new
            ));

        StringBuilder ans=new StringBuilder();
        for(Map.Entry<Character,Integer> entry: sortedMap.entrySet()){
            int time=entry.getValue();
            while(time!=0){
                ans.append(entry.getKey());
                time--;
            }
        }
        
        return ans.toString();
    }
}