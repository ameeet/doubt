class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        Arrays.sort(piles);
       
    for(int k=1;k<piles[piles.length-1];k++){
         int[] b = new int[piles.length];
        b=piles;
        int i=0;
     while(h!=0 && i<b.length){
         if(b[i]>0){
             if(b[i]>=k){
              b[i]=b[i]-k;
             h--;   
             }
             else{
                 b[i]=0;
                 h--;
             }
             
         }
         else{
             i++;
         }
     }  
        if(b[b.length-1]<=0){
            return k;
        }
    }
         return -1;
    }
   
}
