package com.bilibili.ship.theseus.cheese.biz.additional;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.ship.theseus.cheese.biz.intro.studyrecord.StudyRecord;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/additional/CheeseAdditionalInfo_JsonDescriptor.class */
public final class CheeseAdditionalInfo_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f88993a = {new PojoPropertyDescriptor("activity_progress", (String[]) null, CheeseActivityProgress.class, (Class) null, 6), new PojoPropertyDescriptor("study_record", (String[]) null, StudyRecord.class, (Class) null, 4)};

    public CheeseAdditionalInfo_JsonDescriptor() {
        super(CheeseAdditionalInfo.class, f88993a);
    }

    public final Object constructWith(Object[] objArr) {
        int i7 = 0;
        Object obj = objArr[0];
        if (obj == null) {
            i7 = 1;
        }
        return new CheeseAdditionalInfo((CheeseActivityProgress) obj, (StudyRecord) objArr[1], i7);
    }

    public final Object get(Object obj, int i7) {
        CheeseAdditionalInfo cheeseAdditionalInfo = (CheeseAdditionalInfo) obj;
        if (i7 == 0) {
            return cheeseAdditionalInfo.a();
        }
        if (i7 != 1) {
            return null;
        }
        return cheeseAdditionalInfo.b();
    }
}
