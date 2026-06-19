package com.bilibili.tgwt.api;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.bson.common.Types;
import com.bilibili.opd.app.bizcommon.context.provider.MallProviderParamsHelper;
import com.bilibili.tgwt.api.MovieCardListVo;
import java.lang.reflect.Type;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/api/MovieCardListVo_JsonDescriptor.class */
public final class MovieCardListVo_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f110864a = {new PojoPropertyDescriptor(MallProviderParamsHelper.ActiveProviderParams.URI_QUERY_PAGE, (String[]) null, MovieCardListVo.Page.class, (Class) null, 2), new PojoPropertyDescriptor("items", (String[]) null, Types.parameterizedType(List.class, new Type[]{MovieCardListVo.Item.class}), (Class) null, 18)};

    public MovieCardListVo_JsonDescriptor() {
        super(MovieCardListVo.class, f110864a);
    }

    public final Object constructWith(Object[] objArr) {
        MovieCardListVo movieCardListVo = new MovieCardListVo();
        Object obj = objArr[0];
        if (obj != null) {
            movieCardListVo.f110836a = (MovieCardListVo.Page) obj;
        }
        Object obj2 = objArr[1];
        if (obj2 != null) {
            movieCardListVo.f110837b = (List) obj2;
        }
        return movieCardListVo;
    }

    public final Object get(Object obj, int i7) {
        MovieCardListVo movieCardListVo = (MovieCardListVo) obj;
        if (i7 == 0) {
            return movieCardListVo.f110836a;
        }
        if (i7 != 1) {
            return null;
        }
        return movieCardListVo.f110837b;
    }
}
