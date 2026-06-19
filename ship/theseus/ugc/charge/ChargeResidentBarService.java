package com.bilibili.ship.theseus.ugc.charge;

import android.widget.FrameLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.font.C4496a;
import com.bilibili.bangumi.logic.page.detail.service.e;
import com.bilibili.lib.media.resource.ExtraInfo;
import com.bilibili.ship.theseus.united.page.ad.PageAdRepository;
import com.bilibili.ship.theseus.united.page.charge.ChargeRepository;
import com.bilibili.ship.theseus.united.page.episode.EpisodeExtraInfoRepository;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import com.bilibili.ship.theseus.united.page.restrictionlayer.InterfaceC6388m;
import com.bilibili.ship.theseus.united.page.restrictionlayer.TextVo;
import com.bilibili.ship.theseus.united.page.restrictionlayer.s;
import com.bilibili.ship.theseus.united.page.uistyle.TheseusPageUIStyleRepository;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/charge/ChargeResidentBarService.class */
@StabilityInferred(parameters = 0)
public final class ChargeResidentBarService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f96410a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Flow<a> f96411b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final ChargeRepository f96412c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final InterfaceC6388m f96413d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final EpisodeExtraInfoRepository f96414e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final PageReportService f96415f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final TheseusPageUIStyleRepository f96416g;

    @NotNull
    public final PageAdRepository h;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.charge.ChargeResidentBarService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/charge/ChargeResidentBarService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final ChargeResidentBarService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.charge.ChargeResidentBarService$1$2, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/charge/ChargeResidentBarService$1$2.class */
        public static final class AnonymousClass2 extends SuspendLambda implements Function3<FrameLayout, ExtraInfo, Continuation<? super Pair<? extends FrameLayout, ? extends ResidentBar>>, Object> {
            Object L$0;
            Object L$1;
            int label;

            public AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
                super(3, continuation);
            }

            public final Object invoke(FrameLayout frameLayout, ExtraInfo extraInfo, Continuation<? super Pair<? extends FrameLayout, ResidentBar>> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(continuation);
                anonymousClass2.L$0 = frameLayout;
                anonymousClass2.L$1 = extraInfo;
                return anonymousClass2.invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                FrameLayout frameLayout = (FrameLayout) this.L$0;
                ExtraInfo extraInfo = (ExtraInfo) this.L$1;
                return TuplesKt.to(frameLayout, extraInfo != null ? (ResidentBar) c.f96438a.a(extraInfo) : null);
            }
        }

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.charge.ChargeResidentBarService$1$3, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/charge/ChargeResidentBarService$1$3.class */
        public static final class AnonymousClass3 extends SuspendLambda implements Function2<Pair<? extends FrameLayout, ? extends ResidentBar>, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final ChargeResidentBarService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(ChargeResidentBarService chargeResidentBarService, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.this$0 = chargeResidentBarService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, continuation);
                anonymousClass3.L$0 = obj;
                return anonymousClass3;
            }

            public final Object invoke(Pair<? extends FrameLayout, ResidentBar> pair, Continuation<? super Unit> continuation) {
                return create(pair, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    Pair pair = (Pair) this.L$0;
                    FrameLayout frameLayout = (FrameLayout) pair.component1();
                    ResidentBar residentBar = (ResidentBar) pair.component2();
                    if (frameLayout != null && residentBar != null) {
                        ChargeResidentBarService chargeResidentBarService = this.this$0;
                        this.label = 1;
                        if (ChargeResidentBarService.a(chargeResidentBarService, frameLayout, residentBar, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    return Unit.INSTANCE;
                }
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ChargeResidentBarService chargeResidentBarService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = chargeResidentBarService;
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
                ChargeResidentBarService chargeResidentBarService = this.this$0;
                final Flow<a> flow = chargeResidentBarService.f96411b;
                Flow flowCombine = FlowKt.combine(new Flow<FrameLayout>(flow) { // from class: com.bilibili.ship.theseus.ugc.charge.ChargeResidentBarService$1$invokeSuspend$$inlined$map$1

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final Flow f96417a;

                    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.charge.ChargeResidentBarService$1$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/charge/ChargeResidentBarService$1$invokeSuspend$$inlined$map$1$2.class */
                    public static final class AnonymousClass2<T> implements FlowCollector {

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final FlowCollector f96418a;

                        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.charge.ChargeResidentBarService$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/charge/ChargeResidentBarService$1$invokeSuspend$$inlined$map$1$2$1.class */
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
                            this.f96418a = flowCollector;
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
                                boolean r0 = r0 instanceof com.bilibili.ship.theseus.ugc.charge.ChargeResidentBarService$1$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1
                                if (r0 == 0) goto L29
                                r0 = r7
                                com.bilibili.ship.theseus.ugc.charge.ChargeResidentBarService$1$invokeSuspend$$inlined$map$1$2$1 r0 = (com.bilibili.ship.theseus.ugc.charge.ChargeResidentBarService$1$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
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
                                com.bilibili.ship.theseus.ugc.charge.ChargeResidentBarService$1$invokeSuspend$$inlined$map$1$2$1 r0 = new com.bilibili.ship.theseus.ugc.charge.ChargeResidentBarService$1$invokeSuspend$$inlined$map$1$2$1
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
                                com.bilibili.ship.theseus.ugc.charge.ChargeResidentBarService$a r0 = (com.bilibili.ship.theseus.ugc.charge.ChargeResidentBarService.a) r0
                                r6 = r0
                                r0 = r6
                                if (r0 == 0) goto L74
                                r0 = r6
                                android.widget.FrameLayout r0 = r0.f96419a
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
                                kotlinx.coroutines.flow.FlowCollector r0 = r0.f96418a
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
                            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ugc.charge.ChargeResidentBarService$1$invokeSuspend$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                        }
                    }

                    {
                        this.f96417a = flow;
                    }

                    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                        Object objCollect = this.f96417a.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }
                }, chargeResidentBarService.f96414e.f99566b, new AnonymousClass2(null));
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowCombine, anonymousClass3, this) == coroutine_suspended) {
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

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/charge/ChargeResidentBarService$a.class */
    @StabilityInferred(parameters = 0)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final FrameLayout f96419a;

        public a(@NotNull FrameLayout frameLayout) {
            this.f96419a = frameLayout;
        }
    }

    @Inject
    public ChargeResidentBarService(@NotNull CoroutineScope coroutineScope, @NotNull Flow<a> flow, @NotNull ChargeRepository chargeRepository, @NotNull InterfaceC6388m interfaceC6388m, @NotNull EpisodeExtraInfoRepository episodeExtraInfoRepository, @NotNull PageReportService pageReportService, @NotNull TheseusPageUIStyleRepository theseusPageUIStyleRepository, @NotNull PageAdRepository pageAdRepository) {
        this.f96410a = coroutineScope;
        this.f96411b = flow;
        this.f96412c = chargeRepository;
        this.f96413d = interfaceC6388m;
        this.f96414e = episodeExtraInfoRepository;
        this.f96415f = pageReportService;
        this.f96416g = theseusPageUIStyleRepository;
        this.h = pageAdRepository;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0034  */
    /* JADX WARN: Type inference failed for: r4v1, types: [com.bilibili.ship.theseus.ugc.charge.b] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(com.bilibili.ship.theseus.ugc.charge.ChargeResidentBarService r10, android.view.ViewGroup r11, com.bilibili.ship.theseus.ugc.charge.ResidentBar r12, kotlin.coroutines.jvm.internal.ContinuationImpl r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 366
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ugc.charge.ChargeResidentBarService.a(com.bilibili.ship.theseus.ugc.charge.ChargeResidentBarService, android.view.ViewGroup, com.bilibili.ship.theseus.ugc.charge.ResidentBar, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public static final void b(ResidentBar residentBar, ChargeResidentBarService chargeResidentBarService) {
        TextVo textVoB = residentBar.b();
        s sVar = textVoB != null ? textVoB.f102713j : null;
        defpackage.a.b("[theseus-ugc-ChargeResidentBarService-keepDisplaying$onClickButton] ", "click action " + sVar, "ChargeResidentBarService-keepDisplaying$onClickButton");
        if (sVar != null) {
            chargeResidentBarService.f96413d.a(sVar);
        }
    }

    public final void c(String str, Map<String, String> map) {
        if (StringsKt.w(str, "click")) {
            PageReportService.g(this.f96415f, str, map, 4);
        } else {
            e.a("[theseus-ugc-ChargeResidentBarService-reportClick] ", C4496a.a("eventId should end with click ", str), "ChargeResidentBarService-reportClick", (Throwable) null);
        }
    }
}
