package com.bilibili.studio.comm.api.bean;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.collection.C3269h;
import com.alibaba.fastjson.annotation.JSONField;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/comm/api/bean/UpperRealTimeOffsetBean.class */
@Keep
public class UpperRealTimeOffsetBean {

    @JSONField(name = "t1")
    public long serverStartTime = 0;

    @JSONField(name = "t2")
    public long serverEndTime = 0;

    @JSONField(name = "acceptable_clock_max_error_ms")
    public long maxErrorMsConfig = 0;

    @JSONField(name = "retry_interval_ms")
    public long retryRequestIntervalMs = 0;

    @JSONField(name = "max_retry_count")
    public int maxRequestRetryCount = 0;

    @NonNull
    public String toString() {
        StringBuilder sb = new StringBuilder("UpperRealTimeOffsetBean{serverStartTime=");
        sb.append(this.serverStartTime);
        sb.append(", serverEndTime=");
        sb.append(this.serverEndTime);
        sb.append(", maxErrorMsConfig=");
        sb.append(this.maxErrorMsConfig);
        sb.append(", retryRequestIntervalMs=");
        sb.append(this.retryRequestIntervalMs);
        sb.append(", maxRequestRetryCount=");
        return C3269h.a(sb, this.maxRequestRetryCount, '}');
    }
}
