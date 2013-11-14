public class CardVerify{
	Card card = new Card();
	
	void cardSet(String cardNum){
		int index;
		for(index = 1; index < 16 ; index ++){
			card.setCard_Number(index-1,Integer.parseInt(cardNum.substring(index-1, index)));
		}
		card.setCard_Number(15,Integer.parseInt(cardNum.substring(15)));
	}

	public boolean verify() {
		return (cal_digitSum() % 10 == 0);
	}

	//TODO after test, private.
	public int cal_digitSum() {
		int index;
		int digitSum = 0;
		boolean isEven = false;
		for(index = 15; index >= 0 ; index--){
			digitSum += cal_digit(index, isEven);
			isEven = !isEven;
		}
		return digitSum;
	}

	//TODO  after test, private.
	public int cal_digit(int index, boolean isEven) {
		int checkNum;
		checkNum = card.getCard_Number(index);
		if(isEven)//evendigit cadrNumber
			checkNum *= 2;
		if(checkNum >= 10)//
			checkNum = (checkNum%10) + 1;
		return checkNum;
	}
}