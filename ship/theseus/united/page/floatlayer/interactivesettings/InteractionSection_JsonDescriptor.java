package com.bilibili.ship.theseus.united.page.floatlayer.interactivesettings;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.bson.common.Types;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/floatlayer/interactivesettings/InteractionSection_JsonDescriptor.class */
public final class InteractionSection_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f99775a = {new PojoPropertyDescriptor("tip_text", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("tip_sub_text", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("interaction_status", (String[]) null, Types.parameterizedType(List.class, new Type[]{InteractionItem.class}), (Class) null, 23)};

    public InteractionSection_JsonDescriptor() {
        super(InteractionSection.class, f99775a);
    }

    public final Object constructWith(Object[] objArr) {
        char c7 = 0;
        String str = (String) objArr[0];
        String str2 = (String) objArr[1];
        Object obj = objArr[2];
        if (obj == null) {
            c7 = 4;
        }
        List listEmptyList = (List) obj;
        if ((c7 & 4) != 0) {
            listEmptyList = CollectionsKt.emptyList();
        }
        return new InteractionSection(str, str2, listEmptyList);
    }

    public final Object get(Object obj, int i7) {
        InteractionSection interactionSection = (InteractionSection) obj;
        if (i7 == 0) {
            return interactionSection.f();
        }
        if (i7 == 1) {
            return interactionSection.e();
        }
        if (i7 != 2) {
            return null;
        }
        return interactionSection.d();
    }
}
