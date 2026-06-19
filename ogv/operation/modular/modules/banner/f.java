package com.bilibili.ogv.operation.modular.modules.banner;

import Pk0.w;
import android.view.View;
import com.bilibili.adcommon.basic.Motion;
import com.bilibili.adcommon.data.model.SourceContent;
import com.bilibili.app.comm.list.widget.banneradapter.BannerController;
import com.bilibili.gripper.api.ad.core.GAdCoreKt;
import com.bilibili.gripper.api.ad.core.report.ExtraParams;
import com.bilibili.gripper.api.ad.core.report.IAdReporter;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.ogv.opbase.CommonCard;
import com.bilibili.pegasus.ext.router.SpecialSpmidType;
import com.bilibili.pegasus.holders.bannerv8.items.j;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import op0.C8249a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation/modular/modules/banner/f.class */
public final /* synthetic */ class f implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f70453a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f70454b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f70455c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f70456d;

    public /* synthetic */ f(Object obj, int i7, Object obj2, Object obj3) {
        this.f70453a = i7;
        this.f70454b = obj;
        this.f70455c = obj2;
        this.f70456d = obj3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f70453a) {
            case 0:
                String str = (String) this.f70454b;
                CommonCard commonCard = (CommonCard) this.f70455c;
                w wVar = (w) this.f70456d;
                Map<String, String> map = commonCard.f69701D0;
                Map<String, String> mapEmptyMap = map;
                if (map == null) {
                    mapEmptyMap = MapsKt.emptyMap();
                }
                Neurons.reportClick(false, "pgc." + str + ".operation.works.click", mapEmptyMap);
                SourceContent sourceContent = commonCard.f69715K0;
                if (sourceContent != null) {
                    IAdReporter.clickAll$default(GAdCoreKt.getGAdReport(), sourceContent, (ExtraParams) null, (Motion) null, (String) null, false, (List) null, (String) null, false, 254, (Object) null);
                }
                if (commonCard.f69715K0 == null) {
                    wVar.E6(commonCard.f69795y, new Pair[0]);
                } else {
                    GAdCoreKt.getGAdClick().navigate(view.getContext(), commonCard.f69795y, commonCard.f69715K0);
                }
                break;
            default:
                gp0.b bVar = (gp0.b) this.f70454b;
                BannerController bannerController = (BannerController) this.f70455c;
                j.a aVar = (j.a) this.f70456d;
                gp0.g gVarN = bVar.n();
                if (gVarN != null) {
                    if (bannerController != null) {
                        bannerController.reportItemClick(aVar.getAdapterPosition());
                    }
                    C8249a.j(gVarN, aVar.itemView.getContext(), null, gVarN.getCardType(), null, null, null, SpecialSpmidType.DEFAULT);
                }
                break;
        }
    }
}
