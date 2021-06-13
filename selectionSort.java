  public static void selectionSort(int[] arr) {
    //write your code here
    int n = arr.length;
    for(int i=1; i<=n-1; i++){
        int minidx= i-1;
        for(int idx =i; idx<n; idx++){
            
            if(isSmaller(arr, idx, minidx)){
                minidx = idx;
            }
            
        }
        swap(arr, i-1, minidx);
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

 