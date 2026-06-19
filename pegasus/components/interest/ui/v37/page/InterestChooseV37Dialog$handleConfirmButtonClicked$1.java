package com.bilibili.pegasus.components.interest.ui.v37.page;

import com.alibaba.fastjson.JSONObject;
import com.bilibili.okretro.BiliApiDataCallback;
import com.bilibili.pegasus.components.interest.ui.v37.vm.InterestChooseV37PageViewModel;
import com.bilibili.pegasus.data.interestchoose.InterestChoose;
import com.bilibili.pegasus.data.interestchoose.InterestChooseAge;
import com.bilibili.pegasus.data.interestchoose.InterestChooseGender;
import com.bilibili.pegasus.data.interestchoose.InterestChooseItem;
import com.bilibili.pegasus.data.interestchoose.InterestChooseSubItem;
import com.bilibili.studio.material.util.UtilsKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v37/page/InterestChooseV37Dialog$handleConfirmButtonClicked$1.class */
final class InterestChooseV37Dialog$handleConfirmButtonClicked$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final InterestChooseV37Dialog this$0;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v37/page/InterestChooseV37Dialog$handleConfirmButtonClicked$1$a.class */
    public static final class a extends BiliApiDataCallback<C7782e> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final InterestChoose f76883b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final InterestChooseV37Dialog f76884c;

        public a(InterestChooseV37Dialog interestChooseV37Dialog, InterestChoose interestChoose) {
            this.f76883b = interestChoose;
            this.f76884c = interestChooseV37Dialog;
        }

        /* JADX WARN: Removed duplicated region for block: B:32:0x00b3  */
        @Override // com.bilibili.okretro.BiliApiDataCallback
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void onDataSuccess(kp0.C7782e r8) {
            /*
                Method dump skipped, instruction units count: 201
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.components.interest.ui.v37.page.InterestChooseV37Dialog$handleConfirmButtonClicked$1.a.onDataSuccess(java.lang.Object):void");
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
                com.bilibili.pegasus.components.interest.ui.v37.vm.InterestChooseV37PageViewModel r0 = com.bilibili.pegasus.components.interest.ui.v37.page.j.f76896a
                r10 = r0
                r0 = r7
                com.bilibili.pegasus.data.interestchoose.InterestChoose r0 = r0.f76883b
                r13 = r0
                r0 = r10
                if (r0 == 0) goto L14
                r0 = r10
                r1 = r13
                r0.c(r1)
            L14:
                com.bilibili.pegasus.components.interest.ui.v37.vm.InterestChooseV37PageViewModel r0 = com.bilibili.pegasus.components.interest.ui.v37.page.j.f76896a
                r10 = r0
                r0 = r10
                if (r0 == 0) goto L21
                r0 = r10
                r1 = 1
                r0.b(r1)
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
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.components.interest.ui.v37.page.InterestChooseV37Dialog$handleConfirmButtonClicked$1.a.onError(java.lang.Throwable):void");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InterestChooseV37Dialog$handleConfirmButtonClicked$1(InterestChooseV37Dialog interestChooseV37Dialog, Continuation<? super InterestChooseV37Dialog$handleConfirmButtonClicked$1> continuation) {
        super(2, continuation);
        this.this$0 = interestChooseV37Dialog;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InterestChooseV37Dialog$handleConfirmButtonClicked$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Flow<C7779b> flow;
        StateFlow<InterestChoose> stateFlow;
        InterestChoose interestChoose;
        InterestChooseV37PageViewModel interestChooseV37PageViewModel;
        ArrayList arrayList;
        String str;
        Object obj2;
        Object obj3;
        StateFlow<InterestChoose> stateFlow2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            InterestChooseV37PageViewModel interestChooseV37PageViewModel2 = j.f76896a;
            if (interestChooseV37PageViewModel2 != null && (flow = interestChooseV37PageViewModel2.f76918t) != null) {
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
            InterestChooseV37PageViewModel interestChooseV37PageViewModel3 = j.f76896a;
            if (interestChooseV37PageViewModel3 == null || (stateFlow = interestChooseV37PageViewModel3.f76901b) == null || (interestChoose = (InterestChoose) stateFlow.getValue()) == null) {
                return Unit.INSTANCE;
            }
            InterestChooseV37PageViewModel interestChooseV37PageViewModel4 = j.f76896a;
            InterestChoose interestChoose2 = (interestChooseV37PageViewModel4 == null || (stateFlow2 = interestChooseV37PageViewModel4.f76903d) == null) ? null : (InterestChoose) stateFlow2.getValue();
            boolean z6 = c7779b.f122928b;
            int i8 = c7779b.f122931e;
            if (!z6) {
                boolean z7 = c7779b.f122929c;
                if (i8 == 0 && z7) {
                    long jO = interestChoose.O();
                    InterestChooseV37PageViewModel interestChooseV37PageViewModel5 = j.f76896a;
                    com.bilibili.pegasus.request.b.e(jO, interestChooseV37PageViewModel5 != null ? interestChooseV37PageViewModel5.a() : null, "full", new a(this.this$0, interestChoose));
                } else if (i8 == 1 && z7 && (interestChooseV37PageViewModel = j.f76896a) != null) {
                    interestChooseV37PageViewModel.b(2);
                }
            } else if (interestChoose2 != null) {
                InterestChooseV37Dialog interestChooseV37Dialog = this.this$0;
                interestChooseV37Dialog.f76385d = true;
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
                ArrayList arrayList3 = (arrayList == null || arrayList.isEmpty()) ? null : arrayList;
                if (arrayList3 != null) {
                    ArrayList arrayList4 = new ArrayList();
                    List<InterestChooseItem> listU2 = interestChoose2.u();
                    if (listU2 != null) {
                        Iterator<T> it2 = listU2.iterator();
                        int i9 = 0;
                        while (true) {
                            int i10 = i9;
                            if (!it2.hasNext()) {
                                break;
                            }
                            Object next2 = it2.next();
                            int i11 = i10 + 1;
                            if (i10 < 0) {
                                CollectionsKt.throwIndexOverflow();
                            }
                            if (((InterestChooseItem) next2).isSelected()) {
                                arrayList4.add(Integer.valueOf(i11));
                            }
                            i9 = i11;
                        }
                    }
                    ArrayList arrayList5 = new ArrayList();
                    ArrayList arrayList6 = new ArrayList();
                    ArrayList arrayList7 = new ArrayList();
                    ArrayList arrayList8 = new ArrayList();
                    List<InterestChooseItem> listU3 = interestChoose2.u();
                    if (listU3 != null) {
                        Iterator it3 = listU3.iterator();
                        while (it3.hasNext()) {
                            InterestChooseItem interestChooseItem = (InterestChooseItem) it3.next();
                            if (interestChooseItem.getDefaultSelected() == 1) {
                                arrayList5.add(Long.valueOf(interestChooseItem.getId()));
                                String name = interestChooseItem.getName();
                                String str2 = name;
                                if (name == null) {
                                    str2 = "";
                                }
                                arrayList6.add(str2);
                            }
                            List<InterestChooseSubItem> subItems = interestChooseItem.getSubItems();
                            if (subItems != null) {
                                List<InterestChooseSubItem> list2 = subItems;
                                ArrayList arrayList9 = new ArrayList();
                                for (Object obj4 : list2) {
                                    if (((InterestChooseSubItem) obj4).b() == 1) {
                                        arrayList9.add(obj4);
                                    }
                                }
                                Iterator it4 = it3;
                                Iterator it5 = arrayList9.iterator();
                                while (true) {
                                    it3 = it4;
                                    if (it5.hasNext()) {
                                        InterestChooseSubItem interestChooseSubItem = (InterestChooseSubItem) it5.next();
                                        arrayList7.add(Integer.valueOf(interestChooseSubItem.i()));
                                        String strJ = interestChooseSubItem.j();
                                        String str3 = strJ;
                                        if (strJ == null) {
                                            str3 = "";
                                        }
                                        arrayList8.add(str3);
                                    }
                                }
                            }
                        }
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    List<InterestChooseAge> listC = interestChoose.c();
                    if (listC != null) {
                        Iterator<T> it6 = listC.iterator();
                        while (true) {
                            if (!it6.hasNext()) {
                                obj3 = null;
                                break;
                            }
                            Object next3 = it6.next();
                            if (((InterestChooseAge) next3).b() == 1) {
                                obj3 = next3;
                                break;
                            }
                        }
                        InterestChooseAge interestChooseAge = (InterestChooseAge) obj3;
                        if (interestChooseAge != null) {
                            String strB = interestChoose.b();
                            String str4 = strB;
                            if (strB == null) {
                                str4 = "";
                            }
                            String title = interestChooseAge.getTitle();
                            String str5 = title;
                            if (title == null) {
                                str5 = "";
                            }
                            linkedHashMap.put(str4, str5);
                        }
                    }
                    List<InterestChooseGender> listQ = interestChoose.q();
                    if (listQ != null) {
                        Iterator<T> it7 = listQ.iterator();
                        while (true) {
                            if (!it7.hasNext()) {
                                obj2 = null;
                                break;
                            }
                            Object next4 = it7.next();
                            if (((InterestChooseGender) next4).b() == 1) {
                                obj2 = next4;
                                break;
                            }
                        }
                        InterestChooseGender interestChooseGender = (InterestChooseGender) obj2;
                        if (interestChooseGender != null) {
                            String strO = interestChoose.o();
                            String str6 = strO;
                            if (strO == null) {
                                str6 = "";
                            }
                            String title2 = interestChooseGender.getTitle();
                            String str7 = title2;
                            if (title2 == null) {
                                str7 = "";
                            }
                            linkedHashMap.put(str6, str7);
                        }
                    }
                    JSONObject jSONObject = linkedHashMap.isEmpty() ? null : new JSONObject((Map<String, Object>) MapsKt.toMap(linkedHashMap));
                    if (i8 == 0) {
                        com.bilibili.pegasus.components.interest.e.c(interestChoose.D(), interestChoose.O(), arrayList3, com.bilibili.pegasus.components.interest.d.c(interestChoose), com.bilibili.pegasus.components.interest.d.a(arrayList4), null, null, null, 0, null, interestChoose.B(), jSONObject != null ? jSONObject.toString() : null, com.bilibili.pegasus.components.interest.d.a(arrayList5), com.bilibili.pegasus.components.interest.d.a(arrayList6), com.bilibili.pegasus.components.interest.d.a(arrayList7), com.bilibili.pegasus.components.interest.d.a(arrayList8), 396256);
                    } else {
                        ArrayList arrayList10 = new ArrayList();
                        ArrayList arrayList11 = new ArrayList();
                        ArrayList arrayList12 = new ArrayList();
                        List<InterestChooseItem> listU4 = interestChoose2.u();
                        if (listU4 != null) {
                            Iterator<T> it8 = listU4.iterator();
                            String str8 = "";
                            while (true) {
                                String str9 = str8;
                                if (!it8.hasNext()) {
                                    break;
                                }
                                InterestChooseItem interestChooseItem2 = (InterestChooseItem) it8.next();
                                List<InterestChooseSubItem> subItems2 = interestChooseItem2.getSubItems();
                                if (subItems2 != null) {
                                    List<InterestChooseSubItem> list3 = subItems2;
                                    ArrayList arrayList13 = new ArrayList();
                                    for (Object obj5 : list3) {
                                        if (((InterestChooseSubItem) obj5).f77422g) {
                                            arrayList13.add(obj5);
                                        }
                                    }
                                    Iterator it9 = arrayList13.iterator();
                                    while (true) {
                                        str = str9;
                                        if (it9.hasNext()) {
                                            InterestChooseSubItem interestChooseSubItem2 = (InterestChooseSubItem) it9.next();
                                            arrayList10.add(Integer.valueOf(interestChooseSubItem2.i()));
                                            String strJ2 = interestChooseSubItem2.j();
                                            String str10 = strJ2;
                                            if (strJ2 == null) {
                                                str10 = str9;
                                            }
                                            arrayList11.add(str10);
                                            arrayList12.add((interestChooseItem2.getOriginPos() + 1) + UtilsKt.DOT + (interestChooseSubItem2.f77423i + 1));
                                        }
                                    }
                                } else {
                                    str = str9;
                                }
                                str8 = str;
                            }
                        }
                        com.bilibili.pegasus.components.interest.e.c(interestChoose.D(), interestChoose.O(), arrayList3, com.bilibili.pegasus.components.interest.d.c(interestChoose), com.bilibili.pegasus.components.interest.d.a(arrayList4), com.bilibili.pegasus.components.interest.d.a(arrayList10), com.bilibili.pegasus.components.interest.d.a(arrayList11), com.bilibili.pegasus.components.interest.d.a(arrayList12), arrayList10.size(), null, interestChoose.B(), jSONObject != null ? jSONObject.toString() : null, com.bilibili.pegasus.components.interest.d.a(arrayList5), com.bilibili.pegasus.components.interest.d.a(arrayList6), com.bilibili.pegasus.components.interest.d.a(arrayList7), com.bilibili.pegasus.components.interest.d.a(arrayList8), 395776);
                    }
                    interestChooseV37Dialog.kc(null);
                }
            }
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }
}
