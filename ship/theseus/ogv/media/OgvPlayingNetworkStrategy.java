package com.bilibili.ship.theseus.ogv.media;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import com.bilibili.player.tangram.basic.PlayNetworkEnv;
import com.bilibili.ship.theseus.united.player.mediaplay.MediaPlayDRMRepository;
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
import kotlin.jvm.functions.Function1;
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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/media/OgvPlayingNetworkStrategy.class */
@StabilityInferred(parameters = 0)
public final class OgvPlayingNetworkStrategy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f93995a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final FragmentActivity f93996b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.keel.player.j f93997c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final C7510d f93998d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.screenstate.c f93999e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final MediaPlayDRMRepository f94000f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.player.mediaplay.network.o f94001g;

    @NotNull
    public final com.bilibili.ship.theseus.united.player.mediaplay.network.a h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.player.mediaplay.network.m f94002i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public Job f94003j;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.media.OgvPlayingNetworkStrategy$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/media/OgvPlayingNetworkStrategy$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private Object L$0;
        int label;
        final OgvPlayingNetworkStrategy this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.media.OgvPlayingNetworkStrategy$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/media/OgvPlayingNetworkStrategy$1$1.class */
        public static final class C07371 extends SuspendLambda implements Function3<PlayNetworkEnv, PlayNetworkEnv, Continuation<? super PlayNetworkEnv>, Object> {
            final CoroutineScope $$this$launch;
            Object L$0;
            Object L$1;
            int label;
            final OgvPlayingNetworkStrategy this$0;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.media.OgvPlayingNetworkStrategy$1$1$1, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/media/OgvPlayingNetworkStrategy$1$1$1.class */
            public static final class C07381 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final PlayNetworkEnv $currentNetworkEnv;
                final boolean $isLastEnvWifi;
                int label;
                final OgvPlayingNetworkStrategy this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C07381(OgvPlayingNetworkStrategy ogvPlayingNetworkStrategy, PlayNetworkEnv playNetworkEnv, boolean z6, Continuation<? super C07381> continuation) {
                    super(2, continuation);
                    this.this$0 = ogvPlayingNetworkStrategy;
                    this.$currentNetworkEnv = playNetworkEnv;
                    this.$isLastEnvWifi = z6;
                }

                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C07381(this.this$0, this.$currentNetworkEnv, this.$isLastEnvWifi, continuation);
                }

                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
                }

                /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
                public final Object invokeSuspend(Object obj) throws NoWhenBranchMatchedException {
                    Object objA;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i7 = this.label;
                    boolean z6 = true;
                    if (i7 == 0) {
                        ResultKt.throwOnFailure(obj);
                        OgvPlayingNetworkStrategy ogvPlayingNetworkStrategy = this.this$0;
                        PlayNetworkEnv.a aVar = (PlayNetworkEnv.a) this.$currentNetworkEnv;
                        boolean z7 = this.$isLastEnvWifi;
                        this.label = 1;
                        ogvPlayingNetworkStrategy.getClass();
                        int i8 = a.f94004a[aVar.f79288a.ordinal()];
                        com.bilibili.ship.theseus.united.player.mediaplay.network.a aVar2 = ogvPlayingNetworkStrategy.h;
                        com.bilibili.ship.theseus.united.player.mediaplay.network.o oVar = ogvPlayingNetworkStrategy.f94001g;
                        if (i8 != 1) {
                            com.bilibili.ship.theseus.united.player.mediaplay.network.m mVar = ogvPlayingNetworkStrategy.f94002i;
                            if (i8 == 2) {
                                BLog.i("OgvPlayingNetworkStrategy-processPlayOnFreeDataSuccessful", "[theseus-ogv-OgvPlayingNetworkStrategy-processPlayOnFreeDataSuccessful] ogv network strategy play on free data successful, show free data toast");
                                oVar.b();
                                objA = mVar.c(true, this);
                                if (objA != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                                    objA = Unit.INSTANCE;
                                }
                                if (objA != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                                    objA = Unit.INSTANCE;
                                }
                            } else if (i8 == 3 || i8 == 4) {
                                aVar2.getClass();
                                com.bilibili.ship.theseus.united.player.mediaplay.network.a.c();
                                IPlayerSettingService.Companion companion = IPlayerSettingService.Companion;
                                defpackage.a.b("[theseus-ogv-OgvPlayingNetworkStrategy-processPlayOnFreeDataFailedAndDowngrade] ", com.bilibili.app.comm.bh.x5.b.a("ogv network strategy play on free data failed, auto play on cellular: ", PlayerSettingServiceKtxKt.b(companion)), "OgvPlayingNetworkStrategy-processPlayOnFreeDataFailedAndDowngrade");
                                if (ogvPlayingNetworkStrategy.f94000f.f104490a.getValue() != MediaPlayDRMRepository.DRMState.DRM) {
                                    z6 = false;
                                }
                                FragmentActivity fragmentActivity = ogvPlayingNetworkStrategy.f93996b;
                                if (z6) {
                                    PlayerFreeDataHelper playerFreeDataHelper = PlayerFreeDataHelper.INSTANCE;
                                    if (playerFreeDataHelper.shouldProcessUrl() && (playerFreeDataHelper.isFreeCardUser() || playerFreeDataHelper.isFreePackageUser())) {
                                        objA = OgvPlayingNetworkStrategy.a(ogvPlayingNetworkStrategy, fragmentActivity.getString(2131846697), fragmentActivity.getString(2131847032), this, 8);
                                        if (objA != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                                            objA = Unit.INSTANCE;
                                        }
                                    } else {
                                        objA = OgvPlayingNetworkStrategy.a(ogvPlayingNetworkStrategy, null, null, this, 15);
                                        if (objA != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                                            objA = Unit.INSTANCE;
                                        }
                                    }
                                } else if (PlayerSettingServiceKtxKt.b(companion)) {
                                    oVar.b();
                                    objA = mVar.e(this);
                                    if (objA != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                                        objA = Unit.INSTANCE;
                                    }
                                } else {
                                    objA = OgvPlayingNetworkStrategy.a(ogvPlayingNetworkStrategy, PlayerFreeDataHelper.INSTANCE.getFreeDataResultCode() == 2036 ? fragmentActivity.getString(2131845891) : fragmentActivity.getString(2131845436), null, this, 2);
                                    if (objA != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                                        objA = Unit.INSTANCE;
                                    }
                                }
                                if (objA != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                                    objA = Unit.INSTANCE;
                                }
                            } else {
                                if (i8 != 5) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                objA = Unit.INSTANCE;
                            }
                        } else {
                            aVar2.getClass();
                            IPlayerSettingService.Companion companion2 = IPlayerSettingService.Companion;
                            BLog.i("OgvPlayingNetworkStrategy-processPlayOnCellular", "[theseus-ogv-OgvPlayingNetworkStrategy-processPlayOnCellular] " + com.bilibili.app.comm.bh.x5.a.a("ogv network strategy process play on cellular, auto play:", ", app once already show:", PlayerSettingServiceKtxKt.b(companion2), y.f94029a));
                            if (!PlayerSettingServiceKtxKt.b(companion2)) {
                                objA = OgvPlayingNetworkStrategy.a(ogvPlayingNetworkStrategy, null, null, this, 15);
                                if (objA != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                                    objA = Unit.INSTANCE;
                                }
                            } else if (y.f94029a) {
                                oVar.b();
                                objA = CoroutineScopeKt.coroutineScope(new OgvPlayingNetworkStrategy$showToastOnCellular$2(z7, ogvPlayingNetworkStrategy, null), this);
                                if (objA != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                                    objA = Unit.INSTANCE;
                                }
                                if (objA != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                                    objA = Unit.INSTANCE;
                                }
                            } else {
                                objA = OgvPlayingNetworkStrategy.a(ogvPlayingNetworkStrategy, null, null, this, 15);
                                if (objA != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                                    objA = Unit.INSTANCE;
                                }
                            }
                            if (objA != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                                objA = Unit.INSTANCE;
                            }
                        }
                        if (objA == coroutine_suspended) {
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
            public C07371(OgvPlayingNetworkStrategy ogvPlayingNetworkStrategy, CoroutineScope coroutineScope, Continuation<? super C07371> continuation) {
                super(3, continuation);
                this.this$0 = ogvPlayingNetworkStrategy;
                this.$$this$launch = coroutineScope;
            }

            public final Object invoke(PlayNetworkEnv playNetworkEnv, PlayNetworkEnv playNetworkEnv2, Continuation<? super PlayNetworkEnv> continuation) {
                C07371 c07371 = new C07371(this.this$0, this.$$this$launch, continuation);
                c07371.L$0 = playNetworkEnv;
                c07371.L$1 = playNetworkEnv2;
                return c07371.invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                PlayNetworkEnv playNetworkEnv = (PlayNetworkEnv) this.L$0;
                PlayNetworkEnv playNetworkEnv2 = (PlayNetworkEnv) this.L$1;
                defpackage.a.b("[theseus-ogv-OgvPlayingNetworkStrategy$1$1-invokeSuspend] ", "ogv playing network changed, new env:" + playNetworkEnv2 + ",", "OgvPlayingNetworkStrategy$1$1-invokeSuspend");
                if (playNetworkEnv2 instanceof PlayNetworkEnv.a) {
                    boolean z6 = playNetworkEnv instanceof PlayNetworkEnv.c;
                    Job job = this.this$0.f94003j;
                    if (job != null) {
                        Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                    }
                    OgvPlayingNetworkStrategy ogvPlayingNetworkStrategy = this.this$0;
                    ogvPlayingNetworkStrategy.f94003j = BuildersKt.launch$default(this.$$this$launch, (CoroutineContext) null, (CoroutineStart) null, new C07381(ogvPlayingNetworkStrategy, playNetworkEnv2, z6, null), 3, (Object) null);
                } else {
                    this.this$0.f94001g.b();
                }
                return playNetworkEnv2;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(OgvPlayingNetworkStrategy ogvPlayingNetworkStrategy, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = ogvPlayingNetworkStrategy;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                BLog.i("OgvPlayingNetworkStrategy$1-invokeSuspend", "[theseus-ogv-OgvPlayingNetworkStrategy$1-invokeSuspend] ogv playing network changed, start collect");
                Flow<PlayNetworkEnv> flowE = this.this$0.f93997c.e();
                C07371 c07371 = new C07371(this.this$0, coroutineScope, null);
                this.label = 1;
                if (FlowKt.reduce(flowE, c07371, this) == coroutine_suspended) {
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

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/media/OgvPlayingNetworkStrategy$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f94004a;

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
            f94004a = iArr;
        }
    }

    @Inject
    public OgvPlayingNetworkStrategy(@NotNull CoroutineScope coroutineScope, @NotNull FragmentActivity fragmentActivity, @NotNull com.bilibili.ship.theseus.keel.player.j jVar, @NotNull C7510d c7510d, @NotNull com.bilibili.ship.theseus.united.page.screenstate.c cVar, @NotNull MediaPlayDRMRepository mediaPlayDRMRepository, @NotNull com.bilibili.ship.theseus.united.player.mediaplay.network.o oVar, @NotNull com.bilibili.ship.theseus.united.player.mediaplay.network.a aVar, @NotNull com.bilibili.ship.theseus.united.player.mediaplay.network.m mVar) {
        this.f93995a = coroutineScope;
        this.f93996b = fragmentActivity;
        this.f93997c = jVar;
        this.f93998d = c7510d;
        this.f93999e = cVar;
        this.f94000f = mediaPlayDRMRepository;
        this.f94001g = oVar;
        this.h = aVar;
        this.f94002i = mVar;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
    }

    public static Object a(final OgvPlayingNetworkStrategy ogvPlayingNetworkStrategy, String str, String str2, Continuation continuation, int i7) {
        if ((i7 & 1) != 0) {
            str = null;
        }
        if ((i7 & 2) != 0) {
            str2 = ogvPlayingNetworkStrategy.f93996b.getString(2131846944);
        }
        boolean z6 = (i7 & 4) != 0;
        boolean z7 = (i7 & 8) != 0;
        ogvPlayingNetworkStrategy.getClass();
        final int i8 = 0;
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new OgvPlayingNetworkStrategy$enforcePlayLimitOnCellular$2(ogvPlayingNetworkStrategy, str, z6, str2, new Function1(ogvPlayingNetworkStrategy, i8) { // from class: com.bilibili.ship.theseus.ogv.media.u

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f94022a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Object f94023b;

            {
                this.f94022a = i8;
                this.f94023b = ogvPlayingNetworkStrategy;
            }

            public final Object invoke(Object obj) {
                switch (this.f94022a) {
                    case 0:
                        ((Boolean) obj).getClass();
                        OgvPlayingNetworkStrategy ogvPlayingNetworkStrategy2 = (OgvPlayingNetworkStrategy) this.f94023b;
                        ogvPlayingNetworkStrategy2.h.getClass();
                        com.bilibili.ship.theseus.united.player.mediaplay.network.a.e();
                        ogvPlayingNetworkStrategy2.f94001g.b();
                        return Unit.INSTANCE;
                    default:
                        int iIntValue = ((Integer) obj).intValue();
                        iF0.b bVar = (iF0.b) this.f94023b;
                        return Boolean.valueOf(iIntValue < bVar.b || iIntValue > bVar.c);
                }
            }
        }, z7, null), continuation);
        if (objCoroutineScope != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            objCoroutineScope = Unit.INSTANCE;
        }
        return objCoroutineScope;
    }
}
