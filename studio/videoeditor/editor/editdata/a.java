package com.bilibili.studio.videoeditor.editor.editdata;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/editor/editdata/a.class */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final List<String> f109464a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public EditConvertError f109465b;

    public a() {
        throw null;
    }

    public a(List list) {
        EditConvertError editConvertError = EditConvertError.NO_ERROR;
        this.f109464a = list;
        this.f109465b = editConvertError;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.areEqual(this.f109464a, aVar.f109464a) && this.f109465b == aVar.f109465b;
    }

    public final int hashCode() {
        return this.f109465b.hashCode() + (this.f109464a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return "EditConvertBClipResult(errorMsg=" + this.f109464a + ", errorType=" + this.f109465b + ")";
    }
}
