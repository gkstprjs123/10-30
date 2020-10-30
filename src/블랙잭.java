import java.util.Arrays;

public class 블랙잭 {

	public static void main(String[] args) {
		java.util.Scanner scanner=
				new java.util.Scanner(System.in);
		//블랙잭 게임을 만들어보자.
		//플레이어 1,2가 서로 카드를 한장씩 주고 받는다.
		//각자 카드덱에 21이 넘어가면 자동으로 패배
		//카드를 받을지 말지 여부를 결정한다.
		//다른플레이어가 카드를 그만받아도 본인은 더 받을수 있음
		//서로 카드를 안받으면 그때 승,패 결정
		//A는 1또는 11로 플레이어가 변경할수있음
		
		int card[]=new int[52];
		String kind[]= {"♥","♣","♠","◆"};
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
	    System.out.println("♥♣♠◆블랙잭 게임 시작◆♠♣♥");
	    for(;;) {
	    	if(p1Flag) {
	    		System.out.println("====플레이어 1님의 현재 카드====");
	    		for(String i:p1deck) {
	    			if(i!=null) {
	    				System.out.print(i+" ");
	    			}
	    		}
	    		System.out.print("\t총점>>"+sumP1);
	    		System.out.println("");
	    		System.out.print("p1 님 카드를 받으시겠습니까 1.예 2.아니오:");
		    	int yesOrNo=Integer.parseInt(scanner.nextLine());
		    	switch(yesOrNo) {
		    	case 1:
		    		int p1NumIndex=card[cardIndex]%13;
		    		int p1KindIndex=card[cardIndex]/13;
		    		p1deck[p1Index]=kind[p1KindIndex]+cardNum[p1NumIndex];
		    		if(cardNum[0]==cardNum[p1NumIndex]) {
		    			System.out.println("1. A를 1로 적용 2. A를 11로 적용");
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
		    		System.out.println("====플레이어 1님의 받고 난뒤 카드====");
		    		for(String i:p1deck) {
		    			if(i!=null) {
		    				System.out.print(i+" ");
		    			}
		    		}
		    		System.out.print("\t총점>>"+sumP1);
		    		System.out.println("\n");
		    		if(sumP1>21) {
		    			System.out.println("p1님 패배");
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
		    		System.out.println("잘못된 입력");
		    	}
	    	}
	    	if(p2Flag) {
	    		System.out.println("====플레이어 2님의 현재 카드====");
	    		for(String i:p2deck) {
	    			if(i!=null) {
	    				System.out.print(i+" ");
	    			}
	    		}
	    		System.out.print("\t총점>>"+sumP2);
	    		System.out.println("");
	    		System.out.print("p2 님 카드를 받으시겠습니까 1.예 2.아니오:");
		    	int yesOrNo=Integer.parseInt(scanner.nextLine());
		    	switch(yesOrNo) {
		    	case 1:
		    		int p2NumIndex=card[cardIndex]%13;
		    		int p2KindIndex=card[cardIndex]/13;
		    		p2deck[p2Index]=kind[p2KindIndex]+cardNum[p2NumIndex];
		    		if(cardNum[0]==cardNum[p2NumIndex]) {
		    			System.out.println("1. A를 1로 적용 2. A를 11로 적용");
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
		    		System.out.println("====플레이어 2님의 받고 난뒤 카드====");
		    		for(String i:p2deck) {
		    			if(i!=null) {
		    				System.out.print(i+" ");
		    			}
		    		}
		    		System.out.print("\t총점>>"+sumP2);
		    		System.out.println("\n");
		    		if(sumP2>21) {
		    			System.out.println("p2님 패배");
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
		    		System.out.println("잘못된 입력");
		    	}
	    	}
	    	if(noCount==2) {
	    		if(sumP1>sumP2) {
	    			System.out.println("플레이어 1님 승!");
	    			break;
	    		}else if(sumP1==sumP2){
	    			System.out.println("무승부");
	    			break;
	    		}else{
	    			System.out.println("플레이어 2님 승!");
	    			break;
	    		}
	    	}    	
	    }
	}

}
