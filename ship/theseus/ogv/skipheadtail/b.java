package com.bilibili.ship.theseus.ogv.skipheadtail;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import tv.danmaku.biliplayerv2.widget.toast.PlayerToast;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/skipheadtail/b.class */
public final class b implements PlayerToast.MessageClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Function0<Unit> f94539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function0<Unit> f94540b;

    public b(Function0<Unit> function0, Function0<Unit> function02) {
        this.f94539a = function0;
        this.f94540b = function02;
    }

    public final void onActionWithCollapse(int i7, boolean z6) {
        Function0<Unit> function0 = this.f94539a;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public final void onDismiss() {
        Function0<Unit> function0 = this.f94540b;
        if (function0 != null) {
            function0.invoke();
        }
    }
}
