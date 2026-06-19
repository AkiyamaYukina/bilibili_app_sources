package com.bilibili.lib.sharewrapper.online.api;

import com.bilibili.biligame.api.bean.gamedetail.GameDetailContent;
import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.bson.common.Types;
import com.bilibili.lib.sharewrapper.online.api.ShareChannels;
import com.bilibili.studio.videoeditor.capturev3.schema.CaptureSchema;
import com.tencent.connect.common.Constants;
import java.lang.reflect.Type;
import java.util.ArrayList;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/sharewrapper/online/api/ShareChannels_JsonDescriptor.class */
public final class ShareChannels_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f64434a = {new PojoPropertyDescriptor("above_channels", (String[]) null, Types.parameterizedType(ArrayList.class, new Type[]{ShareChannels.ChannelItem.class}), (Class) null, 22), new PojoPropertyDescriptor("below_channels", (String[]) null, Types.parameterizedType(ArrayList.class, new Type[]{ShareChannels.ChannelItem.class}), (Class) null, 22), new PojoPropertyDescriptor("system_channels", (String[]) null, Types.parameterizedType(ArrayList.class, new Type[]{ShareChannels.ChannelItem.class}), (Class) null, 22), new PojoPropertyDescriptor(GameDetailContent.DetailInfo.UI_TYPE_JUMP_LINK, (String[]) null, String.class, (Class) null, 6), new PojoPropertyDescriptor("copy_link", (String[]) null, String.class, (Class) null, 6), new PojoPropertyDescriptor(Constants.PARAM_AVATAR_URI, (String[]) null, String.class, (Class) null, 2), new PojoPropertyDescriptor("text", (String[]) null, String.class, (Class) null, 2), new PojoPropertyDescriptor(CaptureSchema.JUMP_PARAMS_EXTRA, (String[]) null, ShareChannels.ChannelExtra.class, (Class) null, 6)};

    public ShareChannels_JsonDescriptor() {
        super(ShareChannels.class, f64434a);
    }

    public final Object constructWith(Object[] objArr) {
        ShareChannels shareChannels = new ShareChannels();
        Object obj = objArr[0];
        if (obj != null) {
            shareChannels.setAboveChannels((ArrayList) obj);
        }
        Object obj2 = objArr[1];
        if (obj2 != null) {
            shareChannels.setBelowChannels((ArrayList) obj2);
        }
        Object obj3 = objArr[2];
        if (obj3 != null) {
            shareChannels.setSystemChannels((ArrayList) obj3);
        }
        Object obj4 = objArr[3];
        if (obj4 != null) {
            shareChannels.setJumpLink((String) obj4);
        }
        Object obj5 = objArr[4];
        if (obj5 != null) {
            shareChannels.setCopyLink((String) obj5);
        }
        Object obj6 = objArr[5];
        if (obj6 != null) {
            shareChannels.setPicture((String) obj6);
        }
        Object obj7 = objArr[6];
        if (obj7 != null) {
            shareChannels.setText((String) obj7);
        }
        Object obj8 = objArr[7];
        if (obj8 != null) {
            shareChannels.setExtra((ShareChannels.ChannelExtra) obj8);
        }
        return shareChannels;
    }

    public final Object get(Object obj, int i7) {
        ShareChannels shareChannels = (ShareChannels) obj;
        switch (i7) {
            case 0:
                return shareChannels.getAboveChannels();
            case 1:
                return shareChannels.getBelowChannels();
            case 2:
                return shareChannels.getSystemChannels();
            case 3:
                return shareChannels.getJumpLink();
            case 4:
                return shareChannels.getCopyLink();
            case 5:
                return shareChannels.getPicture();
            case 6:
                return shareChannels.getText();
            case 7:
                return shareChannels.getExtra();
            default:
                return null;
        }
    }
}
