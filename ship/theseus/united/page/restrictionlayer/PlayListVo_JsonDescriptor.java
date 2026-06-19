package com.bilibili.ship.theseus.united.page.restrictionlayer;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.bson.common.Types;
import java.lang.reflect.Type;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/restrictionlayer/PlayListVo_JsonDescriptor.class */
public final class PlayListVo_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f102623a = {new PojoPropertyDescriptor("play_list", (String[]) null, Types.parameterizedType(List.class, new Type[]{PlayListItemVo.class}), (Class) null, 21)};

    public PlayListVo_JsonDescriptor() {
        super(PlayListVo.class, f102623a);
    }

    public final Object constructWith(Object[] objArr) {
        return new PlayListVo((List) objArr[0]);
    }

    public final Object get(Object obj, int i7) {
        PlayListVo playListVo = (PlayListVo) obj;
        if (i7 != 0) {
            return null;
        }
        return playListVo.f102622a;
    }
}
