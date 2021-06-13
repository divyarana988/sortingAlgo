public static void sort012(int[] arr){
    //write your code here
    int i=0, j=0, k=arr.length-1;
    
    while(i<=k){
        
        if(arr[i]==1){
            i++;
        }else if(arr[i]==0){
            swap(arr, i, j);
            i++;
            j++;
        }else if(arr[i]==2){
            swap(arr,i, k);
            k--;
        }
        
    }
  }

  public static void swap(int[] arr, int i, int j) {
    System.out.println("Swapping index " + i + " and index " + j);
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }

