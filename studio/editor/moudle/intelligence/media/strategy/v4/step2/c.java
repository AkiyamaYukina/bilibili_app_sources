package com.bilibili.studio.editor.moudle.intelligence.media.strategy.v4.step2;

import com.bilibili.studio.editor.moudle.intelligence.media.strategy.bean.MediaStrategyItem;
import kotlin.jvm.functions.Function1;
import x0.C8948c;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/media/strategy/v4/step2/c.class */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f107528a;

    public final Object invoke(Object obj) {
        switch (this.f107528a) {
            case 0:
                return ((MediaStrategyItem) obj).getMaterialKey();
            default:
                return new C8948c(((Integer) obj).intValue());
        }
    }
}
