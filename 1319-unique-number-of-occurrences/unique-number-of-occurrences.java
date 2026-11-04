class Solution {
    public boolean uniqueOccurrences(int[] arr) {

        HashMap<Integer, Integer> freq = new HashMap<>();

        for(int n:arr){
            freq.put(n, freq.getOrDefault(n,0)+1);
        }

        HashSet<Integer> set = new HashSet<>();

        for(int i: freq.values()){
            if (set.contains(i)) {
                return false;
            } else {
                set.add(i);
            }

            
        }
     return true;   
    }
    
}