package com.bilibili.ship.theseus.cheese.biz.intro.studyrecord;

import I.E;
import androidx.compose.runtime.C4277b;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bson.common.Bson;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/studyrecord/StudyRecord.class */
@StabilityInferred(parameters = 0)
@Bson
public final class StudyRecord {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f90208a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f90209b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f90210c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final String f90211d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final String f90212e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final List<StudyRecordDetail> f90213f;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/studyrecord/StudyRecord$StudyRecordDetail.class */
    @StabilityInferred(parameters = 1)
    @Bson
    public static final class StudyRecordDetail {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f90214a;

        public StudyRecordDetail(int i7) {
            this.f90214a = i7;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof StudyRecordDetail) && this.f90214a == ((StudyRecordDetail) obj).f90214a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f90214a);
        }

        @NotNull
        public final String toString() {
            return C4277b.a(this.f90214a, ")", new StringBuilder("StudyRecordDetail(studySeconds="));
        }
    }

    public StudyRecord(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull List<StudyRecordDetail> list) {
        this.f90208a = str;
        this.f90209b = str2;
        this.f90210c = str3;
        this.f90211d = str4;
        this.f90212e = str5;
        this.f90213f = list;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StudyRecord)) {
            return false;
        }
        StudyRecord studyRecord = (StudyRecord) obj;
        return Intrinsics.areEqual(this.f90208a, studyRecord.f90208a) && Intrinsics.areEqual(this.f90209b, studyRecord.f90209b) && Intrinsics.areEqual(this.f90210c, studyRecord.f90210c) && Intrinsics.areEqual(this.f90211d, studyRecord.f90211d) && Intrinsics.areEqual(this.f90212e, studyRecord.f90212e) && Intrinsics.areEqual(this.f90213f, studyRecord.f90213f);
    }

    public final int hashCode() {
        return this.f90213f.hashCode() + E.a(E.a(E.a(E.a(this.f90208a.hashCode() * 31, 31, this.f90209b), 31, this.f90210c), 31, this.f90211d), 31, this.f90212e);
    }

    @NotNull
    public final String toString() {
        List<StudyRecordDetail> list = this.f90213f;
        StringBuilder sb = new StringBuilder("StudyRecord(detailUrl=");
        sb.append(this.f90208a);
        sb.append(", dataEffectiveness=");
        sb.append(this.f90209b);
        sb.append(", avatar=");
        sb.append(this.f90210c);
        sb.append(", todayStudyMinutes=");
        sb.append(this.f90211d);
        sb.append(", weekStudyMinutes=");
        return N1.o.a(this.f90212e, ", details=", ")", sb, list);
    }
}
