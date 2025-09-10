class Solution {
    int majorityElement(int arr[]) {
        // code here
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = arr.length/2;
        for(int ele: arr){
            map.put(ele,map.getOrDefault(ele,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            if(entry.getValue()>n){
                return entry.getKey();
            }
        }
        return -1;
    }
}
