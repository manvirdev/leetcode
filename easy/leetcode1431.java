class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        // initialize a variable to hold the maximum number of candies
        int maxCandies = 0;
        
        // iterate through the candies array to find the maximum number of candies
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] > maxCandies) {
                maxCandies = candies[i];
            }
        }
        
        // initialize a list to hold the result
        List<Boolean> result = new ArrayList<Boolean>();
        
        // iterate through the candies array again
        for (int i = 0; i < candies.length; i++) {
            // add a Boolean value to the result list based on whether or not
            // the current child can have the greatest number of candies among the children
            result.add(candies[i] + extraCandies >= maxCandies);
        }
        
        // return the result list
        return result;
    }
}
