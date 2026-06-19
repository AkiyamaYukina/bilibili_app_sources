package com.bilibili.ship.theseus.ogv.intro.floatlayer.bean;

import N1.o;
import androidx.compose.animation.core.I;
import androidx.compose.animation.z;
import androidx.compose.foundation.C3554n0;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bson.common.Bson;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/floatlayer/bean/PersonRelateContentVo.class */
@StabilityInferred(parameters = 0)
@Bson
public final class PersonRelateContentVo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f92868a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f92869b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f92870c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f92871d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f92872e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f92873f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f92874g;

    @Nullable
    public final String h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public final List<PersonRelateSeason> f92875i;

    public PersonRelateContentVo(long j7, int i7, int i8, int i9, int i10, boolean z6, long j8, @Nullable String str, @Nullable List<PersonRelateSeason> list) {
        this.f92868a = j7;
        this.f92869b = i7;
        this.f92870c = i8;
        this.f92871d = i9;
        this.f92872e = i10;
        this.f92873f = z6;
        this.f92874g = j8;
        this.h = str;
        this.f92875i = list;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PersonRelateContentVo)) {
            return false;
        }
        PersonRelateContentVo personRelateContentVo = (PersonRelateContentVo) obj;
        return this.f92868a == personRelateContentVo.f92868a && this.f92869b == personRelateContentVo.f92869b && this.f92870c == personRelateContentVo.f92870c && this.f92871d == personRelateContentVo.f92871d && this.f92872e == personRelateContentVo.f92872e && this.f92873f == personRelateContentVo.f92873f && this.f92874g == personRelateContentVo.f92874g && Intrinsics.areEqual(this.h, personRelateContentVo.h) && Intrinsics.areEqual(this.f92875i, personRelateContentVo.f92875i);
    }

    public final int hashCode() {
        int iA = C3554n0.a(z.a(I.a(this.f92872e, I.a(this.f92871d, I.a(this.f92870c, I.a(this.f92869b, Long.hashCode(this.f92868a) * 31, 31), 31), 31), 31), 31, this.f92873f), 31, this.f92874g);
        int iHashCode = 0;
        String str = this.h;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        List<PersonRelateSeason> list = this.f92875i;
        if (list != null) {
            iHashCode = list.hashCode();
        }
        return ((iA + iHashCode2) * 31) + iHashCode;
    }

    @NotNull
    public final String toString() {
        List<PersonRelateSeason> list = this.f92875i;
        StringBuilder sb = new StringBuilder("PersonRelateContentVo(id=");
        sb.append(this.f92868a);
        sb.append(", num=");
        sb.append(this.f92869b);
        sb.append(", size=");
        sb.append(this.f92870c);
        sb.append(", pt=");
        sb.append(this.f92871d);
        sb.append(", total=");
        sb.append(this.f92872e);
        sb.append(", hasNext=");
        sb.append(this.f92873f);
        sb.append(", characterId=");
        sb.append(this.f92874g);
        sb.append(", moduleTitle=");
        return o.a(this.h, ", list=", ")", sb, list);
    }
}
