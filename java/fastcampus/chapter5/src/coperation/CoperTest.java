package coperation;

public class CoperTest {

	public static void main(String[] args) {
		Student lee = new Student("Lee", 5000);
		Student sim = new Student("sim", 10000);
		
		Texi texi1000 = new Texi(1000);
		
		lee.tranTexi(texi1000, 1000);
		sim.tranTexi(texi1000, 2000);
		
		
		texi1000.showInfo();
		lee.showInfo();
		sim.showInfo();
	}

}
