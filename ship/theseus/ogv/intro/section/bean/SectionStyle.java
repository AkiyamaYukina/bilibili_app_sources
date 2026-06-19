package com.bilibili.ship.theseus.ogv.intro.section.bean;

import androidx.appcompat.app.i;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bson.common.Bson;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/section/bean/SectionStyle.class */
@StabilityInferred(parameters = 1)
@Bson
public final class SectionStyle {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f93581a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f93582b;

    public SectionStyle(boolean z6, boolean z7) {
        this.f93581a = z6;
        this.f93582b = z7;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SectionStyle)) {
            return false;
        }
        SectionStyle sectionStyle = (SectionStyle) obj;
        return this.f93581a == sectionStyle.f93581a && this.f93582b == sectionStyle.f93582b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f93582b) + (Boolean.hashCode(this.f93581a) * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("SectionStyle(hidden=");
        sb.append(this.f93581a);
        sb.append(", line=");
        return i.a(sb, this.f93582b, ")");
    }
}
