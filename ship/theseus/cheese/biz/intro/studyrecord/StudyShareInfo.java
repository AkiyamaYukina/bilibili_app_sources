package com.bilibili.ship.theseus.cheese.biz.intro.studyrecord;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bson.common.Bson;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/studyrecord/StudyShareInfo.class */
@StabilityInferred(parameters = 1)
@Bson
public final class StudyShareInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f90217a;

    public StudyShareInfo(@NotNull String str) {
        this.f90217a = str;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StudyShareInfo) && Intrinsics.areEqual(this.f90217a, ((StudyShareInfo) obj).f90217a);
    }

    public final int hashCode() {
        return this.f90217a.hashCode();
    }

    @NotNull
    public final String toString() {
        return C8770a.a(new StringBuilder("StudyShareInfo(imageUrl="), this.f90217a, ")");
    }
}
