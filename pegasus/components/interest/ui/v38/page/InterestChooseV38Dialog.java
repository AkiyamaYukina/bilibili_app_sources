package com.bilibili.pegasus.components.interest.ui.v38.page;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import aq0.C4833J;
import com.bilibili.app.comm.list.common.widget.PromoToast;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.app.screen.adjust.utils.ScreenAdjustUtilsKt;
import com.bilibili.biligame.ui.feed.panel.I;
import com.bilibili.biligame.ui.feed.panel.J;
import com.bilibili.lib.theme.R$color;
import com.bilibili.pegasus.components.interest.m;
import com.bilibili.pegasus.components.interest.ui.common.BaseBottomSheetInterestChooseDialog;
import com.bilibili.pegasus.components.interest.ui.reporter.InterestPageCloseReason;
import com.bilibili.pegasus.components.interest.ui.reporter.InterestPageType;
import com.bilibili.pegasus.components.interest.ui.v38.vm.InterestChooseV38PageViewModel;
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
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v38/page/InterestChooseV38Dialog.class */
@StabilityInferred(parameters = 0)
public final class InterestChooseV38Dialog extends BaseBottomSheetInterestChooseDialog {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public C4833J f76930f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public InterestChooseV38SecondPageDialog f76931g;

    /* JADX INFO: renamed from: com.bilibili.pegasus.components.interest.ui.v38.page.InterestChooseV38Dialog$onViewCreated$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v38/page/InterestChooseV38Dialog$onViewCreated$3.class */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final InterestChooseV38Dialog this$0;

        /* JADX INFO: renamed from: com.bilibili.pegasus.components.interest.ui.v38.page.InterestChooseV38Dialog$onViewCreated$3$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v38/page/InterestChooseV38Dialog$onViewCreated$3$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final InterestChooseV38Dialog f76932a;

            public a(InterestChooseV38Dialog interestChooseV38Dialog) {
                this.f76932a = interestChooseV38Dialog;
            }

            public final Object emit(Object obj, Continuation continuation) {
                StateFlow<InterestChoose> stateFlow;
                InterestChoose interestChoose;
                com.bilibili.pegasus.components.interest.ui.common.j jVar = (com.bilibili.pegasus.components.interest.ui.common.j) obj;
                InterestChooseV38Dialog interestChooseV38Dialog = this.f76932a;
                try {
                    InterestChooseV38PageViewModel interestChooseV38PageViewModel = d.f76936a;
                    if (interestChooseV38PageViewModel != null && (stateFlow = interestChooseV38PageViewModel.f76946b) != null && (interestChoose = (InterestChoose) stateFlow.getValue()) != null) {
                        int iD = interestChoose.D();
                        long jO = interestChoose.O();
                        InterestPageCloseReason interestPageCloseReason = InterestPageCloseReason.THREE_POINT;
                        InterestPageType interestPageType = jVar.f76397a;
                        String strB = interestChoose.B();
                        String str = strB;
                        if (strB == null) {
                            str = "";
                        }
                        com.bilibili.pegasus.components.interest.e.e(iD, jO, interestPageCloseReason, interestPageType, str);
                    }
                    interestChooseV38Dialog.getClass();
                    interestChooseV38Dialog.kc(null);
                } catch (Exception e7) {
                    BLog.w("[Interest]InterestChooseV38HalfDialog", e7);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(InterestChooseV38Dialog interestChooseV38Dialog, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.this$0 = interestChooseV38Dialog;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass3(this.this$0, continuation);
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
                InterestChooseV38PageViewModel interestChooseV38PageViewModel = d.f76936a;
                if (interestChooseV38PageViewModel == null || (sharedFlow = interestChooseV38PageViewModel.h) == null) {
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

    /* JADX INFO: renamed from: com.bilibili.pegasus.components.interest.ui.v38.page.InterestChooseV38Dialog$onViewCreated$4, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v38/page/InterestChooseV38Dialog$onViewCreated$4.class */
    public static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final InterestChooseV38Dialog this$0;

