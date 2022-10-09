package bridgelabz.TestNG.Annotations;

import org.testng.annotations.Test;

import com.TestNG.DataProvider.Multiple_DataRepository;

public class Multiple_DataProvider_Test {
	
	//here 'dataProvider' is for connection
	@Test(dataProviderClass = Multiple_DataRepository.class, dataProvider = "getData")
	public void EmpDetails(String EmpName, int Id, String Email) {
		System.out.println(EmpName + "---" + Id + "---" + Email );
	}
	
	@Test(dataProviderClass = Multiple_DataRepository.class, dataProvider = "getData")
	public void enterUserData(String EmpName, int Id, String Email) {
		System.out.println(EmpName + "---" + Id + "---" + Email );
	}
	
	@Test(dataProviderClass = Multiple_DataRepository.class, dataProvider = "getData")
	public void validateHomePage(String EmpName, int Id, String Email) {
		System.out.println(EmpName + "---" + Id + "---" + Email );
	}
}
