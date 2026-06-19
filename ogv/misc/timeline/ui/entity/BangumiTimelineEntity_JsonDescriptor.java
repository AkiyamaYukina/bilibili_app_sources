package com.bilibili.ogv.misc.timeline.ui.entity;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.bson.common.Types;
import com.bilibili.ogv.misc.timeline.BangumiTimelinePagerAdapter;
import com.bilibili.ogv.misc.timeline.ui.entity.BangumiTimelineEntity;
import java.lang.reflect.Type;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/timeline/ui/entity/BangumiTimelineEntity_JsonDescriptor.class */
public final class BangumiTimelineEntity_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f69561a = {new PojoPropertyDescriptor("filter", (String[]) null, Types.parameterizedType(List.class, new Type[]{BangumiTimelineEntity.Filter.class}), (Class) null, 22), new PojoPropertyDescriptor(BangumiTimelinePagerAdapter.BangumiTimelineFragment.BUNDLE_CURRENT_TIME_TEXT, (String[]) null, String.class, (Class) null, 7), new PojoPropertyDescriptor("data", (String[]) null, Types.parameterizedType(List.class, new Type[]{BangumiTimelineDay.class}), (Class) null, 22), new PojoPropertyDescriptor("is_night_mode", (String[]) null, Boolean.TYPE, (Class) null, 7), new PojoPropertyDescriptor("navigation_title", (String[]) null, String.class, (Class) null, 6)};

    public BangumiTimelineEntity_JsonDescriptor() {
        super(BangumiTimelineEntity.class, f69561a);
    }

    public final Object constructWith(Object[] objArr) {
        BangumiTimelineEntity bangumiTimelineEntity = new BangumiTimelineEntity();
        Object obj = objArr[0];
        if (obj != null) {
            bangumiTimelineEntity.h((List) obj);
        }
        Object obj2 = objArr[1];
        if (obj2 != null) {
            bangumiTimelineEntity.f((String) obj2);
        }
        Object obj3 = objArr[2];
        if (obj3 != null) {
            bangumiTimelineEntity.g((List) obj3);
        }
        Object obj4 = objArr[3];
        if (obj4 != null) {
            bangumiTimelineEntity.i(((Boolean) obj4).booleanValue());
        }
        Object obj5 = objArr[4];
        if (obj5 != null) {
            bangumiTimelineEntity.j((String) obj5);
        }
        return bangumiTimelineEntity;
    }

    public final Object get(Object obj, int i7) {
        BangumiTimelineEntity bangumiTimelineEntity = (BangumiTimelineEntity) obj;
        if (i7 == 0) {
            return bangumiTimelineEntity.c();
        }
        if (i7 == 1) {
            return bangumiTimelineEntity.a();
        }
        if (i7 == 2) {
            return bangumiTimelineEntity.b();
        }
        if (i7 == 3) {
            return Boolean.valueOf(bangumiTimelineEntity.e());
        }
        if (i7 != 4) {
            return null;
        }
        return bangumiTimelineEntity.d();
    }
}
