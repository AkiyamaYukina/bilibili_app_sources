package com.bilibili.ship.theseus.united.page.floatlayer.interactivesettings;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bson.common.Bson;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/floatlayer/interactivesettings/InteractiveSettingsData.class */
@StabilityInferred(parameters = 0)
@Bson
public final class InteractiveSettingsData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("interaction_management_v2")
    @Nullable
    private final InteractionManagementV2 f99780a;

    public InteractiveSettingsData(@Nullable InteractionManagementV2 interactionManagementV2) {
        this.f99780a = interactionManagementV2;
    }

    @Nullable
    public final InteractionManagementV2 a() {
        return this.f99780a;
    }

    @Nullable
    public final InteractionManagementV2 b() {
        return this.f99780a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InteractiveSettingsData) && Intrinsics.areEqual(this.f99780a, ((InteractiveSettingsData) obj).f99780a);
    }

    public final int hashCode() {
        InteractionManagementV2 interactionManagementV2 = this.f99780a;
        return interactionManagementV2 == null ? 0 : interactionManagementV2.hashCode();
    }

    @NotNull
    public final String toString() {
        return "InteractiveSettingsData(interactiveData=" + this.f99780a + ")";
    }
}
