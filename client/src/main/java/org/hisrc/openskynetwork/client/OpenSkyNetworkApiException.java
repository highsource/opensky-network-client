package org.hisrc.openskynetwork.client;

import org.apache.commons.lang3.Validate;
import org.hisrc.openskynetwork.client.invoker.ApiException;

public class OpenSkyNetworkApiException extends RuntimeException {

	private static final long serialVersionUID = -1740309134729332812L;

	public OpenSkyNetworkApiException(String message, ApiException cause) {
		super(Validate.notNull(message), Validate.notNull(cause));
	}

}
