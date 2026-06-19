package com.bilibili.ship.theseus.united.page.danmaku;

import android.graphics.Rect;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bapis.bilibili.community.service.dm.v1.SubtitleItem;
import com.bilibili.droid.thread.HandlerThreads;
import com.bilibili.ship.theseus.united.page.danmaku.EpisodeChronosService;
import com.bilibili.ship.theseus.united.utils.TheseusPlayContainerXKt;
import javax.inject.Inject;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.YieldKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.android.log.BLog;
import tv.danmaku.biliplayerv2.ScreenModeType;
import tv.danmaku.biliplayerv2.service.IControlContainerService;
import tv.danmaku.biliplayerv2.service.IRenderContainerService;
import tv.danmaku.biliplayerv2.service.interact.biz.IInteractLayerService;
import tv.danmaku.biliplayerv2.service.interact.biz.ISubtitleChangedObserver;
import tv.danmaku.biliplayerv2.service.interact.biz.chronos.chronosrpc.local.ILocalHandler;
import tv.danmaku.biliplayerv2.service.interact.biz.chronos.chronosrpc.local.RpcInvokeObserver;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/danmaku/EpisodeChronosService.class */
@StabilityInferred(parameters = 0)
public final class EpisodeChronosService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final IInteractLayerService f99430a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final IRenderContainerService f99431b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.playingarea.a f99432c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final a f99433d;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.danmaku.EpisodeChronosService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/danmaku/EpisodeChronosService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final IControlContainerService $controlContainerService;
        int label;
        final EpisodeChronosService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.danmaku.EpisodeChronosService$1$2, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/danmaku/EpisodeChronosService$1$2.class */
        public static final class AnonymousClass2 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
            final Ref.ObjectRef<Integer> $lastBottomMargin;
            boolean Z$0;
            int label;
            final EpisodeChronosService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(EpisodeChronosService episodeChronosService, Ref.ObjectRef<Integer> objectRef, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = episodeChronosService;
                this.$lastBottomMargin = objectRef;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void invokeSuspend$lambda$0$0(EpisodeChronosService episodeChronosService, SubtitleItem subtitleItem, Ref.ObjectRef objectRef) {
                int iA = EpisodeChronosService.a(episodeChronosService, subtitleItem.getSubtitleHeight().getValue());
                Integer num = (Integer) objectRef.element;
                if (num != null && iA == num.intValue()) {
                    return;
                }
                episodeChronosService.f99430a.updateSubtitleDrawRect(iA);
                objectRef.element = Integer.valueOf(iA);
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, this.$lastBottomMargin, continuation);
                anonymousClass2.Z$0 = ((Boolean) obj).booleanValue();
                return anonymousClass2;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke(((Boolean) obj).booleanValue(), (Continuation<? super Unit>) obj2);
            }

            public final Object invoke(boolean z6, Continuation<? super Unit> continuation) {
                return create(Boolean.valueOf(z6), continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                final SubtitleItem mainSubtitle;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                if (this.Z$0 && (mainSubtitle = this.this$0.f99430a.getMainSubtitle()) != null) {
                    final EpisodeChronosService episodeChronosService = this.this$0;
                    final Ref.ObjectRef<Integer> objectRef = this.$lastBottomMargin;
                    HandlerThreads.post(0, new Runnable(episodeChronosService, mainSubtitle, objectRef) { // from class: com.bilibili.ship.theseus.united.page.danmaku.p

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final EpisodeChronosService f99538a;

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final SubtitleItem f99539b;

                        /* JADX INFO: renamed from: c, reason: collision with root package name */
                        public final Ref.ObjectRef f99540c;

                        {
                            this.f99538a = episodeChronosService;
                            this.f99539b = mainSubtitle;
                            this.f99540c = objectRef;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            EpisodeChronosService.AnonymousClass1.AnonymousClass2.invokeSuspend$lambda$0$0(this.f99538a, this.f99539b, this.f99540c);
                        }
                    });
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(IControlContainerService iControlContainerService, EpisodeChronosService episodeChronosService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$controlContainerService = iControlContainerService;
            this.this$0 = episodeChronosService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$controlContainerService, this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                Ref.ObjectRef objectRefB = G0.g.b(obj);
                Flow<ScreenModeType> flowB = TheseusPlayContainerXKt.b(this.$controlContainerService);
                Flow flowG = this.this$0.f99432c.g();
                final EpisodeChronosService episodeChronosService = this.this$0;
                final Flow[] flowArr = {flowB, flowG};
                Flow<Boolean> flow = new Flow<Boolean>(flowArr, episodeChronosService) { // from class: com.bilibili.ship.theseus.united.page.danmaku.EpisodeChronosService$1$invokeSuspend$$inlined$combine$1

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final Flow[] f99434a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final EpisodeChronosService f99435b;

                    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.danmaku.EpisodeChronosService$1$invokeSuspend$$inlined$combine$1$3, reason: invalid class name */
                    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/danmaku/EpisodeChronosService$1$invokeSuspend$$inlined$combine$1$3.class */
                    public static final class AnonymousClass3 extends SuspendLambda implements Function3<FlowCollector<? super Boolean>, Object[], Continuation<? super Unit>, Object> {
                        private Object L$0;
                        Object L$1;
                        int label;
                        final EpisodeChronosService this$0;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public AnonymousClass3(Continuation continuation, EpisodeChronosService episodeChronosService) {
                            super(3, continuation);
                            this.this$0 = episodeChronosService;
                        }

                        public final Object invoke(FlowCollector<? super Boolean> flowCollector, Object[] objArr, Continuation<? super Unit> continuation) {
                            AnonymousClass3 anonymousClass3 = new AnonymousClass3(continuation, this.this$0);
                            anonymousClass3.L$0 = flowCollector;
                            anonymousClass3.L$1 = objArr;
                            return anonymousClass3.invokeSuspend(Unit.INSTANCE);
                        }

                        public final Object invokeSuspend(Object obj) {
                            FlowCollector flowCollector;
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            int i7 = this.label;
                            boolean z6 = true;
                            if (i7 == 0) {
                                ResultKt.throwOnFailure(obj);
                                flowCollector = (FlowCollector) this.L$0;
                                this.L$0 = flowCollector;
                                this.label = 1;
                                if (YieldKt.yield(this) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                if (i7 != 1) {
                                    if (i7 != 2) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    ResultKt.throwOnFailure(obj);
                                    return Unit.INSTANCE;
                                }
                                FlowCollector flowCollector2 = (FlowCollector) this.L$0;
                                ResultKt.throwOnFailure(obj);
                                flowCollector = flowCollector2;
                            }
                            SubtitleItem mainSubtitle = this.this$0.f99430a.getMainSubtitle();
                            BLog.d("EpisodeChronosService", "onScreenContainerChanged");
                            if (mainSubtitle == null || !mainSubtitle.hasSubtitleHeight()) {
                                z6 = false;
                            }
                            Boolean boolBoxBoolean = Boxing.boxBoolean(z6);
                            this.L$0 = null;
                            this.label = 2;
                            if (flowCollector.emit(boolBoxBoolean, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            return Unit.INSTANCE;
                        }
                    }

                    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/danmaku/EpisodeChronosService$1$invokeSuspend$$inlined$combine$1$a.class */
                    public static final class a implements Function0<Object[]> {

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final Flow[] f99436a;

                        public a(Flow[] flowArr) {
                            this.f99436a = flowArr;
                        }

                        public final Object invoke() {
                            return new Object[this.f99436a.length];
                        }
                    }

                    {
                        this.f99434a = flowArr;
                        this.f99435b = episodeChronosService;
                    }

                    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                        Flow[] flowArr2 = this.f99434a;
                        Object objA = kotlinx.coroutines.flow.internal.i.a(flowArr2, new a(flowArr2), new AnonymousClass3(null, this.f99435b), flowCollector, continuation);
                        return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : Unit.INSTANCE;
                    }
                };
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(episodeChronosService, objectRefB, null);
                this.label = 1;
                if (FlowKt.collectLatest(flow, anonymousClass2, this) == coroutine_suspended) {
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

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/danmaku/EpisodeChronosService$a.class */
    public static final class a implements ISubtitleChangedObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final EpisodeChronosService f99437a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final IControlContainerService f99438b;

        public a(EpisodeChronosService episodeChronosService, IControlContainerService iControlContainerService) {
            this.f99437a = episodeChronosService;
            this.f99438b = iControlContainerService;
        }

        public final void onSubtitleChanged(SubtitleItem subtitleItem, SubtitleItem subtitleItem2) {
            int bottomSubtitleBlock;
            final EpisodeChronosService episodeChronosService = this.f99437a;
            if (subtitleItem == null || !subtitleItem.hasSubtitleHeight()) {
                IControlContainerService iControlContainerService = this.f99438b;
                bottomSubtitleBlock = iControlContainerService.isShowing() ? iControlContainerService.getBottomSubtitleBlock() : 0;
            } else {
                bottomSubtitleBlock = EpisodeChronosService.a(episodeChronosService, subtitleItem.getSubtitleHeight().getValue());
            }
            final int i7 = bottomSubtitleBlock;
            HandlerThreads.post(0, new Runnable(episodeChronosService, i7) { // from class: com.bilibili.ship.theseus.united.page.danmaku.q

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final EpisodeChronosService f99541a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final int f99542b;

                {
                    this.f99541a = episodeChronosService;
                    this.f99542b = i7;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    EpisodeChronosService episodeChronosService2 = this.f99541a;
                    episodeChronosService2.f99430a.updateSubtitleDrawRect(this.f99542b);
                }
            });
        }

        public final void onSubtitleDrawRectChanged(int i7) {
            defpackage.a.a(i7, "onSubtitleDrawRectChanged ", "EpisodeChronosService");
        }
    }

    @Inject
    public EpisodeChronosService(@NotNull CoroutineScope coroutineScope, @NotNull RpcInvokeObserver rpcInvokeObserver, @NotNull IInteractLayerService iInteractLayerService, @NotNull IControlContainerService iControlContainerService, @NotNull IRenderContainerService iRenderContainerService, @NotNull com.bilibili.ship.theseus.united.page.playingarea.a aVar) {
        this.f99430a = iInteractLayerService;
        this.f99431b = iRenderContainerService;
        this.f99432c = aVar;
        a aVar2 = new a(this, iControlContainerService);
        this.f99433d = aVar2;
        ILocalHandler localHandler = iInteractLayerService.getLocalHandler();
        if (localHandler != null) {
            localHandler.registerRpcInvokeObserver(rpcInvokeObserver);
        }
        iInteractLayerService.addSubtitleChangedObserver(aVar2);
        BLog.d("EpisodeChronosService", "GetWork --> EpisodeChronosService registerRpcInvokeObserver,observer = " + rpcInvokeObserver);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(iControlContainerService, this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new EpisodeChronosService$special$$inlined$awaitCancel$1(null, this, rpcInvokeObserver), 3, (Object) null);
    }

    public static final int a(EpisodeChronosService episodeChronosService, double d7) {
        int height = episodeChronosService.f99430a.getChronosInteractContainer().h.getHeight();
        Rect renderViewBounds = episodeChronosService.f99431b.getRenderViewBounds();
        int i7 = renderViewBounds.bottom - renderViewBounds.top;
        double d8 = ((double) i7) * d7;
        double d9 = ((double) ((height - i7) / 2)) + d8;
        StringBuilder sbB = Vn.A.b(i7, height, "calculateFixedBottomMargin \n videoHeight ", "\npanelHeight ", "\nsubtitleOffset ");
        sbB.append(d8);
        sbB.append("\nbottomMargin ");
        sbB.append(d9);
        BLog.d("EpisodeChronosService", sbB.toString());
        return (int) d9;
    }
}
