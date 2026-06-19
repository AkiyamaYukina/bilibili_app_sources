package com.bilibili.upper.module.honour.utils;

import ES0.G;
import android.content.Context;
import android.os.Bundle;
import com.bilibili.base.MainThread;
import com.bilibili.droid.thread.HandlerThreads;
import com.bilibili.upper.module.honour.bean.KingHonourPreviewBean;
import com.bilibili.upper.module.honour.bean.KingHonourPublishTemplateBean;
import com.bilibili.upper.module.honour.bean.KingHonourResponseBean;
import fD0.InterfaceC7041a;
import java.util.List;
import java.util.Map;
import kntr.base.android.legacy.context.ContextUtilKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.webrtc.EglRenderer;
import q4.M;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/honour/utils/i.class */
public final /* synthetic */ class i implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final eI0.e f113352a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final KingHonourResponseBean f113353b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f113354c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f113355d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f113356e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final m f113357f;

    public /* synthetic */ i(eI0.e eVar, KingHonourResponseBean kingHonourResponseBean, Context context, boolean z6, boolean z7, m mVar) {
        this.f113352a = eVar;
        this.f113353b = kingHonourResponseBean;
        this.f113354c = context;
        this.f113355d = z6;
        this.f113356e = z7;
        this.f113357f = mVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v31, types: [com.bilibili.upper.module.honour.utils.l, kotlin.jvm.functions.Function1] */
    public final Object invoke(Object obj, Object obj2) {
        Unit unit;
        final Context context = this.f113354c;
        final String str = (String) obj;
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        final eI0.e eVar = this.f113352a;
        if (!zBooleanValue || str == null || str.length() == 0) {
            MainThread.runOnMainThread(new G(eVar, 5));
            final int i7 = 0;
            HandlerThreads.getHandler(0).postDelayed(new Runnable(eVar, i7) { // from class: com.bilibili.upper.module.honour.utils.h

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final int f113350a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Object f113351b;

                {
                    this.f113350a = i7;
                    this.f113351b = eVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (this.f113350a) {
                        case 0:
                            ((eI0.e) this.f113351b).dismiss();
                            break;
                        case 1:
                            ((lw.a) this.f113351b).b.invoke();
                            break;
                        default:
                            EglRenderer.e((EglRenderer) this.f113351b);
                            break;
                    }
                }
            }, 500L);
            unit = Unit.INSTANCE;
        } else {
            final KingHonourResponseBean kingHonourResponseBean = this.f113353b;
            KingHonourPreviewBean kingHonourPreviewBean = (KingHonourPreviewBean) kingHonourResponseBean.result;
            final boolean z6 = this.f113355d;
            final boolean z7 = this.f113356e;
            final m mVar = this.f113357f;
            Function1 function1 = new Function1(eVar, context, str, kingHonourResponseBean, z6, z7, mVar) { // from class: com.bilibili.upper.module.honour.utils.k

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final eI0.e f113360a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Context f113361b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final String f113362c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final KingHonourResponseBean f113363d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final boolean f113364e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final boolean f113365f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                public final m f113366g;

                {
                    this.f113360a = eVar;
                    this.f113361b = context;
                    this.f113362c = str;
                    this.f113363d = kingHonourResponseBean;
                    this.f113364e = z6;
                    this.f113365f = z7;
                    this.f113366g = mVar;
                }

                /* JADX WARN: Multi-variable type inference failed */
                public final Object invoke(Object obj3) {
                    Context context2 = this.f113361b;
                    this.f113360a.dismiss();
                    p.a(context2, this.f113362c, (KingHonourPreviewBean) this.f113363d.result, this.f113364e, this.f113365f);
                    this.f113366g.d(1, 0);
                    return Unit.INSTANCE;
                }
            };
            ?? r02 = new Function1(eVar, context, str, kingHonourResponseBean, z6, z7, mVar) { // from class: com.bilibili.upper.module.honour.utils.l

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final eI0.e f113367a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Context f113368b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final String f113369c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final KingHonourResponseBean f113370d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final boolean f113371e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final boolean f113372f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                public final m f113373g;

                {
                    this.f113367a = eVar;
                    this.f113368b = context;
                    this.f113369c = str;
                    this.f113370d = kingHonourResponseBean;
                    this.f113371e = z6;
                    this.f113372f = z7;
                    this.f113373g = mVar;
                }

                /* JADX WARN: Multi-variable type inference failed */
                public final Object invoke(Object obj3) {
                    Context context2 = this.f113368b;
                    M.b("message is ", ((Throwable) obj3).getMessage(), "KingHonourManager");
                    this.f113367a.dismiss();
                    p.a(context2, this.f113369c, (KingHonourPreviewBean) this.f113370d.result, this.f113371e, this.f113372f);
                    this.f113373g.d(1, 0);
                    return Unit.INSTANCE;
                }
            };
            Map<String, Map<String, List<KingHonourPublishTemplateBean>>> map = kingHonourPreviewBean.singleTemplates;
            if (map == null) {
                r02.invoke(new Throwable("template is null"));
            } else {
                Map<String, List<KingHonourPublishTemplateBean>> map2 = map.get(kingHonourPreviewBean.singleLights.get(0).type);
                Object objFirstOrNull = null;
                if (map2 != null) {
                    List<KingHonourPublishTemplateBean> list = map2.get("template");
                    objFirstOrNull = null;
                    if (list != null) {
                        objFirstOrNull = CollectionsKt.firstOrNull(list);
                    }
                }
                if (objFirstOrNull == null) {
                    r02.invoke(new Throwable("template is null"));
                } else {
                    InterfaceC7041a.f117734a.getClass();
                    if (InterfaceC7041a.a.a().n()) {
                        Bundle bundleA = androidx.credentials.p.a("bbs_key_template_sdk_montage", "bbs_key_template_sdk_montage_force", true, true);
                        try {
                            if (ContextUtilKt.requireActivity(context) != null) {
                                InterfaceC7041a.a.a().k(ContextUtilKt.requireActivity(context), 7, String.valueOf(((KingHonourPublishTemplateBean) objFirstOrNull).id), ((KingHonourPublishTemplateBean) objFirstOrNull).downloadUrl, bundleA, null, function1, r02);
                            }
                        } catch (IllegalArgumentException e7) {
                            BLog.e("KingHonourManager", "lose activity");
                        }
                    } else {
                        r02.invoke(new Throwable("tuwen service plugin is null"));
                    }
                }
            }
            unit = Unit.INSTANCE;
        }
        return unit;
    }
}
