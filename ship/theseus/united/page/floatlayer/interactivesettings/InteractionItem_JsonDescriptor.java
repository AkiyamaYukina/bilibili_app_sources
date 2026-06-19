package com.bilibili.ship.theseus.united.page.floatlayer.interactivesettings;

import androidx.core.app.NotificationCompat;
import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/floatlayer/interactivesettings/InteractionItem_JsonDescriptor.class */
public final class InteractionItem_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f99768a;

    static {
        PojoPropertyDescriptor pojoPropertyDescriptor = new PojoPropertyDescriptor("name", (String[]) null, String.class, (Class) null, 5);
        Class cls = Integer.TYPE;
        f99768a = new PojoPropertyDescriptor[]{pojoPropertyDescriptor, new PojoPropertyDescriptor("type", (String[]) null, cls, (Class) null, 5), new PojoPropertyDescriptor(NotificationCompat.CATEGORY_STATUS, (String[]) null, cls, (Class) null, 5), new PojoPropertyDescriptor("jump_url", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("sub_title", (String[]) null, String.class, (Class) null, 5)};
    }

    public InteractionItem_JsonDescriptor() {
        super(InteractionItem.class, f99768a);
    }

    public final Object constructWith(Object[] objArr) {
        int iIntValue = 0;
        String str = (String) objArr[0];
        Integer num = (Integer) objArr[1];
        int iIntValue2 = num == null ? 0 : num.intValue();
        Integer num2 = (Integer) objArr[2];
        if (num2 != null) {
            iIntValue = num2.intValue();
        }
        return new InteractionItem(str, iIntValue2, iIntValue, (String) objArr[3], (String) objArr[4]);
    }

    public final Object get(Object obj, int i7) {
        int iH;
        InteractionItem interactionItem = (InteractionItem) obj;
        if (i7 == 0) {
            return interactionItem.e();
        }
        if (i7 == 1) {
            iH = interactionItem.h();
        } else {
            if (i7 != 2) {
                if (i7 == 3) {
                    return interactionItem.d();
                }
                if (i7 != 4) {
                    return null;
                }
                return interactionItem.g();
            }
            iH = interactionItem.f();
        }
        return Integer.valueOf(iH);
    }
}
