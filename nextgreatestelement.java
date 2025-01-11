

public class nextgreatestelement{
    public static void main(String[] args) {
        int [] arr = { 1, 6, 3 , 2 , 2 ,90};
        int n = arr.length;
        int res [] = new int[arr.length];
        for(int i=0; i<arr.length ; i++){
            res[i] =-1;
            for(int j=i+1; j<n; j++){
                if(arr[j]>arr[i]){
                    res[i]=arr[j]; break;
                }
            }
        }
        for(int i=0; i<arr.length ; i++){
        System.out.println(arr[i] + "   ");
    

        } for(int i=0; i<res.length ; i++){
            System.out.println(res[i] + "   ");
        }    
    }
}
   