package com.bilibili.lib.tribe.core.internal3.bundle;

import androidx.core.app.NotificationCompat;
import com.bilibili.lib.tribe.core.internal3.bundle.BundleActionExecutor;
import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/tribe/core/internal3/bundle/a.class */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName(NotificationCompat.CATEGORY_STATUS)
    @NotNull
    private final BundleActionExecutor.BundleStatus f64675a;

    public a(@NotNull BundleActionExecutor.BundleStatus bundleStatus) {
        this.f64675a = bundleStatus;
    }

    @NotNull
    public final BundleActionExecutor.BundleStatus a() {
        return this.f64675a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f64675a == ((a) obj).f64675a;
    }

    public final int hashCode() {
        return this.f64675a.hashCode();
    }

    @NotNull
    public final String toString() {
        return "BundleExtraInfo(status=" + this.f64675a + ")";
    }
}
