package com.bilibili.lib.sharewrapper.online.api;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.bson.common.Types;
import com.bilibili.lib.sharewrapper.online.api.ShareChannels;
import java.lang.reflect.Type;
import java.util.ArrayList;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/sharewrapper/online/api/PlacardData_JsonDescriptor.class */
public final class PlacardData_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f64430a = {new PojoPropertyDescriptor("channels", (String[]) null, Types.parameterizedType(ArrayList.class, new Type[]{ShareChannels.ChannelItem.class}), (Class) null, 6), new PojoPropertyDescriptor("link", (String[]) null, String.class, (Class) null, 6)};

    public PlacardData_JsonDescriptor() {
        super(PlacardData.class, f64430a);
    }

    public final Object constructWith(Object[] objArr) {
        PlacardData placardData = new PlacardData();
        Object obj = objArr[0];
        if (obj != null) {
            placardData.channelItems = (ArrayList) obj;
        }
        Object obj2 = objArr[1];
        if (obj2 != null) {
            placardData.link = (String) obj2;
        }
        return placardData;
    }

    public final Object get(Object obj, int i7) {
        PlacardData placardData = (PlacardData) obj;
        if (i7 == 0) {
            return placardData.channelItems;
        }
        if (i7 != 1) {
            return null;
        }
        return placardData.link;
    }
}
