package com.bilibili.sistersplayer.hls;

import kotlin.coroutines.jvm.internal.Boxing;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/hls/b.class */
public final /* synthetic */ class b {
    public static void a(FetchErrorCode fetchErrorCode, FetchResult fetchResult) {
        fetchResult.setResCode(Boxing.boxInt(fetchErrorCode.getEc()));
    }
}
