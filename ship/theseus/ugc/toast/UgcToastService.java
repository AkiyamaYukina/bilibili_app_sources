package com.bilibili.ship.theseus.ugc.toast;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.app.authorspace.ui.C0;
import com.bilibili.bililive.biz.pkv2.ui.E;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.media.resource.ExtraInfo;
import com.bilibili.ship.theseus.keel.player.j;
import com.bilibili.ship.theseus.ugc.toast.UgcToastService;
import com.bilibili.ship.theseus.united.page.ad.PageAdRepository;
import com.bilibili.ship.theseus.united.page.episode.EpisodeExtraInfoRepository;
import com.bilibili.ship.theseus.united.page.playviewextra.FullPromptBarVo;
import com.bilibili.ship.theseus.united.page.playviewextra.PlayerToastVo;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import com.bilibili.ship.theseus.united.page.restrictionlayer.InterfaceC6388m;
import com.bilibili.ship.theseus.united.page.restrictionlayer.ReportVo;
import com.bilibili.ship.theseus.united.page.restrictionlayer.TextVo;
import com.bilibili.ship.theseus.united.page.restrictionlayer.s;
import com.bilibili.ship.theseus.united.page.screenstate.c;
import com.bilibili.ship.theseus.united.player.oldway.playercontainer.LoginCheckerDriverService;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.time.Duration;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import mv0.C8043a;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.biliplayerv2.service.IToastService;
import vv0.n;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/toast/UgcToastService.class */
@StabilityInferred(parameters = 0)
public final class UgcToastService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f98504a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Context f98505b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final EpisodeExtraInfoRepository f98506c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final IToastService f98507d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.screenstate.c f98508e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.view.a f98509f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final PageReportService f98510g;

    @NotNull
    public final LoginCheckerDriverService h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.player.charge.b f98511i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final InterfaceC6388m f98512j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.view.d f98513k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final C8043a f98514l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final j f98515m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final PageAdRepository f98516n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final Lazy f98517o = LazyKt.lazy(new E(this, 2));

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.toast.UgcToastService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/toast/UgcToastService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final UgcToastService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.toast.UgcToastService$1$4, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/toast/UgcToastService$1$4.class */
        public static final /* synthetic */ class AnonymousClass4 extends AdaptedFunctionReference implements Function3<PlayerToastVo, c.a, Continuation<? super Pair<? extends PlayerToastVo, ? extends c.a>>, Object>, SuspendFunction {
            public static final AnonymousClass4 INSTANCE = new AnonymousClass4();

            public AnonymousClass4() {
                super(3, Pair.class, "<init>", "<init>(Ljava/lang/Object;Ljava/lang/Object;)V", 4);
            }

            public final Object invoke(PlayerToastVo playerToastVo, c.a aVar, Continuation<? super Pair<PlayerToastVo, c.a>> continuation) {
                return AnonymousClass1.invokeSuspend$lambda$1(playerToastVo, aVar, continuation);
            }
        }

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.toast.UgcToastService$1$5, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/toast/UgcToastService$1$5.class */
        public static final class AnonymousClass5 extends SuspendLambda implements Function2<Pair<? extends PlayerToastVo, ? extends c.a>, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final UgcToastService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass5(UgcToastService ugcToastService, Continuation<? super AnonymousClass5> continuation) {
                super(2, continuation);
                this.this$0 = ugcToastService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass5 anonymousClass5 = new AnonymousClass5(this.this$0, continuation);
                anonymousClass5.L$0 = obj;
                return anonymousClass5;
            }

            public final Object invoke(Pair<PlayerToastVo, c.a> pair, Continuation<? super Unit> continuation) {
                return create(pair, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    Pair pair = (Pair) this.L$0;
                    PlayerToastVo playerToastVo = (PlayerToastVo) pair.component1();
                    c.a aVar = (c.a) pair.component2();
                    if (playerToastVo == null || !aVar.f102988b) {
                        return Unit.INSTANCE;
                    }
                    UgcToastService ugcToastService = this.this$0;
                    this.label = 1;
                    if (UgcToastService.a(ugcToastService, playerToastVo, this) == coroutine_suspended) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(UgcToastService ugcToastService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = ugcToastService;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object invokeSuspend$lambda$1(PlayerToastVo playerToastVo, c.a aVar, Continuation continuation) {
            return new Pair(playerToastVo, aVar);
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
                UgcToastService ugcToastService = this.this$0;
                final StateFlow<ExtraInfo> stateFlow = ugcToastService.f98506c.f99566b;
                Flow flowCombine = FlowKt.combine(new Flow<PlayerToastVo>(stateFlow) { // from class: com.bilibili.ship.theseus.ugc.toast.UgcToastService$1$invokeSuspend$$inlined$map$1

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final Flow f98518a;

                    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.toast.UgcToastService$1$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/toast/UgcToastService$1$invokeSuspend$$inlined$map$1$2.class */
                    public static final class AnonymousClass2<T> implements FlowCollector {

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final FlowCollector f98519a;

                        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.toast.UgcToastService$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/toast/UgcToastService$1$invokeSuspend$$inlined$map$1$2$1.class */
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
                            this.f98519a = flowCollector;
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
                                boolean r0 = r0 instanceof com.bilibili.ship.theseus.ugc.toast.UgcToastService$1$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1
                                if (r0 == 0) goto L29
                                r0 = r7
                                com.bilibili.ship.theseus.ugc.toast.UgcToastService$1$invokeSuspend$$inlined$map$1$2$1 r0 = (com.bilibili.ship.theseus.ugc.toast.UgcToastService$1$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
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
                                com.bilibili.ship.theseus.ugc.toast.UgcToastService$1$invokeSuspend$$inlined$map$1$2$1 r0 = new com.bilibili.ship.theseus.ugc.toast.UgcToastService$1$invokeSuspend$$inlined$map$1$2$1
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
                                goto L94
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
                                com.bilibili.lib.media.resource.ExtraInfo r0 = (com.bilibili.lib.media.resource.ExtraInfo) r0
                                r6 = r0
                                r0 = r6
                                if (r0 == 0) goto L7a
                                tb0.h r0 = com.bilibili.ship.theseus.ugc.play.b.f98100b
                                r1 = r6
                                java.lang.Object r0 = r0.a(r1)
                                com.bilibili.ship.theseus.united.page.playviewextra.PlayerToastVo r0 = (com.bilibili.ship.theseus.united.page.playviewextra.PlayerToastVo) r0
                                r6 = r0
                                goto L7c
                            L7a:
                                r0 = 0
                                r6 = r0
                            L7c:
                                r0 = r7
                                r1 = 1
                                r0.label = r1
                                r0 = r5
                                kotlinx.coroutines.flow.FlowCollector r0 = r0.f98519a
                                r1 = r6
                                r2 = r7
                                java.lang.Object r0 = r0.emit(r1, r2)
                                r1 = r9
                                if (r0 != r1) goto L94
                                r0 = r9
                                return r0
                            L94:
                                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                                return r0
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ugc.toast.UgcToastService$1$invokeSuspend$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                        }
                    }

                    {
                        this.f98518a = stateFlow;
                    }

                    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                        Object objCollect = this.f98518a.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }
                }, ugcToastService.f98508e.c(), AnonymousClass4.INSTANCE);
                AnonymousClass5 anonymousClass5 = new AnonymousClass5(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowCombine, anonymousClass5, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.toast.UgcToastService$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/toast/UgcToastService$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final UgcToastService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.toast.UgcToastService$2$4, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/toast/UgcToastService$2$4.class */
        public static final /* synthetic */ class AnonymousClass4 extends AdaptedFunctionReference implements Function3<FullPromptBarVo, c.a, Continuation<? super Pair<? extends FullPromptBarVo, ? extends c.a>>, Object>, SuspendFunction {
            public static final AnonymousClass4 INSTANCE = new AnonymousClass4();

            public AnonymousClass4() {
                super(3, Pair.class, "<init>", "<init>(Ljava/lang/Object;Ljava/lang/Object;)V", 4);
            }

            public final Object invoke(FullPromptBarVo fullPromptBarVo, c.a aVar, Continuation<? super Pair<FullPromptBarVo, c.a>> continuation) {
                return AnonymousClass2.invokeSuspend$lambda$1(fullPromptBarVo, aVar, continuation);
            }
        }

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.toast.UgcToastService$2$5, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/toast/UgcToastService$2$5.class */
        public static final class AnonymousClass5 extends SuspendLambda implements Function2<Pair<? extends FullPromptBarVo, ? extends c.a>, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final UgcToastService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass5(UgcToastService ugcToastService, Continuation<? super AnonymousClass5> continuation) {
                super(2, continuation);
                this.this$0 = ugcToastService;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit invokeSuspend$lambda$0(UgcToastService ugcToastService, c.a aVar, TextVo textVo) {
                ugcToastService.b(textVo, aVar);
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit invokeSuspend$lambda$1(UgcToastService ugcToastService, c.a aVar, ReportVo reportVo) {
                ugcToastService.c(reportVo, aVar);
                return Unit.INSTANCE;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass5 anonymousClass5 = new AnonymousClass5(this.this$0, continuation);
                anonymousClass5.L$0 = obj;
                return anonymousClass5;
            }

            public final Object invoke(Pair<FullPromptBarVo, c.a> pair, Continuation<? super Unit> continuation) {
                return create(pair, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                Pair pair = (Pair) this.L$0;
                FullPromptBarVo fullPromptBarVo = (FullPromptBarVo) pair.component1();
                final c.a aVar = (c.a) pair.component2();
                if (fullPromptBarVo == null) {
                    this.this$0.f98511i.f104417c.setValue((Object) null);
                    this.this$0.f98511i.f104419e.setValue((Object) null);
                    return Unit.INSTANCE;
                }
                final UgcToastService ugcToastService = this.this$0;
                com.bilibili.ship.theseus.united.player.charge.b bVar = ugcToastService.f98511i;
                bVar.f104417c.setValue(new Function1(ugcToastService, aVar) { // from class: com.bilibili.ship.theseus.ugc.toast.b

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final UgcToastService f98524a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final c.a f98525b;

                    {
                        this.f98524a = ugcToastService;
                        this.f98525b = aVar;
                    }

                    public final Object invoke(Object obj2) {
                        return UgcToastService.AnonymousClass2.AnonymousClass5.invokeSuspend$lambda$0(this.f98524a, this.f98525b, (TextVo) obj2);
                    }
                });
                final UgcToastService ugcToastService2 = this.this$0;
                com.bilibili.ship.theseus.united.player.charge.b bVar2 = ugcToastService2.f98511i;
                bVar2.f104419e.setValue(new Function1(ugcToastService2, aVar) { // from class: com.bilibili.ship.theseus.ugc.toast.c

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final UgcToastService f98526a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final c.a f98527b;

                    {
                        this.f98526a = ugcToastService2;
                        this.f98527b = aVar;
                    }

                    public final Object invoke(Object obj2) {
                        return UgcToastService.AnonymousClass2.AnonymousClass5.invokeSuspend$lambda$1(this.f98526a, this.f98527b, (ReportVo) obj2);
                    }
                });
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(UgcToastService ugcToastService, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = ugcToastService;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object invokeSuspend$lambda$1(FullPromptBarVo fullPromptBarVo, c.a aVar, Continuation continuation) {
            return new Pair(fullPromptBarVo, aVar);
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
                UgcToastService ugcToastService = this.this$0;
                final StateFlow<ExtraInfo> stateFlow = ugcToastService.f98506c.f99566b;
                Flow flowCombine = FlowKt.combine(new Flow<FullPromptBarVo>(stateFlow) { // from class: com.bilibili.ship.theseus.ugc.toast.UgcToastService$2$invokeSuspend$$inlined$map$1

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final Flow f98520a;

                    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.toast.UgcToastService$2$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/toast/UgcToastService$2$invokeSuspend$$inlined$map$1$2.class */
                    public static final class AnonymousClass2<T> implements FlowCollector {

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final FlowCollector f98521a;

                        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.toast.UgcToastService$2$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/toast/UgcToastService$2$invokeSuspend$$inlined$map$1$2$1.class */
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
                            this.f98521a = flowCollector;
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
                                boolean r0 = r0 instanceof com.bilibili.ship.theseus.ugc.toast.UgcToastService$2$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1
                                if (r0 == 0) goto L29
                                r0 = r7
                                com.bilibili.ship.theseus.ugc.toast.UgcToastService$2$invokeSuspend$$inlined$map$1$2$1 r0 = (com.bilibili.ship.theseus.ugc.toast.UgcToastService$2$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
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
                                com.bilibili.ship.theseus.ugc.toast.UgcToastService$2$invokeSuspend$$inlined$map$1$2$1 r0 = new com.bilibili.ship.theseus.ugc.toast.UgcToastService$2$invokeSuspend$$inlined$map$1$2$1
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
                                goto L94
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
                                com.bilibili.lib.media.resource.ExtraInfo r0 = (com.bilibili.lib.media.resource.ExtraInfo) r0
                                r6 = r0
                                r0 = r6
                                if (r0 == 0) goto L7a
                                tb0.h r0 = vv0.d.f128455c
                                r1 = r6
                                java.lang.Object r0 = r0.a(r1)
                                com.bilibili.ship.theseus.united.page.playviewextra.FullPromptBarVo r0 = (com.bilibili.ship.theseus.united.page.playviewextra.FullPromptBarVo) r0
                                r6 = r0
                                goto L7c
                            L7a:
                                r0 = 0
                                r6 = r0
                            L7c:
                                r0 = r7
                                r1 = 1
                                r0.label = r1
                                r0 = r5
                                kotlinx.coroutines.flow.FlowCollector r0 = r0.f98521a
                                r1 = r6
                                r2 = r7
                                java.lang.Object r0 = r0.emit(r1, r2)
                                r1 = r9
                                if (r0 != r1) goto L94
                                r0 = r9
                                return r0
                            L94:
                                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                                return r0
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ugc.toast.UgcToastService$2$invokeSuspend$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                        }
                    }

                    {
                        this.f98520a = stateFlow;
                    }

                    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                        Object objCollect = this.f98520a.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }
                }, ugcToastService.f98508e.c(), AnonymousClass4.INSTANCE);
                AnonymousClass5 anonymousClass5 = new AnonymousClass5(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowCombine, anonymousClass5, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.toast.UgcToastService$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/toast/UgcToastService$3.class */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final UgcToastService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.toast.UgcToastService$3$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/toast/UgcToastService$3$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<ExtraInfo, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final UgcToastService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(UgcToastService ugcToastService, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = ugcToastService;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit invokeSuspend$lambda$0(UgcToastService ugcToastService, ReportVo reportVo, TextVo textVo) {
                String strK = textVo.k();
                if (strK != null) {
                    BLRouter.routeTo(ec.c.a(strK), ugcToastService.f98505b);
                    String strB = reportVo != null ? reportVo.b() : null;
                    if (strB != null && strB.length() != 0) {
                        PageReportService.i(ugcToastService.f98510g, reportVo.d(), reportVo.c(), 4);
                    }
                }
                return Unit.INSTANCE;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            public final Object invoke(ExtraInfo extraInfo, Continuation<? super Unit> continuation) {
                return create(extraInfo, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                ExtraInfo extraInfo = (ExtraInfo) this.L$0;
                PlayerToastVo playerToastVo = extraInfo != null ? (PlayerToastVo) com.bilibili.ship.theseus.ugc.play.b.f98101c.a(extraInfo) : null;
                if (playerToastVo != null && !C0.b() && this.this$0.h.f104761a.f129436c) {
                    tv.danmaku.bili.widget.preference.a aVar = new tv.danmaku.bili.widget.preference.a(0);
                    if (aVar.a.getBoolean("new_user_login_toast_key", false)) {
                        return Unit.INSTANCE;
                    }
                    final UgcToastService ugcToastService = this.this$0;
                    Context context = ugcToastService.f98505b;
                    final ReportVo reportVo = playerToastVo.f102391c;
                    this.this$0.f98507d.showToast(n.b(playerToastVo, context, 4000L, new Function1(ugcToastService, reportVo) { // from class: com.bilibili.ship.theseus.ugc.toast.d

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final UgcToastService f98528a;

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final ReportVo f98529b;

                        {
                            this.f98528a = ugcToastService;
                            this.f98529b = reportVo;
                        }

                        public final Object invoke(Object obj2) {
                            return UgcToastService.AnonymousClass3.AnonymousClass1.invokeSuspend$lambda$0(this.f98528a, this.f98529b, (TextVo) obj2);
                        }
                    }));
                    String strD = null;
                    if (reportVo != null) {
                        strD = reportVo.d();
                    }
                    if (strD != null && strD.length() != 0) {
                        PageReportService.i(this.this$0.f98510g, reportVo.d(), reportVo.c(), 4);
                    }
                    aVar.l("new_user_login_toast_key", true);
                    this.this$0.h.f104761a.f129436c = false;
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(UgcToastService ugcToastService, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.this$0 = ugcToastService;
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
                UgcToastService ugcToastService = this.this$0;
                StateFlow<ExtraInfo> stateFlow = ugcToastService.f98506c.f99566b;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(ugcToastService, null);
                this.label = 1;
                if (FlowKt.collectLatest(stateFlow, anonymousClass1, this) == coroutine_suspended) {
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
    public UgcToastService(@NotNull CoroutineScope coroutineScope, @NotNull Context context, @NotNull EpisodeExtraInfoRepository episodeExtraInfoRepository, @NotNull IToastService iToastService, @NotNull com.bilibili.ship.theseus.united.page.screenstate.c cVar, @NotNull com.bilibili.ship.theseus.united.page.view.a aVar, @NotNull PageReportService pageReportService, @NotNull LoginCheckerDriverService loginCheckerDriverService, @NotNull com.bilibili.ship.theseus.united.player.charge.b bVar, @NotNull InterfaceC6388m interfaceC6388m, @NotNull com.bilibili.ship.theseus.united.page.view.d dVar, @NotNull C8043a c8043a, @NotNull j jVar, @NotNull PageAdRepository pageAdRepository) {
        this.f98504a = coroutineScope;
        this.f98505b = context;
        this.f98506c = episodeExtraInfoRepository;
        this.f98507d = iToastService;
        this.f98508e = cVar;
        this.f98509f = aVar;
        this.f98510g = pageReportService;
        this.h = loginCheckerDriverService;
        this.f98511i = bVar;
        this.f98512j = interfaceC6388m;
        this.f98513k = dVar;
        this.f98514l = c8043a;
        this.f98515m = jVar;
        this.f98516n = pageAdRepository;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass3(this, null), 3, (Object) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(final com.bilibili.ship.theseus.ugc.toast.UgcToastService r9, com.bilibili.ship.theseus.united.page.playviewextra.PlayerToastVo r10, kotlin.coroutines.jvm.internal.ContinuationImpl r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 233
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ugc.toast.UgcToastService.a(com.bilibili.ship.theseus.ugc.toast.UgcToastService, com.bilibili.ship.theseus.united.page.playviewextra.PlayerToastVo, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final void b(TextVo textVo, c.a aVar) {
        if (textVo == null) {
            return;
        }
        s sVar = textVo.f102713j;
        if (sVar != null) {
            this.f98512j.a(sVar);
        }
        j jVar = this.f98515m;
        Map extraJsonParams = jVar.f().getExtraJsonParams();
        String str = extraJsonParams != null ? (String) extraJsonParams.get("player_report_json") : null;
        ReportVo reportVoL = textVo.l();
        if (reportVoL != null) {
            ReportVo reportVo = null;
            if (reportVoL.b().length() > 0) {
                reportVo = reportVoL;
            }
            if (reportVo != null) {
                Map mapCreateMapBuilder = MapsKt.createMapBuilder();
                mapCreateMapBuilder.putAll(reportVo.c());
                mapCreateMapBuilder.putAll((Map) this.f98517o.getValue());
                mapCreateMapBuilder.put("player_progress", String.valueOf(Duration.getInWholeSeconds-impl(jVar.F())));
                mapCreateMapBuilder.put("play_style", "normal");
                mapCreateMapBuilder.put("is_auto", "0");
                mapCreateMapBuilder.putAll(MapsKt.mapOf(TuplesKt.to("player_status", aVar.f102988b ? "2" : "1")));
                if (str != null) {
                    mapCreateMapBuilder.put("player_report_json", str);
                }
                mapCreateMapBuilder.put("try_over", "0");
                PageReportService.g(this.f98510g, reportVo.b(), MapsKt.build(mapCreateMapBuilder), 4);
            }
        }
    }

    public final void c(ReportVo reportVo, c.a aVar) {
        if (reportVo != null) {
            String str = null;
            if (reportVo.d().length() <= 0) {
                reportVo = null;
            }
            if (reportVo != null) {
                defpackage.a.b("[theseus-ugc-UgcToastService-reportShowChargeToast] ", "reportVo: " + reportVo, "UgcToastService-reportShowChargeToast");
                Map extraJsonParams = this.f98515m.f().getExtraJsonParams();
                if (extraJsonParams != null) {
                    str = (String) extraJsonParams.get("player_report_json");
                }
                Map mapCreateMapBuilder = MapsKt.createMapBuilder();
                mapCreateMapBuilder.putAll(reportVo.c());
                mapCreateMapBuilder.putAll((Map) this.f98517o.getValue());
                mapCreateMapBuilder.put("play_style", "normal");
                mapCreateMapBuilder.putAll(MapsKt.mapOf(TuplesKt.to("player_status", aVar.f102988b ? "2" : "1")));
                if (str != null) {
                    mapCreateMapBuilder.put("player_report_json", str);
                }
                PageReportService.i(this.f98510g, reportVo.d(), MapsKt.build(mapCreateMapBuilder), 4);
            }
        }
    }
}
