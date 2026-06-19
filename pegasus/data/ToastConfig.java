package com.bilibili.pegasus.data;

import androidx.annotation.Keep;
import androidx.fragment.app.n;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/data/ToastConfig.class */
@Keep
public final class ToastConfig {

    @SerializedName("has_toast")
    private final boolean hasToast;

    @SerializedName("toast_message")
    @Nullable
    private final String toastMessage;

    public ToastConfig() {
        this(false, null, 3, null);
    }

    public ToastConfig(boolean z6, @Nullable String str) {
        this.hasToast = z6;
        this.toastMessage = str;
    }

    public /* synthetic */ ToastConfig(boolean z6, String str, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? false : z6, (i7 & 2) != 0 ? null : str);
    }

    public static /* synthetic */ ToastConfig copy$default(ToastConfig toastConfig, boolean z6, String str, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            z6 = toastConfig.hasToast;
        }
        if ((i7 & 2) != 0) {
            str = toastConfig.toastMessage;
        }
        return toastConfig.copy(z6, str);
    }

    public final boolean component1() {
        return this.hasToast;
    }

    @Nullable
    public final String component2() {
        return this.toastMessage;
    }

    @NotNull
    public final ToastConfig copy(boolean z6, @Nullable String str) {
        return new ToastConfig(z6, str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ToastConfig)) {
            return false;
        }
        ToastConfig toastConfig = (ToastConfig) obj;
        return this.hasToast == toastConfig.hasToast && Intrinsics.areEqual(this.toastMessage, toastConfig.toastMessage);
    }

    public final boolean getHasToast() {
        return this.hasToast;
    }

    @Nullable
    public final String getToastMessage() {
        return this.toastMessage;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.hasToast);
        String str = this.toastMessage;
        return (iHashCode * 31) + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        return n.b("ToastConfig(hasToast=", ", toastMessage=", this.toastMessage, ")", this.hasToast);
    }
}
