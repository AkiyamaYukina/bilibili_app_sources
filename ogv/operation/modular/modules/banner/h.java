package com.bilibili.ogv.operation.modular.modules.banner;

import Pk0.w;
import androidx.core.app.NotificationCompat;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.ogv.opbase.CommonCard;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import tv.danmaku.biliplayerv2.IPlayerContainer;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation/modular/modules/banner/h.class */
public final class h implements Vh.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f70458a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f70459b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CommonCard f70460c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final w f70461d;

    public h(i iVar, String str, CommonCard commonCard, w wVar) {
        this.f70458a = iVar;
        this.f70459b = str;
        this.f70460c = commonCard;
        this.f70461d = wVar;
    }

    public final void a(IPlayerContainer iPlayerContainer, int i7) {
        try {
            boolean z6 = true;
            this.f70458a.o(true);
            String str = this.f70459b;
            CommonCard commonCard = this.f70460c;
            Map<String, String> map = commonCard.f69701D0;
            Map<String, String> mapEmptyMap = map;
            if (map == null) {
                mapEmptyMap = MapsKt.emptyMap();
            }
            Neurons.reportClick(false, "pgc." + str + ".operation.works.click", mapEmptyMap);
            boolean z7 = i7 == -1;
            if (commonCard.f() != commonCard.j()) {
                z6 = false;
            }
            w wVar = this.f70461d;
            Pair<String, String> pair = new Pair<>(NotificationCompat.CATEGORY_PROGRESS, String.valueOf(i7));
            Pair<String, String> pair2 = new Pair<>("is_inline_finish", String.valueOf(z7));
            if (!z6 || iPlayerContainer == null) {
                if (wVar != null) {
                    wVar.E6(commonCard.f69795y, new Pair[0]);
                }
            } else if (wVar != null) {
                wVar.E6(commonCard.f69795y, pair, pair2);
            }
        } catch (Exception e7) {
        }
    }
}
