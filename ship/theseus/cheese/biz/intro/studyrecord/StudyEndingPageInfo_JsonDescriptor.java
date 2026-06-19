package com.bilibili.ship.theseus.cheese.biz.intro.studyrecord;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/studyrecord/StudyEndingPageInfo_JsonDescriptor.class */
public final class StudyEndingPageInfo_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f90207a = {new PojoPropertyDescriptor("extra_result", (String[]) null, Integer.class, (Class) null, 4), new PojoPropertyDescriptor("study_record", (String[]) null, StudyRecord.class, (Class) null, 4)};

    public StudyEndingPageInfo_JsonDescriptor() {
        super(StudyEndingPageInfo.class, f90207a);
    }

    public final Object constructWith(Object[] objArr) {
        return new StudyEndingPageInfo((Integer) objArr[0], (StudyRecord) objArr[1]);
    }

    public final Object get(Object obj, int i7) {
        StudyEndingPageInfo studyEndingPageInfo = (StudyEndingPageInfo) obj;
        if (i7 == 0) {
            return studyEndingPageInfo.a();
        }
        if (i7 != 1) {
            return null;
        }
        return studyEndingPageInfo.b();
    }
}
