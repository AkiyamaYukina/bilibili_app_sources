package com.bilibili.lib.v8.spdlog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/v8/spdlog/BaseLog.class */
interface BaseLog {
    void debug(String str);

    void drop();

    void info(String str);

    void log(String str);

    void sys(String str);

    void warn(String str);
}
