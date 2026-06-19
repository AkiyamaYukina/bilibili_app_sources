package com.bilibili.ship.theseus.united.page.floatlayer.interactivesettings;

import I.E;
import androidx.compose.animation.core.I;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.NotificationCompat;
import androidx.paging.M;
import com.bilibili.bson.common.Bson;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/floatlayer/interactivesettings/InteractionItem.class */
@StabilityInferred(parameters = 0)
@Bson
public final class InteractionItem {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("name")
    @NotNull
    private final String f99763a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("type")
    private final int f99764b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName(NotificationCompat.CATEGORY_STATUS)
    private int f99765c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SerializedName("jump_url")
    @NotNull
    private final String f99766d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @SerializedName("sub_title")
    @NotNull
    private final String f99767e;

    public InteractionItem(@NotNull String str, int i7, int i8, @NotNull String str2, @NotNull String str3) {
        this.f99763a = str;
        this.f99764b = i7;
        this.f99765c = i8;
        this.f99766d = str2;
        this.f99767e = str3;
    }

    public static InteractionItem c(InteractionItem interactionItem) {
        String str = interactionItem.f99763a;
        int i7 = interactionItem.f99764b;
        int i8 = interactionItem.f99765c;
        String str2 = interactionItem.f99766d;
        String str3 = interactionItem.f99767e;
        interactionItem.getClass();
        return new InteractionItem(str, i7, i8, str2, str3);
    }

    public final int a() {
        return this.f99764b;
    }

    public final int b() {
        return this.f99765c;
    }

    @NotNull
    public final String d() {
        return this.f99766d;
    }

    @NotNull
    public final String e() {
        return this.f99763a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InteractionItem)) {
            return false;
        }
        InteractionItem interactionItem = (InteractionItem) obj;
        return Intrinsics.areEqual(this.f99763a, interactionItem.f99763a) && this.f99764b == interactionItem.f99764b && this.f99765c == interactionItem.f99765c && Intrinsics.areEqual(this.f99766d, interactionItem.f99766d) && Intrinsics.areEqual(this.f99767e, interactionItem.f99767e);
    }

    public final int f() {
        return this.f99765c;
    }

    @NotNull
    public final String g() {
        return this.f99767e;
    }

    public final int h() {
        return this.f99764b;
    }

    public final int hashCode() {
        return this.f99767e.hashCode() + E.a(I.a(this.f99765c, I.a(this.f99764b, this.f99763a.hashCode() * 31, 31), 31), 31, this.f99766d);
    }

    public final void i(int i7) {
        this.f99765c = i7;
    }

    @NotNull
    public final String toString() {
        String str = this.f99763a;
        int i7 = this.f99764b;
        int i8 = this.f99765c;
        String str2 = this.f99766d;
        String str3 = this.f99767e;
        StringBuilder sbA = androidx.constraintlayout.widget.e.a(i7, "InteractionItem(name=", str, ", type=", ", status=");
        M.a(i8, ", jumpUrl=", str2, ", subtitle=", sbA);
        return C8770a.a(sbA, str3, ")");
    }
}
