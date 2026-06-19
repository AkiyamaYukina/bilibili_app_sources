package com.bilibili.ship.theseus.ogv.intro.floatlayer.bean;

import I.E;
import N1.o;
import androidx.compose.foundation.C3554n0;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bson.common.Bson;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/floatlayer/bean/OgvActorInfoVo.class */
@StabilityInferred(parameters = 0)
@Bson
public final class OgvActorInfoVo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f92839a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f92840b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f92841c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f92842d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final String f92843e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final String f92844f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final String f92845g;

    @NotNull
    public final List<Order> h;

    public OgvActorInfoVo(long j7, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull List list) {
        this.f92839a = str;
        this.f92840b = str2;
        this.f92841c = str3;
        this.f92842d = j7;
        this.f92843e = str4;
        this.f92844f = str5;
        this.f92845g = str6;
        this.h = list;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OgvActorInfoVo)) {
            return false;
        }
        OgvActorInfoVo ogvActorInfoVo = (OgvActorInfoVo) obj;
        return Intrinsics.areEqual(this.f92839a, ogvActorInfoVo.f92839a) && Intrinsics.areEqual(this.f92840b, ogvActorInfoVo.f92840b) && Intrinsics.areEqual(this.f92841c, ogvActorInfoVo.f92841c) && this.f92842d == ogvActorInfoVo.f92842d && Intrinsics.areEqual(this.f92843e, ogvActorInfoVo.f92843e) && Intrinsics.areEqual(this.f92844f, ogvActorInfoVo.f92844f) && Intrinsics.areEqual(this.f92845g, ogvActorInfoVo.f92845g) && Intrinsics.areEqual(this.h, ogvActorInfoVo.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + E.a(E.a(E.a(C3554n0.a(E.a(E.a(this.f92839a.hashCode() * 31, 31, this.f92840b), 31, this.f92841c), 31, this.f92842d), 31, this.f92843e), 31, this.f92844f), 31, this.f92845g);
    }

    @NotNull
    public final String toString() {
        List<Order> list = this.h;
        StringBuilder sb = new StringBuilder("OgvActorInfoVo(avatar=");
        sb.append(this.f92839a);
        sb.append(", bg_img=");
        sb.append(this.f92840b);
        sb.append(", evaluate=");
        sb.append(this.f92841c);
        sb.append(", id=");
        sb.append(this.f92842d);
        sb.append(", job_info=");
        sb.append(this.f92843e);
        sb.append(", name=");
        sb.append(this.f92844f);
        sb.append(", origin_name=");
        return o.a(this.f92845g, ", orders=", ")", sb, list);
    }
}
