package com.bilibili.userfeedback.laserreport;

import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import java.io.Serializable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/userfeedback/laserreport/LogReportStrategy.class */
@Keep
public class LogReportStrategy implements Serializable {
    public static final String HINT_DEFAULT = "技术性上报，客服童鞋请勿回复~";
    public static final long INTERVAL_DEFAULT = 600000;
    public static final int SOURCE_TYPE_COMMON = 2;
    public static final String TAG_DEFAULT = "bilibili";

    @Nullable
    public String message;
    public long mid;
    public long intervalTime = INTERVAL_DEFAULT;
    public boolean deleteAfterReport = true;
    public String reportTag = TAG_DEFAULT;
    public String hint = HINT_DEFAULT;
    public int sourceType = 2;

    private void reportMessage() {
        this.message = this.reportTag + "_" + this.mid + "_" + this.hint;
    }

    public void addDelLogAfterReport(boolean z6) {
        this.deleteAfterReport = z6;
    }

    public void addInterval(long j7) {
        this.intervalTime = j7;
    }

    public void addMid(long j7) {
        this.mid = j7;
        reportMessage();
    }

    public void addReportHint(String str) {
        this.hint = str;
        reportMessage();
    }

    public void addReportTag(String str) {
        this.reportTag = str;
        reportMessage();
    }
}
