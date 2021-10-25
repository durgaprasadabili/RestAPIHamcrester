package bitcotin.api;

import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class BitCoin 
{
	
	@Test
	public void Currencyeport()
	{
		RestAssured rest = new RestAssured();
		rest.get("https://api.coindesk.com/v1/bpi/currentprice.json").then().assertThat().body("bpi.USD.rate", greaterThan("62,993.3517"));
	}

}
