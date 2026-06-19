package com.bilibili.opd.app.bizcommon.sentinel.bilow;

import com.bilibili.lib.biliid.api.BuvidHelper;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/sentinel/bilow/TraceIdEnd.class */
public class TraceIdEnd {
    public static final String TRACEID_END_HEADER_KEY = "TraceID_END";

    public static String id() {
        return BuvidHelper.getBuvid() + "-" + System.currentTimeMillis();
    }
}
