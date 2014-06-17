package walter.test.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class testCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List l1 = Arrays.asList(115,121,131,141,54,32143,145,1);
				
		List l2 = Arrays.asList("zix_url","zix_as_no","zix_bc_contact_phone","zix_bc_email","zix_bc_name","zix_bill_commencement_date","zix_bill_freq","zix_cc_contact_phone","zix_cc_email","zix_cc_name","zix_contract_date","zix_contract_no","zix_correspondence_addr","zix_currency","zix_cust_id","zix_cust_name","zix_invoice_issue_date","zix_invoice_no","zix_monthly_charge","zix_invoice_paymnt_due_date","zix_receipt_issue_date","zix_receipt_no","zix_ref_no","zix_req_service_date","zix_service_order_desc","zix_service_period","zix_statemnt_issue_date","zix_statemnt_paymnt_due_date","zix_tc_contact_phone","zix_tc_email","zix_tc_name","zix_total_one_off_charge");
		
		Collections.sort(l1);
		System.out.println(l1);
		
		System.out.println(l2);
		Collections.sort(l2);
		System.out.println(l2);
		
		List<Student> l3 = new ArrayList<Student>();
		l3.add(new Student("Walter", "S01"));
		l3.add(new Student("Peter", "S03"));
		l3.add(new Student("John", "S02"));
		l3.add(new Student("Joey", "S02"));
		l3.add(new Student("Johna", "S02"));
		
		System.out.println(l3);
		Collections.sort(l3);
		System.out.println(l3);
	}
	
	

}
