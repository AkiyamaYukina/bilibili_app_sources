package com.bilibili.studio.editor.asr.multi.step;

import Cw0.o;
import cf.p;
import com.bilibili.studio.editor.asr.core.bean.AsrRequestParam;
import com.bilibili.studio.editor.asr.core.bean.AsrSentence;
import com.bilibili.studio.editor.asr.core.bean.AsrUtterances;
import com.bilibili.studio.editor.asr.core.exception.AsrBaseException;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Deferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/asr/multi/step/a.class */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f105663a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final o f105664b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public Deferred<C1187a> f105665c;

    /* JADX INFO: renamed from: com.bilibili.studio.editor.asr.multi.step.a$a, reason: collision with other inner class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/asr/multi/step/a$a.class */
    public static final class C1187a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final String f105666a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public final String f105667b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public final AsrUtterances f105668c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public final AsrBaseException f105669d;

        public C1187a(String str, String str2, AsrBaseException asrBaseException, int i7) {
            str2 = (i7 & 2) != 0 ? null : str2;
            asrBaseException = (i7 & 8) != 0 ? null : asrBaseException;
            this.f105666a = str;
            this.f105667b = str2;
            this.f105668c = null;
            this.f105669d = asrBaseException;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1187a)) {
                return false;
            }
            C1187a c1187a = (C1187a) obj;
            return Intrinsics.areEqual(this.f105666a, c1187a.f105666a) && Intrinsics.areEqual(this.f105667b, c1187a.f105667b) && Intrinsics.areEqual(this.f105668c, c1187a.f105668c) && Intrinsics.areEqual(this.f105669d, c1187a.f105669d);
        }

        public final int hashCode() {
            int iHashCode = this.f105666a.hashCode();
            int iHashCode2 = 0;
            String str = this.f105667b;
            int iHashCode3 = str == null ? 0 : str.hashCode();
            AsrUtterances asrUtterances = this.f105668c;
            int iHashCode4 = asrUtterances == null ? 0 : asrUtterances.hashCode();
            AsrBaseException asrBaseException = this.f105669d;
            if (asrBaseException != null) {
                iHashCode2 = asrBaseException.hashCode();
            }
            return (((((iHashCode * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode2;
        }

        @NotNull
        public final String toString() {
            List<AsrSentence> sentence;
            String message = null;
            AsrUtterances asrUtterances = this.f105668c;
            Integer numValueOf = (asrUtterances == null || (sentence = asrUtterances.getSentence()) == null) ? null : Integer.valueOf(sentence.size());
            AsrBaseException asrBaseException = this.f105669d;
            if (asrBaseException != null) {
                message = asrBaseException.getMessage();
            }
            StringBuilder sb = new StringBuilder("Result(code='");
            sb.append(this.f105666a);
            sb.append("', labelResult=");
            p.a(numValueOf, this.f105667b, ", asrUtterances=", " exp=", sb);
            return C8770a.a(sb, message, ")");
        }
    }

    public a(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        this.f105663a = str;
        this.f105664b = new o(new AsrRequestParam(str2, str3), str);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(@org.jetbrains.annotations.NotNull com.bilibili.studio.editor.asr.bean.AudioInfo r10, @org.jetbrains.annotations.NotNull kotlin.coroutines.jvm.internal.ContinuationImpl r11) {
        /*
            Method dump skipped, instruction units count: 632
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.asr.multi.step.a.a(com.bilibili.studio.editor.asr.bean.AudioInfo, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
