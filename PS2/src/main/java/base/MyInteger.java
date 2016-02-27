//Ryan Boedeker
package base;
public class MyInteger {
	private int iValue;
	/**
	 * @param value initial value of iValue
	 */
	public MyInteger(int value){
		this.iValue = value;
	}
	/**
	 * @return iVAlue of MyInteger
	 */
	public int getiValue(){
		return (this.iValue);
	}
	/** 
	 * @param value set to iValue
	 */
	public void setiValue(int value){
		this.iValue = value;
	}
	/**
	 * return true if the specified value is even
	 * @return true if iValue is even, false if iValue is odd
	 */
	public boolean isEven(){
		return (iValue % 2 ==0);
	}
	/**
	 * return true if the specified value is odd
	 * @return true if iValue is odd, false if iValue is even
	 */
	public boolean isOdd(){
		return (iValue % 2 !=0);
	}
	/**
	 * return true if the specified value is prime
	 * @return true if prime, false if not prime
	 */
	public boolean isPrime(){
		if(this.iValue <= 1){
			return false;
		}
		int max = (int) Math.floor(Math.sqrt((double)this.iValue));
		for(int i=2; i <= max; i++){
			if(this.iValue % i == 0){
				return false;
			}
		}
		return true;
	}
	/**
	 * return true if the value in the object is equal to the
	 * specified value
	 * @param value value to test
	 * @return true if iValue equals value, false if not
	 */
	public boolean equals(int value){
		return (this.iValue == value);
	}
	/**
	 * return true if the value in the object is equal to the
	 * specified value
	 * @param otherMyInt other MyInteger
	 * @return true if both of the MyIntegers have the same iValue,
	 * false if not 
	 */
	public boolean equals(MyInteger otherMyInt){
		return (this.iValue == otherMyInt.getiValue());
	}

}