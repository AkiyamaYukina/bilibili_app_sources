package com.bilibili.ogv.infra.android.view;

import android.view.ViewGroup;
import android.view.ViewParent;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/infra/android/view/a.class */
public final /* synthetic */ class a implements Function1 {
    public final Object invoke(Object obj) {
        ViewParent viewParent = (ViewParent) obj;
        return viewParent instanceof ViewGroup ? (ViewGroup) viewParent : null;
    }
}
