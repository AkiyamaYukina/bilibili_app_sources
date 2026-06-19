package com.bilibili.pegasus.components.interest.ui.v36.page;

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
import aq0.C4828E;
import com.bilibili.app.comm.list.common.widget.PromoToast;
import com.bilibili.lib.theme.R$color;
import com.bilibili.pegasus.components.interest.m;
import com.bilibili.pegasus.components.interest.ui.BaseInterestChooseDialog;
import com.bilibili.pegasus.components.interest.ui.common.j;
import com.bilibili.pegasus.components.interest.ui.reporter.InterestPageCloseReason;
import com.bilibili.pegasus.components.interest.ui.reporter.InterestPageReturnReason;
import com.bilibili.pegasus.components.interest.ui.reporter.InterestPageType;
import com.bilibili.pegasus.components.interest.ui.v36.vm.InterestChooseV36PageViewModel;
import com.bilibili.pegasus.data.interestchoose.InterestChoose;
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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v36/page/InterestChooseV36Dialog.class */
@StabilityInferred(parameters = 0)
public final class InterestChooseV36Dialog extends BaseInterestChooseDialog {

    @Nullable
    public C4828E h;

    /* JADX INFO: renamed from: com.bilibili.pegasus.components.interest.ui.v36.page.InterestChooseV36Dialog$onViewCreated$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v36/page/InterestChooseV36Dialog$onViewCreated$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final InterestChooseV36Dialog this$0;

        /* JADX INFO: renamed from: com.bilibili.pegasus.components.interest.ui.v36.page.InterestChooseV36Dialog$onViewCreated$2$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v36/page/InterestChooseV36Dialog$onViewCreated$2$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final InterestChooseV36Dialog f76844a;

            public a(InterestChooseV36Dialog interestChooseV36Dialog) {
                this.f76844a = interestChooseV36Dialog;
            }

            public final Object emit(Object obj, Continuation continuation) {
                StateFlow<InterestChoose> stateFlow;
                InterestChoose interestChoose;
                j jVar = (j) obj;
                try {
                    InterestChooseV36PageViewModel interestChooseV36PageViewModel = c.f76850a;
                    if (interestChooseV36PageViewModel != null && (stateFlow = interestChooseV36PageViewModel.f76856b) != null && (interestChoose = (InterestChoose) stateFlow.getValue()) != null) {
                        int iD = interestChoose.D();
                        long jO = interestChoose.O();
                        InterestPageCloseReason interestPageCloseReason = jVar.f76398b;
                        InterestPageType interestPageType = jVar.f76397a;
                        String strB = interestChoose.B();
                        String str = strB;
                        if (strB == null) {
                            str = "";
                        }
                        com.bilibili.pegasus.components.interest.e.e(iD, jO, interestPageCloseReason, interestPageType, str);
                    }
                    InterestChooseV36Dialog interestChooseV36Dialog = this.f76844a;
                    interestChooseV36Dialog.f76373c = "three_point";
                    interestChooseV36Dialog.kc(null);
                } catch (Exception e7) {
                    BLog.w("InterestChooseV36Dialog", e7);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(InterestChooseV36Dialog interestChooseV36Dialog, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = interestChooseV36Dialog;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
        public final Object invokeSuspend(Object obj) throws KotlinNothingValueException {
            SharedFlow<j> sharedFlow;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                InterestChooseV36PageViewModel interestChooseV36PageViewModel = c.f76850a;
                if (interestChooseV36PageViewModel == null || (sharedFlow = interestChooseV36PageViewModel.h) == null) {
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

    /* JADX INFO: renamed from: com.bilibili.pegasus.components.interest.ui.v36.page.InterestChooseV36Dialog$onViewCreated$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v36/page/InterestChooseV36Dialog$onViewCreated$3.class */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final InterestChooseV36Dialog this$0;

