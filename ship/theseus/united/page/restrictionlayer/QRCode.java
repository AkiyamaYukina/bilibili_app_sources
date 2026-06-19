package com.bilibili.ship.theseus.united.page.restrictionlayer;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bson.common.Bson;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/restrictionlayer/QRCode.class */
@StabilityInferred(parameters = 1)
@Bson
public final class QRCode {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f102629a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f102630b;

    public QRCode(@NotNull String str, @NotNull String str2) {
        this.f102629a = str;
        this.f102630b = str2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QRCode)) {
            return false;
        }
        QRCode qRCode = (QRCode) obj;
        return Intrinsics.areEqual(this.f102629a, qRCode.f102629a) && Intrinsics.areEqual(this.f102630b, qRCode.f102630b);
    }

    public final int hashCode() {
        return this.f102630b.hashCode() + (this.f102629a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("QRCode(link=");
        sb.append(this.f102629a);
        sb.append(", linkDesc=");
        return C8770a.a(sb, this.f102630b, ")");
    }
}
