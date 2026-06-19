package com.bilibili.pegasus.components.interest.ui.v35.page;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import aq0.C4897y;
import com.bilibili.app.comm.list.common.widget.PromoToast;
import com.bilibili.lib.theme.R$color;
import com.bilibili.pegasus.components.interest.m;
import com.bilibili.pegasus.components.interest.ui.BaseInterestChooseDialog;
import com.bilibili.pegasus.components.interest.ui.reporter.InterestPageCloseReason;
import com.bilibili.pegasus.components.interest.ui.reporter.InterestPageReturnReason;
import com.bilibili.pegasus.components.interest.ui.reporter.InterestPageType;
import com.bilibili.pegasus.components.interest.ui.v35.vm.InterestChooseV35PageViewModel;
import com.bilibili.pegasus.data.interestchoose.InterestChoose;
import com.bilibili.pegasus.data.interestchoose.InterestChooseAge;
import com.bilibili.pegasus.data.interestchoose.InterestChooseGender;
import com.bilibili.pegasus.data.interestchoose.InterestChooseItem;
import com.bilibili.pegasus.data.interestchoose.InterestChooseSubItem;
import com.bilibili.studio.material.util.UtilsKt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.StringCompanionObject;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v35/page/InterestChooseV35Dialog.class */
@StabilityInferred(parameters = 0)
public final class InterestChooseV35Dialog extends BaseInterestChooseDialog {

    @Nullable
    public C4897y h;

    /* JADX INFO: renamed from: com.bilibili.pegasus.components.interest.ui.v35.page.InterestChooseV35Dialog$onViewCreated$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v35/page/InterestChooseV35Dialog$onViewCreated$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final InterestChooseV35Dialog this$0;

        /* JADX INFO: renamed from: com.bilibili.pegasus.components.interest.ui.v35.page.InterestChooseV35Dialog$onViewCreated$2$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v35/page/InterestChooseV35Dialog$onViewCreated$2$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final InterestChooseV35Dialog f76797a;

            public a(InterestChooseV35Dialog interestChooseV35Dialog) {
                this.f76797a = interestChooseV35Dialog;
            }

            public final Object emit(Object obj, Continuation continuation) {
                StateFlow<InterestChoose> stateFlow;
                InterestChoose interestChoose;
                com.bilibili.pegasus.components.interest.ui.common.j jVar = (com.bilibili.pegasus.components.interest.ui.common.j) obj;
                InterestChooseV35Dialog interestChooseV35Dialog = this.f76797a;
                try {
                    interestChooseV35Dialog.f76373c = jVar.f76398b.getReason();
                    InterestChooseV35PageViewModel interestChooseV35PageViewModel = c.f76804a;
                    if (interestChooseV35PageViewModel != null && (stateFlow = interestChooseV35PageViewModel.f76817b) != null && (interestChoose = (InterestChoose) stateFlow.getValue()) != null) {
                        com.bilibili.pegasus.components.interest.e.e(interestChoose.D(), interestChoose.O(), jVar.f76398b, jVar.f76397a, interestChoose.B());
                    }
                    interestChooseV35Dialog.kc(null);
                } catch (Exception e7) {
                    BLog.w("InterestChooseV35Dialog", e7);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(InterestChooseV35Dialog interestChooseV35Dialog, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = interestChooseV35Dialog;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
        public final Object invokeSuspend(Object obj) throws KotlinNothingValueException {
            SharedFlow<com.bilibili.pegasus.components.interest.ui.common.j> sharedFlow;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                InterestChooseV35PageViewModel interestChooseV35PageViewModel = c.f76804a;
                if (interestChooseV35PageViewModel == null || (sharedFlow = interestChooseV35PageViewModel.f76824j) == null) {
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

    /* JADX INFO: renamed from: com.bilibili.pegasus.components.interest.ui.v35.page.InterestChooseV35Dialog$onViewCreated$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v35/page/InterestChooseV35Dialog$onViewCreated$3.class */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final InterestChooseV35Dialog this$0;

