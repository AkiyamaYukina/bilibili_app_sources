package com.bilibili.opd.app.bizcommon.mangapaysdk.data.model;

import I.E;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/mangapaysdk/data/model/h.class */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f74070a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f74071b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final ButtonState f74072c;

    public h() {
        this(false, (ButtonState) null, 7);
    }

    public /* synthetic */ h(boolean z6, ButtonState buttonState, int i7) {
        this((i7 & 1) != 0 ? false : z6, "", (i7 & 4) != 0 ? ButtonState.Unknown : buttonState);
    }

    public h(boolean z6, @NotNull String str, @NotNull ButtonState buttonState) {
        this.f74070a = z6;
        this.f74071b = str;
        this.f74072c = buttonState;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f74070a == hVar.f74070a && Intrinsics.areEqual(this.f74071b, hVar.f74071b) && this.f74072c == hVar.f74072c;
    }

    public final int hashCode() {
        return this.f74072c.hashCode() + E.a(Boolean.hashCode(this.f74070a) * 31, 31, this.f74071b);
    }

    @NotNull
    public final String toString() {
        return "SureToBuyButtonState(isAgreeProtocol=" + this.f74070a + ", buttonShowText=" + this.f74071b + ", buttonState=" + this.f74072c + ")";
    }
}
