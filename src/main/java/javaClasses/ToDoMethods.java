package javaClasses;

import java.util.ArrayList;

public class ToDoMethods {
	static ArrayList<String> todo = new ArrayList<String>(); //ArrayList of Strings for stroing todo Item

	public static String addItem(String item){ //function for adding item
			todo.add(item);
	        return item;
	}

	public void deleteItem(int num){ //function for deleting item
	        todo.remove(num);
	}
	        
	public void listAll(){ //function for listing all itemsToDoList todo=new ToDoList();ToDoList todo=new ToDoList();
	        for (int i = 0; i < todo.size(); i++) {
	      System.out.println((i+1)+"."+todo.get(i));
	    }
	        }
}
