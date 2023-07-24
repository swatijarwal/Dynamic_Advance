package in.co.rays.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import in.co.rays.bean.StudentBean;
import in.co.rays.model.StudentModel;
import java.util.*;
public class TestStudent {

	public static void main(String[] args) throws Exception {
	//	testAdd();
		//testUpdate();
		//testDelete();
		//testFindByRoll();
		testSearch();

	}

	private static void testSearch() throws Exception {
		
		StudentBean bean = new StudentBean();
		  bean.setId(3);
          bean.setName("s");
          StudentModel model = new StudentModel();
		       List list=  model.search(bean);
		    Iterator it=      list.iterator();
		    while(it.hasNext())
		    {
		            bean= (StudentBean) it.next();
		    	 System.out.println(bean.getId());
				   System.out.println(bean.getName());
				   System.out.println(bean.getLoginId());
				   System.out.println(bean.getPassword());
				   System.out.println(bean.getDob());
				   System.out.println(bean.getAddress());
		    	
		    }
	}

	private static void testFindByRoll() throws Exception {
		StudentModel model = new StudentModel();
		   StudentBean bean=      model.findByRoll(2);
		   if(bean==null)
		   {
			   System.out.println("invalied");
		   }
		   else
		   {
			   System.out.println(bean.getId());
			   System.out.println(bean.getName());
			   System.out.println(bean.getLoginId());
			   System.out.println(bean.getPassword());
			   System.out.println(bean.getDob());
			   System.out.println(bean.getAddress());
		   }
		
	}

	private static void testDelete() throws Exception {
		StudentBean bean = new StudentBean();
		StudentModel model = new StudentModel();
		model.delete(1);
		
	}

	private static void testUpdate() throws Exception{
		StudentBean bean = new StudentBean();
		bean.setName("mridula");
	     bean.setId(1);
		StudentModel model = new StudentModel();
		model.update(bean);
		
		
		
	}

	private static void testAdd() throws Exception {

		StudentBean bean = new StudentBean();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		bean.setId(4);
		bean.setName("swati");
		bean.setLoginId("swati@gmail.com");
		bean.setPassword(12345);
		bean.setDob(sdf.parse("2000-02-16"));
		bean.setAddress("indore");
		StudentModel model = new StudentModel();
		model.add(bean);

	}
}