        /* JADX INFO: renamed from: com.bilibili.pegasus.components.interest.ui.v36.page.InterestChooseV36Dialog$onViewCreated$3$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v36/page/InterestChooseV36Dialog$onViewCreated$3$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final InterestChooseV36Dialog f76845a;

            public a(InterestChooseV36Dialog interestChooseV36Dialog) {
                this.f76845a = interestChooseV36Dialog;
            }

            public final Object emit(Object obj, Continuation continuation) {
                int iIntValue = ((Number) obj).intValue();
                Context context = this.f76845a.getContext();
                if (context != null) {
                    StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                    PromoToast.showMidToast(context, String.format(context.getString(2131845232), Arrays.copyOf(new Object[]{String.valueOf(iIntValue)}, 1)), 2131243891, R$color.Text_white);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(InterestChooseV36Dialog interestChooseV36Dialog, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.this$0 = interestChooseV36Dialog;
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
                InterestChooseV36PageViewModel interestChooseV36PageViewModel = c.f76850a;
                if (interestChooseV36PageViewModel == null || (sharedFlow = interestChooseV36PageViewModel.f76860f) == null) {
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

    /* JADX WARN: Removed duplicated region for block: B:26:0x00c4  */
    @Override // com.bilibili.pegasus.components.interest.ui.BaseInterestChooseDialog, androidx.fragment.app.DialogFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCreate(@org.jetbrains.annotations.Nullable android.os.Bundle r23) {
        /*
            Method dump skipped, instruction units count: 274
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.components.interest.ui.v36.page.InterestChooseV36Dialog.onCreate(android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C4828E c4828eInflate = C4828E.inflate(layoutInflater);
        this.h = c4828eInflate;
        return c4828eInflate.f53691a;
    }

    @Override // com.bilibili.pegasus.components.interest.ui.BaseInterestChooseDialog, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        c.f76850a = null;
    }

    @Override // androidx.fragment.app.DialogFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.h = null;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(@NotNull DialogInterface dialogInterface) {
        InterestChooseV36PageViewModel interestChooseV36PageViewModel;
        String strP;
        String strP2;
        StateFlow<InterestChoose> stateFlow;
        super.onDismiss(dialogInterface);
        InterestChooseV36PageViewModel interestChooseV36PageViewModel2 = c.f76850a;
        InterestChoose interestChoose = (interestChooseV36PageViewModel2 == null || (stateFlow = interestChooseV36PageViewModel2.f76856b) == null) ? null : (InterestChoose) stateFlow.getValue();
        if (interestChoose == null) {
            m8033if();
            return;
        }
        m mVar = this.f76372b;
        if (mVar != null) {
            boolean z6 = this.f76376f;
            long jO = interestChoose.O();
            if (this.f76376f && (interestChooseV36PageViewModel = c.f76850a) != null) {
                InterestChoose interestChoose2 = (InterestChoose) interestChooseV36PageViewModel.f76855a.getValue();
                List<InterestChooseItem> listU = interestChoose2 != null ? interestChoose2.u() : null;
                ArrayList arrayList = new ArrayList();
                if (listU != null) {
                    ArrayList<InterestChooseItem> arrayList2 = new ArrayList();
                    for (Object obj : listU) {
                        if (((InterestChooseItem) obj).isSelected()) {
                            arrayList2.add(obj);
                        }
                    }
                    for (InterestChooseItem interestChooseItem : arrayList2) {
                        List<InterestChooseSubItem> subItems = interestChooseItem.getSubItems();
                        if (subItems == null || subItems.isEmpty()) {
                            arrayList.add(String.valueOf(interestChooseItem.getId()));
                        } else {
                            List<InterestChooseSubItem> subItems2 = interestChooseItem.getSubItems();
                            if (subItems2 != null) {
                                List<InterestChooseSubItem> list = subItems2;
                                ArrayList arrayList3 = new ArrayList();
                                for (Object obj2 : list) {
                                    if (((InterestChooseSubItem) obj2).f77422g) {
                                        arrayList3.add(obj2);
                                    }
                                }
                                Iterator it = arrayList3.iterator();
                                while (it.hasNext()) {
                                    V0.f.b(interestChooseItem.getId(), UtilsKt.DOT, ((InterestChooseSubItem) it.next()).i(), arrayList);
                                }
                            }
                        }
                    }
                }
                strP = CollectionsKt.p(arrayList, ",", (CharSequence) null, (CharSequence) null, (Function1) null, 62);
            } else {
                strP = null;
            }
            if (this.f76376f) {
                InterestChooseV36PageViewModel interestChooseV36PageViewModel3 = c.f76850a;
                strP2 = null;
                if (interestChooseV36PageViewModel3 != null) {
                    InterestChoose interestChoose3 = (InterestChoose) interestChooseV36PageViewModel3.f76855a.getValue();
                    strP2 = null;
                    if (interestChoose3 != null) {
                        List<InterestChooseItem> listU2 = interestChoose3.u();
                        if (listU2 == null) {
                            strP2 = null;
                        } else {
                            ArrayList arrayList4 = new ArrayList();
                            for (InterestChooseItem interestChooseItem2 : listU2) {
                                List<InterestChooseSubItem> subItems3 = interestChooseItem2.getSubItems();
                                if (subItems3 == null || subItems3.isEmpty()) {
                                    arrayList4.add(String.valueOf(interestChooseItem2.getId()));
                                } else {
                                    List<InterestChooseSubItem> subItems4 = interestChooseItem2.getSubItems();
                                    if (subItems4 != null) {
                                        Iterator<T> it2 = subItems4.iterator();
                                        while (it2.hasNext()) {
                                            V0.f.b(interestChooseItem2.getId(), UtilsKt.DOT, ((InterestChooseSubItem) it2.next()).i(), arrayList4);
                                        }
                                    }
                                }
                            }
                            strP2 = CollectionsKt.p(arrayList4, ",", (CharSequence) null, (CharSequence) null, (Function1) null, 62);
                        }
                    }
                }
            } else {
                strP2 = null;
            }
            mVar.a(z6, new kp0.f(jO, null, strP2, null, null, strP, true, 26));
        }
        m8033if();
    }

    @Override // com.bilibili.pegasus.components.interest.ui.BaseInterestChooseDialog, androidx.fragment.app.DialogFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onStart() {
        StateFlow<InterestChoose> stateFlow;
        final InterestChoose interestChoose;
        Dialog dialog;
        super.onStart();
        InterestChooseV36PageViewModel interestChooseV36PageViewModel = c.f76850a;
        if (interestChooseV36PageViewModel == null || (stateFlow = interestChooseV36PageViewModel.f76856b) == null || (interestChoose = (InterestChoose) stateFlow.getValue()) == null || (dialog = getDialog()) == null) {
            return;
        }
        dialog.setOnKeyListener(new DialogInterface.OnKeyListener(interestChoose) { // from class: com.bilibili.pegasus.components.interest.ui.v36.page.b

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final InterestChoose f76849a;

            {
                this.f76849a = interestChoose;
            }

            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i7, KeyEvent keyEvent) {
                StateFlow<Integer> stateFlow2;
                InterestChoose interestChoose2 = this.f76849a;
                boolean z6 = false;
                if (i7 == 4) {
                    z6 = false;
                    if (keyEvent.getAction() == 1) {
                        InterestChooseV36PageViewModel interestChooseV36PageViewModel2 = c.f76850a;
                        int iIntValue = (interestChooseV36PageViewModel2 == null || (stateFlow2 = interestChooseV36PageViewModel2.f76866m) == null) ? 0 : ((Number) stateFlow2.getValue()).intValue();
                        if (iIntValue > 0) {
                            int iD = interestChoose2.D();
                            long jO = interestChoose2.O();
                            InterestPageReturnReason interestPageReturnReason = InterestPageReturnReason.GESTURE;
                            InterestPageType interestPageType = InterestPageType.INTEREST_2ND;
                            String strB = interestChoose2.B();
                            String str = strB;
                            if (strB == null) {
                                str = "";
                            }
                            com.bilibili.pegasus.components.interest.e.s(iD, jO, interestPageReturnReason, interestPageType, str);
                            InterestChooseV36PageViewModel interestChooseV36PageViewModel3 = c.f76850a;
                            if (interestChooseV36PageViewModel3 != null) {
                                interestChooseV36PageViewModel3.a(iIntValue - 1);
                            }
                            z6 = true;
                        } else {
                            InterestChooseV36PageViewModel interestChooseV36PageViewModel4 = c.f76850a;
                            z6 = false;
                            if (interestChooseV36PageViewModel4 != null) {
                                StateFlow<InterestChoose> stateFlow3 = interestChooseV36PageViewModel4.f76856b;
                                z6 = false;
                                if (stateFlow3 != null) {
                                    InterestChoose interestChoose3 = (InterestChoose) stateFlow3.getValue();
                                    z6 = false;
                                    if (interestChoose3 != null) {
                                        com.bilibili.pegasus.components.interest.e.e(interestChoose3.D(), interestChoose3.O(), InterestPageCloseReason.GESTURE, InterestPageType.INFO, interestChoose3.B());
                                        z6 = false;
                                    }
                                }
                            }
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
        C4828E c4828e = this.h;
        if (c4828e != null) {
            c4828e.f53692b.setOnClickListener(new View.OnClickListener(this) { // from class: com.bilibili.pegasus.components.interest.ui.v36.page.a

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final InterestChooseV36Dialog f76848a;

                {
                    this.f76848a = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    InterestChooseV36Dialog interestChooseV36Dialog = this.f76848a;
                    BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(interestChooseV36Dialog.getViewLifecycleOwner()), (CoroutineContext) null, (CoroutineStart) null, new InterestChooseV36Dialog$handleConfirmButtonClicked$1(interestChooseV36Dialog, null), 3, (Object) null);
                }
            });
        }
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(getViewLifecycleOwner()), (CoroutineContext) null, (CoroutineStart) null, new InterestChooseV36Dialog$initConfirmButton$2(this, null), 3, (Object) null);
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(getViewLifecycleOwner()), (CoroutineContext) null, (CoroutineStart) null, new InterestChooseV36Dialog$initConfirmButton$3(this, null), 3, (Object) null);
        C4828E c4828e2 = this.h;
        if (c4828e2 != null) {
            c4828e2.f53693c.setUserInputEnabled(false);
        }
        C4828E c4828e3 = this.h;
        if (c4828e3 != null) {
            c4828e3.f53693c.setAdapter(new FragmentStateAdapter(getChildFragmentManager(), getLifecycle()));
        }
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(getViewLifecycleOwner()), (CoroutineContext) null, (CoroutineStart) null, new InterestChooseV36Dialog$initPage$1(this, null), 3, (Object) null);
        InterestChooseV36PageViewModel interestChooseV36PageViewModel = c.f76850a;
        if (interestChooseV36PageViewModel != null && (stateFlow = interestChooseV36PageViewModel.f76856b) != null && (interestChoose = (InterestChoose) stateFlow.getValue()) != null) {
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
