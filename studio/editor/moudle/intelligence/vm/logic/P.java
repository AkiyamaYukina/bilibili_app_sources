package com.bilibili.studio.editor.moudle.intelligence.vm.logic;

import com.bilibili.studio.editor.moudle.intelligence.vm.logic.T;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/vm/logic/P.class */
public final /* synthetic */ class P implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T f107755a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final T.a f107756b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f107757c;

    public /* synthetic */ P(T t7, T.a aVar, long j7) {
        this.f107755a = t7;
        this.f107756b = aVar;
        this.f107757c = j7;
    }

    public final Object invoke(Object obj, Object obj2) {
        int iIntValue = ((Integer) obj).intValue();
        T t7 = this.f107755a;
        BLog.e("intelligence_tag", "[智能成片][" + t7.h() + "][最终] 失败 重试次数=" + iIntValue);
        StringBuilder sb = new StringBuilder("下载模板资源失败, ");
        sb.append((String) obj2);
        t7.j(iIntValue, sb.toString(), false);
        this.f107756b.b(System.currentTimeMillis() - this.f107757c, "应用智能模板失败");
        return Unit.INSTANCE;
    }
}
