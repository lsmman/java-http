package camp.nextstep.model.dto;

import java.util.HashMap;
import java.util.Map;

public class RequestLine {
    String method;
    String path;
    String protocol;
    String version;
    Map<String, String> queryStringMap = new HashMap<>();

    public String getMethod() {
        return method;
    }

    public String getPath() {
        return path;
    }

    public String getProtocol() {
        return protocol;
    }

    public String getVersion() {
        return version;
    }

    public Map<String, String> getQueryStringMap() {
        return queryStringMap;
    }

    public static RequestLine of(String method, String path, String protocol, String version) {
        RequestLine requestLine = new RequestLine();
        requestLine.method = method;
        requestLine.path = path;
        requestLine.protocol = protocol;
        requestLine.version = version;
        return requestLine;
    }

    public static RequestLine of(String method, String path, String protocol, String version, Map<String, String> queryString) {
        RequestLine requestLine = new RequestLine();
        requestLine.method = method;
        requestLine.path = path;
        requestLine.protocol = protocol;
        requestLine.version = version;
        requestLine.queryStringMap = queryString;
        return requestLine;
    }
}
