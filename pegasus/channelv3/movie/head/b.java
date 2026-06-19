package com.bilibili.pegasus.channelv3.movie.head;

import I.E;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bapis.bilibili.app.interfaces.v1.CommentType;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv3/movie/head/b.class */
@StabilityInferred(parameters = 1)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f75394a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f75395b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f75396c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final String f75397d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final String f75398e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final CommentType f75399f;

    public b(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull CommentType commentType) {
        this.f75394a = str;
        this.f75395b = str2;
        this.f75396c = str3;
        this.f75397d = str4;
        this.f75398e = str5;
        this.f75399f = commentType;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.areEqual(this.f75394a, bVar.f75394a) && Intrinsics.areEqual(this.f75395b, bVar.f75395b) && Intrinsics.areEqual(this.f75396c, bVar.f75396c) && Intrinsics.areEqual(this.f75397d, bVar.f75397d) && Intrinsics.areEqual(this.f75398e, bVar.f75398e) && this.f75399f == bVar.f75399f;
    }

    public final int hashCode() {
        return this.f75399f.hashCode() + E.a(E.a(E.a(E.a(this.f75394a.hashCode() * 31, 31, this.f75395b), 31, this.f75396c), 31, this.f75397d), 31, this.f75398e);
    }

    @NotNull
    public final String toString() {
        return "ChannelMovieCommentItem(icon=" + this.f75394a + ", url=" + this.f75395b + ", title=" + this.f75396c + ", commentId=" + this.f75397d + ", actionType=" + this.f75398e + ", commentType=" + this.f75399f + ")";
    }
}
