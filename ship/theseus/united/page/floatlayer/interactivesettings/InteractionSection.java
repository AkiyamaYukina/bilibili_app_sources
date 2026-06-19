package com.bilibili.ship.theseus.united.page.floatlayer.interactivesettings;

import I.E;
import androidx.compose.runtime.internal.StabilityInferred;
import c6.N;
import com.bilibili.bson.common.Bson;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/floatlayer/interactivesettings/InteractionSection.class */
@StabilityInferred(parameters = 0)
@Bson
public final class InteractionSection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("tip_text")
    @NotNull
    private final String f99772a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("tip_sub_text")
    @NotNull
    private final String f99773b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("interaction_status")
    @NotNull
    private final List<InteractionItem> f99774c;

    public InteractionSection(@NotNull String str, @NotNull String str2, @NotNull List<InteractionItem> list) {
        this.f99772a = str;
        this.f99773b = str2;
        this.f99774c = list;
    }

    @NotNull
    public final String a() {
        return this.f99772a;
    }

    @NotNull
    public final String b() {
        return this.f99773b;
    }

    @NotNull
    public final List<InteractionItem> c() {
        return this.f99774c;
    }

    @NotNull
    public final List<InteractionItem> d() {
        return this.f99774c;
    }

    @NotNull
    public final String e() {
        return this.f99773b;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InteractionSection)) {
            return false;
        }
        InteractionSection interactionSection = (InteractionSection) obj;
        return Intrinsics.areEqual(this.f99772a, interactionSection.f99772a) && Intrinsics.areEqual(this.f99773b, interactionSection.f99773b) && Intrinsics.areEqual(this.f99774c, interactionSection.f99774c);
    }

    @NotNull
    public final String f() {
        return this.f99772a;
    }

    public final int hashCode() {
        return this.f99774c.hashCode() + E.a(this.f99772a.hashCode() * 31, 31, this.f99773b);
    }

    @NotNull
    public final String toString() {
        String str = this.f99772a;
        String str2 = this.f99773b;
        return N.a(G0.b.a("InteractionSection(tips=", str, ", subTips=", str2, ", itemList="), ")", this.f99774c);
    }
}
