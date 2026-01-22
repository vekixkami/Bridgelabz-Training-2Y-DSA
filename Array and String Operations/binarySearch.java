public class binarySearch{
public static int binarySearch(int[] arr,int t){
    int l=0,r=arr.length-1;
    while(l<=r){
        int m=(l+r)/2;
        if(arr[m]==t) return m;
        else if(arr[m]<t) l=m+1;
        else r=m-1;
    }
    return -1;
}
public static void main(String[] args){
    int[] arr={1,2,3,4,5};
    int t=3;
    System.out.println(binarySearch(arr,t));
}
}   