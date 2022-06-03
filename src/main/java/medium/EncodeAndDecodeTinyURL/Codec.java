package medium.EncodeAndDecodeTinyURL;

import java.util.HashMap;
import java.util.Map;

public class Codec {
    private Map<String, String> map = new HashMap<>();
    private long cryptSign = 0;
    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        String key = "http://tinyurl.com/" + cryptSign++;
        map.put(key, longUrl);
        return key;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return map.get(shortUrl);
    }
}
