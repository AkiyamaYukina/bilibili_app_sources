package com.bilibili.userfeedback.laserreport;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/userfeedback/laserreport/LogStrategyBuilder.class */
@Keep
public class LogStrategyBuilder {
    private LogReportStrategy mStrategy = new LogReportStrategy();

    public LogReportStrategy create() {
        return this.mStrategy;
    }

    public LogStrategyBuilder setDelLogAfterReport(boolean z6) {
        this.mStrategy.addDelLogAfterReport(z6);
        return this;
    }

    public LogStrategyBuilder setInterval(long j7) {
        this.mStrategy.addInterval(j7);
        return this;
    }

    public LogStrategyBuilder setMid(long j7) {
        this.mStrategy.addMid(j7);
        return this;
    }

    public LogStrategyBuilder setReportHint(String str) {
        this.mStrategy.addReportHint(str);
        return this;
    }

    public LogStrategyBuilder setReportTag(String str) {
        this.mStrategy.addReportTag(str);
        return this;
    }
}
