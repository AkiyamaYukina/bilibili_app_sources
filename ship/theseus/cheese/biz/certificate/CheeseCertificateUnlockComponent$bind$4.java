package com.bilibili.ship.theseus.cheese.biz.certificate;

import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
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
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/certificate/CheeseCertificateUnlockComponent$bind$4.class */
final class CheeseCertificateUnlockComponent$bind$4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Job>, Object> {
    final ConstraintLayout $root;
    private Object L$0;
    int label;
    final b this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.certificate.CheeseCertificateUnlockComponent$bind$4$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/certificate/CheeseCertificateUnlockComponent$bind$4$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final ConstraintLayout $root;
        int label;
        final b this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.certificate.CheeseCertificateUnlockComponent$bind$4$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/certificate/CheeseCertificateUnlockComponent$bind$4$1$1.class */
        public static final class C06041 extends SuspendLambda implements Function2<Integer, Continuation<? super Unit>, Object> {
            final ConstraintLayout $root;
            int I$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C06041(ConstraintLayout constraintLayout, Continuation<? super C06041> continuation) {
                super(2, continuation);
                this.$root = constraintLayout;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C06041 c06041 = new C06041(this.$root, continuation);
                c06041.I$0 = ((Number) obj).intValue();
                return c06041;
            }

            public final Object invoke(int i7, Continuation<? super Unit> continuation) {
                return create(Integer.valueOf(i7), continuation).invokeSuspend(Unit.INSTANCE);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke(((Number) obj).intValue(), (Continuation<? super Unit>) obj2);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                int i7 = this.I$0;
                BLog.d("cheese component height change: " + i7);
                ConstraintLayout constraintLayout = this.$root;
                ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
                layoutParams.height = i7;
                constraintLayout.setLayoutParams(layoutParams);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(b bVar, ConstraintLayout constraintLayout, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = bVar;
            this.$root = constraintLayout;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$root, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<Integer> flow = this.this$0.f89255a;
                C06041 c06041 = new C06041(this.$root, null);
                this.label = 1;
                if (FlowKt.collectLatest(flow, c06041, this) == coroutine_suspended) {
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
    public CheeseCertificateUnlockComponent$bind$4(b bVar, ConstraintLayout constraintLayout, Continuation<? super CheeseCertificateUnlockComponent$bind$4> continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$root = constraintLayout;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CheeseCertificateUnlockComponent$bind$4 cheeseCertificateUnlockComponent$bind$4 = new CheeseCertificateUnlockComponent$bind$4(this.this$0, this.$root, continuation);
        cheeseCertificateUnlockComponent$bind$4.L$0 = obj;
        return cheeseCertificateUnlockComponent$bind$4;
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
        return BuildersKt.launch$default((CoroutineScope) this.L$0, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this.this$0, this.$root, null), 3, (Object) null);
    }
}
