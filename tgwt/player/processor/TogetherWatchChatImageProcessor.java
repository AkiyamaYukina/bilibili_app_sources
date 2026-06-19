package com.bilibili.tgwt.player.processor;

import androidx.collection.ArrayMap;
import androidx.collection.ArrayMapKt;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bangumi.ui.page.detail.playerV2.screenstate.BangumiScreenStatePlayerHelper;
import com.bilibili.bangumi.ui.page.detail.playerV2.screenstate.a;
import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.tgwt.chatroom.ChatRoomManagerService;
import com.bilibili.tgwt.service.ChatService;
import javax.inject.Inject;
import kotlin.KotlinNothingValueException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.android.log.BLog;
import tv.danmaku.biliplayerv2.ControlContainerConfig;
import tv.danmaku.biliplayerv2.ControlContainerType;
import tv.danmaku.biliplayerv2.ScreenModeType;
import tv.danmaku.biliplayerv2.service.ControlContainerObserver;
import tv.danmaku.biliplayerv2.service.IControlContainerService;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/player/processor/TogetherWatchChatImageProcessor.class */
@StabilityInferred(parameters = 0)
public final class TogetherWatchChatImageProcessor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ChatRoomManagerService f111560a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final ChatService f111561b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f111562c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final com.bilibili.tgwt.player.b f111563d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final BangumiScreenStatePlayerHelper f111564e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final IControlContainerService f111565f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final BiliAccounts f111566g;

    @NotNull
    public ScreenModeType h = ScreenModeType.THUMB;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final a f111567i = new a(this);

    /* JADX INFO: renamed from: com.bilibili.tgwt.player.processor.TogetherWatchChatImageProcessor$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/player/processor/TogetherWatchChatImageProcessor$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function3<Integer, com.bilibili.tgwt.chatroom.c, Continuation<? super Pair<? extends Integer, ? extends Boolean>>, Object> {
        int I$0;
        Object L$0;
        int label;
        final TogetherWatchChatImageProcessor this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(TogetherWatchChatImageProcessor togetherWatchChatImageProcessor, Continuation<? super AnonymousClass1> continuation) {
            super(3, continuation);
            this.this$0 = togetherWatchChatImageProcessor;
        }

        public final Object invoke(int i7, com.bilibili.tgwt.chatroom.c cVar, Continuation<? super Pair<Integer, Boolean>> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.I$0 = i7;
            anonymousClass1.L$0 = cVar;
            return anonymousClass1.invokeSuspend(Unit.INSTANCE);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke(((Number) obj).intValue(), (com.bilibili.tgwt.chatroom.c) obj2, (Continuation<? super Pair<Integer, Boolean>>) obj3);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return TuplesKt.to(Boxing.boxInt(this.I$0), Boxing.boxBoolean(((com.bilibili.tgwt.chatroom.c) this.L$0).f110974c == this.this$0.f111566g.mid()));
        }
    }

    /* JADX INFO: renamed from: com.bilibili.tgwt.player.processor.TogetherWatchChatImageProcessor$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/player/processor/TogetherWatchChatImageProcessor$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<Pair<? extends Integer, ? extends Boolean>, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;
        final TogetherWatchChatImageProcessor this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(TogetherWatchChatImageProcessor togetherWatchChatImageProcessor, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = togetherWatchChatImageProcessor;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        public final Object invoke(Pair<Integer, Boolean> pair, Continuation<? super Unit> continuation) {
            return create(pair, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            ArrayMap arrayMapArrayMapOf;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Pair pair = (Pair) this.L$0;
            int iIntValue = ((Number) pair.component1()).intValue();
            if (((Boolean) pair.component2()).booleanValue()) {
                TogetherWatchChatImageProcessor togetherWatchChatImageProcessor = this.this$0;
                boolean z6 = togetherWatchChatImageProcessor.f111561b.f111872U;
                com.bilibili.tgwt.player.b bVar = togetherWatchChatImageProcessor.f111563d;
                if (z6) {
                    bVar.getClass();
                    ControlContainerType controlContainerType = ControlContainerType.HALF_SCREEN;
                    ControlContainerConfig controlContainerConfig = new ControlContainerConfig();
                    controlContainerConfig.setScreenModeType(ScreenModeType.THUMB);
                    bVar.a(controlContainerConfig, 2131500528);
                    controlContainerConfig.setBottomSubtitleBlock(Uj0.c.b(20.0f, bVar.f111535a));
                    Unit unit = Unit.INSTANCE;
                    Pair pair2 = TuplesKt.to(controlContainerType, controlContainerConfig);
                    ControlContainerType controlContainerType2 = ControlContainerType.LANDSCAPE_FULLSCREEN;
                    ControlContainerConfig controlContainerConfig2 = new ControlContainerConfig();
                    controlContainerConfig2.setScreenModeType(ScreenModeType.LANDSCAPE_FULLSCREEN);
                    bVar.a(controlContainerConfig2, 2131500529);
                    controlContainerConfig2.setBottomSubtitleBlock(Uj0.c.b(60.0f, bVar.f111535a));
                    arrayMapArrayMapOf = ArrayMapKt.arrayMapOf(pair2, TuplesKt.to(controlContainerType2, controlContainerConfig2));
                } else if (iIntValue == 0) {
                    bVar.getClass();
                    ControlContainerType controlContainerType3 = ControlContainerType.HALF_SCREEN;
                    ControlContainerConfig controlContainerConfig3 = new ControlContainerConfig();
                    controlContainerConfig3.setScreenModeType(ScreenModeType.THUMB);
                    bVar.a(controlContainerConfig3, 2131500524);
                    controlContainerConfig3.setBottomSubtitleBlock(Uj0.c.b(20.0f, bVar.f111535a));
                    Pair pair3 = TuplesKt.to(controlContainerType3, controlContainerConfig3);
                    ControlContainerType controlContainerType4 = ControlContainerType.LANDSCAPE_FULLSCREEN;
                    ControlContainerConfig controlContainerConfig4 = new ControlContainerConfig();
                    controlContainerConfig4.setScreenModeType(ScreenModeType.LANDSCAPE_FULLSCREEN);
                    bVar.a(controlContainerConfig4, 2131500525);
                    controlContainerConfig4.setBottomSubtitleBlock(Uj0.c.b(60.0f, bVar.f111535a));
                    Unit unit2 = Unit.INSTANCE;
                    arrayMapArrayMapOf = ArrayMapKt.arrayMapOf(pair3, TuplesKt.to(controlContainerType4, controlContainerConfig4));
                } else {
                    bVar.getClass();
                    ControlContainerType controlContainerType5 = ControlContainerType.HALF_SCREEN;
                    ControlContainerConfig controlContainerConfig5 = new ControlContainerConfig();
                    controlContainerConfig5.setScreenModeType(ScreenModeType.THUMB);
                    bVar.a(controlContainerConfig5, 2131500524);
                    controlContainerConfig5.setBottomSubtitleBlock(Uj0.c.b(20.0f, bVar.f111535a));
                    Pair pair4 = TuplesKt.to(controlContainerType5, controlContainerConfig5);
                    ControlContainerType controlContainerType6 = ControlContainerType.LANDSCAPE_FULLSCREEN;
                    ControlContainerConfig controlContainerConfig6 = new ControlContainerConfig();
                    controlContainerConfig6.setScreenModeType(ScreenModeType.LANDSCAPE_FULLSCREEN);
                    bVar.a(controlContainerConfig6, 2131500521);
                    controlContainerConfig6.setBottomSubtitleBlock(Uj0.c.b(60.0f, bVar.f111535a));
                    Unit unit3 = Unit.INSTANCE;
                    arrayMapArrayMapOf = ArrayMapKt.arrayMapOf(pair4, TuplesKt.to(controlContainerType6, controlContainerConfig6));
                }
            } else {
                TogetherWatchChatImageProcessor togetherWatchChatImageProcessor2 = this.this$0;
                boolean z7 = togetherWatchChatImageProcessor2.f111561b.f111872U;
                com.bilibili.tgwt.player.b bVar2 = togetherWatchChatImageProcessor2.f111563d;
                if (z7) {
                    bVar2.getClass();
                    ControlContainerType controlContainerType7 = ControlContainerType.HALF_SCREEN;
                    ControlContainerConfig controlContainerConfig7 = new ControlContainerConfig();
                    controlContainerConfig7.setScreenModeType(ScreenModeType.THUMB);
                    bVar2.a(controlContainerConfig7, 2131500526);
                    controlContainerConfig7.setBottomSubtitleBlock(Uj0.c.b(20.0f, bVar2.f111535a));
                    Unit unit4 = Unit.INSTANCE;
                    Pair pair5 = TuplesKt.to(controlContainerType7, controlContainerConfig7);
                    ControlContainerType controlContainerType8 = ControlContainerType.LANDSCAPE_FULLSCREEN;
                    ControlContainerConfig controlContainerConfig8 = new ControlContainerConfig();
                    controlContainerConfig8.setScreenModeType(ScreenModeType.LANDSCAPE_FULLSCREEN);
                    bVar2.a(controlContainerConfig8, 2131500527);
                    controlContainerConfig8.setBottomSubtitleBlock(Uj0.c.b(60.0f, bVar2.f111535a));
                    arrayMapArrayMapOf = ArrayMapKt.arrayMapOf(pair5, TuplesKt.to(controlContainerType8, controlContainerConfig8));
                } else if (iIntValue == 0) {
                    bVar2.getClass();
                    ControlContainerType controlContainerType9 = ControlContainerType.HALF_SCREEN;
                    ControlContainerConfig controlContainerConfig9 = new ControlContainerConfig();
                    controlContainerConfig9.setScreenModeType(ScreenModeType.THUMB);
                    bVar2.a(controlContainerConfig9, 2131500522);
                    controlContainerConfig9.setBottomSubtitleBlock(Uj0.c.b(20.0f, bVar2.f111535a));
                    Pair pair6 = TuplesKt.to(controlContainerType9, controlContainerConfig9);
                    ControlContainerType controlContainerType10 = ControlContainerType.LANDSCAPE_FULLSCREEN;
                    ControlContainerConfig controlContainerConfig10 = new ControlContainerConfig();
                    controlContainerConfig10.setScreenModeType(ScreenModeType.LANDSCAPE_FULLSCREEN);
                    bVar2.a(controlContainerConfig10, 2131500523);
                    controlContainerConfig10.setBottomSubtitleBlock(Uj0.c.b(60.0f, bVar2.f111535a));
                    Unit unit5 = Unit.INSTANCE;
                    arrayMapArrayMapOf = ArrayMapKt.arrayMapOf(pair6, TuplesKt.to(controlContainerType10, controlContainerConfig10));
                } else {
                    bVar2.getClass();
                    ControlContainerType controlContainerType11 = ControlContainerType.HALF_SCREEN;
                    ControlContainerConfig controlContainerConfig11 = new ControlContainerConfig();
                    controlContainerConfig11.setScreenModeType(ScreenModeType.THUMB);
                    bVar2.a(controlContainerConfig11, 2131500522);
                    controlContainerConfig11.setBottomSubtitleBlock(Uj0.c.b(20.0f, bVar2.f111535a));
                    Pair pair7 = TuplesKt.to(controlContainerType11, controlContainerConfig11);
                    ControlContainerType controlContainerType12 = ControlContainerType.LANDSCAPE_FULLSCREEN;
                    ControlContainerConfig controlContainerConfig12 = new ControlContainerConfig();
                    controlContainerConfig12.setScreenModeType(ScreenModeType.LANDSCAPE_FULLSCREEN);
                    bVar2.a(controlContainerConfig12, 2131500520);
                    controlContainerConfig12.setBottomSubtitleBlock(Uj0.c.b(60.0f, bVar2.f111535a));
                    Unit unit6 = Unit.INSTANCE;
                    arrayMapArrayMapOf = ArrayMapKt.arrayMapOf(pair7, TuplesKt.to(controlContainerType12, controlContainerConfig12));
                }
            }
            ScreenModeType screenModeType = this.this$0.f111565f.getScreenModeType();
            this.this$0.f111565f.setControlContainerConfig(arrayMapArrayMapOf);
            if (screenModeType == ScreenModeType.THUMB) {
                this.this$0.f111565f.switchTo(ControlContainerType.HALF_SCREEN);
            } else {
                this.this$0.f111565f.switchTo(ControlContainerType.LANDSCAPE_FULLSCREEN);
            }
            BangumiScreenStatePlayerHelper bangumiScreenStatePlayerHelper = this.this$0.f111564e;
            bangumiScreenStatePlayerHelper.getClass();
            BLog.i("BangumiScreenStatePlayerHelper-reinforce", "[bangumi-BangumiScreenStatePlayerHelper-reinforce] reinforce");
            a.b bVar3 = bangumiScreenStatePlayerHelper.d;
            if (bVar3 != null) {
                bangumiScreenStatePlayerHelper.a(bVar3);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.tgwt.player.processor.TogetherWatchChatImageProcessor$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/player/processor/TogetherWatchChatImageProcessor$3.class */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;
        final TogetherWatchChatImageProcessor this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(TogetherWatchChatImageProcessor togetherWatchChatImageProcessor, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.this$0 = togetherWatchChatImageProcessor;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass3(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) throws Throwable {
            TogetherWatchChatImageProcessor togetherWatchChatImageProcessor;
            TogetherWatchChatImageProcessor togetherWatchChatImageProcessor2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                TogetherWatchChatImageProcessor togetherWatchChatImageProcessor3 = this.this$0;
                togetherWatchChatImageProcessor3.f111565f.registerState(togetherWatchChatImageProcessor3.f111567i);
                togetherWatchChatImageProcessor = this.this$0;
                try {
                    this.L$0 = togetherWatchChatImageProcessor;
                    this.label = 1;
                    if (DelayKt.awaitCancellation(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } catch (Throwable th) {
                    th = th;
                    togetherWatchChatImageProcessor.f111565f.unregisterState(togetherWatchChatImageProcessor.f111567i);
                    throw th;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                TogetherWatchChatImageProcessor togetherWatchChatImageProcessor4 = (TogetherWatchChatImageProcessor) this.L$0;
                togetherWatchChatImageProcessor2 = togetherWatchChatImageProcessor4;
                try {
                    ResultKt.throwOnFailure(obj);
                    togetherWatchChatImageProcessor = togetherWatchChatImageProcessor4;
                } catch (Throwable th2) {
                    togetherWatchChatImageProcessor = togetherWatchChatImageProcessor2;
                    th = th2;
                    togetherWatchChatImageProcessor.f111565f.unregisterState(togetherWatchChatImageProcessor.f111567i);
                    throw th;
                }
            }
            togetherWatchChatImageProcessor2 = togetherWatchChatImageProcessor;
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/player/processor/TogetherWatchChatImageProcessor$a.class */
    public static final class a implements ControlContainerObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TogetherWatchChatImageProcessor f111568a;

        public a(TogetherWatchChatImageProcessor togetherWatchChatImageProcessor) {
            this.f111568a = togetherWatchChatImageProcessor;
        }

        public final void onControlContainerChanged(ControlContainerType controlContainerType, ScreenModeType screenModeType) {
            TogetherWatchChatImageProcessor togetherWatchChatImageProcessor = this.f111568a;
            ScreenModeType screenModeType2 = togetherWatchChatImageProcessor.f111565f.getScreenModeType();
            if (togetherWatchChatImageProcessor.h == ScreenModeType.THUMB && screenModeType2 == ScreenModeType.LANDSCAPE_FULLSCREEN && togetherWatchChatImageProcessor.f111560a.g() == 0) {
                togetherWatchChatImageProcessor.f111561b.f111854C.tryEmit(Boolean.TRUE);
            }
            togetherWatchChatImageProcessor.h = screenModeType2;
        }
    }

    @Inject
    public TogetherWatchChatImageProcessor(@NotNull ChatRoomManagerService chatRoomManagerService, @NotNull ChatService chatService, @NotNull CoroutineScope coroutineScope, @NotNull com.bilibili.tgwt.player.b bVar, @NotNull BangumiScreenStatePlayerHelper bangumiScreenStatePlayerHelper, @NotNull IControlContainerService iControlContainerService, @NotNull BiliAccounts biliAccounts) {
        this.f111560a = chatRoomManagerService;
        this.f111561b = chatService;
        this.f111562c = coroutineScope;
        this.f111563d = bVar;
        this.f111564e = bangumiScreenStatePlayerHelper;
        this.f111565f = iControlContainerService;
        this.f111566g = biliAccounts;
        FlowKt.launchIn(FlowKt.onEach(FlowKt.distinctUntilChanged(FlowKt.combine(chatRoomManagerService.f110932y, FlowKt.filterNotNull(chatRoomManagerService.f110924q), new AnonymousClass1(this, null))), new AnonymousClass2(this, null)), coroutineScope);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass3(this, null), 3, (Object) null);
    }
}
