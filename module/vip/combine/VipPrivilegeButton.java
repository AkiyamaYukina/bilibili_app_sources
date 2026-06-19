package com.bilibili.module.vip.combine;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bson.common.Bson;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/module/vip/combine/VipPrivilegeButton.class */
@StabilityInferred(parameters = 1)
@Bson
public final class VipPrivilegeButton {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f66168a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final VipActionType f66169b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final String f66170c;

    public VipPrivilegeButton(String str, VipActionType vipActionType, String str2, int i7) {
        vipActionType = (i7 & 2) != 0 ? VipActionType.Cancel : vipActionType;
        this.f66168a = str;
        this.f66169b = vipActionType;
        this.f66170c = str2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VipPrivilegeButton)) {
            return false;
        }
        VipPrivilegeButton vipPrivilegeButton = (VipPrivilegeButton) obj;
        return Intrinsics.areEqual(this.f66168a, vipPrivilegeButton.f66168a) && this.f66169b == vipPrivilegeButton.f66169b && Intrinsics.areEqual(this.f66170c, vipPrivilegeButton.f66170c);
    }

    public final int hashCode() {
        int iHashCode = this.f66168a.hashCode();
        int iHashCode2 = this.f66169b.hashCode();
        String str = this.f66170c;
        return ((iHashCode2 + (iHashCode * 31)) * 31) + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("VipPrivilegeButton(text=");
        sb.append(this.f66168a);
        sb.append(", actionType=");
        sb.append(this.f66169b);
        sb.append(", link=");
        return C8770a.a(sb, this.f66170c, ")");
    }
}
