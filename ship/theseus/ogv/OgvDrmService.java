package com.bilibili.ship.theseus.ogv;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.droid.ToastHelper;
import com.bilibili.lib.media.resource.MediaResource;
import com.bilibili.lib.media.resource.PlayIndex;
import com.bilibili.okretro.ServiceGenerator;
import com.bilibili.player.tangram.playercore.A;
import com.bilibili.ship.theseus.united.page.drm.DrmType;
import ev0.InterfaceC7008a;
import javax.inject.Inject;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;
import vl0.C8833a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/OgvDrmService.class */
@StabilityInferred(parameters = 0)
public final class OgvDrmService {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public static Boolean f91267k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f91268a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final InterfaceC7008a f91269b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f91270c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f91271d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f91272e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final DrmType f91273f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.keel.player.h f91274g;

    @NotNull
    public final com.bilibili.ship.theseus.keel.player.j h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final ev0.j f91275i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final p f91276j = (p) ServiceGenerator.createService(p.class);

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.OgvDrmService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/OgvDrmService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<A.b, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;
        final OgvDrmService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(OgvDrmService ogvDrmService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = ogvDrmService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        public final Object invoke(A.b bVar, Continuation<? super Unit> continuation) {
            return create(bVar, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            int i7;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            A.b bVar = (A.b) this.L$0;
            if (!Intrinsics.areEqual(C8833a.f128290b, this.this$0.f91273f.name()) && ((i7 = bVar.f79327b) == 13000 || i7 == 13001)) {
                C8833a.f128290b = this.this$0.f91273f.name();
                this.this$0.f91269b.a();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.OgvDrmService$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/OgvDrmService$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final OgvDrmService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(OgvDrmService ogvDrmService, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = ogvDrmService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                OgvDrmService ogvDrmService = this.this$0;
                this.label = 1;
                ogvDrmService.getClass();
                Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new OgvDrmService$startCheck$2(ogvDrmService, null), this);
                if (objCoroutineScope != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    objCoroutineScope = Unit.INSTANCE;
                }
                if (objCoroutineScope == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.OgvDrmService$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/OgvDrmService$3.class */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final OgvDrmService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(OgvDrmService ogvDrmService, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.this$0 = ogvDrmService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass3(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                OgvDrmService ogvDrmService = this.this$0;
                this.label = 1;
                ogvDrmService.getClass();
                Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new OgvDrmService$downgradeDrmIfNeeded$2(ogvDrmService, null), this);
                if (objCoroutineScope != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    objCoroutineScope = Unit.INSTANCE;
                }
                if (objCoroutineScope == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/OgvDrmService$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f91277a;

        static {
            int[] iArr = new int[DrmType.values().length];
            try {
                iArr[DrmType.BILI_DRM.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            f91277a = iArr;
        }
    }

    @Inject
    public OgvDrmService(@NotNull Context context, @NotNull InterfaceC7008a interfaceC7008a, long j7, long j8, @NotNull CoroutineScope coroutineScope, @NotNull DrmType drmType, @NotNull com.bilibili.ship.theseus.keel.player.h hVar, @NotNull com.bilibili.ship.theseus.keel.player.j jVar, @NotNull ev0.j jVar2) {
        MediaResource mediaResource;
        PlayIndex playIndex;
        this.f91268a = context;
        this.f91269b = interfaceC7008a;
        this.f91270c = j7;
        this.f91271d = j8;
        this.f91272e = coroutineScope;
        this.f91273f = drmType;
        this.f91274g = hVar;
        this.h = jVar;
        this.f91275i = jVar2;
        com.bilibili.player.tangram.playercore.u uVarO = jVar.o();
        if (Intrinsics.areEqual((uVarO == null || (mediaResource = uVarO.f79460c) == null || (playIndex = mediaResource.getPlayIndex()) == null) ? null : playIndex.mFrom, "downloaded")) {
            BLog.i("OgvDrmService-<init>", "[theseus-ogv-OgvDrmService-<init>] playing downloaded resource, skip drm check");
            return;
        }
        if (Intrinsics.areEqual(C8833a.f128290b, "BILI_DRM")) {
            C8833a.f128290b = "WIDE_VINE";
        }
        final Flow<com.bilibili.player.tangram.playercore.A> flowV = jVar.v();
        FlowKt.launchIn(FlowKt.onEach(new Flow<Object>(flowV) { // from class: com.bilibili.ship.theseus.ogv.OgvDrmService$special$$inlined$filterIsInstance$1

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Flow f91278a;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.OgvDrmService$special$$inlined$filterIsInstance$1$2, reason: invalid class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/OgvDrmService$special$$inlined$filterIsInstance$1$2.class */
            public static final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final FlowCollector f91279a;

                /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.OgvDrmService$special$$inlined$filterIsInstance$1$2$1, reason: invalid class name */
                /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/OgvDrmService$special$$inlined$filterIsInstance$1$2$1.class */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    Object L$1;
                    int label;
                    Object result;
                    final AnonymousClass2 this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public AnonymousClass1(AnonymousClass2 anonymousClass2, Continuation continuation) {
                        super(continuation);
                        this.this$0 = anonymousClass2;
                    }

                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return this.this$0.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.f91279a = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(java.lang.Object r6, kotlin.coroutines.Continuation r7) {
                    /*
                        r5 = this;
                        r0 = r7
                        boolean r0 = r0 instanceof com.bilibili.ship.theseus.ogv.OgvDrmService$special$$inlined$filterIsInstance$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L29
                        r0 = r7
                        com.bilibili.ship.theseus.ogv.OgvDrmService$special$$inlined$filterIsInstance$1$2$1 r0 = (com.bilibili.ship.theseus.ogv.OgvDrmService$special$$inlined$filterIsInstance$1.AnonymousClass2.AnonymousClass1) r0
                        r9 = r0
                        r0 = r9
                        int r0 = r0.label
                        r8 = r0
                        r0 = r8
                        r1 = -2147483648(0xffffffff80000000, float:-0.0)
                        r0 = r0 & r1
                        if (r0 == 0) goto L29
                        r0 = r9
                        r1 = r8
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        int r1 = r1 + r2
                        r0.label = r1
                        r0 = r9
                        r7 = r0
                        goto L33
                    L29:
                        com.bilibili.ship.theseus.ogv.OgvDrmService$special$$inlined$filterIsInstance$1$2$1 r0 = new com.bilibili.ship.theseus.ogv.OgvDrmService$special$$inlined$filterIsInstance$1$2$1
                        r1 = r0
                        r2 = r5
                        r3 = r7
                        r1.<init>(r2, r3)
                        r7 = r0
                    L33:
                        r0 = r7
                        java.lang.Object r0 = r0.result
                        r10 = r0
                        java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                        r9 = r0
                        r0 = r7
                        int r0 = r0.label
                        r8 = r0
                        r0 = r8
                        if (r0 == 0) goto L5e
                        r0 = r8
                        r1 = 1
                        if (r0 != r1) goto L54
                        r0 = r10
                        kotlin.ResultKt.throwOnFailure(r0)
                        goto L82
                    L54:
                        java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                        r1 = r0
                        java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                        r1.<init>(r2)
                        throw r0
                    L5e:
                        r0 = r10
                        kotlin.ResultKt.throwOnFailure(r0)
                        r0 = r6
                        boolean r0 = r0 instanceof com.bilibili.player.tangram.playercore.A.b
                        if (r0 == 0) goto L82
                        r0 = r7
                        r1 = 1
                        r0.label = r1
                        r0 = r5
                        kotlinx.coroutines.flow.FlowCollector r0 = r0.f91279a
                        r1 = r6
                        r2 = r7
                        java.lang.Object r0 = r0.emit(r1, r2)
                        r1 = r9
                        if (r0 != r1) goto L82
                        r0 = r9
                        return r0
                    L82:
                        kotlin.Unit r0 = kotlin.Unit.INSTANCE
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ogv.OgvDrmService$special$$inlined$filterIsInstance$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            {
                this.f91278a = flowV;
            }

            public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object objCollect = this.f91278a.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        }, new AnonymousClass1(this, null)), coroutineScope);
        if (drmType.isDrm()) {
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this, null), 3, (Object) null);
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass3(this, null), 3, (Object) null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(com.bilibili.ship.theseus.ogv.OgvDrmService r5, kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            r0 = r5
            java.lang.Class r0 = r0.getClass()
            r0 = r6
            boolean r0 = r0 instanceof com.bilibili.ship.theseus.ogv.OgvDrmService$checkDeviceRooted$1
            if (r0 == 0) goto L2a
            r0 = r6
            com.bilibili.ship.theseus.ogv.OgvDrmService$checkDeviceRooted$1 r0 = (com.bilibili.ship.theseus.ogv.OgvDrmService$checkDeviceRooted$1) r0
            r8 = r0
            r0 = r8
            int r0 = r0.label
            r7 = r0
            r0 = r7
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L2a
            r0 = r8
            r1 = r7
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = r1 + r2
            r0.label = r1
            r0 = r8
            r5 = r0
            goto L34
        L2a:
            com.bilibili.ship.theseus.ogv.OgvDrmService$checkDeviceRooted$1 r0 = new com.bilibili.ship.theseus.ogv.OgvDrmService$checkDeviceRooted$1
            r1 = r0
            r2 = r5
            r3 = r6
            r1.<init>(r2, r3)
            r5 = r0
        L34:
            r0 = r5
            java.lang.Object r0 = r0.result
            r8 = r0
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r6 = r0
            r0 = r5
            int r0 = r0.label
            r7 = r0
            r0 = r7
            if (r0 == 0) goto L5e
            r0 = r7
            r1 = 1
            if (r0 != r1) goto L54
            r0 = r8
            kotlin.ResultKt.throwOnFailure(r0)
            r0 = r8
            r5 = r0
            goto L9c
        L54:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L5e:
            r0 = r8
            kotlin.ResultKt.throwOnFailure(r0)
            java.lang.Boolean r0 = com.bilibili.ship.theseus.ogv.OgvDrmService.f91267k
            r8 = r0
            r0 = r8
            if (r0 == 0) goto L75
            r0 = r8
            boolean r0 = r0.booleanValue()
            java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r0)
            r5 = r0
            goto La9
        L75:
            kotlinx.coroutines.CoroutineDispatcher r0 = kotlinx.coroutines.Dispatchers.getIO()
            r8 = r0
            com.bilibili.ship.theseus.ogv.OgvDrmService$checkDeviceRooted$3 r0 = new com.bilibili.ship.theseus.ogv.OgvDrmService$checkDeviceRooted$3
            r1 = r0
            r2 = 0
            r1.<init>(r2)
            r9 = r0
            r0 = r5
            r1 = 1
            r0.label = r1
            r0 = r8
            r1 = r9
            r2 = r5
            java.lang.Object r0 = kotlinx.coroutines.BuildersKt.withContext(r0, r1, r2)
            r8 = r0
            r0 = r8
            r5 = r0
            r0 = r8
            r1 = r6
            if (r0 != r1) goto L9c
            r0 = r6
            r5 = r0
            goto La9
        L9c:
            r0 = r5
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r0)
            com.bilibili.ship.theseus.ogv.OgvDrmService.f91267k = r0
        La9:
            r0 = r5
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ogv.OgvDrmService.a(com.bilibili.ship.theseus.ogv.OgvDrmService, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public static final void b(OgvDrmService ogvDrmService, String str) {
        if (str != null) {
            ogvDrmService.getClass();
            if (str.length() == 0) {
                return;
            }
        }
        ToastHelper.showToast(ogvDrmService.f91268a, str, 1, 17);
    }
}
