package com.bilibili.ship.theseus.united.page.interactvideo;

import com.bapis.bilibili.app.playerunite.v1.PlayViewUniteReply;
import com.bapis.bilibili.playershared.Fragment;
import com.bilibili.app.gemini.base.player.GeminiCommonPlayableParams;
import com.bilibili.player.tangram.basic.PlayNetworkEnv;
import com.bilibili.player.tangram.basic.PlayerAvailability;
import com.bilibili.player.tangram.basic.ResolveAndPlayPlayable;
import com.bilibili.player.tangram.basic.WithVideoProgress;
import com.bilibili.player.tangram.playercore.A;
import com.bilibili.player.tangram.playercore.InterfaceC5778f;
import com.bilibili.ship.theseus.united.page.interactvideo.TheseusInteractVideoService;
import com.bilibili.ship.theseus.united.page.interactvideo.model.InteractiveVideoUpdateSceneInfo$Request;
import com.bilibili.studio.material.util.UtilsKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.time.Duration;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.YieldKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import tv.danmaku.android.log.BLog;
import tv.danmaku.biliplayerv2.service.L;
import tv.danmaku.biliplayerv2.service.setting.IPlayerSettingService;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/interactvideo/TheseusInteractVideoService$runNode$2.class */
final class TheseusInteractVideoService$runNode$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<?>, Object> {
    final Flow<TheseusInteractVideoService.a> $actions;
    final GeminiCommonPlayableParams $playableParams;
    final com.bilibili.app.gemini.ugc.feature.interactivevideo.j $pointer;
    final PlayViewUniteReply $preloadedPlayViewUniteReply;
    final com.bilibili.ship.theseus.keel.player.j $preloadedPlayable;
    private Object L$0;
    Object L$1;
    Object L$10;
    Object L$11;
    Object L$12;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    Object L$9;
    int label;
    final TheseusInteractVideoService this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.interactvideo.TheseusInteractVideoService$runNode$2$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/interactvideo/TheseusInteractVideoService$runNode$2$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final TheseusInteractVideoService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(TheseusInteractVideoService theseusInteractVideoService, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = theseusInteractVideoService;
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
                this.label = 1;
                if (YieldKt.yield(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            TheseusInteractVideoService theseusInteractVideoService = this.this$0;
            f fVar = theseusInteractVideoService.f99882S;
            if (fVar != null) {
                IPlayerSettingService iPlayerSettingService = theseusInteractVideoService.f99903t;
                String str = fVar.f99968a;
                if (str.length() > 0) {
                    iPlayerSettingService.putString("player_key_video_aspect", str);
                }
                iPlayerSettingService.putBoolean("player_open_flip_video", fVar.f99969b);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.interactvideo.TheseusInteractVideoService$runNode$2$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/interactvideo/TheseusInteractVideoService$runNode$2$3.class */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final a $playable;
        int label;
        final TheseusInteractVideoService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(TheseusInteractVideoService theseusInteractVideoService, a aVar, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.this$0 = theseusInteractVideoService;
            this.$playable = aVar;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass3(this.this$0, this.$playable, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                Function2<com.bilibili.ship.theseus.keel.player.j, Continuation<? super Unit>, Object> function2 = this.this$0.f99908y;
                a aVar = this.$playable;
                this.label = 1;
                if (function2.invoke(aVar, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.interactvideo.TheseusInteractVideoService$runNode$2$4, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/interactvideo/TheseusInteractVideoService$runNode$2$4.class */
    public static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final a $playable;
        int label;
        final TheseusInteractVideoService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.interactvideo.TheseusInteractVideoService$runNode$2$4$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/interactvideo/TheseusInteractVideoService$runNode$2$4$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final TheseusInteractVideoService f99943a;

            public a(TheseusInteractVideoService theseusInteractVideoService) {
                this.f99943a = theseusInteractVideoService;
            }

            public final Object emit(Object obj, Continuation continuation) {
                PlayViewUniteReply playViewUniteReply = (PlayViewUniteReply) obj;
                float mark = playViewUniteReply.getPlayArc().getInteraction().getMark();
                TheseusInteractVideoService theseusInteractVideoService = this.f99943a;
                theseusInteractVideoService.f99876M = mark;
                Object objEmit = theseusInteractVideoService.f99875L.emit(playViewUniteReply, continuation);
                if (objEmit != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    objEmit = Unit.INSTANCE;
                }
                return objEmit;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(a aVar, TheseusInteractVideoService theseusInteractVideoService, Continuation<? super AnonymousClass4> continuation) {
            super(2, continuation);
            this.$playable = aVar;
            this.this$0 = theseusInteractVideoService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass4(this.$playable, this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<PlayViewUniteReply> flowG = this.$playable.f99945a.g();
                a aVar = new a(this.this$0);
                this.label = 1;
                if (flowG.collect(aVar, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.interactvideo.TheseusInteractVideoService$runNode$2$5, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/interactvideo/TheseusInteractVideoService$runNode$2$5.class */
    public static final class AnonymousClass5 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final a $playable;
        int label;
        final TheseusInteractVideoService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.interactvideo.TheseusInteractVideoService$runNode$2$5$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/interactvideo/TheseusInteractVideoService$runNode$2$5$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final TheseusInteractVideoService f99944a;

            public a(TheseusInteractVideoService theseusInteractVideoService) {
                this.f99944a = theseusInteractVideoService;
            }

            public final Object emit(Object obj, Continuation continuation) {
                if (((PlayerAvailability) obj) == PlayerAvailability.COMPLETED) {
                    BLog.i("TheseusInteractVideoService$runNode$2$5$1-emit", "[theseus-united-TheseusInteractVideoService$runNode$2$5$1-emit] Sending video end to chronos.");
                    ti1.a chronosMessageSender = this.f99944a.f99889e.getChronosMessageSender();
                    if (chronosMessageSender != null) {
                    }
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(a aVar, TheseusInteractVideoService theseusInteractVideoService, Continuation<? super AnonymousClass5> continuation) {
            super(2, continuation);
            this.$playable = aVar;
            this.this$0 = theseusInteractVideoService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass5(this.$playable, this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<PlayerAvailability> flowD = this.$playable.f99945a.d();
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.interactvideo.TheseusInteractVideoService$runNode$2$6, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/interactvideo/TheseusInteractVideoService$runNode$2$6.class */
    public static final class AnonymousClass6 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final TheseusInteractVideoService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass6(TheseusInteractVideoService theseusInteractVideoService, Continuation<? super AnonymousClass6> continuation) {
            super(2, continuation);
            this.this$0 = theseusInteractVideoService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass6(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            try {
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.label = 1;
                    if (DelayKt.awaitCancellation(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                throw new KotlinNothingValueException();
            } catch (Throwable th) {
                TheseusInteractVideoService theseusInteractVideoService = this.this$0;
                theseusInteractVideoService.getClass();
                InteractiveVideoUpdateSceneInfo$Request interactiveVideoUpdateSceneInfo$Request = new InteractiveVideoUpdateSceneInfo$Request();
                interactiveVideoUpdateSceneInfo$Request.setScene("");
                ti1.a chronosMessageSender = theseusInteractVideoService.f99889e.getChronosMessageSender();
                if (chronosMessageSender != null) {
                }
                this.this$0.l(null);
                TheseusInteractVideoService theseusInteractVideoService2 = this.this$0;
                IPlayerSettingService iPlayerSettingService = theseusInteractVideoService2.f99903t;
                theseusInteractVideoService2.f99882S = new f(iPlayerSettingService.getString("player_key_video_aspect", ""), iPlayerSettingService.getBoolean("player_open_flip_video", false));
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.interactvideo.TheseusInteractVideoService$runNode$2$7, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/interactvideo/TheseusInteractVideoService$runNode$2$7.class */
    public static final class AnonymousClass7 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final a $playable;
        final com.bilibili.app.gemini.ugc.feature.interactivevideo.j $pointer;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass7(com.bilibili.app.gemini.ugc.feature.interactivevideo.j jVar, a aVar, Continuation<? super AnonymousClass7> continuation) {
            super(2, continuation);
            this.$pointer = jVar;
            this.$playable = aVar;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass7(this.$pointer, this.$playable, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                int i8 = this.$pointer.g;
                if (i8 > 0) {
                    a aVar = this.$playable;
                    long j7 = i8;
                    this.label = 1;
                    if (aVar.f99945a.y(j7, true, this) == coroutine_suspended) {
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

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/interactvideo/TheseusInteractVideoService$runNode$2$a.class */
    public static final class a implements com.bilibili.ship.theseus.keel.player.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.bilibili.ship.theseus.keel.player.j f99945a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final com.bilibili.ship.theseus.keel.player.j f99946b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ArrayList<com.bilibili.ship.theseus.united.page.interactvideo.a> f99947c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final TheseusInteractVideoService f99948d;

        public a(com.bilibili.ship.theseus.keel.player.j jVar, ArrayList<com.bilibili.ship.theseus.united.page.interactvideo.a> arrayList, TheseusInteractVideoService theseusInteractVideoService) {
            this.f99946b = jVar;
            this.f99947c = arrayList;
            this.f99948d = theseusInteractVideoService;
            this.f99945a = jVar;
        }

        @Override // com.bilibili.player.tangram.basic.l
        public final Flow<com.bilibili.player.tangram.basic.a> B() {
            return this.f99945a.B();
        }

        @Override // com.bilibili.player.tangram.playercore.v
        public final Flow<ResolveAndPlayPlayable.c<InterfaceC5778f>> C() {
            return this.f99945a.C();
        }

        @Override // com.bilibili.player.tangram.playercore.v
        public final Object D(ContinuationImpl continuationImpl) {
            return this.f99945a.D(continuationImpl);
        }

        @Override // com.bilibili.player.tangram.playercore.v
        public final Object E(Continuation<? super Unit> continuation) {
            return this.f99945a.E(continuation);
        }

        @Override // com.bilibili.player.tangram.basic.WithVideoProgress
        public final long F() {
            return this.f99945a.F();
        }

        public final void G(Function1<? super sb0.c, sb0.c> function1) {
            this.f99945a.G(function1);
        }

        @Override // com.bilibili.player.tangram.basic.l
        public final Flow<com.bilibili.player.tangram.basic.a> H() {
            return this.f99945a.H();
        }

        @Override // com.bilibili.player.tangram.basic.WithVideoProgress
        public final Flow<Duration> J() {
            return this.f99945a.J();
        }

        @Override // com.bilibili.player.tangram.basic.l
        public final Object K(com.bilibili.player.tangram.basic.c cVar, ContinuationImpl continuationImpl) {
            return this.f99945a.K(cVar, continuationImpl);
        }

        @Override // com.bilibili.player.tangram.basic.WithVideoProgress
        public final long L() {
            return this.f99945a.L();
        }

        @Override // com.bilibili.ship.theseus.keel.player.j
        public final Fragment O() {
            return this.f99945a.O();
        }

        @Override // com.bilibili.ship.theseus.keel.player.j
        public final void P(boolean z6) {
            this.f99945a.P(z6);
        }

        public final sb0.c R() {
            return this.f99945a.R();
        }

        public final Flow<L> T() {
            return this.f99945a.T();
        }

        public final L Z() {
            return this.f99945a.Z();
        }

        @Override // com.bilibili.ship.theseus.keel.player.j
        public final Object a(Continuation<? super Unit> continuation) {
            return this.f99945a.a(continuation);
        }

        @Override // com.bilibili.player.tangram.playercore.v
        public final Flow<com.bilibili.player.tangram.playercore.u> b() {
            return this.f99945a.b();
        }

        @Override // com.bilibili.player.tangram.basic.WithVideoProgress
        public final Object c(long j7, boolean z6, Continuation<? super Boolean> continuation) {
            long j8;
            Iterator<com.bilibili.ship.theseus.united.page.interactvideo.a> it = this.f99947c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    j8 = j7;
                    break;
                }
                com.bilibili.ship.theseus.united.page.interactvideo.a next = it.next();
                if (Duration.compareTo-LRDsOJo(j7, next.f99949a) > 0 && Duration.compareTo-LRDsOJo(Duration.minus-LRDsOJo(j7, next.f99950b), next.f99949a) <= 0) {
                    j8 = next.f99951c;
                    break;
                }
            }
            if (!Duration.equals-impl0(j8, j7)) {
                defpackage.a.b("[theseus-united-TheseusInteractVideoService$runNode$2$playable$1-seekTo-KLykuaI] ", androidx.constraintlayout.motion.widget.p.a("Position adjusted from ", Duration.toString-impl(j7), " to ", Duration.toString-impl(j8), UtilsKt.DOT), "TheseusInteractVideoService$runNode$2$playable$1-seekTo-KLykuaI");
                this.f99948d.f99894k.p();
            }
            return this.f99946b.c(j8, z6, continuation);
        }

        @Override // com.bilibili.player.tangram.basic.j
        public final Flow<PlayerAvailability> d() {
            return this.f99945a.d();
        }

        @Override // com.bilibili.player.tangram.playercore.v
        public final Object d0(Function2 function2, SuspendLambda suspendLambda) {
            return this.f99945a.d0(function2, suspendLambda);
        }

        @Override // com.bilibili.player.tangram.basic.k
        public final Flow<PlayNetworkEnv> e() {
            return this.f99945a.e();
        }

        @Override // com.bilibili.ship.theseus.keel.player.j
        public final GeminiCommonPlayableParams f() {
            return this.f99945a.f();
        }

        @Override // com.bilibili.ship.theseus.keel.player.j
        public final Flow<PlayViewUniteReply> g() {
            return this.f99945a.g();
        }

        @Override // com.bilibili.player.tangram.basic.WithVideoProgress
        public final Long h() {
            return this.f99945a.h();
        }

        @Override // com.bilibili.player.tangram.playercore.v
        public final ResolveAndPlayPlayable.c<InterfaceC5778f> h0() {
            return this.f99945a.h0();
        }

        @Override // com.bilibili.player.tangram.basic.l
        public final com.bilibili.player.tangram.basic.a i() {
            return this.f99945a.i();
        }

        @Override // com.bilibili.ship.theseus.keel.player.j
        public final void j(GeminiCommonPlayableParams geminiCommonPlayableParams) {
            this.f99945a.j(geminiCommonPlayableParams);
        }

        @Override // com.bilibili.player.tangram.basic.j
        public final PlayerAvailability k() {
            return this.f99945a.k();
        }

        @Override // com.bilibili.ship.theseus.keel.player.j
        public final StateFlow<GeminiCommonPlayableParams> l() {
            return this.f99945a.l();
        }

        @Override // com.bilibili.player.tangram.playercore.G
        public final boolean m(com.bilibili.player.tangram.playercore.u uVar) {
            return this.f99945a.m(uVar);
        }

        @Override // com.bilibili.player.tangram.playercore.v
        public final void n() {
            this.f99945a.n();
        }

        @Override // com.bilibili.player.tangram.playercore.v
        public final com.bilibili.player.tangram.playercore.u o() {
            return this.f99945a.o();
        }

        @Override // com.bilibili.ship.theseus.keel.player.j
        public final WithVideoProgress p() {
            return this.f99945a.p();
        }

        @Override // com.bilibili.player.tangram.basic.WithVideoProgress
        public final Duration q() {
            return this.f99945a.q();
        }

        @Override // com.bilibili.player.tangram.basic.WithVideoProgress
        public final Flow<Long> r() {
            return this.f99945a.r();
        }

        public final Flow<sb0.c> s() {
            return this.f99945a.s();
        }

        @Override // com.bilibili.player.tangram.basic.l
        public final Flow<List<com.bilibili.player.tangram.basic.a>> t() {
            return this.f99945a.t();
        }

        @Override // com.bilibili.player.tangram.playercore.v
        public final Object u(Continuation<? super Long> continuation) {
            return this.f99945a.u(continuation);
        }

        @Override // com.bilibili.player.tangram.playercore.v
        public final Flow<A> v() {
            return this.f99945a.v();
        }

        @Override // com.bilibili.player.tangram.basic.l
        public final com.bilibili.player.tangram.basic.a x() {
            return this.f99945a.x();
        }

        @Override // com.bilibili.player.tangram.basic.WithVideoProgress
        public final Object y(long j7, boolean z6, Continuation<? super Boolean> continuation) {
            return this.f99945a.y(j7, z6, continuation);
        }

        @Override // com.bilibili.ship.theseus.keel.player.j
        public final boolean z() {
            return this.f99945a.z();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TheseusInteractVideoService$runNode$2(com.bilibili.ship.theseus.keel.player.j jVar, TheseusInteractVideoService theseusInteractVideoService, GeminiCommonPlayableParams geminiCommonPlayableParams, PlayViewUniteReply playViewUniteReply, com.bilibili.app.gemini.ugc.feature.interactivevideo.j jVar2, Flow<? extends TheseusInteractVideoService.a> flow, Continuation<? super TheseusInteractVideoService$runNode$2> continuation) {
        super(2, continuation);
        this.$preloadedPlayable = jVar;
        this.this$0 = theseusInteractVideoService;
        this.$playableParams = geminiCommonPlayableParams;
        this.$preloadedPlayViewUniteReply = playViewUniteReply;
        this.$pointer = jVar2;
        this.$actions = flow;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        TheseusInteractVideoService$runNode$2 theseusInteractVideoService$runNode$2 = new TheseusInteractVideoService$runNode$2(this.$preloadedPlayable, this.this$0, this.$playableParams, this.$preloadedPlayViewUniteReply, this.$pointer, this.$actions, continuation);
        theseusInteractVideoService$runNode$2.L$0 = obj;
        return theseusInteractVideoService$runNode$2;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<?> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x12d5, code lost:
    
        r0.element = com.bilibili.ship.theseus.united.page.interactvideo.TheseusInteractVideoService.d(r0, r0, (com.bilibili.ship.theseus.united.page.interactvideo.TheseusInteractVideoService.b) r0.element, r0);
        r0 = kotlin.Unit.INSTANCE;
        r24 = r0;
        r12 = r0;
        r19 = r0;
        r21 = r0;
        r25 = r0;
        r23 = r0;
        r20 = r0;
        r18 = r0;
        r26 = r0;
        r22 = r0;
        r27 = r0;
        r28 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0d82, code lost:
    
        r0.f99894k.p();
        kotlinx.coroutines.BuildersKt.launch$default(r0, (kotlin.coroutines.CoroutineContext) null, (kotlinx.coroutines.CoroutineStart) null, new com.bilibili.ship.theseus.united.page.interactvideo.TheseusInteractVideoService$runNode$2$8$1(r0, null), 3, (java.lang.Object) null);
        r26 = r0;
        r28 = r0;
        r12 = r0;
        r20 = r0;
        r25 = r0;
        r27 = r0;
        r21 = r0;
        r18 = r0;
        r24 = r0;
        r23 = r0;
        r29 = r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0750  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0753  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0824  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0827  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x087d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x09f1  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x09f4  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0a54  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0b76  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0cac  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:131:0x11a4 -> B:132:0x11b0). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:133:0x11c8 -> B:134:0x11d4). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) throws kotlin.NoWhenBranchMatchedException {
        /*
            Method dump skipped, instruction units count: 4850
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.interactvideo.TheseusInteractVideoService$runNode$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
