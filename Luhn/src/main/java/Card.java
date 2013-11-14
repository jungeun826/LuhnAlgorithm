
public class Card{
	int[] card_Number = new int[16];

	public int getCard_Number(int cardIndex) {
		return card_Number[cardIndex];
	}

	public void setCard_Number(int cardIndex, int card_Number) {
		this.card_Number[cardIndex] = card_Number;
	}
}
/*public class Card{
	ArrayList<Integer> card_Number = new ArrayList<Integer>();

	public ArrayList<Integer> getCard_Number() {
		return card_Number;
	}

	public void setCard_Number(ArrayList<Integer> card_Number) {
		this.card_Number = card_Number;
	}
	
	public ArrayList<Integer> getCard_Number(int cardIndex) {
		
		return card_Number;
	}

	public void setCard_Number(int cardIndex,ArrayList<Integer> card_Number) {
		this.card_Number = card_Number;
	}
}*/