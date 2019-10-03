package chapter5;

public class Mydate {
	private int day;
	private int month;
	private int year;
	private boolean isValid = true;
	
	
	public Mydate(int day, int month, int year) {
		setYear(year);
		setMonth(month);
		setDay(day);
	}
	
	public int getDay() {
		return day;
	}


	public void setDay(int day) {

		switch(month) {
			case 1: case 3: case 5: case 7: case 10:    
				if(day<0 && day>31) {
					isValid = false;
				}else {
					this.day = day;
				}
				break;
			default:
				isValid = false;
		}
		
	}


	public int getMonth() {
		return month;
	}


	public void setMonth(int month) {
		if(month>12 && month<0) {
			isValid = false;
		}else {
			this.month = month;
		}
	}


	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		if(year<0) {
			isValid = false;
		}else {
			this.year = year;
		}
	}


	public String isValid() {
		String msg = "";
		if(isValid) {
			msg = "유효한 날짜입니다.";
		}else {
			msg = "유효하지 않은 날짜입니다.";
		}
		return msg;
	}
	
}
