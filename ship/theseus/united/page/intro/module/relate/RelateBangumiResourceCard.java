package com.bilibili.ship.theseus.united.page.intro.module.relate;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bson.common.Bson;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/relate/RelateBangumiResourceCard.class */
@StabilityInferred(parameters = 1)
@Bson
public final class RelateBangumiResourceCard {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final String f101043a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("rcmd_reason")
    @Nullable
    private final String f101044b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("re_value")
    @NotNull
    private final String f101045c;

    public RelateBangumiResourceCard(@Nullable String str, @Nullable String str2, @NotNull String str3) {
        this.f101043a = str;
        this.f101044b = str2;
        this.f101045c = str3;
    }

    @NotNull
    public final String a() {
        return this.f101045c;
    }

    @Nullable
    public final String b() {
        return this.f101044b;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RelateBangumiResourceCard)) {
            return false;
        }
        RelateBangumiResourceCard relateBangumiResourceCard = (RelateBangumiResourceCard) obj;
        return Intrinsics.areEqual(this.f101043a, relateBangumiResourceCard.f101043a) && Intrinsics.areEqual(this.f101044b, relateBangumiResourceCard.f101044b) && Intrinsics.areEqual(this.f101045c, relateBangumiResourceCard.f101045c);
    }

    public final int hashCode() {
        int iHashCode = 0;
        String str = this.f101043a;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.f101044b;
        if (str2 != null) {
            iHashCode = str2.hashCode();
        }
        return this.f101045c.hashCode() + (((iHashCode2 * 31) + iHashCode) * 31);
    }

    @NotNull
    public final String toString() {
        String str = this.f101044b;
        String str2 = this.f101045c;
        StringBuilder sb = new StringBuilder("RelateBangumiResourceCard(label=");
        androidx.room.B.a(this.f101043a, ", recommendReason=", str, ", jumpUrl=", sb);
        return C8770a.a(sb, str2, ")");
    }
}
