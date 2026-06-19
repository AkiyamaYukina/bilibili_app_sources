package com.bilibili.pegasus.components.interest.ui.v37.page;

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
import aq0.C4839P;
import com.bilibili.app.comm.list.common.widget.PromoToast;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.app.screen.adjust.utils.ScreenAdjustUtilsKt;
import com.bilibili.lib.theme.R$color;
import com.bilibili.pegasus.components.interest.m;
import com.bilibili.pegasus.components.interest.ui.common.BaseBottomSheetInterestChooseDialog;
import com.bilibili.pegasus.components.interest.ui.reporter.InterestPageCloseReason;
import com.bilibili.pegasus.components.interest.ui.reporter.InterestPageType;
import com.bilibili.pegasus.components.interest.ui.v37.vm.InterestChooseV37PageViewModel;
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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v37/page/InterestChooseV37Dialog.class */
@StabilityInferred(parameters = 0)
public final class InterestChooseV37Dialog extends BaseBottomSheetInterestChooseDialog {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public C4839P f76881f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public InterestChooseV37ContainerDialog f76882g;

    /* JADX INFO: renamed from: com.bilibili.pegasus.components.interest.ui.v37.page.InterestChooseV37Dialog$onViewCreated$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v37/page/InterestChooseV37Dialog$onViewCreated$3.class */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final InterestChooseV37Dialog this$0;

        /* JADX INFO: renamed from: com.bilibili.pegasus.components.interest.ui.v37.page.InterestChooseV37Dialog$onViewCreated$3$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v37/page/InterestChooseV37Dialog$onViewCreated$3$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final InterestChooseV37Dialog f76885a;

            public a(InterestChooseV37Dialog interestChooseV37Dialog) {
                this.f76885a = interestChooseV37Dialog;
            }

            public final Object emit(Object obj, Continuation continuation) {
                StateFlow<InterestChoose> stateFlow;
                InterestChoose interestChoose;
                com.bilibili.pegasus.components.interest.ui.common.j jVar = (com.bilibili.pegasus.components.interest.ui.common.j) obj;
                InterestChooseV37Dialog interestChooseV37Dialog = this.f76885a;
                try {
                    InterestChooseV37PageViewModel interestChooseV37PageViewModel = j.f76896a;
                    if (interestChooseV37PageViewModel != null && (stateFlow = interestChooseV37PageViewModel.f76901b) != null && (interestChoose = (InterestChoose) stateFlow.getValue()) != null) {
                        com.bilibili.pegasus.components.interest.e.e(interestChoose.D(), interestChoose.O(), InterestPageCloseReason.THREE_POINT, jVar.f76397a, interestChoose.B());
                    }
                    interestChooseV37Dialog.getClass();
                    interestChooseV37Dialog.kc(null);
                } catch (Exception e7) {
                    BLog.w("[Interest]InterestChooseV37HalfDialog", e7);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(InterestChooseV37Dialog interestChooseV37Dialog, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.this$0 = interestChooseV37Dialog;
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
                InterestChooseV37PageViewModel interestChooseV37PageViewModel = j.f76896a;
                if (interestChooseV37PageViewModel == null || (sharedFlow = interestChooseV37PageViewModel.f76908j) == null) {
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

    /* JADX INFO: renamed from: com.bilibili.pegasus.components.interest.ui.v37.page.InterestChooseV37Dialog$onViewCreated$4, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v37/page/InterestChooseV37Dialog$onViewCreated$4.class */
    public static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final InterestChooseV37Dialog this$0;

