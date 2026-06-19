package com.bilibili.ship.theseus.united.player.charge;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.player.tangram.basic.PlayerAvailability;
import com.bilibili.ship.theseus.keel.player.j;
import com.bilibili.ship.theseus.united.page.episode.EpisodeExtraInfoRepository;
import com.bilibili.ship.theseus.united.page.playingarea.i;
import com.bilibili.ship.theseus.united.page.playviewextra.FullPromptBarVo;
import javax.inject.Inject;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import mv0.C8043a;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.biliplayerv2.service.IPlayerCoreService;
import tv.danmaku.biliplayerv2.service.IToastService;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/charge/TheseusChargeToastService.class */
@StabilityInferred(parameters = 0)
public final class TheseusChargeToastService {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final long f104394i = Duration.getInWholeSeconds-impl(DurationKt.toDuration(1, DurationUnit.SECONDS));

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f104395j = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f104396a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Context f104397b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final b f104398c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final j f104399d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final IPlayerCoreService f104400e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final IToastService f104401f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final C8043a f104402g;

    @NotNull
    public final com.bilibili.ship.theseus.united.page.screensize.a h;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.player.charge.TheseusChargeToastService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/charge/TheseusChargeToastService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final Flow<Pair<FullPromptBarVo, Duration>> $toastMaterialFlow;
        int label;
        final TheseusChargeToastService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.player.charge.TheseusChargeToastService$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/charge/TheseusChargeToastService$1$1.class */
        public static final class C11621 extends SuspendLambda implements Function2<Pair<? extends FullPromptBarVo, ? extends Duration>, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final TheseusChargeToastService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C11621(TheseusChargeToastService theseusChargeToastService, Continuation<? super C11621> continuation) {
                super(2, continuation);
                this.this$0 = theseusChargeToastService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C11621 c11621 = new C11621(this.this$0, continuation);
                c11621.L$0 = obj;
                return c11621;
            }

