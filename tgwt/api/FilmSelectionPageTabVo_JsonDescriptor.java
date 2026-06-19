package com.bilibili.tgwt.api;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.bson.common.Types;
import com.bilibili.tgwt.api.FilmSelectionPageTabVo;
import java.lang.reflect.Type;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/api/FilmSelectionPageTabVo_JsonDescriptor.class */
public final class FilmSelectionPageTabVo_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f110835a = {new PojoPropertyDescriptor("tab_type", (String[]) null, String.class, (Class) null, 6), new PojoPropertyDescriptor("title", (String[]) null, String.class, (Class) null, 6), new PojoPropertyDescriptor("child", (String[]) null, Types.parameterizedType(List.class, new Type[]{FilmSelectionPageTabVo.FilmSelectionPageChildTabVo.class}), (Class) null, 22)};

    public FilmSelectionPageTabVo_JsonDescriptor() {
        super(FilmSelectionPageTabVo.class, f110835a);
    }

    public final Object constructWith(Object[] objArr) {
        int i7 = 0;
        Object obj = objArr[0];
        if (obj == null) {
            i7 = 1;
        }
        String str = (String) obj;
        Object obj2 = objArr[1];
        int i8 = i7;
        if (obj2 == null) {
            i8 = i7 | 2;
        }
        String str2 = (String) obj2;
        Object obj3 = objArr[2];
        int i9 = i8;
        if (obj3 == null) {
            i9 = i8 | 4;
        }
        return new FilmSelectionPageTabVo(i9, str, (List) obj3, str2);
    }

    public final Object get(Object obj, int i7) {
        FilmSelectionPageTabVo filmSelectionPageTabVo = (FilmSelectionPageTabVo) obj;
        if (i7 == 0) {
            return filmSelectionPageTabVo.b();
        }
        if (i7 == 1) {
            return filmSelectionPageTabVo.getTitle();
        }
        if (i7 != 2) {
            return null;
        }
        return filmSelectionPageTabVo.a();
    }
}
