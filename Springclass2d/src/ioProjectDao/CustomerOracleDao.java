package ioProjectDao;

import org.springframework.stereotype.Component;

@Component
public class CustomerOracleDao implements CustomerDao {

	@Override
	public void insert(int prodid, String prodname) {
		System.out.println("Product id is :"+prodid+"name is :"+prodname);
	}

}
