package day7;

import java.util.*;
class ArrayListOp 
{
public ArrayList<Integer> makeArrayListInt(int n)
	 {
		ArrayList<Integer> mlist=new ArrayList<Integer>(n);
		for(int i=0;i<n;i++) 
		{
			mlist.add(i);
		}
		return mlist;
	}
	public ArrayList<Integer> reverseList(ArrayList<Integer> rlist) 
	{
		ArrayList<Integer> list2=new ArrayList<Integer>();
		for(int i=rlist.size()-1;i>=0;i--) 
		{
			list2.add(rlist.get(i));
		}
		return list2;
	}
	public ArrayList<Integer> changeList(ArrayList<Integer>list2,int m, int n) 
	{
		int index=0;
		for(Integer i:list2)
		 {
			if(i==m) 
			{
				list2.set(n,i);
				index++;
}
			else 
			{
				index++;
			}
		}
		return list2;
	}
}
public class Problem1{
	public static void main(String[] args)
	 {
		Scanner scanner=new Scanner(System.in);
		ArrayListOp obj=new ArrayListOp();
		//int input=scanner.nextInt();
		ArrayList<Integer> mlist=obj.makeArrayListInt(6);
		ArrayList<Integer>list=new ArrayList<Integer>(Arrays.asList(10,25,33,28,10,12));
	ArrayList<Integer> rlist=obj.reverseList(list);
		//int m=scanner.nextInt();
		//int n=scanner.nextInt();
		ArrayList<Integer>clist =obj.changeList(rlist, 25, 4);
		System.out.println(mlist);
		System.out.println(rlist);
		System.out.println(clist);
		scanner.close();

	}
}
