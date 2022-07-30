package max.controller;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.classic.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RegisterDAO {

	@Autowired
	SessionFactory sessionFactory;
	
	public List<StateBean> getState() {
		Session s = sessionFactory.openSession();
		Transaction tx = s.beginTransaction();
		Criteria cr = s.createCriteria(StateBean.class);
		List<StateBean> list = cr.list();
		System.out.println(list);
		return list;
	}
	
	
	
	public List<DistBean> getDistList(String state_code) {
		Session s = sessionFactory.openSession();
		Transaction tx = s.beginTransaction();
		Criteria cr = s.createCriteria(DistBean.class);
		cr.add(Restrictions.eq("state_code", state_code));
		List<DistBean> list = cr.list();
		tx.commit();
		System.out.println(list);
		return list;
	}
}
