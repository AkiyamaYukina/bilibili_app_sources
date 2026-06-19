package com.bilibili.ship.theseus.united.page.ad;

import F3.C6;
import M3.C2592k;
import androidx.compose.animation.z;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import androidx.window.core.layout.WindowSizeClass;
import com.bilibili.base.MainThread;
import com.bilibili.gripper.api.ad.biz.bussinessaccount.BizAccountViewModel;
import com.bilibili.gripper.api.ad.biz.panel.IPanelController;
import com.bilibili.gripper.api.ad.biz.videodetail.IAdPanelListener;
import com.bilibili.gripper.api.ad.biz.videodetail.IPanelCallback;
import com.bilibili.gripper.api.ad.biz.videodetail.IPanelData;
import com.bilibili.gripper.api.ad.biz.videodetail.IWrapperPanelHelper;
import com.bilibili.ship.theseus.united.page.backpress.BackActionRepository;
import com.bilibili.ship.theseus.united.page.floatlayer.TheseusFloatLayerService;
import com.google.android.material.appbar.AppBarLayout;
import javax.inject.Inject;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;
import tv.danmaku.biliplayerv2.PlayerContainer;
import tv.danmaku.biliplayerv2.service.ControlContainerObserver;
import tv.danmaku.biliplayerv2.service.PlayerStateObserver;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/ad/AdPanelRepository.class */
@StabilityInferred(parameters = 0)
public final class AdPanelRepository implements IPanelCallback, IWrapperPanelHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f98902a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final FragmentActivity f98903b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final TheseusFloatLayerService f98904c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final PlayerContainer f98905d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.keel.player.h f98906e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.playingarea.a f98907f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.screenstate.c f98908g;

    @NotNull
    public final BackActionRepository h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.playingarea.g f98909i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.screensize.a f98910j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public AdPanelHelper f98911k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public AdPanelHelper f98912l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    public IWrapperPanelHelper.OnPlayerSizeChangeListener f98913m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public AppBarLayout.OnOffsetChangedListener f98914n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    public AppBarLayout f98915o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    public PlayerStateObserver f98916p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Nullable
    public ControlContainerObserver f98917q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public Function0<Integer> f98918r = new J9.a(this, 6);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public Function0<Boolean> f98919s = new C2592k(2);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    public Function0<Integer> f98920t = new C6(3);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    public Function0<Integer> f98921u = new C6(3);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    public Flow<Integer> f98922v = FlowKt.flowOf(0);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    public Flow<Integer> f98923w = FlowKt.flowOf(0);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f98924x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @Nullable
    public Integer f98925y;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.ad.AdPanelRepository$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/ad/AdPanelRepository$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private Object L$0;
        int label;
        final AdPanelRepository this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.ad.AdPanelRepository$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/ad/AdPanelRepository$1$1.class */
        public static final class C09431 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
            final CoroutineScope $$this$launch;
            boolean Z$0;
            int label;
            final AdPanelRepository this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C09431(AdPanelRepository adPanelRepository, CoroutineScope coroutineScope, Continuation<? super C09431> continuation) {
                super(2, continuation);
                this.this$0 = adPanelRepository;
                this.$$this$launch = coroutineScope;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C09431 c09431 = new C09431(this.this$0, this.$$this$launch, continuation);
                c09431.Z$0 = ((Boolean) obj).booleanValue();
                return c09431;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke(((Boolean) obj).booleanValue(), (Continuation<? super Unit>) obj2);
            }

            public final Object invoke(boolean z6, Continuation<? super Unit> continuation) {
                return create(Boolean.valueOf(z6), continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                if (this.Z$0) {
                    this.this$0.f98909i.f(this.$$this$launch);
                    this.this$0.f98908g.b(this.$$this$launch, true);
                } else {
                    this.this$0.f98909i.j(this.$$this$launch);
                    this.this$0.f98908g.b(this.$$this$launch, false);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AdPanelRepository adPanelRepository, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = adPanelRepository;
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
                MutableStateFlow mutableStateFlowIsAnyPanelActive = BizAccountViewModel.Companion.get(this.this$0.f98903b).isAnyPanelActive();
                C09431 c09431 = new C09431(this.this$0, coroutineScope, null);
                this.label = 1;
                if (FlowKt.collectLatest(mutableStateFlowIsAnyPanelActive, c09431, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.ad.AdPanelRepository$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/ad/AdPanelRepository$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final AdPanelRepository this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.ad.AdPanelRepository$2$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/ad/AdPanelRepository$2$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
            boolean Z$0;
            int label;
            final AdPanelRepository this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(AdPanelRepository adPanelRepository, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = adPanelRepository;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.Z$0 = ((Boolean) obj).booleanValue();
                return anonymousClass1;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke(((Boolean) obj).booleanValue(), (Continuation<? super Unit>) obj2);
            }

            public final Object invoke(boolean z6, Continuation<? super Unit> continuation) {
                return create(Boolean.valueOf(z6), continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                if (this.Z$0) {
                    AdPanelRepository adPanelRepository = this.this$0;
                    if (!adPanelRepository.f98924x && adPanelRepository.isVideoPlaying()) {
                        BLog.i("AdPanelRepository-pauseVideoIfNeed", "[theseus-united-AdPanelRepository-pauseVideoIfNeed] ad call player pause");
                        adPanelRepository.f98906e.pause();
                        adPanelRepository.f98924x = true;
                    }
                } else {
                    AdPanelRepository adPanelRepository2 = this.this$0;
                    if (adPanelRepository2.f98924x) {
                        adPanelRepository2.f98906e.p();
                        adPanelRepository2.f98924x = false;
                    }
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(AdPanelRepository adPanelRepository, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = adPanelRepository;
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
                MutableStateFlow mutableStateFlowIsPlayerOverlaid = BizAccountViewModel.Companion.get(this.this$0.f98903b).isPlayerOverlaid();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(mutableStateFlowIsPlayerOverlaid, anonymousClass1, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.ad.AdPanelRepository$showPanel$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/ad/AdPanelRepository$showPanel$1.class */
    public static final /* synthetic */ class C62761 extends FunctionReferenceImpl implements Function1<Boolean, Unit> {
        public C62761(Object obj) {
            super(1, obj, AdPanelRepository.class, "onPanelShow", "onPanelShow(Z)V", 0);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke(((Boolean) obj).booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z6) {
            AdPanelRepository.a((AdPanelRepository) ((CallableReference) this).receiver, z6);
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.ad.AdPanelRepository$showPanel$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/ad/AdPanelRepository$showPanel$2.class */
    public static final /* synthetic */ class C62772 extends FunctionReferenceImpl implements Function1<Boolean, Unit> {
        public C62772(Object obj) {
            super(1, obj, AdPanelRepository.class, "onPausedPagePanelDismissAndClearRef", "onPausedPagePanelDismissAndClearRef(Z)V", 0);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke(((Boolean) obj).booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z6) {
            AdPanelHelper adPanelHelper;
            AdPanelRepository adPanelRepository = (AdPanelRepository) ((CallableReference) this).receiver;
            if (z6 && (adPanelHelper = adPanelRepository.f98911k) != null) {
                adPanelRepository.f98909i.j(adPanelHelper);
            }
            adPanelRepository.f98908g.b(adPanelRepository, false);
            adPanelRepository.f98912l = null;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.ad.AdPanelRepository$showPanel$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/ad/AdPanelRepository$showPanel$3.class */
    public static final /* synthetic */ class AnonymousClass3 extends FunctionReferenceImpl implements Function1<Boolean, Unit> {
        public AnonymousClass3(Object obj) {
            super(1, obj, AdPanelRepository.class, "onPanelShow", "onPanelShow(Z)V", 0);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke(((Boolean) obj).booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z6) {
            AdPanelRepository.a((AdPanelRepository) ((CallableReference) this).receiver, z6);
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.ad.AdPanelRepository$showPanel$4, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/ad/AdPanelRepository$showPanel$4.class */
    public static final /* synthetic */ class AnonymousClass4 extends FunctionReferenceImpl implements Function1<Boolean, Unit> {
        public AnonymousClass4(Object obj) {
            super(1, obj, AdPanelRepository.class, "onPanelDismissAndClearType", "onPanelDismissAndClearType(Z)V", 0);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke(((Boolean) obj).booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z6) {
            AdPanelHelper adPanelHelper;
            AdPanelRepository adPanelRepository = (AdPanelRepository) ((CallableReference) this).receiver;
            if (z6 && (adPanelHelper = adPanelRepository.f98911k) != null) {
                adPanelRepository.f98909i.j(adPanelHelper);
            }
            adPanelRepository.f98908g.b(adPanelRepository, false);
            adPanelRepository.f98925y = null;
        }
    }

    @Inject
    public AdPanelRepository(@NotNull CoroutineScope coroutineScope, @NotNull FragmentActivity fragmentActivity, @NotNull TheseusFloatLayerService theseusFloatLayerService, @NotNull PlayerContainer playerContainer, @NotNull com.bilibili.ship.theseus.keel.player.h hVar, @NotNull com.bilibili.ship.theseus.united.page.playingarea.a aVar, @NotNull com.bilibili.ship.theseus.united.page.screenstate.c cVar, @NotNull BackActionRepository backActionRepository, @NotNull com.bilibili.ship.theseus.united.page.playingarea.g gVar, @NotNull com.bilibili.ship.theseus.united.page.screensize.a aVar2) {
        this.f98902a = coroutineScope;
        this.f98903b = fragmentActivity;
        this.f98904c = theseusFloatLayerService;
        this.f98905d = playerContainer;
        this.f98906e = hVar;
        this.f98907f = aVar;
        this.f98908g = cVar;
        this.h = backActionRepository;
        this.f98909i = gVar;
        this.f98910j = aVar2;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AdPanelRepository$special$$inlined$awaitCancel$1(null, this), 3, (Object) null);
    }

    public static final void a(final AdPanelRepository adPanelRepository, boolean z6) {
        if (z6) {
            final AdPanelHelper adPanelHelper = adPanelRepository.f98911k;
            if (adPanelHelper != null) {
                MainThread.postOnMainThreadDelayed(new Runnable(adPanelRepository, adPanelHelper) { // from class: com.bilibili.ship.theseus.united.page.ad.e

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final AdPanelRepository f98958a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final AdPanelHelper f98959b;

                    {
                        this.f98958a = adPanelRepository;
                        this.f98959b = adPanelHelper;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        AdPanelRepository adPanelRepository2 = this.f98958a;
                        adPanelRepository2.f98909i.f(this.f98959b);
                    }
                }, 100L);
            }
        } else {
            adPanelRepository.getClass();
        }
        BuildersKt.launch$default(adPanelRepository.f98902a, (CoroutineContext) null, (CoroutineStart) null, new AdPanelRepository$onPanelShow$2(adPanelRepository, null), 3, (Object) null);
        adPanelRepository.f98908g.b(adPanelRepository, true);
    }

    public final void addAppBarOnOffsetChangedListener(@NotNull AppBarLayout.OnOffsetChangedListener onOffsetChangedListener) {
        this.f98914n = onOffsetChangedListener;
    }

    public final void dismissPanel() {
        AdPanelHelper adPanelHelper = this.f98911k;
        if (adPanelHelper != null && adPanelHelper.b()) {
            z.c(this.f98925y, "dismissPanel close main panel type=", "AdPanelRepository");
            AdPanelHelper adPanelHelper2 = this.f98911k;
            if (adPanelHelper2 != null) {
                IPanelController.hidePanel$default(adPanelHelper2, false, 1, (Object) null);
                return;
            }
            return;
        }
        AdPanelHelper adPanelHelper3 = this.f98912l;
        if (adPanelHelper3 == null || !adPanelHelper3.b()) {
            return;
        }
        BLog.i("AdPanelRepository", "dismissPanel close paused page panel");
        AdPanelHelper adPanelHelper4 = this.f98912l;
        if (adPanelHelper4 != null) {
            IPanelController.hidePanel$default(adPanelHelper4, false, 1, (Object) null);
        }
    }

    @Nullable
    public final AppBarLayout getAppBarLayout() {
        return this.f98915o;
    }

    public final int getPanelTopMargin() {
        return this.f98910j.f() ? 0 : this.f98907f.h();
    }

    @NotNull
    public final Function0<Integer> getPausedPageAnchorLocationY() {
        return this.f98918r;
    }

    @NotNull
    public final Flow<Integer> getPausedPageBaseHeightPxFlow() {
        return this.f98923w;
    }

    @NotNull
    public final Function0<Boolean> getPausedPageTopReached() {
        return this.f98919s;
    }

    @NotNull
    public final Flow<Integer> getPausedPageVisibleHeightPxFlow() {
        return this.f98922v;
    }

    @NotNull
    public final CoroutineScope getScope() {
        return this.f98902a;
    }

    @NotNull
    public final Function0<Integer> getUnderViewHeight() {
        return this.f98921u;
    }

    @NotNull
    public final Function0<Integer> getUnderViewLocationY() {
        return this.f98920t;
    }

    @NotNull
    public final WindowSizeClass getWindowSize() {
        return this.f98910j.b();
    }

    @NotNull
    public final Flow<WindowSizeClass> getWindowSizeFlow() {
        return this.f98910j.f102939c;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean isNested() {
        /*
            r3 = this;
            r0 = r3
            com.bilibili.ship.theseus.united.page.ad.AdPanelHelper r0 = r0.f98911k
            r5 = r0
            r0 = r5
            if (r0 == 0) goto L24
            r0 = r5
            com.bilibili.ship.theseus.united.page.ad.a<?> r0 = r0.f98900j
            r5 = r0
            r0 = r5
            if (r0 == 0) goto L1d
            r0 = r5
            com.bilibili.ship.theseus.united.page.ad.AdPanelUIType r0 = r0.f98954c
            r6 = r0
            r0 = r6
            r5 = r0
            r0 = r6
            if (r0 != 0) goto L26
        L1d:
            com.bilibili.ship.theseus.united.page.ad.AdPanelUIType r0 = com.bilibili.ship.theseus.united.page.ad.AdPanelUIType.Normal
            r5 = r0
            goto L26
        L24:
            r0 = 0
            r5 = r0
        L26:
            r0 = r5
            com.bilibili.ship.theseus.united.page.ad.AdPanelUIType r1 = com.bilibili.ship.theseus.united.page.ad.AdPanelUIType.UnderType
            if (r0 != r1) goto L32
            r0 = 1
            r4 = r0
            goto L34
        L32:
            r0 = 0
            r4 = r0
        L34:
            r0 = r4
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.ad.AdPanelRepository.isNested():boolean");
    }

    public final boolean isPanelShowing() {
        AdPanelHelper adPanelHelper;
        AdPanelHelper adPanelHelper2 = this.f98911k;
        boolean z6 = true;
        if ((adPanelHelper2 == null || !adPanelHelper2.b()) && ((adPanelHelper = this.f98912l) == null || !adPanelHelper.b())) {
            z6 = false;
        }
        return z6;
    }

    public final boolean isVertical() {
        Boolean boolF = this.f98908g.f();
        return boolF != null ? boolF.booleanValue() : false;
    }

    public final boolean isVideoPlaying() {
        return this.f98905d.getPlayerCoreService().getState() == 4;
    }

    public final void observeControllerTypeChanged(@NotNull ControlContainerObserver controlContainerObserver) {
        this.f98917q = controlContainerObserver;
    }

    public final void observePlayerSizeChanged(@NotNull IWrapperPanelHelper.OnPlayerSizeChangeListener onPlayerSizeChangeListener) {
        this.f98913m = onPlayerSizeChangeListener;
    }

    public final void observePlayerState(@NotNull PlayerStateObserver playerStateObserver) {
        this.f98916p = playerStateObserver;
    }

    public final void pauseVideo() {
        BLog.i("AdPanelRepository-pauseVideo", "[theseus-united-AdPanelRepository-pauseVideo] ad call player pause");
        this.f98906e.pause();
    }

    public final void releasePanel() {
        AdPanelHelper adPanelHelper = this.f98911k;
        if (adPanelHelper != null) {
            adPanelHelper.releasePanel();
        }
        this.f98911k = null;
        AdPanelHelper adPanelHelper2 = this.f98912l;
        if (adPanelHelper2 != null) {
            adPanelHelper2.releasePanel();
        }
        this.f98912l = null;
        this.f98925y = null;
    }

    public final void removeAppBarOnOffsetChangedListener(@NotNull AppBarLayout.OnOffsetChangedListener onOffsetChangedListener) {
        this.f98914n = null;
    }

    public final void removeControllerTypeChanged(@NotNull ControlContainerObserver controlContainerObserver) {
        this.f98917q = null;
    }

    public final void removePlayerSizeChanged(@NotNull IWrapperPanelHelper.OnPlayerSizeChangeListener onPlayerSizeChangeListener) {
        this.f98913m = null;
    }

    public final void removePlayerState(@NotNull PlayerStateObserver playerStateObserver) {
        this.f98916p = null;
    }

    public final void resumeVideo() {
        this.f98906e.p();
    }

    public final <T extends IPanelData> void showPanel(int i7, @Nullable T t7, @Nullable IAdPanelListener iAdPanelListener) {
        if (i7 == 3 || i7 == 4) {
            AdPanelHelper adPanelHelper = this.f98912l;
            if (adPanelHelper != null && adPanelHelper.b()) {
                BLog.i("AdPanelRepository", "showPanel ignored, paused page panel already showing");
                return;
            }
            AdPanelHelper adPanelHelper2 = new AdPanelHelper(this.f98902a, this.f98903b, this.f98904c, i7, t7, iAdPanelListener, new C62761(this), new C62772(this), this, this.f98910j);
            this.f98912l = adPanelHelper2;
            adPanelHelper2.showPanel();
            return;
        }
        AdPanelHelper adPanelHelper3 = this.f98911k;
        if (adPanelHelper3 != null && adPanelHelper3.b()) {
            BLog.i("AdPanelRepository", "showPanel ignored, panel already showing. currentPanelType=" + this.f98925y + ", requestPanelType=" + i7);
            return;
        }
        this.f98925y = Integer.valueOf(i7);
        AdPanelHelper adPanelHelper4 = new AdPanelHelper(this.f98902a, this.f98903b, this.f98904c, i7, t7, iAdPanelListener, new AnonymousClass3(this), new AnonymousClass4(this), this, this.f98910j);
        this.f98911k = adPanelHelper4;
        adPanelHelper4.showPanel();
    }
}
