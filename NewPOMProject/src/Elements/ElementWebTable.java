package Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;



public class ElementWebTable {
	
	WebDriver driver;
	
	
	public ElementWebTable( WebDriver driver) {
		
		this.driver = driver;
	}

	// Click on Add Button
	
	By btnadd =By.id("addNewRecordButton");
	
	
	//Register Form Field
	
	By txtFirstName= By.id("firstName");
	By txtlastName =By.id("lastName");
	By txtUserEmail=By.id("userEmail");
	By txtage = By.id("age");
	By txtsalary = By.id("salary");
	By txtdepartment = By.id("department");
	By btnsubmit =By.id("submit");
	
	//find  Searchtextbox 
	By txtSearch=By.id("searchBox");
	
	// Edit Record
	By btnedit=By.id("edit-record-4");
	
	
	//Delete Button
	By btnDelete=By.id("delete-record-1");
	
	By FirstNameSort =By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[3]/div[1]/div[1]/div/div[1]/div[1]");
	By LastnameSort =By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[3]/div[1]/div[1]/div/div[2]/div[1]");
	By AgeSort =By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[3]/div[1]/div[1]/div/div[3]/div[1]");
	By EmailSort=By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[3]/div[1]/div[1]/div/div[4]/div[1]");
	By salarySort =By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[3]/div[1]/div[1]/div/div[5]/div[1]");
	By Deparmentsort =By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[3]/div[1]/div[1]/div/div[6]/div[1]");
	
	
	
	public void ClickonAddButton() {
		
		driver.findElement(btnadd).click();
	}
	
	
	public void EnterFirsname(String FirstName)
	
	{
		driver.findElement(txtFirstName).sendKeys(FirstName);
	}
	
	public void EnterLastname(String Lastname) {

		driver.findElement(txtlastName).sendKeys(Lastname);
	}
	
	public void EnterUserEmail(String userEmail) {
		
		driver.findElement(txtUserEmail).sendKeys(userEmail);
	}
	
	public void EnterAge(String Age) {
		
		driver.findElement(txtage).sendKeys(Age);
	}
	
	public void EnterSalary(String Salary) {
		
		driver.findElement(txtsalary).sendKeys(Salary); 
	}
	
	public void EnterDepartment(String Department) {
		
		driver.findElement(txtdepartment).sendKeys(Department);
	}
	
	public void ClickonSubmitButton() {
		
		driver.findElement(btnsubmit).click();
	}
	
	
	// Search Element
	
	public void EnterSearch(String Searchtext){
		   driver.findElement(txtSearch).sendKeys(Searchtext);	
		}
	
	
	public void ClearSearchText() {
		
		driver.findElement(txtSearch).sendKeys(Keys.COMMAND + "a");
		//driver.findElement(txtSearch).sendKeys(Keys.DELETE);
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
	
	public void FirstnameBySorting() {
		
		driver.findElement(FirstNameSort).click();
	}
	
	public void LastnameBySorting() {
		driver.findElement(LastnameSort).click();
	}
	
	public void AgebySorting() {
		driver.findElement(AgeSort).click();
		
	}
	public void EmailBySorting() {
		driver.findElement(EmailSort).click();
	}
	
	public void SalaryBySoring() {
		driver.findElement(salarySort).click();
	}
	
	public void DepartmentBySorting() {
		driver.findElement(Deparmentsort).click();
	}
	
}
