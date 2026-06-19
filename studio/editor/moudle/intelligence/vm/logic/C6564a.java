package com.bilibili.studio.editor.moudle.intelligence.vm.logic;

import com.bilibili.studio.editor.asr.bean.AsrExtraMsg;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function2;
import tv.danmaku.android.log.BLog;
import zz0.C9270a;

/* JADX INFO: renamed from: com.bilibili.studio.editor.moudle.intelligence.vm.logic.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/vm/logic/a.class */
public final /* synthetic */ class C6564a implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C6571h f107790a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f107791b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.bilibili.studio.editor.moudle.intelligence.vm.o f107792c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f107793d;

    public /* synthetic */ C6564a(C6571h c6571h, String str, com.bilibili.studio.editor.moudle.intelligence.vm.o oVar, long j7) {
        this.f107790a = c6571h;
        this.f107791b = str;
        this.f107792c = oVar;
        this.f107793d = j7;
    }

    public final Object invoke(Object obj, Object obj2) {
        C6571h c6571h = this.f107790a;
        String str = this.f107791b;
        com.bilibili.studio.editor.moudle.intelligence.vm.o oVar = this.f107792c;
        long j7 = this.f107793d;
        Bw0.a aVar = (Bw0.a) obj;
        AsrExtraMsg asrExtraMsg = (AsrExtraMsg) obj2;
        c6571h.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis() - j7;
        BLog.e("SmartMusic", "startASR onSuccess =" + aVar + ",costTime=" + jCurrentTimeMillis);
        c6571h.f107819j = true;
        if (aVar == null) {
            C9270a.a(c6571h, str, "fast_asr", jCurrentTimeMillis, false, "audioTypeLabel and audioUseLabel is empty", null, null, 224);
            c6571h.h = null;
            c6571h.e(oVar, j7);
        } else {
            int fastAsrResult = asrExtraMsg.getFastAsrResult();
            c6571h.f107820k = fastAsrResult;
            C9270a.a(c6571h, str, "fast_asr", jCurrentTimeMillis, fastAsrResult == 1 || fastAsrResult == 3 || fastAsrResult == 4, asrExtraMsg.getMsgForReport(), null, MapsKt.mapOf(TuplesKt.to("complete_success", fastAsrResult == 1 || fastAsrResult == 4 ? "1" : "0")), 96);
            c6571h.h = aVar;
            c6571h.e(oVar, j7);
        }
        c6571h.f107816f = 2;
        return Unit.INSTANCE;
    }
}
