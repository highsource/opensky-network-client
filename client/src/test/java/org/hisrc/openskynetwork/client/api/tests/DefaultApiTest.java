package org.hisrc.openskynetwork.client.api.tests;

import org.hisrc.openskynetwork.client.api.DefaultApi;
import org.hisrc.openskynetwork.client.invoker.ApiException;
import org.hisrc.openskynetwork.client.model.States;
import org.hisrc.openskynetwork.util.SSLUtilities;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DefaultApiTest {

	private DefaultApi api = new DefaultApi();

	@Before
	public void t() {
//		SSLUtilities.trustAllHostnames();
//		SSLUtilities.trustAllHttpsCertificates();
	}

	@Test
	public void returnsStates() throws ApiException {
		final States states = api.statesTimeGet(null);
		Assert.assertNotNull(states);
		Assert.assertTrue(states.getStates().size() > 0);
	}

	@Test
	public void returnsStatesForCurrentTime() throws ApiException {
		final States states = api.statesTimeGet(System.currentTimeMillis() / 1000);
		Assert.assertNotNull(states);
		Assert.assertTrue(states.getStates().size() > 0);
	}

}
