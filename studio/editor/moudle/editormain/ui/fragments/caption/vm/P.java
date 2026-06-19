package com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.vm;

import com.bilibili.studio.editor.moudle.caption.v1.CaptionInfo;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/ui/fragments/caption/vm/P.class */
public final class P {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final CaptionInfo f106692a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f106693b;

    public P(@Nullable CaptionInfo captionInfo, int i7) {
        this.f106692a = captionInfo;
        this.f106693b = i7;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof P)) {
            return false;
        }
        P p7 = (P) obj;
        return Intrinsics.areEqual(this.f106692a, p7.f106692a) && this.f106693b == p7.f106693b;
    }

    public final int hashCode() {
        CaptionInfo captionInfo = this.f106692a;
        return Integer.hashCode(this.f106693b) + ((captionInfo == null ? 0 : captionInfo.hashCode()) * 31);
    }

    @NotNull
    public final String toString() {
        return "CaptionInfoUpdateData(captionInfo=" + this.f106692a + ", cursorIndex=" + this.f106693b + ")";
    }
}
