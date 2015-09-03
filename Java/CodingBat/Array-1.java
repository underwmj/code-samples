/* firstLast6 - Given an array of ints, return true if 6 appears as either the first or
 * last element in the array. The array will be length 1 or more.
 */

public boolean firstLast6(int[] nums)
{
    boolean has6 = false;

    if( nums[0] == 6 || nums[nums.length - 1] == 6 )
        has6 = true;

    return has6;
}


/* sameFirstLast - Given an array of ints, return true if the array is length 1 or more, 
 * and the first element and the last element are equal.
 */

public boolean sameFirstLast(int[] nums)
{
    boolean areEqual = false;

    if( nums.length >= 1 )
        if( nums[0] == nums[nums.length - 1] )
            areEqual = true;

    return areEqual;
}


/* makePi - Return an int array length 3 containing the first 3 digits of pi.
 */

public int[] makePi()
{
    return new int[]{3, 1, 4]
}
