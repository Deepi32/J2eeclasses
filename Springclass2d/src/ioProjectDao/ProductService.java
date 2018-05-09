package ioProjectDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ProductService {
	CustomerDao daoObject;
	public void createproduct(int prodid, String prodname)
	{
		daoObject.insert(prodid, prodname);
	}
	public CustomerDao getDaoObject() {
		return daoObject;
	}
	@Autowired
	public void setDaoObject(@Qualifier("customerOracleDao") CustomerDao daoObject) {
		this.daoObject = daoObject;
	}
	
}
