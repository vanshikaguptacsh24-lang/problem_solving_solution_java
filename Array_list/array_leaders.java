class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        ArrayList<Integer> al = new ArrayList<>();
        int n= arr. length;
        al.add(0,arr[n-1]);
        int max = arr[n-1];
        for(int i=n-2;i>=0;i--){
            if(max <= arr[i]){
               
                max = arr[i];
                al.add(0,arr[i]);
            }
        }
        return al;
    }
}
