package com.reporting;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import com.baseclass.BaseClass;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;



public class Reporting extends BaseClass{
	public static void generateJVM(String jsonFile) {
   File file = new File(getProjectPath()+"\\target");
		Configuration configuration = new Configuration(file,"FaceBook login check");
		configuration.addClassifications("browser","chrome");
		configuration.addClassifications("OS", "windows7");
		List<String> jsonFiles = new ArrayList<String>();
		jsonFiles.add(jsonFile);
		ReportBuilder reporting = new ReportBuilder(jsonFiles, configuration);
		reporting.generateReports();
		
	}

}
