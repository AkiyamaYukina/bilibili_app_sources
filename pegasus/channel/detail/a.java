package com.bilibili.pegasus.channel.detail;

import Nn0.r;
import com.bilibili.app.comm.list.common.channel.detail.IChannelDetailPage;
import com.bilibili.okretro.BiliApiDataCallback;
import com.bilibili.pegasus.api.model.Channel;
import com.bilibili.pegasus.api.model.ChannelDataItem;
import com.bilibili.pegasus.channel.detail.ChannelConvergeDetailFragment;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channel/detail/a.class */
public final class a extends BiliApiDataCallback<Channel> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ChannelConvergeDetailFragment f74904b;

    public a(ChannelConvergeDetailFragment channelConvergeDetailFragment) {
        this.f74904b = channelConvergeDetailFragment;
    }

    @Override // com.bilibili.okretro.BiliApiCallback
    public final boolean isCancel() {
        return this.f74904b.activityDie();
    }

    @Override // com.bilibili.okretro.BiliApiDataCallback
    public final void onDataSuccess(Channel channel) {
        Channel channel2 = channel;
        if (channel2 == null) {
            onError(null);
        } else {
            this.f74904b.kf(new ChannelDataItem(channel2));
        }
    }

    @Override // com.bilibili.okretro.BiliApiCallback
    public final void onError(Throwable th) {
        ChannelConvergeDetailFragment channelConvergeDetailFragment = this.f74904b;
        channelConvergeDetailFragment.kf(null);
        r rVar = channelConvergeDetailFragment.f74835d;
        if (rVar != null) {
            ChannelConvergeDetailFragment.a aVar = channelConvergeDetailFragment.h;
            ArrayList arrayList = rVar.f17330c.k;
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    IChannelDetailPage iChannelDetailPageB = rVar.b(((ChannelDataItem.ChannelTabItem) it.next()).getId());
                    IChannelDetailPage iChannelDetailPage = iChannelDetailPageB instanceof IChannelDetailPage ? iChannelDetailPageB : null;
                    if (iChannelDetailPage != null) {
                        iChannelDetailPage.setRefreshCallback(aVar);
                    }
                    Unit unit = Unit.INSTANCE;
                }
            }
        }
    }
}
