package com.bilibili.ogvcommon.play.resolver;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.lib.media.resolver2.IResolveParams;
import com.bilibili.lib.media.resource.MediaResource;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;
import tv.danmaku.biliplayerv2.service.Video;
import tv.danmaku.biliplayerv2.service.resolve.AbsMediaResourceResolveTask;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogvcommon/play/resolver/f.class */
@StabilityInferred(parameters = 0)
public final class f extends AbsMediaResourceResolveTask {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final Context f73260m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final Video.PlayableParams f73261n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    public final IResolveParams f73262o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    public final String f73263p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Nullable
    public AbsMediaResourceResolveTask.ErrorInfo f73264q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Nullable
    public MediaResource f73265r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    public AbsMediaResourceResolveTask.IHistoryProgressReader f73266s;

    public f(@NotNull Context context, @NotNull Video.PlayableParams playableParams) {
        this.f73260m = context;
        this.f73261n = playableParams;
        this.f73262o = playableParams.getResolveParams();
        this.f73263p = playableParams.getFlashJsonStr();
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, pb0.c] */
    public final pb0.c a() {
        new ArrayList();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Object());
        arrayList.add(new OgvFlashMediaResourceResolveInterceptor(this.f73261n.getExpectedQuality(), this.f73263p));
        ?? obj = new Object();
        new ArrayList();
        ((pb0.c) obj).a = arrayList;
        return obj;
    }

    public final void cancel() {
    }

    @NotNull
    public final String getDescription() {
        return "MediaResourceResolveTask";
    }

    public final Object getError() {
        return this.f73264q;
    }

    public final Object getResult() {
        MediaResource mediaResource = this.f73265r;
        MediaResource backupResult = mediaResource;
        if (mediaResource == null) {
            backupResult = getBackupResult();
        }
        return backupResult;
    }

    public final void run() {
        dispatchTaskStart();
        try {
            IResolveParams iResolveParams = this.f73262o;
            MediaResource mediaResourceA = iResolveParams != null ? a().a(this.f73260m, iResolveParams) : null;
            this.f73265r = mediaResourceA;
            if (mediaResourceA == null) {
                dispatchTaskError();
                return;
            }
            AbsMediaResourceResolveTask.IHistoryProgressReader iHistoryProgressReader = this.f73266s;
            mediaResourceA.startPosition = iHistoryProgressReader != null ? iHistoryProgressReader.read(mediaResourceA) : 0;
            dispatchTaskSucceed();
        } catch (Exception e7) {
            AbsMediaResourceResolveTask.ErrorInfo errorInfo = new AbsMediaResourceResolveTask.ErrorInfo();
            this.f73264q = errorInfo;
            String message = e7.getMessage();
            String str = message;
            if (message == null) {
                str = "";
            }
            errorInfo.setHint(str);
            AbsMediaResourceResolveTask.ErrorInfo errorInfo2 = this.f73264q;
            if (errorInfo2 != null) {
                errorInfo2.setActionType(AbsMediaResourceResolveTask.ActionType.RELOAD);
            }
            BLog.w("OgvResolveTask$OgvMediaResourceResolveTask-run", "[ogv-common-OgvResolveTask$OgvMediaResourceResolveTask-run] Exception in resolving.", e7);
            dispatchTaskError();
        }
    }

    public final void setHistoryProgressReader(@NotNull AbsMediaResourceResolveTask.IHistoryProgressReader iHistoryProgressReader) {
        this.f73266s = iHistoryProgressReader;
    }
}
