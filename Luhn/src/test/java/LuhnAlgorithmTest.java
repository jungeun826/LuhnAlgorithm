
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
//롤백기능 - 테스트 전에 넣고 끝나면 빼줌........
//@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class LuhnAlgorithmTest {

	private CardVerify cardVerify;
	@Before
	public void setUp() throws Exception {
		cardVerify = new CardVerify();
		cardVerify.cardSet("9440810003819258");
	}
	
	@Test
	public void CardNumberTest() {
		assertEquals(9,cardVerify.card.getCard_Number(0));
		assertEquals(4,cardVerify.card.getCard_Number(1));
		assertEquals(4,cardVerify.card.getCard_Number(2));
		assertEquals(0,cardVerify.card.getCard_Number(3));
		assertEquals(8,cardVerify.card.getCard_Number(4));
		assertEquals(1,cardVerify.card.getCard_Number(5));
		assertEquals(0,cardVerify.card.getCard_Number(6));
		assertEquals(0,cardVerify.card.getCard_Number(7));
		assertEquals(0,cardVerify.card.getCard_Number(8));
		assertEquals(3,cardVerify.card.getCard_Number(9));
		assertEquals(8,cardVerify.card.getCard_Number(10));
		assertEquals(1,cardVerify.card.getCard_Number(11));
		assertEquals(9,cardVerify.card.getCard_Number(12));
		assertEquals(2,cardVerify.card.getCard_Number(13));
		assertEquals(5,cardVerify.card.getCard_Number(14));
		assertEquals(8,cardVerify.card.getCard_Number(15));
	}
	
	@Test
	public void digitCalTest() {
		assertEquals(8,cardVerify.cal_digit(15, false));
		assertEquals(1,cardVerify.cal_digit(14, true));
		assertEquals(2,cardVerify.cal_digit(13, false));
		assertEquals(9,cardVerify.cal_digit(12, true));
		assertEquals(1,cardVerify.cal_digit(11, false));
		assertEquals(7,cardVerify.cal_digit(10, true));
		assertEquals(3,cardVerify.cal_digit(9, false));
		assertEquals(0,cardVerify.cal_digit(8, true));
		assertEquals(0,cardVerify.cal_digit(7, false));
		assertEquals(0,cardVerify.cal_digit(6, true));
		assertEquals(1,cardVerify.cal_digit(5, false));
		assertEquals(7,cardVerify.cal_digit(4, true));
		assertEquals(0,cardVerify.cal_digit(3, false));
		assertEquals(8,cardVerify.cal_digit(2, true));
		assertEquals(4,cardVerify.cal_digit(1, false));
		assertEquals(9,cardVerify.cal_digit(0, true));
	}
	
	
	@Test
	public void CardTest() {
		assertEquals(true,cardVerify.verify());
	}
	
	@Test
	public void digitSumTest(){
		assertEquals(60, cardVerify.cal_digitSum());
	}

}
