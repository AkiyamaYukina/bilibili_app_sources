package com.bilibili.playerbizcommonv2.widget.background;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.Lifecycle;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import uq0.InterfaceC8755c;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/background/g.class */
@StabilityInferred(parameters = 0)
public final class g {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static boolean f82315k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public static final Lazy<Integer> f82316l = LazyKt.lazy(new Ej.i(9));

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public static final Lazy<Integer> f82317m = LazyKt.lazy(new Ej.j(8));

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public static final Lazy<Boolean> f82318n = LazyKt.lazy(new Ej.k(8));

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public static final Lazy<Long> f82319o = LazyKt.lazy(new C11.a(9));

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public static final Lazy<Integer> f82320p = LazyKt.lazy(new C11.c(8));

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public static final Lazy<Long> f82321q = LazyKt.lazy(new C21.a(8));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Function0<Boolean> f82322a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Function1<Boolean, Unit> f82323b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Function2<String, Map<String, String>, Unit> f82324c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f82327f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public Job f82328g;

    @Nullable
    public Job h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f82329i;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Boolean> f82325d = StateFlowKt.MutableStateFlow(Boolean.FALSE);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Lazy f82326e = LazyKt.lazy(new C21.b(8));

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final Lazy f82330j = LazyKt.lazy(new C21.c(10));

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/background/g$a.class */
    public static final class a {
        public static final boolean a() {
            boolean z6 = g.f82315k;
            return ((Boolean) g.f82318n.getValue()).booleanValue();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/background/g$b.class */
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f82331a;

        static {
            int[] iArr = new int[Lifecycle.Event.values().length];
            try {
                iArr[Lifecycle.Event.ON_RESUME.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[Lifecycle.Event.ON_STOP.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            f82331a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public g(@NotNull Function0<Boolean> function0, @NotNull Function1<? super Boolean, Unit> function1, @NotNull Function2<? super String, ? super Map<String, String>, Unit> function2) {
        this.f82322a = function0;
        this.f82323b = function1;
        this.f82324c = function2;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(com.bilibili.playerbizcommonv2.widget.background.g r6, boolean r7, kotlin.jvm.functions.Function1 r8, kotlin.jvm.functions.Function3 r9, kotlin.coroutines.jvm.internal.ContinuationImpl r10) {
        /*
            Method dump skipped, instruction units count: 318
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playerbizcommonv2.widget.background.g.a(com.bilibili.playerbizcommonv2.widget.background.g, boolean, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function3, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0025  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(@org.jetbrains.annotations.NotNull kotlin.coroutines.jvm.internal.ContinuationImpl r6) throws kotlin.KotlinNothingValueException {
        /*
            r5 = this;
            r0 = r6
            boolean r0 = r0 instanceof com.bilibili.playerbizcommonv2.widget.background.BackgroundPlayDialogHelper$collectComponentEvent$1
            if (r0 == 0) goto L25
            r0 = r6
            com.bilibili.playerbizcommonv2.widget.background.BackgroundPlayDialogHelper$collectComponentEvent$1 r0 = (com.bilibili.playerbizcommonv2.widget.background.BackgroundPlayDialogHelper$collectComponentEvent$1) r0
            r8 = r0
            r0 = r8
            int r0 = r0.label
            r7 = r0
            r0 = r7
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L25
            r0 = r8
            r1 = r7
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = r1 + r2
            r0.label = r1
            r0 = r8
            r6 = r0
            goto L2f
        L25:
            com.bilibili.playerbizcommonv2.widget.background.BackgroundPlayDialogHelper$collectComponentEvent$1 r0 = new com.bilibili.playerbizcommonv2.widget.background.BackgroundPlayDialogHelper$collectComponentEvent$1
            r1 = r0
            r2 = r5
            r3 = r6
            r1.<init>(r2, r3)
            r6 = r0
        L2f:
            r0 = r6
            java.lang.Object r0 = r0.result
            r9 = r0
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r8 = r0
            r0 = r6
            int r0 = r0.label
            r7 = r0
            r0 = r7
            if (r0 == 0) goto L59
            r0 = r7
            r1 = 1
            if (r0 == r1) goto L51
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L51:
            r0 = r9
            kotlin.ResultKt.throwOnFailure(r0)
            goto L8e
        L59:
            r0 = r9
            kotlin.ResultKt.throwOnFailure(r0)
            r0 = r5
            kotlin.Lazy r0 = r0.f82330j
            java.lang.Object r0 = r0.getValue()
            com.bilibili.playerbizcommonv2.widget.background.c r0 = (com.bilibili.playerbizcommonv2.widget.background.c) r0
            kotlinx.coroutines.flow.SharedFlow<com.bilibili.playerbizcommonv2.widget.background.c$a> r0 = r0.f82304b
            r10 = r0
            com.bilibili.playerbizcommonv2.widget.background.h r0 = new com.bilibili.playerbizcommonv2.widget.background.h
            r1 = r0
            r2 = r5
            r1.<init>(r2)
            r9 = r0
            r0 = r6
            r1 = 1
            r0.label = r1
            r0 = r10
            r1 = r9
            r2 = r6
            java.lang.Object r0 = r0.collect(r1, r2)
            r1 = r8
            if (r0 != r1) goto L8e
            r0 = r8
            return r0
        L8e:
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
            r1 = r0
            r1.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playerbizcommonv2.widget.background.g.b(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Nullable
    public final Object c(@NotNull Function1 function1, @NotNull Function3 function3, @NotNull SuspendLambda suspendLambda) {
        Object objCollectLatest = FlowKt.collectLatest(this.f82325d, new BackgroundPlayDialogHelper$collectDialogState$2(this, function1, function3, null), suspendLambda);
        return objCollectLatest == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollectLatest : Unit.INSTANCE;
    }

    @Nullable
    public final Object d(@NotNull InterfaceC8755c interfaceC8755c, @Nullable Function0 function0, @NotNull SuspendLambda suspendLambda) {
        Object objCollect = FlowKt.callbackFlow(new BackgroundPlayDialogHelper$collectHeadset$2(interfaceC8755c, function0, null)).collect(new j(this), suspendLambda);
        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
    }

    public final tv.danmaku.bili.widget.preference.a e() {
        return (tv.danmaku.bili.widget.preference.a) this.f82326e.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002c  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(@org.jetbrains.annotations.NotNull androidx.lifecycle.Lifecycle.Event r8, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0 r9, @org.jetbrains.annotations.NotNull kotlin.coroutines.jvm.internal.ContinuationImpl r10) {
        /*
            Method dump skipped, instruction units count: 799
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playerbizcommonv2.widget.background.g.f(androidx.lifecycle.Lifecycle$Event, kotlin.jvm.functions.Function0, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
