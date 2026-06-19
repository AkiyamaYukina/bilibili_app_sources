package com.bilibili.lib.resmanager;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/resmanager/DownloadBizType.class */
public final class DownloadBizType {
    private static final EnumEntries $ENTRIES;
    private static final DownloadBizType[] $VALUES;
    public static final DownloadBizType BrandSplash;
    public static final DownloadBizType Default;
    public static final DownloadBizType EffectSplash;
    public static final DownloadBizType SearchEgg;
    public static final DownloadBizType Splash;
    private final long size;

    private static final /* synthetic */ DownloadBizType[] $values() {
        return new DownloadBizType[]{Default, Splash, EffectSplash, BrandSplash, SearchEgg};
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x019f  */
    static {
        /*
            Method dump skipped, instruction units count: 452
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.lib.resmanager.DownloadBizType.m6704clinit():void");
    }

    private DownloadBizType(String str, int i7, long j7) {
        this.size = j7;
    }

    @NotNull
    public static EnumEntries<DownloadBizType> getEntries() {
        return $ENTRIES;
    }

    public static DownloadBizType valueOf(String str) {
        return (DownloadBizType) Enum.valueOf(DownloadBizType.class, str);
    }

    public static DownloadBizType[] values() {
        return (DownloadBizType[]) $VALUES.clone();
    }

    public final long getMaxSize() {
        long j7 = 1024;
        return this.size * j7 * j7;
    }

    public final long getMaxSizeMB() {
        return this.size;
    }
}
