class Array1{

    static void pritArrayEvenFw(int[] arr){
        for(int i =0; i<arr.length; i++){
            if(arr[i] % 2 ==0){
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println("");
    }
    static void pritArrayEvenBw(int[] arr){
        for(int i =arr.length-1; i>=0; i--){
            if(arr[i] % 2 ==0){
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println("");
    }
    static void pritArrayEvenBwH(int[] arr){
        for(int i =arr.length-1; i>=arr.length/2; i--){
            if(arr[i] % 2 ==0){
                System.out.print(arr[i] + " ");
              
            }
        }
        System.out.println("");
    }
    static void pritArrayEvenFwH(int[] arr){
        for(int i =0; i<arr.length/2; i++){
            if(arr[i] % 2 ==0){
                System.out.print(arr[i] + " ");
                
            }
        }
        System.out.println("");
    }
  
    static void pritArrayEvenBwHm(int[] arr){
        for(int i =arr.length/2; i>=0; i--){
            if(arr[i] % 2 ==0){
                System.out.print(arr[i] + " ");
                
            }
        }
        System.out.println("");
    }
    static void pritArrayEvenFwHm(int[] arr){
        for(int i =arr.length/2; i<arr.length; i++){
            if(arr[i] % 2 ==0){
                System.out.print(arr[i] + " ");
                
            }
        }
        System.out.println("");
    }
    public static void main (String[] args){
        int[] arr = {2,6,3,4,7,8,2,21};
        pritArrayEvenFw(arr);
        pritArrayEvenBw(arr);
        pritArrayEvenBwH(arr);
        pritArrayEvenBwHm(arr);
        pritArrayEvenFwH(arr);
        pritArrayEvenFwHm(arr);

    }
}