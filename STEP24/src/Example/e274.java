package Example;

public class e274 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names = {"DORI","DOOLI","DOMI"};
		int[] grade = {97,78,83};
		
		String[] datas =new String[names.length];
		for(int i=0; i<3; i++) {
			datas[i]=String.format("%sÀÇ Á¡¼ö : %d", names[i], grade[i]);
		}
		
		for(String e : datas)
			System.out.println(e);
	}

}
