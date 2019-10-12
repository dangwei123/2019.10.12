1.
统计所有小于非负整数 n 的质数的数量。

class Solution {
    public int countPrimes(int n) {
        if(n<=2){
            return 0;
        }
        boolean[] res=new boolean[n]; 
        int count=0;
       for(int i=2;i<n;i++){
           if(!res[i]){
               for(int j=2;j*i<n;j++){
                   res[i*j]=true;
               }
           }
       }
        for(int i=2;i<n;i++){
            if(!res[i]){
                count++;
            }
        }
        return count;
    }
}


