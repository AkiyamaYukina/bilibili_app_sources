package com.bilibili.ogv.misc.timeline.ui.entity;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.ogv.misc.timeline.ui.entity.BangumiTimeline;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/timeline/ui/entity/BangumiTimeline_TimelineTag_JsonDescriptor.class */
public final class BangumiTimeline_TimelineTag_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f69563a = {new PojoPropertyDescriptor("text", (String[]) null, String.class, (Class) null, 7), new PojoPropertyDescriptor("type", (String[]) null, Integer.TYPE, (Class) null, 7)};

    public BangumiTimeline_TimelineTag_JsonDescriptor() {
        super(BangumiTimeline.TimelineTag.class, f69563a);
    }

    public final Object constructWith(Object[] objArr) {
        BangumiTimeline.TimelineTag timelineTag = new BangumiTimeline.TimelineTag();
        Object obj = objArr[0];
        if (obj != null) {
            timelineTag.f69542a = (String) obj;
        }
        Object obj2 = objArr[1];
        if (obj2 != null) {
            timelineTag.f69543b = ((Integer) obj2).intValue();
        }
        return timelineTag;
    }

    public final Object get(Object obj, int i7) {
        BangumiTimeline.TimelineTag timelineTag = (BangumiTimeline.TimelineTag) obj;
        if (i7 == 0) {
            return timelineTag.f69542a;
        }
        if (i7 != 1) {
            return null;
        }
        return Integer.valueOf(timelineTag.f69543b);
    }
}
