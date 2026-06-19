package com.bilibili.ship.theseus.ogv.intro.followup;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/followup/GuideDescription_JsonDescriptor.class */
public final class GuideDescription_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f93041a = {new PojoPropertyDescriptor("title", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("info", (String[]) null, String.class, (Class) null, 5)};

    public GuideDescription_JsonDescriptor() {
        super(GuideDescription.class, f93041a);
    }

    public final Object constructWith(Object[] objArr) {
        return new GuideDescription((String) objArr[0], (String) objArr[1]);
    }

    public final Object get(Object obj, int i7) {
        GuideDescription guideDescription = (GuideDescription) obj;
        if (i7 == 0) {
            return guideDescription.f93039a;
        }
        if (i7 != 1) {
            return null;
        }
        return guideDescription.a();
    }
}
