
public class 프로그램연습 {
	public static java.util.Scanner scanner
	= new java.util.Scanner(System.in);

	public static void main(String[] args) {
		//야식 주문 프로그램을 만들어보자.
		//치킨,족발,피자,닭발,불닭 중 3가지를 선택해 만들어보자.
		int sun=0;
		System.out.println("===무엇을 시켜 먹으시겠습니까?===");
		
	}
	public static int chicken(int sum) {
		String bbq[]= {"후라이드","양념","간장"};
		String bhc[]= {"후라이드","양념","뿌링클"};
		String nene[]= {"후라이드","양념","스노윙"};
		
		
		System.out.println("치킨집을 골라주세요");
		String chicken=scanner.nextLine();
		System.out.println("메뉴를 골라주세요>>");
		switch(chicken) {
		    case "bbq":
		     for(;;) {
				System.out.println("메뉴를 골라주세요>>");
				String chickenMenu=scanner.nextLine();
				switch(chickenMenu) {
				case "후라이드":
					break;
				case "양념":
					break;
				case "간장":
					break;
				default:System.out.println("메뉴가 없습니다 다른 메뉴를 선택해주세요");
				}
				break;
		     }	
			case "bhc":
				break;
			case "nene":
				break;
			}
		    
		return sum;
		
		
	}

}
