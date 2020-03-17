package br.com.experian.api.credentials.controller;

import org.junit.Test;
import org.springframework.boot.test.mock.mockito.MockBean;

import br.com.experian.api.credentials.service.CredentialsService;


public class CredentialsControllerTest extends BaseControllerTest {

	@MockBean
	private CredentialsService credentialsService;

	@Test
	public void shouldGetUserCredentials() throws Exception {
	}

	@Test
	public void shouldFailGetUserCredentials() throws Exception {
	}


}
