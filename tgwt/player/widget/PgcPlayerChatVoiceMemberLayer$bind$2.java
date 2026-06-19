package com.bilibili.tgwt.player.widget;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bilibili.chatroomsdk.ChatRoomMember;
import com.bilibili.tgwt.service.ChatVoiceRtcService;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/player/widget/PgcPlayerChatVoiceMemberLayer$bind$2.class */
final class PgcPlayerChatVoiceMemberLayer$bind$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<?>, Object> {
    final Context $context;
    final e $mControlContainerObserver;
    final View $viewContainer;
    private Object L$0;
    Object L$1;
    int label;
    final f this$0;

    /* JADX INFO: renamed from: com.bilibili.tgwt.player.widget.PgcPlayerChatVoiceMemberLayer$bind$2$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/player/widget/PgcPlayerChatVoiceMemberLayer$bind$2$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<com.bilibili.tgwt.chatroom.c, Continuation<? super Unit>, Object> {
        final Context $context;
        final View $viewContainer;
        Object L$0;
        int label;
        final f this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(f fVar, Context context, View view, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = fVar;
            this.$context = context;
            this.$viewContainer = view;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$context, this.$viewContainer, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        public final Object invoke(com.bilibili.tgwt.chatroom.c cVar, Continuation<? super Unit> continuation) {
            return create(cVar, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            int iB;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            com.bilibili.tgwt.chatroom.c cVar = (com.bilibili.tgwt.chatroom.c) this.L$0;
            f fVar = this.this$0;
            if (cVar.f110974c == com.bilibili.ogv.infra.account.a.f67852b.mid()) {
                iB = Uj0.c.b(84, this.$context);
            } else {
                iB = Uj0.c.b(66, this.$context);
            }
            fVar.f111812i = iB;
            if (this.this$0.f111809e.getPlayerServiceController().p()) {
                ((ViewGroup.MarginLayoutParams) this.$viewContainer.getLayoutParams()).bottomMargin = this.this$0.f111812i;
                this.$viewContainer.requestLayout();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.tgwt.player.widget.PgcPlayerChatVoiceMemberLayer$bind$2$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/player/widget/PgcPlayerChatVoiceMemberLayer$bind$2$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<List<? extends ChatRoomMember>, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;
        final f this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(f fVar, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = fVar;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        public final Object invoke(List<ChatRoomMember> list, Continuation<? super Unit> continuation) {
            return create(list, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:48:0x0193  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                Method dump skipped, instruction units count: 498
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.tgwt.player.widget.PgcPlayerChatVoiceMemberLayer$bind$2.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: com.bilibili.tgwt.player.widget.PgcPlayerChatVoiceMemberLayer$bind$2$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/player/widget/PgcPlayerChatVoiceMemberLayer$bind$2$3.class */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<hu.a, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;
        final f this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(f fVar, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.this$0 = fVar;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, continuation);
            anonymousClass3.L$0 = obj;
            return anonymousClass3;
        }

        public final Object invoke(hu.a aVar, Continuation<? super Unit> continuation) {
            return create(aVar, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            hu.a aVar = (hu.a) this.L$0;
            f fVar = this.this$0;
            com.bilibili.tgwt.detail.chat.m mVar = fVar.f111810f;
            boolean z6 = mVar.f111075i;
            ChatVoiceRtcService chatVoiceRtcService = fVar.f111806b;
            if (z6) {
                chatVoiceRtcService.getClass();
                ChatVoiceRtcService.d(mVar, aVar);
            } else {
                chatVoiceRtcService.getClass();
                ChatVoiceRtcService.d(fVar.f111811g, aVar);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.tgwt.player.widget.PgcPlayerChatVoiceMemberLayer$bind$2$4, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/player/widget/PgcPlayerChatVoiceMemberLayer$bind$2$4.class */
    public static final class AnonymousClass4 extends SuspendLambda implements Function2<hu.a, Continuation<? super Unit>, Object> {
        int label;
        final f this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(f fVar, Continuation<? super AnonymousClass4> continuation) {
            super(2, continuation);
            this.this$0 = fVar;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass4(this.this$0, continuation);
        }

        public final Object invoke(hu.a aVar, Continuation<? super Unit> continuation) {
            return create(aVar, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            f fVar = this.this$0;
            com.bilibili.tgwt.detail.chat.m mVar = fVar.f111810f;
            if (mVar.f111075i) {
                mVar.o(0.0f);
            } else {
                fVar.f111811g.o(0.0f);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.tgwt.player.widget.PgcPlayerChatVoiceMemberLayer$bind$2$5, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/player/widget/PgcPlayerChatVoiceMemberLayer$bind$2$5.class */
    public static final class AnonymousClass5 extends SuspendLambda implements Function2<hu.a[], Continuation<? super Unit>, Object> {
        Object L$0;
        int label;
        final f this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(f fVar, Continuation<? super AnonymousClass5> continuation) {
            super(2, continuation);
            this.this$0 = fVar;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass5 anonymousClass5 = new AnonymousClass5(this.this$0, continuation);
            anonymousClass5.L$0 = obj;
            return anonymousClass5;
        }

        public final Object invoke(hu.a[] aVarArr, Continuation<? super Unit> continuation) {
            return create(aVarArr, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            hu.a[] aVarArr = (hu.a[]) this.L$0;
            f fVar = this.this$0;
            for (hu.a aVar : aVarArr) {
                boolean zAreEqual = Intrinsics.areEqual(aVar.a, String.valueOf(fVar.f111810f.f111076j));
                ChatVoiceRtcService chatVoiceRtcService = fVar.f111806b;
                if (zAreEqual) {
                    chatVoiceRtcService.getClass();
                    ChatVoiceRtcService.d(fVar.f111810f, aVar);
                } else {
                    com.bilibili.tgwt.detail.chat.m mVar = fVar.f111811g;
                    if (Intrinsics.areEqual(aVar.a, String.valueOf(mVar.f111076j))) {
                        chatVoiceRtcService.getClass();
                        ChatVoiceRtcService.d(mVar, aVar);
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.tgwt.player.widget.PgcPlayerChatVoiceMemberLayer$bind$2$6, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/player/widget/PgcPlayerChatVoiceMemberLayer$bind$2$6.class */
    public static final class AnonymousClass6 extends SuspendLambda implements Function2<hu.a[], Continuation<? super Unit>, Object> {
        Object L$0;
        int label;
        final f this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass6(f fVar, Continuation<? super AnonymousClass6> continuation) {
            super(2, continuation);
            this.this$0 = fVar;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass6 anonymousClass6 = new AnonymousClass6(this.this$0, continuation);
            anonymousClass6.L$0 = obj;
            return anonymousClass6;
        }

        public final Object invoke(hu.a[] aVarArr, Continuation<? super Unit> continuation) {
            return create(aVarArr, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            hu.a[] aVarArr = (hu.a[]) this.L$0;
            f fVar = this.this$0;
            for (hu.a aVar : aVarArr) {
                if (Intrinsics.areEqual(aVar.a, String.valueOf(fVar.f111810f.f111076j))) {
                    fVar.f111810f.o(0.0f);
                } else {
                    com.bilibili.tgwt.detail.chat.m mVar = fVar.f111811g;
                    if (Intrinsics.areEqual(aVar.a, String.valueOf(mVar.f111076j))) {
                        mVar.o(0.0f);
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PgcPlayerChatVoiceMemberLayer$bind$2(f fVar, e eVar, Context context, View view, Continuation<? super PgcPlayerChatVoiceMemberLayer$bind$2> continuation) {
        super(2, continuation);
        this.this$0 = fVar;
        this.$mControlContainerObserver = eVar;
        this.$context = context;
        this.$viewContainer = view;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PgcPlayerChatVoiceMemberLayer$bind$2 pgcPlayerChatVoiceMemberLayer$bind$2 = new PgcPlayerChatVoiceMemberLayer$bind$2(this.this$0, this.$mControlContainerObserver, this.$context, this.$viewContainer, continuation);
        pgcPlayerChatVoiceMemberLayer$bind$2.L$0 = obj;
        return pgcPlayerChatVoiceMemberLayer$bind$2;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<?> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) throws Throwable {
        f fVar;
        e eVar;
        e eVar2;
        f fVar2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            FlowKt.launchIn(FlowKt.onEach(FlowKt.filterNotNull(this.this$0.f111805a.f110924q), new AnonymousClass1(this.this$0, this.$context, this.$viewContainer, null)), coroutineScope);
            FlowKt.launchIn(FlowKt.onEach(FlowKt.filterNotNull(this.this$0.f111805a.f110925r), new AnonymousClass2(this.this$0, null)), coroutineScope);
            f fVar3 = this.this$0;
            FlowKt.launchIn(FlowKt.onEach(FlowKt.debounce(FlowKt.onEach(fVar3.f111806b.f111941k, new AnonymousClass3(fVar3, null)), 200L), new AnonymousClass4(this.this$0, null)), coroutineScope);
            f fVar4 = this.this$0;
            FlowKt.launchIn(FlowKt.onEach(FlowKt.debounce(FlowKt.onEach(fVar4.f111806b.f111942l, new AnonymousClass5(fVar4, null)), 200L), new AnonymousClass6(this.this$0, null)), coroutineScope);
            Rl.e playerServiceController = this.this$0.f111809e.getPlayerServiceController();
            playerServiceController.c().registerControlContainerVisible(this.$mControlContainerObserver);
            fVar = this.this$0;
            e eVar3 = this.$mControlContainerObserver;
            try {
                this.L$0 = fVar;
                this.L$1 = eVar3;
                this.label = 1;
                if (DelayKt.awaitCancellation(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                eVar2 = eVar3;
            } catch (Throwable th) {
                th = th;
                eVar = eVar3;
                fVar.f111809e.getPlayerServiceController().c().unregisterControlContainerVisible(eVar);
                throw th;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            eVar2 = (e) this.L$1;
            f fVar5 = (f) this.L$0;
            eVar = eVar2;
            fVar2 = fVar5;
            try {
                ResultKt.throwOnFailure(obj);
                fVar = fVar5;
            } catch (Throwable th2) {
                th = th2;
                fVar = fVar2;
                fVar.f111809e.getPlayerServiceController().c().unregisterControlContainerVisible(eVar);
                throw th;
            }
        }
        eVar = eVar2;
        fVar2 = fVar;
        throw new KotlinNothingValueException();
    }
}
