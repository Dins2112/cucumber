package com.reports;
import java.io.File;
import java.util.ArrayList;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

/**
 * 
 * @author Dell
 * @CreationDate 26/06/2022
 *	@Description Reporting
 */

public class Reporting {

/**
 * 
 * @param jsonfile
 * @CreationDate 26/06/2022
 *	@Description generateJVMreport
 */
		public static void generateJVMreport(String jsonfile) {
			File file =new File(System.getProperty("user.dir")+"\\target");
			Configuration config = new Configuration(file,"Adactin Automation");
			config.addClassifications("OS", "Win8");
			config.addClassifications("Browser", "Chrome");
			config.addClassifications("OS", "Win8");
			config.addClassifications("Version", "103");
			config.addClassifications("Sprint", "33");
			
			java.util.List<String>jsonFiles  =new ArrayList<String>();
			jsonFiles.add(jsonfile);
			ReportBuilder builder = new ReportBuilder(jsonFiles,config);
			builder.generateReports();
			
			
		}

}
