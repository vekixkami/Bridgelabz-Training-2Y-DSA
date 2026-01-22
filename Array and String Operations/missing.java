public class missing{
public static int missing(int[] arr){
    boolean[] seen=new boolean[arr.length+1];
    for(int n:arr){
        if(n>0 && n<=arr.length) seen[n]=true;
    }
    for(int i=1;i<seen.length;i++)
        if(!seen[i]) return i;
    return arr.length+1;
}
public static void main(String[] args){
    int[] arr={1,2,3,4,5};
    System.out.println(missing(arr));
}
}   