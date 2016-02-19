package org.hisrc.openskynetwork.client.api.tests;

import java.util.List;

import org.hisrc.openskynetwork.client.DefaultOpenSkyNetworkApiClient;
import org.hisrc.openskynetwork.client.OpenSkyNetworkApiClient;
import org.hisrc.openskynetwork.client.invoker.ApiException;
import org.hisrc.openskynetwork.client.model.State;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DefaultApiTest {

	private OpenSkyNetworkApiClient apiClient = new DefaultOpenSkyNetworkApiClient();

	@Before
	public void t() {
		// SSLUtilities.trustAllHostnames();
		// SSLUtilities.trustAllHttpsCertificates();
	}

	@Test
	public void returnsStates() throws ApiException {
		final List<State> states = apiClient.states();
		Assert.assertTrue(states.size() > 0);
	}

	@Test
	public void returnsStatesForCurrentTime() throws ApiException {
		final List<State> states = apiClient.states(System.currentTimeMillis() / 1000);
		Assert.assertTrue(states.size() > 0);
	}

}
