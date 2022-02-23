package entity;

import org.hibernate.Session;

import entities2.Post;
import entities2.PostComment;
import entities3.Post2;
import entities3.PostComment2;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HibernateCRUD hcrud = new HibernateCRUD();
		hcrud.setup();
//		hcrud.create(new User(1,"Roman",49));
//		hcrud.update(1, new User(0, "Olga", 23));	
//		hcrud.delete(2);
//		hcrud.read();
		
		
		// One-To-Many option1		
		
		Post post = new Post("First post");
		 
		post.getComments().add(
		    new PostComment("My first review")
		);
		post.getComments().add(
		    new PostComment("My second review")
		);
		post.getComments().add(
		    new PostComment("My third review")
		);
		 
		hcrud.addPost(post);
		hcrud.deletePost(post);
		
		
		// One-To-Many option2
		
		
		Post2 post2 = new Post2("First post");
		 
		post2.getComments().add(
		    new PostComment2(post2,"My first review")
		);
		post2.getComments().add(
		    new PostComment2(post2,"My second review")
		);
		post2.getComments().add(
		    new PostComment2(post2,"My third review")
		);
		
		hcrud.addPost2(post2);
//		hcrud.deletePost2(post2);
				
		hcrud.exit();

	}

}