        /* JADX INFO: renamed from: com.bilibili.pegasus.components.interest.ui.v37.page.InterestChooseV37Dialog$onViewCreated$4$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v37/page/InterestChooseV37Dialog$onViewCreated$4$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<Integer, Continuation<? super Unit>, Object> {
            int I$0;
            int label;
            final InterestChooseV37Dialog this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(InterestChooseV37Dialog interestChooseV37Dialog, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = interestChooseV37Dialog;
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

            /* JADX WARN: Type inference failed for: r0v24, types: [androidx.fragment.app.Fragment, com.bilibili.pegasus.components.interest.ui.v37.page.InterestChooseV37Dialog] */
            public final Object invokeSuspend(Object obj) {
                InterestChooseV37ContainerDialog interestChooseV37ContainerDialog;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                int i7 = this.I$0;
                if (i7 == 1 && ((interestChooseV37ContainerDialog = this.this$0.f76882g) == null || !interestChooseV37ContainerDialog.isAdded())) {
                    this.this$0.f76882g = new InterestChooseV37ContainerDialog();
                    ?? r02 = this.this$0;
                    InterestChooseV37ContainerDialog interestChooseV37ContainerDialog2 = r02.f76882g;
                    if (interestChooseV37ContainerDialog2 != null) {
                        interestChooseV37ContainerDialog2.show(r02.getChildFragmentManager(), "v38_second");
                    }
                } else if (i7 == 0) {
                    InterestChooseV37ContainerDialog interestChooseV37ContainerDialog3 = this.this$0.f76882g;
                    if (interestChooseV37ContainerDialog3 != null) {
                        interestChooseV37ContainerDialog3.dismissAllowingStateLoss();
                    }
                    this.this$0.f76882g = null;
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(InterestChooseV37Dialog interestChooseV37Dialog, Continuation<? super AnonymousClass4> continuation) {
            super(2, continuation);
            this.this$0 = interestChooseV37Dialog;
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
                InterestChooseV37PageViewModel interestChooseV37PageViewModel = j.f76896a;
                if (interestChooseV37PageViewModel != null && (stateFlow = interestChooseV37PageViewModel.f76916r) != null) {
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

    /* JADX INFO: renamed from: com.bilibili.pegasus.components.interest.ui.v37.page.InterestChooseV37Dialog$onViewCreated$5, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v37/page/InterestChooseV37Dialog$onViewCreated$5.class */
    public static final class AnonymousClass5 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final InterestChooseV37Dialog this$0;

        /* JADX INFO: renamed from: com.bilibili.pegasus.components.interest.ui.v37.page.InterestChooseV37Dialog$onViewCreated$5$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v37/page/InterestChooseV37Dialog$onViewCreated$5$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final InterestChooseV37Dialog f76886a;

            public a(InterestChooseV37Dialog interestChooseV37Dialog) {
                this.f76886a = interestChooseV37Dialog;
            }

            public final Object emit(Object obj, Continuation continuation) {
                int iIntValue = ((Number) obj).intValue();
                Context context = this.f76886a.getContext();
                if (context != null) {
                    StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                    PromoToast.showMidToast(context, String.format(context.getString(2131845232), Arrays.copyOf(new Object[]{String.valueOf(iIntValue)}, 1)), 2131243891, R$color.Text_white);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(InterestChooseV37Dialog interestChooseV37Dialog, Continuation<? super AnonymousClass5> continuation) {
            super(2, continuation);
            this.this$0 = interestChooseV37Dialog;
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
                InterestChooseV37PageViewModel interestChooseV37PageViewModel = j.f76896a;
                if (interestChooseV37PageViewModel == null || (sharedFlow = interestChooseV37PageViewModel.h) == null) {
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
        return ListExtentionsKt.toPx(379);
    }

    @Override // com.bilibili.pegasus.components.interest.ui.common.BaseBottomSheetInterestChooseDialog
    public final void jf() {
        StateFlow<InterestChoose> stateFlow;
        InterestChoose interestChoose;
        InterestChooseV37PageViewModel interestChooseV37PageViewModel = j.f76896a;
        if (interestChooseV37PageViewModel == null || (stateFlow = interestChooseV37PageViewModel.f76901b) == null || (interestChoose = (InterestChoose) stateFlow.getValue()) == null) {
            return;
        }
        com.bilibili.pegasus.components.interest.e.e(interestChoose.D(), interestChoose.O(), InterestPageCloseReason.BLANK_CLICK, InterestPageType.INFO, interestChoose.B());
    }

    @Override // com.bilibili.pegasus.components.interest.ui.common.BaseBottomSheetInterestChooseDialog
    public final void kf() {
        StateFlow<InterestChoose> stateFlow;
        InterestChoose interestChoose;
        InterestChooseV37PageViewModel interestChooseV37PageViewModel = j.f76896a;
        if (interestChooseV37PageViewModel == null || (stateFlow = interestChooseV37PageViewModel.f76901b) == null || (interestChoose = (InterestChoose) stateFlow.getValue()) == null) {
            return;
        }
        com.bilibili.pegasus.components.interest.e.e(interestChoose.D(), interestChoose.O(), InterestPageCloseReason.BAR_PULLDOWN, InterestPageType.INFO, interestChoose.B());
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0261  */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, java.util.Comparator] */
    @Override // com.bilibili.pegasus.components.interest.ui.common.BaseBottomSheetInterestChooseDialog
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCreate(@org.jetbrains.annotations.Nullable android.os.Bundle r23) {
        /*
            Method dump skipped, instruction units count: 696
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.components.interest.ui.v37.page.InterestChooseV37Dialog.onCreate(android.os.Bundle):void");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C4839P c4839pInflate = C4839P.inflate(layoutInflater);
        this.f76881f = c4839pInflate;
        return c4839pInflate.f53802a;
    }

    @Override // com.bilibili.pegasus.components.interest.ui.common.BaseBottomSheetInterestChooseDialog
    public final void onDestroy() {
        super.onDestroy();
        j.f76896a = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onDismiss(@NotNull DialogInterface dialogInterface) {
        List<InterestChooseGender> listQ;
        Object next;
        InterestChooseGender interestChooseGender;
        List<InterestChooseAge> listC;
        Object next2;
        InterestChooseAge interestChooseAge;
        InterestChooseV37PageViewModel interestChooseV37PageViewModel;
        String strP;
        StateFlow<Integer> stateFlow;
        StateFlow<InterestChoose> stateFlow2;
        super/*androidx.fragment.app.DialogFragment*/.onDismiss(dialogInterface);
        InterestChooseV37PageViewModel interestChooseV37PageViewModel2 = j.f76896a;
        InterestChoose interestChoose = (interestChooseV37PageViewModel2 == null || (stateFlow2 = interestChooseV37PageViewModel2.f76901b) == null) ? null : (InterestChoose) stateFlow2.getValue();
        if (interestChoose == null) {
            lf();
            return;
        }
        InterestChooseV37PageViewModel interestChooseV37PageViewModel3 = j.f76896a;
        Integer num = (interestChooseV37PageViewModel3 == null || (stateFlow = interestChooseV37PageViewModel3.f76916r) == null) ? null : (Integer) stateFlow.getValue();
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
            String strA = (this.f76385d && (interestChooseV37PageViewModel = j.f76896a) != null) ? interestChooseV37PageViewModel.a() : null;
            if (this.f76385d) {
                InterestChooseV37PageViewModel interestChooseV37PageViewModel4 = j.f76896a;
                strP = null;
                if (interestChooseV37PageViewModel4 != null) {
                    InterestChoose interestChoose2 = (InterestChoose) interestChooseV37PageViewModel4.f76902c.getValue();
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
    /* JADX WARN: Type inference failed for: r1v15, types: [android.view.View$OnClickListener, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v7, types: [com.bilibili.pegasus.components.interest.ui.v37.page.e] */
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
        final InterestChoose interestChoose;
        super.onViewCreated(view, bundle);
        FragmentActivity fragmentActivityP3 = p3();
        if (fragmentActivityP3 != null) {
            ScreenAdjustUtilsKt.collectWindowSize$default(fragmentActivityP3, false, new Zy.e(this, 4), 1, (Object) null);
        }
        InterestChooseV37PageViewModel interestChooseV37PageViewModel = j.f76896a;
        if (interestChooseV37PageViewModel != null && (stateFlow = interestChooseV37PageViewModel.f76901b) != null && (interestChoose = (InterestChoose) stateFlow.getValue()) != null) {
            int iD = interestChoose.D();
            long jO = interestChoose.O();
            String strB = interestChoose.B();
            String str = strB;
            if (strB == null) {
                str = "";
            }
            com.bilibili.pegasus.components.interest.e.g(iD, jO, str);
            C4839P c4839p = this.f76881f;
            if (c4839p != null) {
                c4839p.f53806e.setText(interestChoose.getTitle());
            }
            C4839P c4839p2 = this.f76881f;
            if (c4839p2 != null) {
                c4839p2.f53803b.setOnClickListener(new Object());
            }
            BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(getViewLifecycleOwner()), (CoroutineContext) null, (CoroutineStart) null, new InterestChooseV37Dialog$initConfirmButton$2(this, null), 3, (Object) null);
            BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(getViewLifecycleOwner()), (CoroutineContext) null, (CoroutineStart) null, new InterestChooseV37Dialog$initConfirmButton$3(null), 3, (Object) null);
            BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(getViewLifecycleOwner()), (CoroutineContext) null, (CoroutineStart) null, new InterestChooseV37Dialog$initConfirmButton$4(this, null), 3, (Object) null);
            C4839P c4839p3 = this.f76881f;
            if (c4839p3 != null) {
                c4839p3.f53805d.setItemAnimator(null);
            }
            C4839P c4839p4 = this.f76881f;
            if (c4839p4 != null) {
                c4839p4.f53805d.addItemDecoration(new RecyclerView.ItemDecoration());
            }
            C4839P c4839p5 = this.f76881f;
            if (c4839p5 != null) {
                RecyclerView recyclerView = c4839p5.f53805d;
                GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 2);
                gridLayoutManager.setSpanSizeLookup(new i(this));
                recyclerView.setLayoutManager(gridLayoutManager);
            }
            C4839P c4839p6 = this.f76881f;
            if (c4839p6 != null) {
                c4839p6.f53805d.setAdapter(new Wo0.d(new Function1(this, interestChoose) { // from class: com.bilibili.pegasus.components.interest.ui.v37.page.e

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final InterestChooseV37Dialog f76893a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final InterestChoose f76894b;

                    {
                        this.f76893a = this;
                        this.f76894b = interestChoose;
                    }

                    public final Object invoke(Object obj) {
                        List<InterestChooseAge> listC;
                        List<InterestChooseGender> listQ;
                        this.f76893a.getClass();
                        boolean z6 = obj instanceof InterestChooseGender;
                        InterestChoose interestChoose2 = this.f76894b;
                        if (z6) {
                            InterestChooseGender interestChooseGender = (InterestChooseGender) obj;
                            if (!interestChooseGender.f77411g) {
                                com.bilibili.pegasus.components.interest.e.h(interestChoose2.D(), interestChooseGender.f77410f + 1, interestChoose2.O(), interestChooseGender.getId(), interestChoose2.o(), interestChooseGender.getTitle(), interestChoose2.B());
                                InterestChooseV37PageViewModel interestChooseV37PageViewModel2 = j.f76896a;
                                if (interestChooseV37PageViewModel2 != null) {
                                    MutableStateFlow<InterestChoose> mutableStateFlow = interestChooseV37PageViewModel2.f76900a;
                                    InterestChoose interestChoose3 = (InterestChoose) mutableStateFlow.getValue();
                                    if (interestChoose3 != null && (listQ = interestChoose3.q()) != null) {
                                        InterestChoose interestChoose4 = (InterestChoose) mutableStateFlow.getValue();
                                        InterestChoose interestChooseA = null;
                                        if (interestChoose4 != null) {
                                            List mutableList = CollectionsKt.toMutableList(listQ);
                                            int i7 = 0;
                                            for (Object obj2 : mutableList) {
                                                if (i7 < 0) {
                                                    CollectionsKt.throwIndexOverflow();
                                                }
                                                InterestChooseGender interestChooseGender2 = (InterestChooseGender) obj2;
                                                mutableList.set(i7, InterestChooseGender.a(interestChooseGender2, null, 0, interestChooseGender2.f77410f == interestChooseGender.f77410f, 191));
                                                i7++;
                                            }
                                            Unit unit = Unit.INSTANCE;
                                            interestChooseA = InterestChoose.a(interestChoose4, null, mutableList, null, 536870847);
                                        }
                                        mutableStateFlow.setValue(interestChooseA);
                                    }
                                }
                            }
                        } else if (obj instanceof InterestChooseAge) {
                            InterestChooseAge interestChooseAge = (InterestChooseAge) obj;
                            if (!interestChooseAge.f77403e) {
                                com.bilibili.pegasus.components.interest.e.h(interestChoose2.D(), interestChooseAge.f77402d + 1, interestChoose2.O(), interestChooseAge.getId(), interestChoose2.b(), interestChooseAge.getTitle(), com.bilibili.pegasus.request.b.g() ? "1" : "2");
                                InterestChooseV37PageViewModel interestChooseV37PageViewModel3 = j.f76896a;
                                if (interestChooseV37PageViewModel3 != null) {
                                    MutableStateFlow<InterestChoose> mutableStateFlow2 = interestChooseV37PageViewModel3.f76900a;
                                    InterestChoose interestChoose5 = (InterestChoose) mutableStateFlow2.getValue();
                                    if (interestChoose5 != null && (listC = interestChoose5.c()) != null) {
                                        InterestChoose interestChoose6 = (InterestChoose) mutableStateFlow2.getValue();
                                        InterestChoose interestChooseA2 = null;
                                        if (interestChoose6 != null) {
                                            List mutableList2 = CollectionsKt.toMutableList(listC);
                                            int i8 = 0;
                                            for (Object obj3 : mutableList2) {
                                                if (i8 < 0) {
                                                    CollectionsKt.throwIndexOverflow();
                                                }
                                                InterestChooseAge interestChooseAge2 = (InterestChooseAge) obj3;
                                                mutableList2.set(i8, InterestChooseAge.a(interestChooseAge2, 0, interestChooseAge.f77402d == interestChooseAge2.f77402d, 47));
                                                i8++;
                                            }
                                            Unit unit2 = Unit.INSTANCE;
                                            interestChooseA2 = InterestChoose.a(interestChoose6, null, null, mutableList2, 536870783);
                                        }
                                        mutableStateFlow2.setValue(interestChooseA2);
                                    }
                                }
                            }
                        }
                        return Unit.INSTANCE;
                    }
                }, new com.bilibili.campus.detail.e(1, this, interestChoose)));
            }
            BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(getViewLifecycleOwner()), (CoroutineContext) null, (CoroutineStart) null, new InterestChooseV37Dialog$initRv$5(this, null), 3, (Object) null);
        }
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(getViewLifecycleOwner()), (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass3(this, null), 3, (Object) null);
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(getViewLifecycleOwner()), (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass4(this, null), 3, (Object) null);
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(getViewLifecycleOwner()), (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass5(this, null), 3, (Object) null);
    }
}
