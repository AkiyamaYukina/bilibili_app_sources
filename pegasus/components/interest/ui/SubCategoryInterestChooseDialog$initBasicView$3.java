package com.bilibili.pegasus.components.interest.ui;

import com.bilibili.magicasakura.widgets.TintTextView;
import com.bilibili.pegasus.components.interest.ui.vm.InterestChooseViewModel;
import com.bilibili.pegasus.data.interestchoose.InterestChoose;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/SubCategoryInterestChooseDialog$initBasicView$3.class */
final class SubCategoryInterestChooseDialog$initBasicView$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final SubCategoryInterestChooseDialog this$0;

    /* JADX INFO: renamed from: com.bilibili.pegasus.components.interest.ui.SubCategoryInterestChooseDialog$initBasicView$3$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/SubCategoryInterestChooseDialog$initBasicView$3$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
        boolean Z$0;
        int label;
        final SubCategoryInterestChooseDialog this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(SubCategoryInterestChooseDialog subCategoryInterestChooseDialog, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = subCategoryInterestChooseDialog;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.Z$0 = ((Boolean) obj).booleanValue();
            return anonymousClass1;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke(((Boolean) obj).booleanValue(), (Continuation<? super Unit>) obj2);
        }

        public final Object invoke(boolean z6, Continuation<? super Unit> continuation) {
            return create(Boolean.valueOf(z6), continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            String strH;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            boolean z6 = this.Z$0;
            SubCategoryInterestChooseDialog subCategoryInterestChooseDialog = this.this$0;
            KProperty<Object>[] kPropertyArr = SubCategoryInterestChooseDialog.f76378i;
            subCategoryInterestChooseDialog.jf().f53900c.setSelected(z6);
            TintTextView tintTextView = this.this$0.jf().f53900c;
            if (z6) {
                InterestChooseViewModel interestChooseViewModel = com.bilibili.pegasus.components.interest.ui.vm.a.f76985a;
                strH = null;
                if (interestChooseViewModel != null) {
                    MutableStateFlow<InterestChoose> mutableStateFlow = interestChooseViewModel.f76970a;
                    strH = null;
                    if (mutableStateFlow != null) {
                        InterestChoose interestChoose = (InterestChoose) mutableStateFlow.getValue();
                        strH = null;
                        if (interestChoose != null) {
                            strH = interestChoose.i();
                        }
                    }
                }
            } else {
                InterestChooseViewModel interestChooseViewModel2 = com.bilibili.pegasus.components.interest.ui.vm.a.f76985a;
                strH = null;
                if (interestChooseViewModel2 != null) {
                    MutableStateFlow<InterestChoose> mutableStateFlow2 = interestChooseViewModel2.f76970a;
                    strH = null;
                    if (mutableStateFlow2 != null) {
                        InterestChoose interestChoose2 = (InterestChoose) mutableStateFlow2.getValue();
                        strH = null;
                        if (interestChoose2 != null) {
                            strH = interestChoose2.h();
                        }
                    }
                }
            }
            tintTextView.setText(strH);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubCategoryInterestChooseDialog$initBasicView$3(SubCategoryInterestChooseDialog subCategoryInterestChooseDialog, Continuation<? super SubCategoryInterestChooseDialog$initBasicView$3> continuation) {
        super(2, continuation);
        this.this$0 = subCategoryInterestChooseDialog;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SubCategoryInterestChooseDialog$initBasicView$3(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Flow<Boolean> flow;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            InterestChooseViewModel interestChooseViewModel = com.bilibili.pegasus.components.interest.ui.vm.a.f76985a;
            if (interestChooseViewModel != null && (flow = interestChooseViewModel.f76976g) != null) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(flow, anonymousClass1, this) == coroutine_suspended) {
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
