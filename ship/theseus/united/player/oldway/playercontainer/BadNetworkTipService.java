package com.bilibili.ship.theseus.united.player.oldway.playercontainer;

import android.content.Context;
import android.os.SystemClock;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.lib.media.resource.MediaResource;
import com.bilibili.lib.media.resource.PlayIndex;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.player.tangram.basic.c;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import javax.inject.Inject;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.biliplayerv2.ScreenModeType;
import tv.danmaku.biliplayerv2.service.BufferingObserver;
import tv.danmaku.biliplayerv2.service.IControlContainerService;
import tv.danmaku.biliplayerv2.service.IPlayerCoreService;
import tv.danmaku.biliplayerv2.service.IToastService;
import tv.danmaku.biliplayerv2.service.PlayerSeekObserver;
import tv.danmaku.biliplayerv2.service.PlayerStateObserver;
import tv.danmaku.biliplayerv2.service.report.IReporterService;
import tv.danmaku.biliplayerv2.widget.toast.PlayerToast;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/oldway/playercontainer/BadNetworkTipService.class */
@StabilityInferred(parameters = 0)
public final class BadNetworkTipService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final IPlayerCoreService f104731a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Context f104732b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.keel.player.h f104733c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final IToastService f104734d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final IReporterService f104735e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final IControlContainerService f104736f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f104737g;

    @NotNull
    public final ArrayList<Long> h = new ArrayList<>(10);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f104738i = true;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final ArrayList<Long> f104739j = new ArrayList<>();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<Unit> f104740k = SharedFlowKt.MutableSharedFlow$default(0, 0, (BufferOverflow) null, 7, (Object) null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final BadNetworkTipService$mPlayerBufferingObserver$1 f104741l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final a f104742m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final b f104743n;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.player.oldway.playercontainer.BadNetworkTipService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/oldway/playercontainer/BadNetworkTipService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final BadNetworkTipService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(BadNetworkTipService badNetworkTipService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = badNetworkTipService;
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
                BadNetworkTipService badNetworkTipService = this.this$0;
                badNetworkTipService.f104731a.unregisterBufferingState(badNetworkTipService.f104741l);
                BadNetworkTipService badNetworkTipService2 = this.this$0;
                badNetworkTipService2.f104731a.unregisterSeekObserver(badNetworkTipService2.f104742m);
                BadNetworkTipService badNetworkTipService3 = this.this$0;
                badNetworkTipService3.f104731a.unregisterState(badNetworkTipService3.f104743n);
                throw th;
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/oldway/playercontainer/BadNetworkTipService$a.class */
    public static final class a implements PlayerSeekObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BadNetworkTipService f104744a;

        public a(BadNetworkTipService badNetworkTipService) {
            this.f104744a = badNetworkTipService;
        }

        public final void onSeekComplete(long j7) {
            this.f104744a.h.clear();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/oldway/playercontainer/BadNetworkTipService$b.class */
    public static final class b implements PlayerStateObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BadNetworkTipService f104745a;

        public b(BadNetworkTipService badNetworkTipService) {
            this.f104745a = badNetworkTipService;
        }

        public final void onPlayerStateChanged(int i7) {
            if (i7 == 3) {
                this.f104745a.h.clear();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [com.bilibili.ship.theseus.united.player.oldway.playercontainer.BadNetworkTipService$mPlayerBufferingObserver$1, tv.danmaku.biliplayerv2.service.BufferingObserver] */
    @Inject
    public BadNetworkTipService(@NotNull IPlayerCoreService iPlayerCoreService, @NotNull Context context, @NotNull com.bilibili.ship.theseus.keel.player.h hVar, @NotNull IToastService iToastService, @NotNull IReporterService iReporterService, @NotNull IControlContainerService iControlContainerService, @NotNull CoroutineScope coroutineScope) {
        this.f104731a = iPlayerCoreService;
        this.f104732b = context;
        this.f104733c = hVar;
        this.f104734d = iToastService;
        this.f104735e = iReporterService;
        this.f104736f = iControlContainerService;
        this.f104737g = coroutineScope;
        ?? r02 = new BufferingObserver(this) { // from class: com.bilibili.ship.theseus.united.player.oldway.playercontainer.BadNetworkTipService$mPlayerBufferingObserver$1

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public Job f104746a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final BadNetworkTipService f104747b;

            {
                this.f104747b = this;
            }

            public final void onBufferingEnd() {
                Job job = this.f104746a;
                if (job != null) {
                    Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                }
            }

            public final void onBufferingStart(int i7) {
                BadNetworkTipService badNetworkTipService = this.f104747b;
                int state = badNetworkTipService.f104731a.getState();
                if (state == 0 || state == 2) {
                    return;
                }
                badNetworkTipService.h.add(Long.valueOf(SystemClock.elapsedRealtime()));
                if (badNetworkTipService.h.size() < 10) {
                    Job job = this.f104746a;
                    if (job != null) {
                        Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                    }
                    this.f104746a = BuildersKt.launch$default(badNetworkTipService.f104737g, (CoroutineContext) null, (CoroutineStart) null, new BadNetworkTipService$mPlayerBufferingObserver$1$onBufferingStart$1(badNetworkTipService, null), 3, (Object) null);
                    return;
                }
                if (SystemClock.elapsedRealtime() - badNetworkTipService.h.get(0).longValue() > 60000) {
                    badNetworkTipService.h.remove(0);
                } else {
                    BadNetworkTipService.a(badNetworkTipService);
                    badNetworkTipService.h.clear();
                }
            }
        };
        this.f104741l = r02;
        a aVar = new a(this);
        this.f104742m = aVar;
        b bVar = new b(this);
        this.f104743n = bVar;
        iPlayerCoreService.registerBufferingState((BufferingObserver) r02);
        iPlayerCoreService.registerSeekObserver(aVar);
        iPlayerCoreService.registerState(bVar, new int[]{3});
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
    }

    public static final void a(BadNetworkTipService badNetworkTipService) {
        MediaResource mediaResource;
        if (!badNetworkTipService.f104738i || badNetworkTipService.f104736f.getScreenModeType() == ScreenModeType.THUMB || (badNetworkTipService.f104733c.f91109c.g() instanceof c.a) || (mediaResource = badNetworkTipService.f104731a.getMediaResource()) == null) {
            return;
        }
        ArrayList arrayList = mediaResource.mVodIndex.mVodList;
        PlayIndex playIndex = mediaResource.getPlayIndex();
        if (arrayList == null || arrayList.isEmpty() || playIndex == null) {
            return;
        }
        int size = arrayList.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size) {
                i7 = -1;
                break;
            } else if (playIndex.mQuality == ((PlayIndex) arrayList.get(i7)).mQuality) {
                break;
            } else {
                i7++;
            }
        }
        if (i7 < 0) {
            return;
        }
        int size2 = badNetworkTipService.f104739j.size();
        if (size2 == 1) {
            if (SystemClock.elapsedRealtime() - badNetworkTipService.f104739j.get(0).longValue() < 120000) {
                return;
            }
        } else if (size2 >= 2) {
            return;
        }
        badNetworkTipService.f104739j.add(Long.valueOf(SystemClock.elapsedRealtime()));
        badNetworkTipService.f104734d.showToast(new PlayerToast.Builder().level(2).location(32).toastItemType(18).setExtraString("extra_title", badNetworkTipService.f104732b.getString(2131847088)).setExtraString("extra_action_text", badNetworkTipService.f104732b.getString(2131846859)).messageClickListener(new C6454a(badNetworkTipService)).duration(5000L).build());
        Neurons.reportExposure$default(false, "player.player.toast-networkslow.show.show", (Map) null, (List) null, 12, (Object) null);
    }
}
