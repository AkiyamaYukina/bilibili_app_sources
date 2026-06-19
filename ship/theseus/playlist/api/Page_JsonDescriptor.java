package com.bilibili.ship.theseus.playlist.api;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.bson.common.Types;
import com.bilibili.opd.app.bizcommon.context.provider.MallProviderParamsHelper;
import com.bilibili.studio.editor.moudle.sticker.v1.EditCustomizeSticker;
import java.lang.reflect.Type;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/api/Page_JsonDescriptor.class */
public final class Page_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f95268a;

    static {
        PojoPropertyDescriptor pojoPropertyDescriptor = new PojoPropertyDescriptor("dimension", (String[]) null, VideoDimension.class, (Class) null, 5);
        Class cls = Long.TYPE;
        f95268a = new PojoPropertyDescriptor[]{pojoPropertyDescriptor, new PojoPropertyDescriptor(EditCustomizeSticker.TAG_DURATION, (String[]) null, cls, (Class) null, 7), new PojoPropertyDescriptor("from", (String[]) null, String.class, (Class) null, 7), new PojoPropertyDescriptor("id", (String[]) null, cls, (Class) null, 7), new PojoPropertyDescriptor("intro", (String[]) null, String.class, (Class) null, 7), new PojoPropertyDescriptor("link", (String[]) null, String.class, (Class) null, 7), new PojoPropertyDescriptor("metas", (String[]) null, Types.parameterizedType(List.class, new Type[]{Meta.class}), (Class) null, 23), new PojoPropertyDescriptor(MallProviderParamsHelper.ActiveProviderParams.URI_QUERY_PAGE, (String[]) null, Integer.TYPE, (Class) null, 7), new PojoPropertyDescriptor("title", (String[]) null, String.class, (Class) null, 7)};
    }

    public Page_JsonDescriptor() {
        super(Page.class, f95268a);
    }

    public final Object constructWith(Object[] objArr) {
        VideoDimension videoDimension = (VideoDimension) objArr[0];
        Object obj = objArr[1];
        int i7 = obj == null ? 2 : 0;
        Long l7 = (Long) obj;
        long jLongValue = 0;
        long jLongValue2 = l7 == null ? 0L : l7.longValue();
        Object obj2 = objArr[2];
        int i8 = i7;
        if (obj2 == null) {
            i8 = i7 | 4;
        }
        String str = (String) obj2;
        Object obj3 = objArr[3];
        int i9 = i8;
        if (obj3 == null) {
            i9 = i8 | 8;
        }
        Long l8 = (Long) obj3;
        if (l8 != null) {
            jLongValue = l8.longValue();
        }
        Object obj4 = objArr[4];
        int i10 = i9;
        if (obj4 == null) {
            i10 = i9 | 16;
        }
        String str2 = (String) obj4;
        Object obj5 = objArr[5];
        int i11 = i10;
        if (obj5 == null) {
            i11 = i10 | 32;
        }
        String str3 = (String) obj5;
        Object obj6 = objArr[6];
        int i12 = i11;
        if (obj6 == null) {
            i12 = i11 | 64;
        }
        List list = (List) obj6;
        Object obj7 = objArr[7];
        int i13 = i12;
        if (obj7 == null) {
            i13 = i12 | 128;
        }
        Integer num = (Integer) obj7;
        int iIntValue = num == null ? 0 : num.intValue();
        Object obj8 = objArr[8];
        if (obj8 == null) {
            i13 |= 256;
        }
        return new Page(videoDimension, jLongValue2, str, jLongValue, str2, str3, list, iIntValue, (String) obj8, i13);
    }

    public final Object get(Object obj, int i7) {
        Page page = (Page) obj;
        switch (i7) {
            case 0:
                return page.f95260a;
            case 1:
                return Long.valueOf(page.f95261b);
            case 2:
                return page.f95262c;
            case 3:
                return Long.valueOf(page.f95263d);
            case 4:
                return page.f95264e;
            case 5:
                return page.f95265f;
            case 6:
                return page.f95266g;
            case 7:
                return Integer.valueOf(page.h);
            case 8:
                return page.f95267i;
            default:
                return null;
        }
    }
}
