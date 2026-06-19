package com.bilibili.ship.theseus.united.page.intro.module.staffs;

import com.bilibili.ship.theseus.united.page.intro.module.staffs.StaffsNewComponent;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.math.MathKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/staffs/StaffsNewComponent$ScrollerAdapter$updateUserInfoLayout$1.class */
final class StaffsNewComponent$ScrollerAdapter$updateUserInfoLayout$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final StaffsNewComponent.FollowButtonState $followButtonState;
    final StaffsNewComponent.a $holder;
    final int $otherWidth;
    int label;
    final StaffsNewComponent this$0;
    final StaffsNewComponent.b this$1;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.staffs.StaffsNewComponent$ScrollerAdapter$updateUserInfoLayout$1$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/staffs/StaffsNewComponent$ScrollerAdapter$updateUserInfoLayout$1$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<Integer, Continuation<? super Unit>, Object> {
        final StaffsNewComponent.FollowButtonState $followButtonState;
        final StaffsNewComponent.a $holder;
        final int $otherWidth;
        int I$0;
        int label;
        final StaffsNewComponent.b this$0;
        final StaffsNewComponent this$1;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(StaffsNewComponent.b bVar, StaffsNewComponent staffsNewComponent, int i7, StaffsNewComponent.FollowButtonState followButtonState, StaffsNewComponent.a aVar, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = bVar;
            this.this$1 = staffsNewComponent;
            this.$otherWidth = i7;
            this.$followButtonState = followButtonState;
            this.$holder = aVar;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.this$1, this.$otherWidth, this.$followButtonState, this.$holder, continuation);
            anonymousClass1.I$0 = ((Number) obj).intValue();
            return anonymousClass1;
        }

        public final Object invoke(int i7, Continuation<? super Unit> continuation) {
            return create(Integer.valueOf(i7), continuation).invokeSuspend(Unit.INSTANCE);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke(((Number) obj).intValue(), (Continuation<? super Unit>) obj2);
        }

        public final Object invokeSuspend(Object obj) {
            int iRoundToInt;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            int i7 = this.I$0;
            if (this.this$0.f101820b.size() >= 3) {
                StaffsNewComponent staffsNewComponent = this.this$1;
                iRoundToInt = MathKt.roundToInt(((i7 - (((staffsNewComponent.f101808i / 2) + (staffsNewComponent.f101803c * 2)) + staffsNewComponent.f101804d)) / 2.0f) - this.$otherWidth);
            } else {
                iRoundToInt = MathKt.roundToInt(((i7 - this.this$1.f101803c) / 2.0f) - this.$otherWidth);
            }
            StringBuilder sbB = Vn.A.b(i7, this.$otherWidth, "StaffsNewComponent containerWidth: ", ", otherWidth: ", ", maxWidth: ");
            sbB.append(iRoundToInt);
            defpackage.a.b("[theseus-united-StaffsNewComponent$ScrollerAdapter$updateUserInfoLayout$1$1-invokeSuspend] ", sbB.toString(), "StaffsNewComponent$ScrollerAdapter$updateUserInfoLayout$1$1-invokeSuspend");
            StaffsNewComponent.FollowButtonState followButtonState = this.$followButtonState;
            if (followButtonState == StaffsNewComponent.FollowButtonState.INIT_SHOW || followButtonState == StaffsNewComponent.FollowButtonState.INIT_HIDDEN) {
                this.$holder.f101815d.setMaxWidth(iRoundToInt);
                this.$holder.f101816e.setMaxWidth(iRoundToInt);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StaffsNewComponent$ScrollerAdapter$updateUserInfoLayout$1(StaffsNewComponent staffsNewComponent, StaffsNewComponent.b bVar, int i7, StaffsNewComponent.FollowButtonState followButtonState, StaffsNewComponent.a aVar, Continuation<? super StaffsNewComponent$ScrollerAdapter$updateUserInfoLayout$1> continuation) {
        super(2, continuation);
        this.this$0 = staffsNewComponent;
        this.this$1 = bVar;
        this.$otherWidth = i7;
        this.$followButtonState = followButtonState;
        this.$holder = aVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new StaffsNewComponent$ScrollerAdapter$updateUserInfoLayout$1(this.this$0, this.this$1, this.$otherWidth, this.$followButtonState, this.$holder, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            StaffsNewComponent staffsNewComponent = this.this$0;
            MutableStateFlow<Integer> mutableStateFlow = staffsNewComponent.f101811l;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$1, staffsNewComponent, this.$otherWidth, this.$followButtonState, this.$holder, null);
            this.label = 1;
            if (FlowKt.collectLatest(mutableStateFlow, anonymousClass1, this) == coroutine_suspended) {
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
