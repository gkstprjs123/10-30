import java.util.Arrays;

public class ���� {

	public static void main(String[] args) {
		java.util.Scanner scanner=
				new java.util.Scanner(System.in);
		//���� ������ ������.
		//�÷��̾� 1,2�� ���� ī�带 ���徿 �ְ� �޴´�.
		//���� ī�嵦�� 21�� �Ѿ�� �ڵ����� �й�
		//ī�带 ������ ���� ���θ� �����Ѵ�.
		//�ٸ��÷��̾ ī�带 �׸��޾Ƶ� ������ �� ������ ����
		//���� ī�带 �ȹ����� �׶� ��,�� ����
		//A�� 1�Ǵ� 11�� �÷��̾ �����Ҽ�����
		
		int card[]=new int[52];
		String kind[]= {"��","��","��","��"};
		String cardNum[]= {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
		String p1deck[]=new String[10];
	    String p2deck[]=new String[10];
		int cardIndex=0;
		int p1Index=0;
		int p2Index=0;
		int sumP1=0;
		int sumP2=0;
		boolean p1Flag=true;
		boolean p2Flag=true;
		int noCount=0;
			
		for(int i=0; i<card.length; i++) {
			card[i]=i+1;
		}
		
	    for(int i=0; i<card.length; i++) {
	    	int ranN=(int)(Math.random()*card.length);
	    	int temp=0;
	    	temp=card[i];
	    	card[i]=card[ranN];
	    	card[ranN]=temp;
	    }
	    System.out.println("�������ߺ��� ���� ���ۡߢ�����");
	    for(;;) {
	    	if(p1Flag) {
	    		System.out.println("====�÷��̾� 1���� ���� ī��====");
	    		for(String i:p1deck) {
	    			if(i!=null) {
	    				System.out.print(i+" ");
	    			}
	    		}
	    		System.out.print("\t����>>"+sumP1);
	    		System.out.println("");
	    		System.out.print("p1 �� ī�带 �����ðڽ��ϱ� 1.�� 2.�ƴϿ�:");
		    	int yesOrNo=Integer.parseInt(scanner.nextLine());
		    	switch(yesOrNo) {
		    	case 1:
		    		int p1NumIndex=card[cardIndex]%13;
		    		int p1KindIndex=card[cardIndex]/13;
		    		p1deck[p1Index]=kind[p1KindIndex]+cardNum[p1NumIndex];
		    		if(cardNum[0]==cardNum[p1NumIndex]) {
		    			System.out.println("1. A�� 1�� ���� 2. A�� 11�� ����");
		    			int aResult=Integer.parseInt(scanner.nextLine());
		    			switch(aResult) {
		    			case 1:
		    				p1NumIndex=1;
		    				sumP1--;
		    				break;
		    			case 2:
		    				p1NumIndex=11;
		    				sumP1--;
		    				break;
		    			}
		    		}
		    		sumP1+=p1NumIndex+1;
		    		System.out.println("====�÷��̾� 1���� �ް� ���� ī��====");
		    		for(String i:p1deck) {
		    			if(i!=null) {
		    				System.out.print(i+" ");
		    			}
		    		}
		    		System.out.print("\t����>>"+sumP1);
		    		System.out.println("\n");
		    		if(sumP1>21) {
		    			System.out.println("p1�� �й�");
		    			p2Flag=false;
		    			p1Flag=false;
		    			break;
		    		}
		    		p1Index++;		
		    		cardIndex++;
		    		break;
		    	case 2:
		    		p1Flag=false;
		    		noCount++;
		    		break;
		    	default:
		    		System.out.println("�߸��� �Է�");
		    	}
	    	}
	    	if(p2Flag) {
	    		System.out.println("====�÷��̾� 2���� ���� ī��====");
	    		for(String i:p2deck) {
	    			if(i!=null) {
	    				System.out.print(i+" ");
	    			}
	    		}
	    		System.out.print("\t����>>"+sumP2);
	    		System.out.println("");
	    		System.out.print("p2 �� ī�带 �����ðڽ��ϱ� 1.�� 2.�ƴϿ�:");
		    	int yesOrNo=Integer.parseInt(scanner.nextLine());
		    	switch(yesOrNo) {
		    	case 1:
		    		int p2NumIndex=card[cardIndex]%13;
		    		int p2KindIndex=card[cardIndex]/13;
		    		p2deck[p2Index]=kind[p2KindIndex]+cardNum[p2NumIndex];
		    		if(cardNum[0]==cardNum[p2NumIndex]) {
		    			System.out.println("1. A�� 1�� ���� 2. A�� 11�� ����");
		    			int aResult=Integer.parseInt(scanner.nextLine());
		    			switch(aResult) {
		    			case 1:
		    				p2NumIndex=1;
		    				sumP2--;
		    				break;
		    			case 2:
		    				p2NumIndex=11;
		    				sumP2--;
		    				break;
		    			}
		    		}
		    		sumP2+=p2NumIndex+1;
		    		System.out.println("====�÷��̾� 2���� �ް� ���� ī��====");
		    		for(String i:p2deck) {
		    			if(i!=null) {
		    				System.out.print(i+" ");
		    			}
		    		}
		    		System.out.print("\t����>>"+sumP2);
		    		System.out.println("\n");
		    		if(sumP2>21) {
		    			System.out.println("p2�� �й�");
		    			p2Flag=false;
		    			p1Flag=false;
		    			break;
		    		}
		    		p2Index++;	
		    		cardIndex++;
		    		break;
		    	case 2:
		    		p2Flag=false;
		    		noCount++;
		    		break;
		    	default:
		    		System.out.println("�߸��� �Է�");
		    	}
	    	}
	    	if(noCount==2) {
	    		if(sumP1>sumP2) {
	    			System.out.println("�÷��̾� 1�� ��!");
	    			break;
	    		}else if(sumP1==sumP2){
	    			System.out.println("���º�");
	    			break;
	    		}else{
	    			System.out.println("�÷��̾� 2�� ��!");
	    			break;
	    		}
	    	}    	
	    }
	}

}
