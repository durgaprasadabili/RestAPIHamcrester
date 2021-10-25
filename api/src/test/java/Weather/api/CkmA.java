package Weather.api;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import org.testng.annotations.Test;
import static org.hamcrest.Matchers.*;

import io.restassured.RestAssured;

public class CkmA 
{
	
	@Test
	public void weatherReport()
	{
		RestAssured rest = new RestAssured();
		String g=rest.get("https://goweather.herokuapp.com/weather/chennai").asPrettyString();
		rest.get("https://goweather.herokuapp.com/weather/chennai").then().body("temperature",equalTo("+29 °C"));
		try {
			BufferedWriter write = new BufferedWriter( new FileWriter("C:\\Users\\Prasad_Abili\\Desktop\\personal id\\g.json"));
			write.write(g);
			write.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
}
