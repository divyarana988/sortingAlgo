

  public static void bubbleSort(int[] arr) {
    //write your code here
    int n = arr.length-1;
    
    for(int i=0; i<=n-1; i++){
        
        for(int j=0; j<=n-1-i; j++){
            if(isSmaller(arr, j+1, j)){
                swap(arr,j+1, j);
            }
        }
    }
    
  }


  public static void swap(int[] arr, int i, int j) {
    System.out.println("Swapping " + arr[i] + " and " + arr[j]);
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }

  public static boolean isSmaller(int[] arr, int i, int j) {
    System.out.println("Comparing " + arr[i] + " and " + arr[j]);
    if (arr[i] < arr[j]) {
      return true;
    } else {
      return false;
    }
  }
