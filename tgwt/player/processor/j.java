package com.bilibili.tgwt.player.processor;

import kotlin.jvm.internal.Intrinsics;
import tv.danmaku.biliplayerv2.service.FunctionWidgetToken;
import tv.danmaku.biliplayerv2.service.I;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/player/processor/j.class */
public final class j implements I {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f111658a;

    public j(k kVar) {
        this.f111658a = kVar;
    }

    public final void onWidgetDismiss(FunctionWidgetToken functionWidgetToken) {
        if (Intrinsics.areEqual(functionWidgetToken.getClazz(), com.bilibili.tgwt.player.widget.a.class)) {
            this.f111658a.f111659a.j();
        }
    }

    public final void onWidgetShow(FunctionWidgetToken functionWidgetToken) {
    }
}
