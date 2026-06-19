package com.bilibili.lib.projection.internal.search.searchv2;

import De0.C1572e;
import com.bilibili.lib.projection.commonburid.CastEventTrackingManager;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/search/searchv2/j.class */
public final /* synthetic */ class j implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SearchPanelContainer f63806a;

    @Override // java.lang.Runnable
    public final void run() {
        SearchPanelContainer searchPanelContainer = this.f63806a;
        C1572e.f2836a.getClass();
        Boolean bool = (Boolean) ((ConcurrentHashMap) C1572e.f2838c).get("9");
        if (bool != null ? bool.booleanValue() : false) {
            return;
        }
        int size = searchPanelContainer.getBiliTVDevices$biliscreencast_release().size();
        int size2 = searchPanelContainer.getVehicleDevices$biliscreencast_release().size();
        int size3 = searchPanelContainer.getThirdPartyDevices$biliscreencast_release().size();
        int size4 = searchPanelContainer.getPartnerDevices$biliscreencast_release().size();
        if (size == 0 && size2 == 0 && size3 == 0 && size4 == 0) {
            CastEventTrackingManager.Companion.instance().trackShow("main.public.screencast-panel-help.0.show", MapsKt.mapOf(TuplesKt.to("refresh_index", String.valueOf(searchPanelContainer.getRefreshCount()))));
            ((ConcurrentHashMap) C1572e.f2838c).put("9", Boolean.TRUE);
        }
    }
}
