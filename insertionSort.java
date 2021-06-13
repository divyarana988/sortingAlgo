  public static void insertionSort(int[] arr) {
    //write your code here
    int n = arr.length;
    for(int i=1; i<=n-1; i++){
        for(int j=i;j>0;j--){
            if(isGreater(arr, j-1, j)){
                swap(arr, j-1,j);
            }else{
                break;
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


  public static boolean isGreater(int[] arr, int j, int i) {
    System.out.println("Comparing " + arr[i] + " and " + arr[j]);
    if (arr[i] < arr[j]) {
      return true;
    } else {
      return false;
    }
  }

  public static void print(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
  }

 