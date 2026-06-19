package com.bilibili.upper.module.cover.ui;

import android.os.Bundle;
import com.bilibili.lib.blrouter.MutableBundleLike;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/cover/ui/l.class */
public final /* synthetic */ class l implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f112770a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f112771b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f112772c;

    public /* synthetic */ l(boolean z6, String str, String str2) {
        this.f112770a = z6;
        this.f112771b = str;
        this.f112772c = str2;
    }

    public final Object invoke(Object obj) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("key_show_main_cover", this.f112770a);
        bundle.putString("key_main_cover_path", this.f112771b);
        bundle.putString("key_sub_cover_path", this.f112772c);
        ((MutableBundleLike) obj).put("param_control", bundle);
        return Unit.INSTANCE;
    }
}
