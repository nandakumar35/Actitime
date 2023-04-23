package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskListPage {
	@FindBy(xpath="//div[text()='Add New']")
	private WebElement addnew;
	
	@FindBy(xpath="//div[text()='+ New Customer']")
	private WebElement newcustomer;
	
	@FindBy(xpath="(//input[@type='text' and @placeholder='Enter Customer Name'])[2]")
	private WebElement entercustomername;
	
	@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")
	private WebElement entercustomerdescription;
	
	@FindBy(xpath="(//div[text()='- Select Customer -'])[1]")
	private WebElement selectcustomerDD;
	
	@FindBy(xpath="(//div[text()='Ankitha2955'])[2]")
	private WebElement ourCompany;
	
	@FindBy(xpath="//div[text()='Create Customer']")
	private WebElement createcustomer;
	
	@FindBy(xpath="//div[@class='titleEditButtonContainer']/div[1]")
	private WebElement actualCustomerCreated;
	
	public TaskListPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	public WebElement getAddnew() {
		return addnew;
	}

	public WebElement getNewcustomer() {
		return newcustomer;
	}

	public WebElement getEntercustomername() {
		return entercustomername;
	}

	public WebElement getEntercustomerdescription() {
		return entercustomerdescription;
	}

	public WebElement getSelectcustomerDD() {
		return selectcustomerDD;
	}

	public WebElement getOurCompany() {
		return ourCompany;
	}

	public WebElement getCreatecustomer() {
		return createcustomer;
	}

	public WebElement getActualCustomerCreated() {
		return actualCustomerCreated;
	}
}
