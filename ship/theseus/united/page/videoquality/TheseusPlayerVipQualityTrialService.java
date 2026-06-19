package com.bilibili.ship.theseus.united.page.videoquality;

import android.content.Context;
import android.net.Uri;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.app.gemini.base.resolver.PlayerResolveExtraInfosUtilKt;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.blrouter.MutableBundleLike;
import com.bilibili.lib.blrouter.RouteRequest;
import com.bilibili.lib.media.resource.ExtraInfo;
import com.bilibili.lib.media.resource.MediaResource;
import com.bilibili.ship.theseus.united.page.episode.EpisodeExtraInfoRepository;
import com.bilibili.ship.theseus.united.page.videoquality.TheseusPlayerVipQualityTrialService;
import java.util.Map;
import java.util.concurrent.CancellationException;
import javax.inject.Inject;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import lv0.C7893a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;
import tv.danmaku.biliplayerv2.service.IPlayerCoreService;
import tv.danmaku.biliplayerv2.service.IToastService;
import tv.danmaku.biliplayerv2.service.report.IReporterService;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/videoquality/TheseusPlayerVipQualityTrialService.class */
@StabilityInferred(parameters = 0)
public final class TheseusPlayerVipQualityTrialService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f103815a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final IPlayerCoreService f103816b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Context f103817c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final IToastService f103818d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final IReporterService f103819e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final TheseusQualityResources f103820f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.keel.player.j f103821g;

    @NotNull
    public final InterfaceC6436j h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final EpisodeExtraInfoRepository f103822i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final C7893a f103823j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final MutableState f103824k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final MutableState f103825l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    public X f103826m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public Y f103827n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    public Mn.z f103828o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    public Job f103829p;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.videoquality.TheseusPlayerVipQualityTrialService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/videoquality/TheseusPlayerVipQualityTrialService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final TheseusPlayerVipQualityTrialService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.videoquality.TheseusPlayerVipQualityTrialService$1$2, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/videoquality/TheseusPlayerVipQualityTrialService$1$2.class */
        public static final class AnonymousClass2 extends SuspendLambda implements Function2<ExtraInfo, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final TheseusPlayerVipQualityTrialService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(TheseusPlayerVipQualityTrialService theseusPlayerVipQualityTrialService, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = theseusPlayerVipQualityTrialService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            public final Object invoke(ExtraInfo extraInfo, Continuation<? super Unit> continuation) {
                return create(extraInfo, continuation).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code restructure failed: missing block: B:47:0x00f2, code lost:
            
                if ((r5 == null ? false : vk.f.a(r5.a, 2)) == false) goto L69;
             */
            /* JADX WARN: Multi-variable type inference failed */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r5) {
                /*
                    Method dump skipped, instruction units count: 423
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.videoquality.TheseusPlayerVipQualityTrialService.AnonymousClass1.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(TheseusPlayerVipQualityTrialService theseusPlayerVipQualityTrialService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = theseusPlayerVipQualityTrialService;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ExtraInfo invokeSuspend$lambda$0(TheseusPlayerVipQualityTrialService theseusPlayerVipQualityTrialService) {
            return theseusPlayerVipQualityTrialService.f103822i.a();
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
                final TheseusPlayerVipQualityTrialService theseusPlayerVipQualityTrialService = this.this$0;
                Flow flowSnapshotFlow = SnapshotStateKt.snapshotFlow(new Function0(theseusPlayerVipQualityTrialService) { // from class: com.bilibili.ship.theseus.united.page.videoquality.n0

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final TheseusPlayerVipQualityTrialService f103923a;

                    {
                        this.f103923a = theseusPlayerVipQualityTrialService;
                    }

                    public final Object invoke() {
                        return TheseusPlayerVipQualityTrialService.AnonymousClass1.invokeSuspend$lambda$0(this.f103923a);
                    }
                });
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowSnapshotFlow, anonymousClass2, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.videoquality.TheseusPlayerVipQualityTrialService$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/videoquality/TheseusPlayerVipQualityTrialService$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final TheseusPlayerVipQualityTrialService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.videoquality.TheseusPlayerVipQualityTrialService$2$2, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/videoquality/TheseusPlayerVipQualityTrialService$2$2.class */
        public static final class C11542 extends SuspendLambda implements Function2<ExtraInfo, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final TheseusPlayerVipQualityTrialService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C11542(TheseusPlayerVipQualityTrialService theseusPlayerVipQualityTrialService, Continuation<? super C11542> continuation) {
                super(2, continuation);
                this.this$0 = theseusPlayerVipQualityTrialService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C11542 c11542 = new C11542(this.this$0, continuation);
                c11542.L$0 = obj;
                return c11542;
            }

            public final Object invoke(ExtraInfo extraInfo, Continuation<? super Unit> continuation) {
                return create(extraInfo, continuation).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Removed duplicated region for block: B:40:0x011e  */
            /* JADX WARN: Removed duplicated region for block: B:60:0x01f0  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r8) {
                /*
                    Method dump skipped, instruction units count: 676
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.videoquality.TheseusPlayerVipQualityTrialService.AnonymousClass2.C11542.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(TheseusPlayerVipQualityTrialService theseusPlayerVipQualityTrialService, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = theseusPlayerVipQualityTrialService;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ExtraInfo invokeSuspend$lambda$0(TheseusPlayerVipQualityTrialService theseusPlayerVipQualityTrialService) {
            return theseusPlayerVipQualityTrialService.f103822i.a();
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
                final TheseusPlayerVipQualityTrialService theseusPlayerVipQualityTrialService = this.this$0;
                Flow flowSnapshotFlow = SnapshotStateKt.snapshotFlow(new Function0(theseusPlayerVipQualityTrialService) { // from class: com.bilibili.ship.theseus.united.page.videoquality.o0

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final TheseusPlayerVipQualityTrialService f103926a;

                    {
                        this.f103926a = theseusPlayerVipQualityTrialService;
                    }

                    public final Object invoke() {
                        return TheseusPlayerVipQualityTrialService.AnonymousClass2.invokeSuspend$lambda$0(this.f103926a);
                    }
                });
                C11542 c11542 = new C11542(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowSnapshotFlow, c11542, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.videoquality.TheseusPlayerVipQualityTrialService$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/videoquality/TheseusPlayerVipQualityTrialService$3.class */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final TheseusPlayerVipQualityTrialService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.videoquality.TheseusPlayerVipQualityTrialService$3$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/videoquality/TheseusPlayerVipQualityTrialService$3$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<com.bilibili.player.tangram.playercore.u, Continuation<? super Boolean>, Object> {
            Object L$0;
            int label;

            public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            public final Object invoke(com.bilibili.player.tangram.playercore.u uVar, Continuation<? super Boolean> continuation) {
                return create(uVar, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                com.bilibili.player.tangram.playercore.u uVar = (com.bilibili.player.tangram.playercore.u) this.L$0;
                boolean z6 = false;
                if (uVar != null) {
                    MediaResource mediaResource = uVar.f79460c;
                    z6 = false;
                    if (mediaResource != null) {
                        z6 = false;
                        if (com.bilibili.playerbizcommonv2.widget.quality.m0.b(mediaResource)) {
                            z6 = true;
                        }
                    }
                }
                return Boxing.boxBoolean(z6);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(TheseusPlayerVipQualityTrialService theseusPlayerVipQualityTrialService, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.this$0 = theseusPlayerVipQualityTrialService;
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
                if (this.this$0.f103821g.z()) {
                    Flow<com.bilibili.player.tangram.playercore.u> flowB = this.this$0.f103821g.b();
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(null);
                    this.label = 1;
                    if (FlowKt.first(flowB, anonymousClass1, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            BLog.i("TheseusPlayerVipQualityTrialService$3-invokeSuspend", "[theseus-united-TheseusPlayerVipQualityTrialService$3-invokeSuspend] media is trial qn, restore trial");
            this.this$0.k();
            return Unit.INSTANCE;
        }
    }

    @Inject
    public TheseusPlayerVipQualityTrialService(@NotNull CoroutineScope coroutineScope, @NotNull IPlayerCoreService iPlayerCoreService, @NotNull Context context, @NotNull IToastService iToastService, @NotNull IReporterService iReporterService, @NotNull TheseusQualityResources theseusQualityResources, @NotNull com.bilibili.ship.theseus.keel.player.j jVar, @NotNull InterfaceC6436j interfaceC6436j, @NotNull EpisodeExtraInfoRepository episodeExtraInfoRepository, @NotNull C7893a c7893a) {
        this.f103815a = coroutineScope;
        this.f103816b = iPlayerCoreService;
        this.f103817c = context;
        this.f103818d = iToastService;
        this.f103819e = iReporterService;
        this.f103820f = theseusQualityResources;
        this.f103821g = jVar;
        this.h = interfaceC6436j;
        this.f103822i = episodeExtraInfoRepository;
        this.f103823j = c7893a;
        Boolean bool = Boolean.FALSE;
        this.f103824k = SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.f103825l = SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass3(this, null), 3, (Object) null);
    }

    public static final boolean a(TheseusPlayerVipQualityTrialService theseusPlayerVipQualityTrialService) {
        com.bilibili.ship.theseus.keel.player.j jVar = theseusPlayerVipQualityTrialService.f103821g;
        Duration durationQ = jVar.q();
        boolean z6 = false;
        if (durationQ != null) {
            long j7 = durationQ.unbox-impl();
            if (Duration.compareTo-LRDsOJo(j7, Duration.Companion.getZERO-UwyO8pc()) <= 0) {
                z6 = false;
            } else {
                z6 = false;
                if (Duration.compareTo-LRDsOJo(Duration.minus-LRDsOJo(j7, jVar.F()), DurationKt.toDuration(15, DurationUnit.SECONDS)) <= 0) {
                    z6 = true;
                }
            }
        }
        return z6;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(com.bilibili.ship.theseus.united.page.videoquality.TheseusPlayerVipQualityTrialService r7, vk.e r8) {
        /*
            Method dump skipped, instruction units count: 673
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.videoquality.TheseusPlayerVipQualityTrialService.b(com.bilibili.ship.theseus.united.page.videoquality.TheseusPlayerVipQualityTrialService, vk.e):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean c() {
        /*
            Method dump skipped, instruction units count: 422
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.videoquality.TheseusPlayerVipQualityTrialService.c():boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean d() {
        return ((Boolean) this.f103824k.getValue()).booleanValue();
    }

    public final vk.e e() {
        ExtraInfo extraInfoA = this.f103822i.a();
        return extraInfoA != null ? PlayerResolveExtraInfosUtilKt.getQnTrialInfo(extraInfoA) : null;
    }

    public final vk.c f() {
        ExtraInfo extraInfoA = this.f103822i.a();
        return extraInfoA != null ? PlayerResolveExtraInfosUtilKt.getQnSponsorInfo(extraInfoA) : null;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x012d  */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.Set<com.bilibili.player.tangram.basic.a> g() {
        /*
            Method dump skipped, instruction units count: 307
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.videoquality.TheseusPlayerVipQualityTrialService.g():java.util.Set");
    }

    public final void h(@NotNull final BuyVipScene buyVipScene, @NotNull final String str, @NotNull final Map<String, String> map, @Nullable final com.bilibili.player.tangram.basic.a aVar) {
        RouteRequest routeRequestBuild = new RouteRequest.Builder(Uri.parse(StringsKt.isBlank(str) ? "activity://main/vip-buy" : str)).extras(new Function1(this, buyVipScene, aVar, str, map) { // from class: com.bilibili.ship.theseus.united.page.videoquality.m0

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final TheseusPlayerVipQualityTrialService f103913a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final BuyVipScene f103914b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final com.bilibili.player.tangram.basic.a f103915c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final String f103916d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final Map f103917e;

            {
                this.f103913a = this;
                this.f103914b = buyVipScene;
                this.f103915c = aVar;
                this.f103916d = str;
                this.f103917e = map;
            }

            public final Object invoke(Object obj) {
                Map map2 = this.f103917e;
                MutableBundleLike mutableBundleLike = (MutableBundleLike) obj;
                TheseusPlayerVipQualityTrialService theseusPlayerVipQualityTrialService = this.f103913a;
                C6426a c6426aC = theseusPlayerVipQualityTrialService.h.c(this.f103914b, this.f103915c);
                if (this.f103916d.length() == 0) {
                    mutableBundleLike.put("appId", c6426aC.f103849a);
                }
                mutableBundleLike.put("appSubId", c6426aC.f103850b);
                mutableBundleLike.put("source_from", c6426aC.f103851c);
                com.bilibili.ship.theseus.keel.player.j jVar = theseusPlayerVipQualityTrialService.f103821g;
                String spmid = jVar.f().getSpmid();
                String str2 = spmid;
                if (spmid == null) {
                    str2 = "";
                }
                mutableBundleLike.put("spmid", str2);
                String fromSpmid = jVar.f().getFromSpmid();
                if (fromSpmid == null) {
                    fromSpmid = "";
                }
                mutableBundleLike.put("from_spmid", fromSpmid);
                mutableBundleLike.putAll(map2);
                mutableBundleLike.putAll(c6426aC.f103852d);
                return Unit.INSTANCE;
            }
        }).build();
        defpackage.a.b("[theseus-united-TheseusPlayerVipQualityTrialService-gotoBuyVip-gTDqYUk] ", "go to buy vip: " + routeRequestBuild.getExtras(), "TheseusPlayerVipQualityTrialService-gotoBuyVip-gTDqYUk");
        BLRouter.routeTo(routeRequestBuild, this.f103817c);
    }

    public final boolean i(int i7) {
        vk.c cVarF = f();
        boolean z6 = false;
        if (cVarF != null) {
            Map map = cVarF.a;
            z6 = false;
            if (map != null) {
                z6 = false;
                if (map.containsKey(Integer.valueOf(i7))) {
                    z6 = true;
                }
            }
        }
        return z6;
    }

    public final void j() {
        Job job = this.f103829p;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.f103829p = null;
        vk.e eVarE = e();
        if (eVarE == null) {
            return;
        }
        BuildersKt.launch$default(this.f103815a, (CoroutineContext) null, (CoroutineStart) null, new TheseusPlayerVipQualityTrialService$noMoreTrial$1(eVarE, this, null), 3, (Object) null);
    }

    public final void k() {
        Job job = this.f103829p;
        if (job == null || !job.isActive()) {
            this.f103821g.P(true);
            this.f103829p = BuildersKt.launch$default(this.f103815a, (CoroutineContext) null, (CoroutineStart) null, new TheseusPlayerVipQualityTrialService$startTrial$1(this, null), 3, (Object) null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean l(boolean r6) {
        /*
            r5 = this;
            r0 = r5
            vk.e r0 = r0.e()
            r11 = r0
            r0 = 0
            r10 = r0
            r0 = r11
            if (r0 == 0) goto L17
            r0 = r11
            int r0 = r0.d
            r7 = r0
            goto L19
        L17:
            r0 = 0
            r7 = r0
        L19:
            r0 = r6
            if (r0 == 0) goto L23
            r0 = 15
            r8 = r0
            goto L25
        L23:
            r0 = 0
            r8 = r0
        L25:
            r0 = r7
            r1 = r8
            int r0 = r0 - r1
            r7 = r0
            r0 = r5
            vk.e r0 = r0.e()
            r11 = r0
            r0 = r11
            if (r0 == 0) goto L45
            vk.f r0 = new vk.f
            r1 = r0
            r2 = r11
            int r2 = r2.i
            r1.<init>(r2)
            r11 = r0
            goto L48
        L45:
            r0 = 0
            r11 = r0
        L48:
            r0 = r11
            if (r0 != 0) goto L53
            r0 = 0
            r9 = r0
            goto L5e
        L53:
            r0 = r11
            int r0 = r0.a
            r1 = 2
            boolean r0 = vk.f.a(r0, r1)
            r9 = r0
        L5e:
            r0 = r10
            r6 = r0
            r0 = r9
            if (r0 == 0) goto L81
            r0 = r7
            if (r0 <= 0) goto L7f
            r0 = r10
            r6 = r0
            r0 = r5
            com.bilibili.ship.theseus.keel.player.j r0 = r0.f103821g
            long r0 = r0.F()
            long r0 = kotlin.time.Duration.getInWholeSeconds-impl(r0)
            r1 = r7
            long r1 = (long) r1
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L81
        L7f:
            r0 = 1
            r6 = r0
        L81:
            r0 = r6
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.videoquality.TheseusPlayerVipQualityTrialService.l(boolean):boolean");
    }

    public final int m() {
        vk.e eVarE = e();
        return eVarE != null ? eVarE.i : -1;
    }
}
