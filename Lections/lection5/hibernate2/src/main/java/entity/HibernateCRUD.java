package entity;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import entities2.Post;
import entities2.PostComment;
import entities3.Post2;
import entities3.PostComment2;

public class HibernateCRUD {
	private SessionFactory sessionFactory;

	public HibernateCRUD() {
	}

	

	protected void setup() {
        // code to load Hibernate Session factory
		this.sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(User.class)
                .addAnnotatedClass(Post.class)
                .addAnnotatedClass(PostComment.class)
                .addAnnotatedClass(Post2.class)
                .addAnnotatedClass(PostComment2.class)
                .buildSessionFactory();
    }
 
    protected void exit() {
        // code to close Hibernate Session factory
    	this.sessionFactory.close();
    }
 
    protected void create(User user) {
        // code to save a user
    	    
        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();
     
        session.save(user);
     
        session.getTransaction().commit();
       
    }
 
    protected void read() {
        // code to get a user
    	Session session = sessionFactory.getCurrentSession();
    	session.beginTransaction();
    	String sql = "from User";                     
        Query query = session.createQuery(sql, User.class);
        List<User> userList = query.getResultList();        
        System.out.println(userList);                
        session.getTransaction().commit();
    }
 
    protected void update(int id, User user) {
        // code to modify a user
    	Session session = sessionFactory.openSession();
        session.beginTransaction();
        User tmp = session.get(User.class, id);
        tmp.setName(user.getName());
        tmp.setAge(user.getAge());
        session.save(tmp);
     
        session.getTransaction().commit();
        session.close();
    }
 
    protected void delete(int id) {
        // code to remove a user
    	Session session = sessionFactory.openSession();
        session.beginTransaction();
     
        session.delete(session.get(User.class, id));
     
        session.getTransaction().commit();
        session.close();
    }
    
    protected void addPost(Post post) {
    	Session session = sessionFactory.openSession();
        session.beginTransaction();
        
        session.save(post);
        
        session.getTransaction().commit();
        session.close();
    }
    
    protected void deletePost(Post post) {
    	Session session = sessionFactory.openSession();
        session.beginTransaction();
        
        session.remove(post);
        
        session.getTransaction().commit();
        session.close();
    }
//    
//    
    protected void addPost2(Post2 post) {
    	Session session = sessionFactory.openSession();
        session.beginTransaction();
        
        session.save(post);
        
        session.getTransaction().commit();
        session.close();
    }
    
    protected void deletePost2(Post2 post) {
    	Session session = sessionFactory.openSession();
        session.beginTransaction();
        
        session.remove(post);
        
        session.getTransaction().commit();
        session.close();
    }
//    
    
}