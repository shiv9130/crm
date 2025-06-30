package GenericUtilityNinza;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;

public class javaUtility {
	
	//generate random number
	public int javaUtil() {
		Random random = new Random();
		int data = random.nextInt(999);
		return data;
	}
	//generate current date
	public String currentDate() {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-DD");
		String cdate = sdf.format(date);
		return cdate;
	}
	//generate req date
	public String reqdate(int days) {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-DD");
		String cdate = sdf.format(date);
		Calendar cal = sdf.getCalendar();
		cal.add(Calendar.DAY_OF_MONTH, days);
		String reqdate = sdf.format(cal.getTime());
		return reqdate;
		
	}
	
	public String randomAlphabet(){
		String randomAlpha = RandomStringUtils.randomAlphabetic(5);
		return randomAlpha;	
	}
	
	public String randomNumber(){
		String randomNumber = RandomStringUtils.randomNumeric(10);
		return randomNumber;	
	}
	
	public String randomAlphaNumeric() {
		String randomA = RandomStringUtils.randomAlphabetic(5);
		String randomN = RandomStringUtils.randomNumeric(10);
		String randomAlphaNumeric = (randomA+"@"+randomN);
		return randomAlphaNumeric ;
		
	}

}
