//ジェネリックスを使う

class MyData<T>{//汎用化する方を<T>と表現。これでどのデータにも対応したクラスができた。
		public void data(T x) {
			System.out.println(x);
		}
	}


public class generics {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		MyData<String> s = new MyData<>();//インスタンス生成時に方を指定してあげる。例: <String> ←参照型でないとエラーになるので注意。
		s.data("String");
		
		MyData<Integer> i = new MyData<>();
		i.data(55);

	}

}
