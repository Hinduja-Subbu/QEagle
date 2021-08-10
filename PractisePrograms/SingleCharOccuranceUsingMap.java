package PractisePrograms;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;



public class SingleCharOccuranceUsingMap {

	public static void main(String[] args) {
	
	        String str="Most Welcome";
	        Map<Integer,Character> map=new LinkedHashMap<Integer,Character>();
	        char ch[]=str.toCharArray();
	        for(int i=0;i<ch.length;i++)
	        { 
	            map.put(i,ch[i]);
	        }
	        System.out.println(map);
	        for(Entry<Integer, Character> eachEntry:map.entrySet())
	        {
	            char q=eachEntry.getValue();
	            if(q=='e')
	                System.out.println(q+"-"+eachEntry.getKey() );

	        } 
	}
}


