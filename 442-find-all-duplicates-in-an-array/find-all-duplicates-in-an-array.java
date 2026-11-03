class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashSet<Integer> ans = new HashSet<>();
        HashMap <Integer,Integer>  freq = new HashMap<>();

        for(int num:nums){
            freq.put(num,freq.getOrDefault(num,0)+1);
        }

        for(int n :nums){
            if(freq.get(n)>1){
                ans.add(n);
            }
        }

        return new ArrayList<>(ans);
        
    }
}