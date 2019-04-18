package map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExample {

	public static void main(String[] args) 
	{
		/*Map map=new HashMap();  
	    //Adding elements to map  
	    map.put(1,"Amit");  
	    map.put(5,"Rahul");  
	    map.put(2,"Jai");  
	    map.put(6,"Amit");  
	    //Traversing Map  
	    Set set=map.entrySet();//Converting to Set so that we can traverse  
	    Iterator itr=set.iterator();  
	    while(itr.hasNext()){  
	        //Converting to Map.Entry so that we can get key and value separately  
	        Map.Entry entry=(Map.Entry)itr.next();  
	        System.out.println(entry.getKey()+" "+entry.getValue());  
	    }  */
		
		
		
		/*Map<Integer,String> map=new HashMap<Integer,String>();  
		  map.put(103,"Amit");  
		  map.put(102,"Vijay");  
		  map.put(101,"Rahul");  
		  //Elements can traverse in any order  
//		  for(Map.Entry m:map.entrySet()){  
//		   System.out.println(m.getKey()+" "+m.getValue());  
//		  }  
		//Returns a Set view of the mappings contained in this map        
	      map.entrySet()  
	      //Returns a sequential Stream with this collection as its source  
	      .stream()  
	      //Sorted according to the provided Comparator  
	      .sorted(Map.Entry.comparingByKey())  
	      //Performs an action for each element of this stream  
	      .forEach(System.out::println); */
	      
	      
	      HashSet<String> set=new HashSet();  
          set.add("One");    
          set.add("Two");    
          set.add("Three");   
          set.add("Four");  
          set.add("Five");  
          Iterator<String> i=set.iterator();  
          while(i.hasNext())  
          {  
          System.out.println(i.next());  
          }  

	}

}
