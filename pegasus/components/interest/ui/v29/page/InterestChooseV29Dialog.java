package com.bilibili.pegasus.components.interest.ui.v29.page;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import aq0.C4872l0;
import com.bilibili.pegasus.components.interest.m;
import com.bilibili.pegasus.components.interest.ui.BaseInterestChooseDialog;
import com.bilibili.pegasus.components.interest.ui.v29.vm.InterestChooseV29PageViewModel;
import com.bilibili.pegasus.data.interestchoose.InterestChoose;
import com.bilibili.pegasus.data.interestchoose.InterestChooseAge;
import com.bilibili.pegasus.data.interestchoose.InterestChooseGender;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v29/page/InterestChooseV29Dialog.class */
@StabilityInferred(parameters = 0)
public final class InterestChooseV29Dialog extends BaseInterestChooseDialog {

    @Nullable
    public C4872l0 h;

    /* JADX INFO: renamed from: com.bilibili.pegasus.components.interest.ui.v29.page.InterestChooseV29Dialog$onViewCreated$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v29/page/InterestChooseV29Dialog$onViewCreated$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final InterestChooseV29Dialog this$0;

        /* JADX INFO: renamed from: com.bilibili.pegasus.components.interest.ui.v29.page.InterestChooseV29Dialog$onViewCreated$1$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v29/page/InterestChooseV29Dialog$onViewCreated$1$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final InterestChooseV29Dialog f76537a;

            public a(InterestChooseV29Dialog interestChooseV29Dialog) {
                this.f76537a = interestChooseV29Dialog;
            }

            public final Object emit(Object obj, Continuation continuation) {
                try {
                    InterestChooseV29Dialog interestChooseV29Dialog = this.f76537a;
                    interestChooseV29Dialog.f76373c = "three_point";
                    interestChooseV29Dialog.kc(null);
                } catch (Exception e7) {
                    BLog.w("InterestChooseV27Dialog", e7);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(InterestChooseV29Dialog interestChooseV29Dialog, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = interestChooseV29Dialog;
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
                InterestChooseV29PageViewModel interestChooseV29PageViewModel = b.f76540a;
                if (interestChooseV29PageViewModel == null || (sharedFlow = interestChooseV29PageViewModel.f76553f) == null) {
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
        InterestChooseV29PageViewModel interestChooseV29PageViewModel = new InterestChooseV29PageViewModel();
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
        interestChooseV29PageViewModel.f76548a.setValue(interestChooseA);
        b.f76540a = interestChooseV29PageViewModel;
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
        b.f76540a = null;
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
        Object next3;
        Object next4;
        StateFlow<InterestChoose> stateFlow;
        super.onDismiss(dialogInterface);
        InterestChooseV29PageViewModel interestChooseV29PageViewModel = b.f76540a;
        InterestChoose interestChoose = (interestChooseV29PageViewModel == null || (stateFlow = interestChooseV29PageViewModel.f76549b) == null) ? null : (InterestChoose) stateFlow.getValue();
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
                        next4 = null;
                        break;
                    } else {
                        next4 = it.next();
                        if (((InterestChooseGender) next4).f77411g) {
                            break;
                        }
                    }
                }
                interestChooseGender = (InterestChooseGender) next4;
            } else {
                interestChooseGender = null;
            }
            List<InterestChooseAge> listC = interestChoose.c();
            if (listC != null) {
                Iterator<T> it2 = listC.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next3 = null;
                        break;
                    } else {
                        next3 = it2.next();
                        if (((InterestChooseAge) next3).f77403e) {
                            break;
                        }
                    }
                }
                interestChooseAge = (InterestChooseAge) next3;
            } else {
                interestChooseAge = null;
            }
            InterestChooseV29PageViewModel interestChooseV29PageViewModel2 = b.f76540a;
            String strP = null;
            if (interestChooseV29PageViewModel2 != null) {
                InterestChoose interestChoose2 = (InterestChoose) interestChooseV29PageViewModel2.f76549b.getValue();
                if (interestChoose2 == null) {
                    strP = null;
                } else {
                    ArrayList arrayList = new ArrayList();
                    List<InterestChooseGender> listQ2 = interestChoose2.q();
                    if (listQ2 != null) {
                        Iterator<T> it3 = listQ2.iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                next2 = null;
                                break;
                            } else {
                                next2 = it3.next();
                                if (((InterestChooseGender) next2).f77411g) {
                                    break;
                                }
                            }
                        }
                        InterestChooseGender interestChooseGender2 = (InterestChooseGender) next2;
                        if (interestChooseGender2 != null) {
                            arrayList.add(String.valueOf(interestChooseGender2.getId()));
                        }
                    }
                    List<InterestChooseAge> listC2 = interestChoose2.c();
                    if (listC2 != null) {
                        Iterator<T> it4 = listC2.iterator();
                        do {
                            next = null;
                            if (!it4.hasNext()) {
                                break;
                            } else {
                                next = it4.next();
                            }
                        } while (!((InterestChooseAge) next).f77403e);
                        InterestChooseAge interestChooseAge2 = (InterestChooseAge) next;
                        if (interestChooseAge2 != null) {
                            arrayList.add(String.valueOf(interestChooseAge2.getId()));
                        }
                    }
                    strP = CollectionsKt.p(arrayList, ",", (CharSequence) null, (CharSequence) null, (Function1) null, 62);
                }
            }
            mVar.a(z6, new kp0.f(jO, null, null, interestChooseGender, interestChooseAge, strP, false, 66));
        }
        if (this.f76375e) {
            com.bilibili.pegasus.components.interest.e.f(this.f76373c, interestChoose.O(), interestChoose.D(), false, 16);
        }
        m8033if();
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0103  */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onViewCreated(@org.jetbrains.annotations.NotNull android.view.View r9, @org.jetbrains.annotations.Nullable android.os.Bundle r10) {
        /*
            Method dump skipped, instruction units count: 295
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.components.interest.ui.v29.page.InterestChooseV29Dialog.onViewCreated(android.view.View, android.os.Bundle):void");
    }
}
