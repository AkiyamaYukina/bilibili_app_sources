package com.bilibili.ship.theseus.united.page.restrictionlayer;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/restrictionlayer/QRCode_JsonDescriptor.class */
public final class QRCode_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f102631a = {new PojoPropertyDescriptor("link", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("link_desc", (String[]) null, String.class, (Class) null, 5)};

    public QRCode_JsonDescriptor() {
        super(QRCode.class, f102631a);
    }

    public final Object constructWith(Object[] objArr) {
        return new QRCode((String) objArr[0], (String) objArr[1]);
    }

    public final Object get(Object obj, int i7) {
        QRCode qRCode = (QRCode) obj;
        if (i7 == 0) {
            return qRCode.f102629a;
        }
        if (i7 != 1) {
            return null;
        }
        return qRCode.f102630b;
    }
}
