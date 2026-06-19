package com.bilibili.tgwt.api;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.tgwt.api.FilmSelectionPageTabVo;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/api/FilmSelectionPageTabVo_FilmSelectionPageChildTabVo_JsonDescriptor.class */
public final class FilmSelectionPageTabVo_FilmSelectionPageChildTabVo_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f110834a = {new PojoPropertyDescriptor("tab_type", (String[]) null, String.class, (Class) null, 6), new PojoPropertyDescriptor("title", (String[]) null, String.class, (Class) null, 6)};

    public FilmSelectionPageTabVo_FilmSelectionPageChildTabVo_JsonDescriptor() {
        super(FilmSelectionPageTabVo.FilmSelectionPageChildTabVo.class, f110834a);
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
        return new FilmSelectionPageTabVo.FilmSelectionPageChildTabVo(str, (String) obj2, i8);
    }

    public final Object get(Object obj, int i7) {
        FilmSelectionPageTabVo.FilmSelectionPageChildTabVo filmSelectionPageChildTabVo = (FilmSelectionPageTabVo.FilmSelectionPageChildTabVo) obj;
        if (i7 == 0) {
            return filmSelectionPageChildTabVo.a();
        }
        if (i7 != 1) {
            return null;
        }
        return filmSelectionPageChildTabVo.getTitle();
    }
}
