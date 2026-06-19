package com.bilibili.lib.projection.internal.widget;

import com.bilibili.base.BiliContext;
import com.bilibili.droid.ToastHelper;
import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/widget/k.class */
public final class k<T> implements Consumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k<T> f64100a = (k<T>) new Object();

    public final void accept(Object obj) {
        ToastHelper.showToast(BiliContext.application(), "连接已断开", 0, 17);
    }
}
