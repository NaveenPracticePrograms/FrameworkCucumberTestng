package com.coding.Runner;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = "src/test/resources/com/coding/features", 
				glue = "com.coding.StepDefinitions",		
				monochrome = true, plugin = {
						"pretty", "html:target/cucumber-html-report.html", "json:target/cucumber-reports/cucumber.json",
						"junit:target/cucumber-reports/cucumber.xml",
						"rerun:target/rerun.txt"
						})

public class TestRunner extends AbstractTestNGCucumberTests{
	@BeforeClass
	public static void setup() {
		File srcDir = new File(System.getProperty("user.dir") + "/test-output/screenshots");
		File targetDir = new File(System.getProperty("user.dir") + "/test-output/oldscreenshots");
		for (File f : targetDir.listFiles()) {
			f.delete();
		}
		File[] srcfiles = srcDir.listFiles();
		for (File f : srcfiles) {
			Path sourcePath = Paths.get(srcDir.getAbsoluteFile() + "\\" + f.getName());
			Path targetPath = Paths.get(targetDir.getAbsolutePath() + "\\" + f.getName());

			try {
				Files.move(sourcePath, targetPath, StandardCopyOption.REPLACE_EXISTING);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	@Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }

	
}
