package com.bilibili.pegasus.components.interest.ui.v33.page;

import com.alibaba.fastjson.JSONObject;
import com.bilibili.okretro.BiliApiDataCallback;
import com.bilibili.pegasus.components.interest.ui.v33.vm.InterestChooseV33PageViewModel;
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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v33/page/InterestChooseV33Dialog$handleConfirmButtonClicked$1.class */
final class InterestChooseV33Dialog$handleConfirmButtonClicked$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final InterestChooseV33Dialog this$0;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v33/page/InterestChooseV33Dialog$handleConfirmButtonClicked$1$a.class */
    public static final class a extends BiliApiDataCallback<C7782e> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final InterestChoose f76716b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final InterestChooseV33Dialog f76717c;

        public a(InterestChoose interestChoose, InterestChooseV33Dialog interestChooseV33Dialog) {
            this.f76716b = interestChoose;
            this.f76717c = interestChooseV33Dialog;
        }

        /* JADX WARN: Removed duplicated region for block: B:30:0x00b0  */
        @Override // com.bilibili.okretro.BiliApiDataCallback
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void onDataSuccess(kp0.C7782e r8) {
            /*
                r7 = this;
                r0 = r8
                kp0.e r0 = (kp0.C7782e) r0
                r8 = r0
                r0 = 0
                r10 = r0
                r0 = r10
                r9 = r0
                r0 = r8
                if (r0 == 0) goto L3c
                r0 = r8
                com.bilibili.pegasus.data.interestchoose.InterestChoose r0 = r0.b()
                r13 = r0
                r0 = r10
                r9 = r0
                r0 = r13
                if (r0 == 0) goto L3c
                r0 = r13
                java.util.List r0 = r0.u()
                r13 = r0
                r0 = r10
                r9 = r0
                r0 = r13
                if (r0 == 0) goto L3c
                r0 = r10
                r9 = r0
                r0 = r13
                java.util.Collection r0 = (java.util.Collection) r0
                boolean r0 = r0.isEmpty()
                r1 = 1
                r0 = r0 ^ r1
                r1 = 1
                if (r0 != r1) goto L3c
                r0 = 1
                r9 = r0
            L3c:
                r0 = r7
                com.bilibili.pegasus.data.interestchoose.InterestChoose r0 = r0.f76716b
                r13 = r0
                r0 = r9
                if (r0 == 0) goto L57
                r0 = r8
                if (r0 == 0) goto L52
                r0 = r8
                com.bilibili.pegasus.data.interestchoose.InterestChoose r0 = r0.b()
                r8 = r0
                goto L5a
            L52:
                r0 = 0
                r8 = r0
                goto L5a
            L57:
                r0 = r13
                r8 = r0
            L5a:
                com.bilibili.pegasus.components.interest.ui.v33.vm.InterestChooseV33PageViewModel r0 = com.bilibili.pegasus.components.interest.ui.v33.page.c.f76724a
                r14 = r0
                r0 = r14
                if (r0 == 0) goto L6a
                r0 = r14
                r1 = 1
                r0.b(r1)
            L6a:
                com.bilibili.pegasus.components.interest.ui.v33.vm.InterestChooseV33PageViewModel r0 = com.bilibili.pegasus.components.interest.ui.v33.page.c.f76724a
                r14 = r0
                r0 = r14
                if (r0 == 0) goto L7a
                r0 = r14
                r1 = r8
                r0.c(r1)
            L7a:
                r0 = r9
                if (r0 != 0) goto Lbd
                r0 = r13
                int r0 = r0.D()
                r9 = r0
                r0 = r13
                long r0 = r0.O()
                r11 = r0
                r0 = r7
                com.bilibili.pegasus.components.interest.ui.v33.page.InterestChooseV33Dialog r0 = r0.f76717c
                android.content.Context r0 = r0.getContext()
                r8 = r0
                r0 = r8
                if (r0 == 0) goto Lb0
                r0 = r8
                r1 = 2131845310(0x7f1160be, float:1.9324037E38)
                r2 = 1
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r3 = r2
                r4 = 0
                java.lang.String r5 = "-1234"
                r3[r4] = r5
                java.lang.String r0 = r0.getString(r1, r2)
                r13 = r0
                r0 = r13
                r8 = r0
                r0 = r13
                if (r0 != 0) goto Lb3
            Lb0:
                java.lang.String r0 = ""
                r8 = r0
            Lb3:
                r0 = r9
                r1 = -1234(0xfffffffffffffb2e, float:NaN)
                r2 = r11
                r3 = r8
                com.bilibili.pegasus.components.interest.e.u(r0, r1, r2, r3)
            Lbd:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.components.interest.ui.v33.page.InterestChooseV33Dialog$handleConfirmButtonClicked$1.a.onDataSuccess(java.lang.Object):void");
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0037  */
        @Override // com.bilibili.okretro.BiliApiCallback
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void onError(java.lang.Throwable r7) {
            /*
                r6 = this;
                com.bilibili.pegasus.components.interest.ui.v33.vm.InterestChooseV33PageViewModel r0 = com.bilibili.pegasus.components.interest.ui.v33.page.c.f76724a
                r9 = r0
                r0 = r9
                if (r0 == 0) goto Ld
                r0 = r9
                r1 = 1
                r0.b(r1)
            Ld:
                com.bilibili.pegasus.components.interest.ui.v33.vm.InterestChooseV33PageViewModel r0 = com.bilibili.pegasus.components.interest.ui.v33.page.c.f76724a
                r9 = r0
                r0 = r6
                com.bilibili.pegasus.data.interestchoose.InterestChoose r0 = r0.f76716b
                r12 = r0
                r0 = r9
                if (r0 == 0) goto L21
                r0 = r9
                r1 = r12
                r0.c(r1)
            L21:
                java.lang.String r0 = ""
                r10 = r0
                r0 = r7
                if (r0 == 0) goto L37
                r0 = r7
                java.lang.String r0 = r0.getMessage()
                r11 = r0
                r0 = r11
                r9 = r0
                r0 = r11
                if (r0 != 0) goto L3a
            L37:
                java.lang.String r0 = ""
                r9 = r0
            L3a:
                r0 = r7
                boolean r0 = r0 instanceof com.bilibili.api.BiliApiException
                if (r0 == 0) goto L5d
                r0 = r7
                com.bilibili.api.BiliApiException r0 = (com.bilibili.api.BiliApiException) r0
                r7 = r0
                r0 = r7
                int r0 = r0.mCode
                r8 = r0
                r0 = r7
                java.lang.String r0 = r0.getMessage()
                r7 = r0
                r0 = r7
                if (r0 != 0) goto L5a
                r0 = r10
                r7 = r0
                goto L5a
            L5a:
                goto L7a
            L5d:
                r0 = r7
                boolean r0 = r0 instanceof retrofit2.HttpException
                if (r0 == 0) goto L76
                r0 = r7
                retrofit2.HttpException r0 = (retrofit2.HttpException) r0
                r7 = r0
                r0 = r7
                int r0 = r0.code()
                r8 = r0
                r0 = r7
                java.lang.String r0 = r0.message()
                r7 = r0
                goto L7a
            L76:
                r0 = -1
                r8 = r0
                r0 = r9
                r7 = r0
            L7a:
                r0 = r12
                int r0 = r0.D()
                r1 = r8
                r2 = r12
                long r2 = r2.O()
                r3 = r7
                com.bilibili.pegasus.components.interest.e.u(r0, r1, r2, r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.components.interest.ui.v33.page.InterestChooseV33Dialog$handleConfirmButtonClicked$1.a.onError(java.lang.Throwable):void");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InterestChooseV33Dialog$handleConfirmButtonClicked$1(InterestChooseV33Dialog interestChooseV33Dialog, Continuation<? super InterestChooseV33Dialog$handleConfirmButtonClicked$1> continuation) {
        super(2, continuation);
        this.this$0 = interestChooseV33Dialog;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InterestChooseV33Dialog$handleConfirmButtonClicked$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Flow<C7779b> flow;
        StateFlow<InterestChoose> stateFlow;
        InterestChoose interestChoose;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            InterestChooseV33PageViewModel interestChooseV33PageViewModel = c.f76724a;
            if (interestChooseV33PageViewModel != null && (flow = interestChooseV33PageViewModel.f76749n) != null) {
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
            InterestChooseV33PageViewModel interestChooseV33PageViewModel2 = c.f76724a;
            if (interestChooseV33PageViewModel2 == null || (stateFlow = interestChooseV33PageViewModel2.f76742f) == null || (interestChoose = (InterestChoose) stateFlow.getValue()) == null) {
                return Unit.INSTANCE;
            }
            if (c7779b.f122928b) {
                InterestChooseV33Dialog interestChooseV33Dialog = this.this$0;
                interestChooseV33Dialog.f76375e = false;
                interestChooseV33Dialog.f76376f = true;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                for (InterestChooseItem interestChooseItem : interestChooseV33Dialog.f76715i) {
                    List<InterestChooseSubItem> subItems = interestChooseItem.getSubItems();
                    if (subItems != null) {
                        for (InterestChooseSubItem interestChooseSubItem : subItems) {
                            arrayList.add(Integer.valueOf(interestChooseSubItem.i()));
                            String strJ = interestChooseSubItem.j();
                            String str = strJ;
                            if (strJ == null) {
                                str = "";
                            }
                            arrayList2.add(str);
                            arrayList3.add((interestChooseItem.getOriginPos() + 1) + UtilsKt.DOT + (interestChooseSubItem.f77423i + 1));
                        }
                    }
                }
                int iD = interestChoose.D();
                long jO = interestChoose.O();
                List<InterestChooseItem> list = interestChooseV33Dialog.f76715i;
                JSONObject jSONObjectC = com.bilibili.pegasus.components.interest.d.c(interestChoose);
                List<InterestChooseItem> list2 = interestChooseV33Dialog.f76715i;
                ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                Iterator<T> it = list2.iterator();
                while (it.hasNext()) {
                    arrayList4.add(Integer.valueOf(((InterestChooseItem) it.next()).getOriginPos() + 1));
                }
                com.bilibili.pegasus.components.interest.e.c(iD, jO, list, jSONObjectC, com.bilibili.pegasus.components.interest.d.a(arrayList4), com.bilibili.pegasus.components.interest.d.a(arrayList), com.bilibili.pegasus.components.interest.d.a(arrayList2), com.bilibili.pegasus.components.interest.d.a(arrayList3), arrayList.size(), null, null, null, null, null, null, null, 523776);
                interestChooseV33Dialog.kc(null);
            } else if (c7779b.f122931e == 0 && c7779b.f122929c) {
                long jO2 = interestChoose.O();
                InterestChooseV33PageViewModel interestChooseV33PageViewModel3 = c.f76724a;
                com.bilibili.pegasus.request.b.e(jO2, interestChooseV33PageViewModel3 != null ? interestChooseV33PageViewModel3.a() : null, "full", new a(interestChoose, this.this$0));
            }
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }
}
