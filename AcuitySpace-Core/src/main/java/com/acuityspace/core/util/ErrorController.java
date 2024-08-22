/**
 * Designed by Acuity Space Incorporation.
 * @Title: ErrorController.java
 * @Package: com.acuityspace.core.util
 * @Date: 04-Apr-2024
 * @Version: V1.0
 * @Copyright: 2024 Acuity Space Inc. All rights reserved.
 */
package com.acuityspace.core.util;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: Diganta [Diganta Si]
 * @Date: 04-Apr-2024
 */
@Controller
@RequestMapping(value = "/error", produces = MediaType.TEXT_HTML_VALUE)
public class ErrorController {
	
	@GetMapping()
	public String getErrorPage() {
		return "error.html";
	}
}
