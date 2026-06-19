package com.bilibili.ship.theseus.united.page.view;

import I.E;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bson.common.Bson;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/view/Translation.class */
@StabilityInferred(parameters = 1)
@Bson
public final class Translation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f104032a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f104033b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f104034c;

    public Translation(int i7, @NotNull String str, @NotNull String str2) {
        this.f104032a = i7;
        this.f104033b = str;
        this.f104034c = str2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Translation)) {
            return false;
        }
        Translation translation = (Translation) obj;
        return this.f104032a == translation.f104032a && Intrinsics.areEqual(this.f104033b, translation.f104033b) && Intrinsics.areEqual(this.f104034c, translation.f104034c);
    }

    public final int hashCode() {
        return this.f104034c.hashCode() + E.a(Integer.hashCode(this.f104032a) * 31, 31, this.f104033b);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("Translation(translationStatus=");
        sb.append(this.f104032a);
        sb.append(", curLanguage=");
        sb.append(this.f104033b);
        sb.append(", arcLanguage=");
        return C8770a.a(sb, this.f104034c, ")");
    }
}
