package com.bilibili.ship.theseus.united.page.ad;

import androidx.activity.ComponentActivity;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bapis.bilibili.app.viewunite.v1.CM;
import com.bilibili.adcommon.data.model.AdsControl;
import com.bilibili.adcommon.utils.AdMossHelper;
import com.bilibili.biligame.card.GameCardButton;
import com.bilibili.gripper.api.ad.core.GAdCoreKt;
import com.bilibili.playerbizcommon.biliad.AdDanmakuInfo;
import com.bilibili.playerbizcommon.biliad.BiliAdDanmakuViewModelv2;
import com.bilibili.ship.theseus.keel.player.j;
import javax.inject.Inject;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/ad/AdDanmakuDetailService.class */
@StabilityInferred(parameters = 0)
public final class AdDanmakuDetailService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f98885a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final ComponentActivity f98886b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final AdRepository f98887c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.keel.player.h f98888d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final PageAdRepository f98889e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.view.d f98890f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.view.a f98891g;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.ad.AdDanmakuDetailService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/ad/AdDanmakuDetailService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final AdDanmakuDetailService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.ad.AdDanmakuDetailService$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/ad/AdDanmakuDetailService$1$1.class */
        public static final class C09421 extends SuspendLambda implements Function2<CM, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final AdDanmakuDetailService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C09421(AdDanmakuDetailService adDanmakuDetailService, Continuation<? super C09421> continuation) {
                super(2, continuation);
                this.this$0 = adDanmakuDetailService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C09421 c09421 = new C09421(this.this$0, continuation);
                c09421.L$0 = obj;
                return c09421;
            }

            public final Object invoke(CM cm2, Continuation<? super Unit> continuation) {
                return create(cm2, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                CM cm2 = (CM) this.L$0;
                AdDanmakuDetailService adDanmakuDetailService = this.this$0;
                adDanmakuDetailService.f98887c.getClass();
                BiliAdDanmakuViewModelv2.Companion.setAdDanmakuInfo(adDanmakuDetailService.f98886b, new AdDanmakuInfo(AdMossHelper.INSTANCE.createCmConfig((cm2 == null || !cm2.hasAdsControl()) ? new AdsControl() : AdMossHelper.INSTANCE.createAdsControl(cm2.getAdsControl())), adDanmakuDetailService.f98890f.b()));
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AdDanmakuDetailService adDanmakuDetailService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = adDanmakuDetailService;
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
                AdDanmakuDetailService adDanmakuDetailService = this.this$0;
                StateFlow<CM> stateFlow = adDanmakuDetailService.f98887c.f98936l;
                C09421 c09421 = new C09421(adDanmakuDetailService, null);
                this.label = 1;
                if (FlowKt.collectLatest(stateFlow, c09421, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.ad.AdDanmakuDetailService$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/ad/AdDanmakuDetailService$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final AdDanmakuDetailService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(AdDanmakuDetailService adDanmakuDetailService, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = adDanmakuDetailService;
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
                StateFlow stateFlowAsStateFlow = FlowKt.asStateFlow(this.this$0.f98888d.f91111e);
                this.label = 1;
                Object objA = com.bilibili.ogv.infra.coroutine.b.a(stateFlowAsStateFlow, this);
                obj = objA;
                if (objA == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    if (i7 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    this.this$0.a("video_detail_video_play");
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
            }
            this.label = 2;
            if (((j) obj).u(this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.this$0.a("video_detail_video_play");
            return Unit.INSTANCE;
        }
    }

    @Inject
    public AdDanmakuDetailService(@NotNull CoroutineScope coroutineScope, @NotNull ComponentActivity componentActivity, @NotNull AdRepository adRepository, @NotNull com.bilibili.ship.theseus.keel.player.h hVar, @NotNull PageAdRepository pageAdRepository, @NotNull com.bilibili.ship.theseus.united.page.view.d dVar, @NotNull com.bilibili.ship.theseus.united.page.view.a aVar) {
        this.f98885a = coroutineScope;
        this.f98886b = componentActivity;
        this.f98887c = adRepository;
        this.f98888d = hVar;
        this.f98889e = pageAdRepository;
        this.f98890f = dVar;
        this.f98891g = aVar;
        a("video_detail_show");
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this, null), 3, (Object) null);
    }

    public final void a(String str) {
        PageAdRepository pageAdRepository = this.f98889e;
        String str2 = pageAdRepository.f98946j;
        if (str2 == null || str2.length() == 0) {
            return;
        }
        GAdCoreKt.getGAdReport().uiEvent(str, MapsKt.mapOf(new Pair[]{TuplesKt.to("nature_ad", pageAdRepository.f98945i), TuplesKt.to(GameCardButton.extraAvid, this.f98891g.b()), TuplesKt.to("upmid", Long.valueOf(this.f98890f.f())), TuplesKt.to("track_id", pageAdRepository.f98946j)}));
    }
}
