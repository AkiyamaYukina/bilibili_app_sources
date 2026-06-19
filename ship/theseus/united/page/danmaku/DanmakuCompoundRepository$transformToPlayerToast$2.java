package com.bilibili.ship.theseus.united.page.danmaku;

import com.bapis.bilibili.community.service.dm.v1.ClickButtonV2;
import com.bapis.bilibili.community.service.dm.v1.PostPanelV2;
import com.bapis.bilibili.community.service.dm.v1.ToastV2;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import tv.danmaku.biliplayerv2.service.IToastService;
import tv.danmaku.biliplayerv2.service.IToastServiceKtxKt;
import tv.danmaku.biliplayerv2.service.report.NeuronsEvents;
import tv.danmaku.biliplayerv2.widget.toast.PlayerToast;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/danmaku/DanmakuCompoundRepository$transformToPlayerToast$2.class */
final class DanmakuCompoundRepository$transformToPlayerToast$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private Object L$0;
    int label;
    final DanmakuCompoundRepository this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.danmaku.DanmakuCompoundRepository$transformToPlayerToast$2$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/danmaku/DanmakuCompoundRepository$transformToPlayerToast$2$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<Pair<? extends Integer, ? extends PostPanelV2>, Continuation<? super Unit>, Object> {
        final CoroutineScope $$this$coroutineScope;
        Object L$0;
        int label;
        final DanmakuCompoundRepository this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.danmaku.DanmakuCompoundRepository$transformToPlayerToast$2$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/danmaku/DanmakuCompoundRepository$transformToPlayerToast$2$1$1.class */
        public static final class C09721 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final PostPanelV2 $panel;
            final PlayerToast $playerToast;
            int label;
            final DanmakuCompoundRepository this$0;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.danmaku.DanmakuCompoundRepository$transformToPlayerToast$2$1$1$a */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/danmaku/DanmakuCompoundRepository$transformToPlayerToast$2$1$1$a.class */
            public static final class a<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final DanmakuCompoundRepository f99398a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final PostPanelV2 f99399b;

                public a(DanmakuCompoundRepository danmakuCompoundRepository, PostPanelV2 postPanelV2) {
                    this.f99398a = danmakuCompoundRepository;
                    this.f99399b = postPanelV2;
                }

                public final Object emit(Object obj, Continuation continuation) {
                    ClickButtonV2 clickButton;
                    Object objEmit;
                    ((Boolean) obj).getClass();
                    DanmakuCompoundRepository danmakuCompoundRepository = this.f99398a;
                    if (com.bilibili.ship.theseus.united.utils.e.a(!danmakuCompoundRepository.h.h().f102988b)) {
                        danmakuCompoundRepository.f99368d.report(new NeuronsEvents.NormalEvent("player.player.dm-order.cheer-toast-click.player", new String[0]));
                        boolean z6 = danmakuCompoundRepository.h.h().f102988b;
                        PostPanelV2 postPanelV2 = this.f99399b;
                        if (z6) {
                            danmakuCompoundRepository.f99371g.R(new com.bilibili.playerbizcommonv2.service.d(null, postPanelV2, (postPanelV2 != null && (clickButton = postPanelV2.getClickButton()) != null && clickButton.getTextInputPost() && clickButton.getLandscapeTextCount() == 1) ? clickButton.getLandscapeText(0) : null));
                            objEmit = Unit.INSTANCE;
                        } else {
                            objEmit = danmakuCompoundRepository.f99377n.emit(postPanelV2.getToast(), continuation);
                            if (objEmit != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                                objEmit = Unit.INSTANCE;
                            }
                        }
                    } else {
                        objEmit = Unit.INSTANCE;
                    }
                    return objEmit;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C09721(DanmakuCompoundRepository danmakuCompoundRepository, PlayerToast playerToast, PostPanelV2 postPanelV2, Continuation<? super C09721> continuation) {
                super(2, continuation);
                this.this$0 = danmakuCompoundRepository;
                this.$playerToast = playerToast;
                this.$panel = postPanelV2;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C09721(this.this$0, this.$playerToast, this.$panel, continuation);
            }

            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    DanmakuCompoundRepository danmakuCompoundRepository = this.this$0;
                    PlayerToast playerToast = this.$playerToast;
                    danmakuCompoundRepository.getClass();
                    Flow flowCallbackFlow = FlowKt.callbackFlow(new DanmakuCompoundRepository$clickFlow$1(playerToast, null));
                    a aVar = new a(this.this$0, this.$panel);
                    this.label = 1;
                    if (flowCallbackFlow.collect(aVar, this) == coroutine_suspended) {
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

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.danmaku.DanmakuCompoundRepository$transformToPlayerToast$2$1$2, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/danmaku/DanmakuCompoundRepository$transformToPlayerToast$2$1$2.class */
        public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final PlayerToast $playerToast;
            int label;
            final DanmakuCompoundRepository this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(DanmakuCompoundRepository danmakuCompoundRepository, PlayerToast playerToast, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = danmakuCompoundRepository;
                this.$playerToast = playerToast;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.this$0, this.$playerToast, continuation);
            }

            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    IToastService iToastService = this.this$0.f99369e;
                    PlayerToast playerToast = this.$playerToast;
                    this.label = 1;
                    if (IToastServiceKtxKt.a(iToastService, playerToast, this) == coroutine_suspended) {
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
        public AnonymousClass1(DanmakuCompoundRepository danmakuCompoundRepository, CoroutineScope coroutineScope, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = danmakuCompoundRepository;
            this.$$this$coroutineScope = coroutineScope;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$$this$coroutineScope, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        public final Object invoke(Pair<Integer, PostPanelV2> pair, Continuation<? super Unit> continuation) {
            return create(pair, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            ToastV2 toast;
            PlayerToast playerToastBuild;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            PostPanelV2 postPanelV2 = (PostPanelV2) ((Pair) this.L$0).component2();
            if (this.this$0.f99367c.isDanmakuForbidden() || !this.this$0.d()) {
                return Unit.INSTANCE;
            }
            if (postPanelV2 != null && (toast = postPanelV2.getToast()) != null) {
                this.this$0.getClass();
                String text = toast.getText();
                String text2 = toast.getToastButtonV2().getText();
                if ((text == null || StringsKt.isBlank(text)) && (text2 == null || StringsKt.isBlank(text2))) {
                    playerToastBuild = null;
                } else {
                    long duration = toast.getDuration();
                    PlayerToast.Builder builder = new PlayerToast.Builder();
                    builder.location(32);
                    builder.duration(duration);
                    if (text != null && !StringsKt.isBlank(text)) {
                        builder.setExtraString("extra_title", text);
                    }
                    if (text2 == null || StringsKt.isBlank(text2)) {
                        builder.toastItemType(17);
                    } else {
                        builder.setExtraString("extra_action_text", text2).toastItemType(18);
                    }
                    playerToastBuild = builder.build();
                }
                if (playerToastBuild != null) {
                    BuildersKt.launch$default(this.$$this$coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new C09721(this.this$0, playerToastBuild, postPanelV2, null), 3, (Object) null);
                    BuildersKt.launch$default(this.$$this$coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this.this$0, playerToastBuild, null), 3, (Object) null);
                    this.this$0.f99368d.report(new NeuronsEvents.NormalEvent("player.player.dm-order.cheer-toast-show.player", new String[0]));
                    return Unit.INSTANCE;
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DanmakuCompoundRepository$transformToPlayerToast$2(DanmakuCompoundRepository danmakuCompoundRepository, Continuation<? super DanmakuCompoundRepository$transformToPlayerToast$2> continuation) {
        super(2, continuation);
        this.this$0 = danmakuCompoundRepository;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        DanmakuCompoundRepository$transformToPlayerToast$2 danmakuCompoundRepository$transformToPlayerToast$2 = new DanmakuCompoundRepository$transformToPlayerToast$2(this.this$0, continuation);
        danmakuCompoundRepository$transformToPlayerToast$2.L$0 = obj;
        return danmakuCompoundRepository$transformToPlayerToast$2;
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
            Flow flowCallbackFlow = FlowKt.callbackFlow(new DanmakuCompoundRepository$postPanelFlow$2(this.this$0.f99370f, null));
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, coroutineScope, null);
            this.label = 1;
            if (FlowKt.collectLatest(flowCallbackFlow, anonymousClass1, this) == coroutine_suspended) {
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
