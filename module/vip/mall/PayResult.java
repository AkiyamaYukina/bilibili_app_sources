package com.bilibili.module.vip.mall;

import androidx.compose.animation.core.I;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bson.common.Bson;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/module/vip/mall/PayResult.class */
@StabilityInferred(parameters = 1)
@Bson
public final class PayResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f66200a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f66201b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final String f66202c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f66203d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final String f66204e;

    public PayResult(int i7, int i8, @Nullable String str, int i9, @Nullable String str2) {
        this.f66200a = i7;
        this.f66201b = i8;
        this.f66202c = str;
        this.f66203d = i9;
        this.f66204e = str2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PayResult)) {
            return false;
        }
        PayResult payResult = (PayResult) obj;
        return this.f66200a == payResult.f66200a && this.f66201b == payResult.f66201b && Intrinsics.areEqual(this.f66202c, payResult.f66202c) && this.f66203d == payResult.f66203d && Intrinsics.areEqual(this.f66204e, payResult.f66204e);
    }

    public final int hashCode() {
        int iA = I.a(this.f66201b, Integer.hashCode(this.f66200a) * 31, 31);
        String str = this.f66202c;
        int iA2 = I.a(this.f66203d, (iA + (str == null ? 0 : str.hashCode())) * 31, 31);
        String str2 = this.f66204e;
        return iA2 + (str2 == null ? 0 : str2.hashCode());
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("PayResult(channelId=");
        sb.append(this.f66200a);
        sb.append(", payStatus=");
        sb.append(this.f66201b);
        sb.append(", msg=");
        sb.append(this.f66202c);
        sb.append(", channelCode=");
        sb.append(this.f66203d);
        sb.append(", channelResult=");
        return C8770a.a(sb, this.f66204e, ")");
    }
}
