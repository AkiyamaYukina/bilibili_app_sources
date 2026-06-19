package com.bilibili.ship.theseus.united.page.activityresult;

import android.content.Intent;
import androidx.compose.animation.core.I;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/activityresult/a.class */
@StabilityInferred(parameters = 0)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f98830a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f98831b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final Intent f98832c;

    public a(int i7, int i8, @Nullable Intent intent) {
        this.f98830a = i7;
        this.f98831b = i8;
        this.f98832c = intent;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f98830a == aVar.f98830a && this.f98831b == aVar.f98831b && Intrinsics.areEqual(this.f98832c, aVar.f98832c);
    }

    public final int hashCode() {
        int iA = I.a(this.f98831b, Integer.hashCode(this.f98830a) * 31, 31);
        Intent intent = this.f98832c;
        return iA + (intent == null ? 0 : intent.hashCode());
    }

    @NotNull
    public final String toString() {
        return "TheseusActivityResult(requestCode=" + this.f98830a + ", resultCode=" + this.f98831b + ", data=" + this.f98832c + ")";
    }
}
