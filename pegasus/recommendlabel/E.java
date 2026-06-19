package com.bilibili.pegasus.recommendlabel;

import androidx.sqlite.SQLiteConnection;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.pegasus.recommendlabel.InterfaceC5739h;
import com.bilibili.pegasus.recommendlabel.data.Label;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.KProperty;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/recommendlabel/E.class */
public final /* synthetic */ class E implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f78574a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f78575b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f78576c;

    public /* synthetic */ E(int i7, Object obj, Object obj2) {
        this.f78574a = i7;
        this.f78575b = obj;
        this.f78576c = obj2;
    }

    public final Object invoke(Object obj) {
        Object obj2 = this.f78575b;
        Object obj3 = this.f78576c;
        switch (this.f78574a) {
            case 0:
                int iIntValue = ((Integer) obj).intValue();
                KProperty<Object>[] kPropertyArr = RecommendLabelFirstActivity.f78628K;
                Label label = (Label) obj2;
                RecommendLabelFirstActivity recommendLabelFirstActivity = (RecommendLabelFirstActivity) obj3;
                if (iIntValue == 0) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.put("label_class", String.valueOf(label.getAreaName()));
                    linkedHashMap.put("label_name", String.valueOf(label.getName()));
                    int iIsFixed = label.isFixed();
                    linkedHashMap.put("fixed_type", iIsFixed != 0 ? iIsFixed != 1 ? "" : "2" : "1");
                    Neurons.reportClick(true, "main.recommend-label.fixed.0.click", linkedHashMap);
                    BLog.i("RecommendLabelReporter", "reportLabelClick " + label);
                    if (label.isPined()) {
                        recommendLabelFirstActivity.P6().I0(new InterfaceC5739h.l(label));
                    } else {
                        recommendLabelFirstActivity.P6().I0(new InterfaceC5739h.C0507h(label));
                    }
                } else if (iIntValue == 1) {
                    if (label.isPined()) {
                        recommendLabelFirstActivity.P6().I0(new InterfaceC5739h.b(label));
                    } else {
                        recommendLabelFirstActivity.P6().I0(new InterfaceC5739h.c(label));
                    }
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    linkedHashMap2.put("label_class", String.valueOf(label.getAreaName()));
                    linkedHashMap2.put("label_name", String.valueOf(label.getName()));
                    Neurons.reportClick(true, "main.recommend-label.delete.0.click", linkedHashMap2);
                    BLog.i("RecommendLabelReporter", "reportDeleteClick " + label);
                }
                break;
            default:
                ((of0.i) obj2).f124609b.insert((SQLiteConnection) obj, (Iterable) obj3);
                break;
        }
        return Unit.INSTANCE;
    }
}
