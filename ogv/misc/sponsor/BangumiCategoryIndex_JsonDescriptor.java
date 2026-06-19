package com.bilibili.ogv.misc.sponsor;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.bson.common.Types;
import com.bilibili.ogv.misc.sponsor.BangumiCategoryIndex;
import java.lang.reflect.Type;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/sponsor/BangumiCategoryIndex_JsonDescriptor.class */
public final class BangumiCategoryIndex_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f69325a = {new PojoPropertyDescriptor("list", (String[]) null, Types.parameterizedType(List.class, new Type[]{BangumiCategoryIndex.Bangumi.class}), (Class) null, 2), new PojoPropertyDescriptor("pages", (String[]) null, Integer.TYPE, (Class) null, 3)};

    public BangumiCategoryIndex_JsonDescriptor() {
        super(BangumiCategoryIndex.class, f69325a);
    }

    public final Object constructWith(Object[] objArr) {
        BangumiCategoryIndex bangumiCategoryIndex = new BangumiCategoryIndex();
        Object obj = objArr[0];
        if (obj != null) {
            bangumiCategoryIndex.f69313a = (List) obj;
        }
        Object obj2 = objArr[1];
        if (obj2 != null) {
            bangumiCategoryIndex.f69314b = ((Integer) obj2).intValue();
        }
        return bangumiCategoryIndex;
    }

    public final Object get(Object obj, int i7) {
        BangumiCategoryIndex bangumiCategoryIndex = (BangumiCategoryIndex) obj;
        if (i7 == 0) {
            return bangumiCategoryIndex.f69313a;
        }
        if (i7 != 1) {
            return null;
        }
        return Integer.valueOf(bangumiCategoryIndex.f69314b);
    }
}
