package com.raju.ds.stacks;

import java.util.Stack;

public class NGE {
	
	public static void print(int[] a)
	{
		Stack<Integer> stack=new Stack<Integer>();
		
		if(a.length>0)
		stack.push(a[0]);
		
		
		for(int i=1;i<a.length;i++)
		{
			
			int next=a[i];
			
			if(stack.isEmpty()==false)
			{
				int element=stack.pop();
				
				while(element<next) {
				
				System.out.println(element+" -> "+next);
				
				 if(stack.isEmpty()==true)
				 {
					 break;
				 }
				 element=stack.pop();
				
				}
				if (element > next) 
				 stack.push(element);
			}
			
				stack.push(next);
			
			
		}
		
		while(stack.isEmpty()==false)
		{
			 
			System.out.println(stack.pop()+" "+ "-1");
			
		}
		
		
		
		
		
	}

	public static void main(String[] args) {

    
		int a[]= {11,13,0,21,3,15};
		
		print(a);
		
		
	}

}
