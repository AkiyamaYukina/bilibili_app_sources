package com.bilibili.ship.theseus.ogv.activity;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.app.gemini.ui.RunningUIComponent;
import com.bilibili.compose.theme.ThemeStrategy;
import com.bilibili.framework.exposure.core.ExposureEntry;
import com.bilibili.ogv.infra.coroutine.SelectKt$selectCancellingUnselected$scope$1;
import com.bilibili.ship.theseus.ogv.activity.OgvIntroFloatingBallService;
import com.bilibili.ship.theseus.ogv.intro.UnitedActivityComposeContainerService;
import com.bilibili.ship.theseus.united.page.intro.IntroFloatingViewService;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import java.util.ArrayList;
import javax.inject.Inject;
import kntr.base.router.Router;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/activity/OgvIntroFloatingBallService.class */
@StabilityInferred(parameters = 0)
public final class OgvIntroFloatingBallService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f91431a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final UnitedActivityComposeContainerService f91432b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final IntroFloatingViewService f91433c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final OgvActivityService f91434d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final PageReportService f91435e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final Router f91436f;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.activity.OgvIntroFloatingBallService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/activity/OgvIntroFloatingBallService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final OgvIntroFloatingBallService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.activity.OgvIntroFloatingBallService$1$2, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/activity/OgvIntroFloatingBallService$1$2.class */
        public static final class AnonymousClass2 extends SuspendLambda implements Function2<OgvIntroFloatingBall, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final OgvIntroFloatingBallService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(OgvIntroFloatingBallService ogvIntroFloatingBallService, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = ogvIntroFloatingBallService;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit invokeSuspend$lambda$0(CompletableDeferred completableDeferred, OgvIntroFloatingBallService ogvIntroFloatingBallService, OgvIntroFloatingBall ogvIntroFloatingBall) {
                Unit unit = Unit.INSTANCE;
                completableDeferred.complete(unit);
                ogvIntroFloatingBallService.f91434d.f(ogvIntroFloatingBall.b(), null, ActivityDialogActionType.CLOSE);
                PageReportService.g(ogvIntroFloatingBallService.f91435e, "united.player-video-detail.bottom-float.x.click", ogvIntroFloatingBall.f91430e, 4);
                return unit;
            }

            private static final Unit invokeSuspend$lambda$1(RunningUIComponent runningUIComponent, OgvIntroFloatingBallService ogvIntroFloatingBallService, CompletableDeferred completableDeferred, com.bilibili.ogv.infra.coroutine.c cVar) {
                cVar.b(new OgvIntroFloatingBallService$1$2$1$1(runningUIComponent, null));
                cVar.b(new OgvIntroFloatingBallService$1$2$1$2(ogvIntroFloatingBallService, runningUIComponent, completableDeferred, null));
                return Unit.INSTANCE;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            public final Object invoke(OgvIntroFloatingBall ogvIntroFloatingBall, Continuation<? super Unit> continuation) {
                return create(ogvIntroFloatingBall, continuation).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [com.bilibili.ship.theseus.ogv.activity.i] */
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    final OgvIntroFloatingBall ogvIntroFloatingBall = (OgvIntroFloatingBall) this.L$0;
                    if (ogvIntroFloatingBall == null) {
                        return Unit.INSTANCE;
                    }
                    final CompletableDeferred completableDeferredCompletableDeferred$default = CompletableDeferredKt.CompletableDeferred$default((Job) null, 1, (Object) null);
                    final OgvIntroFloatingBallService ogvIntroFloatingBallService = this.this$0;
                    ?? r02 = new Function0(completableDeferredCompletableDeferred$default, ogvIntroFloatingBallService, ogvIntroFloatingBall) { // from class: com.bilibili.ship.theseus.ogv.activity.i

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final CompletableDeferred f91557a;

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final OgvIntroFloatingBallService f91558b;

                        /* JADX INFO: renamed from: c, reason: collision with root package name */
                        public final OgvIntroFloatingBall f91559c;

                        {
                            this.f91557a = completableDeferredCompletableDeferred$default;
                            this.f91558b = ogvIntroFloatingBallService;
                            this.f91559c = ogvIntroFloatingBall;
                        }

                        public final Object invoke() {
                            return OgvIntroFloatingBallService.AnonymousClass1.AnonymousClass2.invokeSuspend$lambda$0(this.f91557a, this.f91558b, this.f91559c);
                        }
                    };
                    ogvIntroFloatingBallService.getClass();
                    RunningUIComponent runningUIComponent = new RunningUIComponent(new j(ThemeStrategy.FollowApp, ogvIntroFloatingBall, ogvIntroFloatingBallService, r02, new ExposureEntry(com.bilibili.ship.theseus.united.report.a.f104837a, new Function0(ogvIntroFloatingBallService, ogvIntroFloatingBall) { // from class: com.bilibili.ship.theseus.ogv.activity.h

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final OgvIntroFloatingBallService f91555a;

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final OgvIntroFloatingBall f91556b;

                        {
                            this.f91555a = ogvIntroFloatingBallService;
                            this.f91556b = ogvIntroFloatingBall;
                        }

                        public final Object invoke() {
                            PageReportService.i(this.f91555a.f91435e, "united.player-video-detail.bottom-float.0.show", this.f91556b.f91430e, 4);
                            return Unit.INSTANCE;
                        }
                    })), 0, new OgvIntroFloatingBallService$createOgvIntroFloatingViewComponent$1(null), 2);
                    OgvIntroFloatingBallService ogvIntroFloatingBallService2 = this.this$0;
                    this.label = 1;
                    ArrayList arrayList = new ArrayList();
                    invokeSuspend$lambda$1(runningUIComponent, ogvIntroFloatingBallService2, completableDeferredCompletableDeferred$default, new SelectKt$selectCancellingUnselected$scope$1(arrayList));
                    if (FlowKt.first(FlowKt.merge(arrayList), this) == coroutine_suspended) {
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
        public AnonymousClass1(OgvIntroFloatingBallService ogvIntroFloatingBallService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = ogvIntroFloatingBallService;
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
                final MutableStateFlow<OgvActivityVo> mutableStateFlow = this.this$0.f91432b.f92284f;
                Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(new Flow<OgvIntroFloatingBall>(mutableStateFlow) { // from class: com.bilibili.ship.theseus.ogv.activity.OgvIntroFloatingBallService$1$invokeSuspend$$inlined$map$1

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final Flow f91437a;

                    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.activity.OgvIntroFloatingBallService$1$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/activity/OgvIntroFloatingBallService$1$invokeSuspend$$inlined$map$1$2.class */
                    public static final class AnonymousClass2<T> implements FlowCollector {

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final FlowCollector f91438a;

                        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.activity.OgvIntroFloatingBallService$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/activity/OgvIntroFloatingBallService$1$invokeSuspend$$inlined$map$1$2$1.class */
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
                            this.f91438a = flowCollector;
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
                                boolean r0 = r0 instanceof com.bilibili.ship.theseus.ogv.activity.OgvIntroFloatingBallService$1$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1
                                if (r0 == 0) goto L29
                                r0 = r7
                                com.bilibili.ship.theseus.ogv.activity.OgvIntroFloatingBallService$1$invokeSuspend$$inlined$map$1$2$1 r0 = (com.bilibili.ship.theseus.ogv.activity.OgvIntroFloatingBallService$1$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
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
                                com.bilibili.ship.theseus.ogv.activity.OgvIntroFloatingBallService$1$invokeSuspend$$inlined$map$1$2$1 r0 = new com.bilibili.ship.theseus.ogv.activity.OgvIntroFloatingBallService$1$invokeSuspend$$inlined$map$1$2$1
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
                                goto L8e
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
                                com.bilibili.ship.theseus.ogv.activity.OgvActivityVo r0 = (com.bilibili.ship.theseus.ogv.activity.OgvActivityVo) r0
                                r6 = r0
                                r0 = r6
                                if (r0 == 0) goto L74
                                r0 = r6
                                com.bilibili.ship.theseus.ogv.activity.OgvIntroFloatingBall r0 = r0.b()
                                r6 = r0
                                goto L76
                            L74:
                                r0 = 0
                                r6 = r0
                            L76:
                                r0 = r7
                                r1 = 1
                                r0.label = r1
                                r0 = r5
                                kotlinx.coroutines.flow.FlowCollector r0 = r0.f91438a
                                r1 = r6
                                r2 = r7
                                java.lang.Object r0 = r0.emit(r1, r2)
                                r1 = r9
                                if (r0 != r1) goto L8e
                                r0 = r9
                                return r0
                            L8e:
                                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                                return r0
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ogv.activity.OgvIntroFloatingBallService$1$invokeSuspend$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                        }
                    }

                    {
                        this.f91437a = mutableStateFlow;
                    }

                    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                        Object objCollect = this.f91437a.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }
                });
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowDistinctUntilChanged, anonymousClass2, this) == coroutine_suspended) {
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
    public OgvIntroFloatingBallService(@NotNull CoroutineScope coroutineScope, @NotNull UnitedActivityComposeContainerService unitedActivityComposeContainerService, @NotNull IntroFloatingViewService introFloatingViewService, @NotNull OgvActivityService ogvActivityService, @NotNull PageReportService pageReportService, @NotNull Router router) {
        this.f91431a = coroutineScope;
        this.f91432b = unitedActivityComposeContainerService;
        this.f91433c = introFloatingViewService;
        this.f91434d = ogvActivityService;
        this.f91435e = pageReportService;
        this.f91436f = router;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
    }
}
