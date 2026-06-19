package com.bilibili.search2.result.all;

import android.util.ArrayMap;
import android.view.View;
import com.bilibili.lib.neuron.api.Neurons;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import tv.danmaku.bili.ui.garb.api.collection.BiliCollectionGlobalInfoSideBarData;
import tv.danmaku.bili.ui.garb.api.collection.TopCollectionSettingJumpUrlPageFrom;
import tv.danmaku.bili.ui.garb.manager.CollectionSideManager;
import yt0.C9099l;

/* JADX INFO: renamed from: com.bilibili.search2.result.all.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/all/j.class */
public final /* synthetic */ class ViewOnClickListenerC6056j implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f87293a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f87294b;

    public /* synthetic */ ViewOnClickListenerC6056j(Object obj, int i7) {
        this.f87293a = i7;
        this.f87294b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String strT;
        switch (this.f87293a) {
            case 0:
                ((PubDatePickerFragment) this.f87294b).dismissAllowingStateLoss();
                break;
            case 1:
                CollectionSideManager collectionSideManager = (CollectionSideManager) this.f87294b;
                BiliCollectionGlobalInfoSideBarData biliCollectionGlobalInfoSideBarData = collectionSideManager.b;
                if (biliCollectionGlobalInfoSideBarData != null && (strT = biliCollectionGlobalInfoSideBarData.t()) != null) {
                    com.bilibili.app.authorspace.ui.nft.utils.r.c(collectionSideManager.a.a.getContext(), strT, MapsKt.mapOf(TuplesKt.to("page_from", TopCollectionSettingJumpUrlPageFrom.DRAWER_BAR_SETTING_BUTTON.getReportValue())));
                }
                ArrayMap arrayMap = new ArrayMap();
                arrayMap.put("part_id", String.valueOf(101));
                Neurons.reportClick(false, "sqzz.dressing.collection.setting-set.click", arrayMap);
                collectionSideManager.b();
                break;
            default:
                ((C9099l) this.f87294b).g(false);
                break;
        }
    }
}
