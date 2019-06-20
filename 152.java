// Maximum subarray Product
//Time Complexity = O(n)
class Solution 
{
    public int maxProduct(int[] nums)
    {
        int negativeValue = 0;
        int currProduct = 1;
        int maxProduct = nums[0];
        int numNegativeValues = 0;
        boolean hasToBeCheckedReversed = false;
        
        if(nums.length == 1)  return nums[0];    //Base case check
        
        for(int i = 0; i < nums.length; i++)
        {
            currProduct *= nums[i];
            if(currProduct > maxProduct){       //keeps checking if the current product is greater than the max Product
                maxProduct = currProduct;
            }    
            
            //check if the number is 0
            if(nums[i] == 0)
            {
               negativeValue = 0;
               currProduct = 1;
                if(numNegativeValues % 2 != 0)      //check for odd number of values
                {
                    //reverse the subarray and check again for the max Product
                    hasToBeCheckedReversed = true;
                }
                 numNegativeValues = 0;
            }
                
            //check if a negative has been encountered
            if(currProduct < 0)
            {
                numNegativeValues++;
                if(negativeValue != 0)
                {
                    currProduct *= negativeValue;
                    negativeValue = 0;
                    
                    if(currProduct > maxProduct)
                    {
                        maxProduct = currProduct;
                    }
                }
                
                else 
                {
                   negativeValue = currProduct;
                   currProduct = 1;
                } 
                
            }   
        }
        
        if(numNegativeValues % 2 != 0)
        {
            //Reverse the array and check
            hasToBeCheckedReversed = true;
        }
        
        if(hasToBeCheckedReversed)
        {
            int len = nums.length;
            int[] revArray = new int[len];
            for(int i = 0; i < len; i++)
            {
                revArray[i] = nums[len - i - 1];
            }
            return Math.max(maxProduct, maxProductNewArray(revArray));
        }
        else
        {
            return maxProduct;
        }   
    }
    
    public int maxProductNewArray(int[] nums)
    {
        int maxProduct = nums[0];
        int currProduct = 1;
        int negativeValue = 0;
        if(nums.length == 1)
        {
            return nums[0];
        }
        
         for(int i = 0; i < nums.length; i++)
        {
            currProduct *= nums[i];
            if(currProduct > maxProduct){       //keeps checking if the current product is greater than the max Product
                maxProduct = currProduct;
            }    
            
            //check if the number is 0
            if(nums[i] == 0)
            {
               negativeValue = 0;
               currProduct = 1;
                // if(numNegativeValues % 2 != 0)      //check for odd number of values
                // {
                //     //reverse the subarray and check again for the max Product
                // }
                //  numNegativeValues = 0;
            }
                
            //check if a negative has been encountered
            if(currProduct < 0)
            {
                //numNegativeValues++;
                if(negativeValue != 0)
                {
                    currProduct *= negativeValue;
                    negativeValue = 0;
                    
                    if(currProduct > maxProduct)
                    {
                        maxProduct = currProduct;
                    }
                }
                
                else 
                {
                   negativeValue = currProduct;
                   currProduct = 1;
                } 
                
            }   
        }
        
        return maxProduct; 
    }
}
