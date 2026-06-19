package com.bilibili.ogv.opbase;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.ogv.opbase.RecommendModule;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/opbase/RecommendModule_Topic_JsonDescriptor.class */
public final class RecommendModule_Topic_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f69935a = {new PojoPropertyDescriptor("id", (String[]) null, Long.TYPE, (Class) null, 5), new PojoPropertyDescriptor("desc", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("url", (String[]) null, String.class, (Class) null, 5)};

    public RecommendModule_Topic_JsonDescriptor() {
        super(RecommendModule.Topic.class, f69935a);
    }

    public final Object constructWith(Object[] objArr) {
        Long l7 = (Long) objArr[0];
        return new RecommendModule.Topic(l7 == null ? 0L : l7.longValue(), (String) objArr[1], (String) objArr[2]);
    }

    public final Object get(Object obj, int i7) {
        RecommendModule.Topic topic = (RecommendModule.Topic) obj;
        if (i7 == 0) {
            return Long.valueOf(topic.f69930a);
        }
        if (i7 == 1) {
            return topic.f69931b;
        }
        if (i7 != 2) {
            return null;
        }
        return topic.f69932c;
    }
}
