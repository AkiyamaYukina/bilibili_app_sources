package com.bilibili.pegasus.components;

import androidx.lifecycle.Observer;
import com.bilibili.bus.IIdentifiedData;
import com.bilibili.pegasus.PegasusHolderData;
import com.bilibili.pegasus.data.card.IUgcVideoInfoItem;
import com.bilibili.pegasus.vm.PegasusViewModel;
import com.bilibili.playerbizcommon.message.VideoStatusMessage;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.collections.CollectionsKt;
import mp0.C8028c;

/* JADX INFO: renamed from: com.bilibili.pegasus.components.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/v.class */
public final class C5640v implements Observer<List<VideoStatusMessage>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5642x f77178a;

    public C5640v(C5642x c5642x) {
        this.f77178a = c5642x;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(List<VideoStatusMessage> list) {
        List<IUgcVideoInfoItem> videoList;
        VideoStatusMessage videoStatusMessage;
        HashMap map = new HashMap();
        for (IIdentifiedData iIdentifiedData : list) {
            map.put(iIdentifiedData.getId(), iIdentifiedData);
        }
        ArrayList<PegasusHolderData> arrayList = new ArrayList();
        C5642x c5642x = this.f77178a;
        for (IUgcVideoInfoItem iUgcVideoInfoItem : CollectionsKt.asSequence(((C8028c) c5642x.b().f79020m.getValue()).f123831a.f123826a)) {
            IUgcVideoInfoItem iUgcVideoInfoItem2 = iUgcVideoInfoItem instanceof IUgcVideoInfoItem ? iUgcVideoInfoItem : null;
            if (iUgcVideoInfoItem2 != null && (videoStatusMessage = (VideoStatusMessage) map.get(Long.valueOf(iUgcVideoInfoItem2.getAid()))) != null) {
                arrayList.add(iUgcVideoInfoItem);
                iUgcVideoInfoItem2.updateByMsg(videoStatusMessage);
            }
            fp0.g gVar = iUgcVideoInfoItem instanceof fp0.g ? (fp0.g) iUgcVideoInfoItem : null;
            if (gVar != null && (videoList = gVar.getVideoList()) != null) {
                for (IUgcVideoInfoItem iUgcVideoInfoItem3 : videoList) {
                    VideoStatusMessage videoStatusMessage2 = (VideoStatusMessage) map.get(Long.valueOf(iUgcVideoInfoItem3.getAid()));
                    if (videoStatusMessage2 != null) {
                        arrayList.add(iUgcVideoInfoItem);
                        iUgcVideoInfoItem3.updateByMsg(videoStatusMessage2);
                    }
                }
            }
        }
        for (PegasusHolderData pegasusHolderData : arrayList) {
            PegasusViewModel pegasusViewModelB = c5642x.b();
            pegasusViewModelB.getClass();
            pegasusViewModelB.z(pegasusViewModelB, new com.bilibili.pegasus.vm.k(pegasusHolderData, "ugc_video_info_msg"));
        }
    }
}
