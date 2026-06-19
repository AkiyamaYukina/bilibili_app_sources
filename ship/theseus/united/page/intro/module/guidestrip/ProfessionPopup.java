package com.bilibili.ship.theseus.united.page.intro.module.guidestrip;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bson.common.Bson;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/guidestrip/ProfessionPopup.class */
@StabilityInferred(parameters = 1)
@Bson
public final class ProfessionPopup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f100098a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f100099b;

    public ProfessionPopup(@NotNull String str, @NotNull String str2) {
        this.f100098a = str;
        this.f100099b = str2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProfessionPopup)) {
            return false;
        }
        ProfessionPopup professionPopup = (ProfessionPopup) obj;
        return Intrinsics.areEqual(this.f100098a, professionPopup.f100098a) && Intrinsics.areEqual(this.f100099b, professionPopup.f100099b);
    }

    public final int hashCode() {
        return this.f100099b.hashCode() + (this.f100098a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("ProfessionPopup(title=");
        sb.append(this.f100098a);
        sb.append(", subtitle=");
        return C8770a.a(sb, this.f100099b, ")");
    }
}
