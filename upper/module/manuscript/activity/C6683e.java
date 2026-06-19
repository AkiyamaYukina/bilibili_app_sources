package com.bilibili.upper.module.manuscript.activity;

import android.os.Bundle;
import com.bilibili.lib.blrouter.MutableBundleLike;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.bilibili.upper.module.manuscript.activity.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/manuscript/activity/e.class */
public final /* synthetic */ class C6683e implements Function1 {
    public final Object invoke(Object obj) {
        int i7 = ArchiveManagerActivity.f113400K;
        Bundle bundle = new Bundle();
        bundle.putBoolean("EXTRA_ONLY_VIDEO", false);
        bundle.putInt("extra_jump_from", 2);
        ((MutableBundleLike) obj).put("param_control", bundle);
        return null;
    }
}
