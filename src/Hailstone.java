public class Hailstone {

    /** Returns the length of a hailstone sequence that starts with n,
     * as described in part (a).
     * Precondition: n > 0
     */
    public static int hailstoneLength(int n) {
        int length = 1;
        while(n != 1){
            if(n%2 == 0){
                n = n/2;
            }
            else{
                n = n*3+1;
            }
            length++;
        }
        return length;
    }


    /** Returns true if the hailstone sequence that starts with n is considered long
     * and false otherwise, as described in part (b).
     * Precondition: n > 0
     */
    public static boolean isLongSeq(int n) {
        if(n<hailstoneLength(n)){
            return true;
        }
        else {
            return false;
        }

    }


    /** Returns the proportion of the first n hailstone sequences that are considered long,
     * as described in part (c).
     * Precondition: n > 0
     */
    public static double propLong(int n) {
        double i = 0;
        for(int a=0; a<n; a++){
            if(isLongSeq(a)){
                i++;
            }
        }
        double total = (double)(i/n);
        return total;

    }

    // There may be instance variables, constructors, and methods not shown.
}
