import java.applet.AppletContext;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.asvah.model.Customer;
import com.asvah.service.CustomerService;
import com.asvah.service.CustomerServiceImpl;

public class Application {

	public static void main(String[] args) {
		
		//CustomerService customerService = new CustomerServiceImpl();
		
		ApplicationContext applicatonCtx = new ClassPathXmlApplicationContext("application-context.xml");
		
		CustomerService customerService = applicatonCtx.getBean("customerServiceBean", CustomerService.class);
		
		List<Customer> Customers = customerService.findAll();
		
		for(Customer s : Customers) {
			System.out.println(s.getFirstName());
			System.out.println(s.getLastName());
		}
		
		System.out.println(customerService.findAll().get(0).getFirstName());
		System.out.println(customerService.findAll().size());

	}

}
