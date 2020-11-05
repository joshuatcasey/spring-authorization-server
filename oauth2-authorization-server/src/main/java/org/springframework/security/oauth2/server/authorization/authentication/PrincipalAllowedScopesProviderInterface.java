package org.springframework.security.oauth2.server.authorization.authentication;

import java.util.Set;

public interface PrincipalAllowedScopesProviderInterface {

	Set<String> getAllowedScopesForPrincipal(Object principal);

}
