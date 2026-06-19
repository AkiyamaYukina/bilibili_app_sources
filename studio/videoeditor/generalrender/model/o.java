package com.bilibili.studio.videoeditor.generalrender.model;

import Ih0.InterfaceC2297a;
import M3.C2601n;
import a5.C3188c;
import androidx.fragment.app.FragmentActivity;
import com.bilibili.lib.riskcontrol.RiskControl;
import com.bilibili.lib.ui.util.MultipleThemeUtils;
import com.bilibili.studio.videoeditor.extension.ActivityExtKt;
import com.bilibili.studio.videoeditor.generalrender.bean.GRUploadInfo;
import com.bilibili.studio.videoeditor.generalrender.bean.GRUploadInfoResult;
import com.bilibili.studio.videoeditor.generalrender.bean.GRVideoUploadResult;
import com.bilibili.studio.videoeditor.util.SimpleUtilKt;
import com.bilibili.upos.videoupload.UpOSTask;
import com.bilibili.upos.videoupload.UploadTaskInfo;
import com.bilibili.upos.videoupload.callback.DefaultUploadCallback;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/generalrender/model/o.class */
public final class o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final Lazy<o> f109626b = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, new C2601n(7));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public List<UpOSTask> f109627a;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/generalrender/model/o$a.class */
    public final class a extends DefaultUploadCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final UpOSTask f109628a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final GRUploadInfo f109629b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final String f109630c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final InterfaceC2297a f109631d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final long f109632e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        public final FragmentActivity f109633f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public float f109634g;
        public final long h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public long f109635i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public long f109636j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public long f109637k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public boolean f109638l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        @NotNull
        public final AtomicBoolean f109639m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final o f109640n;

        public a(@NotNull o oVar, @NotNull UpOSTask upOSTask, @NotNull GRUploadInfo gRUploadInfo, @NotNull String str, InterfaceC2297a interfaceC2297a, @NotNull long j7, FragmentActivity fragmentActivity) {
            this.f109640n = oVar;
            this.f109628a = upOSTask;
            this.f109629b = gRUploadInfo;
            this.f109630c = str;
            this.f109631d = interfaceC2297a;
            this.f109632e = j7;
            this.f109633f = fragmentActivity;
            long jCurrentTimeMillis = System.currentTimeMillis();
            this.h = jCurrentTimeMillis;
            this.f109635i = jCurrentTimeMillis;
            this.f109636j = jCurrentTimeMillis;
            this.f109637k = jCurrentTimeMillis;
            this.f109639m = new AtomicBoolean(false);
        }

        @Override // com.bilibili.upos.videoupload.callback.DefaultUploadCallback, com.bilibili.upos.videoupload.callback.UploadCallback
        public final void onCancel(@Nullable UploadTaskInfo uploadTaskInfo) {
            super.onCancel(uploadTaskInfo);
            v vVar = v.f109656a;
            FragmentActivity fragmentActivity = this.f109633f;
            vVar.getClass();
            v.a(fragmentActivity, true);
            o.a(this.f109628a);
            GRUploadInfo gRUploadInfo = this.f109629b;
            this.f109631d.a(k.l(gRUploadInfo.getName(), gRUploadInfo.getScene(), this.f109630c, this.f109632e, (System.currentTimeMillis() - this.h) / ((long) 1000), "failure", -500, "cancel upload", null, gRUploadInfo.getTemplateId(), 768));
            S9.b.a(new StringBuilder("onCancel videoName"), this.f109630c, "GRUploadVideoManager");
        }

        @Override // com.bilibili.upos.videoupload.callback.DefaultUploadCallback, com.bilibili.upos.videoupload.callback.UploadCallback
        public final void onFail(@Nullable UploadTaskInfo uploadTaskInfo, int i7) {
            super.onFail(uploadTaskInfo, i7);
            String vVoucher = uploadTaskInfo != null ? uploadTaskInfo.getVVoucher() : null;
            KH.c cVar = new KH.c(this, 4);
            m mVar = new m(this, this.f109640n, i7);
            FragmentActivity fragmentActivity = this.f109633f;
            if (i7 != 6 || vVoucher == null || vVoucher.length() == 0 || !ActivityExtKt.isActive(fragmentActivity)) {
                boolean zIsActive = ActivityExtKt.isActive(fragmentActivity);
                StringBuilder sbB = bilibili.live.app.service.resolver.a.b(i7, "dealUploadRiskControl error=", ",vVoucher=", vVoucher, ",act.isActive=");
                sbB.append(zIsActive);
                BLog.e("GRUploadVideoManager", sbB.toString());
                mVar.invoke();
                return;
            }
            if (this.f109639m.get()) {
                BLog.e("GRUploadVideoManager", "dealUploadRiskControl isShowRiskControl=true");
                return;
            }
            this.f109639m.set(true);
            boolean zIsNightTheme = MultipleThemeUtils.isNightTheme(fragmentActivity);
            RiskControl riskControl = new RiskControl();
            BLog.e("GRUploadVideoManager", "dealUploadRiskControl vVoucher=".concat(vVoucher));
            riskControl.showCaptcha(fragmentActivity, vVoucher, zIsNightTheme, new n(this, cVar, mVar));
        }

        @Override // com.bilibili.upos.videoupload.callback.DefaultUploadCallback, com.bilibili.upos.videoupload.callback.UploadCallback
        public final void onSpeed(@Nullable UploadTaskInfo uploadTaskInfo, long j7, long j8) {
            String str;
            super.onSpeed(uploadTaskInfo, j7, j8);
            if (this.f109638l) {
                return;
            }
            GRVideoUploadResult gRVideoUploadResult = new GRVideoUploadResult("uploading", SimpleUtilKt.jsonToJSONObject(uploadTaskInfo != null ? uploadTaskInfo.getResponseJson() : null), new GRUploadInfoResult(RangesKt.coerceAtLeast((uploadTaskInfo != null ? uploadTaskInfo.getProgress() : 0.0f) / 100.0f, 0.0f), j8, j7));
            Float fValueOf = null;
            if (uploadTaskInfo != null) {
                fValueOf = Float.valueOf(uploadTaskInfo.getProgress());
            }
            boolean zAreEqual = Intrinsics.areEqual(fValueOf, this.f109634g);
            InterfaceC2297a interfaceC2297a = this.f109631d;
            long j9 = this.h;
            GRUploadInfo gRUploadInfo = this.f109629b;
            boolean z6 = false;
            if (zAreEqual) {
                str = "";
                if (System.currentTimeMillis() - this.f109636j > 10000) {
                    this.f109636j = System.currentTimeMillis();
                    str = "upload progress not change in 10 s";
                    z6 = true;
                }
                if (System.currentTimeMillis() - this.f109637k >= 60000) {
                    this.f109638l = true;
                    o oVar = this.f109640n;
                    interfaceC2297a.a(k.l(gRUploadInfo.getName(), gRUploadInfo.getScene(), this.f109630c, this.f109632e, (System.currentTimeMillis() - j9) / ((long) 1000), "failure", -200, "upload file no changes in 60s", gRVideoUploadResult, gRUploadInfo.getTemplateId(), 512));
                    UpOSTask upOSTask = this.f109628a;
                    upOSTask.delete();
                    upOSTask.clearUploadCallback();
                    List<UpOSTask> list = oVar.f109627a;
                    if (list != null) {
                        ((ArrayList) list).remove(upOSTask);
                        return;
                    }
                    return;
                }
            } else {
                this.f109637k = System.currentTimeMillis();
                float progress = 0.0f;
                if (uploadTaskInfo != null) {
                    progress = uploadTaskInfo.getProgress();
                }
                this.f109634g = progress;
                z6 = false;
                str = "";
            }
            if (System.currentTimeMillis() - this.f109635i > 500) {
                interfaceC2297a.a(k.k(gRUploadInfo.getName(), gRUploadInfo.getScene(), this.f109630c, this.f109632e, (System.currentTimeMillis() - j9) / ((long) 1000), "stuck", 0, str, gRVideoUploadResult, z6, gRUploadInfo.getTemplateId()));
                this.f109635i = System.currentTimeMillis();
            }
            boolean z7 = this.f109638l;
            long j10 = this.f109635i;
            float f7 = this.f109634g;
            float progress2 = gRVideoUploadResult.getUploadInfo().getProgress();
            long j11 = this.f109637k;
            StringBuilder sb = new StringBuilder("onSpeed fileName");
            C3188c.a(this.f109630c, " forceCancel", " lastUploadTime", sb, z7);
            sb.append(j10);
            sb.append(" progress");
            sb.append(f7);
            sb.append(" info.progress");
            sb.append(progress2);
            sb.append(" lastProgressTime");
            sb.append(j11);
            sb.append(" ");
            BLog.e("GRUploadVideoManager", sb.toString());
        }

        @Override // com.bilibili.upos.videoupload.callback.DefaultUploadCallback, com.bilibili.upos.videoupload.callback.UploadCallback
        public final void onSuccess(@Nullable UploadTaskInfo uploadTaskInfo, @Nullable String str) {
            super.onSuccess(uploadTaskInfo, str);
            v vVar = v.f109656a;
            FragmentActivity fragmentActivity = this.f109633f;
            vVar.getClass();
            v.a(fragmentActivity, true);
            o.a(this.f109628a);
            GRUploadInfo gRUploadInfo = this.f109629b;
            this.f109631d.a(k.l(gRUploadInfo.getName(), gRUploadInfo.getScene(), this.f109630c, this.f109632e, (System.currentTimeMillis() - this.h) / ((long) 1000), "success", 0, null, new GRVideoUploadResult("success", SimpleUtilKt.jsonToJSONObject(uploadTaskInfo != null ? uploadTaskInfo.getResponseJson() : null), new GRUploadInfoResult(1.0f, 0.0f, 0L, 6, null)), gRUploadInfo.getTemplateId(), 640));
            StringBuilder sb = new StringBuilder("onSuccess videoName");
            sb.append(this.f109630c);
            sb.append(" fileSize");
            Os.f.b(sb, this.f109632e, "GRUploadVideoManager");
        }
    }

    public static void a(UpOSTask upOSTask) {
        if (upOSTask != null) {
            upOSTask.delete();
        }
        if (upOSTask != null) {
            upOSTask.clearUploadCallback();
        }
    }

    public final UpOSTask b(String str) {
        List<UpOSTask> list = this.f109627a;
        if (list == null) {
            return null;
        }
        for (UpOSTask upOSTask : list) {
            if (Intrinsics.areEqual(upOSTask != null ? upOSTask.getFilePath() : null, str)) {
                return upOSTask;
            }
        }
        return null;
    }

    public final void c() {
        List<UpOSTask> list = this.f109627a;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                a((UpOSTask) it.next());
            }
        }
        List<UpOSTask> list2 = this.f109627a;
        if (list2 != null) {
            ((ArrayList) list2).clear();
        }
        this.f109627a = null;
    }
}
