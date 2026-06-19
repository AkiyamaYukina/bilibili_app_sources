package com.bilibili.upper.module.manuscript.activity;

import android.view.View;
import eJ0.C6922A;
import eJ0.y;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/manuscript/activity/k.class */
public final /* synthetic */ class k implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final eJ0.y f113545a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EQ.v f113546b;

    public /* synthetic */ k(eJ0.y yVar, EQ.v vVar) {
        this.f113545a = yVar;
        this.f113546b = vVar;
    }

    public final Object invoke(Object obj) {
        View view = (View) obj;
        int i7 = LimitProblemShowActivity.f113421H;
        eJ0.y yVar = this.f113545a;
        if (yVar != null) {
            boolean zContainsKey = yVar.f117303b.containsKey(Integer.valueOf(view.hashCode()));
            EQ.v vVar = this.f113546b;
            if (zContainsKey) {
                y.a aVar = yVar.f117303b.get(Integer.valueOf(view.hashCode()));
                if (aVar != null) {
                    C6922A c6922a = new C6922A(vVar, view);
                    aVar.f117310c = c6922a;
                    if (aVar.f117311d) {
                        c6922a.onShow();
                    }
                }
            } else {
                HashMap<Integer, y.a> map = yVar.f117303b;
                int iHashCode = view.hashCode();
                y.a aVar2 = new y.a(view.hashCode(), view, new eJ0.z(vVar, view));
                yVar.a(aVar2);
                map.put(Integer.valueOf(iHashCode), aVar2);
            }
        }
        return Unit.INSTANCE;
    }
}
