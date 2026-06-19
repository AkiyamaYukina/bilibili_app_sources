package com.bilibili.ship.theseus.ogv.intro.followup;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.A;
import com.bilibili.bson.common.Bson;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/followup/GuideDescription.class */
@StabilityInferred(parameters = 1)
@Bson
public final class GuideDescription {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f93039a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("info")
    @NotNull
    private final String f93040b;

    public GuideDescription(@NotNull String str, @NotNull String str2) {
        this.f93039a = str;
        this.f93040b = str2;
    }

    @NotNull
    public final String a() {
        return this.f93040b;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GuideDescription)) {
            return false;
        }
        GuideDescription guideDescription = (GuideDescription) obj;
        return Intrinsics.areEqual(this.f93039a, guideDescription.f93039a) && Intrinsics.areEqual(this.f93040b, guideDescription.f93040b);
    }

    public final int hashCode() {
        return this.f93040b.hashCode() + (this.f93039a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return A.a(this.f93039a, ", subtitle=", this.f93040b, ")", new StringBuilder("GuideDescription(title="));
    }
}
