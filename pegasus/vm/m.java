package com.bilibili.pegasus.vm;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.pegasus.Action;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/vm/m.class */
@StabilityInferred(parameters = 1)
public final class m implements Action {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f79068a = "LoginStatusChangeAction";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f79069b;

    public m(boolean z6) {
        this.f79069b = z6;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return Intrinsics.areEqual(this.f79068a, mVar.f79068a) && this.f79069b == mVar.f79069b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f79069b) + (this.f79068a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("LoginStatusChangeAction(name=");
        sb.append(this.f79068a);
        sb.append(", isLogin=");
        return androidx.appcompat.app.i.a(sb, this.f79069b, ")");
    }
}
