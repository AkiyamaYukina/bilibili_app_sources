package com.bilibili.upper.module.honour.utils;

import ES0.G;
import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.base.MainThread;
import com.bilibili.droid.thread.HandlerThreads;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.lib.sharewrapper.basic.ThirdPartyExtraBuilder;
import com.bilibili.okretro.BiliApiDataCallback;
import com.bilibili.studio.editor.moudle.sticker.v1.EditCustomizeSticker;
import com.bilibili.upper.module.honour.bean.KingHonourDownloadBean;
import com.bilibili.upper.module.honour.bean.KingHonourPreviewBean;
import com.bilibili.upper.module.honour.bean.KingHonourResponseBean;
import com.bilibili.upper.module.honour.bean.KingHonourVideoBean;
import com.mall.ui.page.ip.view.v1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Unit;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/honour/utils/m.class */
public final class m extends BiliApiDataCallback<KingHonourResponseBean<KingHonourPreviewBean>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final eI0.e f113374b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f113375c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f113376d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f113377e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f113378f;

    public m(eI0.e eVar, Context context, boolean z6, boolean z7, long j7) {
        this.f113374b = eVar;
        this.f113375c = context;
        this.f113376d = z6;
        this.f113377e = z7;
        this.f113378f = j7;
    }

    public final void d(int i7, int i8) {
        HashMap mapA = VF0.b.a(TE0.b.f24088a);
        mapA.put(EditCustomizeSticker.TAG_DURATION, String.valueOf((System.currentTimeMillis() - this.f113378f) / 1000));
        mapA.put(ThirdPartyExtraBuilder.KEY_RESULT, String.valueOf(i7));
        mapA.put("failed_reason", String.valueOf(i8));
        mapA.put("is_game", this.f113377e ? "1" : "0");
        Unit unit = Unit.INSTANCE;
        Neurons.reportExposure$default(false, "creation.wangzhezhanbao.match-result-template.result.show", mapA, (List) null, 8, (Object) null);
    }

    @Override // com.bilibili.okretro.BiliApiDataCallback
    public final void onDataSuccess(KingHonourResponseBean<KingHonourPreviewBean> kingHonourResponseBean) {
        String str;
        KingHonourResponseBean<KingHonourPreviewBean> kingHonourResponseBean2 = kingHonourResponseBean;
        if ((kingHonourResponseBean2 != null ? kingHonourResponseBean2.result : null) != null) {
            BLog.e("KingHonourManager", "start request success");
            KingHonourPreviewBean kingHonourPreviewBean = kingHonourResponseBean2.result;
            i iVar = new i(this.f113374b, kingHonourResponseBean2, this.f113375c, this.f113376d, this.f113377e, this);
            List<KingHonourVideoBean> list = kingHonourPreviewBean.singleLights;
            if (list == null || list.isEmpty() || (str = kingHonourPreviewBean.singleLights.get(0).videoUrl) == null || str.length() == 0) {
                BLog.e("KingHonourManager", "first video url is null");
                iVar.invoke("", Boolean.FALSE);
                return;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(new KingHonourDownloadBean(kingHonourPreviewBean.singleLights.get(0).videoUrl, 0, false, 4, null));
            BLog.e("KingHonourManager", "start download");
            b bVar = b.f113332a;
            bVar.d(arrayList);
            b.f113337f = new g(iVar);
            bVar.e();
        }
    }

    @Override // com.bilibili.okretro.BiliApiCallback
    public final void onError(Throwable th) {
        final eI0.e eVar = this.f113374b;
        MainThread.runOnMainThread(new G(eVar, 5));
        final int i7 = 0;
        HandlerThreads.getHandler(0).postDelayed(new Runnable(eVar, i7) { // from class: com.bilibili.upper.module.honour.utils.j

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f113358a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Object f113359b;

            {
                this.f113358a = i7;
                this.f113359b = eVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (this.f113358a) {
                    case 0:
                        ((eI0.e) this.f113359b).dismiss();
                        break;
                    default:
                        v1 v1Var = (v1) this.f113359b;
                        RecyclerView.LayoutManager layoutManager = v1Var.f.getLayoutManager();
                        if (layoutManager instanceof LinearLayoutManager) {
                            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                            v1Var.z9(linearLayoutManager.findFirstVisibleItemPosition(), linearLayoutManager.findLastVisibleItemPosition());
                        }
                        break;
                }
            }
        }, 500L);
        d(0, Pw0.a.a(this.f113375c) ? 5 : 1);
    }
}
