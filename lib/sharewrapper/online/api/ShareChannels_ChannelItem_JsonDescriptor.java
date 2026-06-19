package com.bilibili.lib.sharewrapper.online.api;

import com.bilibili.biligame.api.bean.gamedetail.GameDetailContent;
import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.bson.common.Types;
import com.bilibili.lib.sharewrapper.online.api.ShareChannels;
import com.tencent.connect.common.Constants;
import java.lang.reflect.Type;
import java.util.ArrayList;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/sharewrapper/online/api/ShareChannels_ChannelItem_JsonDescriptor.class */
public final class ShareChannels_ChannelItem_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f64433a = {new PojoPropertyDescriptor("name", (String[]) null, String.class, (Class) null, 2), new PojoPropertyDescriptor(Constants.PARAM_AVATAR_URI, (String[]) null, String.class, (Class) null, 2), new PojoPropertyDescriptor("share_channel", (String[]) null, String.class, (Class) null, 6), new PojoPropertyDescriptor("tag", (String[]) null, String.class, (Class) null, 2), new PojoPropertyDescriptor("title", (String[]) null, String.class, (Class) null, 2), new PojoPropertyDescriptor("category", (String[]) null, String.class, (Class) null, 2), new PojoPropertyDescriptor("level", (String[]) null, String.class, (Class) null, 2), new PojoPropertyDescriptor("statusList", (String[]) null, Types.parameterizedType(ArrayList.class, new Type[]{MenuStatusItem.class}), (Class) null, 18), new PojoPropertyDescriptor(GameDetailContent.DetailInfo.UI_TYPE_JUMP_LINK, (String[]) null, String.class, (Class) null, 6)};

    public ShareChannels_ChannelItem_JsonDescriptor() {
        super(ShareChannels.ChannelItem.class, f64433a);
    }

    public final Object constructWith(Object[] objArr) {
        ShareChannels.ChannelItem channelItem = new ShareChannels.ChannelItem();
        Object obj = objArr[0];
        if (obj != null) {
            channelItem.setName((String) obj);
        }
        Object obj2 = objArr[1];
        if (obj2 != null) {
            channelItem.setPicture((String) obj2);
        }
        Object obj3 = objArr[2];
        if (obj3 != null) {
            channelItem.setShareChannel((String) obj3);
        }
        Object obj4 = objArr[3];
        if (obj4 != null) {
            channelItem.setTag((String) obj4);
        }
        Object obj5 = objArr[4];
        if (obj5 != null) {
            channelItem.setTitle((String) obj5);
        }
        Object obj6 = objArr[5];
        if (obj6 != null) {
            channelItem.setCategory((String) obj6);
        }
        Object obj7 = objArr[6];
        if (obj7 != null) {
            channelItem.setLevel((String) obj7);
        }
        Object obj8 = objArr[7];
        if (obj8 != null) {
            channelItem.setStatusList((ArrayList) obj8);
        }
        Object obj9 = objArr[8];
        if (obj9 != null) {
            channelItem.setJumpLink((String) obj9);
        }
        return channelItem;
    }

    public final Object get(Object obj, int i7) {
        ShareChannels.ChannelItem channelItem = (ShareChannels.ChannelItem) obj;
        switch (i7) {
            case 0:
                return channelItem.getName();
            case 1:
                return channelItem.getPicture();
            case 2:
                return channelItem.getShareChannel();
            case 3:
                return channelItem.getTag();
            case 4:
                return channelItem.getTitle();
            case 5:
                return channelItem.getCategory();
            case 6:
                return channelItem.getLevel();
            case 7:
                return channelItem.getStatusList();
            case 8:
                return channelItem.getJumpLink();
            default:
                return null;
        }
    }
}
