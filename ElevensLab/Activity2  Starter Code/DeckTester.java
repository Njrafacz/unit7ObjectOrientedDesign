/**
* This is a class that tests the Deck class.
*/
public class DeckTester {

/**
* The main method in this class checks the Deck operations for consistency.
* @param args is not used.
*/
public static void main(String[] args) {
/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
String[] ranks = {"One", "Two", "Three", "Four"};
String[] suits = {"Hearts", "Spades", "Clubs", "Diamonds"};
int [] values = {1,2,3,4};
Deck deck1 = new Deck(ranks,suits,values);
if(deck1.isEmpty())
{
System.out.println("The deck is empty!");
}
deck1.size();
for(int i =0; i <=16; i++)
{
deck1.deal();
}
if(deck1.isEmpty())
{
System.out.println("The deck is empty!");
}
}
}