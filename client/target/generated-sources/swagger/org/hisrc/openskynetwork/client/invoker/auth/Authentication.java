package org.hisrc.openskynetwork.client.invoker.auth;

import org.hisrc.openskynetwork.client.invoker.Pair;

import java.util.Map;
import java.util.List;

public interface Authentication {
  /** Apply authentication settings to header and query params. */
  void applyToParams(List<Pair> queryParams, Map<String, String> headerParams);
}
