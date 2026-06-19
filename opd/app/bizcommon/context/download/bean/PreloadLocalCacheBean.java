package com.bilibili.opd.app.bizcommon.context.download.bean;

import androidx.annotation.Keep;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/context/download/bean/PreloadLocalCacheBean.class */
@Keep
public final class PreloadLocalCacheBean {

    @Nullable
    private Long cacheTime;

    @Nullable
    private Long duration;

    @Nullable
    private Map<String, String> headers;

    @Nullable
    private String link;

    @Nullable
    private String md5;

    @Nullable
    private String resourceType;

    public PreloadLocalCacheBean() {
    }

    public PreloadLocalCacheBean(@Nullable String str, @Nullable Long l7, @Nullable Long l8, @Nullable String str2, @Nullable String str3) {
        this.link = str;
        this.cacheTime = l7;
        this.duration = l8;
        this.resourceType = str2;
        this.md5 = str3;
    }

    public boolean equals(@Nullable Object obj) {
        PreloadLocalCacheBean preloadLocalCacheBean = obj instanceof PreloadLocalCacheBean ? (PreloadLocalCacheBean) obj : null;
        boolean z6 = false;
        if (preloadLocalCacheBean != null) {
            z6 = false;
            if (Intrinsics.areEqual(preloadLocalCacheBean.link, this.link)) {
                z6 = false;
                if (Intrinsics.areEqual(preloadLocalCacheBean.resourceType, this.resourceType)) {
                    z6 = true;
                }
            }
        }
        return z6;
    }

    @Nullable
    public final Long getCacheTime() {
        return this.cacheTime;
    }

    @Nullable
    public final Long getDuration() {
        return this.duration;
    }

    @Nullable
    public final Map<String, String> getHeaders() {
        return this.headers;
    }

    @Nullable
    public final String getLink() {
        return this.link;
    }

    @Nullable
    public final String getMd5() {
        return this.md5;
    }

    @Nullable
    public final String getResourceType() {
        return this.resourceType;
    }

    public int hashCode() {
        String str = this.link;
        int iHashCode = 0;
        int iHashCode2 = str != null ? str.hashCode() : 0;
        String str2 = this.resourceType;
        if (str2 != null) {
            iHashCode = str2.hashCode();
        }
        return (iHashCode2 * 31) + iHashCode;
    }

    public final void setCacheTime(@Nullable Long l7) {
        this.cacheTime = l7;
    }

    public final void setDuration(@Nullable Long l7) {
        this.duration = l7;
    }

    public final void setHeaders(@Nullable Map<String, String> map) {
        this.headers = map;
    }

    public final void setLink(@Nullable String str) {
        this.link = str;
    }

    public final void setMd5(@Nullable String str) {
        this.md5 = str;
    }

    public final void setResourceType(@Nullable String str) {
        this.resourceType = str;
    }
}
