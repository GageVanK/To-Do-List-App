package javaClasses;

import java.util.ArrayList;

public class ToDoMethods {
	//ArrayList of Strings for storing todo items
	static ArrayList<String> todo = new ArrayList<String>(); 

	//function for adding item
	public static String addItem(String item){ 
			todo.add(item);
	        return item;
	}
	
	
	//function for deleting item
	public void deleteItem(int num){ 
	        todo.remove(num);
	}
	
	//function for listing all itemsToDoList todo=new ToDoList();ToDoList todo=new ToDoList();
	public void listAll(){ 
	        for (int i = 0; i < todo.size(); i++) {
	      System.out.println((i+1)+"."+todo.get(i));
	    }
	        }
}
