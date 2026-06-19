package com.bilibili.upper.module.manuscript.activity;

import android.os.Bundle;
import com.bilibili.lib.blrouter.MutableBundleLike;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/manuscript/activity/C.class */
public final /* synthetic */ class C implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f113414a;

    public final Object invoke(Object obj) {
        int i7 = TranscodeProblemShowActivity.f113522G;
        Bundle bundle = new Bundle();
        bundle.putLong("key_video_aid", this.f113414a);
        bundle.putInt("FROM_WHERE", 5);
        ((MutableBundleLike) obj).put("param_control", bundle);
        return Unit.INSTANCE;
    }
}
