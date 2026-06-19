package com.bilibili.studio.editor.moudle.intelligence.vm.logic;

import com.bilibili.studio.editor.moudle.intelligence.vm.logic.T;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/vm/logic/S.class */
public final /* synthetic */ class S implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T f107764a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final T.a f107765b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f107766c;

    public /* synthetic */ S(T t7, T.a aVar, long j7) {
        this.f107764a = t7;
        this.f107765b = aVar;
        this.f107766c = j7;
    }

    public final Object invoke(Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        T t7 = this.f107764a;
        Pb.E.a("[智能成片][", t7.h(), "][最终] 取消", "intelligence_tag");
        t7.j(iIntValue, "取消", false);
        this.f107765b.b(System.currentTimeMillis() - this.f107766c, "取消应用智能模板");
        return Unit.INSTANCE;
    }
}
