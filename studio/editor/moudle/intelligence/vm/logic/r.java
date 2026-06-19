package com.bilibili.studio.editor.moudle.intelligence.vm.logic;

import com.bilibili.studio.editor.moudle.intelligence.vm.logic.C6581s;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/vm/logic/r.class */
public final /* synthetic */ class r implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f107853a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f107854b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Function2 f107855c;

    public /* synthetic */ r(String str, long j7, Function2 function2) {
        this.f107853a = j7;
        this.f107854b = str;
        this.f107855c = function2;
    }

    public final Object invoke(Object obj, Object obj2) {
        String str = (String) obj;
        String str2 = (String) obj2;
        StringBuilder sb = new StringBuilder("download children materials [failed]. downloadTaskId: ");
        G0.d.a(this.f107853a, ", r1: ", str, sb);
        sb.append(", r2: ");
        sb.append(str2);
        BLog.d("MATERIAL_DOWNLOAD.IntelligenceDataSource", sb.toString());
        String str3 = str;
        if (str == null) {
            str3 = "";
        }
        String str4 = str2;
        if (str2 == null) {
            str4 = "";
        }
        Map<String, Long> map = C6581s.a.f107860a;
        C6581s.a.a(this.f107854b, "fail", str3, str4);
        this.f107855c.invoke(str3, str4);
        return Unit.INSTANCE;
    }
}
