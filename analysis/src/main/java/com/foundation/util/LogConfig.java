package com.foundation.util;

/**
 * Created by john 
 * on 2017/7/17 11:38.
 */

public class LogConfig {
    private boolean isDebug = true;
    private boolean isUpload = false;
    private boolean isCache = true;
    private String mCacheDictionary = "";


    /**
     * 是否处于调试状态
     * @return true ,将输出日志；false，将不输出日志
     * */
    public boolean isDebug() {
        return isDebug;
    }


    /**
     *设置应用是否处于Debug模式
     * @param debug true，设置处于Debug模式；false设置处于非Debug模式
     * */
    public void setDebug(boolean debug) {
        isDebug = debug;
    }

    /**
     * 是否上传日志到服务器
     * */
    public boolean isUpload() {
        return isUpload;
    }

    /**
     * 设置是否上传日志到服务器，设置该标识将立即上传日志
     * @param upload true，上传日志到服务器，注意需要自己实现上传；false，不上传
     * */
    public void setUpload(boolean upload) {
        isUpload = upload;
    }

    /**
     * 是否缓存日志
     * @return true, 缓存日志到外部存储器；false，不缓存日志
     * */
    public boolean isCache() {
        return isCache;
    }

    /**
     *设置是否缓存日志
     * @param cache true，缓存日志到外部存储器；false，不缓存
     * */
    public void setCache(boolean cache) {
        isCache = cache;
    }
}
