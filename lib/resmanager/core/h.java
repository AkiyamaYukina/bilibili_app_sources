package com.bilibili.lib.resmanager.core;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/resmanager/core/h.class */
public final class h {
    @NotNull
    public static final g a(@NotNull CacheEntry cacheEntry) {
        boolean zIsCleanable = cacheEntry.isCleanable();
        int i7 = zIsCleanable ? 1 : 0;
        if (cacheEntry.getEncryptMode() == 1) {
            i7 = (zIsCleanable ? 1 : 0) | 2;
        }
        String fileKey = cacheEntry.getFileKey();
        String str = fileKey;
        if (fileKey == null) {
            str = "";
        }
        return new g(str, cacheEntry.getCtime(), cacheEntry.getLocation(), cacheEntry.getAccessCount(), cacheEntry.getAccessTime(), cacheEntry.getSize(), cacheEntry.getBizType(), i7 == true ? 1 : 0);
    }

    @NotNull
    public static final CacheEntry b(@NotNull g gVar) {
        CacheEntry cacheEntry = new CacheEntry();
        cacheEntry.setFileKey(gVar.f64305a);
        cacheEntry.setCtime(gVar.f64306b);
        cacheEntry.setLocation(gVar.f64307c);
        cacheEntry.setAccessCount(gVar.f64308d);
        cacheEntry.setAccessTime(gVar.f64309e);
        int i7 = gVar.h;
        boolean z6 = false;
        cacheEntry.setEncryptMode((i7 & 2) == 2 ? 1 : 0);
        if ((i7 & 1) == 1) {
            z6 = true;
        }
        cacheEntry.setCleanable(z6);
        cacheEntry.setBizType(gVar.f64311g);
        cacheEntry.setSize(gVar.f64310f);
        return cacheEntry;
    }
}
