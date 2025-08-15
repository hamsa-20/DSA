class Solution {
    public int[] shortestToChar(String s, char c) {
        int n =s.length();
        int arr[] =new int[n];
       
        int count=0;
        int i=0;
        boolean f=false;
        for(i=0;i<n;i++){
            if(s.charAt(i)==c){
                f=true;
                arr[i]=0;
                count=1;
                continue;
            }
            if(!f){
                arr[i]=Integer.MAX_VALUE;
            }else{
                arr[i]=count;
                count++;
            }
        }
        f=false;
        count=1;
        for(i=n-1;i>=0;i--){
            if(s.charAt(i)==c){
                f=true;
                arr[i]=0;
                count=1;
                continue;
            }
            if(!f){
                // arr[i]=Math.min(Integer.MAX_VALUE,arr[i];
                continue;
            }else{
                arr[i]=Math.min(arr[i],count);
                count++;
            }
        }
        return arr;
    }
}