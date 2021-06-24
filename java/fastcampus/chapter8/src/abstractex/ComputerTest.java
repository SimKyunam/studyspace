package abstractex;

public class ComputerTest {

	public static void main(String[] args) {
		Computer desktop = new DeskTop();
		desktop.display();
		desktop.turnOff();
		
		Computer noteBook = new MyNoteBook(); 
		noteBook.display();
	}

}
