// time : 0(n)
// space : 0(n)  the number of variable which is declared by us   
//print the first duplicate
package com.datastructure;

import java.util.HashMap;

public class copyOne 
{
   public static void main(String[] args) 
   {
	  HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
	  int[] arr = new int[] {3,4,1,4,1};
	  for(int i : arr)
	  {
		  if(hm.get(i) == null)
		  {
			  hm.put(i,1);
		  }
		  else
		  {
			  hm.put(i,hm.get(i)+1);
		  }
	  }
//3:1,4:2,1:2
	
	  System.out.println(hm);
	  for(int i : hm.keySet())
	  {
		  if(hm.get(i)>1)
		  {
			  System.out.println(i);
			  return i;
		  }
	  }
	  return -1;
	
   }
}
