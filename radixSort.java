  public static void radixSort(int[] arr) {
    // write code here    
    int max = Integer.MIN_VALUE;
    for(int val: arr){
        if(max<val){
            max= val;
        }
    }
    int count =0;
    while(max!=0){
        count++;
        max = max/10;
    }
    
    for(int i=1, exp=1; i<=count; i++, exp=exp*10){
        countSort(arr, exp);
    }
  }

  public static void countSort(int[] arr, int exp) {
    // write code here
    
    int freq[] = new int[10];
    for(int val: arr){
        freq[(val/exp)%10]++;
    }
    
    for(int i=1; i<10; i++){
        freq[i] += freq[i-1];
    }
    int res[] = new int[arr.length];
    for(int i=arr.length-1; i>=0; i--){
        int val = arr[i];
         int pos = (val/exp)%10;
         int place = freq[pos];
         res[place-1]= val;
         freq[pos]--;
    }
    
    for(int i=0; i<arr.length; i++){
        arr[i] = res[i];
    }
    
    System.out.print("After sorting on " + exp + " place -> ");
    print(arr);
  }

