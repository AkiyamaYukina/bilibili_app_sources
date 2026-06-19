package com.bilibili.upper.module.cover.ui;

import android.os.Bundle;
import com.bilibili.lib.blrouter.MutableBundleLike;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/cover/ui/b.class */
public final /* synthetic */ class b implements Function1 {
    public final Object invoke(Object obj) {
        int i7 = UpperCoverEditorActivity.f112688Y;
        Bundle bundle = new Bundle();
        bundle.putInt("SELECT_TYPE", 1);
        ((MutableBundleLike) obj).put("param_control", bundle);
        return Unit.INSTANCE;
    }
}
