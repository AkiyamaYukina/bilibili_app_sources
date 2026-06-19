package com.bilibili.pegasus.components.interest.ui.v32.page;

import com.bilibili.pegasus.components.interest.ui.udf.actions.Actions;
import com.bilibili.pegasus.components.interest.ui.v32.vm.InterestChooseV32PageViewModel;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v32/page/j.class */
public final /* synthetic */ class j implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f76685a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f76686b;

    public /* synthetic */ j(Object obj, int i7) {
        this.f76685a = i7;
        this.f76686b = obj;
    }

    public final Object invoke(Object obj) {
        switch (this.f76685a) {
            case 0:
                Fo0.j jVar = (Fo0.j) obj;
                InterestChooseV32PageViewModel interestChooseV32PageViewModelHf = ((InterestChooseV32SecondTab) this.f76686b).hf();
                if (interestChooseV32PageViewModelHf != null) {
                    interestChooseV32PageViewModelHf.I0(new Actions.a.c(jVar));
                }
                return Unit.INSTANCE;
            default:
                List list = (List) this.f76686b;
                List list2 = (List) obj;
                List listPlus = list2;
                if (!list.isEmpty()) {
                    listPlus = CollectionsKt.plus(list2, CollectionsKt.listOf(list));
                }
                return listPlus;
        }
    }
}
