class Solution {
    public String mergeAlternately(String word1, String word2) {
        char[] arr1=word1.toCharArray();
        char[] arr2=word2.toCharArray();
        StringBuilder res=new StringBuilder();
        int current=-1;
        int n=-1;
        if(arr2.length<arr1.length){
            n=arr2.length;
        }else{
            n=arr1.length;
        }
        for(int i=0;i<n;i++){
            res.append(arr1[i]);
            res.append(arr2[i]);
            current=i;
        }
        if(arr2.length>arr1.length){
            for(int i=current+1;i<arr2.length;i++){
                res.append(arr2[i]);
            }
        }
        if(arr2.length<arr1.length){
            for(int i=current+1;i<arr1.length;i++){
                res.append(arr1[i]);
            }
        }return new String(res);
    }
}