package com.bilibili.ship.theseus.united.page.restrictionlayer;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/restrictionlayer/LinkOperationAction_JsonDescriptor.class */
public final class LinkOperationAction_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f102573a = {new PojoPropertyDescriptor("link", (String[]) null, String.class, (Class) null, 1)};

    public LinkOperationAction_JsonDescriptor() {
        super(LinkOperationAction.class, f102573a);
    }

    public final Object constructWith(Object[] objArr) {
        return new LinkOperationAction((String) objArr[0]);
    }

    public final Object get(Object obj, int i7) {
        LinkOperationAction linkOperationAction = (LinkOperationAction) obj;
        if (i7 != 0) {
            return null;
        }
        return linkOperationAction.f102572a;
    }
}
