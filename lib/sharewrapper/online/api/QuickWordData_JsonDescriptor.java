package com.bilibili.lib.sharewrapper.online.api;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.lib.sharewrapper.online.api.ShareChannels;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/sharewrapper/online/api/QuickWordData_JsonDescriptor.class */
public final class QuickWordData_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f64431a = {new PojoPropertyDescriptor("channel", (String[]) null, ShareChannels.ChannelItem.class, (Class) null, 6), new PojoPropertyDescriptor("word", (String[]) null, String.class, (Class) null, 2), new PojoPropertyDescriptor("link", (String[]) null, String.class, (Class) null, 2)};

    public QuickWordData_JsonDescriptor() {
        super(QuickWordData.class, f64431a);
    }

    public final Object constructWith(Object[] objArr) {
        QuickWordData quickWordData = new QuickWordData();
        Object obj = objArr[0];
        if (obj != null) {
            quickWordData.channelItem = (ShareChannels.ChannelItem) obj;
        }
        Object obj2 = objArr[1];
        if (obj2 != null) {
            quickWordData.word = (String) obj2;
        }
        Object obj3 = objArr[2];
        if (obj3 != null) {
            quickWordData.link = (String) obj3;
        }
        return quickWordData;
    }

    public final Object get(Object obj, int i7) {
        QuickWordData quickWordData = (QuickWordData) obj;
        if (i7 == 0) {
            return quickWordData.channelItem;
        }
        if (i7 == 1) {
            return quickWordData.word;
        }
        if (i7 != 2) {
            return null;
        }
        return quickWordData.link;
    }
}
