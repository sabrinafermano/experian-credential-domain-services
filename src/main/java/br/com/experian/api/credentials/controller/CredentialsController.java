package br.com.experian.api.credentials.controller;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.experian.api.credentials.api.CredentialsApi;
import br.com.experian.api.credentials.model.CredentialsRequest;
import br.com.experian.api.credentials.model.CredentialsResponse;
import br.com.experian.api.credentials.service.CredentialsService;
import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
//@Log4j2
public class CredentialsController extends BaseController implements CredentialsApi {

	private CredentialsService credentialsService;
	
	@Override
	// @PreAuthorize("hasRole('ROLE_CLI-AUTH-IDENTIFIED') and
	// hasRole('ROLE_CLI-1STPARTY') and ((hasRole('ROLE_AUTH-BASIC') and
	// hasRole('ROLE_USER')) or hasRole('ROLE_CLI-AUTH-BASIC')) ")
	public ResponseEntity<CredentialsResponse> getCredentials(@Valid @RequestBody CredentialsRequest credentialsRequest) {

		var userCredentials = credentialsService.getCredentials(credentialsRequest);
		return new ResponseEntity<>(userCredentials, HttpStatus.CREATED);
	}
}