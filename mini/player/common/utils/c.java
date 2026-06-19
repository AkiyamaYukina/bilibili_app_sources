package com.bilibili.mini.player.common.utils;

import android.view.View;
import android.view.WindowManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/mini/player/common/utils/c.class */
public final /* synthetic */ class c implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f66093a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f66094b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f66095c;

    public /* synthetic */ c(int i7, Object obj, Object obj2) {
        this.f66093a = i7;
        this.f66094b = obj;
        this.f66095c = obj2;
    }

    public final Object invoke() {
        switch (this.f66093a) {
            case 0:
                View view = (View) this.f66094b;
                WindowManager windowManager = (WindowManager) this.f66095c;
                if (view.getParent() != null && windowManager != null) {
                    windowManager.removeView(view);
                }
                break;
            default:
                com.bilibili.studio.editor.asr.core.remote.f fVar = (com.bilibili.studio.editor.asr.core.remote.f) this.f66094b;
                fVar.b((String) this.f66095c, fVar.f105553a);
                break;
        }
        return Unit.INSTANCE;
    }
}