        /* JADX INFO: renamed from: com.bilibili.pegasus.components.interest.ui.v38.page.InterestChooseV38Dialog$onViewCreated$4$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v38/page/InterestChooseV38Dialog$onViewCreated$4$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<Integer, Continuation<? super Unit>, Object> {
            int I$0;
            int label;
            final InterestChooseV38Dialog this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(InterestChooseV38Dialog interestChooseV38Dialog, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = interestChooseV38Dialog;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.I$0 = ((Number) obj).intValue();
                return anonymousClass1;
            }

            public final Object invoke(int i7, Continuation<? super Unit> continuation) {
                return create(Integer.valueOf(i7), continuation).invokeSuspend(Unit.INSTANCE);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke(((Number) obj).intValue(), (Continuation<? super Unit>) obj2);
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [androidx.fragment.app.Fragment, com.bilibili.pegasus.components.interest.ui.v38.page.InterestChooseV38Dialog] */
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                if (this.I$0 == 1) {
                    this.this$0.f76931g = new InterestChooseV38SecondPageDialog();
                    ?? r02 = this.this$0;
                    InterestChooseV38SecondPageDialog interestChooseV38SecondPageDialog = r02.f76931g;
                    if (interestChooseV38SecondPageDialog != null) {
                        interestChooseV38SecondPageDialog.show(r02.getChildFragmentManager(), "v37_second");
                    }
                } else {
                    InterestChooseV38SecondPageDialog interestChooseV38SecondPageDialog2 = this.this$0.f76931g;
                    if (interestChooseV38SecondPageDialog2 != null) {
                        interestChooseV38SecondPageDialog2.dismissAllowingStateLoss();
                    }
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(InterestChooseV38Dialog interestChooseV38Dialog, Continuation<? super AnonymousClass4> continuation) {
            super(2, continuation);
            this.this$0 = interestChooseV38Dialog;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass4(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            StateFlow<Integer> stateFlow;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                InterestChooseV38PageViewModel interestChooseV38PageViewModel = d.f76936a;
                if (interestChooseV38PageViewModel != null && (stateFlow = interestChooseV38PageViewModel.f76958o) != null) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(stateFlow, anonymousClass1, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.pegasus.components.interest.ui.v38.page.InterestChooseV38Dialog$onViewCreated$5, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v38/page/InterestChooseV38Dialog$onViewCreated$5.class */
    public static final class AnonymousClass5 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final InterestChooseV38Dialog this$0;

        /* JADX INFO: renamed from: com.bilibili.pegasus.components.interest.ui.v38.page.InterestChooseV38Dialog$onViewCreated$5$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v38/page/InterestChooseV38Dialog$onViewCreated$5$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final InterestChooseV38Dialog f76933a;

            public a(InterestChooseV38Dialog interestChooseV38Dialog) {
                this.f76933a = interestChooseV38Dialog;
            }

            public final Object emit(Object obj, Continuation continuation) {
                int iIntValue = ((Number) obj).intValue();
                Context context = this.f76933a.getContext();
                if (context != null) {
                    StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                    PromoToast.showMidToast(context, String.format(context.getString(2131845232), Arrays.copyOf(new Object[]{String.valueOf(iIntValue)}, 1)), 2131243891, R$color.Text_white);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(InterestChooseV38Dialog interestChooseV38Dialog, Continuation<? super AnonymousClass5> continuation) {
            super(2, continuation);
            this.this$0 = interestChooseV38Dialog;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass5(this.this$0, continuation);
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
                InterestChooseV38PageViewModel interestChooseV38PageViewModel = d.f76936a;
                if (interestChooseV38PageViewModel == null || (sharedFlow = interestChooseV38PageViewModel.f76950f) == null) {
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

    @Override // com.bilibili.pegasus.components.interest.ui.common.BaseBottomSheetInterestChooseDialog
    /* JADX INFO: renamed from: if */
    public final int mo8035if() {
        return ListExtentionsKt.toPx(357);
    }

    @Override // com.bilibili.pegasus.components.interest.ui.common.BaseBottomSheetInterestChooseDialog
    public final void jf() {
        StateFlow<InterestChoose> stateFlow;
        InterestChoose interestChoose;
        InterestChooseV38PageViewModel interestChooseV38PageViewModel = d.f76936a;
        if (interestChooseV38PageViewModel == null || (stateFlow = interestChooseV38PageViewModel.f76946b) == null || (interestChoose = (InterestChoose) stateFlow.getValue()) == null) {
            return;
        }
        int iD = interestChoose.D();
        long jO = interestChoose.O();
        InterestPageCloseReason interestPageCloseReason = InterestPageCloseReason.BLANK_CLICK;
        InterestPageType interestPageType = InterestPageType.INTEREST_1ST;
        String strB = interestChoose.B();
        String str = strB;
        if (strB == null) {
            str = "";
        }
        com.bilibili.pegasus.components.interest.e.e(iD, jO, interestPageCloseReason, interestPageType, str);
    }

    @Override // com.bilibili.pegasus.components.interest.ui.common.BaseBottomSheetInterestChooseDialog
    public final void kf() {
        StateFlow<InterestChoose> stateFlow;
        InterestChoose interestChoose;
        InterestChooseV38PageViewModel interestChooseV38PageViewModel = d.f76936a;
        if (interestChooseV38PageViewModel == null || (stateFlow = interestChooseV38PageViewModel.f76946b) == null || (interestChoose = (InterestChoose) stateFlow.getValue()) == null) {
            return;
        }
        int iD = interestChoose.D();
        long jO = interestChoose.O();
        InterestPageCloseReason interestPageCloseReason = InterestPageCloseReason.BAR_PULLDOWN;
        InterestPageType interestPageType = InterestPageType.INTEREST_1ST;
        String strB = interestChoose.B();
        String str = strB;
        if (strB == null) {
            str = "";
        }
        com.bilibili.pegasus.components.interest.e.e(iD, jO, interestPageCloseReason, interestPageType, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x012f  */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, java.util.Comparator] */
    @Override // com.bilibili.pegasus.components.interest.ui.common.BaseBottomSheetInterestChooseDialog
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCreate(@org.jetbrains.annotations.Nullable android.os.Bundle r23) {
        /*
            Method dump skipped, instruction units count: 382
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.components.interest.ui.v38.page.InterestChooseV38Dialog.onCreate(android.os.Bundle):void");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C4833J c4833jInflate = C4833J.inflate(layoutInflater);
        this.f76930f = c4833jInflate;
        return c4833jInflate.f53719a;
    }

    @Override // com.bilibili.pegasus.components.interest.ui.common.BaseBottomSheetInterestChooseDialog
    public final void onDestroy() {
        super.onDestroy();
        d.f76936a = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onDismiss(@NotNull DialogInterface dialogInterface) {
        List<InterestChooseGender> listQ;
        Object next;
        InterestChooseGender interestChooseGender;
        List<InterestChooseAge> listC;
        Object next2;
        InterestChooseAge interestChooseAge;
        InterestChooseV38PageViewModel interestChooseV38PageViewModel;
        String strP;
        String str;
        String strP2;
        StateFlow<Integer> stateFlow;
        StateFlow<InterestChoose> stateFlow2;
        super/*androidx.fragment.app.DialogFragment*/.onDismiss(dialogInterface);
        InterestChooseV38PageViewModel interestChooseV38PageViewModel2 = d.f76936a;
        InterestChoose interestChoose = (interestChooseV38PageViewModel2 == null || (stateFlow2 = interestChooseV38PageViewModel2.f76946b) == null) ? null : (InterestChoose) stateFlow2.getValue();
        if (interestChoose == null) {
            lf();
            return;
        }
        InterestChooseV38PageViewModel interestChooseV38PageViewModel3 = d.f76936a;
        Integer num = (interestChooseV38PageViewModel3 == null || (stateFlow = interestChooseV38PageViewModel3.f76958o) == null) ? null : (Integer) stateFlow.getValue();
        m mVar = this.f76383b;
        if (mVar != null) {
            boolean z6 = this.f76385d;
            long jO = interestChoose.O();
            if ((this.f76385d || num == null || num.intValue() != 0) && (listQ = interestChoose.q()) != null) {
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
            if ((this.f76385d || num == null || num.intValue() != 0) && (listC = interestChoose.c()) != null) {
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
            if (this.f76385d && (interestChooseV38PageViewModel = d.f76936a) != null) {
                MutableStateFlow<InterestChoose> mutableStateFlow = interestChooseV38PageViewModel.f76945a;
                if (((InterestChoose) mutableStateFlow.getValue()) == null) {
                    strP = null;
                } else {
                    InterestChoose interestChoose2 = (InterestChoose) mutableStateFlow.getValue();
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
                                    Iterator it3 = arrayList3.iterator();
                                    while (it3.hasNext()) {
                                        V0.f.b(interestChooseItem.getId(), UtilsKt.DOT, ((InterestChooseSubItem) it3.next()).i(), arrayList);
                                    }
                                }
                            }
                        }
                    }
                    strP = CollectionsKt.p(arrayList, ",", (CharSequence) null, (CharSequence) null, (Function1) null, 62);
                }
                str = strP;
            } else {
                str = null;
            }
            if (this.f76385d) {
                InterestChooseV38PageViewModel interestChooseV38PageViewModel4 = d.f76936a;
                strP2 = null;
                if (interestChooseV38PageViewModel4 != null) {
                    InterestChoose interestChoose3 = (InterestChoose) interestChooseV38PageViewModel4.f76945a.getValue();
                    strP2 = null;
                    if (interestChoose3 != null) {
                        List<InterestChooseItem> listU2 = interestChoose3.u();
                        if (listU2 == null) {
                            strP2 = null;
                        } else {
                            ArrayList arrayList4 = new ArrayList();
                            Iterator it4 = listU2.iterator();
                            while (it4.hasNext()) {
                                InterestChooseItem interestChooseItem2 = (InterestChooseItem) it4.next();
                                List<InterestChooseSubItem> subItems3 = interestChooseItem2.getSubItems();
                                if (subItems3 == null || subItems3.isEmpty()) {
                                    arrayList4.add(String.valueOf(interestChooseItem2.getId()));
                                } else {
                                    List<InterestChooseSubItem> subItems4 = interestChooseItem2.getSubItems();
                                    Iterator it5 = it4;
                                    if (subItems4 != null) {
                                        Iterator<T> it6 = subItems4.iterator();
                                        while (true) {
                                            it5 = it4;
                                            if (!it6.hasNext()) {
                                                break;
                                            } else {
                                                V0.f.b(interestChooseItem2.getId(), UtilsKt.DOT, ((InterestChooseSubItem) it6.next()).i(), arrayList4);
                                            }
                                        }
                                    }
                                    it4 = it5;
                                }
                            }
                            strP2 = CollectionsKt.p(arrayList4, ",", (CharSequence) null, (CharSequence) null, (Function1) null, 62);
                        }
                    }
                }
            } else {
                strP2 = null;
            }
            mVar.a(z6, new kp0.f(jO, null, strP2, interestChooseGender, interestChooseAge, str, true, 2));
        }
        lf();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [android.content.DialogInterface$OnKeyListener, java.lang.Object] */
    @Override // com.bilibili.pegasus.components.interest.ui.common.BaseBottomSheetInterestChooseDialog
    public final void onStart() {
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog != 0) {
            dialog.setOnKeyListener(new Object());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v13, types: [android.view.View$OnClickListener, java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.bilibili.pegasus.components.interest.ui.common.BaseBottomSheetInterestChooseDialog
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        StateFlow<InterestChoose> stateFlow;
        InterestChoose interestChoose;
        super.onViewCreated(view, bundle);
        FragmentActivity fragmentActivityP3 = p3();
        if (fragmentActivityP3 != null) {
            ScreenAdjustUtilsKt.collectWindowSize$default(fragmentActivityP3, false, new Ie.d(this, 1), 1, (Object) null);
        }
        InterestChooseV38PageViewModel interestChooseV38PageViewModel = d.f76936a;
        if (interestChooseV38PageViewModel != null && (stateFlow = interestChooseV38PageViewModel.f76946b) != null && (interestChoose = (InterestChoose) stateFlow.getValue()) != null) {
            int iD = interestChoose.D();
            long jO = interestChoose.O();
            String strB = interestChoose.B();
            String str = strB;
            if (strB == null) {
                str = "";
            }
            com.bilibili.pegasus.components.interest.e.g(iD, jO, str);
            C4833J c4833j = this.f76930f;
            if (c4833j != null) {
                c4833j.f53723e.setText(interestChoose.getTitle());
            }
            C4833J c4833j2 = this.f76930f;
            if (c4833j2 != null) {
                c4833j2.f53720b.setOnClickListener(new Object());
            }
            BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(getViewLifecycleOwner()), (CoroutineContext) null, (CoroutineStart) null, new InterestChooseV38Dialog$initConfirmButton$2(this, null), 3, (Object) null);
            BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(getViewLifecycleOwner()), (CoroutineContext) null, (CoroutineStart) null, new InterestChooseV38Dialog$initConfirmButton$3(null), 3, (Object) null);
            BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(getViewLifecycleOwner()), (CoroutineContext) null, (CoroutineStart) null, new InterestChooseV38Dialog$initConfirmButton$4(this, null), 3, (Object) null);
        }
        C4833J c4833j3 = this.f76930f;
        if (c4833j3 != null) {
            c4833j3.f53722d.setItemAnimator(null);
        }
        C4833J c4833j4 = this.f76930f;
        if (c4833j4 != null) {
            c4833j4.f53722d.addItemDecoration(new RecyclerView.ItemDecoration());
        }
        C4833J c4833j5 = this.f76930f;
        if (c4833j5 != null) {
            c4833j5.f53722d.setLayoutManager(new GridLayoutManager(getContext(), 2));
        }
        C4833J c4833j6 = this.f76930f;
        if (c4833j6 != null) {
            c4833j6.f53722d.setAdapter(new Yo0.g(new I(this, 3), new J(this, 4)));
        }
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(getViewLifecycleOwner()), (CoroutineContext) null, (CoroutineStart) null, new InterestChooseV38Dialog$initRv$4(this, null), 3, (Object) null);
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(getViewLifecycleOwner()), (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass3(this, null), 3, (Object) null);
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(getViewLifecycleOwner()), (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass4(this, null), 3, (Object) null);
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(getViewLifecycleOwner()), (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass5(this, null), 3, (Object) null);
    }
}
