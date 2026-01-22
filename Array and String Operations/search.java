public class search{
public static boolean search(int[][] mat, int target){
    int r=mat.length, c=mat[0].length;
    int l=0,h=r*c-1;

    while(l<=h){
        int mid=(l+h)/2;
        int val=mat[mid/c][mid%c];
        if(val==target) return true;
        else if(val<target) l=mid+1;
        else h=mid-1;
    }
    return false;

public static void main(String[] args){
    int[][] mat={{1,2,3},{4,5,6},{7,8,9}};
    int target=5;
    System.out.println(search(mat,target));
}    
}   
}   