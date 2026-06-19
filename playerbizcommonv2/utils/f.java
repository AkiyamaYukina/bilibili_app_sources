package com.bilibili.playerbizcommonv2.utils;

import android.view.View;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.service.IControlContainerService;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/utils/f.class */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f81913a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final boolean f81914b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final boolean f81915c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f81916d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f81917e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final Lazy f81918f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final Lazy f81919g;

    @NotNull
    public static final Lazy h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public static final Lazy f81920i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public static final Lazy f81921j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public static final Lazy f81922k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public static final Lazy f81923l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public static final Lazy f81924m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public static final Lazy f81925n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final boolean f81926o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final boolean f81927p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final boolean f81928q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final boolean f81929r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final boolean f81930s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final boolean f81931t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final boolean f81932u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f81933v;

    /* JADX WARN: Removed duplicated region for block: B:92:0x0200  */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.jvm.functions.Function0] */
    static {
        /*
            Method dump skipped, instruction units count: 543
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playerbizcommonv2.utils.f.m8355clinit():void");
    }

    public static final void a() {
        f81918f.getValue();
        Unit unit = Unit.INSTANCE;
    }

    public static final boolean b() {
        return ((Boolean) f81924m.getValue()).booleanValue();
    }

    public static final int c() {
        return ((Number) f81919g.getValue()).intValue();
    }

    @Nullable
    public static final Object d(@NotNull View view, @NotNull IControlContainerService iControlContainerService, boolean z6, @NotNull Function0 function0, @NotNull SuspendLambda suspendLambda) {
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new ControlContainerDDUtilsKt$millisecondsActive$2(view, z6, function0, iControlContainerService, null), suspendLambda);
        return objCoroutineScope == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCoroutineScope : Unit.INSTANCE;
    }
}
