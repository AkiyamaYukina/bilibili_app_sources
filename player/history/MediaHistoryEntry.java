package com.bilibili.player.history;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/player/history/MediaHistoryEntry.class */
public class MediaHistoryEntry {

    @NotNull
    public static final a Companion = new Object();
    public static final int END_FLAG = -1;
    public static final int MILLISECOND_DIFFERENCE = 1000;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f79276a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f79277b;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/player/history/MediaHistoryEntry$a.class */
    public static final class a {
    }

    public MediaHistoryEntry() {
        this(0, 1, null);
    }

    public MediaHistoryEntry(int i7) {
        this.f79276a = i7;
    }

    public /* synthetic */ MediaHistoryEntry(int i7, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this((i8 & 1) != 0 ? -1 : i7);
    }

    public final int getProgress() {
        return this.f79276a;
    }

    public final boolean isForceStartAccurateSeek() {
        return this.f79277b;
    }

    public final void setForceStartAccurateSeek(boolean z6) {
        this.f79277b = z6;
    }

    public final void setProgress(int i7) {
        this.f79276a = i7;
    }
}
