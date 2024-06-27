
package tool;


/**
 * Copyright (c) 2023, ustchcs and its affiliates. All rights reserved. More
 * info see www.ustchcs.com
 *
 * @author cch
 * @package backend com.ustchcs.qualityhub.system.utils
 * @node
 */
public class StrUtils {
    public static final String EMPTY = "";

    public static String concatNullToEmpty(CharSequence... strs) {
        return concat(true, strs);
    }

    public static String concat(boolean isNullToEmpty, CharSequence... strs) {
        final StringBuilder sb = new StringBuilder();
        for (CharSequence str : strs) {
            if (isNullToEmpty) {
                sb.append(nullToEmpty(str));
            } else {
                sb.append(str);
            }
        }
        return sb.toString();
    }

    public static String nullToEmpty(CharSequence str) {
        return nullToDefault(str, EMPTY);
    }

    public static String nullToDefault(CharSequence str, String defaultStr) {
        if (str == null) {
            return defaultStr;
        }

        return str.toString();
    }
}
