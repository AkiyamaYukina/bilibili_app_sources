package com.bilibili.ogv.misc.topicplaylist;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.bson.common.Types;
import com.bilibili.ogv.misc.topicplaylist.TopicPlayListVo;
import java.lang.reflect.Type;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/topicplaylist/TopicPlayListVo_JsonDescriptor.class */
public final class TopicPlayListVo_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f69636a = {new PojoPropertyDescriptor("pn", (String[]) null, Integer.TYPE, (Class) null, 7), new PojoPropertyDescriptor("has_next", (String[]) null, Boolean.TYPE, (Class) null, 7), new PojoPropertyDescriptor("data", (String[]) null, Types.parameterizedType(List.class, new Type[]{TopicPlayListVo.TopicPlayListItemVo.class}), (Class) null, 18)};

    public TopicPlayListVo_JsonDescriptor() {
        super(TopicPlayListVo.class, f69636a);
    }

    public final Object constructWith(Object[] objArr) {
        TopicPlayListVo topicPlayListVo = new TopicPlayListVo();
        Object obj = objArr[0];
        if (obj != null) {
            topicPlayListVo.d(((Integer) obj).intValue());
        }
        Object obj2 = objArr[1];
        if (obj2 != null) {
            topicPlayListVo.c(((Boolean) obj2).booleanValue());
        }
        Object obj3 = objArr[2];
        if (obj3 != null) {
            topicPlayListVo.f69629c = (List) obj3;
        }
        return topicPlayListVo;
    }

    public final Object get(Object obj, int i7) {
        TopicPlayListVo topicPlayListVo = (TopicPlayListVo) obj;
        if (i7 == 0) {
            return Integer.valueOf(topicPlayListVo.b());
        }
        if (i7 == 1) {
            return Boolean.valueOf(topicPlayListVo.a());
        }
        if (i7 != 2) {
            return null;
        }
        return topicPlayListVo.f69629c;
    }
}
