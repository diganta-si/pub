/**
 * Designed by Acuity Space Incorporation.
 * @Title: LandingPageController.java
 * @Package: com.acuityspace.core.dashboard
 * @Date: 06-Nov-2023
 * @Version: V1.0
 * @Copyright: 2023 Acuity Space Inc. All rights reserved.
 */
package com.acuityspace.core.dashboard;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: Diganta [Diganta Si]
 * @Date: 06-Nov-2023
 */
@Controller
@RequestMapping(value = "/", produces = MediaType.TEXT_HTML_VALUE)
public class LandingPageController {
	
	@GetMapping()
	public String getLandingPage() {
		return "index.html";
	}
}
