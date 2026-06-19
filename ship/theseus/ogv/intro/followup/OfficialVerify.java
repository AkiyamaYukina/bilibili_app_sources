package com.bilibili.ship.theseus.ogv.intro.followup;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bson.common.Bson;
import com.bilibili.ship.theseus.united.page.intro.module.staffs.OfficialVerifyType;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/followup/OfficialVerify.class */
@StabilityInferred(parameters = 1)
@Bson
public final class OfficialVerify {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final OfficialVerifyType f93042a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f93043b;

    public OfficialVerify(OfficialVerifyType officialVerifyType, String str, int i7) {
        this.f93042a = (i7 & 1) != 0 ? OfficialVerifyType.UNVERIFIED : officialVerifyType;
        this.f93043b = str;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OfficialVerify)) {
            return false;
        }
        OfficialVerify officialVerify = (OfficialVerify) obj;
        return this.f93042a == officialVerify.f93042a && Intrinsics.areEqual(this.f93043b, officialVerify.f93043b);
    }

    public final int hashCode() {
        return this.f93043b.hashCode() + (this.f93042a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return "OfficialVerify(type=" + this.f93042a + ", desc=" + this.f93043b + ")";
    }
}
