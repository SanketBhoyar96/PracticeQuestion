public class BruteForceProblem {
    
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,8,9};
        int k=10;
        int i=0;
        int j=arr.length-1;
        while(i<j){
            if(arr[i]+arr[j]==k){
             System.out.println(arr[i]+" "+arr[j]);
            }
            if(arr[i]+arr[j]<k){
                i++;
            }else{
                j--;
            }
            }
        }
        }

    