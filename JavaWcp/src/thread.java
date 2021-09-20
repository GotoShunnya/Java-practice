//Thread はコンピューターの処理単位の一つで、これを複数立ち上げることで処理を同時に実行できる。

class MyRunnable implements Runnable{//②Runnableインターフェイスを実装するMyRunnableクラスを作成。
	@Override
	public void run(){//③run	メソッドをオーバーライドして並行処理したい処理を記述。
		for(int i = 1; i <= 500; i++) {
			System.out.print('+');
		}
	}
}


public class thread {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		MyRunnable m = new MyRunnable();//MyRunnableクラスをインスタンス化。
		
		Thread t = new Thread(m);//①Threadクラスをインスタンス化する。④コンストラクタにMyRunnableインスタンスを渡す。
		t.start();//⑤startメソッドを呼び出す。
		
		for(int i = 1; i <= 500; i++) {
			System.out.print('.');
		}

	}

}
