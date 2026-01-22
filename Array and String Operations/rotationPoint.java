class rotationPoint{
public static int rotationPoint(int[] arr){
    int l=0, r=arr.length-1;
    while(l<r){
        int mid = l + (r-l)/2;
        if(arr[mid] > arr[r]) l = mid+1;
        else r = mid;
    }
    return l;
}
public static void main(String[] args){
    int[] arr={1,2,3,4,5};
    System.out.println(rotationPoint(arr));
}
}   