package Problem;

public class p168 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		for(int i=0; i<=23; i++) {
			if(i%10==3) {
				count+=60;
			}
			else {
				for(int j=0; j<=59; j++) {
					if(j/10%10==3)//30�϶�
						count++;
					else if(j%10==3)//���ڸ��� 1�϶�
						count++;
				}
			}
				
		}
		System.out.println(count);
	}

}
