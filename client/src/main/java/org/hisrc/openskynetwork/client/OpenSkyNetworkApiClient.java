package org.hisrc.openskynetwork.client;

import java.util.List;

import org.hisrc.openskynetwork.client.model.State;

public interface OpenSkyNetworkApiClient {
	
	public List<State> states() throws OpenSkyNetworkApiException;

	public List<State> states(long timestampInSeconds) throws OpenSkyNetworkApiException;
}
