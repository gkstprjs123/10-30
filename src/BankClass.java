import java.util.Scanner;


public class BankClass {
	//�迭����
	public static void main(String[] args) {
		//���ο��� ������ ��������
		Scanner sc=new Scanner(System.in);
		int listCount=3;
		String id[]=new String[100];
		String pw[]=new String[100];
		double account[]=new double[100];
		
		id[0]="a1";id[1]="a2";id[2]="a3";
		pw[0]="a1";pw[1]="a2";pw[2]="a3";
		account[0]=1;account[1]=2;account[2]=3;
		
		String inputId=null;
		String inputPw=null;
		int indexCount=0;
		
		for(;;) {
			System.out.println("���̵�� pw�� �Է��ϼ���");
			System.out.print("���̵�>>");
			inputId=sc.nextLine();
			System.out.print("pw>>");
			inputPw=sc.nextLine();
			
			if(inputId==null) {
				
			}else if(inputId.equals("exit")){
				break;
			}else if(inputId.equals("admin")&&inputPw.equals("admin")) {
				boolean isAdminLogin=true;
				//������ ����
				//1.���� �߰� 2. ���� ���� 3.��� ����� ����Ȯ��
				//4. id�� Ư�� ����� ����Ȯ�� 5.����
				while(isAdminLogin) {
					System.out.println("������ ����");
					System.out.println("1.���� �߰� 2. ���� ���� 3.��� ����� ����Ȯ��");
					System.out.println("4. id�� Ư�� ����� ����Ȯ�� 5.����");
					System.out.println("�޴� �Է�>>");
					int selectNum=Integer.parseInt(sc.nextLine());
					switch(selectNum) {
					case 1:
						System.out.println("�߰� �Ͻ� ���� �Է�");
					    System.out.println("���̵�>>");
					    	id[listCount]=sc.nextLine();
					    System.out.println("pw>>");	
							pw[listCount]=sc.nextLine();
							account[listCount]=0;
							listCount++;
						System.out.println("����ڰ� �߰��Ǿ����ϴ�.");	
						break;
					case 2:
						System.out.println("���� �Ͻ� ���� �Է�");
					    System.out.println("���̵�>>");
					    	String deleteId=sc.nextLine();
					    	int findIndex=-1;
					    	for(int i=0; i<listCount; i++) {
					    		if(id[i].equals(deleteId)) {
					    			findIndex=i;
					    			break;
					    		}
					    	}
					    	if(findIndex<0) {
					    		System.out.println("���� ���̵� �Դϴ�");
					    	}else {
					    		for(int i=findIndex; i<id.length-1; i++) {
					    			id[i]=id[i+1];
						    		pw[i]=pw[i+1];
							    	account[i]=account[i+1];
					    		}
					    		listCount--;
					    		System.out.println("�����Ǿ����ϴ�.");
					    	}				    	
						break;
					case 3:
						System.out.println("��� ����� ���� ���");
						for(int i=0; i<listCount; i++) {
							System.out.println("���̵�>>"+id[i]);
					        System.out.println("pw>>"+pw[i]);
					        System.out.println("account>>"+account[i]);
						}
						if(listCount==0) {
							System.out.println("�����Ͱ� �����ϴ�.");
						}
						break;
					case 4:
						System.out.print("ã���ô� id�� �Է����ּ���>>");
						String findId=sc.nextLine();
						boolean flag=true;
						for(int i=0; i<listCount; i++) {
							if(id[i].equals(findId)) {
								System.out.println("���̵�>>"+id[i]);
						        System.out.println("pw>>"+pw[i]);
						        System.out.println("account>>"+account[i]);
						        flag=false;
						        break;
							}else {
							}
						}
						if(flag) {
							System.out.println("���� ���̵� �Դϴ�");
						}
						break;
					case 5:
						isAdminLogin=false;
						inputId=null;
						break;
					default:System.out.println("�߸��� �Է��Դϴ�");
					}
				}
				
			}else {//�Ϲ� ����� �α���
				// �����ϴ� ����� �ΰ�?
				// �����ϴ� ����� indexCount�� �����ΰ�?
				// �����ϴ� ����� �ΰ�?
				boolean isLogin=false;
				for(int i=0; i<id.length; i++) {
                    if(id[i]!=null&&id[i].equals(inputId)&&pw[i].equals(inputPw)) { //����ڰ� �ִ��� Ȯ���ϴ� ��ġ
                    //if(id[i]!=null&&id[i].equals(inputId)) { //���� �ٲ�� ���� if���̶� �ٸ�
						isLogin=true; //�α����� ��
						indexCount=i;//����ڰ� �������� �����ϴ� ��ġ
						break;
					}
				}
//				System.out.println(indexCount+":"+inputId+":"+id[indexCount]);
				 if(isLogin) {
				 //�α��� ���� 
				 // �����ϴ� ����� indexCount�� �����ΰ�?
					 System.out.println(inputId
							 +"���� �α��� �Ͽ����ϴ�.");
				 while(isLogin) {
				 System.out.println("1.�Ա� 2.��� 3.Ȯ�� 4.����>>");
				 int selectNum=Integer.parseInt(sc.nextLine());
				 switch(selectNum) {
				 case 1:
				    System.out.println("1.�Ա� , �Ա��� �ݾ��� �Է�>>");
				    account[indexCount]
				    		+=Double.parseDouble(sc.nextLine());
				    System.out.println(inputId+
				    		"���� ���� �ݾ�:"+account[indexCount]);       
				    break;
				 case 2:
				    System.out.println("1.��� , ����� �ݾ��� �Է�>>");
					   account[indexCount]
					    		-=Double.parseDouble(sc.nextLine());
					    System.out.println(inputId+
					    	"���� ���� �ݾ�:"+account[indexCount]); 
				    break;
				 case 3:
					 System.out.println(inputId+
					    		"���� ���� �ݾ�:"+account[indexCount]); 
				    break;
				 case 4:
					 System.out.println("�α׾ƿ� �ƽ��ϴ�.");
					 inputId=null;
					 isLogin=false;
				    break;
				 default:
					 System.out.println("�߸��� �Է��Դϴ�.");
				 }
				 }
				 }else {
				   inputId=null;
				 }
				
				
				
			}
		}

	}

}
