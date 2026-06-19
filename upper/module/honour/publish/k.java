package com.bilibili.upper.module.honour.publish;

import G3.A0;
import Xf0.InterfaceC3111q;
import a5.C3188c;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Result;
import kotlin.jvm.internal.Intrinsics;
import ng0.C8092b;
import og0.C8213a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/honour/publish/k.class */
@StabilityInferred(parameters = 0)
public final class k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final Lazy<k> f113201b = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, new A0(6));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public List<InterfaceC3111q> f113202a;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/honour/publish/k$a.class */
    public final class a extends C8213a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final InterfaceC3111q f113203a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final String f113204b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final i f113205c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f113206d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f113207e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final long f113208f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public long f113209g;
        public boolean h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final k f113210i;

        public a(@NotNull k kVar, @NotNull InterfaceC3111q interfaceC3111q, @NotNull String str, i iVar, long j7) {
            this.f113210i = kVar;
            this.f113203a = interfaceC3111q;
            this.f113204b = str;
            this.f113205c = iVar;
            this.f113206d = j7;
            long jCurrentTimeMillis = System.currentTimeMillis();
            this.f113208f = jCurrentTimeMillis;
            this.f113209g = jCurrentTimeMillis;
        }

        @Override // og0.C8213a, og0.f
        public final void a(@Nullable ng0.g gVar) {
            InterfaceC3111q interfaceC3111q = this.f113203a;
            this.f113210i.getClass();
            k.a(interfaceC3111q);
            this.f113205c.a("");
            S9.b.a(new StringBuilder("onCancel videoName"), this.f113204b, "KingHonourVideoUploader");
        }

        @Override // og0.C8213a, og0.f
        public final void g(@Nullable ng0.g gVar, long j7, long j8) {
            if (this.h) {
                return;
            }
            boolean zAreEqual = Intrinsics.areEqual(gVar != null ? Float.valueOf(gVar.p()) : null, this.f113207e);
            i iVar = this.f113205c;
            if (!zAreEqual) {
                this.f113209g = System.currentTimeMillis();
                this.f113207e = gVar != null ? gVar.p() : 0.0f;
            } else if (System.currentTimeMillis() - this.f113209g >= 60000) {
                this.h = true;
                iVar.a("upload progress not change in 60 s");
                k kVar = this.f113210i;
                kVar.getClass();
                InterfaceC3111q interfaceC3111q = this.f113203a;
                interfaceC3111q.delete();
                interfaceC3111q.clearUploadCallback();
                List<InterfaceC3111q> list = kVar.f113202a;
                if (list != null) {
                    ((ArrayList) list).remove(interfaceC3111q);
                    return;
                }
                return;
            }
            float f7 = this.f113207e;
            boolean z6 = this.h;
            long j9 = this.f113209g;
            StringBuilder sb = new StringBuilder("onSpeedfileName");
            C3188c.a(this.f113204b, " forceCancel", " lastUploadTime", sb, z6);
            sb.append(this.f113208f);
            sb.append(" progress");
            sb.append(f7);
            BLog.e("KingHonourVideoUploader", androidx.exifinterface.media.a.a(j9, " lastProgressTime", " ", sb));
        }

        @Override // og0.C8213a, og0.f
        public final void i(@Nullable ng0.g gVar, @Nullable String str) {
            InterfaceC3111q interfaceC3111q = this.f113203a;
            this.f113210i.getClass();
            k.a(interfaceC3111q);
            this.f113205c.f113197a.resumeWith(Result.constructor-impl(gVar));
            StringBuilder sb = new StringBuilder("onSuccess videoName");
            sb.append(this.f113204b);
            sb.append(" fileSize");
            Os.f.b(sb, this.f113206d, "KingHonourVideoUploader");
        }

        @Override // og0.C8213a, og0.f
        public final void k(int i7, @Nullable ng0.g gVar) {
            InterfaceC3111q interfaceC3111q = this.f113203a;
            this.f113210i.getClass();
            k.a(interfaceC3111q);
            this.f113205c.a(C8092b.a(i7));
            S9.b.a(new StringBuilder("onFail videoName"), this.f113204b, "KingHonourVideoUploader");
        }
    }

    public static void a(InterfaceC3111q interfaceC3111q) {
        if (interfaceC3111q != null) {
            interfaceC3111q.delete();
        }
        if (interfaceC3111q != null) {
            interfaceC3111q.clearUploadCallback();
        }
    }
}
