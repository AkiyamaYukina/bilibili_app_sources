package com.bilibili.lib.resmanager.core;

import androidx.annotation.Keep;
import androidx.fragment.app.D;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/resmanager/core/CacheEntry.class */
@Keep
public final class CacheEntry {
    private int accessCount;
    private long accessTime;
    private long ctime;
    private int encryptMode;
    private long size;

    @Nullable
    private String fileKey = "";

    @Nullable
    private String location = "";
    private boolean isCleanable = true;

    @NotNull
    private String bizType = "";

    public final int getAccessCount() {
        return this.accessCount;
    }

    public final long getAccessTime() {
        return this.accessTime;
    }

    @NotNull
    public final String getBizType() {
        return this.bizType;
    }

    public final long getCtime() {
        return this.ctime;
    }

    public final int getEncryptMode() {
        return this.encryptMode;
    }

    @Nullable
    public final String getFileKey() {
        return this.fileKey;
    }

    @Nullable
    public final String getLocation() {
        return this.location;
    }

    public final long getSize() {
        return this.size;
    }

    public final boolean isCleanable() {
        return this.isCleanable;
    }

    public final void setAccessCount(int i7) {
        this.accessCount = i7;
    }

    public final void setAccessTime(long j7) {
        this.accessTime = j7;
    }

    public final void setBizType(@NotNull String str) {
        this.bizType = str;
    }

    public final void setCleanable(boolean z6) {
        this.isCleanable = z6;
    }

    public final void setCtime(long j7) {
        this.ctime = j7;
    }

    public final void setEncryptMode(int i7) {
        this.encryptMode = i7;
    }

    public final void setFileKey(@Nullable String str) {
        this.fileKey = str;
    }

    public final void setLocation(@Nullable String str) {
        this.location = str;
    }

    public final void setSize(long j7) {
        this.size = j7;
    }

    @NotNull
    public String toString() {
        String str = this.fileKey;
        long j7 = this.ctime;
        String str2 = this.location;
        int i7 = this.accessCount;
        int i8 = this.encryptMode;
        long j8 = this.size;
        boolean z6 = this.isCleanable;
        String str3 = this.bizType;
        StringBuilder sbA = com.bilibili.playerbizcommon.features.background.b.a(j7, "CacheEntry(fileKey=", str, ", ctime=");
        bf.a.a(i7, ", location=", str2, ", accessCount=", sbA);
        N1.c.a(i8, ", encryptMode=", ", size=", sbA);
        com.bilibili.bplus.followingpublish.fragments.publish.c.a(j8, ", isCleanable=", sbA, z6);
        return D.a(", bizType='", str3, "')", sbA);
    }
}
