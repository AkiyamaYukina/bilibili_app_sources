package com.bilibili.tgwt.player.processor;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bangumi.data.page.detail.entity.BangumiUniformSeason;
import com.bilibili.bangumi.logic.page.detail.service.BangumiPlayerContainerService;
import com.bilibili.bangumi.logic.page.detail.service.ScreenStateService;
import com.bilibili.bangumi.logic.page.detail.service.refactor.NewSeasonService;
import com.bilibili.bangumi.logic.page.detail.service.refactor.PlayLimitedLayerService;
import com.bilibili.bangumi.module.chatroom.ChatRoomInfo;
import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.tgwt.chatroom.ChatRoomManagerService;
import com.bilibili.tgwt.player.widget.TogetherWatchEndPageFunctionWidget;
import com.bilibili.tgwt.service.ChatService;
import javax.inject.Inject;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.DelayKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.panel.BuiltInLayer;
import tv.danmaku.biliplayerv2.service.ControlContainerObserver;
import tv.danmaku.biliplayerv2.service.FunctionWidgetToken;
import tv.danmaku.biliplayerv2.service.I;
import tv.danmaku.biliplayerv2.service.IVideosPlayDirectorService;
import tv.danmaku.biliplayerv2.service.PlayerSeekObserver;
import tv.danmaku.biliplayerv2.service.Video;
import tv.danmaku.biliplayerv2.widget.IFunctionContainer;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/player/processor/TogetherWatchEndPageProcessor.class */
@StabilityInferred(parameters = 0)
public final class TogetherWatchEndPageProcessor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ChatRoomManagerService f111569a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final NewSeasonService f111570b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final ChatService f111571c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final BangumiPlayerContainerService f111572d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final PlayLimitedLayerService f111573e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f111574f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final BiliAccounts f111575g;

    @Nullable
    public com.bilibili.tgwt.player.widget.k h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public FunctionWidgetToken f111576i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f111577j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f111578k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public FunctionWidgetToken f111579l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final c f111580m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final b f111581n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final a f111582o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final d f111583p;

    /* JADX INFO: renamed from: com.bilibili.tgwt.player.processor.TogetherWatchEndPageProcessor$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/player/processor/TogetherWatchEndPageProcessor$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;
        final TogetherWatchEndPageProcessor this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(TogetherWatchEndPageProcessor togetherWatchEndPageProcessor, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = togetherWatchEndPageProcessor;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) throws Throwable {
            TogetherWatchEndPageProcessor togetherWatchEndPageProcessor;
            TogetherWatchEndPageProcessor togetherWatchEndPageProcessor2;
            Throwable th;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                togetherWatchEndPageProcessor = this.this$0;
                try {
                    this.L$0 = togetherWatchEndPageProcessor;
                    this.label = 1;
                    if (DelayKt.awaitCancellation(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } catch (Throwable th2) {
                    togetherWatchEndPageProcessor2 = togetherWatchEndPageProcessor;
                    th = th2;
                    togetherWatchEndPageProcessor2.h = null;
                    BangumiPlayerContainerService bangumiPlayerContainerService = togetherWatchEndPageProcessor2.f111572d;
                    Rl.e playerServiceController = bangumiPlayerContainerService.getPlayerServiceController();
                    playerServiceController.a.c().removeOnWidgetStateChangeListener(togetherWatchEndPageProcessor2.f111580m);
                    Rl.e playerServiceController2 = bangumiPlayerContainerService.getPlayerServiceController();
                    playerServiceController2.j().unregisterSeekObserver(togetherWatchEndPageProcessor2.f111583p);
                    bangumiPlayerContainerService.removeVideoPlayEventListener(togetherWatchEndPageProcessor2.f111581n);
                    bangumiPlayerContainerService.getPlayerServiceController().y(togetherWatchEndPageProcessor2.f111582o);
                    throw th;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                TogetherWatchEndPageProcessor togetherWatchEndPageProcessor3 = (TogetherWatchEndPageProcessor) this.L$0;
                togetherWatchEndPageProcessor2 = togetherWatchEndPageProcessor3;
                try {
                    ResultKt.throwOnFailure(obj);
                    togetherWatchEndPageProcessor = togetherWatchEndPageProcessor3;
                } catch (Throwable th3) {
                    th = th3;
                    togetherWatchEndPageProcessor2.h = null;
                    BangumiPlayerContainerService bangumiPlayerContainerService2 = togetherWatchEndPageProcessor2.f111572d;
                    Rl.e playerServiceController3 = bangumiPlayerContainerService2.getPlayerServiceController();
                    playerServiceController3.a.c().removeOnWidgetStateChangeListener(togetherWatchEndPageProcessor2.f111580m);
                    Rl.e playerServiceController22 = bangumiPlayerContainerService2.getPlayerServiceController();
                    playerServiceController22.j().unregisterSeekObserver(togetherWatchEndPageProcessor2.f111583p);
                    bangumiPlayerContainerService2.removeVideoPlayEventListener(togetherWatchEndPageProcessor2.f111581n);
                    bangumiPlayerContainerService2.getPlayerServiceController().y(togetherWatchEndPageProcessor2.f111582o);
                    throw th;
                }
            }
            togetherWatchEndPageProcessor2 = togetherWatchEndPageProcessor;
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/player/processor/TogetherWatchEndPageProcessor$a.class */
    public static final class a implements ControlContainerObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TogetherWatchEndPageProcessor f111584a;

        public a(TogetherWatchEndPageProcessor togetherWatchEndPageProcessor) {
            this.f111584a = togetherWatchEndPageProcessor;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0042  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void onControlContainerChanged(tv.danmaku.biliplayerv2.ControlContainerType r6, tv.danmaku.biliplayerv2.ScreenModeType r7) {
            /*
                r5 = this;
                r0 = r5
                com.bilibili.tgwt.player.processor.TogetherWatchEndPageProcessor r0 = r0.f111584a
                r6 = r0
                r0 = r6
                com.bilibili.bangumi.logic.page.detail.service.BangumiPlayerContainerService r0 = r0.f111572d
                Rl.e r0 = r0.getPlayerServiceController()
                tv.danmaku.biliplayerv2.ScreenModeType r0 = r0.m()
                tv.danmaku.biliplayerv2.ScreenModeType r1 = tv.danmaku.biliplayerv2.ScreenModeType.LANDSCAPE_FULLSCREEN
                if (r0 != r1) goto L42
                r0 = r6
                com.bilibili.tgwt.chatroom.ChatRoomManagerService r0 = r0.f111569a
                r7 = r0
                r0 = r7
                int r0 = r0.g()
                if (r0 != 0) goto L42
                r0 = r7
                com.bilibili.tgwt.chatroom.c r0 = r0.h()
                r7 = r0
                r0 = r7
                if (r0 == 0) goto L42
                r0 = r6
                com.bilibili.lib.accounts.BiliAccounts r0 = r0.f111575g
                long r0 = r0.mid()
                r9 = r0
                r0 = r7
                long r0 = r0.f110974c
                r1 = r9
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 != 0) goto L42
                r0 = 1
                r8 = r0
                goto L44
            L42:
                r0 = 0
                r8 = r0
            L44:
                r0 = r6
                r1 = r8
                r0.f111577j = r1
                r0 = r6
                tv.danmaku.biliplayerv2.service.FunctionWidgetToken r0 = r0.f111579l
                r11 = r0
                r0 = r6
                com.bilibili.bangumi.logic.page.detail.service.BangumiPlayerContainerService r0 = r0.f111572d
                r7 = r0
                r0 = r11
                if (r0 == 0) goto L95
                r0 = r8
                if (r0 == 0) goto L95
                r0 = r8
                if (r0 != 0) goto L64
                goto Lb5
            L64:
                r0 = r6
                boolean r0 = r0.f111578k
                if (r0 != 0) goto Lb5
                r0 = r6
                com.bilibili.tgwt.player.widget.k r0 = r0.h
                r11 = r0
                r0 = r11
                if (r0 == 0) goto L8d
                r0 = r7
                Rl.e r0 = r0.getPlayerServiceController()
                r12 = r0
                tv.danmaku.biliplayerv2.panel.BuiltInLayer r0 = tv.danmaku.biliplayerv2.panel.BuiltInLayer.LayerFunction
                r7 = r0
                r0 = r12
                tv.danmaku.biliplayerv2.PlayerContainer r0 = r0.b
                r1 = r7
                r2 = r11
                r0.addPlayerLayer(r1, r2)
            L8d:
                r0 = r6
                r1 = 1
                r0.f111578k = r1
                goto Lb5
            L95:
                r0 = r6
                boolean r0 = r0.f111578k
                if (r0 == 0) goto Lb5
                r0 = r6
                com.bilibili.tgwt.player.widget.k r0 = r0.h
                r11 = r0
                r0 = r11
                if (r0 == 0) goto Lb0
                r0 = r7
                Rl.e r0 = r0.getPlayerServiceController()
                r1 = r11
                r0.v(r1)
            Lb0:
                r0 = r6
                r1 = 0
                r0.f111578k = r1
            Lb5:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.tgwt.player.processor.TogetherWatchEndPageProcessor.a.onControlContainerChanged(tv.danmaku.biliplayerv2.ControlContainerType, tv.danmaku.biliplayerv2.ScreenModeType):void");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/player/processor/TogetherWatchEndPageProcessor$b.class */
    public static final class b implements IVideosPlayDirectorService.VideoPlayEventListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TogetherWatchEndPageProcessor f111585a;

        public b(TogetherWatchEndPageProcessor togetherWatchEndPageProcessor) {
            this.f111585a = togetherWatchEndPageProcessor;
        }

        public final void onAllVideoCompleted() {
            TogetherWatchEndPageProcessor togetherWatchEndPageProcessor = this.f111585a;
            if (togetherWatchEndPageProcessor.f111573e.getLimitLayerStateFlow().getValue() instanceof PlayLimitedLayerService.LimitLayerVisibility.VISIBLE) {
                return;
            }
            IFunctionContainer.LayoutParams layoutParams = new IFunctionContainer.LayoutParams(-1, -1);
            layoutParams.setLayoutType(32);
            layoutParams.setFunctionType(1);
            togetherWatchEndPageProcessor.f111576i = togetherWatchEndPageProcessor.f111572d.getPlayerServiceController().a.c().showWidget(TogetherWatchEndPageFunctionWidget.class, layoutParams);
        }

        public final void onVideoCompleted(Video video) {
            BangumiUniformSeason season;
            ChatRoomInfo chatRoomInfo;
            TogetherWatchEndPageProcessor togetherWatchEndPageProcessor = this.f111585a;
            if (togetherWatchEndPageProcessor.f111573e.getLimitLayerStateFlow().getValue() instanceof PlayLimitedLayerService.LimitLayerVisibility.VISIBLE) {
                return;
            }
            ChatRoomManagerService chatRoomManagerService = togetherWatchEndPageProcessor.f111569a;
            com.bilibili.tgwt.chatroom.c cVarH = chatRoomManagerService.h();
            if (cVarH != null) {
                if (cVarH.f110974c == togetherWatchEndPageProcessor.f111575g.mid()) {
                    return;
                }
            }
            if (chatRoomManagerService.f110900N == ChatService.GuestWatchMode.Free && (season = togetherWatchEndPageProcessor.f111570b.getSeason()) != null && (chatRoomInfo = season.E) != null) {
                BuildersKt.launch$default(togetherWatchEndPageProcessor.f111574f, (CoroutineContext) null, (CoroutineStart) null, new TogetherWatchEndPageProcessor$onVideoCompleted$1$1(togetherWatchEndPageProcessor, chatRoomInfo.t(), null), 3, (Object) null);
            }
            IFunctionContainer.LayoutParams layoutParams = new IFunctionContainer.LayoutParams(-1, -1);
            layoutParams.setLayoutType(32);
            layoutParams.setFunctionType(1);
            togetherWatchEndPageProcessor.f111576i = togetherWatchEndPageProcessor.f111572d.getPlayerServiceController().a.c().showWidget(TogetherWatchEndPageFunctionWidget.class, layoutParams);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/player/processor/TogetherWatchEndPageProcessor$c.class */
    public static final class c implements I {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TogetherWatchEndPageProcessor f111586a;

        public c(TogetherWatchEndPageProcessor togetherWatchEndPageProcessor) {
            this.f111586a = togetherWatchEndPageProcessor;
        }

        public final void onWidgetDismiss(FunctionWidgetToken functionWidgetToken) {
            TogetherWatchEndPageProcessor togetherWatchEndPageProcessor = this.f111586a;
            FunctionWidgetToken functionWidgetToken2 = togetherWatchEndPageProcessor.f111579l;
            if (functionWidgetToken2 == null || functionWidgetToken.getId() != functionWidgetToken2.getId()) {
                return;
            }
            togetherWatchEndPageProcessor.f111579l = null;
            if (togetherWatchEndPageProcessor.f111578k) {
                com.bilibili.tgwt.player.widget.k kVar = togetherWatchEndPageProcessor.h;
                if (kVar != null) {
                    togetherWatchEndPageProcessor.f111572d.getPlayerServiceController().v(kVar);
                }
                togetherWatchEndPageProcessor.f111578k = false;
            }
        }

        public final void onWidgetShow(FunctionWidgetToken functionWidgetToken) {
            if (Intrinsics.areEqual(functionWidgetToken.getClazz(), TogetherWatchEndPageFunctionWidget.class)) {
                TogetherWatchEndPageProcessor togetherWatchEndPageProcessor = this.f111586a;
                togetherWatchEndPageProcessor.f111579l = functionWidgetToken;
                if (togetherWatchEndPageProcessor.f111577j && !togetherWatchEndPageProcessor.f111578k) {
                    com.bilibili.tgwt.player.widget.k kVar = togetherWatchEndPageProcessor.h;
                    if (kVar != null) {
                        Rl.e playerServiceController = togetherWatchEndPageProcessor.f111572d.getPlayerServiceController();
                        playerServiceController.b.addPlayerLayer(BuiltInLayer.LayerFunction, kVar);
                    }
                    togetherWatchEndPageProcessor.f111578k = true;
                }
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/player/processor/TogetherWatchEndPageProcessor$d.class */
    public static final class d implements PlayerSeekObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TogetherWatchEndPageProcessor f111587a;

        public d(TogetherWatchEndPageProcessor togetherWatchEndPageProcessor) {
            this.f111587a = togetherWatchEndPageProcessor;
        }

        public final void onSeekStart(long j7) {
            super.onSeekStart(j7);
            TogetherWatchEndPageProcessor togetherWatchEndPageProcessor = this.f111587a;
            FunctionWidgetToken functionWidgetToken = togetherWatchEndPageProcessor.f111576i;
            if (functionWidgetToken != null) {
                togetherWatchEndPageProcessor.f111572d.getPlayerServiceController().o(functionWidgetToken);
                togetherWatchEndPageProcessor.f111576i = null;
            }
        }
    }

    @Inject
    public TogetherWatchEndPageProcessor(@NotNull Context context, @NotNull ChatRoomManagerService chatRoomManagerService, @NotNull NewSeasonService newSeasonService, @NotNull ChatService chatService, @NotNull ScreenStateService screenStateService, @NotNull BangumiPlayerContainerService bangumiPlayerContainerService, @NotNull PlayLimitedLayerService playLimitedLayerService, @NotNull CoroutineScope coroutineScope, @NotNull BiliAccounts biliAccounts) {
        this.f111569a = chatRoomManagerService;
        this.f111570b = newSeasonService;
        this.f111571c = chatService;
        this.f111572d = bangumiPlayerContainerService;
        this.f111573e = playLimitedLayerService;
        this.f111574f = coroutineScope;
        this.f111575g = biliAccounts;
        c cVar = new c(this);
        this.f111580m = cVar;
        b bVar = new b(this);
        this.f111581n = bVar;
        a aVar = new a(this);
        this.f111582o = aVar;
        d dVar = new d(this);
        this.f111583p = dVar;
        this.h = new com.bilibili.tgwt.player.widget.k(context, newSeasonService, screenStateService, bangumiPlayerContainerService);
        bangumiPlayerContainerService.getPlayerServiceController().a.c().addOnWidgetStateChangeListener(cVar);
        bangumiPlayerContainerService.getPlayerServiceController().j().registerSeekObserver(dVar);
        bangumiPlayerContainerService.addVideoPlayEventListener(bVar);
        bangumiPlayerContainerService.getPlayerServiceController().t(aVar);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
    }
}
