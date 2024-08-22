/**
 * Designed by Acuity Space Incorporation.
 * @Title: NewsCatcherScheduling.java
 * @Package: com.acuityspace.scheduling.core.news
 * @Date: 18-Mar-2024
 * @Version: V1.0
 * @Copyright: 2024 Acuity Space Inc. All rights reserved.
 */
package com.acuityspace.neutral.news.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @Author: Diganta [Diganta Si]
 * @Date: 18-Mar-2024
 */
@Component
public class NewsCatcherScheduling {
	private static final String ARCHIVE_NEWS = "/Users/Diganta/my-workspace/python-projects/ArchieveNews";
	private static final String PYTHON_EXECUTER = "/Users/Diganta/anaconda3/bin/python";
	/* Logger initialisation */
	private static final Logger log = LoggerFactory.getLogger(NewsCatcherScheduling.class);
	
    @Scheduled(initialDelay = 5000, fixedRate = 7200000) //86400
    public void initNewsCatchingAPICall() {
    	newsCatchingAPICall();
    }

	private void newsCatchingAPICall() {
	    String s = null;
    	try{
    		String[] cmd = {"/bin/bash", "-c", PYTHON_EXECUTER + " " + ARCHIVE_NEWS + "/news_catcher.py"};
    		ProcessBuilder pb = new ProcessBuilder(cmd);
    	    Process p = pb.start();
    	    BufferedReader stdInput = new BufferedReader(new InputStreamReader(p.getInputStream()));
    	    BufferedReader stdError = new BufferedReader(new InputStreamReader(p.getErrorStream()));
    	    // Read the output from the command
    	    log.info("Standard output of the command:");
    	    while ((s = stdInput.readLine()) != null) {
    	    	log.info(s);
    	    }
    	    // Read any errors from the attempted command
    	    log.info("Standard error of the command (if any):");
    	    while ((s = stdError.readLine()) != null) {
    	    	log.info(s);
    	    }
    	    p.waitFor();
    	    p.destroy();
    	} catch (IOException | InterruptedException e) {
        	log.error("Exception occurred due to -- {}", e, e);
        	Thread.currentThread().interrupt();
    	}
	}
}
