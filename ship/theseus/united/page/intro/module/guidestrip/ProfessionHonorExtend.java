package com.bilibili.ship.theseus.united.page.intro.module.guidestrip;

import androidx.compose.animation.z;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bson.common.Bson;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/guidestrip/ProfessionHonorExtend.class */
@StabilityInferred(parameters = 1)
@Bson
public final class ProfessionHonorExtend {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f100094a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f100095b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final ProfessionPopup f100096c;

    public ProfessionHonorExtend(int i7, boolean z6, @NotNull ProfessionPopup professionPopup) {
        this.f100094a = i7;
        this.f100095b = z6;
        this.f100096c = professionPopup;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProfessionHonorExtend)) {
            return false;
        }
        ProfessionHonorExtend professionHonorExtend = (ProfessionHonorExtend) obj;
        return this.f100094a == professionHonorExtend.f100094a && this.f100095b == professionHonorExtend.f100095b && Intrinsics.areEqual(this.f100096c, professionHonorExtend.f100096c);
    }

    public final int hashCode() {
        return this.f100096c.hashCode() + z.a(Integer.hashCode(this.f100094a) * 31, 31, this.f100095b);
    }

    @NotNull
    public final String toString() {
        return "ProfessionHonorExtend(count=" + this.f100094a + ", selfGrant=" + this.f100095b + ", popup=" + this.f100096c + ")";
    }
}
