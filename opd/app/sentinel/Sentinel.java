package com.bilibili.opd.app.sentinel;

import android.content.Context;
import android.text.TextUtils;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/sentinel/Sentinel.class */
public class Sentinel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static SentinelXXX f74681a;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/sentinel/Sentinel$Builder.class */
    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f74682a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public CollectConfig f74683b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Reporter f74684c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f74685d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f74686e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public String f74687f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f74688g;
        public boolean h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f74689i = true;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Context f74690j;

        @Deprecated
        public Builder() {
        }

        public SentinelXXX build() {
            SentinelXXX sentinelXXX = new SentinelXXX(this.f74690j, this.f74682a, this.f74683b, this.f74684c, this.f74687f, this.f74685d, this.f74688g, this.h);
            sentinelXXX.enable(this.f74689i);
            sentinelXXX.setLocalBuvid(this.f74686e);
            return sentinelXXX;
        }

        public Builder collectConfig(CollectConfig collectConfig) {
            this.f74683b = collectConfig;
            return this;
        }

        public Builder debug(boolean z6) {
            this.f74688g = z6;
            return this;
        }

        public Builder duid(String str) {
            this.f74685d = str;
            return this;
        }

        public Builder enable(boolean z6) {
            this.f74689i = z6;
            return this;
        }

        public Builder forceReport(boolean z6) {
            this.h = z6;
            return this;
        }

        public Builder localBuvid(String str) {
            this.f74686e = str;
            return this;
        }

        public Builder mid(String str) {
            this.f74687f = str;
            return this;
        }

        public Builder productKey(String str) {
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException();
            }
            this.f74682a = str;
            return this;
        }

        public Builder reporter(Reporter reporter) {
            this.f74684c = reporter;
            return this;
        }
    }

    public static void addFilter(b bVar) {
        f74681a.addFilter(bVar);
    }

    public static void addFilterFirst(b bVar) {
        f74681a.addFilterFirst(bVar);
    }

    public static void addFilterLast(b bVar) {
        f74681a.addFilterLast(bVar);
    }

    @Deprecated
    public static Builder builder() {
        return new Builder();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.bilibili.opd.app.sentinel.Sentinel$Builder, java.lang.Object] */
    public static Builder builder(Context context) {
        ?? obj = new Object();
        obj.f74689i = true;
        obj.f74690j = context;
        return obj;
    }

    public static Log customLog(String str, String str2) {
        return f74681a.customLog(str, str2);
    }

    public static void d(String str, String str2) {
        f74681a.d(str, str2);
    }

    public static void d(String str, String str2, Throwable th) {
        f74681a.d(str, str2, th);
    }

    public static void e(String str, String str2) {
        f74681a.e(str, str2);
    }

    public static void e(String str, String str2, Throwable th) {
        f74681a.e(str, str2, th);
    }

    public static void enable(boolean z6) {
        SentinelXXX sentinelXXX = f74681a;
        if (sentinelXXX != null) {
            sentinelXXX.enable(z6);
        }
    }

    public static void endEvent(String str, String str2) {
        f74681a.endEvent(str, str2);
    }

    public static void init(Context context, String str, CollectConfig collectConfig, Reporter reporter, String str2, String str3, boolean z6, boolean z7) {
        SentinelXXX sentinelXXX = new SentinelXXX(context, str, collectConfig, reporter, str2, str3, z6, z7);
        f74681a = sentinelXXX;
        sentinelXXX.enable(true);
    }

    public static void init(Context context, String str, String str2, String str3) {
        SentinelXXX sentinelXXX = new SentinelXXX(context, str, null, null, str2, str3, false, false);
        f74681a = sentinelXXX;
        sentinelXXX.enable(true);
    }

    @Deprecated
    public static void init(String str, CollectConfig collectConfig, Reporter reporter, String str2, String str3, boolean z6, boolean z7) {
        SentinelXXX sentinelXXX = new SentinelXXX(str, collectConfig, reporter, str2, str3, z6, z7);
        f74681a = sentinelXXX;
        sentinelXXX.enable(true);
    }

    @Deprecated
    public static void init(String str, String str2, String str3) {
        SentinelXXX sentinelXXX = new SentinelXXX(str, null, null, str2, str3, false, false);
        f74681a = sentinelXXX;
        sentinelXXX.enable(true);
    }

    public static SentinelXXX mid(String str) {
        f74681a.mid(str);
        return f74681a;
    }

    public static void monitorCount(String str, String str2) {
        f74681a.monitorCount(str, str2);
    }

    public static void monitorSucRate(String str, String str2, boolean z6) {
        f74681a.monitorSucRate(str, str2, z6);
    }

    public static void traceEvent(String str, String str2) {
        f74681a.traceEvent(str, str2);
    }
}
