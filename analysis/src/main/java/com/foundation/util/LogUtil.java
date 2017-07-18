package com.foundation.util;

import android.util.Log;

/**
 * Created by john 
 * on 2017/7/17 11:37.
 */

public class LogUtil {
    private LogConfig mLogConfig;

    /**
     * 输出调试日志
     * @param suffixTag 日志标签前缀
     * @param msg 输出的日志消息
     * */
    public void debug(String suffixTag,String msg){
        Log.d(mLogConfig.getmBaseTag()+suffixTag,msg);
    }
}

