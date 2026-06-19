package com.bilibili.studio.kaleidoscope.sdk.montage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.compose.ui.text.font.C4496a;
import com.bilibili.lib.blconfig.ConfigManager;
import com.bilibili.lib.dd.DeviceDecision;
import com.bilibili.montage.MontageAssetPackageManager;
import com.bilibili.montage.MontageLoaderStatus;
import com.bilibili.montage.MontageStreamingContext;
import com.bilibili.montage.avinfo.MontageAVFileInfo;
import com.bilibili.montage.avinfo.MontageRational;
import com.bilibili.montage.avutil.MontageVideoFrameRetriever;
import com.bilibili.montage.export.ExportEngine;
import com.bilibili.montage.timeline.MontageTimeline;
import com.bilibili.studio.kaleidoscope.sdk.AVFileInfo;
import com.bilibili.studio.kaleidoscope.sdk.AssetPackageManager;
import com.bilibili.studio.kaleidoscope.sdk.AudioResolution;
import com.bilibili.studio.kaleidoscope.sdk.LiveWindow;
import com.bilibili.studio.kaleidoscope.sdk.LiveWindowContainer;
import com.bilibili.studio.kaleidoscope.sdk.LiveWindowContainerExt;
import com.bilibili.studio.kaleidoscope.sdk.LiveWindowExt;
import com.bilibili.studio.kaleidoscope.sdk.Rational;
import com.bilibili.studio.kaleidoscope.sdk.StreamingContext;
import com.bilibili.studio.kaleidoscope.sdk.Timeline;
import com.bilibili.studio.kaleidoscope.sdk.VideoFrameRetriever;
import com.bilibili.studio.kaleidoscope.sdk.VideoResolution;
import com.bilibili.studio.kaleidoscope.sdk.extension.StreamingContextEx;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/kaleidoscope/sdk/montage/MonStreamingContextImpl.class */
public final class MonStreamingContextImpl implements StreamingContext {
    private static final String TAG = "Mon.SC.Impl";
    private MontageStreamingContext mMonStreamingContext;
    private final StreamingContextEx mMonStreamingContextExImpl = new Object();

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/kaleidoscope/sdk/montage/MonStreamingContextImpl$ICreateStreamingContextCallback.class */
    public interface ICreateStreamingContextCallback {
        void onLoadResult(int i7, String str);
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/kaleidoscope/sdk/montage/MonStreamingContextImpl$MonSdkVersioImpl.class */
    public static final class MonSdkVersioImpl implements StreamingContext.SdkVersion {
        private static final String TAG = "Mon.SV.Wrapper";
        private MontageStreamingContext.SdkVersion mSdkVersion;

        private MonSdkVersioImpl(@NonNull MontageStreamingContext.SdkVersion sdkVersion) {
            this.mSdkVersion = sdkVersion;
        }

        @NonNull
        public static StreamingContext.SdkVersion box(@NonNull MontageStreamingContext.SdkVersion sdkVersion) {
            return new MonSdkVersioImpl(sdkVersion);
        }

        @NonNull
        public static MontageStreamingContext.SdkVersion unbox(@NonNull StreamingContext.SdkVersion sdkVersion) {
            return (MontageStreamingContext.SdkVersion) sdkVersion.getSdkVersion();
        }

        @Override // com.bilibili.studio.kaleidoscope.sdk.StreamingContext.SdkVersion
        public int getMajorVersion() {
            return this.mSdkVersion.majorVersion;
        }

        @Override // com.bilibili.studio.kaleidoscope.sdk.StreamingContext.SdkVersion
        public int getMinorVersion() {
            return this.mSdkVersion.minorVersion;
        }

        @Override // com.bilibili.studio.kaleidoscope.sdk.StreamingContext.SdkVersion
        public int getRevisionNumber() {
            return this.mSdkVersion.revisionNumber;
        }

        @Override // com.bilibili.studio.kaleidoscope.sdk.StreamingContext.SdkVersion
        public Object getSdkVersion() {
            return this.mSdkVersion;
        }

        @Override // com.bilibili.studio.kaleidoscope.sdk.StreamingContext.SdkVersion
        public void setMajorVersion(int i7) {
            this.mSdkVersion.majorVersion = i7;
        }

        @Override // com.bilibili.studio.kaleidoscope.sdk.StreamingContext.SdkVersion
        public void setMinorVersion(int i7) {
            this.mSdkVersion.minorVersion = i7;
        }

        @Override // com.bilibili.studio.kaleidoscope.sdk.StreamingContext.SdkVersion
        public void setRevisionNumber(int i7) {
            this.mSdkVersion.revisionNumber = i7;
        }

