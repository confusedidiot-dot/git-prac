//left rotate using reverse method
//tc O(n)
//sc O(1)
class RotateLeftReverseMethod {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8};
        int k=2;
        display(arr);
        leftRotate(arr,k);
        display(arr);
    }
    public static void leftRotate(int[] arr,int k){
        int n=arr.length-1;
        reverse(arr,0,n);
        reverse(arr,0,n-k);
        reverse(arr,n-k+1,n);
    }
    public static void reverse(int[] arr,int s,int e){
        while(s<=e){
            int temp=arr[s];
            arr[s]=arr[e];
            arr[e]=temp;
            s++;
            e--;
        }
    }
    public static void display(int[] arr){
	int n=arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}