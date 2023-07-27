package in.co.rays.test;

import java.util.*;


import in.co.rays.bean.MarksheetBean;
import in.co.rays.model.MarksheetModel;

public class TestMarksheet {
	public static void main(String[] args) throws Exception {
		testAdd();
		//testUpdate();
		//testDelete();
		//testFindByRoll();
		testSearch();
	}

	private static void testSearch() throws Exception {
		MarksheetBean bean = new MarksheetBean();
		bean.setId(5);
		bean.setName("s");
		MarksheetModel model = new MarksheetModel();
	     List list=   model.search(bean, 1, 5);
		  Iterator it=    list.iterator();
		  while(it.hasNext())
		  {
			bean=  (MarksheetBean) it.next();
			System.out.print("\t" +bean.getId());
			System.out.print("\t" +bean.getName());
			System.out.print("\t" +bean.getRollNo());
			System.out.print("\t" +bean.getPhysics());
			System.out.print("\t" +bean.getChemistry());
			System.out.println("\t" +bean.getMaths());
		  }
	}

	private static void testFindByRoll() throws Exception {
		MarksheetModel model = new MarksheetModel();
		MarksheetBean bean=  model.findByRoll(118);
		 if(bean==null)
		 {
			 System.out.println("not found");
		 }
		 else {
			 System.out.print("\t"+bean.getId());
			 System.out.print("\t"+bean.getName());
			 System.out.print("\t"+bean.getRollNo());
			 System.out.print("\t"+bean.getPhysics());
			 System.out.print("\t"+bean.getChemistry());
			 System.out.println("\t"+bean.getMaths());
		 }
		
	}

	private static void testDelete() throws Exception {
		MarksheetBean bean = new MarksheetBean();
		
		MarksheetModel model = new MarksheetModel();
		    model.delete(2);
	
		 
		     
		
	}

	private static void testUpdate() throws Exception {
	    MarksheetBean bean = new MarksheetBean();
	    bean.setName("ruby");
	    bean.setId(3);
	    MarksheetModel model= new MarksheetModel();
	       model.update(bean);
		
	}

	private static void testAdd() throws Exception {
		MarksheetBean bean = new MarksheetBean();
		//bean.setId(id);
		bean.setName("jyoti");
		bean.setRollNo(221);
		bean.setPhysics(98);
		bean.setChemistry(89);
		bean.setMaths(67);
		MarksheetModel model = new MarksheetModel();
		model.add(bean);
	}


		
		
	

}
