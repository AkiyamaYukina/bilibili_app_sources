package com.bilibili.studio.centerplus.ui;

import F3.O1;
import TB0.C2866a;
import X50.h0;
import Xz0.j;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.live.streaming.source.TextSource;
import com.bilibili.studio.centerplus.statistics.CenterPlusStatisticsHelper;
import com.bilibili.studio.centerplus.ui.CenterPlusMainActivity;
import com.bilibili.studio.videoeditor.event.EventFinishEdit;
import com.bilibili.studio.videoeditor.util.M;
import com.bilibili.upper.module.contribute.picker.model.MaterialUGCTemplateVM;
import com.bilibili.upper.module.contribute.picker.ui.A;
import i60.y0;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import lB0.a$b;
import org.json.JSONException;
import org.json.JSONObject;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/centerplus/ui/c.class */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f105249a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f105250b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f105251c;

    public /* synthetic */ c(int i7, Object obj, Object obj2) {
        this.f105249a = i7;
        this.f105250b = obj;
        this.f105251c = obj2;
    }

    public final Object invoke(Object obj) throws JSONException {
        JSONObject jSONObject;
        Object obj2 = this.f105251c;
        Object obj3 = this.f105250b;
        switch (this.f105249a) {
            case 0:
                CenterPlusMainActivity.a aVar = CenterPlusMainActivity.Companion;
                final CenterPlusMainActivity centerPlusMainActivity = (CenterPlusMainActivity) obj3;
                C2866a c2866a = (C2866a) obj2;
                if (((Boolean) obj).booleanValue()) {
                    centerPlusMainActivity.f105216P = false;
                    c2866a.f23731d.onSuccess();
                    String str = CenterPlusStatisticsHelper.f105195a;
                    int engineType = centerPlusMainActivity.V6().getEngineType();
                    int i7 = centerPlusMainActivity.f105208H;
                    HashMap map = (HashMap) CenterPlusStatisticsHelper.f105196b;
                    long jLongValue = -1;
                    if (map.containsKey("loadingResourceStartTime")) {
                        Long l7 = (Long) map.remove("loadingResourceStartTime");
                        jLongValue = -1;
                        if (l7 != null) {
                            jLongValue = l7.longValue();
                        }
                    }
                    if (jLongValue < 0) {
                        BLog.wfmt("CenterPlusStatisticsHelper", "reportLoadingResourceTime error: startTime < 0", new Object[0]);
                    } else {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        HashMap map2 = new HashMap();
                        map2.put("engine_type", pf.h.a(engineType, jCurrentTimeMillis - jLongValue, "time", map2));
                        map2.put("is_first_install", String.valueOf(M.f110206b));
                        map2.put("first_entrance", j.a("first_entrance"));
                        map2.put("from_tab", CenterPlusStatisticsHelper.b(i7));
                        Xz0.g.c(map2);
                        BLog.dfmt("CenterPlusStatisticsHelper", "reportLoadingResourceTime...params = " + map2, new Object[0]);
                        Neurons.trackT(false, "creation.center-plus.loading-resource.time.track", map2, 1, new O1(9));
                    }
                    lB0.a aVarA = lB0.a.a();
                    a$b a_b = new a$b(centerPlusMainActivity) { // from class: com.bilibili.studio.centerplus.ui.d

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final CenterPlusMainActivity f105252a;

                        {
                            this.f105252a = centerPlusMainActivity;
                        }

                        @Override // lB0.a$b
                        public final void onBusEvent(Object obj4) {
                            CenterPlusMainActivity.a aVar2 = CenterPlusMainActivity.Companion;
                            EventFinishEdit.FinishReason finishReason = ((EventFinishEdit) obj4).f109562a;
                            CenterPlusMainActivity centerPlusMainActivity2 = this.f105252a;
                            centerPlusMainActivity2.f105203C = finishReason;
                            centerPlusMainActivity2.finish();
                        }
                    };
                    aVarA.getClass();
                    centerPlusMainActivity.f105213M = lB0.a.b(EventFinishEdit.class, a_b);
                    lB0.a aVarA2 = lB0.a.a();
                    a$b a_b2 = new a$b(centerPlusMainActivity) { // from class: com.bilibili.studio.centerplus.ui.e

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final CenterPlusMainActivity f105276a;

                        {
                            this.f105276a = centerPlusMainActivity;
                        }

                        @Override // lB0.a$b
                        public final void onBusEvent(Object obj4) {
                            CenterPlusMainActivity.a aVar2 = CenterPlusMainActivity.Companion;
                            this.f105276a.finish();
                        }
                    };
                    aVarA2.getClass();
                    centerPlusMainActivity.f105214N = lB0.a.b(CenterPlusMainActivity.b.class, a_b2);
                    centerPlusMainActivity.b7(centerPlusMainActivity.f105208H, false, true);
                } else {
                    centerPlusMainActivity.f105216P = false;
                    c2866a.f23731d.onFail(3000);
                }
                break;
            case 1:
                ((A) obj3).invoke(Integer.valueOf(((MaterialUGCTemplateVM) obj2).b), 2, (String) obj);
                break;
            default:
                WeakReference weakReference = (WeakReference) obj3;
                y0 y0Var = (y0) obj;
                if (y0Var.a == null) {
                    jSONObject = h0.a;
                } else {
                    jSONObject = new JSONObject();
                    jSONObject.put(TextSource.CFG_SIZE, ((Number) y0Var.a).longValue());
                }
                A80.c cVar = (A80.c) weakReference.get();
                if (cVar != null) {
                    cVar.c(h0.d(y0Var.b, y0Var.c, jSONObject), (String) obj2);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
