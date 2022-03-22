import java.util.Arrays;

/**
 * triplateProblem
 */
public class triplateProblem {
public static void main(String[] args) {
    int[] arr = {13,7,4,5,12,8,3};
    int k = 25;
    Arrays.sort(arr);

    for(int a=0; a < arr.length-2; a++){
        int b = a+1;
        int c = arr.length-1;
        while(b < c){
            if((arr[a] + arr[b] + arr[c])<k){
                b++;
            }
            else if((arr[a] + arr[b] + arr[c])>k){
                c--;
            }
            else{
                System.out.println(arr[a] + " "+arr[b] + " "+ arr[c]);
                b++;
                c--;
            }
        }
    }
}
}