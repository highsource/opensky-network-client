package org.hisrc.openskynetwork.client;

import java.util.List;
import java.util.function.Function;

import javax.net.ssl.SSLHandshakeException;

import org.hisrc.openskynetwork.client.api.DefaultApi;
import org.hisrc.openskynetwork.client.invoker.ApiClient;
import org.hisrc.openskynetwork.client.invoker.ApiException;
import org.hisrc.openskynetwork.client.model.State;
import org.hisrc.openskynetwork.client.model.States;

import com.sun.jersey.api.client.ClientHandlerException;

public class DefaultOpenSkyNetworkApiClient implements OpenSkyNetworkApiClient {

	private final ApiClient apiClient = new ApiClient();
	private final DefaultApi api = new DefaultApi(this.apiClient);

	@Override
	public List<State> states() throws OpenSkyNetworkApiException {
		return execute(() -> api.statesTimeGet(null));

	}

	@Override
	public List<State> states(long timestampInSeconds) throws OpenSkyNetworkApiException {
		return execute(() -> api.statesTimeGet(timestampInSeconds));

	}

	public List<State> execute(ApiOperation<States> operation) throws OpenSkyNetworkApiException {

		try {
			final States response = operation.execute();
			if (response == null) {
				throw new ApiException("OpenSkyNetwork API request returned null.");
			} else {
				final List<State> states = response.getStates();
				if (states == null) {
					throw new ApiException("States.states is null.");
				} else {
					return states;
				}
			}
		} catch (ClientHandlerException chex) {
			if (chex.getCause() instanceof SSLHandshakeException) {
				throw new OpenSkyNetworkApiException(
						"SSL handshake exception, your Java instance is probably missing the Let's Encrypt CA certificate.",
						new ApiException(chex));
			} else {
				throw new OpenSkyNetworkApiException("Could not execute the OpenSkyNetwork API request.",
						new ApiException(chex));
			}
		} catch (ApiException apiex) {
			throw new OpenSkyNetworkApiException("Could not execute the OpenSkyNetwork API request.", apiex);
		}
	}

	@FunctionalInterface
	private interface ApiOperation<T> {
		public T execute() throws ApiException;
	}
}
