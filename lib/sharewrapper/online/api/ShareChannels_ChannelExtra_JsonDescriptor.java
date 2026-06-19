package com.bilibili.lib.sharewrapper.online.api;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.lib.sharewrapper.online.api.ShareChannels;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/sharewrapper/online/api/ShareChannels_ChannelExtra_JsonDescriptor.class */
public final class ShareChannels_ChannelExtra_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f64432a = {new PojoPropertyDescriptor("quick_message_on", (String[]) null, Boolean.TYPE, (Class) null, 7)};

    public ShareChannels_ChannelExtra_JsonDescriptor() {
        super(ShareChannels.ChannelExtra.class, f64432a);
    }

    public final Object constructWith(Object[] objArr) {
        ShareChannels.ChannelExtra channelExtra = new ShareChannels.ChannelExtra();
        Object obj = objArr[0];
        if (obj != null) {
            channelExtra.setMessageOn(((Boolean) obj).booleanValue());
        }
        return channelExtra;
    }

    public final Object get(Object obj, int i7) {
        ShareChannels.ChannelExtra channelExtra = (ShareChannels.ChannelExtra) obj;
        if (i7 != 0) {
            return null;
        }
        return Boolean.valueOf(channelExtra.getMessageOn());
    }
}
