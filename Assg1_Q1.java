package Assignment;


class QuestionOne{
	public void solve() {
		for(int i=1;i<=5;i++) {
			for(int j=1; j<=35; j++) {
				if(j==1 || j==3 || j==7 || j==9 || (j==14 && i<5) || (j==18 && i<5) || j==20 || j==31 || j==35 || i==j-2 || i==j-31 || ((j>9 && j<=12) && (i==1 || i==3 || i==5)) || ((i==5)  && (j>14 && j<18)) || ((i==1 || i==3) &&(j>20 && j<23)) || i>2 && (i-2 == j-20) || (i==2 && j==23) || ((j==25 || j==29) && i>1 && i<5) || ((j>25 && j<29) && (i==1 || i==5))) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}		
	}	
}


class QuestionTwo{
	public void solve() {
		for(int i=1;i<=4;i++) {
			for(int j=1; j<=4; j++) {
				System.out.print(i);
			}
			System.out.println();
		}		
	}
}

class QuestionThree{
	public void solve() {
		int side = 14;
		for(int i=1; i<=side; i++) {
			for(int j=1; j<=side; j++) {
				if(i==1 || j==1 || i==side || j==side || i+j<=side/2 || j-i>=side/2) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}

class QuestionFour{
	public void solve() {
		int side = 14;
		for(int i=1; i<=8; i++) {
			for(int j=1; j<=side; j++) {
				if(j==1 || i==8 || j==side || i>=j || i>=side-j+1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}

class QuestionFive{
	public void solve() {
		int side = 14;
		for(int i=1; i<=side; i++) {
			for(int j=1; j<=side; j++) {
				if(i==1 || j==1 || i==side || i+j<=side/2+1 || i-j>=side/2) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}	
}

public class Assg1_Q1 {
	public static void main(String args[]) {
		
		new QuestionOne().solve();
		
		System.out.println();

		new QuestionTwo().solve();
		
		System.out.println();
		
		new QuestionThree().solve();
		
		System.out.println();
		
		new QuestionFour().solve();
		
		System.out.println();
		
		new QuestionFive().solve();		
		
	}
}
