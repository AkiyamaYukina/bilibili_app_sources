package com.bilibili.pegasus.components.interest.ui.v27.page;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import aq0.C4872l0;
import com.bilibili.app.comm.list.common.widget.PromoToast;
import com.bilibili.pegasus.components.interest.m;
import com.bilibili.pegasus.components.interest.ui.BaseInterestChooseDialog;
import com.bilibili.pegasus.components.interest.ui.v27.vm.InterestChooseV27PageViewModel;
import com.bilibili.pegasus.data.interestchoose.InterestChoose;
import com.bilibili.pegasus.data.interestchoose.InterestChooseAge;
import com.bilibili.pegasus.data.interestchoose.InterestChooseGender;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.StringCompanionObject;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v27/page/InterestChooseV27Dialog.class */
@StabilityInferred(parameters = 0)
public final class InterestChooseV27Dialog extends BaseInterestChooseDialog {

    @Nullable
    public C4872l0 h;

    /* JADX INFO: renamed from: com.bilibili.pegasus.components.interest.ui.v27.page.InterestChooseV27Dialog$onViewCreated$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v27/page/InterestChooseV27Dialog$onViewCreated$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final InterestChooseV27Dialog this$0;

        /* JADX INFO: renamed from: com.bilibili.pegasus.components.interest.ui.v27.page.InterestChooseV27Dialog$onViewCreated$1$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v27/page/InterestChooseV27Dialog$onViewCreated$1$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final InterestChooseV27Dialog f76476a;

            public a(InterestChooseV27Dialog interestChooseV27Dialog) {
                this.f76476a = interestChooseV27Dialog;
            }

            public final Object emit(Object obj, Continuation continuation) {
                try {
                    InterestChooseV27Dialog interestChooseV27Dialog = this.f76476a;
                    interestChooseV27Dialog.f76373c = "three_point";
                    interestChooseV27Dialog.kc(null);
                } catch (Exception e7) {
                    BLog.w("InterestChooseV27Dialog", e7);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(InterestChooseV27Dialog interestChooseV27Dialog, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = interestChooseV27Dialog;
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
                InterestChooseV27PageViewModel interestChooseV27PageViewModel = c.f76482a;
                if (interestChooseV27PageViewModel == null || (sharedFlow = interestChooseV27PageViewModel.h) == null) {
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

    /* JADX INFO: renamed from: com.bilibili.pegasus.components.interest.ui.v27.page.InterestChooseV27Dialog$onViewCreated$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v27/page/InterestChooseV27Dialog$onViewCreated$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final InterestChooseV27Dialog this$0;

        /* JADX INFO: renamed from: com.bilibili.pegasus.components.interest.ui.v27.page.InterestChooseV27Dialog$onViewCreated$2$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v27/page/InterestChooseV27Dialog$onViewCreated$2$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final InterestChooseV27Dialog f76477a;

            public a(InterestChooseV27Dialog interestChooseV27Dialog) {
                this.f76477a = interestChooseV27Dialog;
            }

            public final Object emit(Object obj, Continuation continuation) {
                int iIntValue = ((Number) obj).intValue();
                Context context = this.f76477a.getContext();
                if (context != null) {
                    StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                    PromoToast.showMidToast(context, String.format(context.getResources().getQuantityString(2131689723, iIntValue), Arrays.copyOf(new Object[]{Boxing.boxInt(iIntValue)}, 1)));
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(InterestChooseV27Dialog interestChooseV27Dialog, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = interestChooseV27Dialog;
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
                InterestChooseV27PageViewModel interestChooseV27PageViewModel = c.f76482a;
                if (interestChooseV27PageViewModel == null || (sharedFlow = interestChooseV27PageViewModel.f76499f) == null) {
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
        super.onCreate(bundle);
        InterestChooseV27PageViewModel interestChooseV27PageViewModel = new InterestChooseV27PageViewModel();
        interestChooseV27PageViewModel.h(this.f76374d);
        c.f76482a = interestChooseV27PageViewModel;
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        C4872l0 c4872l0Inflate = C4872l0.inflate(layoutInflater);
        this.h = c4872l0Inflate;
        return c4872l0Inflate != null ? c4872l0Inflate.f54084a : null;
    }

    @Override // com.bilibili.pegasus.components.interest.ui.BaseInterestChooseDialog, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        c.f76482a = null;
    }

    @Override // androidx.fragment.app.DialogFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.h = null;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(@NotNull DialogInterface dialogInterface) {
        InterestChooseGender interestChooseGender;
        InterestChooseAge interestChooseAge;
        Object next;
        Object next2;
        StateFlow<InterestChoose> stateFlow;
        super.onDismiss(dialogInterface);
        InterestChooseV27PageViewModel interestChooseV27PageViewModel = c.f76482a;
        String strA = null;
        InterestChoose interestChoose = (interestChooseV27PageViewModel == null || (stateFlow = interestChooseV27PageViewModel.f76495b) == null) ? null : (InterestChoose) stateFlow.getValue();
        if (interestChoose == null) {
            m8033if();
            return;
        }
        m mVar = this.f76372b;
        if (mVar != null) {
            boolean z6 = this.f76376f;
            long jO = interestChoose.O();
            List<InterestChooseGender> listQ = interestChoose.q();
            if (listQ != null) {
                Iterator<T> it = listQ.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next2 = null;
                        break;
                    } else {
                        next2 = it.next();
                        if (((InterestChooseGender) next2).f77411g) {
                            break;
                        }
                    }
                }
                interestChooseGender = (InterestChooseGender) next2;
            } else {
                interestChooseGender = null;
            }
            List<InterestChooseAge> listC = interestChoose.c();
            if (listC != null) {
                Iterator<T> it2 = listC.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    } else {
                        next = it2.next();
                        if (((InterestChooseAge) next).f77403e) {
                            break;
                        }
                    }
                }
                interestChooseAge = (InterestChooseAge) next;
            } else {
                interestChooseAge = null;
            }
            InterestChooseV27PageViewModel interestChooseV27PageViewModel2 = c.f76482a;
            String strB = interestChooseV27PageViewModel2 != null ? interestChooseV27PageViewModel2.b() : null;
            InterestChooseV27PageViewModel interestChooseV27PageViewModel3 = c.f76482a;
            if (interestChooseV27PageViewModel3 != null) {
                strA = interestChooseV27PageViewModel3.a();
            }
            mVar.a(z6, new kp0.f(jO, null, strA, interestChooseGender, interestChooseAge, strB, false, 66));
        }
        if (this.f76375e) {
            com.bilibili.pegasus.components.interest.e.f(this.f76373c, interestChoose.O(), interestChoose.D(), false, 16);
        }
        m8033if();
    }

    @Override // com.bilibili.pegasus.components.interest.ui.BaseInterestChooseDialog, androidx.fragment.app.DialogFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onStart() {
        StateFlow<InterestChoose> stateFlow;
        InterestChoose interestChoose;
        super.onStart();
        InterestChooseV27PageViewModel interestChooseV27PageViewModel = c.f76482a;
        if (interestChooseV27PageViewModel == null || (stateFlow = interestChooseV27PageViewModel.f76495b) == null || (interestChoose = (InterestChoose) stateFlow.getValue()) == null) {
            return;
        }
        final boolean zM = interestChoose.m();
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.setOnKeyListener(new DialogInterface.OnKeyListener(zM) { // from class: com.bilibili.pegasus.components.interest.ui.v27.page.b

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final boolean f76481a;

                {
                    this.f76481a = zM;
                }

                @Override // android.content.DialogInterface.OnKeyListener
                public final boolean onKey(DialogInterface dialogInterface, int i7, KeyEvent keyEvent) {
                    boolean z6;
                    boolean z7 = this.f76481a;
                    if (i7 == 4 && keyEvent.getAction() == 1) {
                        InterestChooseV27PageViewModel interestChooseV27PageViewModel2 = c.f76482a;
                        z6 = z7;
                        if (interestChooseV27PageViewModel2 != null) {
                            StateFlow<Integer> stateFlow2 = interestChooseV27PageViewModel2.f76504l;
                            z6 = z7;
                            if (stateFlow2 != null) {
                                z6 = z7;
                                if (((Number) stateFlow2.getValue()).intValue() == 1) {
                                    InterestChooseV27PageViewModel interestChooseV27PageViewModel3 = c.f76482a;
                                    if (interestChooseV27PageViewModel3 != null) {
                                        interestChooseV27PageViewModel3.g(0);
                                    }
                                    z6 = true;
                                }
                            }
                        }
                    } else {
                        z6 = false;
                    }
                    return z6;
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x011b  */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onViewCreated(@org.jetbrains.annotations.NotNull android.view.View r9, @org.jetbrains.annotations.Nullable android.os.Bundle r10) {
        /*
            Method dump skipped, instruction units count: 342
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.components.interest.ui.v27.page.InterestChooseV27Dialog.onViewCreated(android.view.View, android.os.Bundle):void");
    }
}