        /* JADX INFO: renamed from: com.bilibili.pegasus.components.interest.ui.v35.page.InterestChooseV35Dialog$onViewCreated$3$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v35/page/InterestChooseV35Dialog$onViewCreated$3$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final InterestChooseV35Dialog f76798a;

            public a(InterestChooseV35Dialog interestChooseV35Dialog) {
                this.f76798a = interestChooseV35Dialog;
            }

            public final Object emit(Object obj, Continuation continuation) {
                int iIntValue = ((Number) obj).intValue();
                Context context = this.f76798a.getContext();
                if (context != null) {
                    StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                    PromoToast.showMidToast(context, String.format(context.getString(2131845232), Arrays.copyOf(new Object[]{String.valueOf(iIntValue)}, 1)), 2131243891, R$color.Text_white);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(InterestChooseV35Dialog interestChooseV35Dialog, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.this$0 = interestChooseV35Dialog;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass3(this.this$0, continuation);
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
                InterestChooseV35PageViewModel interestChooseV35PageViewModel = c.f76804a;
                if (interestChooseV35PageViewModel == null || (sharedFlow = interestChooseV35PageViewModel.h) == null) {
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

    /* JADX WARN: Removed duplicated region for block: B:54:0x01a0  */
    @Override // com.bilibili.pegasus.components.interest.ui.BaseInterestChooseDialog, androidx.fragment.app.DialogFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCreate(@org.jetbrains.annotations.Nullable android.os.Bundle r23) {
        /*
            Method dump skipped, instruction units count: 499
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.components.interest.ui.v35.page.InterestChooseV35Dialog.onCreate(android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C4897y c4897yInflate = C4897y.inflate(layoutInflater);
        this.h = c4897yInflate;
        return c4897yInflate.f54193a;
    }

    @Override // com.bilibili.pegasus.components.interest.ui.BaseInterestChooseDialog, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        c.f76804a = null;
    }

    @Override // androidx.fragment.app.DialogFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.h = null;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(@NotNull DialogInterface dialogInterface) {
        List<InterestChooseGender> listQ;
        Object next;
        InterestChooseGender interestChooseGender;
        List<InterestChooseAge> listC;
        Object next2;
        InterestChooseAge interestChooseAge;
        InterestChooseV35PageViewModel interestChooseV35PageViewModel;
        String strP;
        StateFlow<Integer> stateFlow;
        StateFlow<InterestChoose> stateFlow2;
        super.onDismiss(dialogInterface);
        InterestChooseV35PageViewModel interestChooseV35PageViewModel2 = c.f76804a;
        InterestChoose interestChoose = (interestChooseV35PageViewModel2 == null || (stateFlow2 = interestChooseV35PageViewModel2.f76817b) == null) ? null : (InterestChoose) stateFlow2.getValue();
        if (interestChoose == null) {
            m8033if();
            return;
        }
        InterestChooseV35PageViewModel interestChooseV35PageViewModel3 = c.f76804a;
        int iIntValue = (interestChooseV35PageViewModel3 == null || (stateFlow = interestChooseV35PageViewModel3.f76830p) == null) ? 0 : ((Number) stateFlow.getValue()).intValue();
        m mVar = this.f76372b;
        if (mVar != null) {
            boolean z6 = this.f76376f;
            long jO = interestChoose.O();
            if ((this.f76376f || iIntValue != 0) && (listQ = interestChoose.q()) != null) {
                Iterator<T> it = listQ.iterator();
                while (true) {
                    if (it.hasNext()) {
                        next = it.next();
                        if (((InterestChooseGender) next).f77411g) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                interestChooseGender = (InterestChooseGender) next;
            } else {
                interestChooseGender = null;
            }
            if ((this.f76376f || iIntValue != 0) && (listC = interestChoose.c()) != null) {
                Iterator<T> it2 = listC.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next2 = it2.next();
                        if (((InterestChooseAge) next2).f77403e) {
                            break;
                        }
                    } else {
                        next2 = null;
                        break;
                    }
                }
                interestChooseAge = (InterestChooseAge) next2;
            } else {
                interestChooseAge = null;
            }
            String strA = (this.f76376f && (interestChooseV35PageViewModel = c.f76804a) != null) ? interestChooseV35PageViewModel.a() : null;
            if (this.f76376f) {
                InterestChooseV35PageViewModel interestChooseV35PageViewModel4 = c.f76804a;
                strP = null;
                if (interestChooseV35PageViewModel4 != null) {
                    InterestChoose interestChoose2 = (InterestChoose) interestChooseV35PageViewModel4.f76818c.getValue();
                    strP = null;
                    if (interestChoose2 != null) {
                        List<InterestChooseItem> listU = interestChoose2.u();
                        if (listU == null) {
                            strP = null;
                        } else {
                            ArrayList arrayList = new ArrayList();
                            for (InterestChooseItem interestChooseItem : listU) {
                                List<InterestChooseSubItem> subItems = interestChooseItem.getSubItems();
                                if (subItems == null || subItems.isEmpty()) {
                                    arrayList.add(String.valueOf(interestChooseItem.getId()));
                                } else {
                                    List<InterestChooseSubItem> subItems2 = interestChooseItem.getSubItems();
                                    if (subItems2 != null) {
                                        Iterator<T> it3 = subItems2.iterator();
                                        while (it3.hasNext()) {
                                            V0.f.b(interestChooseItem.getId(), UtilsKt.DOT, ((InterestChooseSubItem) it3.next()).i(), arrayList);
                                        }
                                    }
                                }
                            }
                            strP = CollectionsKt.p(arrayList, ",", (CharSequence) null, (CharSequence) null, (Function1) null, 62);
                        }
                    }
                }
            } else {
                strP = null;
            }
            mVar.a(z6, new kp0.f(jO, null, strP, interestChooseGender, interestChooseAge, strA, true, 2));
        }
        m8033if();
    }

    @Override // com.bilibili.pegasus.components.interest.ui.BaseInterestChooseDialog, androidx.fragment.app.DialogFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onStart() {
        StateFlow<InterestChoose> stateFlow;
        final InterestChoose interestChoose;
        Dialog dialog;
        super.onStart();
        InterestChooseV35PageViewModel interestChooseV35PageViewModel = c.f76804a;
        if (interestChooseV35PageViewModel == null || (stateFlow = interestChooseV35PageViewModel.f76817b) == null || (interestChoose = (InterestChoose) stateFlow.getValue()) == null || (dialog = getDialog()) == null) {
            return;
        }
        dialog.setOnKeyListener(new DialogInterface.OnKeyListener(interestChoose) { // from class: com.bilibili.pegasus.components.interest.ui.v35.page.a

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final InterestChoose f76802a;

            {
                this.f76802a = interestChoose;
            }

            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i7, KeyEvent keyEvent) {
                StateFlow<Integer> stateFlow2;
                InterestChoose interestChoose2 = this.f76802a;
                boolean z6 = false;
                if (i7 == 4) {
                    z6 = false;
                    if (keyEvent.getAction() == 1) {
                        InterestChooseV35PageViewModel interestChooseV35PageViewModel2 = c.f76804a;
                        int iIntValue = (interestChooseV35PageViewModel2 == null || (stateFlow2 = interestChooseV35PageViewModel2.f76830p) == null) ? 0 : ((Number) stateFlow2.getValue()).intValue();
                        if (iIntValue > 0) {
                            com.bilibili.pegasus.components.interest.e.s(interestChoose2.D(), interestChoose2.O(), InterestPageReturnReason.GESTURE, iIntValue == 2 ? InterestPageType.INTEREST_2ND : InterestPageType.INTEREST_1ST, interestChoose2.B());
                            InterestChooseV35PageViewModel interestChooseV35PageViewModel3 = c.f76804a;
                            if (interestChooseV35PageViewModel3 != null) {
                                interestChooseV35PageViewModel3.b(iIntValue - 1);
                            }
                            z6 = true;
                        } else {
                            com.bilibili.pegasus.components.interest.e.e(interestChoose2.D(), interestChoose2.O(), InterestPageCloseReason.GESTURE, InterestPageType.INFO, interestChoose2.B());
                            z6 = false;
                        }
                    }
                }
                return z6;
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        StateFlow<InterestChoose> stateFlow;
        InterestChoose interestChoose;
        super.onViewCreated(view, bundle);
        C4897y c4897y = this.h;
        if (c4897y != null) {
            c4897y.f54194b.setOnClickListener(new View.OnClickListener(this) { // from class: com.bilibili.pegasus.components.interest.ui.v35.page.b

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final InterestChooseV35Dialog f76803a;

                {
                    this.f76803a = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    InterestChooseV35Dialog interestChooseV35Dialog = this.f76803a;
                    BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(interestChooseV35Dialog.getViewLifecycleOwner()), (CoroutineContext) null, (CoroutineStart) null, new InterestChooseV35Dialog$handleConfirmButtonClicked$1(interestChooseV35Dialog, null), 3, (Object) null);
                }
            });
        }
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(getViewLifecycleOwner()), (CoroutineContext) null, (CoroutineStart) null, new InterestChooseV35Dialog$initConfirmButton$2(this, null), 3, (Object) null);
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(getViewLifecycleOwner()), (CoroutineContext) null, (CoroutineStart) null, new InterestChooseV35Dialog$initConfirmButton$3(this, null), 3, (Object) null);
        C4897y c4897y2 = this.h;
        if (c4897y2 != null) {
            c4897y2.f54195c.setUserInputEnabled(false);
        }
        C4897y c4897y3 = this.h;
        if (c4897y3 != null) {
            c4897y3.f54195c.setAdapter(new FragmentStateAdapter(getChildFragmentManager(), getLifecycle()));
        }
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(getViewLifecycleOwner()), (CoroutineContext) null, (CoroutineStart) null, new InterestChooseV35Dialog$initPage$1(this, null), 3, (Object) null);
        InterestChooseV35PageViewModel interestChooseV35PageViewModel = c.f76804a;
        if (interestChooseV35PageViewModel != null && (stateFlow = interestChooseV35PageViewModel.f76817b) != null && (interestChoose = (InterestChoose) stateFlow.getValue()) != null) {
            int iD = interestChoose.D();
            long jO = interestChoose.O();
            String strB = interestChoose.B();
            String str = strB;
            if (strB == null) {
                str = "";
            }
            com.bilibili.pegasus.components.interest.e.g(iD, jO, str);
        }
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(getViewLifecycleOwner()), (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this, null), 3, (Object) null);
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(getViewLifecycleOwner()), (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass3(this, null), 3, (Object) null);
    }
}
