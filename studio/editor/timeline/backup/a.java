package com.bilibili.studio.editor.timeline.backup;

import com.bilibili.studio.videoeditor.editor.editdata.EditVideoInfo;
import com.google.errorprone.annotations.Keep;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/timeline/backup/a.class */
@Keep
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public EditVideoInfo f108275a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final BackUpTag f108276b;

    public a(@Nullable EditVideoInfo editVideoInfo, @NotNull BackUpTag backUpTag) {
        this.f108275a = editVideoInfo;
        this.f108276b = backUpTag;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.areEqual(this.f108275a, aVar.f108275a) && this.f108276b == aVar.f108276b;
    }

    public final int hashCode() {
        EditVideoInfo editVideoInfo = this.f108275a;
        return this.f108276b.hashCode() + ((editVideoInfo == null ? 0 : editVideoInfo.hashCode()) * 31);
    }

    @NotNull
    public final String toString() {
        return "BackUpEntity(editVideoInfo=" + this.f108275a + ", tag=" + this.f108276b + ")";
    }
}
