class Solution {
    public int[] sortEvenOdd(int[] nums) {
   
        int[] odd = new int[nums.length];
        int[] even = new int[nums.length];
        int i,j=0,k=0;
       
        for(i=0;i<nums.length;i++)
        {
            if( i % 2 == 0) {
                even[k]=nums[i];
                 // System.out.println("even"+even[j]);
                    //   System.out.println("i"+i+"length:"+nums.length);
                   k++;
                             }
            else {
                  odd[j]=nums[i];
              //    System.out.println("odd"+odd[k]);
                   //  System.out.println("i"+i+"length:"+nums.length);
                  j++;
                }
        }
       
   
       
       Arrays.sort(even);
      Arrays.sort(odd);
       
       int[] fe = Arrays.stream(even).filter(num -> num != 0).toArray();
       int[] fo = Arrays.stream(odd).filter(num -> num != 0).toArray();
     
        j=fo.length-1;
        k=0;
       
        for(i=0;i<nums.length;i++)
                    {
                   
                        if(i%2 == 0 )
                        nums[i]=fe[k++];
                        else
                        nums[i]=fo[j--];
                     
                    }    
               
          return nums;          

    }
}
