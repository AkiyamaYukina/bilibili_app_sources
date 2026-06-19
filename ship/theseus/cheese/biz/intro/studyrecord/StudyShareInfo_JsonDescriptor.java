package com.bilibili.ship.theseus.cheese.biz.intro.studyrecord;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.lib.sharewrapper.basic.ThirdPartyExtraBuilder;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/studyrecord/StudyShareInfo_JsonDescriptor.class */
public final class StudyShareInfo_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f90218a = {new PojoPropertyDescriptor(ThirdPartyExtraBuilder.SHARE_PARAMS_IMAGE_URL, (String[]) null, String.class, (Class) null, 5)};

    public StudyShareInfo_JsonDescriptor() {
        super(StudyShareInfo.class, f90218a);
    }

    public final Object constructWith(Object[] objArr) {
        return new StudyShareInfo((String) objArr[0]);
    }

    public final Object get(Object obj, int i7) {
        StudyShareInfo studyShareInfo = (StudyShareInfo) obj;
        if (i7 != 0) {
            return null;
        }
        return studyShareInfo.f90217a;
    }
}
