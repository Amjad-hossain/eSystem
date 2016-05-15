package com.codehaven.util;

import java.util.List;

/**
 * Created by coder on 2/21/16.
 */
public class Utils {


    public static boolean isEmpty(String str) {

        return str == null || "".equals(str);
    }

    public static boolean isEmpty(List lst) {

        return lst == null || lst.size() <= 0;
    }
}
