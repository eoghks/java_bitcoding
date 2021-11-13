package Promblem;

import java.util.ArrayList;
import java.util.Scanner;

public class p289 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a= new ArrayList();
		Scanner input= new Scanner(System.in);
		
		while(true) {
			System.out.print("Enter the name : ");
			String str=input.next();
			if(str.equals("-1"))
				break;
			a.add(str);
		}
		System.out.println(a.toString());
		
		int idex=0;
		for(int i=0;i<a.size();i++) {
			if(((String) a.get(idex)).length() > ((String) a.get(i)).length())
				idex=i;
		}
		
		System.out.println(a.get(idex));
	}

}
