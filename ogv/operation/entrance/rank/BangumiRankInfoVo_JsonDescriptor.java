package com.bilibili.ogv.operation.entrance.rank;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.bson.common.Types;
import java.lang.reflect.Type;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation/entrance/rank/BangumiRankInfoVo_JsonDescriptor.class */
public final class BangumiRankInfoVo_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f70199a = {new PojoPropertyDescriptor("note", (String[]) null, String.class, (Class) null, 2), new PojoPropertyDescriptor("season_type", (String[]) null, Integer.TYPE, (Class) null, 7), new PojoPropertyDescriptor("list", (String[]) null, Types.parameterizedType(List.class, new Type[]{RankItem.class}), (Class) null, 19)};

    public BangumiRankInfoVo_JsonDescriptor() {
        super(BangumiRankInfoVo.class, f70199a);
    }

    public final Object constructWith(Object[] objArr) {
        BangumiRankInfoVo bangumiRankInfoVo = new BangumiRankInfoVo();
        Object obj = objArr[0];
        if (obj != null) {
            bangumiRankInfoVo.f70196a = (String) obj;
        }
        Object obj2 = objArr[1];
        if (obj2 != null) {
            bangumiRankInfoVo.b(((Integer) obj2).intValue());
        }
        Object obj3 = objArr[2];
        if (obj3 != null) {
            bangumiRankInfoVo.f70198c = (List) obj3;
        }
        return bangumiRankInfoVo;
    }

    public final Object get(Object obj, int i7) {
        BangumiRankInfoVo bangumiRankInfoVo = (BangumiRankInfoVo) obj;
        if (i7 == 0) {
            return bangumiRankInfoVo.f70196a;
        }
        if (i7 == 1) {
            return Integer.valueOf(bangumiRankInfoVo.a());
        }
        if (i7 != 2) {
            return null;
        }
        return bangumiRankInfoVo.f70198c;
    }
}
