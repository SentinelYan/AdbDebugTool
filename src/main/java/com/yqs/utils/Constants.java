package com.yqs.utils;

import javafx.geometry.Insets;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.ResourceBundle;

/**
 * 常量池
 */
public class Constants {

    private static Locale SPECIFIED_LOCALE = Locale.getDefault();

    //缓存Res
    private static Map<Locale, ResourceBundle> resourceBundles = new HashMap<>();


    public static ResourceBundle getResourcesBundle() {
        //判断是中文还是英文
        if (SPECIFIED_LOCALE.equals(Locale.CHINA)) {
            //获取中文配置文件
            if (resourceBundles.get(Locale.CHINA) == null)
                resourceBundles.put(Locale.CHINA, ResourceBundle.getBundle("i18n.locale", Locale.CHINA));
            //
            return resourceBundles.get(Locale.CHINA);
        } else {
            if (resourceBundles.get(Locale.ENGLISH) == null)
                resourceBundles.put(Locale.ENGLISH, ResourceBundle.getBundle("i18n.locale", Locale.ENGLISH));
            return resourceBundles.get(Locale.ENGLISH);
        }
    }
}
