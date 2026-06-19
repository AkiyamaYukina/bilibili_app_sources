package com.bilibili.biligame.card2;

import android.view.View;
import com.bilibili.biligame.card.config.GameCardButtonConfig;
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
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/card2/GameCardButtonView2$bindToView$2.class */
public final class GameCardButtonView2$bindToView$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Job>, Object> {
    final GameCardButtonConfig $gameButtonConfig;
    private Object L$0;
    int label;
    final GameCardButtonView2 this$0;

    /* JADX INFO: renamed from: com.bilibili.biligame.card2.GameCardButtonView2$bindToView$2$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/card2/GameCardButtonView2$bindToView$2$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final GameCardButtonConfig $gameButtonConfig;
        int label;
        final GameCardButtonView2 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(GameCardButtonView2 gameCardButtonView2, GameCardButtonConfig gameCardButtonConfig, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = gameCardButtonView2;
            this.$gameButtonConfig = gameCardButtonConfig;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$gameButtonConfig, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                GameCardButtonPresentImpV2 gameCardButtonPresentImplV2 = this.this$0.getGameCardButtonPresentImplV2();
                GameCardButtonConfig gameCardButtonConfig = this.$gameButtonConfig;
                this.label = 1;
                if (gameCardButtonPresentImplV2.bind(gameCardButtonConfig, (Continuation<? super Unit>) this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.biligame.card2.GameCardButtonView2$bindToView$2$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/card2/GameCardButtonView2$bindToView$2$3.class */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final GameCardButtonView2 this$0;

