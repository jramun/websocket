package com.jramun.websocket;

public interface LocalDB {

    Object put(String key, Object value);

    boolean contains(String key);

    Object pull(String key);
}
