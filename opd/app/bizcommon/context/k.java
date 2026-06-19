package com.bilibili.opd.app.bizcommon.context;

import com.bilibili.lib.blkv.RawKV;
import com.bilibili.lib.neuron.api.Neurons;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/context/k.class */
public final /* synthetic */ class k implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f73545a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f73546b;

    public /* synthetic */ k(Object obj, int i7) {
        this.f73545a = i7;
        this.f73546b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f73545a) {
            case 0:
                l lVar = (l) this.f73546b;
                lVar.f73550b = (ArrayList) ArraysKt.toCollection(lVar.f73549a.getStrings("sValues", new String[0]), new ArrayList());
                HashMap map = new HashMap();
                map.put("svalue", lVar.f73550b.toString());
                Unit unit = Unit.INSTANCE;
                Neurons.reportPageView(false, "mall.svalue-stack.0.0.pv", "", 0, 0L, map, 0L, 0L);
                RawKV rawKV = lVar.f73549a;
                rawKV.remove("sValues");
                rawKV.remove("pre_sValue");
                lVar.f73550b.clear();
                break;
            case 1:
                ((Function0) this.f73546b).invoke();
                break;
            default:
                rg0.f fVar = (rg0.f) this.f73546b;
                com.bilibili.lib.videoupload.internal.m mVarH = fVar.h();
                fVar.f126666p = true;
                fVar.L();
                fVar.K();
                fVar.C(mVarH);
                break;
        }
    }
}
