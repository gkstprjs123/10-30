
public class ���α׷����� {
	public static java.util.Scanner scanner
	= new java.util.Scanner(System.in);

	public static void main(String[] args) {
		//�߽� �ֹ� ���α׷��� ������.
		//ġŲ,����,����,�߹�,�Ҵ� �� 3������ ������ ������.
		int sun=0;
		System.out.println("===������ ���� �����ðڽ��ϱ�?===");
		
	}
	public static int chicken(int sum) {
		String bbq[]= {"�Ķ��̵�","���","����"};
		String bhc[]= {"�Ķ��̵�","���","�Ѹ�Ŭ"};
		String nene[]= {"�Ķ��̵�","���","������"};
		
		
		System.out.println("ġŲ���� ����ּ���");
		String chicken=scanner.nextLine();
		System.out.println("�޴��� ����ּ���>>");
		switch(chicken) {
		    case "bbq":
		     for(;;) {
				System.out.println("�޴��� ����ּ���>>");
				String chickenMenu=scanner.nextLine();
				switch(chickenMenu) {
				case "�Ķ��̵�":
					break;
				case "���":
					break;
				case "����":
					break;
				default:System.out.println("�޴��� �����ϴ� �ٸ� �޴��� �������ּ���");
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