            public final Object invoke(Pair<FullPromptBarVo, Duration> pair, Continuation<? super Unit> continuation) {
                return create(pair, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    Pair pair = (Pair) this.L$0;
                    defpackage.a.b("[theseus-united-TheseusChargeToastService$1$1-invokeSuspend] ", "waiting to show toast" + pair, "TheseusChargeToastService$1$1-invokeSuspend");
                    if (pair != null) {
                        FullPromptBarVo fullPromptBarVo = (FullPromptBarVo) pair.component1();
                        long j7 = ((Duration) pair.component2()).unbox-impl();
                        TheseusChargeToastService theseusChargeToastService = this.this$0;
                        this.label = 1;
                        int i8 = TheseusChargeToastService.f104395j;
                        theseusChargeToastService.getClass();
                        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new TheseusChargeToastService$runToast$2(theseusChargeToastService, fullPromptBarVo, j7, null), this);
                        if (objCoroutineScope != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                            objCoroutineScope = Unit.INSTANCE;
                        }
                        if (objCoroutineScope == coroutine_suspended) {
                            return coroutine_suspended;
                        }
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
        public AnonymousClass1(Flow<Pair<FullPromptBarVo, Duration>> flow, TheseusChargeToastService theseusChargeToastService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$toastMaterialFlow = flow;
            this.this$0 = theseusChargeToastService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$toastMaterialFlow, this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(this.$toastMaterialFlow);
                C11621 c11621 = new C11621(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowDistinctUntilChanged, c11621, this) == coroutine_suspended) {
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
    public TheseusChargeToastService(@NotNull CoroutineScope coroutineScope, @NotNull Context context, @NotNull EpisodeExtraInfoRepository episodeExtraInfoRepository, @NotNull b bVar, @NotNull j jVar, @NotNull IPlayerCoreService iPlayerCoreService, @NotNull IToastService iToastService, @NotNull C8043a c8043a, @NotNull i iVar, @NotNull com.bilibili.ship.theseus.united.page.screensize.a aVar) {
        this.f104396a = coroutineScope;
        this.f104397b = context;
        this.f104398c = bVar;
        this.f104399d = jVar;
        this.f104400e = iPlayerCoreService;
        this.f104401f = iToastService;
        this.f104402g = c8043a;
        this.h = aVar;
        final Flow<PlayerAvailability> flowD = jVar.d();
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(FlowKt.distinctUntilChanged(FlowKt.transformLatest(FlowKt.combine(episodeExtraInfoRepository.f99566b, FlowKt.mapLatest(new Flow<PlayerAvailability>(flowD) { // from class: com.bilibili.ship.theseus.united.player.charge.TheseusChargeToastService$special$$inlined$filterNot$1

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Flow f104413a;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.player.charge.TheseusChargeToastService$special$$inlined$filterNot$1$2, reason: invalid class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/charge/TheseusChargeToastService$special$$inlined$filterNot$1$2.class */
            public static final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final FlowCollector f104414a;

                /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.player.charge.TheseusChargeToastService$special$$inlined$filterNot$1$2$1, reason: invalid class name */
                /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/charge/TheseusChargeToastService$special$$inlined$filterNot$1$2$1.class */
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
                    this.f104414a = flowCollector;
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
                        boolean r0 = r0 instanceof com.bilibili.ship.theseus.united.player.charge.TheseusChargeToastService$special$$inlined$filterNot$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L29
                        r0 = r7
                        com.bilibili.ship.theseus.united.player.charge.TheseusChargeToastService$special$$inlined$filterNot$1$2$1 r0 = (com.bilibili.ship.theseus.united.player.charge.TheseusChargeToastService$special$$inlined$filterNot$1.AnonymousClass2.AnonymousClass1) r0
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
                        com.bilibili.ship.theseus.united.player.charge.TheseusChargeToastService$special$$inlined$filterNot$1$2$1 r0 = new com.bilibili.ship.theseus.united.player.charge.TheseusChargeToastService$special$$inlined$filterNot$1$2$1
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
                        com.bilibili.player.tangram.basic.PlayerAvailability r0 = (com.bilibili.player.tangram.basic.PlayerAvailability) r0
                        r10 = r0
                        r0 = r10
                        com.bilibili.player.tangram.basic.PlayerAvailability r1 = com.bilibili.player.tangram.basic.PlayerAvailability.IDLE
                        if (r0 == r1) goto L94
                        r0 = r10
                        com.bilibili.player.tangram.basic.PlayerAvailability r1 = com.bilibili.player.tangram.basic.PlayerAvailability.LOADING
                        if (r0 != r1) goto L7c
                        goto L94
                    L7c:
                        r0 = r7
                        r1 = 1
                        r0.label = r1
                        r0 = r5
                        kotlinx.coroutines.flow.FlowCollector r0 = r0.f104414a
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
                    throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.player.charge.TheseusChargeToastService$special$$inlined$filterNot$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            {
                this.f104413a = flowD;
            }

            public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object objCollect = this.f104413a.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        }, new TheseusChargeToastService$playerAvailableFlow$2(null)), jVar.s(), iVar.f102367c, iToastService.getToastAvailableFlow(), new TheseusChargeToastService$toastMaterialFlow$1(this, null)), new TheseusChargeToastService$special$$inlined$flatMapLatest$1(null, this))), this, null), 3, (Object) null);
    }

    public final String a(long j7, boolean z6) {
        if (!z6 || j7 <= 0) {
            return "";
        }
        return j7 > 3600 ? com.bilibili.app.authorspace.local.service.j.a(j7 / ((long) 3600), this.f104397b.getString(2131851861)) : j7 > 60 ? com.bilibili.app.authorspace.local.service.j.a(j7 / ((long) 60), this.f104397b.getString(2131851863)) : com.bilibili.app.authorspace.local.service.j.a(j7, this.f104397b.getString(2131851775));
    }
}
