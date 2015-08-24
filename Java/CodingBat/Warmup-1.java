//sleepIn - The parameter weekday is true if it is a weekday, and the parameter vacation
//is true if we are on vacation. We sleep in if it is not a weekday or we're on vacation. 
//Return true if we sleep in.

public boolean sleepIn(boolean weekday, boolean vacation)
{
    boolean sleepingIn = true;

    if( weekday && !vacation )
        sleepingIn = false;

    return sleepingIn;
}


//monkeyTrouble - We have two monkeys, a and b, and the paramaters aSmile and bSmile indicate 
//if each is smiling. We are in trouble if they are both smiling or if neither of them is smiling.
//Return true if we are in trouble.

public boolean monkeyTrouble(boolean aSmile, boolean bSmile)
{
    boolean inTrouble = false;

    if( (aSmile && bSmile) || (!aSmile && !bSmile) )
        inTrouble = true;

    return inTrouble;
}


//sumDouble - Given two int values, return their sum. Unless the two values are the same, then return
//double their sum.

public int sumDouble(int a, int b)
{
    if( a == b )
        return (a + b) * 2;
    else 
        return a + b;
}


//diff21 - Given an int n, return the absolute difference between n and 21, except return double
//the absolute difference if n is over 21.

public int diff21(int n)
{
    int diff = Math.abs(n - 21);

    if( n > 21 )
        diff *= 2;

    return diff;
} 


//parrotTrouble - We have a loud talking parrot. The "hour" parameter is the current hour time in 
//the range 0..23. We are in trouble if the parrot is talking and the hour is before 7 or after 20.
//Return true if we are in trouble.

public boolean parrotTrouble(boolean talking, int hour)
{
    boolean inTrouble = false;
    
    if( talking )
        if( hour < 7 || hour > 20 )
            inTrouble = true;

    return inTrouble;
}


//makes10 - Given 2 ints, a and b, return true if one of them is 10 or if their sum is 10.

public boolean makes10(int a, int b)
{
    boolean isTrue = false;

    if( (a + b) == 10 )
        isTrue = true;
    
    if( (a == 10) || (b == 10) )
        isTrue = true;

    return isTrue;
}


//nearHundred - Given an int n, return true if it is within 10 of 100 or 200. Note: Math.abs(num) 
//computes the absolute value of a number.

public boolean nearHundred(int n)
{
    boolean within10 = false;

    if( 
