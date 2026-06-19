package com.bilibili.lib.rpc.track.model;

import J1.M;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/rpc/track/model/DomainDowngrade.class */
public final class DomainDowngrade {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f64365a;

    @JvmOverloads
    public DomainDowngrade() {
        this(false, 1, null);
    }

    @JvmOverloads
    public DomainDowngrade(boolean z6) {
        this.f64365a = z6;
    }

    public /* synthetic */ DomainDowngrade(boolean z6, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? false : z6);
    }

    public static /* synthetic */ DomainDowngrade copy$default(DomainDowngrade domainDowngrade, boolean z6, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            z6 = domainDowngrade.f64365a;
        }
        return domainDowngrade.copy(z6);
    }

    public final boolean component1() {
        return this.f64365a;
    }

    @NotNull
    public final DomainDowngrade copy(boolean z6) {
        return new DomainDowngrade(z6);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DomainDowngrade) && this.f64365a == ((DomainDowngrade) obj).f64365a;
    }

    public final boolean getDowngrade() {
        return this.f64365a;
    }

    public int hashCode() {
        return Boolean.hashCode(this.f64365a);
    }

    public final void setDowngrade(boolean z6) {
        this.f64365a = z6;
    }

    @NotNull
    public String toString() {
        return M.a("DomainDowngrade(downgrade=", ")", this.f64365a);
    }
}
