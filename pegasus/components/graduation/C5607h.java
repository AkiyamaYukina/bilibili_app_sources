package com.bilibili.pegasus.components.graduation;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.pegasus.data.config.GraduationSeasonConfig;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.bilibili.pegasus.components.graduation.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/graduation/h.class */
@StabilityInferred(parameters = 0)
public final class C5607h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final GraduationSeasonConfig f76125a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f76126b;

    public C5607h() {
        this(0);
    }

    public /* synthetic */ C5607h(int i7) {
        this(null, false);
    }

    public C5607h(@Nullable GraduationSeasonConfig graduationSeasonConfig, boolean z6) {
        this.f76125a = graduationSeasonConfig;
        this.f76126b = z6;
    }

    public static C5607h a(C5607h c5607h, boolean z6) {
        GraduationSeasonConfig graduationSeasonConfig = c5607h.f76125a;
        c5607h.getClass();
        return new C5607h(graduationSeasonConfig, z6);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5607h)) {
            return false;
        }
        C5607h c5607h = (C5607h) obj;
        return Intrinsics.areEqual(this.f76125a, c5607h.f76125a) && this.f76126b == c5607h.f76126b;
    }

    public final int hashCode() {
        GraduationSeasonConfig graduationSeasonConfig = this.f76125a;
        return Boolean.hashCode(this.f76126b) + ((graduationSeasonConfig == null ? 0 : graduationSeasonConfig.hashCode()) * 31);
    }

    @NotNull
    public final String toString() {
        return "Graduation26GuideState(config=" + this.f76125a + ", visible=" + this.f76126b + ")";
    }
}
