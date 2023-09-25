package testcases;

import org.testng.annotations.Test;

import baseTest.Page;

public class New_Releases {
		
	@Test
		public void newReleases() throws InterruptedException {
			
		Trending.New_Releases newreleases=Page.top.gotToNew_Releases();
		System.out.println("Hy1");
		newreleases.new_Releases();
		System.out.println("Hy2");	
		}
		
	}
	
	

