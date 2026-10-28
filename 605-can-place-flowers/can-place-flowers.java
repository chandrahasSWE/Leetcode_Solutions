class Solution {
    public boolean canPlaceFlowers(int[] arr, int n) {
        int cnt=0;
        
        int m=arr.length;
        for(int i=0;i<m;i++){
            if(i==0){
                if(m==1){
                    if(arr[0]==0){
                        cnt++;
                    }
                }
                else if(arr[0]==0&&arr[1]==0){
                    arr[0]=1;
                    cnt++;
                }
            }
                else if(i==m-1){
                    if(arr[m-1]==0&& arr[m-2]==0){
                        arr[m-1]=1;
                        cnt++;
                    }
                }
                else{
                    if(arr[i]==0){
                        if(arr[i-1]==0&&arr[i+1]==0){
                            arr[i]=1;
                            cnt++;
                        }
                    }
                }
            }
             return cnt>=n;
    }
}