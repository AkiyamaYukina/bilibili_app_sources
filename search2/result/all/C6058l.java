package com.bilibili.search2.result.all;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.bilibili.search2.result.all.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/all/l.class */
@StabilityInferred(parameters = 0)
public final class C6058l {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final KProperty<Object>[] f87297f = {new MutablePropertyReference1Impl(C6058l.class, "startTime", "getStartTime()J", 0), new MutablePropertyReference1Impl(C6058l.class, "netStart", "getNetStart()J", 0), new MutablePropertyReference1Impl(C6058l.class, "netEnd", "getNetEnd()J", 0), new MutablePropertyReference1Impl(C6058l.class, "fragmentStart", "getFragmentStart()J", 0), new MutablePropertyReference1Impl(C6058l.class, "endTime", "getEndTime()J", 0)};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final C6055i f87298a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final C6055i f87299b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final C6055i f87300c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final C6055i f87301d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final C6055i f87302e = new Object();

    public final long a() {
        KProperty<Object> kProperty = f87297f[1];
        return this.f87299b.a().longValue();
    }

    @NotNull
    public final String toString() {
        KProperty<Object>[] kPropertyArr = f87297f;
        KProperty<Object> kProperty = kPropertyArr[4];
        long jLongValue = this.f87302e.a().longValue();
        KProperty<Object> kProperty2 = kPropertyArr[0];
        long jLongValue2 = this.f87298a.a().longValue();
        KProperty<Object> kProperty3 = kPropertyArr[2];
        long jLongValue3 = this.f87300c.a().longValue();
        long jA = a();
        StringBuilder sbA = androidx.compose.runtime.snapshots.z.a(jLongValue - jLongValue2, "allUseTime=", ",netTime=");
        sbA.append(jLongValue3 - jA);
        return sbA.toString();
    }
}
