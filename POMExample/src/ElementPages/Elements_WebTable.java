package ElementPages;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;


public class Elements_WebTable {

	WebDriver driver;
	
	public Elements_WebTable(WebDriver driver) {
		
		this.driver=driver;
		
	}
	
	//Click on Add button
	 By btnAdd = By.id("addNewRecordButton");
	 
	 //Register Form Field
	 
	 By txtFirstName=By.id("firstName");
	 By txtlastName=By.id("lastName");
	 By txtUserEmail=By.id("userEmail");
	 By txtage=By.id("age");
	 By txtsalary=By.id("salary");
	 By txtdepartment=By.id("department");
	 By btnsubmit=By.id("submit");
	 
	 //  find  Searchtextbox 
	 By txtSearch=By.id("searchBox");
	 
	 // Edit Record
	 By btnedit=By.id("edit-record-4");
	 
	 //Delete Button 
	 
	 By btnDelete=By.id("delete-record-1");
			 
	 
	 
	 public void ClickonAdd() {

		 driver.findElement(btnAdd).click();
	}
	 
	 public void EnterFirstName(String firstname) {
		 
		 driver.findElement(txtFirstName).sendKeys(firstname);
		
	}
	 
	public void EnterLastname(String lastname) {
		
		driver.findElement(txtlastName).sendKeys(lastname);
	
	}
	
	public void EnterEmail(String useremail) {
		
		driver.findElement(txtUserEmail).sendKeys(useremail);
	}
	
	public void EnterAge(String age) {
		
		driver.findElement(txtage).sendKeys(age);
	}
	
	public void EnterSalary(String salary) {
		
		driver.findElement(txtsalary).sendKeys(salary);
	} 
	
	public void EnterDeparment(String depart) {
		
		driver.findElement(txtdepartment).sendKeys(depart);
	}
	
	public void ClickonSubmit() {
		driver.findElement(btnsubmit).click();	
	}
	
	// Search Element 
	
	public void EnterSearch(String Searchtext){
	   driver.findElement(txtSearch).sendKeys(Searchtext);	
	}
	
	public void ClearSearchtext(){
		
		driver.findElement(txtSearch).sendKeys(Keys.COMMAND + "a");
		driver.findElement(txtSearch).sendKeys(Keys.DELETE);
	} 
	
	public void EditRecord(){
		driver.findElement(btnedit).click();
	}
	
	public void ClearFirstname(){
		driver.findElement(txtFirstName).clear();
	}
	
	public void ClearLastname(){
		driver.findElement(txtlastName).clear();
	}
	public void ClearUserEmail(){
		driver.findElement(txtUserEmail).clear();
	}
	public void Clearage(){
		driver.findElement(txtage).clear();
	}
	public void Clearsalary(){
		driver.findElement(txtsalary).clear();
	}
	public void Cleardeprt(){
		driver.findElement(txtdepartment).clear();	
	}
	
	public void ClickDelete() {
		
		driver.findElement(btnDelete).click();
	}
	
	
}
