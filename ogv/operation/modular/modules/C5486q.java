package com.bilibili.ogv.operation.modular.modules;

import androidx.core.app.NotificationCompat;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.ogv.opbase.CommonCard;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import tv.danmaku.biliplayerv2.IPlayerContainer;

/* JADX INFO: renamed from: com.bilibili.ogv.operation.modular.modules.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation/modular/modules/q.class */
public final class C5486q implements Vh.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5488t f70736a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f70737b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CommonCard f70738c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Pk0.w f70739d;

    public C5486q(C5488t c5488t, String str, CommonCard commonCard, Pk0.w wVar) {
        this.f70736a = c5488t;
        this.f70737b = str;
        this.f70738c = commonCard;
        this.f70739d = wVar;
    }

    public final void a(IPlayerContainer iPlayerContainer, int i7) {
        try {
            boolean z6 = true;
            this.f70736a.n(true);
            String str = this.f70737b;
            CommonCard commonCard = this.f70738c;
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
            Pk0.w wVar = this.f70739d;
            Pair<String, String> pair = new Pair<>(NotificationCompat.CATEGORY_PROGRESS, String.valueOf(i7));
            Pair<String, String> pair2 = new Pair<>("is_inline_finish", String.valueOf(z7));
            if (!z6 || iPlayerContainer == null) {
                wVar.E6(commonCard.f69795y, new Pair[0]);
            } else {
                wVar.E6(commonCard.f69795y, pair, pair2);
            }
        } catch (Exception e7) {
        }
    }
}
