package com.bilibili.biligame.card2;

import Bc.h;
import android.content.Context;
import androidx.appcompat.widget.C3246j;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.ad.core.click.K;
import com.bilibili.biligame.api.BiligameGiftAllGee;
import com.bilibili.biligame.api.BiligameGiftGee;
import com.bilibili.biligame.card.GameCardTextConfig;
import com.bilibili.biligame.card.config.GameCardButtonConfig;
import com.bilibili.biligame.card.newcard.bean.BiliGameButtonGiftInfo;
import com.bilibili.biligame.card.newcard.bean.BiliGameButtonUserStatus;
import com.bilibili.biligame.card.newcard.bean.BiliGameCardDataBean;
import com.bilibili.biligame.card.newcard.present.GameButtonLoadDataState;
import com.bilibili.biligame.event.GameStatusEvent;
import com.bilibili.biligame.gamenewcard.repository.GameCardRepositoryImpl;
import com.bilibili.biligame.router.GameCommonRouter;
import com.bilibili.biligame.ui.gift.GiftCallback;
import com.bilibili.biligame.utils.CatchUtils;
import com.bilibili.biligame.utils.bus.GloBus;
import com.squareup.otto.Subscribe;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/card2/GameCardButtonPresentImpV2.class */
@StabilityInferred(parameters = 0)
public final class GameCardButtonPresentImpV2 implements GameCardButtonPresentV2, GiftCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f62865a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f62866b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final GameCardTextConfig f62867c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Lp.d f62868d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<String> f62869e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<GameButtonLoadDataState> f62870f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public GameButtonLoadDataState f62871g;

    @Nullable
    public BiliGameCardDataBean h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f62872i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public String f62873j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public String f62874k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final GameCardRepositoryImpl f62875l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    public GameCardButtonConfig f62876m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f62877n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    public CoroutineScope f62878o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public String f62879p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public String f62880q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Nullable
    public Job f62881r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public final List<Function0<Unit>> f62882s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    public final Lazy f62883t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f62884u;

    /* JADX INFO: renamed from: com.bilibili.biligame.card2.GameCardButtonPresentImpV2$bind$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/card2/GameCardButtonPresentImpV2$bind$3.class */
    public static final class AnonymousClass3 extends ContinuationImpl {
        Object L$0;
        boolean Z$0;
        int label;
        Object result;
        final GameCardButtonPresentImpV2 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(GameCardButtonPresentImpV2 gameCardButtonPresentImpV2, Continuation<? super AnonymousClass3> continuation) {
            super(continuation);
            this.this$0 = gameCardButtonPresentImpV2;
        }

        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.a(null, false, this);
        }
    }

    /* JADX INFO: renamed from: com.bilibili.biligame.card2.GameCardButtonPresentImpV2$getLoadDataState$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/card2/GameCardButtonPresentImpV2$getLoadDataState$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function3<GameButtonLoadDataState, GameButtonLoadDataState, Continuation<? super GameButtonLoadDataState>, Object> {
        Object L$0;
        Object L$1;
        int label;
        final GameCardButtonPresentImpV2 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(GameCardButtonPresentImpV2 gameCardButtonPresentImpV2, Continuation<? super AnonymousClass1> continuation) {
            super(3, continuation);
            this.this$0 = gameCardButtonPresentImpV2;
        }

        public final Object invoke(GameButtonLoadDataState gameButtonLoadDataState, GameButtonLoadDataState gameButtonLoadDataState2, Continuation<? super GameButtonLoadDataState> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.L$0 = gameButtonLoadDataState;
            anonymousClass1.L$1 = gameButtonLoadDataState2;
            return anonymousClass1.invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            GameButtonLoadDataState gameButtonLoadDataState = (GameButtonLoadDataState) this.L$0;
            GameButtonLoadDataState gameButtonLoadDataState2 = (GameButtonLoadDataState) this.L$1;
            BiliGameCardDataBean biliGameCardDataBean = this.this$0.h;
            if (biliGameCardDataBean == null) {
                return gameButtonLoadDataState;
            }
            int buttonType = biliGameCardDataBean.getButtonType();
            BiliGameCardDataBean.Companion companion = BiliGameCardDataBean.Companion;
            if (buttonType == companion.getBUTTON_TYPE_DEFAULT() || buttonType == companion.getBUTTON_TYPE_TEST() || (buttonType == companion.getBUTTON_TYPE_VERSION_BOOK() || buttonType == companion.getBUTTON_TYPE_GIFT() || buttonType == companion.getBUTTON_TYPE_EVENT() || buttonType == companion.getBUTTON_TYPE_COUPON() ? !this.this$0.f62877n : buttonType != companion.getBUTTON_TYPE_FOLLOW())) {
                gameButtonLoadDataState = gameButtonLoadDataState2;
            }
            return gameButtonLoadDataState;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.biligame.card2.GameCardButtonPresentImpV2$handleClick$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/card2/GameCardButtonPresentImpV2$handleClick$1.class */
    public static final class C53151 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final Map<String, String> $reportExtra;
        int label;
        final GameCardButtonPresentImpV2 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C53151(GameCardButtonPresentImpV2 gameCardButtonPresentImpV2, Map<String, String> map, Continuation<? super C53151> continuation) {
            super(2, continuation);
            this.this$0 = gameCardButtonPresentImpV2;
            this.$reportExtra = map;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C53151(this.this$0, this.$reportExtra, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                GameCardButtonPresentImpV2 gameCardButtonPresentImpV2 = this.this$0;
                Map<String, String> map = this.$reportExtra;
                this.label = 1;
                if (gameCardButtonPresentImpV2.handleClickSus(map, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.biligame.card2.GameCardButtonPresentImpV2$start$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/card2/GameCardButtonPresentImpV2$start$1.class */
    public static final class C53161 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final GameCardButtonConfig $gameButtonConfig;
        int label;
        final GameCardButtonPresentImpV2 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C53161(GameCardButtonPresentImpV2 gameCardButtonPresentImpV2, GameCardButtonConfig gameCardButtonConfig, Continuation<? super C53161> continuation) {
            super(2, continuation);
            this.this$0 = gameCardButtonPresentImpV2;
            this.$gameButtonConfig = gameCardButtonConfig;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C53161(this.this$0, this.$gameButtonConfig, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                GameCardButtonPresentImpV2 gameCardButtonPresentImpV2 = this.this$0;
                GameCardButtonConfig gameCardButtonConfig = this.$gameButtonConfig;
                this.label = 1;
                if (gameCardButtonPresentImpV2.bind(gameCardButtonConfig, (Continuation<? super Unit>) this) == coroutine_suspended) {
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

    public GameCardButtonPresentImpV2(@NotNull Context context, @NotNull String str, @NotNull String str2) {
        this.f62865a = context;
        this.f62866b = str;
        GameCardTextConfig gameCardTextConfig = new GameCardTextConfig(context);
        this.f62867c = gameCardTextConfig;
        this.f62868d = new Lp.d(context, str, str2);
        this.f62869e = StateFlowKt.MutableStateFlow(gameCardTextConfig.getDefaultText2());
        GameButtonLoadDataState.Idle idle = GameButtonLoadDataState.Idle.INSTANCE;
        this.f62870f = StateFlowKt.MutableStateFlow(idle);
        this.f62871g = idle;
        this.f62873j = "0";
        this.f62874k = "";
        this.f62875l = new GameCardRepositoryImpl((Kp.b) null);
        this.f62879p = context.getString(2131857630);
        this.f62880q = context.getString(2131857630);
        this.f62882s = new ArrayList();
        this.f62883t = LazyKt.lazy(new h(5));
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(com.bilibili.biligame.card.config.GameCardButtonConfig r7, boolean r8, kotlin.coroutines.Continuation<? super kotlin.Unit> r9) {
        /*
            Method dump skipped, instruction units count: 276
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.biligame.card2.GameCardButtonPresentImpV2.a(com.bilibili.biligame.card.config.GameCardButtonConfig, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.bilibili.biligame.card2.GameCardButtonPresentV2
    public final void attach() {
        try {
            if (this.f62884u) {
                return;
            }
            BLog.d("GameCardButtonPresentV2", "attach");
            this.f62868d.attach();
            GloBus.get().register(this);
            this.f62884u = true;
        } catch (Exception e7) {
            CatchUtils.report(e7);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x01b5 A[Catch: Exception -> 0x006d, TRY_ENTER, TryCatch #0 {Exception -> 0x006d, blocks: (B:15:0x0062, B:59:0x0181, B:61:0x0190, B:64:0x019c, B:67:0x01b5, B:69:0x01bd, B:71:0x01d1, B:73:0x01d9, B:75:0x01df, B:22:0x0083, B:54:0x0151, B:38:0x00dd, B:40:0x00f1, B:42:0x00ff, B:44:0x0107, B:46:0x0117, B:47:0x011f, B:49:0x0126), top: B:81:0x004d }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01d9 A[Catch: Exception -> 0x006d, TRY_ENTER, TryCatch #0 {Exception -> 0x006d, blocks: (B:15:0x0062, B:59:0x0181, B:61:0x0190, B:64:0x019c, B:67:0x01b5, B:69:0x01bd, B:71:0x01d1, B:73:0x01d9, B:75:0x01df, B:22:0x0083, B:54:0x0151, B:38:0x00dd, B:40:0x00f1, B:42:0x00ff, B:44:0x0107, B:46:0x0117, B:47:0x011f, B:49:0x0126), top: B:81:0x004d }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(@org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> r8, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r9) {
        /*
            Method dump skipped, instruction units count: 510
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.biligame.card2.GameCardButtonPresentImpV2.b(java.util.Map, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.bilibili.biligame.card2.GameCardButtonPresentV2
    @Nullable
    public final Object bind(long j7, @NotNull Continuation<? super Unit> continuation) {
        Object objBind = bind(new GameCardButtonConfig.GameCardButtonConfigBuilder().setGameBaseId(j7).build(), continuation);
        return objBind == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objBind : Unit.INSTANCE;
    }

    @Override // com.bilibili.biligame.card2.GameCardButtonPresentV2
    @Nullable
    public final Object bind(@NotNull GameCardButtonConfig gameCardButtonConfig, @NotNull Continuation<? super Unit> continuation) {
        Object objA = a(gameCardButtonConfig, true, continuation);
        return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : Unit.INSTANCE;
    }

    @Override // com.bilibili.biligame.card2.GameCardButtonPresentV2
    @NotNull
    public final Map<String, String> buttonInfoParams() {
        BiliGameCardDataBean biliGameCardDataBean = this.h;
        String strD = (biliGameCardDataBean != null && Intrinsics.areEqual(this.f62879p, this.f62880q)) ? this.f62868d.d(biliGameCardDataBean, true) : this.f62880q;
        Pair pair = TuplesKt.to("button_name", strD);
        BiliGameCardDataBean biliGameCardDataBean2 = this.h;
        Pair pair2 = TuplesKt.to("button_type", String.valueOf(biliGameCardDataBean2 != null ? biliGameCardDataBean2.getButtonType() : 0));
        BiliGameCardDataBean biliGameCardDataBean3 = this.h;
        return MapsKt.mapOf(new Pair[]{pair, pair2, TuplesKt.to("button_game_status", String.valueOf(biliGameCardDataBean3 != null ? Integer.valueOf(biliGameCardDataBean3.getGameStatus()) : null))});
    }

    public final void c() {
        String goGiftText;
        BiliGameCardDataBean biliGameCardDataBean = this.h;
        MutableStateFlow<String> mutableStateFlow = this.f62869e;
        if (biliGameCardDataBean == null) {
            mutableStateFlow.tryEmit(this.f62880q);
            return;
        }
        int buttonType = biliGameCardDataBean.getButtonType();
        boolean z6 = this.f62877n;
        String str = this.f62880q;
        String str2 = this.f62879p;
        StringBuilder sbA = z4.c.a(buttonType, "notifyButton before type:", " installed:", " curText:", z6);
        sbA.append(str);
        sbA.append(" textV1:");
        sbA.append(str2);
        BLog.d("GameCardButtonPresentV2", sbA.toString());
        if (biliGameCardDataBean.isButtonDataV2Valid()) {
            int buttonType2 = biliGameCardDataBean.getButtonType();
            BiliGameCardDataBean.Companion companion = BiliGameCardDataBean.Companion;
            if (buttonType2 == companion.getBUTTON_TYPE_DEFAULT() || buttonType2 == companion.getBUTTON_TYPE_TEST()) {
                goGiftText = this.f62879p;
            } else {
                int button_type_version_book = companion.getBUTTON_TYPE_VERSION_BOOK();
                GameCardTextConfig gameCardTextConfig = this.f62867c;
                if (buttonType2 != button_type_version_book) {
                    goGiftText = buttonType2 == companion.getBUTTON_TYPE_GIFT() ? !this.f62877n ? this.f62879p : biliGameCardDataBean.giftAllReceived() ? gameCardTextConfig.getGoGiftText() : gameCardTextConfig.getReceiveAllText() : buttonType2 == companion.getBUTTON_TYPE_EVENT() ? this.f62877n ? gameCardTextConfig.getGoEventText() : this.f62879p : buttonType2 == companion.getBUTTON_TYPE_COUPON() ? !this.f62877n ? this.f62879p : biliGameCardDataBean.couponAllReceived() ? gameCardTextConfig.getGoCouponText() : gameCardTextConfig.getReceiveAllText() : buttonType2 == companion.getBUTTON_TYPE_FOLLOW() ? biliGameCardDataBean.followed() ? gameCardTextConfig.getDefaultText2() : gameCardTextConfig.getFollowText() : this.f62879p;
                } else if (this.f62877n) {
                    BiliGameButtonUserStatus buttonUserStatus = biliGameCardDataBean.getButtonUserStatus();
                    goGiftText = (buttonUserStatus == null || buttonUserStatus.isVersionReserved()) ? gameCardTextConfig.getDefaultText2() : gameCardTextConfig.getVersionBookText();
                } else {
                    goGiftText = this.f62879p;
                }
            }
        } else {
            goGiftText = this.f62879p;
        }
        if (goGiftText.length() > 0) {
            this.f62880q = goGiftText;
        }
        C3246j.b("notifyButton after text:", this.f62880q, "GameCardButtonPresentV2");
        mutableStateFlow.tryEmit(this.f62880q);
    }

    public final void d(String str) {
        Function1<String, Boolean> jumpInterceptor;
        if (str == null) {
            return;
        }
        GameCardButtonConfig gameCardButtonConfig = this.f62876m;
        if (gameCardButtonConfig == null || (jumpInterceptor = gameCardButtonConfig.getJumpInterceptor()) == null || !((Boolean) jumpInterceptor.invoke(str)).booleanValue()) {
            GameCommonRouter.openGameUrl$default(GameCommonRouter.INSTANCE, this.f62865a, str, this.f62866b, (Map) null, (Map) null, 16, (Object) null);
        }
    }

    @Override // com.bilibili.biligame.card2.GameCardButtonPresentV2
    public final void detach() {
        try {
            BLog.d("GameCardButtonPresentV2", "detach");
            Iterator it = ((ArrayList) this.f62882s).iterator();
            while (it.hasNext()) {
                ((Function0) it.next()).invoke();
            }
            ((ArrayList) this.f62882s).clear();
            this.f62877n = false;
            Job job = this.f62881r;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
            }
            CoroutineScope coroutineScope = this.f62878o;
            if (coroutineScope != null) {
                CoroutineScopeKt.cancel$default(coroutineScope, (CancellationException) null, 1, (Object) null);
            }
            if (this.f62884u) {
                GloBus.get().unregister(this);
                this.f62868d.detach();
                this.f62884u = false;
            }
            this.f62881r = null;
            this.f62878o = null;
        } catch (Exception e7) {
            CatchUtils.report(e7);
        }
    }

    public final void failure(int i7, @Nullable String str) {
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.bilibili.biligame.card2.b, java.lang.Object] */
    @Override // com.bilibili.biligame.card2.GameCardButtonPresentV2
    public final void gameCardExposureEventReport(@NotNull final String str, int i7, @Nullable final Map<String, String> map) {
        ?? r02 = new Function0(map, this, str) { // from class: com.bilibili.biligame.card2.b

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Map f62906a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final GameCardButtonPresentImpV2 f62907b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final String f62908c;

            {
                this.f62906a = map;
                this.f62907b = this;
                this.f62908c = str;
            }

            /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invoke() {
                /*
                    r7 = this;
                    r0 = r7
                    java.util.Map r0 = r0.f62906a
                    r8 = r0
                    r0 = r8
                    if (r0 == 0) goto L1a
                    r0 = r8
                    java.util.Map r0 = kotlin.collections.MapsKt.toMutableMap(r0)
                    r9 = r0
                    r0 = r9
                    r8 = r0
                    r0 = r9
                    if (r0 != 0) goto L17
                    goto L1a
                L17:
                    goto L25
                L1a:
                    java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
                    r1 = r0
                    r1.<init>()
                    r8 = r0
                    goto L17
                L25:
                    r0 = r8
                    r1 = r7
                    com.bilibili.biligame.card2.GameCardButtonPresentImpV2 r1 = r1.f62907b
                    java.util.Map r1 = r1.buttonInfoParams()
                    r0.putAll(r1)
                    r0 = 1
                    r1 = r7
                    java.lang.String r1 = r1.f62908c
                    r2 = r8
                    r3 = 0
                    r4 = 8
                    r5 = 0
                    com.bilibili.lib.neuron.api.Neurons.reportExposure$default(r0, r1, r2, r3, r4, r5)
                    kotlin.Unit r0 = kotlin.Unit.INSTANCE
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.biligame.card2.b.invoke():java.lang.Object");
            }
        };
        if (this.f62871g instanceof GameButtonLoadDataState.Complete) {
            r02.invoke();
        } else {
            ((ArrayList) this.f62882s).add(r02);
        }
    }

    @Override // com.bilibili.biligame.card2.GameCardButtonPresentV2
    @NotNull
    public final Flow<String> getGameButtonTextState() {
        return FlowKt.asStateFlow(this.f62869e);
    }

    @Override // com.bilibili.biligame.card2.GameCardButtonPresentV2
    @NotNull
    public final Flow<GameButtonLoadDataState> getLoadDataState() {
        return FlowKt.flowCombine(this.f62870f, FlowKt.asStateFlow(this.f62868d.v), new AnonymousClass1(this, null));
    }

    @Override // com.bilibili.biligame.card2.GameCardButtonPresentV2
    public final void handleClick(@Nullable Map<String, String> map) {
        CoroutineScope coroutineScope = this.f62878o;
        if (coroutineScope != null) {
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new C53151(this, map, null), 3, (Object) null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Type inference failed for: r0v84, types: [com.bilibili.biligame.card2.a, com.bilibili.biligame.ui.gift.v3.dialog.GiftDialogData, java.lang.Object] */
    @Override // com.bilibili.biligame.card2.GameCardButtonPresentV2
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object handleClickSus(@org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> r11, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r12) {
        /*
            Method dump skipped, instruction units count: 726
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.biligame.card2.GameCardButtonPresentImpV2.handleClickSus(java.util.Map, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Subscribe
    public final void onGameStatusChanged(@Nullable GameStatusEvent gameStatusEvent) {
        BiliGameButtonUserStatus buttonUserStatus;
        BiliGameCardDataBean biliGameCardDataBean;
        BiliGameButtonUserStatus buttonUserStatus2;
        if (gameStatusEvent == null || gameStatusEvent.getGameBaseId() != this.f62872i) {
            return;
        }
        BLog.d("GameCardButtonPresentV2", "onGameStatusChanged " + gameStatusEvent.getEventId());
        int eventId = gameStatusEvent.getEventId();
        if (eventId != 1) {
            if (eventId == 5 && (biliGameCardDataBean = this.h) != null && biliGameCardDataBean.getButtonType() == BiliGameCardDataBean.Companion.getBUTTON_TYPE_VERSION_BOOK()) {
                BiliGameCardDataBean biliGameCardDataBean2 = this.h;
                if (biliGameCardDataBean2 != null && (buttonUserStatus2 = biliGameCardDataBean2.getButtonUserStatus()) != null) {
                    buttonUserStatus2.setVersionReserved(gameStatusEvent.isBooked());
                }
                c();
                return;
            }
            return;
        }
        BiliGameCardDataBean biliGameCardDataBean3 = this.h;
        if (biliGameCardDataBean3 == null || biliGameCardDataBean3.getButtonType() != BiliGameCardDataBean.Companion.getBUTTON_TYPE_FOLLOW()) {
            return;
        }
        BiliGameCardDataBean biliGameCardDataBean4 = this.h;
        if (biliGameCardDataBean4 != null && (buttonUserStatus = biliGameCardDataBean4.getButtonUserStatus()) != null) {
            buttonUserStatus.setFollowed(gameStatusEvent.isFollowed());
        }
        c();
    }

    @Override // com.bilibili.biligame.card2.GameCardButtonPresentV2
    public final void start(@NotNull GameCardButtonConfig gameCardButtonConfig) {
        GameCardButtonConfig gameCardButtonConfig2 = this.f62876m;
        if (gameCardButtonConfig2 != null && !Intrinsics.areEqual(gameCardButtonConfig2, gameCardButtonConfig)) {
            detach();
        }
        CoroutineScope coroutineScopeA = K.a((Job) null, 1, (Object) null, Dispatchers.getMain());
        this.f62878o = coroutineScopeA;
        if (coroutineScopeA != null) {
            BuildersKt.launch$default(coroutineScopeA, (CoroutineContext) null, (CoroutineStart) null, new C53161(this, gameCardButtonConfig, null), 3, (Object) null);
        }
    }

    public final void success(@Nullable String str, @Nullable BiligameGiftAllGee biligameGiftAllGee) {
        BiliGameButtonGiftInfo giftInfo;
        BiliGameButtonGiftInfo giftInfo2;
        if (Intrinsics.areEqual(String.valueOf(this.f62872i), str)) {
            BiliGameCardDataBean biliGameCardDataBean = this.h;
            if (biliGameCardDataBean != null && (giftInfo2 = biliGameCardDataBean.getGiftInfo()) != null) {
                giftInfo2.setGiftIds(CollectionsKt.emptyList());
            }
            BiliGameCardDataBean biliGameCardDataBean2 = this.h;
            if (biliGameCardDataBean2 != null && (giftInfo = biliGameCardDataBean2.getGiftInfo()) != null) {
                giftInfo.setGiftCount(0);
            }
            c();
        }
    }

    public final void success(@Nullable String str, @Nullable BiligameGiftGee biligameGiftGee) {
    }
}
