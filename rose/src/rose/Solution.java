package rose;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Solution {
	public static void main(String args[]) {
		Export export = new Export();
		export.setU_name("roshini");
		export.setS_id("abcdef0987");
		export.setM_id(15);
		export.setD_date(2001-12-05);
		export.setD_address("krishna nagar");
		Hire hire = new Hire();
		hire.setUsername("deepi");
		SessionFactory s = new Configuration().configure().buildSessionFactory();
		Session session = s.openSession();
		session.beginTransaction();
		session.save(contact);
		session.save(contact1);
		session.save(contact2);
		session.getTransaction().commit();
		session.close();

	}

}
