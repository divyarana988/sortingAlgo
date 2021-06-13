public static void countSort(int[] arr, int min, int max) {
  
   int nou = max-min+1;
   int freq[] = new int[nou];
   int res[] = new int[arr.length];
   
   for(int vals: arr){
       freq[vals-min]++;
   }
   
   for(int i=1; i<nou; i++){
       freq[i] = freq[i] + freq[i-1];
   }
   
   for(int i= arr.length-1; i>=0; i--){
       int val = arr[i];
       int pos = val-min;
       int place = freq[pos];
       res[place-1] = val;
       freq[pos]--;
   }
   
    for(int i = 0 ; i < arr.length ; i++){
       arr[i] = res[i];
   }
   
  }