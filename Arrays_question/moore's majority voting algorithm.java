class Solution {
    int majorityElement(int arr[]) {
        // code here
        int count = 0;
        int candidate = 0;
        for(int i =0; i<=arr.length-1;i++){
            if(count ==0){
                candidate=arr[i];
                count = 1;
            }else{
                if(arr[i] == candidate){
                    count ++;
                    
                }else{
                    count --;
                }
            }
        }
        int j= 0;
        for(int i= 0;i<arr.length; i++){
            if(candidate == arr[i]){
                j++;
            }
        }
        if(j> arr.length/2){
            return candidate;
            
        }else return -1;
        
    }
}
