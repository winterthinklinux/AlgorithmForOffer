package baidu;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class OneUseTreeSet {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNextInt()){
			int n = scanner.nextInt();
			Set<Integer> set =  new TreeSet<>();
			for(int i=0;i<n;i++)
				set.add(scanner.nextInt());
			//TreeSet����ͨSet��ʲô����
			//set�ı�����ȡֵ��list��ʲô����
			Iterator<Integer> iterator  =set.iterator();
			int i=0;
			while(iterator.hasNext()){
				int temp = iterator.next();
				i++;
				if(i==3){
					System.out.println(temp);
					break;
				}
			}
			if(i<3){
				System.out.println(-1);
			}	
		
		}
	}
}
