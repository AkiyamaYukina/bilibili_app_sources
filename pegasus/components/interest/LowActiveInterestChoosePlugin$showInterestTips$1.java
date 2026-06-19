package com.bilibili.pegasus.components.interest;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.bilibili.app.dialogmanager.DialogManagerExtKt;
import com.bilibili.pegasus.data.interestchoose.InterestChooseGuide;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/LowActiveInterestChoosePlugin$showInterestTips$1.class */
final class LowActiveInterestChoosePlugin$showInterestTips$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final Context $context;
    final Fragment $fragment;
    final InterestChooseGuide $guide;
    int label;
    final LowActiveInterestChoosePlugin this$0;

    /* JADX INFO: renamed from: com.bilibili.pegasus.components.interest.LowActiveInterestChoosePlugin$showInterestTips$1$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/LowActiveInterestChoosePlugin$showInterestTips$1$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
        final Fragment $fragment;
        final InterestChooseGuide $guide;
        int label;
        final LowActiveInterestChoosePlugin this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Fragment fragment, InterestChooseGuide interestChooseGuide, LowActiveInterestChoosePlugin lowActiveInterestChoosePlugin, Continuation<? super AnonymousClass1> continuation) {
            super(1, continuation);
            this.$fragment = fragment;
            this.$guide = interestChooseGuide;
            this.this$0 = lowActiveInterestChoosePlugin;
        }

        public final Continuation<Unit> create(Continuation<?> continuation) {
            return new AnonymousClass1(this.$fragment, this.$guide, this.this$0, continuation);
        }

        public final Object invoke(Continuation<? super Unit> continuation) {
            return create(continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                BLog.i("[Interest]LowActiveInterestChoosePlugin", "showInterestTips, show in dialog manager");
                Fragment fragment = this.$fragment;
                InterestChooseGuide interestChooseGuide = this.$guide;
                this.label = 1;
                Object objA = com.bilibili.pegasus.components.interest.ui.common.i.a(fragment, interestChooseGuide, this);
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
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
            }
            if (((Boolean) obj).booleanValue()) {
                LowActiveInterestChoosePlugin lowActiveInterestChoosePlugin = this.this$0;
                this.label = 2;
                if (LowActiveInterestChoosePlugin.b(lowActiveInterestChoosePlugin, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                e.b(InterestChainProcess.FINISH, 1, null, null, null, "tianma", 28);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LowActiveInterestChoosePlugin$showInterestTips$1(Context context, Fragment fragment, InterestChooseGuide interestChooseGuide, LowActiveInterestChoosePlugin lowActiveInterestChoosePlugin, Continuation<? super LowActiveInterestChoosePlugin$showInterestTips$1> continuation) {
        super(2, continuation);
        this.$context = context;
        this.$fragment = fragment;
        this.$guide = interestChooseGuide;
        this.this$0 = lowActiveInterestChoosePlugin;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LowActiveInterestChoosePlugin$showInterestTips$1(this.$context, this.$fragment, this.$guide, this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            Context context = this.$context;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$fragment, this.$guide, this.this$0, null);
            this.label = 1;
            if (DialogManagerExtKt.showInDialogManager$default(context, "pegasus_interest_choose_tips", 94, false, anonymousClass1, this, 8, (Object) null) == coroutine_suspended) {
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
