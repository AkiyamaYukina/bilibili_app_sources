package com.bilibili.ship.theseus.cheese.biz.intro.studyrecord;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.ship.theseus.cheese.biz.intro.studyrecord.StudyRecord;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/studyrecord/StudyRecord_StudyRecordDetail_JsonDescriptor.class */
public final class StudyRecord_StudyRecordDetail_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f90216a = {new PojoPropertyDescriptor("study_seconds", (String[]) null, Integer.TYPE, (Class) null, 5)};

    public StudyRecord_StudyRecordDetail_JsonDescriptor() {
        super(StudyRecord.StudyRecordDetail.class, f90216a);
    }

    public final Object constructWith(Object[] objArr) {
        int iIntValue = 0;
        Integer num = (Integer) objArr[0];
        if (num != null) {
            iIntValue = num.intValue();
        }
        return new StudyRecord.StudyRecordDetail(iIntValue);
    }

    public final Object get(Object obj, int i7) {
        StudyRecord.StudyRecordDetail studyRecordDetail = (StudyRecord.StudyRecordDetail) obj;
        if (i7 != 0) {
            return null;
        }
        return Integer.valueOf(studyRecordDetail.f90214a);
    }
}
