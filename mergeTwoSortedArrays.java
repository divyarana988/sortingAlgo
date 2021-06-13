  public static int[] mergeTwoSortedArrays(int[] a, int[] b){
    //write your code here
    int n1 = a.length;
    int n2 = b.length;
    
    int res[] = new int[n1+n2];
    
    int i=0, j=0, k=0;
    
    while(i<n1 && j<n2){
        if(a[i]<=b[j]){
            res[k]  = a[i];
            i++;
            k++;
        }else{
            res[k]= b[j];
            j++;
            k++;
        }
    }
    
    while(i<n1){
        res[k] = a[i];
        i++;
        k++;
    }
    
    while(j<n2){
        res[k] = b[j];
        j++;
        k++;
    }
    
    return res;
  }

