package com.bilibili.ogv.misc.topicplaylist;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.ogv.misc.topicplaylist.TopicPlayListVo;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/topicplaylist/TopicPlayListVo_TopicPlayListItemVo_JsonDescriptor.class */
public final class TopicPlayListVo_TopicPlayListItemVo_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f69637a = {new PojoPropertyDescriptor("id", (String[]) null, Integer.TYPE, (Class) null, 3), new PojoPropertyDescriptor("cover", (String[]) null, String.class, (Class) null, 2), new PojoPropertyDescriptor("title", (String[]) null, String.class, (Class) null, 2), new PojoPropertyDescriptor("content_count", (String[]) null, String.class, (Class) null, 6), new PojoPropertyDescriptor("fav_ctime", (String[]) null, Long.TYPE, (Class) null, 7), new PojoPropertyDescriptor("link", (String[]) null, String.class, (Class) null, 2)};

    public TopicPlayListVo_TopicPlayListItemVo_JsonDescriptor() {
        super(TopicPlayListVo.TopicPlayListItemVo.class, f69637a);
    }

    public final Object constructWith(Object[] objArr) {
        TopicPlayListVo.TopicPlayListItemVo topicPlayListItemVo = new TopicPlayListVo.TopicPlayListItemVo();
        Object obj = objArr[0];
        if (obj != null) {
            topicPlayListItemVo.f69630a = ((Integer) obj).intValue();
        }
        Object obj2 = objArr[1];
        if (obj2 != null) {
            topicPlayListItemVo.f69631b = (String) obj2;
        }
        Object obj3 = objArr[2];
        if (obj3 != null) {
            topicPlayListItemVo.f69632c = (String) obj3;
        }
        Object obj4 = objArr[3];
        if (obj4 != null) {
            topicPlayListItemVo.c((String) obj4);
        }
        Object obj5 = objArr[4];
        if (obj5 != null) {
            topicPlayListItemVo.d(((Long) obj5).longValue());
        }
        Object obj6 = objArr[5];
        if (obj6 != null) {
            topicPlayListItemVo.f69635f = (String) obj6;
        }
        return topicPlayListItemVo;
    }

    public final Object get(Object obj, int i7) {
        TopicPlayListVo.TopicPlayListItemVo topicPlayListItemVo = (TopicPlayListVo.TopicPlayListItemVo) obj;
        if (i7 == 0) {
            return Integer.valueOf(topicPlayListItemVo.f69630a);
        }
        if (i7 == 1) {
            return topicPlayListItemVo.f69631b;
        }
        if (i7 == 2) {
            return topicPlayListItemVo.f69632c;
        }
        if (i7 == 3) {
            return topicPlayListItemVo.a();
        }
        if (i7 == 4) {
            return Long.valueOf(topicPlayListItemVo.b());
        }
        if (i7 != 5) {
            return null;
        }
        return topicPlayListItemVo.f69635f;
    }
}
