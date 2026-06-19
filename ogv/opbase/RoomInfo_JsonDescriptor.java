package com.bilibili.ogv.opbase;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.bson.common.Types;
import com.bilibili.studio.editor.moudle.sticker.v1.EditCustomizeSticker;
import java.lang.reflect.Type;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/opbase/RoomInfo_JsonDescriptor.class */
public final class RoomInfo_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f69941a;

    static {
        Class cls = Long.TYPE;
        f69941a = new PojoPropertyDescriptor[]{new PojoPropertyDescriptor("hot", (String[]) null, cls, (Class) null, 5), new PojoPropertyDescriptor("count", (String[]) null, cls, (Class) null, 5), new PojoPropertyDescriptor("recent_watchers", (String[]) null, Types.parameterizedType(List.class, new Type[]{RecentWatcher.class}), (Class) null, 20), new PojoPropertyDescriptor("face", (String[]) null, String.class, (Class) null, 4), new PojoPropertyDescriptor(EditCustomizeSticker.TAG_MID, (String[]) null, String.class, (Class) null, 4)};
    }

    public RoomInfo_JsonDescriptor() {
        super(RoomInfo.class, f69941a);
    }

    public final Object constructWith(Object[] objArr) {
        Long l7 = (Long) objArr[0];
        long jLongValue = l7 == null ? 0L : l7.longValue();
        Long l8 = (Long) objArr[1];
        return new RoomInfo(jLongValue, l8 == null ? 0L : l8.longValue(), (List) objArr[2], (String) objArr[3], (String) objArr[4]);
    }

    public final Object get(Object obj, int i7) {
        RoomInfo roomInfo = (RoomInfo) obj;
        if (i7 == 0) {
            return Long.valueOf(roomInfo.f69936a);
        }
        if (i7 == 1) {
            return Long.valueOf(roomInfo.f69937b);
        }
        if (i7 == 2) {
            return roomInfo.f69938c;
        }
        if (i7 == 3) {
            return roomInfo.a();
        }
        if (i7 != 4) {
            return null;
        }
        return roomInfo.f69940e;
    }
}
