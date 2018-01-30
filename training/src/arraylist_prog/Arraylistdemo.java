package arraylist_prog;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Collections;
import java.util.Iterator;

public class Arraylistdemo 
{
	public static void main (String [] args)
	{
	ArrayList<String> list = new ArrayList <String>();
	ArrayList<String> list1 = new ArrayList <String>();
	HashSet<String> hs = new HashSet<String>();
	
	hs.add("Anupam");
	hs.add("Anupam");
	hs.add("Deepika");
	
	list.add("Java");
	list.add("Java");
	//list.add("C++");
	list.add("PHP");
	
	list1.add("Amrit");
	list1.add("Deepika");
	list1.add("Yatin");
	
	list.addAll(list1);
	list.remove(4);
	
	hs.addAll(list);
	
	Iterator itr = list.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	
	Collections.sort(list);
	for(String al:list)
	{
		System.out.println(al);
	}
	}
}
