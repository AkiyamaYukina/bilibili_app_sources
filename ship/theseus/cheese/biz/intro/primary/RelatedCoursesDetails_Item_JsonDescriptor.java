package com.bilibili.ship.theseus.cheese.biz.intro.primary;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.bson.common.Types;
import com.bilibili.ship.theseus.cheese.biz.intro.primary.RelatedCoursesDetails;
import java.lang.reflect.Type;
import java.util.Map;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/primary/RelatedCoursesDetails_Item_JsonDescriptor.class */
public final class RelatedCoursesDetails_Item_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f89676a;

    static {
        PojoPropertyDescriptor pojoPropertyDescriptor = new PojoPropertyDescriptor("ep_count_desc", (String[]) null, String.class, (Class) null, 5);
        PojoPropertyDescriptor pojoPropertyDescriptor2 = new PojoPropertyDescriptor("origin_price_model", (String[]) null, RelatedCoursesDetails.Price.class, (Class) null, 5);
        PojoPropertyDescriptor pojoPropertyDescriptor3 = new PojoPropertyDescriptor("sale_price_model", (String[]) null, RelatedCoursesDetails.Price.class, (Class) null, 5);
        Class cls = Boolean.TYPE;
        f89676a = new PojoPropertyDescriptor[]{pojoPropertyDescriptor, pojoPropertyDescriptor2, pojoPropertyDescriptor3, new PojoPropertyDescriptor("is_paid", (String[]) null, cls, (Class) null, 5), new PojoPropertyDescriptor("season_cover", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("season_id", (String[]) null, Long.TYPE, (Class) null, 5), new PojoPropertyDescriptor("season_title", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("selected", (String[]) null, cls, (Class) null, 5), new PojoPropertyDescriptor("views_desc", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("tab", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("report", (String[]) null, Types.parameterizedType(Map.class, new Type[]{String.class, String.class}), (Class) null, 5)};
    }

    public RelatedCoursesDetails_Item_JsonDescriptor() {
        super(RelatedCoursesDetails.Item.class, f89676a);
    }

    public final Object constructWith(Object[] objArr) {
        boolean zBooleanValue = false;
        String str = (String) objArr[0];
        RelatedCoursesDetails.Price price = (RelatedCoursesDetails.Price) objArr[1];
        RelatedCoursesDetails.Price price2 = (RelatedCoursesDetails.Price) objArr[2];
        Boolean bool = (Boolean) objArr[3];
        boolean zBooleanValue2 = bool == null ? false : bool.booleanValue();
        String str2 = (String) objArr[4];
        Long l7 = (Long) objArr[5];
        long jLongValue = l7 == null ? 0L : l7.longValue();
        String str3 = (String) objArr[6];
        Boolean bool2 = (Boolean) objArr[7];
        if (bool2 != null) {
            zBooleanValue = bool2.booleanValue();
        }
        return new RelatedCoursesDetails.Item(str, price, price2, zBooleanValue2, str2, jLongValue, str3, zBooleanValue, (String) objArr[8], (String) objArr[9], (Map) objArr[10]);
    }

    public final Object get(Object obj, int i7) {
        RelatedCoursesDetails.Item item = (RelatedCoursesDetails.Item) obj;
        switch (i7) {
            case 0:
                return item.f89663a;
            case 1:
                return item.f89664b;
            case 2:
                return item.f89665c;
            case 3:
                return Boolean.valueOf(item.a());
            case 4:
                return item.f89667e;
            case 5:
                return Long.valueOf(item.f89668f);
            case 6:
                return item.f89669g;
            case 7:
                return Boolean.valueOf(item.h);
            case 8:
                return item.f89670i;
            case 9:
                return item.f89671j;
            case 10:
                return item.f89672k;
            default:
                return null;
        }
    }
}
