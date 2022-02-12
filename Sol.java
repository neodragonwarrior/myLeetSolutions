class Solution {
    public int findFinalValue(int[] nums, int original) {
     int result=original;
     int key=original;
     int i;
        Arrays.sort(nums);
     
        boolean flag=true;
     
        for (int n : nums)
        {
              System.out.println(n);
            if (n==key){
                result=key*2;
                key=result;
            }  
        }
       
        return result;
    }
}