        /* JADX INFO: renamed from: com.bilibili.biligame.card2.GameCardButtonView2$bindToView$2$3$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/card2/GameCardButtonView2$bindToView$2$3$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final GameCardButtonView2 f62898a;

            public a(GameCardButtonView2 gameCardButtonView2) {
                this.f62898a = gameCardButtonView2;
            }

            /* JADX WARN: Removed duplicated region for block: B:11:0x0053  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object emit(java.lang.Object r4, kotlin.coroutines.Continuation r5) {
                /*
                    r3 = this;
                    r0 = r4
                    java.lang.String r0 = (java.lang.String) r0
                    r5 = r0
                    r0 = r3
                    com.bilibili.biligame.card2.GameCardButtonView2 r0 = r0.f62898a
                    r4 = r0
                    r0 = r4
                    com.bilibili.biligame.card2.GameCardButtonPresentImpV2 r0 = r0.getGameCardButtonPresentImplV2()
                    com.bilibili.biligame.card.newcard.bean.BiliGameCardDataBean r0 = r0.h
                    r6 = r0
                    r0 = r4
                    r1 = 0
                    r0.setVisibility(r1)
                    r0 = r6
                    if (r0 == 0) goto La6
                    r0 = r4
                    r1 = r6
                    r0.f62896k = r1
                    r0 = r6
                    int r0 = r0.getButtonType()
                    com.bilibili.biligame.card.newcard.bean.BiliGameCardDataBean$Companion r1 = com.bilibili.biligame.card.newcard.bean.BiliGameCardDataBean.Companion
                    int r1 = r1.getBUTTON_TYPE_DEFAULT()
                    if (r0 == r1) goto L6f
                    r0 = r6
                    int r0 = r0.getGameStatus()
                    int r1 = com.bilibili.biligame.card.newcard.bean.BiliGameCardDataBeanKt.getSTATUS_DOWNLOAD()
                    if (r0 != r1) goto L53
                    r0 = r4
                    com.bilibili.biligame.card2.GameCardButtonPresentImpV2 r0 = r0.f62891e
                    Lp.d r0 = r0.f62868d
                    com.bilibili.biligame.card.newcard.download.CardDownloadInfo r0 = r0.getGameDownloadInfo()
                    r6 = r0
                    r0 = r6
                    int r0 = r0.getStatus()
                    r1 = 9
                    if (r0 == r1) goto L53
                    r0 = r4
                    r1 = r6
                    r0.j(r1)
                    goto Lbf
                L53:
                    r0 = r4
                    com.bilibili.magicasakura.widgets.TintTextView r0 = r0.f62893g
                    r1 = r5
                    r0.setText(r1)
                    r0 = r4
                    com.bilibili.magicasakura.widgets.TintTextView r0 = r0.f62893g
                    r1 = 0
                    r0.setVisibility(r1)
                    r0 = r4
                    com.bilibili.biligame.gamenewcard.view.GameNewCardDownloadButton r0 = r0.h
                    r1 = 8
                    r0.setVisibility(r1)
                    goto Lbf
                L6f:
                    r0 = r6
                    int r0 = r0.getGameStatus()
                    int r1 = com.bilibili.biligame.card.newcard.bean.BiliGameCardDataBeanKt.getSTATUS_DOWNLOAD()
                    if (r0 != r1) goto L8a
                    r0 = r4
                    r1 = r4
                    com.bilibili.biligame.card2.GameCardButtonPresentImpV2 r1 = r1.f62891e
                    Lp.d r1 = r1.f62868d
                    com.bilibili.biligame.card.newcard.download.CardDownloadInfo r1 = r1.getGameDownloadInfo()
                    r0.j(r1)
                    goto Lbf
                L8a:
                    r0 = r4
                    com.bilibili.magicasakura.widgets.TintTextView r0 = r0.f62893g
                    r1 = r5
                    r0.setText(r1)
                    r0 = r4
                    com.bilibili.magicasakura.widgets.TintTextView r0 = r0.f62893g
                    r1 = 0
                    r0.setVisibility(r1)
                    r0 = r4
                    com.bilibili.biligame.gamenewcard.view.GameNewCardDownloadButton r0 = r0.h
                    r1 = 8
                    r0.setVisibility(r1)
                    goto Lbf
                La6:
                    r0 = r4
                    com.bilibili.magicasakura.widgets.TintTextView r0 = r0.f62893g
                    r1 = r5
                    r0.setText(r1)
                    r0 = r4
                    com.bilibili.magicasakura.widgets.TintTextView r0 = r0.f62893g
                    r1 = 0
                    r0.setVisibility(r1)
                    r0 = r4
                    com.bilibili.biligame.gamenewcard.view.GameNewCardDownloadButton r0 = r0.h
                    r1 = 8
                    r0.setVisibility(r1)
                Lbf:
                    kotlin.Unit r0 = kotlin.Unit.INSTANCE
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.biligame.card2.GameCardButtonView2$bindToView$2.AnonymousClass3.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(GameCardButtonView2 gameCardButtonView2, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.this$0 = gameCardButtonView2;
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
                StateFlow stateFlowAsStateFlow = FlowKt.asStateFlow(this.this$0.getGameCardButtonPresentImplV2().f62869e);
                a aVar = new a(this.this$0);
                this.label = 1;
                if (stateFlowAsStateFlow.collect(aVar, this) == coroutine_suspended) {
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
    public GameCardButtonView2$bindToView$2(GameCardButtonView2 gameCardButtonView2, GameCardButtonConfig gameCardButtonConfig, Continuation<? super GameCardButtonView2$bindToView$2> continuation) {
        super(2, continuation);
        this.this$0 = gameCardButtonView2;
        this.$gameButtonConfig = gameCardButtonConfig;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$0(CoroutineScope coroutineScope, GameCardButtonView2 gameCardButtonView2, View view) {
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new GameCardButtonView2$bindToView$2$2$1(gameCardButtonView2, null), 3, (Object) null);
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        GameCardButtonView2$bindToView$2 gameCardButtonView2$bindToView$2 = new GameCardButtonView2$bindToView$2(this.this$0, this.$gameButtonConfig, continuation);
        gameCardButtonView2$bindToView$2.L$0 = obj;
        return gameCardButtonView2$bindToView$2;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Job> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        final CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this.this$0, this.$gameButtonConfig, null), 3, (Object) null);
        final GameCardButtonView2 gameCardButtonView2 = this.this$0;
        gameCardButtonView2.setOnClickListener(new View.OnClickListener(coroutineScope, gameCardButtonView2) { // from class: com.bilibili.biligame.card2.d

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final CoroutineScope f62910a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final GameCardButtonView2 f62911b;

            {
                this.f62910a = coroutineScope;
                this.f62911b = gameCardButtonView2;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GameCardButtonView2$bindToView$2.invokeSuspend$lambda$0(this.f62910a, this.f62911b, view);
            }
        });
        return BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass3(this.this$0, null), 3, (Object) null);
    }
}
