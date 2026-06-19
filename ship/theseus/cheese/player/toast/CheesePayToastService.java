package com.bilibili.ship.theseus.cheese.player.toast;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.autofill.r;
import com.bilibili.ad.adview.pegasus.banner.toplive.m;
import com.bilibili.app.gemini.player.feature.snapshot.E;
import com.bilibili.app.gemini.player.feature.snapshot.k;
import com.bilibili.app.gemini.player.feature.snapshot.q;
import com.bilibili.lib.media.resource.ExtraInfo;
import com.bilibili.ship.theseus.cheese.biz.intro.primary.C6101w;
import com.bilibili.ship.theseus.cheese.pay.purchase.CheesePurchaseRepository;
import com.bilibili.ship.theseus.cheese.player.toast.CheesePayToastService;
import com.bilibili.ship.theseus.united.page.episode.EpisodeExtraInfoRepository;
import com.bilibili.ship.theseus.united.page.playviewextra.CountdownItemVo;
import com.bilibili.ship.theseus.united.page.playviewextra.FoldDataVo;
import com.bilibili.ship.theseus.united.page.playviewextra.FoldStyle;
import com.bilibili.ship.theseus.united.page.playviewextra.FullPromptBarVo;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import com.bilibili.ship.theseus.united.page.restrictionlayer.ReportVo;
import com.bilibili.ship.theseus.united.page.restrictionlayer.TextVo;
import com.bilibili.ship.theseus.united.player.charge.d;
import dr0.ViewOnClickListenerC6833a;
import eu0.C6987f;
import eu0.C7007z;
import java.util.List;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.biliplayerv2.service.AbsFunctionWidgetService;
import tv.danmaku.biliplayerv2.service.FunctionWidgetToken;
import tv.danmaku.biliplayerv2.service.I;
import tv.danmaku.biliplayerv2.widget.AbsFunctionWidget;
import vv0.p;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/player/toast/CheesePayToastService.class */
@StabilityInferred(parameters = 0)
public final class CheesePayToastService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final C6987f f90754a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final C6101w f90755b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Context f90756c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f90757d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final CheesePurchaseRepository f90758e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final AbsFunctionWidgetService f90759f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final EpisodeExtraInfoRepository f90760g;

    @NotNull
    public final com.bilibili.ship.theseus.united.player.charge.b h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final PageReportService f90761i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f90762j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final List<Class<? extends AbsFunctionWidget>> f90763k = CollectionsKt.listOf(new Class[]{ViewOnClickListenerC6833a.class, E.class, q.class, k.class});

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final b f90764l = new b(this);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final Lazy f90765m = LazyKt.lazy(new m(this, 3));

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.player.toast.CheesePayToastService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/player/toast/CheesePayToastService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final CheesePayToastService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.player.toast.CheesePayToastService$1$2, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/player/toast/CheesePayToastService$1$2.class */
        public static final class AnonymousClass2 extends SuspendLambda implements Function2<FullPromptBarVo, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final CheesePayToastService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(CheesePayToastService cheesePayToastService, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = cheesePayToastService;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit invokeSuspend$lambda$0(CheesePayToastService cheesePayToastService, TextVo textVo) {
                ReportVo reportVoL;
                if (!cheesePayToastService.f90762j) {
                    cheesePayToastService.f90758e.a(8);
                    if (textVo != null && (reportVoL = textVo.l()) != null && reportVoL.b().length() > 0) {
                        PageReportService.g(cheesePayToastService.f90761i, reportVoL.b(), reportVoL.c(), 4);
                    }
                }
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit invokeSuspend$lambda$1(CheesePayToastService cheesePayToastService, ReportVo reportVo) {
                if (reportVo != null) {
                    String strD = reportVo.d();
                    if (strD != null) {
                        if (strD.length() <= 0) {
                            strD = null;
                        }
                        if (strD != null) {
                            PageReportService.i(cheesePayToastService.f90761i, reportVo.d(), reportVo.c(), 4);
                        }
                    }
                }
                return Unit.INSTANCE;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            public final Object invoke(FullPromptBarVo fullPromptBarVo, Continuation<? super Unit> continuation) {
                return create(fullPromptBarVo, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                if (((FullPromptBarVo) this.L$0) == null) {
                    this.this$0.h.f104417c.setValue((Object) null);
                    this.this$0.h.f104419e.setValue((Object) null);
                    return Unit.INSTANCE;
                }
                final CheesePayToastService cheesePayToastService = this.this$0;
                com.bilibili.ship.theseus.united.player.charge.b bVar = cheesePayToastService.h;
                bVar.f104417c.setValue(new Function1(cheesePayToastService) { // from class: com.bilibili.ship.theseus.cheese.player.toast.a

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final CheesePayToastService f90770a;

                    {
                        this.f90770a = cheesePayToastService;
                    }

                    public final Object invoke(Object obj2) {
                        return CheesePayToastService.AnonymousClass1.AnonymousClass2.invokeSuspend$lambda$0(this.f90770a, (TextVo) obj2);
                    }
                });
                final CheesePayToastService cheesePayToastService2 = this.this$0;
                com.bilibili.ship.theseus.united.player.charge.b bVar2 = cheesePayToastService2.h;
                bVar2.f104419e.setValue(new Function1(cheesePayToastService2) { // from class: com.bilibili.ship.theseus.cheese.player.toast.b

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final CheesePayToastService f90771a;

                    {
                        this.f90771a = cheesePayToastService2;
                    }

                    public final Object invoke(Object obj2) {
                        return CheesePayToastService.AnonymousClass1.AnonymousClass2.invokeSuspend$lambda$1(this.f90771a, (ReportVo) obj2);
                    }
                });
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(CheesePayToastService cheesePayToastService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = cheesePayToastService;
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
                CheesePayToastService cheesePayToastService = this.this$0;
                final StateFlow<ExtraInfo> stateFlow = cheesePayToastService.f90760g.f99566b;
                Flow<FullPromptBarVo> flow = new Flow<FullPromptBarVo>(stateFlow) { // from class: com.bilibili.ship.theseus.cheese.player.toast.CheesePayToastService$1$invokeSuspend$$inlined$map$1

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final Flow f90766a;

                    /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.player.toast.CheesePayToastService$1$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/player/toast/CheesePayToastService$1$invokeSuspend$$inlined$map$1$2.class */
                    public static final class AnonymousClass2<T> implements FlowCollector {

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final FlowCollector f90767a;

                        /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.player.toast.CheesePayToastService$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/player/toast/CheesePayToastService$1$invokeSuspend$$inlined$map$1$2$1.class */
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
                            this.f90767a = flowCollector;
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
                                boolean r0 = r0 instanceof com.bilibili.ship.theseus.cheese.player.toast.CheesePayToastService$1$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1
                                if (r0 == 0) goto L29
                                r0 = r7
                                com.bilibili.ship.theseus.cheese.player.toast.CheesePayToastService$1$invokeSuspend$$inlined$map$1$2$1 r0 = (com.bilibili.ship.theseus.cheese.player.toast.CheesePayToastService$1$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
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
                                com.bilibili.ship.theseus.cheese.player.toast.CheesePayToastService$1$invokeSuspend$$inlined$map$1$2$1 r0 = new com.bilibili.ship.theseus.cheese.player.toast.CheesePayToastService$1$invokeSuspend$$inlined$map$1$2$1
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
                                kotlinx.coroutines.flow.FlowCollector r0 = r0.f90767a
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
                            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.cheese.player.toast.CheesePayToastService$1$invokeSuspend$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                        }
                    }

                    {
                        this.f90766a = stateFlow;
                    }

                    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                        Object objCollect = this.f90766a.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }
                };
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(cheesePayToastService, null);
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.player.toast.CheesePayToastService$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/player/toast/CheesePayToastService$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final CheesePayToastService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.player.toast.CheesePayToastService$2$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/player/toast/CheesePayToastService$2$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<C7007z, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final CheesePayToastService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(CheesePayToastService cheesePayToastService, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = cheesePayToastService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            public final Object invoke(C7007z c7007z, Continuation<? super Unit> continuation) {
                return create(c7007z, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                C7007z c7007z = (C7007z) this.L$0;
                if (c7007z.f117607g == 1) {
                    CheesePayToastService cheesePayToastService = this.this$0;
                    cheesePayToastService.h.f104421g = (a) cheesePayToastService.f90765m.getValue();
                    p pVar = (p) this.this$0.h.f104416b.getValue();
                    p pVar2 = null;
                    if (pVar != null) {
                        CheesePayToastService cheesePayToastService2 = this.this$0;
                        TextVo textVo = pVar.f128486e;
                        TextVo textVoA = null;
                        if (textVo != null) {
                            textVoA = TextVo.a(textVo, c7007z.b(cheesePayToastService2.f90756c, cheesePayToastService2.f90754a), null, 65534);
                        }
                        pVar2 = new p(pVar.f128482a, pVar.f128483b, pVar.f128484c, pVar.f128485d, textVoA, pVar.f128487f, pVar.f128488g, pVar.h);
                    }
                    this.this$0.h.f104415a.setValue(pVar2);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(CheesePayToastService cheesePayToastService, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = cheesePayToastService;
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
                CheesePayToastService cheesePayToastService = this.this$0;
                StateFlow<C7007z> stateFlow = cheesePayToastService.f90755b.f89782d;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(cheesePayToastService, null);
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.player.toast.CheesePayToastService$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/player/toast/CheesePayToastService$3.class */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private Object L$0;
        int label;
        final CheesePayToastService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(CheesePayToastService cheesePayToastService, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.this$0 = cheesePayToastService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, continuation);
            anonymousClass3.L$0 = obj;
            return anonymousClass3;
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            CheesePayToastService cheesePayToastService = this.this$0;
            cheesePayToastService.f90759f.addOnWidgetStateChangeListener(cheesePayToastService.f90764l);
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new CheesePayToastService$3$invokeSuspend$$inlined$awaitCancel$1(null, this.this$0), 3, (Object) null);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/player/toast/CheesePayToastService$a.class */
    public static final class a implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CheesePayToastService f90768a;

        public a(CheesePayToastService cheesePayToastService) {
            this.f90768a = cheesePayToastService;
        }

        @Override // com.bilibili.ship.theseus.united.player.charge.d
        public final p a(FullPromptBarVo fullPromptBarVo, String str) {
            TextVo textVoA;
            TextVo textVo;
            p pVar = null;
            TextVo textVoA2 = null;
            FoldDataVo foldDataVo = fullPromptBarVo.f102385g;
            if (foldDataVo != null) {
                FoldStyle foldStyleB = foldDataVo.b();
                CountdownItemVo countdownItemVoA = foldDataVo.a();
                TextVo textVo2 = countdownItemVoA != null ? countdownItemVoA.f102373b : null;
                CountdownItemVo countdownItemVoA2 = foldDataVo.a();
                if (countdownItemVoA2 == null || (textVo = countdownItemVoA2.f102374c) == null) {
                    textVoA = null;
                } else if (str.length() == 0) {
                    textVoA = textVo;
                } else {
                    StringBuilder sbA = r.a(str);
                    sbA.append(textVo.f102705a);
                    textVoA = TextVo.a(textVo, sbA.toString(), null, 65534);
                }
                TextVo textVo3 = (TextVo) CollectionsKt.firstOrNull(fullPromptBarVo.f102384f);
                if (textVo3 != null) {
                    CheesePayToastService cheesePayToastService = this.f90768a;
                    textVoA2 = TextVo.a(textVo3, cheesePayToastService.f90755b.a().b(cheesePayToastService.f90756c, cheesePayToastService.f90754a), null, 65534);
                }
                pVar = new p(foldStyleB, fullPromptBarVo.f102379a, textVo2, textVoA, textVoA2, fullPromptBarVo.f102386i, fullPromptBarVo.f102387j, fullPromptBarVo.h);
            }
            return pVar;
        }

        @Override // com.bilibili.ship.theseus.united.player.charge.d
        public final p b(FullPromptBarVo fullPromptBarVo, String str) {
            TextVo textVoA;
            TextVo textVoA2;
            FoldStyle foldStyle = FoldStyle.Countdown;
            String str2 = fullPromptBarVo.f102379a;
            TextVo textVo = fullPromptBarVo.f102381c;
            if (textVo == null) {
                textVoA = null;
            } else if (str.length() == 0) {
                textVoA = textVo;
            } else {
                StringBuilder sbA = r.a(str);
                sbA.append(textVo.f102705a);
                textVoA = TextVo.a(textVo, sbA.toString(), null, 65534);
            }
            TextVo textVo2 = (TextVo) CollectionsKt.firstOrNull(fullPromptBarVo.f102384f);
            if (textVo2 != null) {
                CheesePayToastService cheesePayToastService = this.f90768a;
                textVoA2 = TextVo.a(textVo2, cheesePayToastService.f90755b.a().b(cheesePayToastService.f90756c, cheesePayToastService.f90754a), null, 65534);
            } else {
                textVoA2 = null;
            }
            return new p(foldStyle, str2, fullPromptBarVo.f102380b, textVoA, textVoA2, fullPromptBarVo.f102386i, fullPromptBarVo.f102387j, fullPromptBarVo.h);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/player/toast/CheesePayToastService$b.class */
    public static final class b implements I {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CheesePayToastService f90769a;

        public b(CheesePayToastService cheesePayToastService) {
            this.f90769a = cheesePayToastService;
        }

        public final void onWidgetDismiss(FunctionWidgetToken functionWidgetToken) {
            CheesePayToastService cheesePayToastService = this.f90769a;
            if (cheesePayToastService.f90763k.contains(functionWidgetToken.getClazz())) {
                cheesePayToastService.f90762j = false;
            }
        }

        public final void onWidgetShow(FunctionWidgetToken functionWidgetToken) {
            CheesePayToastService cheesePayToastService = this.f90769a;
            if (cheesePayToastService.f90763k.contains(functionWidgetToken.getClazz())) {
                cheesePayToastService.f90762j = true;
            }
        }
    }

    @Inject
    public CheesePayToastService(@NotNull C6987f c6987f, @NotNull C6101w c6101w, @NotNull Context context, @NotNull CoroutineScope coroutineScope, @NotNull CheesePurchaseRepository cheesePurchaseRepository, @NotNull AbsFunctionWidgetService absFunctionWidgetService, @NotNull EpisodeExtraInfoRepository episodeExtraInfoRepository, @NotNull com.bilibili.ship.theseus.united.player.charge.b bVar, @NotNull PageReportService pageReportService) {
        this.f90754a = c6987f;
        this.f90755b = c6101w;
        this.f90756c = context;
        this.f90757d = coroutineScope;
        this.f90758e = cheesePurchaseRepository;
        this.f90759f = absFunctionWidgetService;
        this.f90760g = episodeExtraInfoRepository;
        this.h = bVar;
        this.f90761i = pageReportService;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass3(this, null), 3, (Object) null);
    }
}
