package blackjack2;

public class Main implements Runnable {
	

	GUI gui = new GUI();

	public static void main(String[] args) {
		new Thread( new Main() ).start();
	}

	@Override
	public void run() {
		// TODO 自動生成されたメソッド・スタブ
		
	}
}
