/** Roberto Andino
 *  File: Term.java
 *  Represent a term in an algebraic expression
 *  Has constructor that creates a Term object with a coefficient and exponent
 *  passed as parameter, get methods that return the coefficient and exponent,
 *  overridden toString to return a Term in general from of ax^b with special
 *  cases
 *
 *  I affirm that this program is entirely my own work and none of it is the
 *  work of any other person.
 */

public class Term {

    protected int coe; //To set coefficient
    protected int exp; //To set exponent

    /**
     * Creates Term object
     *
     * @param coe Coefficient passed
     * @param exp Exponent passed
     */
    public Term(int coe, int exp) {

        this.coe = coe;
        this.exp = exp;
    }

    /**
     * Method to return Coefficient
     *
     * @return Coefficient
     */
    public int getCoe() {
        return coe;
    }

    /**
     * Method to return exponent
     *
     * @return exponent
     */
    public int getExp() {
        return exp;
    }

    /**
     * Return a term in form of ax^b, where a is coe and b is exp With special
     * cases: if(a = 1 && b = 1) return x, else if(a = 1) return x^b, else if(b
     * = 1) return ax.
     *
     * @return x if a = 1 and b = 1, return x^b if a = 1, return ax if b = 1.
     */
    public String toString() {

        if (this.coe == 1 && this.exp == 1) {
            return "x";
        }
        if (this.coe == 1) {
            return "x^" + this.exp;
        }
        if (this.exp == 1) {
            return this.coe + "x";
        }
        if (this.exp == 0) {
            return this.coe + "";
        }
        return this.coe + "x^" + this.exp;
    }

}//End of Term class
