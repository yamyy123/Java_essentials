public class Array {
    public static void main(String[] args) {
        int arr [] = new int[]{1,2,3,4,5};
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
        System.out.println();
        // enhanced for loop
        for(int i:arr){
            System.out.print(i);
        }
        System.out.println();
        int twodarr [][] = new int[][]{{1,2,3,4,5},{1,2,3,4,5}}; 
        for (int i=0;i<twodarr.length;i++){
            for(int j=0;j<twodarr[i].length;j++){  // need to give for 2d array like this
                System.out.print(twodarr[i][j]+" ");
            }
            System.out.println();
        }
       
        //enhanced for loop for 2d array

        for(int n[]:twodarr){
            for(int i:n){
                System.out.print(i+" ");
            }
            System.out.println();
        }
        System.out.println();
        /*  in java there is a option of jagged array  
         in which in 2d array we can use fixed size for the initial capacity of arrays and we can able to change the capacity of the arrays based on it 
         while definition the second capacity is not mandatory
        */
        System.out.println("jagged array");

        int jaggedarr [][] = new int [6][]; // see this is not throwing any errors
        jaggedarr[0] = new int [5];
        jaggedarr[1] = new int [3];
        jaggedarr[2] = new int [2];
        jaggedarr[3] = new int [4];
        jaggedarr[4] = new int [1];
        jaggedarr[5] = new int []{1,2,3,4,5,6};
        // see in this we are able to change the size of the inner array

        for(int i=0;i<jaggedarr.length;i++){
            for(int j=0;j<jaggedarr[i].length;j++){
                jaggedarr[i][j] = i+j;
                System.out.print(jaggedarr[i][j]+" ");
            }
            System.out.println();
        }

        // this is the example of jagged array
        
    }
}