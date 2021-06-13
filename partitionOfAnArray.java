public static void partition(int[] arr, int pivot){
    //write your code here
    int i=0, j=0;
    while(i<arr.length){
        if(arr[i]<=pivot){
            swap(arr,i,j);
            i++;
            j++;
            
        }
        else{
            i++;
        }
    }
    
  }

  public static void swap(int[] arr, int i, int j) {
    System.out.println("Swapping " + arr[i] + " and " + arr[j]);
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }
