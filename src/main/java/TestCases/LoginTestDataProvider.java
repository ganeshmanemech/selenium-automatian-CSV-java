package TestCases;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Pages.LoginPage;
import common.IInvokedMethodImpl;
import common.WebBase;

@Listeners(IInvokedMethodImpl.class)
public class LoginTestDataProvider extends WebBase {
	@Test(dataProvider="Data Login")
	public void vrifyLoginSucessful(String userid, String password) {
		
		LoginPage lp=new LoginPage();
		lp.loginMethod(userid, password);
	}
	
	

		@Test(dataProvider="DataCSVLogin")
		public void vrifyLoginSucessfulUsinCSV(String userid, String password) {
			
			LoginPage lp=new LoginPage();
			lp.loginMethod(userid, password);
		}

}
