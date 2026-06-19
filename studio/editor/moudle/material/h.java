package com.bilibili.studio.editor.moudle.material;

import com.bilibili.studio.videoeditor.bean.EditorMaterialEntity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/material/h.class */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Function1<Throwable, Unit> f107895a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Function1<EditorMaterialEntity, Unit> f107896b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final Function0<Boolean> f107897c;

    public h(@Nullable Function0 function0, @NotNull Function1 function1, @NotNull Function1 function12) {
        this.f107895a = function1;
        this.f107896b = function12;
        this.f107897c = function0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return Intrinsics.areEqual(this.f107895a, hVar.f107895a) && Intrinsics.areEqual(this.f107896b, hVar.f107896b) && Intrinsics.areEqual(this.f107897c, hVar.f107897c);
    }

    public final int hashCode() {
        int iA = O4.b.a(this.f107895a.hashCode() * 31, 31, this.f107896b);
        Function0<Boolean> function0 = this.f107897c;
        return iA + (function0 == null ? 0 : function0.hashCode());
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("MaterialCall(onFail=");
        sb.append(this.f107895a);
        sb.append(", onSuccess=");
        sb.append(this.f107896b);
        sb.append(", isCancel=");
        return Y0.c.a(sb, this.f107897c, ")");
    }
}
