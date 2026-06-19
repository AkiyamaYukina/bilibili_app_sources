package com.bilibili.pegasus.data;

import android.support.v4.media.a;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/data/StoryArgsData.class */
public final class StoryArgsData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("ff_cover")
    @Nullable
    private String f77277a;

    public StoryArgsData() {
        this(null, 1, null);
    }

    public StoryArgsData(@Nullable String str) {
        this.f77277a = str;
    }

    public /* synthetic */ StoryArgsData(String str, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : str);
    }

    public static /* synthetic */ StoryArgsData copy$default(StoryArgsData storyArgsData, String str, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = storyArgsData.f77277a;
        }
        return storyArgsData.copy(str);
    }

    @Nullable
    public final String component1() {
        return this.f77277a;
    }

    @NotNull
    public final StoryArgsData copy(@Nullable String str) {
        return new StoryArgsData(str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StoryArgsData) && Intrinsics.areEqual(this.f77277a, ((StoryArgsData) obj).f77277a);
    }

    @Nullable
    public final String getFfCover() {
        return this.f77277a;
    }

    public int hashCode() {
        String str = this.f77277a;
        return str == null ? 0 : str.hashCode();
    }

    public final void setFfCover(@Nullable String str) {
        this.f77277a = str;
    }

    @NotNull
    public String toString() {
        return a.a("StoryArgsData(ffCover=", this.f77277a, ")");
    }
}
