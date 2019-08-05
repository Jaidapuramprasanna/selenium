package Framework_Testng_DP;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class InputData_DP {
  @Test(dataProvider = "dp")
  public void user_data(String uid, Integer mobile) {
  }

  @DataProvider
  public Object[][] dp() 
  {
    return new Object[][] 
    		{
      new Object[] { "user1", "1234567890" },
      new Object[] { "user2", "1234567891" },
      new Object[] { "user3", "1234567892" },
      new Object[] { "user4", "1234567893" },


    };
  }
}
