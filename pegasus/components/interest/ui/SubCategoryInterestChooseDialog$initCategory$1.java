package com.bilibili.pegasus.components.interest.ui;

import Bo0.i;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.pegasus.components.interest.ui.vm.InterestChooseViewModel;
import com.bilibili.pegasus.components.interest.ui.vm.InterestChooseViewModel$special$$inlined$map$1;
import com.bilibili.pegasus.data.interestchoose.InterestChooseItem;
import java.util.ArrayList;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/SubCategoryInterestChooseDialog$initCategory$1.class */
final class SubCategoryInterestChooseDialog$initCategory$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final SubCategoryInterestChooseDialog this$0;

    /* JADX INFO: renamed from: com.bilibili.pegasus.components.interest.ui.SubCategoryInterestChooseDialog$initCategory$1$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/SubCategoryInterestChooseDialog$initCategory$1$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<List<? extends InterestChooseItem>, Continuation<? super Unit>, Object> {
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

        public final Object invoke(List<InterestChooseItem> list, Continuation<? super Unit> continuation) {
            return create(list, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            List list = (List) this.L$0;
            SubCategoryInterestChooseDialog subCategoryInterestChooseDialog = this.this$0;
            KProperty<Object>[] kPropertyArr = SubCategoryInterestChooseDialog.f76378i;
            RecyclerView.Adapter adapter = subCategoryInterestChooseDialog.jf().f53904g.getAdapter();
            Bo0.c cVar = adapter instanceof Bo0.c ? (Bo0.c) adapter : null;
            if (cVar != null) {
                DiffUtil.DiffResult diffResultCalculateDiff = DiffUtil.calculateDiff(new i(cVar.f828a, list));
                ((ArrayList) cVar.f828a).clear();
                ((ArrayList) cVar.f828a).addAll(list);
                diffResultCalculateDiff.dispatchUpdatesTo(cVar);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubCategoryInterestChooseDialog$initCategory$1(SubCategoryInterestChooseDialog subCategoryInterestChooseDialog, Continuation<? super SubCategoryInterestChooseDialog$initCategory$1> continuation) {
        super(2, continuation);
        this.this$0 = subCategoryInterestChooseDialog;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SubCategoryInterestChooseDialog$initCategory$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        InterestChooseViewModel$special$$inlined$map$1 interestChooseViewModel$special$$inlined$map$1;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            InterestChooseViewModel interestChooseViewModel = com.bilibili.pegasus.components.interest.ui.vm.a.f76985a;
            if (interestChooseViewModel != null && (interestChooseViewModel$special$$inlined$map$1 = interestChooseViewModel.f76971b) != null) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(interestChooseViewModel$special$$inlined$map$1, anonymousClass1, this) == coroutine_suspended) {
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
