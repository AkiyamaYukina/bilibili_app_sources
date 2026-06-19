package com.bilibili.ogv.kmm.operation.schedule;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonClassDiscriminator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/schedule/UpcomingScheduleCard$SubModule$Schedule$$serializer$annotationImpl$kotlinx_serialization_json_JsonClassDiscriminator$0.class */
public final /* synthetic */ class UpcomingScheduleCard$SubModule$Schedule$$serializer$annotationImpl$kotlinx_serialization_json_JsonClassDiscriminator$0 implements JsonClassDiscriminator {
    private final String discriminator;

    public UpcomingScheduleCard$SubModule$Schedule$$serializer$annotationImpl$kotlinx_serialization_json_JsonClassDiscriminator$0(@NotNull String str) {
        this.discriminator = str;
    }

    public final /* synthetic */ Class annotationType() {
        return JsonClassDiscriminator.class;
    }

    public final /* synthetic */ String discriminator() {
        return this.discriminator;
    }

    public final boolean equals(@Nullable Object obj) {
        return (obj instanceof JsonClassDiscriminator) && Intrinsics.areEqual(discriminator(), ((JsonClassDiscriminator) obj).discriminator());
    }

    public final int hashCode() {
        return this.discriminator.hashCode() ^ 707790692;
    }

    @NotNull
    public final String toString() {
        return android.support.v4.media.a.a("@kotlinx.serialization.json.JsonClassDiscriminator(discriminator=", this.discriminator, ")");
    }
}
