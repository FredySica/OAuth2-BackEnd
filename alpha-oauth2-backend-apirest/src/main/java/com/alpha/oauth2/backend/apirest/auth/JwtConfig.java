package com.alpha.oauth2.backend.apirest.auth;

public class JwtConfig {
	public static final String LLAVE_SECRETA = "alguna.clave.secreta.12345678";
	
	public static final String RSA_PRIVADA = "-----BEGIN RSA PRIVATE KEY-----\r\n" + 
			"MIIEpAIBAAKCAQEA75WfLUZxkIFZe9nwwb/AANlJVJwUvvcHTnGDgoWNKC9eaIH2\r\n" + 
			"9P9LVaeu6A4qlNXKOhsGKHID36T40Ua4Xl78Mf2EbpuTOWHa8IVZ+1AryqrtQxD+\r\n" + 
			"v+OAjYMSCOxvRH8c0w17fGpsgNGmCViWhyjGWDIOO72pTz0K3Uw789GYiULwGJLY\r\n" + 
			"k1/gXw2wesQmPOrxzPRQN0YFZZocc6cVLQLH3JKLanWJUVQphBzIzLTLeufks9xO\r\n" + 
			"91nONATqaLylTyM9PglIqx0mE3SlunqaRQchSPBQfHvJLEVtapHxsdkHWHMSmp9L\r\n" + 
			"6BOBqe0Daidqs2Wn2XeJImZ79e957f9x7W/ezQIDAQABAoIBAQDHcOpdKjMHdGYl\r\n" + 
			"b7u3zgPrsPYWdQfgIIv4hQ5Q7RQgy63vmaEXOh5gY4J6srBHzeDWlgB+UstetVpb\r\n" + 
			"/F8mUDPo+X3xBZl9PzSe3KOXTZnm0HtKRS+MVbqCEwZEX24QuzAnkSWm4IEKi3uI\r\n" + 
			"dDJ6uTrD2Id4u93hlJMivX967JPqTi5wSV/cnl3CcQ2v9LdQIx88x8w3hTLyVB1W\r\n" + 
			"JX71TPjzHd7od3AbJthbEp9I7JsqmbsBi2chNoOskRYq55e2Cn38N7JC4sE11ScO\r\n" + 
			"epUHYHgBC8DmncZaEzw/t6FD5rWuoUXoTf0iQpY15Trvi1EWn4C3sp4th3syRu8I\r\n" + 
			"OR3xW/UBAoGBAPn0AeUhtV/4FaWZb+Gdta3EgmUUcCxyxOOAkcSm967ByefIVfRM\r\n" + 
			"0WVdOJC4jBMHMfjjyQvOPxdouLsIJNQdtFAa52xvS+Zvy69AmcWeM1FuBo7b5TM8\r\n" + 
			"odLkbwBKJsceS4Ad0GFZhle35Ct2VN+bkml9Sq7KofStaEyWfism4Vs9AoGBAPVh\r\n" + 
			"ZlMCjsR+swth2lMge3x0hoXgcLRn+qHOJmPJduaTf0vkidDhfdA2OysEZJ09WW9t\r\n" + 
			"6sqsyO4mei1Boi89jFacOfyLAIKgKGLapau+SFGCVwsP4UjZgIy24cnqcjhRnyH5\r\n" + 
			"eiU/oEm4ZTlh4J4dz1ez8gnixLGoNLwDqPbXtArRAoGADGcjQO9vRJfW2yTF/HgK\r\n" + 
			"79h0b/eXqVz4kCFtGkj+uVk8X5f9S+YT7ee2Stgde0Q8IpGLBF7zmoHDyOQaj7v5\r\n" + 
			"mo/7M9JB/elGPigCeV/kRAIlqSkYMnarwP880tLbIb5LGMxh7rK2i9vAIrf4djAO\r\n" + 
			"D9X7wrijWLTSHBrLn/CJ9jECgYBPUOyCaJE9crbtNvQbaqR/1iqlm6bSqcmaA8jk\r\n" + 
			"+Ho2jfbX0Ue6/Sht5Rm7DfB34xzFqAH9AVzxnf5gIpcKLhru5BDaURQZJSvoyERE\r\n" + 
			"/3zg3ADG0ps/sQ6cbYEOg3noOnn1wW56G9bz/Wa65ah1c61R7BiQmXx68KQbIhO7\r\n" + 
			"tn28AQKBgQCmUXsyo4NscmAvFrAxVwOojPegLExNMHrvvfKj1lcWln1M4N2zhI+v\r\n" + 
			"vLlFXUhHZ1nqO/u5EA377Ze8YL3fMmcu7FEBcnAl6pozLX0cqBCTL8hePvJU6Jep\r\n" + 
			"Mi1V+O7T4WmpjvVVlDLjbEi9qY10Ndsv6AvG2nNDLS+ouJ1AHgPrhQ==\r\n" + 
			"-----END RSA PRIVATE KEY-----";
	
	public static final String RSA_PUBLICA = "-----BEGIN PUBLIC KEY-----\r\n" + 
			"MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA75WfLUZxkIFZe9nwwb/A\r\n" + 
			"ANlJVJwUvvcHTnGDgoWNKC9eaIH29P9LVaeu6A4qlNXKOhsGKHID36T40Ua4Xl78\r\n" + 
			"Mf2EbpuTOWHa8IVZ+1AryqrtQxD+v+OAjYMSCOxvRH8c0w17fGpsgNGmCViWhyjG\r\n" + 
			"WDIOO72pTz0K3Uw789GYiULwGJLYk1/gXw2wesQmPOrxzPRQN0YFZZocc6cVLQLH\r\n" + 
			"3JKLanWJUVQphBzIzLTLeufks9xO91nONATqaLylTyM9PglIqx0mE3SlunqaRQch\r\n" + 
			"SPBQfHvJLEVtapHxsdkHWHMSmp9L6BOBqe0Daidqs2Wn2XeJImZ79e957f9x7W/e\r\n" + 
			"zQIDAQAB\r\n" + 
			"-----END PUBLIC KEY-----";
}
