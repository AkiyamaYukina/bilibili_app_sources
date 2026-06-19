package com.bilibili.ship.theseus.ugc.viewingduration;

import Qi1.a;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.app.gemini.base.player.GeminiCommonPlayableParams;
import com.bilibili.player.tangram.basic.CompoundPlayStateProviderKt;
import com.bilibili.ship.theseus.keel.player.h;
import com.bilibili.ship.theseus.keel.player.j;
import javax.inject.Inject;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/viewingduration/UGCViewingDurationService.class */
@StabilityInferred(parameters = 0)
public final class UGCViewingDurationService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f98551a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final h f98552b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final a f98553c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final a f98554d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public String f98555e = "";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public String f98556f = "";

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.viewingduration.UGCViewingDurationService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/viewingduration/UGCViewingDurationService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final UGCViewingDurationService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.viewingduration.UGCViewingDurationService$1$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/viewingduration/UGCViewingDurationService$1$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final UGCViewingDurationService f98557a;

            public a(UGCViewingDurationService uGCViewingDurationService) {
                this.f98557a = uGCViewingDurationService;
            }

            public final Object emit(Object obj, Continuation continuation) {
                j jVar = (j) obj;
                UGCViewingDurationService uGCViewingDurationService = this.f98557a;
                if (jVar != null) {
                    GeminiCommonPlayableParams geminiCommonPlayableParams = (GeminiCommonPlayableParams) jVar.l().getValue();
                    boolean z6 = geminiCommonPlayableParams.getExtraContentForResolve().get("season_id") != null;
                    String strValueOf = z6 ? (String) geminiCommonPlayableParams.getExtraContentForResolve().get("ep_id") : String.valueOf(geminiCommonPlayableParams.getCid());
                    String strValueOf2 = z6 ? (String) geminiCommonPlayableParams.getExtraContentForResolve().get("season_id") : String.valueOf(geminiCommonPlayableParams.getAvid());
                    if (strValueOf2 != null && !Intrinsics.areEqual(uGCViewingDurationService.f98556f, strValueOf2)) {
                        uGCViewingDurationService.f98556f = strValueOf2;
                        uGCViewingDurationService.f98554d.c();
                    }
                    if (strValueOf != null && !Intrinsics.areEqual(uGCViewingDurationService.f98555e, strValueOf)) {
                        uGCViewingDurationService.f98555e = strValueOf;
                        uGCViewingDurationService.f98553c.c();
                    }
                } else {
                    uGCViewingDurationService.f98553c.c();
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(UGCViewingDurationService uGCViewingDurationService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = uGCViewingDurationService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow stateFlowAsStateFlow = FlowKt.asStateFlow(this.this$0.f98552b.f91111e);
                a aVar = new a(this.this$0);
                this.label = 1;
                if (stateFlowAsStateFlow.collect(aVar, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.viewingduration.UGCViewingDurationService$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/viewingduration/UGCViewingDurationService$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final UGCViewingDurationService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.viewingduration.UGCViewingDurationService$2$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/viewingduration/UGCViewingDurationService$2$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final UGCViewingDurationService f98558a;

            public a(UGCViewingDurationService uGCViewingDurationService) {
                this.f98558a = uGCViewingDurationService;
            }

            public final Object emit(Object obj, Continuation continuation) {
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                UGCViewingDurationService uGCViewingDurationService = this.f98558a;
                uGCViewingDurationService.f98554d.b(zBooleanValue);
                uGCViewingDurationService.f98553c.b(zBooleanValue);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(UGCViewingDurationService uGCViewingDurationService, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = uGCViewingDurationService;
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
                Flow<Boolean> flowD = CompoundPlayStateProviderKt.d(this.this$0.f98552b);
                a aVar = new a(this.this$0);
                this.label = 1;
                if (flowD.collect(aVar, this) == coroutine_suspended) {
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

    /* JADX WARN: Type inference failed for: r1v2, types: [Qi1.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [Qi1.a, java.lang.Object] */
    @Inject
    public UGCViewingDurationService(@NotNull CoroutineScope coroutineScope, @NotNull h hVar) {
        this.f98551a = coroutineScope;
        this.f98552b = hVar;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this, null), 3, (Object) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00e4 -> B:19:0x0085). Please report as a decompilation issue!!! */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(long r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            Method dump skipped, instruction units count: 238
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ugc.viewingduration.UGCViewingDurationService.a(long, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
