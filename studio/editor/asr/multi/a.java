package com.bilibili.studio.editor.asr.multi;

import com.bilibili.studio.editor.asr.bean.AsrResultWrapper;
import com.bilibili.studio.editor.asr.bean.AsrSource;
import com.bilibili.studio.editor.asr.bean.AudioInfo;
import com.bilibili.studio.editor.asr.multi.step.b;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.ExecutorCoroutineDispatcher;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/asr/multi/a.class */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f105614a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f105615b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final AsrSource f105616c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f105617d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final List<AudioInfo> f105618e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final Map<AudioInfo, Jw0.a> f105619f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final g f105620g;

    @NotNull
    public final ExecutorCoroutineDispatcher h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final ExecutorCoroutineDispatcher f105621i;

    /* JADX INFO: renamed from: com.bilibili.studio.editor.asr.multi.a$a, reason: collision with other inner class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/asr/multi/a$a.class */
    public static final class C1186a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final AudioInfo f105622a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final AsrSingleTask f105623b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public b.a f105624c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public AsrResultWrapper f105625d;

        public C1186a(@NotNull AudioInfo audioInfo, @NotNull AsrSingleTask asrSingleTask) {
            this.f105622a = audioInfo;
            this.f105623b = asrSingleTask;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1186a)) {
                return false;
            }
            C1186a c1186a = (C1186a) obj;
            return Intrinsics.areEqual(this.f105622a, c1186a.f105622a) && Intrinsics.areEqual(this.f105623b, c1186a.f105623b);
        }

        public final int hashCode() {
            return this.f105623b.hashCode() + (this.f105622a.hashCode() * 31);
        }

        @NotNull
        public final String toString() {
            return "Chain(audioInfo=" + this.f105622a + ", singleTask=" + this.f105623b + ")";
        }
    }

    public a(boolean z6, @NotNull String str, @NotNull AsrSource asrSource, long j7, @NotNull List list, @NotNull Map map, @NotNull g gVar, @NotNull ExecutorCoroutineDispatcher executorCoroutineDispatcher, @NotNull ExecutorCoroutineDispatcher executorCoroutineDispatcher2) {
        this.f105614a = z6;
        this.f105615b = str;
        this.f105616c = asrSource;
        this.f105617d = j7;
        this.f105618e = list;
        this.f105619f = map;
        this.f105620g = gVar;
        this.h = executorCoroutineDispatcher;
        this.f105621i = executorCoroutineDispatcher2;
    }
}
