package com.bilibili.pegasus.components.interest.ui.v35.page;

import com.bilibili.okretro.BiliApiDataCallback;
import com.bilibili.pegasus.components.interest.ui.v35.vm.InterestChooseV35PageViewModel;
import com.bilibili.pegasus.data.interestchoose.InterestChoose;
import com.bilibili.pegasus.data.interestchoose.InterestChooseItem;
import com.bilibili.pegasus.data.interestchoose.InterestChooseSubItem;
import com.bilibili.studio.material.util.UtilsKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kp0.C7779b;
import kp0.C7782e;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v35/page/InterestChooseV35Dialog$handleConfirmButtonClicked$1.class */
final class InterestChooseV35Dialog$handleConfirmButtonClicked$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final InterestChooseV35Dialog this$0;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v35/page/InterestChooseV35Dialog$handleConfirmButtonClicked$1$a.class */
    public static final class a extends BiliApiDataCallback<C7782e> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final InterestChoose f76795b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final InterestChooseV35Dialog f76796c;

        public a(InterestChoose interestChoose, InterestChooseV35Dialog interestChooseV35Dialog) {
            this.f76795b = interestChoose;
            this.f76796c = interestChooseV35Dialog;
        }

        /* JADX WARN: Removed duplicated region for block: B:32:0x00b6  */
        @Override // com.bilibili.okretro.BiliApiDataCallback
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void onDataSuccess(kp0.C7782e r8) {
            /*
                Method dump skipped, instruction units count: 204
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.components.interest.ui.v35.page.InterestChooseV35Dialog$handleConfirmButtonClicked$1.a.onDataSuccess(java.lang.Object):void");
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0037  */
        @Override // com.bilibili.okretro.BiliApiCallback
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void onError(java.lang.Throwable r8) {
            /*
                r7 = this;
                com.bilibili.pegasus.components.interest.ui.v35.vm.InterestChooseV35PageViewModel r0 = com.bilibili.pegasus.components.interest.ui.v35.page.c.f76804a
                r10 = r0
                r0 = r10
                if (r0 == 0) goto Ld
                r0 = r10
                r1 = 1
                r0.b(r1)
            Ld:
                com.bilibili.pegasus.components.interest.ui.v35.vm.InterestChooseV35PageViewModel r0 = com.bilibili.pegasus.components.interest.ui.v35.page.c.f76804a
                r10 = r0
                r0 = r7
                com.bilibili.pegasus.data.interestchoose.InterestChoose r0 = r0.f76795b
                r13 = r0
                r0 = r10
                if (r0 == 0) goto L21
                r0 = r10
                r1 = r13
                r0.c(r1)
            L21:
                java.lang.String r0 = ""
                r11 = r0
                r0 = r8
                if (r0 == 0) goto L37
                r0 = r8
                java.lang.String r0 = r0.getMessage()
                r12 = r0
                r0 = r12
                r10 = r0
                r0 = r12
                if (r0 != 0) goto L3a
            L37:
                java.lang.String r0 = ""
                r10 = r0
            L3a:
                r0 = r8
                boolean r0 = r0 instanceof com.bilibili.api.BiliApiException
                if (r0 == 0) goto L5d
                r0 = r8
                com.bilibili.api.BiliApiException r0 = (com.bilibili.api.BiliApiException) r0
                r8 = r0
                r0 = r8
                int r0 = r0.mCode
                r9 = r0
                r0 = r8
                java.lang.String r0 = r0.getMessage()
                r8 = r0
                r0 = r8
                if (r0 != 0) goto L5a
                r0 = r11
                r8 = r0
                goto L5a
            L5a:
                goto L7a
            L5d:
                r0 = r8
                boolean r0 = r0 instanceof retrofit2.HttpException
                if (r0 == 0) goto L76
                r0 = r8
                retrofit2.HttpException r0 = (retrofit2.HttpException) r0
                r8 = r0
                r0 = r8
                int r0 = r0.code()
                r9 = r0
                r0 = r8
                java.lang.String r0 = r0.message()
                r8 = r0
                goto L5a
            L76:
                r0 = -1
                r9 = r0
                r0 = r10
                r8 = r0
            L7a:
                r0 = r13
                int r0 = r0.D()
                r1 = r13
                long r1 = r1.O()
                r2 = r9
                r3 = r8
                r4 = r13
                java.lang.String r4 = r4.B()
                com.bilibili.pegasus.components.interest.e.t(r0, r1, r2, r3, r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.components.interest.ui.v35.page.InterestChooseV35Dialog$handleConfirmButtonClicked$1.a.onError(java.lang.Throwable):void");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InterestChooseV35Dialog$handleConfirmButtonClicked$1(InterestChooseV35Dialog interestChooseV35Dialog, Continuation<? super InterestChooseV35Dialog$handleConfirmButtonClicked$1> continuation) {
        super(2, continuation);
        this.this$0 = interestChooseV35Dialog;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InterestChooseV35Dialog$handleConfirmButtonClicked$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Flow<C7779b> flow;
        StateFlow<InterestChoose> stateFlow;
        InterestChoose interestChoose;
        InterestChooseV35PageViewModel interestChooseV35PageViewModel;
        ArrayList arrayList;
        StateFlow<InterestChoose> stateFlow2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            InterestChooseV35PageViewModel interestChooseV35PageViewModel2 = c.f76804a;
            if (interestChooseV35PageViewModel2 != null && (flow = interestChooseV35PageViewModel2.f76832r) != null) {
                this.label = 1;
                Object objFirst = FlowKt.first(flow, this);
                obj = objFirst;
                if (objFirst == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
        if (i7 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        C7779b c7779b = (C7779b) obj;
        if (c7779b != null) {
            InterestChooseV35PageViewModel interestChooseV35PageViewModel3 = c.f76804a;
            if (interestChooseV35PageViewModel3 == null || (stateFlow = interestChooseV35PageViewModel3.f76817b) == null || (interestChoose = (InterestChoose) stateFlow.getValue()) == null) {
                return Unit.INSTANCE;
            }
            InterestChooseV35PageViewModel interestChooseV35PageViewModel4 = c.f76804a;
            InterestChoose interestChoose2 = (interestChooseV35PageViewModel4 == null || (stateFlow2 = interestChooseV35PageViewModel4.f76819d) == null) ? null : (InterestChoose) stateFlow2.getValue();
            boolean z6 = c7779b.f122928b;
            int i8 = c7779b.f122931e;
            if (!z6) {
                boolean z7 = c7779b.f122929c;
                if (i8 == 0 && z7) {
                    long jO = interestChoose.O();
                    InterestChooseV35PageViewModel interestChooseV35PageViewModel5 = c.f76804a;
                    com.bilibili.pegasus.request.b.e(jO, interestChooseV35PageViewModel5 != null ? interestChooseV35PageViewModel5.a() : null, "full", new a(interestChoose, this.this$0));
                } else if (i8 == 1 && z7 && (interestChooseV35PageViewModel = c.f76804a) != null) {
                    interestChooseV35PageViewModel.b(2);
                }
            } else if (interestChoose2 != null) {
                InterestChooseV35Dialog interestChooseV35Dialog = this.this$0;
                int i9 = 0;
                interestChooseV35Dialog.f76375e = false;
                interestChooseV35Dialog.f76376f = true;
                List<InterestChooseItem> listU = interestChoose2.u();
                if (listU != null) {
                    List<InterestChooseItem> list = listU;
                    ArrayList arrayList2 = new ArrayList();
                    Iterator<T> it = list.iterator();
                    while (true) {
                        arrayList = arrayList2;
                        if (!it.hasNext()) {
                            break;
                        }
                        Object next = it.next();
                        if (((InterestChooseItem) next).isSelected()) {
                            arrayList2.add(next);
                        }
                    }
                } else {
                    arrayList = null;
                }
                if (arrayList == null || arrayList.isEmpty()) {
                    arrayList = null;
                }
                if (arrayList != null) {
                    ArrayList arrayList3 = new ArrayList();
                    List<InterestChooseItem> listU2 = interestChoose2.u();
                    if (listU2 != null) {
                        for (Object obj2 : listU2) {
                            int i10 = i9 + 1;
                            if (i9 < 0) {
                                CollectionsKt.throwIndexOverflow();
                            }
                            if (((InterestChooseItem) obj2).isSelected()) {
                                arrayList3.add(Integer.valueOf(i10));
                            }
                            i9 = i10;
                        }
                    }
                    if (i8 == 0) {
                        com.bilibili.pegasus.components.interest.e.c(interestChoose.D(), interestChoose.O(), arrayList, com.bilibili.pegasus.components.interest.d.c(interestChoose), com.bilibili.pegasus.components.interest.d.a(arrayList3), null, null, null, 0, null, interestChoose.B(), null, null, null, null, null, 523232);
                    } else {
                        ArrayList arrayList4 = new ArrayList();
                        ArrayList arrayList5 = new ArrayList();
                        ArrayList arrayList6 = new ArrayList();
                        List<InterestChooseItem> listU3 = interestChoose2.u();
                        if (listU3 != null) {
                            for (InterestChooseItem interestChooseItem : listU3) {
                                List<InterestChooseSubItem> subItems = interestChooseItem.getSubItems();
                                if (subItems != null) {
                                    List<InterestChooseSubItem> list2 = subItems;
                                    ArrayList<InterestChooseSubItem> arrayList7 = new ArrayList();
                                    for (Object obj3 : list2) {
                                        if (((InterestChooseSubItem) obj3).f77422g) {
                                            arrayList7.add(obj3);
                                        }
                                    }
                                    for (InterestChooseSubItem interestChooseSubItem : arrayList7) {
                                        arrayList4.add(Integer.valueOf(interestChooseSubItem.i()));
                                        String strJ = interestChooseSubItem.j();
                                        String str = strJ;
                                        if (strJ == null) {
                                            str = "";
                                        }
                                        arrayList5.add(str);
                                        arrayList6.add((interestChooseItem.getOriginPos() + 1) + UtilsKt.DOT + (interestChooseSubItem.f77423i + 1));
                                    }
                                }
                            }
                        }
                        com.bilibili.pegasus.components.interest.e.c(interestChoose.D(), interestChoose.O(), arrayList, com.bilibili.pegasus.components.interest.d.c(interestChoose), com.bilibili.pegasus.components.interest.d.a(arrayList3), com.bilibili.pegasus.components.interest.d.a(arrayList4), com.bilibili.pegasus.components.interest.d.a(arrayList5), com.bilibili.pegasus.components.interest.d.a(arrayList6), arrayList4.size(), null, interestChoose.B(), null, null, null, null, null, 522752);
                    }
                    interestChooseV35Dialog.kc(null);
                }
            }
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }
}
