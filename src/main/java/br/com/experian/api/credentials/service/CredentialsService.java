package br.com.experian.api.credentials.service;

import br.com.experian.api.credentials.model.CredentialsRequest;
import br.com.experian.api.credentials.model.CredentialsResponse;

public interface CredentialsService {

	CredentialsResponse getCredentials(CredentialsRequest credentialsRequest);
}
