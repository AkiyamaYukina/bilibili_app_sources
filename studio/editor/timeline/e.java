package com.bilibili.studio.editor.timeline;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/timeline/e.class */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final UpperEngineScene f108291a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Context f108292b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final M50.a f108293c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final String f108294d;

    public e(@NotNull UpperEngineScene upperEngineScene, @NotNull Context context, @Nullable M50.a aVar, @Nullable String str) {
        this.f108291a = upperEngineScene;
        this.f108292b = context;
        this.f108293c = aVar;
        this.f108294d = str;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f108291a == eVar.f108291a && Intrinsics.areEqual(this.f108292b, eVar.f108292b) && Intrinsics.areEqual(this.f108293c, eVar.f108293c) && Intrinsics.areEqual(this.f108294d, eVar.f108294d);
    }

    public final int hashCode() {
        int iHashCode = this.f108291a.hashCode();
        int iHashCode2 = this.f108292b.hashCode();
        int iHashCode3 = 0;
        M50.a aVar = this.f108293c;
        int iHashCode4 = aVar == null ? 0 : aVar.hashCode();
        String str = this.f108294d;
        if (str != null) {
            iHashCode3 = str.hashCode();
        }
        return ((((iHashCode2 + (iHashCode * 31)) * 31) + iHashCode4) * 31) + iHashCode3;
    }

    @NotNull
    public final String toString() {
        return "UpperEngineContextParam(scene=" + this.f108291a + ", context=" + this.f108292b + ", streamingContextParam=" + this.f108293c + ", auroraResourcePath=" + this.f108294d + ")";
    }
}
