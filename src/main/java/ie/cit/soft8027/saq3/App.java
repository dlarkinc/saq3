package ie.cit.soft8027.saq3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ie.cit.soft8027.saq3.domain.Editor;
import ie.cit.soft8027.saq3.domain.Newspaper;

public class App {

	private static ApplicationContext context;	
	
	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext("app-beans.xml");
		
		Newspaper news = context.getBean(Newspaper.class);
		
		System.out.println(news.getTitle());
		
		for (Editor e : news.getEditors()) {
			System.out.println(e.toString());
		}
		
	}

}
