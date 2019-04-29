package com.jramun.websocket;

import java.util.HashMap;
import java.util.Map;

//TODO Memory
public class LocalDBImp implements LocalDB {
    private static LocalDBImp ourInstance = new LocalDBImp();
    private Map<String, Object> map;

    private LocalDBImp() {
        this.map = new HashMap<>();
    }

    public static LocalDBImp getInstance() {
        return ourInstance;
    }

    public Object put(String key, Object value) {
        return this.map.put(key, value);
    }

    public boolean contains(String key) {
        return this.map.containsKey(key);
    }

    public Object pull(String key) {
        return this.map.get(key);
    }
}
