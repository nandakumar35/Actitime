package com.actitime.testscript;

import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.actitime.generic.BaseClass;
import com.actitime.generic.FileLib;
import com.actitime.pom.HomePage;
import com.actitime.pom.TaskListPage;


@Listeners(com.actitime.generic.ListenerImplementation.class)
public class CustomerModule extends BaseClass{

	@Test
	public void testCreateCustomer() throws InterruptedException, EncryptedDocumentException, IOException {
		Reporter.log("CreateCustomer",true);
		FileLib f=new FileLib();
		String custName = f.getExcelData("CreateCustomer",1, 3);
		String custDescp = f.getExcelData("CreateCustomer", 1, 4);
		HomePage h=new HomePage(driver);
		h.setTasktab();
		TaskListPage t=new TaskListPage(driver);
		t.getAddnew().click();
		t.getNewcustomer().click();
		t.getEntercustomername().sendKeys(custName);
		t.getEntercustomerdescription().sendKeys(custDescp);
		t.getSelectcustomerDD().click();
		t.getOurCompany().click();
		t.getCreatecustomer().click();
		
	}
}
