# OpenSky Network Java Client

This projects provides a Java Client for [OpenSky Network API](https://www.opensky-network.org).

## Usage

### Adding the client to your project

#### Maven

Add the following dependency to your project:

```xml
<dependency>
	<groupId>org.hisrc.opensky-network</groupId>
	<artifactId>opensky-network-client</artifactId>
	<version>...</version>
</dependency>
```

### Using the client in your Java code

```
OpenSkyNetworkApiClient apiClient = new DefaultOpenSkyNetworkApiClient();
final List<State> currentStates = apiClient.states();
final List<State> statesForTimestamp = apiClient.states(System.currentTimeMillis() / 1000);
```

## Troubleshooting

You may be getting `SSLHandshakeException` when trying to get flights state. The reason for this is that OpenSky Network uses a SSL
certificate from [Let's Encrypt](https://letsencrypt.org/) which is a relatively new ceritificate authority, its CA certificate may be missing in your Java installation.
This is why Java can't check the validity of the HTTP connection.

The solution is to add the appropriate certificate to the `${JAVA_HOME}/jre/lib/security/cacerts` keystore, yet to be documented.

## License

Please note that this code is currently under the [GPL-3.0](https://opensource.org/licenses/GPL-3.0) license. We plan to switch to MIT or BSD or dual licensing in the future.