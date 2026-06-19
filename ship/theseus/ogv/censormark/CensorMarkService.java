package com.bilibili.ship.theseus.ogv.censormark;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bapis.bilibili.pgc.gateway.player.v2.RecordInfo;
import com.bilibili.app.gemini.player.feature.zoom.ZoomContainerService;
import com.bilibili.ship.theseus.keel.player.j;
import com.bilibili.ship.theseus.united.page.error.OnRenderLayerFloatLayerManager;
import javax.inject.Inject;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.time.Duration;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/censormark/CensorMarkService.class */
@StabilityInferred(parameters = 0)
public final class CensorMarkService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final OnRenderLayerFloatLayerManager f91677a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.screenstate.c f91678b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final ZoomContainerService f91679c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final j f91680d;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.censormark.CensorMarkService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/censormark/CensorMarkService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final RecordInfo $censorMark;
        int label;
        final CensorMarkService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(CensorMarkService censorMarkService, RecordInfo recordInfo, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = censorMarkService;
            this.$censorMark = recordInfo;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$censorMark, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                CensorMarkService censorMarkService = this.this$0;
                RecordInfo recordInfo = this.$censorMark;
                this.label = 1;
                final Flow<Duration> flowJ = censorMarkService.f91680d.p().J();
                Object objCollectLatest = FlowKt.collectLatest(FlowKt.distinctUntilChanged(new Flow<Boolean>(flowJ) { // from class: com.bilibili.ship.theseus.ogv.censormark.CensorMarkService$run$$inlined$map$1

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final Flow f91681a;

                    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.censormark.CensorMarkService$run$$inlined$map$1$2, reason: invalid class name */
                    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/censormark/CensorMarkService$run$$inlined$map$1$2.class */
                    public static final class AnonymousClass2<T> implements FlowCollector {

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final FlowCollector f91682a;

                        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.censormark.CensorMarkService$run$$inlined$map$1$2$1, reason: invalid class name */
                        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/censormark/CensorMarkService$run$$inlined$map$1$2$1.class */
                        public static final class AnonymousClass1 extends ContinuationImpl {
                            Object L$0;
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
                            this.f91682a = flowCollector;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct code enable 'Show inconsistent code' option in preferences
                        */
                        public final java.lang.Object emit(java.lang.Object r6, kotlin.coroutines.Continuation r7) {
                            /*
                                Method dump skipped, instruction units count: 212
                                To view this dump change 'Code comments level' option to 'DEBUG'
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ogv.censormark.CensorMarkService$run$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                        }
                    }

                    {
                        this.f91681a = flowJ;
                    }

                    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                        Object objCollect = this.f91681a.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }
                }), new CensorMarkService$run$3(recordInfo, censorMarkService, null), this);
                if (objCollectLatest != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    objCollectLatest = Unit.INSTANCE;
                }
                if (objCollectLatest == coroutine_suspended) {
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

    @Inject
    public CensorMarkService(@NotNull CoroutineScope coroutineScope, @Nullable RecordInfo recordInfo, @NotNull OnRenderLayerFloatLayerManager onRenderLayerFloatLayerManager, @NotNull com.bilibili.ship.theseus.united.page.screenstate.c cVar, @NotNull ZoomContainerService zoomContainerService, @NotNull j jVar) {
        this.f91677a = onRenderLayerFloatLayerManager;
        this.f91678b = cVar;
        this.f91679c = zoomContainerService;
        this.f91680d = jVar;
        if (recordInfo != null) {
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, recordInfo, null), 3, (Object) null);
        }
    }
}
