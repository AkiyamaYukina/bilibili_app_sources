package com.bilibili.studio.editor.asr;

import com.bilibili.studio.editor.asr.bean.AudioInfo;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/asr/c.class */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public List<AudioInfo> f105525a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public ID0.b f105526b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public R5.i f105527c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public com.bilibili.app.gemini.player.feature.gif.a f105528d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public com.bilibili.biligame.widget.viewholder.d f105529e;

    public c() {
        throw null;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.areEqual(this.f105525a, cVar.f105525a) && Intrinsics.areEqual(this.f105526b, cVar.f105526b) && Intrinsics.areEqual(this.f105527c, cVar.f105527c) && Intrinsics.areEqual((Object) null, (Object) null) && Intrinsics.areEqual(this.f105528d, cVar.f105528d) && Intrinsics.areEqual(this.f105529e, cVar.f105529e);
    }

    @NotNull
    public final String toString() {
        return com.bapis.bilibili.account.interfaces.v1.k.a("AsrRequest(audioInfoList=", ")", this.f105525a);
    }
}
