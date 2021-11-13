package Problem;

public class p280 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] friends= {"Jay", "Hee", "Chris","Jani"};
		String[] schools= {"SNU", "YS", "KOR", "KAIST"};
		int[] Rnum= {14,16,17,16};
		String[] Friends_data =new String[4];
		for(int i=0; i<Friends_data.length;i++) {
			Friends_data[i]=String.format("%s는 %s의 %d학번입니다.", friends[i],schools[i], Rnum[i]);
		}
		for(String e : Friends_data) {
			System.out.println(e);
		}
	}

}
