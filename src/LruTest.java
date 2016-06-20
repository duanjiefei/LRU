import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;


public class LruTest {
	
	
	
	public static void main(String[] args) {
		
    //构造一个带指定初始容量、加载因子和排序模式的空 LinkedHashMap 实例	
	LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>(0,0.25f,true);
	
	map.put(1, 11);
	map.put(2, 12);
	map.put(3, 13);
	map.put(4, 14);
	map.put(5, 15);
	
	Set<Entry<Integer, Integer>>  set  =   map.entrySet();
	
	Iterator<Entry<Integer, Integer>> iterator =  set.iterator();
	
	while(iterator.hasNext()){
		
		Entry<Integer, Integer> next = iterator.next();
		System.out.println("key=="+next.getKey()+"value=="+next.getValue());
	}
	
	
	map.get(5);
	map.get(4);
	map.get(3);
	map.get(2);
	

	
	map.get(4);
	map.get(3);
	map.get(2);
	
	map.get(3);
	map.get(2);
	
	map.get(2);
	map.get(5);
	map.get(1);
	
	Set<Entry<Integer, Integer>>  set1  =   map.entrySet();
	
	Iterator<Entry<Integer, Integer>> iterator1 =  set1.iterator();
	
	while(iterator1.hasNext()){
		
		Entry<Integer, Integer> next1 = iterator1.next();
		System.out.println("key=="+next1.getKey()+"value=="+next1.getValue());
	}
	
	}

}
