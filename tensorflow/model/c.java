package com.bilibili.tensorflow.model;

import I.E;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tensorflow/model/c.class */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f110774a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f110775b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f110776c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final String f110777d;

    public c(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        this.f110774a = str;
        this.f110775b = str2;
        this.f110776c = str3;
        this.f110777d = str4;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        cVar.getClass();
        return Intrinsics.areEqual("ogv", "ogv") && Intrinsics.areEqual(this.f110774a, cVar.f110774a) && Intrinsics.areEqual(this.f110775b, cVar.f110775b) && Intrinsics.areEqual(this.f110776c, cVar.f110776c) && Intrinsics.areEqual(this.f110777d, cVar.f110777d);
    }

    public final int hashCode() {
        return this.f110777d.hashCode() + E.a(E.a(E.a(3409442, 31, this.f110774a), 31, this.f110775b), 31, this.f110776c);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("TFModelDes(modPoolName=ogv, modName=");
        sb.append(this.f110774a);
        sb.append(", modelFile=");
        sb.append(this.f110775b);
        sb.append(", filterFile=");
        sb.append(this.f110776c);
        sb.append(", lastKnownVersion=");
        return C8770a.a(sb, this.f110777d, ")");
    }
}
