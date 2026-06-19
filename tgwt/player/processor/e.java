package com.bilibili.tgwt.player.processor;

import dr0.ViewOnClickListenerC6833a;
import kotlin.jvm.internal.Intrinsics;
import tv.danmaku.biliplayerv2.service.FunctionWidgetToken;
import tv.danmaku.biliplayerv2.service.I;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/player/processor/e.class */
public final class e implements I {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f111640a;

    public e(f fVar) {
        this.f111640a = fVar;
    }

    public final void onWidgetDismiss(FunctionWidgetToken functionWidgetToken) {
        boolean zAreEqual = Intrinsics.areEqual(functionWidgetToken.getClazz(), ViewOnClickListenerC6833a.class);
        f fVar = this.f111640a;
        if (zAreEqual) {
            fVar.f111643c.f110933z = false;
            return;
        }
        int i7 = fVar.f111645e - 1;
        fVar.f111645e = i7;
        if (i7 == 0) {
            fVar.b();
        }
    }

    public final void onWidgetShow(FunctionWidgetToken functionWidgetToken) {
        boolean zAreEqual = Intrinsics.areEqual(functionWidgetToken.getClazz(), ViewOnClickListenerC6833a.class);
        f fVar = this.f111640a;
        if (zAreEqual) {
            fVar.f111643c.f110933z = true;
        } else {
            fVar.f111645e++;
            fVar.a();
        }
    }
}
