package lambda.expression.noparam;

public class Buttonrun {

	public static void main(String[] args) {
		// OK버튼 객체 생성
		Button btnOK = new Button();
		// OK버튼 객체에 람다식(ClickListener 익명객체) 주입
		btnOK.setClickListener(()->System.out.println("ok버튼을 클릭함"));
		// OK버튼 클릭하기
		btnOK.click();
		
		// cancel 버튼 객체 생성
		Button btnCancel = new Button();
		btnCancel.setClickListener(()->System.out.println("cancel 버튼을 클릭함"));
		btnCancel.click();
	}

}
