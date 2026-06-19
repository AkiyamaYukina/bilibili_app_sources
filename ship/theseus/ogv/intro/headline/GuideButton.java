package com.bilibili.ship.theseus.ogv.intro.headline;

import I.E;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.media3.exoplayer.analytics.C4665g;
import com.bilibili.app.producers.ability.l0;
import com.bilibili.bson.common.Bson;
import com.google.gson.annotations.SerializedName;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/headline/GuideButton.class */
@StabilityInferred(parameters = 0)
@Bson
public final class GuideButton {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("bubble")
    @NotNull
    private final String f93108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f93109b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f93110c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Map<String, String> f93111d;

    public GuideButton(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull Map<String, String> map) {
        this.f93108a = str;
        this.f93109b = str2;
        this.f93110c = str3;
        this.f93111d = map;
    }

    @NotNull
    public final String a() {
        return this.f93108a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GuideButton)) {
            return false;
        }
        GuideButton guideButton = (GuideButton) obj;
        return Intrinsics.areEqual(this.f93108a, guideButton.f93108a) && Intrinsics.areEqual(this.f93109b, guideButton.f93109b) && Intrinsics.areEqual(this.f93110c, guideButton.f93110c) && Intrinsics.areEqual(this.f93111d, guideButton.f93111d);
    }

    public final int hashCode() {
        return this.f93111d.hashCode() + E.a(E.a(this.f93108a.hashCode() * 31, 31, this.f93109b), 31, this.f93110c);
    }

    @NotNull
    public final String toString() {
        String str = this.f93108a;
        Map<String, String> map = this.f93111d;
        StringBuilder sbA = l0.a("GuideButton(bubbleText=", str, ", link=");
        sbA.append(this.f93109b);
        sbA.append(", title=");
        return C4665g.a(sbA, this.f93110c, ", report=", map, ")");
    }
}
