package com.bilibili.pegasus.components.interest.ui.v33.page;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import aq0.C4885s;
import com.bilibili.app.comm.list.common.widget.PromoToast;
import com.bilibili.lib.theme.R$color;
import com.bilibili.pegasus.components.interest.ui.BaseInterestChooseDialog;
import com.bilibili.pegasus.components.interest.ui.v33.vm.InterestChooseV33PageViewModel;
import com.bilibili.pegasus.data.interestchoose.InterestChoose;
import com.bilibili.pegasus.data.interestchoose.InterestChooseAge;
import com.bilibili.pegasus.data.interestchoose.InterestChooseGender;
import com.bilibili.pegasus.data.interestchoose.InterestChooseItem;
import java.util.Iterator;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v33/page/InterestChooseV33Dialog.class */
@StabilityInferred(parameters = 0)
public final class InterestChooseV33Dialog extends BaseInterestChooseDialog {

    @Nullable
    public C4885s h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public List<InterestChooseItem> f76715i = CollectionsKt.emptyList();

    /* JADX INFO: renamed from: com.bilibili.pegasus.components.interest.ui.v33.page.InterestChooseV33Dialog$onViewCreated$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v33/page/InterestChooseV33Dialog$onViewCreated$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final InterestChooseV33Dialog this$0;

        /* JADX INFO: renamed from: com.bilibili.pegasus.components.interest.ui.v33.page.InterestChooseV33Dialog$onViewCreated$1$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v33/page/InterestChooseV33Dialog$onViewCreated$1$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final InterestChooseV33Dialog f76718a;

            public a(InterestChooseV33Dialog interestChooseV33Dialog) {
                this.f76718a = interestChooseV33Dialog;
            }

            public final Object emit(Object obj, Continuation continuation) {
                try {
                    InterestChooseV33Dialog interestChooseV33Dialog = this.f76718a;
                    interestChooseV33Dialog.f76373c = "three_point";
                    interestChooseV33Dialog.kc(null);
                } catch (Exception e7) {
                    BLog.w("InterestChooseV33Dialog", e7);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(InterestChooseV33Dialog interestChooseV33Dialog, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = interestChooseV33Dialog;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
        public final Object invokeSuspend(Object obj) throws KotlinNothingValueException {
            SharedFlow<Unit> sharedFlow;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                InterestChooseV33PageViewModel interestChooseV33PageViewModel = c.f76724a;
                if (interestChooseV33PageViewModel == null || (sharedFlow = interestChooseV33PageViewModel.f76738b) == null) {
                    return Unit.INSTANCE;
                }
                a aVar = new a(this.this$0);
                this.label = 1;
                if (sharedFlow.collect(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: renamed from: com.bilibili.pegasus.components.interest.ui.v33.page.InterestChooseV33Dialog$onViewCreated$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v33/page/InterestChooseV33Dialog$onViewCreated$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final InterestChooseV33Dialog this$0;

        /* JADX INFO: renamed from: com.bilibili.pegasus.components.interest.ui.v33.page.InterestChooseV33Dialog$onViewCreated$2$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v33/page/InterestChooseV33Dialog$onViewCreated$2$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final InterestChooseV33Dialog f76719a;

            public a(InterestChooseV33Dialog interestChooseV33Dialog) {
                this.f76719a = interestChooseV33Dialog;
            }

            public final Object emit(Object obj, Continuation continuation) {
                int iIntValue = ((Number) obj).intValue();
                Context context = this.f76719a.getContext();
                if (context != null) {
                    PromoToast.showMidToast(context, context.getResources().getQuantityString(2131689723, iIntValue, String.valueOf(iIntValue)), 2131243891, R$color.Text_white);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(InterestChooseV33Dialog interestChooseV33Dialog, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = interestChooseV33Dialog;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
        public final Object invokeSuspend(Object obj) throws KotlinNothingValueException {
            SharedFlow<Integer> sharedFlow;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                InterestChooseV33PageViewModel interestChooseV33PageViewModel = c.f76724a;
                if (interestChooseV33PageViewModel == null || (sharedFlow = interestChooseV33PageViewModel.f76740d) == null) {
                    return Unit.INSTANCE;
                }
                a aVar = new a(this.this$0);
                this.label = 1;
                if (sharedFlow.collect(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    @Override // com.bilibili.pegasus.components.interest.ui.BaseInterestChooseDialog, androidx.fragment.app.DialogFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onCreate(@Nullable Bundle bundle) {
        List list;
        List list2;
        List<InterestChooseAge> listC;
        List mutableList;
        List<InterestChooseGender> listQ;
        List mutableList2;
        super.onCreate(bundle);
        InterestChooseV33PageViewModel interestChooseV33PageViewModel = new InterestChooseV33PageViewModel();
        InterestChoose interestChoose = this.f76374d;
        InterestChoose interestChooseA = null;
        if (interestChoose != null && (listQ = interestChoose.q()) != null && (mutableList2 = CollectionsKt.toMutableList(listQ)) != null) {
            Iterator it = mutableList2.iterator();
            int i7 = 0;
            while (true) {
                list = mutableList2;
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (i7 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                mutableList2.set(i7, InterestChooseGender.a((InterestChooseGender) next, null, i7, false, 223));
                i7++;
            }
        } else {
            list = null;
        }
        if (interestChoose != null && (listC = interestChoose.c()) != null && (mutableList = CollectionsKt.toMutableList(listC)) != null) {
            Iterator it2 = mutableList.iterator();
            int i8 = 0;
            while (true) {
                list2 = mutableList;
                if (!it2.hasNext()) {
                    break;
                }
                Object next2 = it2.next();
                if (i8 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                mutableList.set(i8, InterestChooseAge.a((InterestChooseAge) next2, i8, false, 55));
                i8++;
            }
        } else {
            list2 = null;
        }
        if (interestChoose != null) {
            interestChooseA = InterestChoose.a(interestChoose, null, list, list2, 536870719);
        }
        interestChooseV33PageViewModel.f76741e.setValue(interestChooseA);
        c.f76724a = interestChooseV33PageViewModel;
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        C4885s c4885sInflate = C4885s.inflate(layoutInflater);
        this.h = c4885sInflate;
        return c4885sInflate != null ? c4885sInflate.f54139a : null;
    }

    @Override // com.bilibili.pegasus.components.interest.ui.BaseInterestChooseDialog, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        c.f76724a = null;
    }

    @Override // androidx.fragment.app.DialogFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.h = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:81:0x01ec  */
    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onDismiss(@org.jetbrains.annotations.NotNull android.content.DialogInterface r15) {
        /*
            Method dump skipped, instruction units count: 600
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.components.interest.ui.v33.page.InterestChooseV33Dialog.onDismiss(android.content.DialogInterface):void");
    }

    @Override // com.bilibili.pegasus.components.interest.ui.BaseInterestChooseDialog, androidx.fragment.app.DialogFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onStart() {
        StateFlow<InterestChoose> stateFlow;
        final InterestChoose interestChoose;
        Dialog dialog;
        super.onStart();
        InterestChooseV33PageViewModel interestChooseV33PageViewModel = c.f76724a;
        if (interestChooseV33PageViewModel == null || (stateFlow = interestChooseV33PageViewModel.f76742f) == null || (interestChoose = (InterestChoose) stateFlow.getValue()) == null || (dialog = getDialog()) == null) {
            return;
        }
        dialog.setOnKeyListener(new DialogInterface.OnKeyListener(interestChoose) { // from class: com.bilibili.pegasus.components.interest.ui.v33.page.a

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final InterestChoose f76722a;

            {
                this.f76722a = interestChoose;
            }

            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i7, KeyEvent keyEvent) {
                InterestChoose interestChoose2 = this.f76722a;
                boolean zM = false;
                if (i7 == 4) {
                    zM = false;
                    if (keyEvent.getAction() == 1) {
                        InterestChooseV33PageViewModel interestChooseV33PageViewModel2 = c.f76724a;
                        int iIntValue = 0;
                        if (interestChooseV33PageViewModel2 != null) {
                            StateFlow<Integer> stateFlow2 = interestChooseV33PageViewModel2.f76747l;
                            iIntValue = 0;
                            if (stateFlow2 != null) {
                                iIntValue = ((Number) stateFlow2.getValue()).intValue();
                            }
                        }
                        if (iIntValue > 0) {
                            InterestChooseV33PageViewModel interestChooseV33PageViewModel3 = c.f76724a;
                            if (interestChooseV33PageViewModel3 != null) {
                                interestChooseV33PageViewModel3.b(iIntValue - 1);
                            }
                            zM = true;
                        } else {
                            zM = interestChoose2.m();
                        }
                    }
                }
                return zM;
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00c8  */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onViewCreated(@org.jetbrains.annotations.NotNull android.view.View r9, @org.jetbrains.annotations.Nullable android.os.Bundle r10) {
        /*
            Method dump skipped, instruction units count: 260
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.components.interest.ui.v33.page.InterestChooseV33Dialog.onViewCreated(android.view.View, android.os.Bundle):void");
    }
}
