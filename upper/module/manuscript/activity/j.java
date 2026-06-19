package com.bilibili.upper.module.manuscript.activity;

import android.os.Bundle;
import com.bilibili.lib.blrouter.MutableBundleLike;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/manuscript/activity/j.class */
public final /* synthetic */ class j implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f113544a;

    public final Object invoke(Object obj) {
        int i7 = LimitProblemShowActivity.f113421H;
        Bundle bundle = new Bundle();
        bundle.putLong("key_video_aid", this.f113544a);
        bundle.putInt("FROM_WHERE", 5);
        ((MutableBundleLike) obj).put("param_control", bundle);
        return Unit.INSTANCE;
    }
}
