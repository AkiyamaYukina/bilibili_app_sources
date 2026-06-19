package com.bilibili.ship.theseus.cheese.biz.intro.studyrecord;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.bson.common.Types;
import com.bilibili.ship.theseus.cheese.biz.intro.studyrecord.StudyRecord;
import java.lang.reflect.Type;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/studyrecord/StudyRecord_JsonDescriptor.class */
public final class StudyRecord_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f90215a = {new PojoPropertyDescriptor("detail_url", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("data_effectiveness", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("avatar", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("today_study_minutes", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("week_study_minutes", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("details", (String[]) null, Types.parameterizedType(List.class, new Type[]{StudyRecord.StudyRecordDetail.class}), (Class) null, 21)};

    public StudyRecord_JsonDescriptor() {
        super(StudyRecord.class, f90215a);
    }

    public final Object constructWith(Object[] objArr) {
        return new StudyRecord((String) objArr[0], (String) objArr[1], (String) objArr[2], (String) objArr[3], (String) objArr[4], (List) objArr[5]);
    }

    public final Object get(Object obj, int i7) {
        StudyRecord studyRecord = (StudyRecord) obj;
        if (i7 == 0) {
            return studyRecord.f90208a;
        }
        if (i7 == 1) {
            return studyRecord.f90209b;
        }
        if (i7 == 2) {
            return studyRecord.f90210c;
        }
        if (i7 == 3) {
            return studyRecord.f90211d;
        }
        if (i7 == 4) {
            return studyRecord.f90212e;
        }
        if (i7 != 5) {
            return null;
        }
        return studyRecord.f90213f;
    }
}
