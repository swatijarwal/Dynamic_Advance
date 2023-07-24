package in.co.rays.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.List;

import in.co.rays.bean.UserBean;
import in.co.rays.model.UserModel;

public class TestUser {
	public static void main(String[] args) throws Exception {
		//testAdd();
		//testUpdate();
		//testDelete();
		//testFindById();
		testSearch();
		//testSearchByDob();
		//testAuthenticate();
		
	}

	private static void testAuthenticate() throws Exception {
		UserModel model = new UserModel();
		 UserBean bean =     model.authenticate("swatijarwal@gmail.com", "12345");
		 if(bean==null)
		 {
			 System.out.println("not found");
		 }
		 else {
		 System.out.print("\t"+bean.getId());
		 System.out.print("\t"+bean.getFirstName());
		 System.out.print("\t"+bean.getLastName());
		 System.out.print("\t"+bean.getLoginId());
		 System.out.print("\t"+bean.getPassword());
		 System.out.print("\t"+bean.getDob());
		 System.out.println("\t"+bean.getAddress());
		 }
	}

	private static void testSearchByDob() throws Exception {
	   UserBean bean = new UserBean();
	   SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	   bean.setDob(sdf.parse("2000-02-16"));
	   UserModel model = new UserModel();
	   List list=    model.searchByDob(bean);
	Iterator it=   list.iterator();
	while(it.hasNext())
	{
	   bean =	(UserBean) it.next();
	   System.out.print("\t" +bean.getId());
	   System.out.print("\t" +bean.getFirstName());
	   System.out.print("\t" +bean.getLastName());
	   System.out.print("\t" +bean.getLoginId());
	   System.out.print("\t" +bean.getPassword());
	   System.out.print("\t" +bean.getDob());
	   System.out.println("\t" +bean.getAddress());
	   
	}
	       
		
	}

	private static void testSearch() throws Exception {
	   UserBean bean = new UserBean();
	   bean.setFirstName("s");
	   bean.setLastName("j");
	     UserModel model = new UserModel();
	 List list=    model.search(bean, 0, 0);
	Iterator it= list.iterator();
	 while(it.hasNext())
	 {
		 bean= (UserBean) it.next();
		System.out.print("\t" +bean.getId());
		System.out.print("\t" +bean.getFirstName());
		System.out.print("\t" +bean.getLastName());
		System.out.print("\t" +bean.getLoginId());
		System.out.print("\t" +bean.getPassword());
		System.out.print("\t" +bean.getDob());
		System.out.println("\t" +bean.getAddress());
	 }
		
	}

	private static void testFindById() throws Exception {
		UserModel model = new UserModel();
	UserBean bean=	model.findById(3);
	if(bean==null) {
		System.out.println("invelied");
	}
	else
	{
		System.out.print("\t" +bean.getId());
		System.out.print("\t" +bean.getFirstName());
		System.out.print("\t" +bean.getLastName());
		System.out.print("\t" +bean.getLoginId());
		System.out.print("\t" +bean.getPassword());
		System.out.println("\t" +bean.getAddress());
	}
		
	}

	private static void testDelete() throws Exception {
	    UserModel model = new UserModel();
		   model.delete(4);
	}

	private static void testUpdate() throws Exception {
		UserBean bean = new UserBean();
		bean.setFirstName("switi");
		bean.setId(4);
		UserModel model = new UserModel();
		 model.update(bean);
		
	}

	private static void testAdd() throws Exception {
		UserBean bean = new UserBean();
		SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd");
		//bean.setId(4);
		bean.setFirstName("sweta");
		bean.setLastName("patel");
		bean.setLoginId("sweta@gmail.com");
		bean.setPassword("34566");
		bean.setDob(sdf.parse("2000-12-15"));
		bean.setAddress("indore");
		UserModel model = new UserModel();
		model.add(bean);
	}
	

}
