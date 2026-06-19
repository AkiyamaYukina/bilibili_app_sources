package com.bilibili.upper.module.datacollect;

import G3.C1942p0;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/datacollect/a.class */
@StabilityInferred(parameters = 0)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Lazy f113079a = LazyKt.lazy(new C1942p0(12));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final Lazy f113080b = LazyKt.lazy(new EK0.a(11));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final Lazy f113081c = LazyKt.lazy(new EK0.b(10));

    public static void a() {
        d dVar = (d) f113080b.getValue();
        Lazy lazy = f113079a;
        BuildersKt.launch$default((Yv0.e) dVar.f113083a.getValue(), Dispatchers.getIO(), (CoroutineStart) null, new UpperDraftCollect$checkDraftUpload$1(dVar, (c) lazy.getValue(), null), 2, (Object) null);
        e eVar = (e) f113081c.getValue();
        BuildersKt.launch$default((Yv0.e) eVar.f113086a.getValue(), Dispatchers.getIO(), (CoroutineStart) null, new UpperMaterialCollect$checkMaterialUpload$1(eVar, (c) lazy.getValue(), null), 2, (Object) null);
    }
}
