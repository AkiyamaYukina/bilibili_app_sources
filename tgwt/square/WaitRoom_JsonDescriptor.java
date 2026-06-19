package com.bilibili.tgwt.square;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.bson.common.Types;
import java.lang.reflect.Type;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/square/WaitRoom_JsonDescriptor.class */
public final class WaitRoom_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f112101a;

    static {
        PojoPropertyDescriptor pojoPropertyDescriptor = new PojoPropertyDescriptor("owner_face", (String[]) null, String.class, (Class) null, 4);
        PojoPropertyDescriptor pojoPropertyDescriptor2 = new PojoPropertyDescriptor("owner_name", (String[]) null, String.class, (Class) null, 4);
        PojoPropertyDescriptor pojoPropertyDescriptor3 = new PojoPropertyDescriptor("owner_sex_icon", (String[]) null, String.class, (Class) null, 4);
        PojoPropertyDescriptor pojoPropertyDescriptor4 = new PojoPropertyDescriptor("play_desc", (String[]) null, String.class, (Class) null, 4);
        Class cls = Integer.TYPE;
        f112101a = new PojoPropertyDescriptor[]{pojoPropertyDescriptor, pojoPropertyDescriptor2, pojoPropertyDescriptor3, pojoPropertyDescriptor4, new PojoPropertyDescriptor("had_started", (String[]) null, cls, (Class) null, 5), new PojoPropertyDescriptor("recent_watchers", (String[]) null, Types.parameterizedType(List.class, new Type[]{RecentWatcher.class}), (Class) null, 20), new PojoPropertyDescriptor("desc2", (String[]) null, String.class, (Class) null, 4), new PojoPropertyDescriptor("icon2", (String[]) null, String.class, (Class) null, 4), new PojoPropertyDescriptor("progress_percent", (String[]) null, cls, (Class) null, 5), new PojoPropertyDescriptor("in_room", (String[]) null, Boolean.TYPE, (Class) null, 5)};
    }

    public WaitRoom_JsonDescriptor() {
        super(WaitRoom.class, f112101a);
    }

    public final Object constructWith(Object[] objArr) {
        String str = (String) objArr[0];
        String str2 = (String) objArr[1];
        String str3 = (String) objArr[2];
        String str4 = (String) objArr[3];
        Integer num = (Integer) objArr[4];
        int iIntValue = num == null ? 0 : num.intValue();
        List list = (List) objArr[5];
        String str5 = (String) objArr[6];
        String str6 = (String) objArr[7];
        Integer num2 = (Integer) objArr[8];
        int iIntValue2 = num2 == null ? 0 : num2.intValue();
        Boolean bool = (Boolean) objArr[9];
        return new WaitRoom(str, str2, str3, str4, iIntValue, list, str5, str6, iIntValue2, bool == null ? false : bool.booleanValue());
    }

    public final Object get(Object obj, int i7) {
        WaitRoom waitRoom = (WaitRoom) obj;
        switch (i7) {
            case 0:
                return waitRoom.f112092a;
            case 1:
                return waitRoom.f112093b;
            case 2:
                return waitRoom.f112094c;
            case 3:
                return waitRoom.f112095d;
            case 4:
                return Integer.valueOf(waitRoom.f112096e);
            case 5:
                return waitRoom.f112097f;
            case 6:
                return waitRoom.f112098g;
            case 7:
                return waitRoom.h;
            case 8:
                return Integer.valueOf(waitRoom.a());
            case 9:
                return Boolean.valueOf(waitRoom.f112100j);
            default:
                return null;
        }
    }
}
