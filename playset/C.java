package com.bilibili.playset;

import com.bapis.bilibili.broadcast.message.mall.MsgType;
import com.bapis.bilibili.broadcast.message.mall.NotifyReq;
import com.bilibili.droid.ToastHelper;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.lib.ui.BaseAppCompatActivity;
import com.bilibili.playset.api.MultitypeMedia;
import com.bilibili.pvtracker.PageViewTracker;
import com.mall.ui.page.shop.call.ComingDialogActivity;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/C.class */
public final /* synthetic */ class C implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f83850a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BaseAppCompatActivity f83851b;

    public /* synthetic */ C(int i7, BaseAppCompatActivity baseAppCompatActivity) {
        this.f83850a = i7;
        this.f83851b = baseAppCompatActivity;
    }

    public final Object invoke(Object obj) {
        MultitypeMedia multitypeMedia;
        String string;
        ComingDialogActivity comingDialogActivity = this.f83851b;
        switch (this.f83850a) {
            case 0:
                int iIntValue = ((Integer) obj).intValue();
                os0.r rVar = ((MultiTypeListDetailActivity) comingDialogActivity).f83921Z0;
                if (rVar != null && (multitypeMedia = (MultitypeMedia) CollectionsKt.getOrNull(rVar.f124966a, iIntValue)) != null) {
                    Long l7 = rVar.f124970e;
                    long jLongValue = l7 != null ? l7.longValue() : 0L;
                    MultitypeMedia multitypeMedia2 = multitypeMedia.season;
                    if (multitypeMedia2 == null) {
                        string = String.valueOf(multitypeMedia.id);
                    } else {
                        long j7 = multitypeMedia.id;
                        long j8 = multitypeMedia2.id;
                        StringBuilder sb = new StringBuilder();
                        sb.append(j7);
                        sb.append(Long.valueOf(j8));
                        string = sb.toString();
                    }
                    Boolean bool = (Boolean) ((LinkedHashMap) rVar.f124972g).get(string);
                    Boolean bool2 = Boolean.TRUE;
                    if (!Intrinsics.areEqual(bool, bool2)) {
                        rVar.f124972g.put(string, bool2);
                        int i7 = multitypeMedia.type;
                        String str = i7 != 2 ? i7 != 21 ? i7 != 24 ? null : "pgcvideo_detail" : "drama" : multitypeMedia.season != null ? "drama_ugcvideo_detail" : "ugcvideo_detail";
                        if (str != null) {
                            Pair pair = TuplesKt.to("flow", str);
                            String strCurrentPolarisActionId = PageViewTracker.getInstance().currentPolarisActionId();
                            String str2 = strCurrentPolarisActionId;
                            if (strCurrentPolarisActionId == null) {
                                str2 = "";
                            }
                            Neurons.reportExposure$default(false, "playlist.playlist-detail.detailpage-contentlist.0.show", MapsKt.mapOf(new Pair[]{pair, TuplesKt.to("action_id", str2), TuplesKt.to("playlist_id", String.valueOf(jLongValue)), TuplesKt.to("oid", String.valueOf(multitypeMedia.id)), TuplesKt.to("fav_type", String.valueOf(multitypeMedia.type))}), (List) null, 8, (Object) null);
                        }
                    }
                }
                break;
            default:
                int i8 = ComingDialogActivity.L;
                if (((NotifyReq) obj).getMsgType() == MsgType.MERCHANT_REJET.ordinal()) {
                    ComingDialogActivity comingDialogActivity2 = comingDialogActivity;
                    ToastHelper.showToastLong(comingDialogActivity2.getApplicationContext(), 2131831232);
                    comingDialogActivity2.finish();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
