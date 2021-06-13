  public static int[] mergeSort(int[] arr, int lo, int hi) {
    //write your code here
    
    if(lo==hi){
        return new int[]{
            arr[lo]
        };
    }
    
    int mid= (lo+hi)/2;
    
    int lpart[] = mergeSort(arr, lo, mid);
    int rpart[] = mergeSort(arr, mid+1,hi);

    return mergeTwoSortedArrays(lpart, rpart);
  }
  
  public static int[] mergeTwoSortedArrays(int[] a, int[] b){
    System.out.println("Merging these two arrays ");
    System.out.print("left array -> ");
    print(a);
    System.out.print("right array -> ");
    print(b);
    int i = 0, j =0, k = 0;
    int[] ans = new int[a.length + b.length];
    while(i < a.length && j < b.length){
        if(a[i] <= b[j]){
          ans[k] = a[i];
          i++;
          k++;
        }else{
          ans[k] = b[j];
          j++;
          k++;
        }
    }

    while(i < a.length){
      ans[k] = a[i];
      k++;
      i++;
    }

    while(j < b.length){
      ans[k] = b[j];
      k++;
      j++;
    }
    
    return ans;
  }
