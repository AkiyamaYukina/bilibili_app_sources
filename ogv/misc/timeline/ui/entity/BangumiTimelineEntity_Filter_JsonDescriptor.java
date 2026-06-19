package com.bilibili.ogv.misc.timeline.ui.entity;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.ogv.misc.timeline.ui.entity.BangumiTimelineEntity;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/timeline/ui/entity/BangumiTimelineEntity_Filter_JsonDescriptor.class */
public final class BangumiTimelineEntity_Filter_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f69560a = {new PojoPropertyDescriptor("desc", (String[]) null, String.class, (Class) null, 7), new PojoPropertyDescriptor("type", (String[]) null, Integer.TYPE, (Class) null, 7), new PojoPropertyDescriptor("isSelected", (String[]) null, Boolean.TYPE, (Class) null, 3)};

    public BangumiTimelineEntity_Filter_JsonDescriptor() {
        super(BangumiTimelineEntity.Filter.class, f69560a);
    }

    public final Object constructWith(Object[] objArr) {
        BangumiTimelineEntity.Filter filter = new BangumiTimelineEntity.Filter();
        Object obj = objArr[0];
        if (obj != null) {
            filter.c((String) obj);
        }
        Object obj2 = objArr[1];
        if (obj2 != null) {
            filter.d(((Integer) obj2).intValue());
        }
        Object obj3 = objArr[2];
        if (obj3 != null) {
            filter.f69559c = ((Boolean) obj3).booleanValue();
        }
        return filter;
    }

    public final Object get(Object obj, int i7) {
        BangumiTimelineEntity.Filter filter = (BangumiTimelineEntity.Filter) obj;
        if (i7 == 0) {
            return filter.a();
        }
        if (i7 == 1) {
            return Integer.valueOf(filter.b());
        }
        if (i7 != 2) {
            return null;
        }
        return Boolean.valueOf(filter.f69559c);
    }
}