        @Override // com.bilibili.studio.kaleidoscope.sdk.StreamingContext.SdkVersion
        public void setSdkVersion(Object obj) {
            this.mSdkVersion = (MontageStreamingContext.SdkVersion) obj;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/kaleidoscope/sdk/montage/MonStreamingContextImpl$MonTemplateFootageInfoImpl.class */
    public static final class MonTemplateFootageInfoImpl implements StreamingContext.TemplateFootageInfo {
        private static final String TAG = "Mon.FI.Impl";
        private MontageStreamingContext.templateFootageInfo mTemplateFootageInfo;

        public MonTemplateFootageInfoImpl() {
            this.mTemplateFootageInfo = new MontageStreamingContext.templateFootageInfo();
        }

        private MonTemplateFootageInfoImpl(@NonNull MontageStreamingContext.templateFootageInfo templatefootageinfo) {
            this.mTemplateFootageInfo = templatefootageinfo;
        }

        @NonNull
        public static StreamingContext.TemplateFootageInfo box(@NonNull MontageStreamingContext.templateFootageInfo templatefootageinfo) {
            return new MonTemplateFootageInfoImpl(templatefootageinfo);
        }

        @NonNull
        public static MontageStreamingContext.templateFootageInfo unbox(@NonNull StreamingContext.TemplateFootageInfo templateFootageInfo) {
            return (MontageStreamingContext.templateFootageInfo) templateFootageInfo.getTemplateFootageInfo();
        }

        @Override // com.bilibili.studio.kaleidoscope.sdk.StreamingContext.TemplateFootageInfo
        public String getFilePath() {
            return this.mTemplateFootageInfo.filePath;
        }

        @Override // com.bilibili.studio.kaleidoscope.sdk.StreamingContext.TemplateFootageInfo
        public String getFootageId() {
            return this.mTemplateFootageInfo.footageId;
        }

        @Override // com.bilibili.studio.kaleidoscope.sdk.StreamingContext.TemplateFootageInfo
        public MontageStreamingContext.templateFootageInfo getTemplateFootageInfo() {
            return this.mTemplateFootageInfo;
        }

        @Override // com.bilibili.studio.kaleidoscope.sdk.StreamingContext.TemplateFootageInfo
        public void setFilePath(String str) {
            this.mTemplateFootageInfo.filePath = str;
        }

        @Override // com.bilibili.studio.kaleidoscope.sdk.StreamingContext.TemplateFootageInfo
        public void setFootageId(String str) {
            this.mTemplateFootageInfo.footageId = str;
        }

        @Override // com.bilibili.studio.kaleidoscope.sdk.StreamingContext.TemplateFootageInfo
        public void setTemplateFootageInfo(Object obj) {
            this.mTemplateFootageInfo = (MontageStreamingContext.templateFootageInfo) obj;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/kaleidoscope/sdk/montage/MonStreamingContextImpl$a.class */
    public final class a implements MontageStreamingContext.MontageGlobalSetting {
        @Override // com.bilibili.montage.MontageStreamingContext.MontageGlobalSetting
        public final boolean getAB(String str, boolean z6) {
            return ConfigManager.ab().get(str, Boolean.valueOf(z6)) == Boolean.TRUE;
        }

        @Override // com.bilibili.montage.MontageStreamingContext.MontageGlobalSetting
        public final String getConfig(String str, String str2) {
            return (String) ConfigManager.config().get(str, str2);
        }

        @Override // com.bilibili.montage.MontageStreamingContext.MontageGlobalSetting
        public final String getDeviceDecision(String str, String str2) {
            return DeviceDecision.INSTANCE.dd(str, str2);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/kaleidoscope/sdk/montage/MonStreamingContextImpl$b.class */
    public static final class b implements MontageStreamingContext.CompileCallback2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final StreamingContext.CompileCallback2 f108395a;

        public b(@NonNull StreamingContext.CompileCallback2 compileCallback2) {
            this.f108395a = compileCallback2;
        }

        @Override // com.bilibili.montage.MontageStreamingContext.CompileCallback2
        public final void onCompileCompleted(MontageTimeline montageTimeline, boolean z6) {
            this.f108395a.onCompileCompleted(MonTimelineImpl.box(montageTimeline), z6);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/kaleidoscope/sdk/montage/MonStreamingContextImpl$c.class */
    public static final class c implements MontageStreamingContext.CompileCallback3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final StreamingContext.CompileCallback3 f108396a;

        public c(@NonNull StreamingContext.CompileCallback3 compileCallback3) {
            this.f108396a = compileCallback3;
        }

        @Override // com.bilibili.montage.MontageStreamingContext.CompileCallback3
        public final void onCompileCompleted(String str, MontageTimeline montageTimeline, boolean z6, int i7, String str2, int i8) {
            this.f108396a.onCompileCompleted(str, null, z6, i7, str2, i8);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/kaleidoscope/sdk/montage/MonStreamingContextImpl$d.class */
    public static final class d implements MontageStreamingContext.CompileCallback4 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final StreamingContext.a f108397a;

        public d(@NonNull StreamingContext.a aVar) {
            this.f108397a = aVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [com.bilibili.studio.kaleidoscope.sdk.montage.a, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r0v52, types: [com.bilibili.studio.kaleidoscope.sdk.montage.a] */
        /* JADX WARN: Type inference failed for: r0v54, types: [com.bilibili.studio.kaleidoscope.sdk.montage.a] */
        /* JADX WARN: Type inference failed for: r0v56, types: [com.bilibili.studio.kaleidoscope.sdk.montage.a] */
        /* JADX WARN: Type inference failed for: r0v58, types: [com.bilibili.studio.kaleidoscope.sdk.montage.a] */
        /* JADX WARN: Type inference failed for: r0v60, types: [com.bilibili.studio.kaleidoscope.sdk.montage.a] */
        /* JADX WARN: Type inference failed for: r10v1 */
        /* JADX WARN: Type inference failed for: r10v2 */
        /* JADX WARN: Type inference failed for: r10v3 */
        /* JADX WARN: Type inference failed for: r1v19, types: [com.bilibili.studio.kaleidoscope.sdk.montage.a] */
        /* JADX WARN: Type inference failed for: r1v22, types: [com.bilibili.studio.kaleidoscope.sdk.montage.a] */
        /* JADX WARN: Type inference failed for: r1v25, types: [com.bilibili.studio.kaleidoscope.sdk.montage.a] */
        /* JADX WARN: Type inference failed for: r1v28, types: [com.bilibili.studio.kaleidoscope.sdk.montage.a] */
        /* JADX WARN: Type inference failed for: r1v31, types: [com.bilibili.studio.kaleidoscope.sdk.montage.a] */
        /* JADX WARN: Type inference failed for: r1v34, types: [com.bilibili.studio.kaleidoscope.sdk.montage.a] */
        /* JADX WARN: Type inference failed for: r1v37, types: [com.bilibili.studio.kaleidoscope.sdk.montage.a] */
        /* JADX WARN: Type inference failed for: r1v40, types: [com.bilibili.studio.kaleidoscope.sdk.montage.a] */
        @Override // com.bilibili.montage.MontageStreamingContext.CompileCallback4
        public final void onCompileCompleted(ExportEngine.ExportResult exportResult) {
            ?? r10;
            if (exportResult == null) {
                r10 = 0;
            } else {
                ?? obj = new Object();
                obj.f108414a = exportResult.actionID;
                obj.f108415b = MonTimelineImpl.box(exportResult.timeline);
                obj.f108416c = exportResult.isHardwareEncoder;
                obj.f108417d = exportResult.isSkipTranscode;
                obj.f108418e = exportResult.errorType;
                obj.f108419f = exportResult.errorInfo;
                obj.f108420g = exportResult.costTime;
                obj.h = exportResult.flags;
                r10 = obj;
            }
            com.bilibili.studio.videocompile.internal.sdk.meicam.d dVar = (com.bilibili.studio.videocompile.internal.sdk.meicam.d) this.f108397a;
            dVar.getClass();
            String strA = C4496a.a("compileCallback4:exportResult is ", "actionID=" + r10.f108414a + ", timeline=" + r10.f108415b + ", isHardwareEncoder=" + r10.f108416c + ", isSkipTranscode=" + r10.f108417d + ", errorType=" + r10.f108418e + ", errorInfo=" + r10.f108419f + ", costTime=" + r10.f108420g + ", flags=" + r10.h);
            com.bilibili.studio.videocompile.internal.sdk.meicam.g gVar = dVar.f108771a;
            OA0.b.b(gVar, strA);
            com.bilibili.studio.videocompile.internal.sdk.meicam.g.e(gVar, dVar.f108772b, dVar.f108773c, r10.f108414a, r10.f108416c, r10.f108418e, r10.f108419f, r10.f108417d);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/kaleidoscope/sdk/montage/MonStreamingContextImpl$e.class */
    public static final class e implements MontageStreamingContext.CompileCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final StreamingContext.CompileCallback f108398a;

        public e(@NonNull StreamingContext.CompileCallback compileCallback) {
            this.f108398a = compileCallback;
        }

        @Override // com.bilibili.montage.MontageStreamingContext.CompileCallback
        public final void onCompileFailed(MontageTimeline montageTimeline) {
            this.f108398a.onCompileFailed(MonTimelineImpl.box(montageTimeline));
        }

        @Override // com.bilibili.montage.MontageStreamingContext.CompileCallback
        public final void onCompileFinished(MontageTimeline montageTimeline) {
            this.f108398a.onCompileFinished(MonTimelineImpl.box(montageTimeline));
        }

        @Override // com.bilibili.montage.MontageStreamingContext.CompileCallback
        public final void onCompileProgress(MontageTimeline montageTimeline, int i7) {
            this.f108398a.onCompileProgress(null, i7);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/kaleidoscope/sdk/montage/MonStreamingContextImpl$f.class */
    public static final class f implements MontageStreamingContext.CompileFloatProgressCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final StreamingContext.CompileFloatProgressCallback f108399a;

        public f(@NonNull StreamingContext.CompileFloatProgressCallback compileFloatProgressCallback) {
            this.f108399a = compileFloatProgressCallback;
        }

        @Override // com.bilibili.montage.MontageStreamingContext.CompileFloatProgressCallback
        public final void onCompileFloatProgress(MontageTimeline montageTimeline, float f7) {
            this.f108399a.onCompileFloatProgress(null, f7);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/kaleidoscope/sdk/montage/MonStreamingContextImpl$g.class */
    public static final class g implements MontageStreamingContext.EventCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final StreamingContext.EventCallback f108400a;

        public g(@NonNull StreamingContext.EventCallback eventCallback) {
            this.f108400a = eventCallback;
        }

        @Override // com.bilibili.montage.MontageStreamingContext.EventCallback
        public final void trackEvent(String str, Hashtable<String, String> hashtable, boolean z6) {
            this.f108400a.trackEvent(str, hashtable, z6);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/kaleidoscope/sdk/montage/MonStreamingContextImpl$h.class */
    public static final class h implements MontageStreamingContext.HardwareErrorCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final StreamingContext.HardwareErrorCallback f108401a;

        public h(@NonNull StreamingContext.HardwareErrorCallback hardwareErrorCallback) {
            this.f108401a = hardwareErrorCallback;
        }

        @Override // com.bilibili.montage.MontageStreamingContext.HardwareErrorCallback
        public final void onHardwareError(int i7, String str) {
            this.f108401a.onHardwareError(i7, str);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/kaleidoscope/sdk/montage/MonStreamingContextImpl$i.class */
    public static final class i implements MontageStreamingContext.ImageGrabberCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final StreamingContext.ImageGrabberCallback f108402a;

        public i(@NonNull StreamingContext.ImageGrabberCallback imageGrabberCallback) {
            this.f108402a = imageGrabberCallback;
        }

        @Override // com.bilibili.montage.MontageStreamingContext.ImageGrabberCallback
        public final void onImageGrabbedArrived(Bitmap bitmap, long j7) {
            this.f108402a.onImageGrabbedArrived(bitmap, j7);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/kaleidoscope/sdk/montage/MonStreamingContextImpl$j.class */
    public static final class j implements MontageStreamingContext.PlaybackCallback2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final StreamingContext.PlaybackCallback2 f108403a;

        public j(@NonNull StreamingContext.PlaybackCallback2 playbackCallback2) {
            this.f108403a = playbackCallback2;
        }

        @Override // com.bilibili.montage.MontageStreamingContext.PlaybackCallback2
        public final void onPlaybackTimelinePosition(MontageTimeline montageTimeline, long j7) {
            this.f108403a.onPlaybackTimelinePosition(null, j7);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/kaleidoscope/sdk/montage/MonStreamingContextImpl$k.class */
    public static final class k implements MontageStreamingContext.PlaybackCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final StreamingContext.PlaybackCallback f108404a;

        public k(@NonNull StreamingContext.PlaybackCallback playbackCallback) {
            this.f108404a = playbackCallback;
        }

        @Override // com.bilibili.montage.MontageStreamingContext.PlaybackCallback
        public final void onPlaybackEOF(MontageTimeline montageTimeline) {
            this.f108404a.onPlaybackEOF(null);
        }

        @Override // com.bilibili.montage.MontageStreamingContext.PlaybackCallback
        public final void onPlaybackPreloadingCompletion(MontageTimeline montageTimeline) {
            this.f108404a.onPlaybackPreloadingCompletion(null);
        }

        @Override // com.bilibili.montage.MontageStreamingContext.PlaybackCallback
        public final void onPlaybackStopped(MontageTimeline montageTimeline) {
            this.f108404a.onPlaybackStopped(null);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/kaleidoscope/sdk/montage/MonStreamingContextImpl$l.class */
    public static final class l implements MontageStreamingContext.PlaybackDelayCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final StreamingContext.PlaybackDelayCallback f108405a;

        public l(@NonNull StreamingContext.PlaybackDelayCallback playbackDelayCallback) {
            this.f108405a = playbackDelayCallback;
        }

        @Override // com.bilibili.montage.MontageStreamingContext.PlaybackDelayCallback
        public final void onPlaybackDelayed(MontageTimeline montageTimeline, long j7, boolean z6) {
            this.f108405a.onPlaybackDelayed(MonTimelineImpl.box(montageTimeline), j7, z6);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/kaleidoscope/sdk/montage/MonStreamingContextImpl$m.class */
    public static final class m implements MontageStreamingContext.PlaybackExceptionCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final StreamingContext.PlaybackExceptionCallback f108406a;

        public m(StreamingContext.PlaybackExceptionCallback playbackExceptionCallback) {
            this.f108406a = playbackExceptionCallback;
        }

        @Override // com.bilibili.montage.MontageStreamingContext.PlaybackExceptionCallback
        public final void onPlaybackException(MontageTimeline montageTimeline, int i7, String str) {
            this.f108406a.onPlaybackException(MonTimelineImpl.box(montageTimeline), i7, str);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/kaleidoscope/sdk/montage/MonStreamingContextImpl$n.class */
    public static final class n implements MontageStreamingContext.SeekingCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final StreamingContext.SeekingCallback f108407a;

        public n(@NonNull StreamingContext.SeekingCallback seekingCallback) {
            this.f108407a = seekingCallback;
        }

        @Override // com.bilibili.montage.MontageStreamingContext.SeekingCallback
        public final void onSeekingTimelinePosition(MontageTimeline montageTimeline, long j7) {
            this.f108407a.onSeekingTimelinePosition(null, j7);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/kaleidoscope/sdk/montage/MonStreamingContextImpl$o.class */
    public static final class o implements MontageStreamingContext.StreamingEngineCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final StreamingContext.StreamingEngineCallback f108408a;

        public o(@NonNull StreamingContext.StreamingEngineCallback streamingEngineCallback) {
            this.f108408a = streamingEngineCallback;
        }

        @Override // com.bilibili.montage.MontageStreamingContext.StreamingEngineCallback
        public final void onFirstVideoFramePresented(MontageTimeline montageTimeline) {
            this.f108408a.onFirstVideoFramePresented(MonTimelineImpl.box(montageTimeline));
        }

        @Override // com.bilibili.montage.MontageStreamingContext.StreamingEngineCallback
        public final void onStreamingEngineStateChanged(int i7) {
            this.f108408a.onStreamingEngineStateChanged(i7);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/kaleidoscope/sdk/montage/MonStreamingContextImpl$p.class */
    public static final class p implements MontageStreamingContext.TimelineTimestampCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final StreamingContext.TimelineTimestampCallback f108409a;

        public p(@NonNull StreamingContext.TimelineTimestampCallback timelineTimestampCallback) {
            this.f108409a = timelineTimestampCallback;
        }

        @Override // com.bilibili.montage.MontageStreamingContext.TimelineTimestampCallback
        public final void onTimestampOutOfRange(MontageTimeline montageTimeline) {
            this.f108409a.onTimestampOutOfRange(MonTimelineImpl.box(montageTimeline));
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/kaleidoscope/sdk/montage/MonStreamingContextImpl$q.class */
    public static final class q implements MontageStreamingContext.MontageLogTraceCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final StreamingContext.ErrorLogTraceCallback f108410a;

        public q(@NonNull StreamingContext.ErrorLogTraceCallback errorLogTraceCallback) {
            this.f108410a = errorLogTraceCallback;
        }

        @Override // com.bilibili.montage.MontageStreamingContext.MontageLogTraceCallback
        public final void logTrace(int i7, String str, Map<String, String> map, boolean z6, List<String> list) {
            ay.b.a(androidx.constraintlayout.widget.e.a(i7, "logTrace:errorCode=", str, ",level=", ",needUpload="), z6, "Mon.Trace.Wrapper");
            this.f108410a.logTrace(i7, str, map, z6, list);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.bilibili.studio.kaleidoscope.sdk.extension.StreamingContextEx, java.lang.Object] */
    private MonStreamingContextImpl(@NonNull MontageStreamingContext montageStreamingContext) {
        this.mMonStreamingContext = montageStreamingContext;
    }

    public static StreamingContext as(Object obj) {
        return box((MontageStreamingContext) obj);
    }

    @NonNull
    public static StreamingContext box(@NonNull MontageStreamingContext montageStreamingContext) {
        return new MonStreamingContextImpl(montageStreamingContext);
    }

    private static void checkLoaderStatus(@Nullable ICreateStreamingContextCallback iCreateStreamingContextCallback) {
        int i7;
        String str;
        MontageLoaderStatus montageLoaderStatusCheckLoaderStatus = MontageStreamingContext.checkLoaderStatus();
        if (montageLoaderStatusCheckLoaderStatus == null) {
            i7 = -1;
            str = "checkLoaderStatus return null";
        } else {
            i7 = montageLoaderStatusCheckLoaderStatus.errorType;
            if (i7 != 0) {
                str = montageLoaderStatusCheckLoaderStatus.errorDetails;
            } else {
                i7 = 0;
                str = "";
            }
        }
        if (iCreateStreamingContextCallback != null) {
            iCreateStreamingContextCallback.onLoadResult(i7, str);
        }
    }

    public static void closeX() {
        MontageStreamingContext.close();
    }

    public static StreamingContext getInstanceX() {
        MontageStreamingContext montageStreamingContext = MontageStreamingContext.getInstance();
        return montageStreamingContext != null ? box(montageStreamingContext) : null;
    }

    @NonNull
    public static String getSdkVersionString() {
        return MontageStreamingContext.getSdkVersionString();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.bilibili.montage.MontageStreamingContext$MontageGlobalSetting, java.lang.Object] */
    @Nullable
    public static StreamingContext initX(Context context, String str, int i7, @Nullable ICreateStreamingContextCallback iCreateStreamingContextCallback) {
        checkLoaderStatus(iCreateStreamingContextCallback);
        MontageStreamingContext.setGlobalSetting(new Object());
        MontageStreamingContext montageStreamingContextInit = MontageStreamingContext.init(context.getApplicationContext(), str, i7);
        return montageStreamingContextInit != null ? new MonStreamingContextImpl(montageStreamingContextInit) : null;
    }

    public static void setMaxAudioReaderCountX(int i7) {
    }

    public static void setMaxImageReaderCountX(int i7) {
    }

    public static void setMaxReaderCountX(int i7) {
    }

    @NonNull
    public static MontageStreamingContext unbox(@NonNull StreamingContext streamingContext) {
        return (MontageStreamingContext) streamingContext.getStreamingContext();
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.StreamingContext
    public Timeline asTimeline(Object obj) {
        return MonTimelineImpl.box((MontageTimeline) obj);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.StreamingContext
    public void clearCachedResources(boolean z6) {
        this.mMonStreamingContext.clearCachedResources(z6);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.StreamingContext
    public void clearCachedResources(boolean z6, int i7) {
        this.mMonStreamingContext.clearCachedResources(z6, i7);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.StreamingContext
    public void close() {
        closeX();
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.StreamingContext
    public boolean compileTimeline(Timeline timeline, long j7, long j8, String str, int i7, int i8, int i9) {
        return compileTimeline(timeline, j7, j8, str, i7, i8, i9, "");
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.StreamingContext
    public boolean compileTimeline(Timeline timeline, long j7, long j8, String str, int i7, int i8, int i9, String str2) {
        Objects.toString(timeline);
        return this.mMonStreamingContext.compileTimeline(timeline != null ? MonTimelineImpl.unbox(timeline) : null, j7, j8, str, i7, i8, i9, str2);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.StreamingContext
    public boolean connectTimelineWithLiveWindow(Timeline timeline, LiveWindow liveWindow) {
        MonLiveWindowImpl monLiveWindowImpl;
        View liveWindow2 = LiveWindowContainer.getLiveWindow(liveWindow);
        if (liveWindow2 != null) {
            monLiveWindowImpl = (MonLiveWindowImpl) liveWindow2;
        } else {
            MonLiveWindowImpl monLiveWindowImplNewInstance = MonLiveWindowImpl.newInstance(liveWindow.getViewContext());
            LiveWindowContainer.addLiveWindow(liveWindow, monLiveWindowImplNewInstance);
            monLiveWindowImpl = monLiveWindowImplNewInstance;
        }
        return this.mMonStreamingContext.connectTimelineWithLiveWindow(MonTimelineImpl.unbox(timeline), monLiveWindowImpl);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.StreamingContext
    public boolean connectTimelineWithLiveWindowExt(Timeline timeline, LiveWindowExt liveWindowExt) {
        MonLiveWindowExtImpl monLiveWindowExtImpl;
        View liveWindowExt2 = LiveWindowContainerExt.getLiveWindowExt(liveWindowExt);
        if (liveWindowExt2 != null) {
            monLiveWindowExtImpl = (MonLiveWindowExtImpl) liveWindowExt2;
        } else {
            MonLiveWindowExtImpl monLiveWindowExtImplNewInstance = MonLiveWindowExtImpl.newInstance(liveWindowExt.getViewExtContext());
            LiveWindowContainerExt.addLiveWindowExt(liveWindowExt, monLiveWindowExtImplNewInstance);
            monLiveWindowExtImpl = monLiveWindowExtImplNewInstance;
        }
        return this.mMonStreamingContext.connectTimelineWithLiveWindowExt(MonTimelineImpl.unbox(timeline), monLiveWindowExtImpl);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.StreamingContext
    public void connectTimelineWithSurfaceTexture(Timeline timeline, SurfaceTexture surfaceTexture) {
        this.mMonStreamingContext.connectTimelineWithSurfaceTexture(MonTimelineImpl.unbox(timeline), surfaceTexture);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.StreamingContext
    public StreamingContext createAuxiliaryStreamingContext(int i7) {
        MontageStreamingContext montageStreamingContextCreateAuxiliaryStreamingContext = this.mMonStreamingContext.createAuxiliaryStreamingContext(i7);
        return montageStreamingContextCreateAuxiliaryStreamingContext != null ? box(montageStreamingContextCreateAuxiliaryStreamingContext) : null;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.StreamingContext
    public LiveWindow createLiveWindow(Context context) {
        return MonLiveWindowImpl.newInstance(context);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.StreamingContext
    public LiveWindowExt createLiveWindowExt(Context context) {
        return MonLiveWindowExtImpl.newInstance(context);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.StreamingContext
    public Timeline createTimeline(@NonNull VideoResolution videoResolution, @NonNull Rational rational, @NonNull AudioResolution audioResolution) {
        return createTimeline(videoResolution, rational, audioResolution, 0);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.StreamingContext
    @Nullable
    public Timeline createTimeline(@NonNull VideoResolution videoResolution, @NonNull Rational rational, @NonNull AudioResolution audioResolution, int i7) {
        Objects.toString(videoResolution);
        Objects.toString(rational);
        Objects.toString(audioResolution);
        MontageTimeline montageTimelineCreateTimeline = this.mMonStreamingContext.createTimeline(MonVideoResolutionImpl.unbox(videoResolution), MonRationalImpl.unbox(rational), MonAudioResolutionImpl.unbox(audioResolution), i7);
        return montageTimelineCreateTimeline != null ? MonTimelineImpl.box(montageTimelineCreateTimeline) : null;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.StreamingContext
    public Timeline createTimeline(String str, List<StreamingContext.TemplateFootageInfo> list) {
        Objects.toString(list);
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<StreamingContext.TemplateFootageInfo> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(MonTemplateFootageInfoImpl.unbox(it.next()));
        }
        return null;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.StreamingContext
    public VideoFrameRetriever createVideoFrameRetriever(String str) {
        MontageVideoFrameRetriever montageVideoFrameRetrieverCreateVideoFrameRetriever = this.mMonStreamingContext.createVideoFrameRetriever(str);
        return montageVideoFrameRetrieverCreateVideoFrameRetriever != null ? MonVideoFrameRetrieverImpl.box(montageVideoFrameRetrieverCreateVideoFrameRetriever) : null;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.StreamingContext
    public void destoryAuxiliaryStreamingContext(StreamingContext streamingContext) {
        Objects.toString(streamingContext);
        this.mMonStreamingContext.destoryAuxiliaryStreamingContext(streamingContext != null ? unbox(streamingContext) : null);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.StreamingContext
    public void destroyPlayer(Timeline timeline) {
        this.mMonStreamingContext.destroyPlayer(MonTimelineImpl.unbox(timeline));
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.StreamingContext
    public int detectVideoFileKeyframeInterval(String str) {
        return this.mMonStreamingContext.detectVideoFileKeyframeInterval(str);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.StreamingContext
    public AVFileInfo getAVFileInfo(@Nullable String str) {
        AVFileInfo aVFileInfoBox = null;
        if (str != null) {
            if (str.length() == 0) {
                aVFileInfoBox = null;
            } else {
                MontageAVFileInfo aVFileInfo = this.mMonStreamingContext.getAVFileInfo(str);
                aVFileInfoBox = null;
                if (aVFileInfo != null) {
                    aVFileInfoBox = MonAVFileInfoImpl.box(aVFileInfo);
                }
            }
        }
        return aVFileInfoBox;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.StreamingContext
    public AVFileInfo getAVFileInfo(String str, int i7) {
        MontageAVFileInfo aVFileInfo = this.mMonStreamingContext.getAVFileInfo(str);
        return aVFileInfo != null ? MonAVFileInfoImpl.box(aVFileInfo) : null;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.StreamingContext
    public AssetPackageManager getAssetPackageManager() {
        MontageAssetPackageManager assetPackageManager = this.mMonStreamingContext.getAssetPackageManager();
        return assetPackageManager != null ? MonAssetPackageManagerImpl.box(assetPackageManager) : null;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.StreamingContext
    public float getColorGainForSDRToHDR() {
        throw new IllegalStateException("MontageStreamingContext doesn't support getColorGainForSDRToHDR");
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.StreamingContext
    public Hashtable getCompileConfigurations() {
        Hashtable<String, Object> compileConfigurations = this.mMonStreamingContext.getCompileConfigurations();
        Hashtable hashtable = new Hashtable();
        if (compileConfigurations != null) {
            hashtable.putAll(compileConfigurations);
            Object obj = hashtable.get("fps");
            if (obj instanceof MontageRational) {
                hashtable.put("fps", MonRationalImpl.box((MontageRational) obj));
            }
        }
        return hashtable;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.StreamingContext
    public int getCustomCompileVideoHeight() {
        return this.mMonStreamingContext.getCustomCompileVideoHeight();
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.StreamingContext
    public int getEngineHDRCaps() {
        return this.mMonStreamingContext.getEngineHDRCaps();
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.StreamingContext
    public List<String> getExportTaskID() {
        return this.mMonStreamingContext.getExportTaskID();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bilibili.studio.kaleidoscope.sdk.Ex
    public StreamingContextEx getExtension() {
        return this.mMonStreamingContextExImpl;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.StreamingContext
    public StreamingContext getInstance() {
        return getInstanceX();
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Ex
    public long getObjHashCode() {
        return this.mMonStreamingContext.hashCode();
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.StreamingContext
    public StreamingContext.SdkVersion getSdkVersion() {
        MontageStreamingContext.SdkVersion sdkVersion = MontageStreamingContext.getSdkVersion();
        return sdkVersion != null ? MonSdkVersioImpl.box(sdkVersion) : null;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.StreamingContext
    public Object getStreamingContext() {
        return this.mMonStreamingContext;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.StreamingContext
    public int getStreamingEngineState() {
        return this.mMonStreamingContext.getStreamingEngineState();
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.StreamingContext
    public long getTimelineCurrentPosition(Timeline timeline) {
        Objects.toString(timeline);
        return this.mMonStreamingContext.getTimelineCurrentPosition(timeline != null ? MonTimelineImpl.unbox(timeline) : null);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.StreamingContext
    public Bitmap grabImageFromTimeline(Timeline timeline, long j7, Rational rational) {
        Objects.toString(timeline);
        Objects.toString(rational);
        MontageRational montageRationalUnbox = null;
        MontageTimeline montageTimelineUnbox = timeline != null ? MonTimelineImpl.unbox(timeline) : null;
        MontageStreamingContext montageStreamingContext = this.mMonStreamingContext;
        if (rational != null) {
            montageRationalUnbox = MonRationalImpl.unbox(rational);
        }
        return montageStreamingContext.grabImageFromTimeline(montageTimelineUnbox, j7, montageRationalUnbox);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.StreamingContext
    public boolean grabImageFromTimelineAsync(Timeline timeline, long j7, Rational rational, int i7) {
        Objects.toString(timeline);
        Objects.toString(rational);
        return this.mMonStreamingContext.grabImageFromTimelineAsync(timeline != null ? MonTimelineImpl.unbox(timeline) : null, j7, rational != null ? MonRationalImpl.unbox(rational) : null, i7);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.StreamingContext
    public StreamingContext init(Context context, String str, int i7) {
        Objects.toString(context);
        return initX(context, str, i7, null);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.StreamingContext
    public boolean isPlaybackPaused() {
        return false;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.StreamingContext
    public boolean isSdkAuthorised() {
        return this.mMonStreamingContext.isSdkAuthorised();
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.StreamingContext
    public boolean pauseCompiling() {
        return false;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.StreamingContext
    public boolean pausePlayback() {
        return this.mMonStreamingContext.pausePlayback();
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.StreamingContext
    public boolean playbackTimeline(Timeline timeline, long j7, long j8, int i7, boolean z6, int i8) {
        Objects.toString(timeline);
        return this.mMonStreamingContext.playbackTimeline(timeline != null ? MonTimelineImpl.unbox(timeline) : null, j7, j8, i7, z6, i8);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.StreamingContext
    public String registerFontByFilePath(String str) {
        return this.mMonStreamingContext.registerFontByFilePath(str);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.StreamingContext
    public boolean removeExportTaskID(String str) {
        return this.mMonStreamingContext.removeExportTaskID(str);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.StreamingContext
    public boolean removeTimeline(Timeline timeline) {
        Objects.toString(timeline);
        return this.mMonStreamingContext.removeTimeline(timeline != null ? MonTimelineImpl.unbox(timeline) : null);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.StreamingContext
    public boolean resumeCompiling() {
        return false;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.StreamingContext
    public boolean resumePlayback() {
        return this.mMonStreamingContext.resumePlayback();
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.StreamingContext
    public boolean seek(Timeline timeline, long j7, int i7, int i8) {
        Objects.toString(timeline);
        return this.mMonStreamingContext.seek(timeline != null ? MonTimelineImpl.unbox(timeline) : null, j7, i7, i8);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.StreamingContext
    public boolean seekTimeline(Timeline timeline, long j7, int i7, int i8) {
        Objects.toString(timeline);
        return this.mMonStreamingContext.seekTimeline(timeline != null ? MonTimelineImpl.unbox(timeline) : null, j7, i7, i8);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.StreamingContext
    public void setAuroraResourcePath(String str) {
        this.mMonStreamingContext.setResourcePath(str);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.StreamingContext
    public void setColorGainForSDRToHDR(float f7) {
        this.mMonStreamingContext.setColorGainForSDRToHDR(f7);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.StreamingContext
    public void setCompileCallback(StreamingContext.CompileCallback compileCallback) {
        Objects.toString(compileCallback);
        this.mMonStreamingContext.setCompileCallback(compileCallback != null ? new e(compileCallback) : null);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.StreamingContext
    public void setCompileCallback2(StreamingContext.CompileCallback2 compileCallback2) {
        Objects.toString(compileCallback2);
        this.mMonStreamingContext.setCompileCallback2(compileCallback2 != null ? new b(compileCallback2) : null);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.StreamingContext
    public void setCompileCallback3(StreamingContext.CompileCallback3 compileCallback3) {
        Objects.toString(compileCallback3);
        this.mMonStreamingContext.setCompileCallback3(compileCallback3 != null ? new c(compileCallback3) : null);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.StreamingContext
    public void setCompileCallback4(StreamingContext.a aVar) {
        Objects.toString(aVar);
        this.mMonStreamingContext.setCompileCallback4(aVar != null ? new d(aVar) : null);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.StreamingContext
    public void setCompileConfigurations(Hashtable hashtable) {
        Objects.toString(hashtable);
        Hashtable<String, Object> hashtable2 = new Hashtable<>(hashtable.size());
        hashtable2.putAll(hashtable);
        Object obj = hashtable2.get("fps");
        if (obj instanceof Rational) {
            hashtable2.put("fps", MonRationalImpl.unbox((Rational) obj));
        }
        this.mMonStreamingContext.setCompileConfigurations(hashtable2);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.StreamingContext
    public void setCompileFloatProgressCallback(StreamingContext.CompileFloatProgressCallback compileFloatProgressCallback) {
        Objects.toString(compileFloatProgressCallback);
        this.mMonStreamingContext.setCompileFloatProgressCallback(compileFloatProgressCallback != null ? new f(compileFloatProgressCallback) : null);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.StreamingContext
    public void setCustomCompileVideoHeight(int i7) {
        this.mMonStreamingContext.setCustomCompileVideoHeight(i7);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.StreamingContext
    public void setDebugLevel(int i7) {
        MontageStreamingContext.setDebugLevel(i7);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.StreamingContext
    public void setErrorLogTraceCallback(StreamingContext.ErrorLogTraceCallback errorLogTraceCallback) {
        MontageStreamingContext.setLogTraceCallback(errorLogTraceCallback != null ? new q(errorLogTraceCallback) : null);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.StreamingContext
    public void setEventCallback(StreamingContext.EventCallback eventCallback) {
        Objects.toString(eventCallback);
        MontageStreamingContext.setEventCallback(eventCallback != null ? new g(eventCallback) : null);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.StreamingContext
    public void setEventExtraInfo(Map<String, String> map) {
        this.mMonStreamingContext.setEventExtraInfo(map);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.StreamingContext
    public void setHardwareErrorCallback(StreamingContext.HardwareErrorCallback hardwareErrorCallback) {
        Objects.toString(hardwareErrorCallback);
        this.mMonStreamingContext.setHardwareErrorCallback(hardwareErrorCallback != null ? new h(hardwareErrorCallback) : null);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.StreamingContext
    public void setImageGrabberCallback(StreamingContext.ImageGrabberCallback imageGrabberCallback) {
        Objects.toString(imageGrabberCallback);
        this.mMonStreamingContext.setImageGrabberCallback(imageGrabberCallback != null ? new i(imageGrabberCallback) : null);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.StreamingContext
    public void setLogFilePath(String str) {
        MontageStreamingContext.setLogFilePath(str);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.StreamingContext
    public void setMaxAudioReaderCount(int i7) {
        this.mMonStreamingContext.setMaxAudioReaderCount(i7);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.StreamingContext
    public void setMaxImageReaderCount(int i7) {
        this.mMonStreamingContext.setMaxImageReaderCount(i7);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.StreamingContext
    public void setMaxReaderCount(int i7) {
        this.mMonStreamingContext.setMaxReaderCount(i7);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.StreamingContext
    public void setMediaCodecIconReaderEnabled(String str, boolean z6) {
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.StreamingContext
    public void setPlaybackCallback(StreamingContext.PlaybackCallback playbackCallback) {
        Objects.toString(playbackCallback);
        this.mMonStreamingContext.setPlaybackCallback(playbackCallback != null ? new k(playbackCallback) : null);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.StreamingContext
    public void setPlaybackCallback2(StreamingContext.PlaybackCallback2 playbackCallback2) {
        Objects.toString(playbackCallback2);
        this.mMonStreamingContext.setPlaybackCallback2(playbackCallback2 != null ? new j(playbackCallback2) : null);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.StreamingContext
    public void setPlaybackDelayCallback(StreamingContext.PlaybackDelayCallback playbackDelayCallback) {
        Objects.toString(playbackDelayCallback);
        this.mMonStreamingContext.setPlaybackDelayCallback(playbackDelayCallback != null ? new l(playbackDelayCallback) : null);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.StreamingContext
    public void setPlaybackExceptionCallback(StreamingContext.PlaybackExceptionCallback playbackExceptionCallback) {
        Objects.toString(playbackExceptionCallback);
        this.mMonStreamingContext.setPlaybackExceptionCallback(playbackExceptionCallback != null ? new m(playbackExceptionCallback) : null);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.StreamingContext
    public void setSaveDebugMessagesToFile(boolean z6) {
        MontageStreamingContext.setSaveDebugMessagesToFile(z6);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.StreamingContext
    public void setSeekingCallback(StreamingContext.SeekingCallback seekingCallback) {
        this.mMonStreamingContext.setSeekingCallback(seekingCallback != null ? new n(seekingCallback) : null);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.StreamingContext
    public void setStreamingContext(Object obj) {
        this.mMonStreamingContext = (MontageStreamingContext) obj;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.StreamingContext
    public void setStreamingEngineCallback(StreamingContext.StreamingEngineCallback streamingEngineCallback) {
        Objects.toString(streamingEngineCallback);
        this.mMonStreamingContext.setStreamingEngineCallback(streamingEngineCallback != null ? new o(streamingEngineCallback) : null);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.StreamingContext
    public void setTimelineTimestampCallback(StreamingContext.TimelineTimestampCallback timelineTimestampCallback) {
        Objects.toString(timelineTimestampCallback);
        this.mMonStreamingContext.setTimelineTimestampCallback(timelineTimestampCallback != null ? new p(timelineTimestampCallback) : null);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.StreamingContext
    public void stop() {
        this.mMonStreamingContext.stop();
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.StreamingContext
    public void stop(int i7) {
        e9.a.a(i7, "stop:\targ0=", "", TAG);
        this.mMonStreamingContext.stop(i7);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.StreamingContext
    public void updateTimeline(Timeline timeline) {
        Objects.toString(timeline);
        this.mMonStreamingContext.updateTimeline(timeline != null ? MonTimelineImpl.unbox(timeline) : null);
    }
}
