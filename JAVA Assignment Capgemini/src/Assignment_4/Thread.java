package Assignment_4;

import java.util.ArrayList;
import java.util.List;

public class Thread implements Runnable,  {

	Thread t;
	List<Integer> list=new ArrayList<Integer>();
	Thread(List<Integer> list){
		t=new Thread(this);
		t.start();
		this.list=list;
	}
	public void run(){
		Consumer<Integer> consumer = (x) -> System.out.println(x);
		this.list.forEach(consumer);
	}

}
