class Solution {
    public int[] sortArray(int[] arr) {
        merge(arr,0,arr.length-1);
        return arr;
    }

    public static void merge(int [] arr,int left,int right){
        if(left >= right){
            return;
        }
        int mid = left+(right-left)/2;
        merge(arr,left,mid);
        merge(arr,mid+1,right);

        sort(arr,left,mid,right);
    }

    public static void sort(int [] arr,int left,int mid,int right){
        int n = mid-left+1;
        int m = right-mid;
        int a[] = new int[n];
        int b[] = new int[m];

        for(int i=0;i<n;i++){
            a[i] = arr[left+i];
        }

        for(int i=0;i<m;i++){
            b[i] = arr[mid+1+i];
        }

        int i=0,j=0;
        int k = left;

        while(i<n && j<m){
            if(a[i] <= b[j]){
                arr[k] = a[i];
                i++;
            }else{
                arr[k] = b[j];
                j++;
            }
            k++;
        }

        while(i < n){
            arr[k++] = a[i++];
        }
        while(j < m){
            arr[k++] = b[j++];
        }
    }
}