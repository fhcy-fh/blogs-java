package top.fhcy.common.utils;

import java.util.UUID;

public class CodeUtils {

    public static String getUuid() {
        return UUID.randomUUID().toString().replace("-", "");
    }
}
