package Crm;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import GenericUtilityNinza.ExcelFileUtility;
import NinzaCrmBase.BaseClass;
import objectRepoNinzaCRm.createCampaign;

public class createcampaign extends BaseClass {
	
	@Test
	public void createCampaignPage() throws EncryptedDocumentException, IOException {
		
		createCampaign cp = new createCampaign(driver);
		cp.getBtn1createcampainMain();
		ExcelFileUtility eu= new ExcelFileUtility();
		String name1 = eu.excelUtility("Testdata", 1, 0);
		String tgt = eu.excelUtility("Testdata", 1, 1);
		cp.getTxtname();
		cp.getTxttargetSize();
		cp.name(name1);
		cp.target(tgt);
		cp.getBtn2createcampain();
		
		
		
		
		
		
	}

}
