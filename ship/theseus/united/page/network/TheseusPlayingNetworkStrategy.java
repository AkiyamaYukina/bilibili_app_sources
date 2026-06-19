package com.bilibili.ship.theseus.united.page.network;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import com.bilibili.player.tangram.basic.PlayNetworkEnv;
import com.bilibili.search2.api.SearchBangumiItem;
import com.bilibili.ship.theseus.keel.player.j;
import com.bilibili.ship.theseus.united.player.mediaplay.network.d;
import com.bilibili.ship.theseus.united.player.mediaplay.network.m;
import com.bilibili.ship.theseus.united.player.mediaplay.network.o;
import hv0.C7510d;
import java.util.concurrent.CancellationException;
import javax.inject.Inject;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;
import tv.danmaku.biliplayerv2.service.network.PlayerFreeDataHelper;
import tv.danmaku.biliplayerv2.service.setting.IPlayerSettingService;
import tv.danmaku.biliplayerv2.service.setting.PlayerSettingServiceKtxKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/network/TheseusPlayingNetworkStrategy.class */
@StabilityInferred(parameters = 0)
public final class TheseusPlayingNetworkStrategy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f102082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final FragmentActivity f102083b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final j f102084c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final C7510d f102085d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.screenstate.c f102086e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final o f102087f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.player.mediaplay.network.a f102088g;

    @NotNull
    public final m h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public Job f102089i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f102090j;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.network.TheseusPlayingNetworkStrategy$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/network/TheseusPlayingNetworkStrategy$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final TheseusPlayingNetworkStrategy this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.network.TheseusPlayingNetworkStrategy$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/network/TheseusPlayingNetworkStrategy$1$1.class */
        public static final class C10731 extends SuspendLambda implements Function3<PlayNetworkEnv, PlayNetworkEnv, Continuation<? super PlayNetworkEnv>, Object> {
            Object L$0;
            Object L$1;
            int label;
            final TheseusPlayingNetworkStrategy this$0;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.network.TheseusPlayingNetworkStrategy$1$1$1, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/network/TheseusPlayingNetworkStrategy$1$1$1.class */
            public static final class C10741 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final PlayNetworkEnv $currentNetworkEnv;
                final boolean $isLastEnvWifi;
                int label;
                final TheseusPlayingNetworkStrategy this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C10741(TheseusPlayingNetworkStrategy theseusPlayingNetworkStrategy, PlayNetworkEnv playNetworkEnv, boolean z6, Continuation<? super C10741> continuation) {
                    super(2, continuation);
                    this.this$0 = theseusPlayingNetworkStrategy;
                    this.$currentNetworkEnv = playNetworkEnv;
                    this.$isLastEnvWifi = z6;
                }

                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C10741(this.this$0, this.$currentNetworkEnv, this.$isLastEnvWifi, continuation);
                }

                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
                }

                /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
                public final Object invokeSuspend(Object obj) throws NoWhenBranchMatchedException {
                    Object objCoroutineScope;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i7 = this.label;
                    if (i7 == 0) {
                        ResultKt.throwOnFailure(obj);
                        TheseusPlayingNetworkStrategy theseusPlayingNetworkStrategy = this.this$0;
                        PlayNetworkEnv.a aVar = (PlayNetworkEnv.a) this.$currentNetworkEnv;
                        boolean z6 = this.$isLastEnvWifi;
                        this.label = 1;
                        theseusPlayingNetworkStrategy.getClass();
                        defpackage.a.b("[theseus-united-TheseusPlayingNetworkStrategy-playingOnCellular] ", "playingOnCellular, " + aVar + " " + z6, "TheseusPlayingNetworkStrategy-playingOnCellular");
                        int i8 = a.f102091a[aVar.f79288a.ordinal()];
                        com.bilibili.ship.theseus.united.player.mediaplay.network.a aVar2 = theseusPlayingNetworkStrategy.f102088g;
                        o oVar = theseusPlayingNetworkStrategy.f102087f;
                        if (i8 != 1) {
                            m mVar = theseusPlayingNetworkStrategy.h;
                            if (i8 == 2) {
                                BLog.i("TheseusPlayingNetworkStrategy-processPlayOnFreeDataSuccessful", "[theseus-united-TheseusPlayingNetworkStrategy-processPlayOnFreeDataSuccessful] network strategy play on free data successful, show free data toast");
                                oVar.b();
                                objCoroutineScope = mVar.c(true, this);
                                if (objCoroutineScope != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                                    objCoroutineScope = Unit.INSTANCE;
                                }
                                if (objCoroutineScope != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                                    objCoroutineScope = Unit.INSTANCE;
                                }
                            } else if (i8 == 3 || i8 == 4) {
                                aVar2.getClass();
                                com.bilibili.ship.theseus.united.player.mediaplay.network.a.c();
                                IPlayerSettingService.Companion companion = IPlayerSettingService.Companion;
                                BLog.i("TheseusPlayingNetworkStrategy-processPlayOnFreeDataFailedAndDowngrade", "[theseus-united-TheseusPlayingNetworkStrategy-processPlayOnFreeDataFailedAndDowngrade] " + com.bilibili.app.comm.bh.x5.b.a("network strategy play on free data failed, auto play on cellular: ", PlayerSettingServiceKtxKt.b(companion)));
                                if (PlayerSettingServiceKtxKt.b(companion)) {
                                    oVar.b();
                                    objCoroutineScope = mVar.e(this);
                                    if (objCoroutineScope != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                                        objCoroutineScope = Unit.INSTANCE;
                                    }
                                } else {
                                    int freeDataResultCode = PlayerFreeDataHelper.INSTANCE.getFreeDataResultCode();
                                    FragmentActivity fragmentActivity = theseusPlayingNetworkStrategy.f102083b;
                                    objCoroutineScope = CoroutineScopeKt.coroutineScope(new TheseusPlayingNetworkStrategy$enforcePlayLimitOnCellular$3(new d.a(121, freeDataResultCode == 2036 ? fragmentActivity.getString(2131845891) : fragmentActivity.getString(2131845436), null, null, false, false), theseusPlayingNetworkStrategy, new QY0.b(theseusPlayingNetworkStrategy, 3), null), this);
                                    if (objCoroutineScope != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                                        objCoroutineScope = Unit.INSTANCE;
                                    }
                                    if (objCoroutineScope != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                                        objCoroutineScope = Unit.INSTANCE;
                                    }
                                }
                                if (objCoroutineScope != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                                    objCoroutineScope = Unit.INSTANCE;
                                }
                            } else {
                                if (i8 != 5) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                objCoroutineScope = Unit.INSTANCE;
                            }
                        } else {
                            BLog.i("TheseusPlayingNetworkStrategy-processPlayOnCellular", "[theseus-united-TheseusPlayingNetworkStrategy-processPlayOnCellular] " + com.bilibili.app.comm.bh.x5.b.a("processPlayOnCellular, ", z6));
                            aVar2.getClass();
                            IPlayerSettingService.Companion companion2 = IPlayerSettingService.Companion;
                            if (PlayerSettingServiceKtxKt.b(companion2) || theseusPlayingNetworkStrategy.f102090j) {
                                oVar.b();
                                BLog.i("TheseusPlayingNetworkStrategy-showToastOnCellular", "[theseus-united-TheseusPlayingNetworkStrategy-showToastOnCellular] " + ("showToastOnCellular, " + z6));
                                objCoroutineScope = CoroutineScopeKt.coroutineScope(new TheseusPlayingNetworkStrategy$showToastOnCellular$2(z6, theseusPlayingNetworkStrategy, null), this);
                                if (objCoroutineScope != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                                    objCoroutineScope = Unit.INSTANCE;
                                }
                                if (objCoroutineScope != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                                    objCoroutineScope = Unit.INSTANCE;
                                }
                            } else {
                                defpackage.a.b("[theseus-united-TheseusPlayingNetworkStrategy-processPlayOnCellular] ", com.bilibili.app.comm.bh.x5.a.a("network strategy show network limited, auto play on cellular: ", ", already show network limited: ", PlayerSettingServiceKtxKt.b(companion2), theseusPlayingNetworkStrategy.f102090j), "TheseusPlayingNetworkStrategy-processPlayOnCellular");
                                theseusPlayingNetworkStrategy.f102090j = true;
                                c71.b.a.getClass();
                                objCoroutineScope = CoroutineScopeKt.coroutineScope(new TheseusPlayingNetworkStrategy$enforcePlayLimitOnCellular$3(new d.a(SearchBangumiItem.TYPE_FULLNET_VARIETY, null, null, null, true, c71.b.b()), theseusPlayingNetworkStrategy, new QY0.b(theseusPlayingNetworkStrategy, 3), null), this);
                                if (objCoroutineScope != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                                    objCoroutineScope = Unit.INSTANCE;
                                }
                                if (objCoroutineScope != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                                    objCoroutineScope = Unit.INSTANCE;
                                }
                                if (objCoroutineScope != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                                    objCoroutineScope = Unit.INSTANCE;
                                }
                            }
                            if (objCoroutineScope != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                                objCoroutineScope = Unit.INSTANCE;
                            }
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

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C10731(TheseusPlayingNetworkStrategy theseusPlayingNetworkStrategy, Continuation<? super C10731> continuation) {
                super(3, continuation);
                this.this$0 = theseusPlayingNetworkStrategy;
            }

            public final Object invoke(PlayNetworkEnv playNetworkEnv, PlayNetworkEnv playNetworkEnv2, Continuation<? super PlayNetworkEnv> continuation) {
                C10731 c10731 = new C10731(this.this$0, continuation);
                c10731.L$0 = playNetworkEnv;
                c10731.L$1 = playNetworkEnv2;
                return c10731.invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                PlayNetworkEnv playNetworkEnv = (PlayNetworkEnv) this.L$0;
                PlayNetworkEnv playNetworkEnv2 = (PlayNetworkEnv) this.L$1;
                defpackage.a.b("[theseus-united-TheseusPlayingNetworkStrategy$1$1-invokeSuspend] ", "playing network changed, new env:" + playNetworkEnv2, "TheseusPlayingNetworkStrategy$1$1-invokeSuspend");
                if (playNetworkEnv2 instanceof PlayNetworkEnv.a) {
                    boolean z6 = playNetworkEnv instanceof PlayNetworkEnv.c;
                    Job job = this.this$0.f102089i;
                    if (job != null) {
                        Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                    }
                    TheseusPlayingNetworkStrategy theseusPlayingNetworkStrategy = this.this$0;
                    theseusPlayingNetworkStrategy.f102089i = BuildersKt.launch$default(theseusPlayingNetworkStrategy.f102082a, (CoroutineContext) null, (CoroutineStart) null, new C10741(theseusPlayingNetworkStrategy, playNetworkEnv2, z6, null), 3, (Object) null);
                } else {
                    this.this$0.f102087f.b();
                }
                return playNetworkEnv2;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(TheseusPlayingNetworkStrategy theseusPlayingNetworkStrategy, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = theseusPlayingNetworkStrategy;
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
                BLog.i("TheseusPlayingNetworkStrategy$1-invokeSuspend", "[theseus-united-TheseusPlayingNetworkStrategy$1-invokeSuspend] playing network changed, start collect");
                Flow<PlayNetworkEnv> flowE = this.this$0.f102084c.e();
                C10731 c10731 = new C10731(this.this$0, null);
                this.label = 1;
                if (FlowKt.reduce(flowE, c10731, this) == coroutine_suspended) {
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

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/network/TheseusPlayingNetworkStrategy$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f102091a;

        static {
            int[] iArr = new int[PlayNetworkEnv.Info.values().length];
            try {
                iArr[PlayNetworkEnv.Info.Cellular.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[PlayNetworkEnv.Info.OnFreeDataSuccessful.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            try {
                iArr[PlayNetworkEnv.Info.OnFreeDataFailed.ordinal()] = 3;
            } catch (NoSuchFieldError e9) {
            }
            try {
                iArr[PlayNetworkEnv.Info.OnFreeDataFailedAndDowngradeMobile.ordinal()] = 4;
            } catch (NoSuchFieldError e10) {
            }
            try {
                iArr[PlayNetworkEnv.Info.UnKnow.ordinal()] = 5;
            } catch (NoSuchFieldError e11) {
            }
            f102091a = iArr;
        }
    }

    @Inject
    public TheseusPlayingNetworkStrategy(@NotNull CoroutineScope coroutineScope, @NotNull FragmentActivity fragmentActivity, @NotNull j jVar, @NotNull C7510d c7510d, @NotNull com.bilibili.ship.theseus.united.page.screenstate.c cVar, @NotNull o oVar, @NotNull com.bilibili.ship.theseus.united.player.mediaplay.network.a aVar, @NotNull m mVar) {
        this.f102082a = coroutineScope;
        this.f102083b = fragmentActivity;
        this.f102084c = jVar;
        this.f102085d = c7510d;
        this.f102086e = cVar;
        this.f102087f = oVar;
        this.f102088g = aVar;
        this.h = mVar;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
    }
}
