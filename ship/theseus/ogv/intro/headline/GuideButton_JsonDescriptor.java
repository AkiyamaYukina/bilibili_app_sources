package com.bilibili.ship.theseus.ogv.intro.headline;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.bson.common.Types;
import java.lang.reflect.Type;
import java.util.Map;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/headline/GuideButton_JsonDescriptor.class */
public final class GuideButton_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f93112a = {new PojoPropertyDescriptor("bubble", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("link", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("title", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("report", (String[]) null, Types.parameterizedType(Map.class, new Type[]{String.class, String.class}), (Class) null, 5)};

    public GuideButton_JsonDescriptor() {
        super(GuideButton.class, f93112a);
    }

    public final Object constructWith(Object[] objArr) {
        return new GuideButton((String) objArr[0], (String) objArr[1], (String) objArr[2], (Map) objArr[3]);
    }

    public final Object get(Object obj, int i7) {
        GuideButton guideButton = (GuideButton) obj;
        if (i7 == 0) {
            return guideButton.a();
        }
        if (i7 == 1) {
            return guideButton.f93109b;
        }
        if (i7 == 2) {
            return guideButton.f93110c;
        }
        if (i7 != 3) {
            return null;
        }
        return guideButton.f93111d;
    }
}
