package packt;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class CustomerManager
 */
@Stateless
@LocalBean
public class CustomerManager {

    /**
     * Default constructor. 
     */
    public CustomerManager() {
        // TODO Auto-generated constructor stub
    }
    
    public int getCustomerCount() {
    	return 127;
    }
    
    public int getCustomerCountByRegion(String region) {
    	if (region.equals("West")) {
    		return 84;
    	} else if (region.equals("East")) {
    		return 43;
    	} else {
    		return 0;
    	}
    }
    
    

}
