package week01;

import java.util.*;

public class B_Tree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    List<Integer> tree = new ArrayList<Integer>();
	    Scanner scan = new Scanner(System.in);
	    indexCal c = new indexCal();
	    
	    int h = scan.nextInt();
	    
	    int size = (int)Math.pow(2, h+1)-2;//size
	    int extSize = (int)Math.pow(2,h);//external node's edge size 
	    
	    for (int x = 0; x < size; x++) //input
	    	tree.add(scan.nextInt());
	    
	    int Max = 0;

	    for(int i=0;i<extSize;i++){
	    	int tmp=0;
		    int idx =size-1-i;
	    	for(int j=0;j<h;j++){
	    		tmp+=tree.get(idx);
	    		if(idx%2==1)
	    			idx =c.parIndex(idx);
	    		else
	    			idx=c.parIndex(idx);
	    	}
	    	if(tmp>Max)
	    		Max = tmp;
	    }

	    for(int i=h;i>0;i--){
	    	
	    	for(int j=(int)Math.pow(2,h);j>Math.pow(2, h-1);j=j-2){
	    		if(tree.get(j-1)>tree.get(j-2))
	    			tree.set(j-2, tree.get(j-1));
	    		else
	    			tree.set(j-1, tree.get(j-2));
	    	}
	    	
	    }
	    
	    for(int i=0;i<extSize;i++){
	    	
	    }
	    Max = Max*extSize;
	    


	    int result=Max;
	    for(int idx=size-extSize;idx>-1;idx--){
	    	result-=tree.get(idx);
	    }
	    
	    	
	    System.out.println(Max+"is Max");
	   
	    

	}

	int parIndex(int i){
		int result;
		return result;
	}
}
