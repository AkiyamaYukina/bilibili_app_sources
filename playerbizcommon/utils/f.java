package com.bilibili.playerbizcommon.utils;

import com.bilibili.lib.media.resource.MediaResource;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/utils/f.class */
public final class f {
    public static final boolean a(@Nullable MediaResource mediaResource) {
        boolean z6 = true;
        if ((mediaResource == null || !mediaResource.isHdr()) && (mediaResource == null || !mediaResource.isDolbyVision())) {
            z6 = false;
        }
        return z6;
    }
}
