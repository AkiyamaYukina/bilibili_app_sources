package com.bilibili.playset;

import android.text.TextUtils;
import com.bilibili.lib.blrouter.MutableBundleLike;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.bilibili.playset.r0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/r0.class */
public final /* synthetic */ class C6000r0 implements Function1 {
    public final Object invoke(Object obj) {
        MutableBundleLike mutableBundleLike = (MutableBundleLike) obj;
        if (TextUtils.isEmpty("main.my-favorite.0.0")) {
            return null;
        }
        mutableBundleLike.put("from_spmid", "main.my-favorite.0.0");
        return null;
    }
}
