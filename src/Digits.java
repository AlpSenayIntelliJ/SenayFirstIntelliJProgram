import java.util.ArrayList;

import static java.lang.Integer.parseInt;

public class Digits
{
    /** The list of digits from the number used to construct this object.
     *  The digits appear in the list in the same order in which they appear in the original number.
     */
    private ArrayList<Integer> digitList;

    /** Constructs a Digits object that represents num.
     *  Precondition: num >= 0
     */
    public Digits(int num)
    {
        digitList = new ArrayList<Integer>();
        if (num == 0) {
            digitList.add(new Integer(0));
        }
        while (num > 0) {
            digitList.add(0, new Integer(num % 10));
            num /= 10;
        }
    }

    /** Returns true if the digits in this Digits object are in strictly increasing order;
     *  false otherwise.
     */
    public boolean isStrictlyIncreasing()
    {
        for (int i = 0; i < digitList.size()-1; i++) {
            if (digitList.get(i+1) <= digitList.get(i)) {
                return false;
            }
        }
        return true;
    }

    // GETTER METHOD: added to enable test code (not provided/needed in original FRQ)
    public ArrayList<Integer> getDigitList()
    {
        return digitList;
    }
}