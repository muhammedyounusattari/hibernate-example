package main.configuration;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import main.pojo.Employee;

public class MainClass {

	public static void main(String[] args) {

		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");

		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		
		Employee employee = new Employee();
		employee.setId(123);
		employee.setEmpName("Hello, Hi");
		employee.setEmpDesig("Manager");
		employee.setEmpSal(12345.4d);
		
		Transaction transaction = session.beginTransaction();
		session.save(employee);
		transaction.commit();
		
	}
}
