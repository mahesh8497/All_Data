package companyImpQ;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;

public class ShorcutCollection {

	public static void main(String[] args) {
		System.err.println("ArrayList");
		ArrayList<Integer> a=new ArrayList<Integer>();
		a.add(12);
		a.add(1);
		a.add(13);
		a.add(22);
		System.out.println(a);
		a.clone();
		System.out.println(a);
		//a.clear();
		//System.out.println(a);
		a.isEmpty();
		System.out.println(a.isEmpty());
		a.get(1);
		System.out.println(a.get(0));
		
		System.err.println("HashMap");
		
		HashMap<Integer,String> h=new HashMap<Integer,String>();
		h.put(1, "one");
		System.out.println(h);
		h.clone();
		System.out.println(h);
		h.clear();
		System.out.println(h);
		System.out.println(h.get(0));
		h.putAll(h);
		System.out.println(h);
		System.out.println();
		System.err.println("TreeMap");
		
		
		TreeMap<Integer, String> r=new TreeMap<Integer, String>();
		r.put(12, "a");
		r.put(11, "b");
	System.out.println(r);
	r.clone();
	System.out.println(r);
		 r.clear();
		 System.out.println(r);
		 LinkedList<Integer> m=new LinkedList<Integer> ();
		 System.err.println("LinkedList");
		 m.add(12);
		 m.add(11);
		 m.clone();
		 System.out.println(m);
		 System.out.println(m);
		 m.clear();
		// m.isEmpty()
		 System.out.println(m.isEmpty());
		 System.err.println("HashSet");
	HashSet<Integer> k=new  HashSet<Integer>();
		k.add(17);
		k.add(13);
		k.add(12);
		System.out.println(k);
		System.out.println(k.clone());
		k.clear();
		System.out.println(k);
		System.err.println("LinkedHashSet");
		LinkedHashSet<Integer> u=new LinkedHashSet<Integer>();
		u.add(16);
		u.add(14);
		u.add(12);
		System.out.println(u);
		u.clone();
		System.out.println(u);
		
		System.err.println("TreeSet");
		TreeSet<Integer> p=new 	TreeSet<Integer>();
		p.add(12);
		p.add(17);
		p.add(15);
		p.add(11);
		System.out.println(p);
		//p.first();
		System.out.println(p.first());
		//p.ceiling(12)
		System.out.println(p.ceiling(14));
		p.descendingIterator();
		System.out.println(p);
		System.err.println("Vector");
		Vector<Integer>ee= new Vector<Integer>();
		ee.add(12);
		ee.add(-1);
		ee.add(13);
//		System.out.println(ee);
//		ee.copyInto(null);
//		System.out.println(ee);
		ee.remove(2);
		System.out.println(ee);
		System.out.println(ee.capacity());
		
		
		
		Stack<Integer> w=new Stack<Integer>();
		w.push(121);
		w.push(12);
		System.out.println(w);
		
	}

}
