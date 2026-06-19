package com.bilibili.studio.editor.asr.multi.step;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Deferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/asr/multi/step/b.class */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f105670a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Iw0.a f105671b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public Deferred<a> f105672c;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/asr/multi/step/b$a.class */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final String f105673a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public final Exception f105674b;

        public /* synthetic */ a() {
            this("success", null);
        }

        public a(@NotNull String str, @Nullable Exception exc) {
            this.f105673a = str;
            this.f105674b = exc;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.areEqual(this.f105673a, aVar.f105673a) && Intrinsics.areEqual(this.f105674b, aVar.f105674b);
        }

        public final int hashCode() {
            int iHashCode = this.f105673a.hashCode();
            Exception exc = this.f105674b;
            return (iHashCode * 31) + (exc == null ? 0 : exc.hashCode());
        }

        @NotNull
        public final String toString() {
            return "Result(code=" + this.f105673a + ", exp=" + this.f105674b + ")";
        }
    }

    public b(@NotNull String str, @NotNull Iw0.a aVar) {
        this.f105670a = str;
        this.f105671b = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(@org.jetbrains.annotations.NotNull com.bilibili.studio.editor.asr.bean.AudioInfo r8, @org.jetbrains.annotations.NotNull kotlin.coroutines.jvm.internal.ContinuationImpl r9) {
        /*
            Method dump skipped, instruction units count: 256
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.asr.multi.step.b.a(com.bilibili.studio.editor.asr.bean.AudioInfo, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(com.bilibili.studio.editor.asr.bean.AudioInfo r8, kotlin.coroutines.jvm.internal.ContinuationImpl r9) {
        /*
            Method dump skipped, instruction units count: 630
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.asr.multi.step.b.b(com.bilibili.studio.editor.asr.bean.AudioInfo, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
