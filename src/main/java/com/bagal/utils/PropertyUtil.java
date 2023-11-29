package com.bagal.utils;

import com.bagal.exceptions.PropertyNotFoundException;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Properties;

public final class PropertyUtil {
    private PropertyUtil(){}
    private static final Map<String,String> MAP = new HashMap<>();
    static {
        try (FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"/src/test/resources/configs/application.properties")){
            Properties properties = new Properties();
            properties.load(fis);
            properties.forEach((key, value) -> MAP.put(String.valueOf(key), String.valueOf(value)));
        }  catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static String getValue(String key){
        if(Objects.nonNull(MAP.get(key))){
            return MAP.get(key);
        }
        throw new PropertyNotFoundException(key+" is not found");
    }
}
