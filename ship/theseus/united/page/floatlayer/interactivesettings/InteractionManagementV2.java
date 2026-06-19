package com.bilibili.ship.theseus.united.page.floatlayer.interactivesettings;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bson.common.Bson;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/floatlayer/interactivesettings/InteractionManagementV2.class */
@StabilityInferred(parameters = 0)
@Bson
public final class InteractionManagementV2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("can_show")
    private final boolean f99769a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("interaction_list")
    @NotNull
    private final List<InteractionSection> f99770b;

    public InteractionManagementV2() {
        throw null;
    }

    public InteractionManagementV2(int i7, List list, boolean z6) {
        list = (i7 & 2) != 0 ? CollectionsKt.emptyList() : list;
        this.f99769a = z6;
        this.f99770b = list;
    }

    public final boolean a() {
        return this.f99769a;
    }

    @NotNull
    public final List<InteractionSection> b() {
        return this.f99770b;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InteractionManagementV2)) {
            return false;
        }
        InteractionManagementV2 interactionManagementV2 = (InteractionManagementV2) obj;
        return this.f99769a == interactionManagementV2.f99769a && Intrinsics.areEqual(this.f99770b, interactionManagementV2.f99770b);
    }

    public final int hashCode() {
        return this.f99770b.hashCode() + (Boolean.hashCode(this.f99769a) * 31);
    }

    @NotNull
    public final String toString() {
        return "InteractionManagementV2(canShow=" + this.f99769a + ", sectionList=" + this.f99770b + ")";
    }
}
