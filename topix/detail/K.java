package com.bilibili.topix.detail;

import androidx.lifecycle.ViewModelProvider;
import com.bilibili.app.comm.list.common.topix.d;
import java.util.ArrayList;
import kntr.common.ouro.core.model.mark.q;
import kntr.common.ouro.core.model.mark.t;
import kntr.common.ouro.core.model.node.c;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/topix/detail/K.class */
public final /* synthetic */ class K implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f112666a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f112667b;

    public /* synthetic */ K(Object obj, int i7) {
        this.f112666a = i7;
        this.f112667b = obj;
    }

    public final Object invoke() {
        Object obj = this.f112667b;
        switch (this.f112666a) {
            case 0:
                KProperty[] kPropertyArr = TopixEmptyFragment.d;
                return new ViewModelProvider(((TopixEmptyFragment) obj).requireActivity()).get("topix_view_model", d.class);
            default:
                q qVar = ((c) obj).a;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : qVar) {
                    if (obj2 instanceof t) {
                        arrayList.add(obj2);
                    }
                }
                return new q(arrayList);
        }
    }
}
