package com.bagal.utils;

public final class XpathUtil {
    private XpathUtil(){}

    public static String createXpath(String xpath,String value){
        return String.format(xpath,value);
    }
}
