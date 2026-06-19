package com.bilibili.ship.theseus.ogv.intro.headline;

import I.E;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.media3.exoplayer.analytics.C4665g;
import com.bilibili.bson.common.Bson;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/headline/DeliveryButton.class */
@StabilityInferred(parameters = 0)
@Bson
public final class DeliveryButton {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f93103a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f93104b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f93105c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Map<String, String> f93106d;

    public DeliveryButton(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull Map<String, String> map) {
        this.f93103a = str;
        this.f93104b = str2;
        this.f93105c = str3;
        this.f93106d = map;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeliveryButton)) {
            return false;
        }
        DeliveryButton deliveryButton = (DeliveryButton) obj;
        return Intrinsics.areEqual(this.f93103a, deliveryButton.f93103a) && Intrinsics.areEqual(this.f93104b, deliveryButton.f93104b) && Intrinsics.areEqual(this.f93105c, deliveryButton.f93105c) && Intrinsics.areEqual(this.f93106d, deliveryButton.f93106d);
    }

    public final int hashCode() {
        return this.f93106d.hashCode() + E.a(E.a(this.f93103a.hashCode() * 31, 31, this.f93104b), 31, this.f93105c);
    }

    @NotNull
    public final String toString() {
        Map<String, String> map = this.f93106d;
        StringBuilder sb = new StringBuilder("DeliveryButton(icon=");
        sb.append(this.f93103a);
        sb.append(", title=");
        sb.append(this.f93104b);
        sb.append(", link=");
        return C4665g.a(sb, this.f93105c, ", report=", map, ")");
    }
}
