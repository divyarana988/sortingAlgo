  public static void sort01(int[] arr){
    //write your code here
    int i=0, j=0;
    
    while(i<arr.length){
        
        if(arr[i]==1){
            i++;
        }else{
            swap(arr, i, j);
            i++;
            j++;
        }
        
    }
    
  }

  public static void swap(int[] arr, int i, int j) {
    System.out.println("Swapping index " + i + " and index " + j);
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }

