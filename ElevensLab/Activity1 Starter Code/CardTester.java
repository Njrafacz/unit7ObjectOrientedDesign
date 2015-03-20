public class CardTester {

/**
* The main method in this class checks the Card operations for consistency.
*	@param args is not used.
*/
public static void main(String[] args) {
/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
Card card1 = new Card("Spades", "Seven", 7);
Card card2 = new Card("Hearts", "Nine", 9);
Card card3 = new Card("Clubs", "Two", 2);
Card card4 = new Card("Spades", "Seven", 7);
card1.suit();
card1.rank();
card1.pointValue();
card1.matches(card2);
if(card1.matches(card4))
{
System.out.println("Yes!");
}
System.out.println(card1.toString());
}
}