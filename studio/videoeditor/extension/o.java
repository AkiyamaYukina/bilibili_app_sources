package com.bilibili.studio.videoeditor.extension;

import android.view.View;
import kntr.base.android.legacy.context.ContextUtilKt;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/extension/o.class */
public final /* synthetic */ class o implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f109571a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function0 f109572b;

    public /* synthetic */ o(View view, Function0 function0) {
        this.f109571a = view;
        this.f109572b = function0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view = this.f109571a;
        Function0 function0 = this.f109572b;
        if (ActivityExtKt.isActive(ContextUtilKt.findActivityOrNull(view != null ? view.getContext() : null))) {
            function0.invoke();
        }
    }
}
