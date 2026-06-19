package com.bilibili.pegasus.components.interest.ui;

import com.bilibili.pegasus.components.interest.ui.vm.InterestChooseViewModel;
import com.bilibili.pegasus.data.interestchoose.InterestChoose;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/SubCategoryInterestChooseDialog$initGender$1.class */
final class SubCategoryInterestChooseDialog$initGender$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final SubCategoryInterestChooseDialog this$0;

    /* JADX INFO: renamed from: com.bilibili.pegasus.components.interest.ui.SubCategoryInterestChooseDialog$initGender$1$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/SubCategoryInterestChooseDialog$initGender$1$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<InterestChoose, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;
        final SubCategoryInterestChooseDialog this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(SubCategoryInterestChooseDialog subCategoryInterestChooseDialog, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = subCategoryInterestChooseDialog;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        public final Object invoke(InterestChoose interestChoose, Continuation<? super Unit> continuation) {
            return create(interestChoose, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x004f  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                r0 = r5
                int r0 = r0.label
                if (r0 != 0) goto L8b
                r0 = r6
                kotlin.ResultKt.throwOnFailure(r0)
                r0 = r5
                java.lang.Object r0 = r0.L$0
                com.bilibili.pegasus.data.interestchoose.InterestChoose r0 = (com.bilibili.pegasus.data.interestchoose.InterestChoose) r0
                r7 = r0
                r0 = r5
                com.bilibili.pegasus.components.interest.ui.SubCategoryInterestChooseDialog r0 = r0.this$0
                r6 = r0
                kotlin.reflect.KProperty<java.lang.Object>[] r0 = com.bilibili.pegasus.components.interest.ui.SubCategoryInterestChooseDialog.f76378i
                r8 = r0
                r0 = r6
                aq0.V0 r0 = r0.jf()
                androidx.recyclerview.widget.RecyclerView r0 = r0.h
                androidx.recyclerview.widget.RecyclerView$Adapter r0 = r0.getAdapter()
                r6 = r0
                r0 = r6
                boolean r0 = r0 instanceof Bo0.l
                if (r0 == 0) goto L3a
                r0 = r6
                Bo0.l r0 = (Bo0.l) r0
                r6 = r0
                goto L3c
            L3a:
                r0 = 0
                r6 = r0
            L3c:
                r0 = r6
                if (r0 == 0) goto L87
                r0 = r7
                if (r0 == 0) goto L4f
                r0 = r7
                java.util.List r0 = r0.q()
                r8 = r0
                r0 = r8
                r7 = r0
                r0 = r8
                if (r0 != 0) goto L53
            L4f:
                java.util.List r0 = kotlin.collections.CollectionsKt.emptyList()
                r7 = r0
            L53:
                Bo0.i r0 = new Bo0.i
                r1 = r0
                r2 = r6
                java.util.List<com.bilibili.pegasus.data.interestchoose.InterestChooseGender> r2 = r2.f846b
                r3 = r7
                r1.<init>(r2, r3)
                androidx.recyclerview.widget.DiffUtil$DiffResult r0 = androidx.recyclerview.widget.DiffUtil.calculateDiff(r0)
                r8 = r0
                r0 = r6
                java.util.List<com.bilibili.pegasus.data.interestchoose.InterestChooseGender> r0 = r0.f846b
                java.util.ArrayList r0 = (java.util.ArrayList) r0
                r0.clear()
                r0 = r6
                java.util.List<com.bilibili.pegasus.data.interestchoose.InterestChooseGender> r0 = r0.f846b
                r9 = r0
                r0 = r7
                java.util.Collection r0 = (java.util.Collection) r0
                r7 = r0
                r0 = r9
                java.util.ArrayList r0 = (java.util.ArrayList) r0
                r1 = r7
                boolean r0 = r0.addAll(r1)
                r0 = r8
                r1 = r6
                r0.dispatchUpdatesTo(r1)
            L87:
                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                return r0
            L8b:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                r1 = r0
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.components.interest.ui.SubCategoryInterestChooseDialog$initGender$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubCategoryInterestChooseDialog$initGender$1(SubCategoryInterestChooseDialog subCategoryInterestChooseDialog, Continuation<? super SubCategoryInterestChooseDialog$initGender$1> continuation) {
        super(2, continuation);
        this.this$0 = subCategoryInterestChooseDialog;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SubCategoryInterestChooseDialog$initGender$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        MutableStateFlow<InterestChoose> mutableStateFlow;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            InterestChooseViewModel interestChooseViewModel = com.bilibili.pegasus.components.interest.ui.vm.a.f76985a;
            if (interestChooseViewModel != null && (mutableStateFlow = interestChooseViewModel.f76970a) != null) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(mutableStateFlow, anonymousClass1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
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
