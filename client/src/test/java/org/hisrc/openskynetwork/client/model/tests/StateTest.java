package org.hisrc.openskynetwork.client.model.tests;

import java.io.IOException;

import org.hisrc.openskynetwork.client.model.State;
import org.junit.Assert;
import org.junit.Test;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class StateTest {

	@Test
	public void parsesTuple() throws JsonParseException, JsonMappingException, IOException {
		final String input = "[\"3945f9\",\"XK205XG\",\"France\",1455866125,null,8.6793,42.9749,4282.44,false,null,null,null,[31813]]";
		ObjectMapper mapper = new ObjectMapper();
		State state = mapper.readValue(input, State.class);
		Assert.assertNotNull(state);
		Assert.assertEquals("XK205XG", state.getCallsign());
		Assert.assertEquals(31813, state.getSensors().get(0).longValue());
	}
}
