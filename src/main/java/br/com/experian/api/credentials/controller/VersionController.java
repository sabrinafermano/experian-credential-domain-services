package br.com.experian.api.credentials.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersionController extends BaseController {

	@Value("${api.credentials.version}")
	private String applicationVersion;

	@GetMapping(value = "/version")
	public String version() {
		return "Application version " + applicationVersion;
	}

}