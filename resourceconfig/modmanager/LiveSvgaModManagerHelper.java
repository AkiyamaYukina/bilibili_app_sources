package com.bilibili.resourceconfig.modmanager;

import Js0.f;
import Js0.h;
import android.app.Application;
import android.util.Log;
import com.bilibili.base.BiliContext;
import com.bilibili.commons.io.IOUtils;
import com.bilibili.lib.mod.ModResource;
import com.bilibili.lib.mod.ModResourceClient;
import com.bilibili.lib.mod.request.ModUpdateRequest;
import com.bilibili.resourceconfig.modmanager.LiveSvgaModManagerHelper;
import com.opensource.svgaplayer.SVGADrawable;
import com.opensource.svgaplayer.SVGAImageView;
import com.opensource.svgaplayer.SVGAParser;
import com.opensource.svgaplayer.SVGAVideoEntity;
import java.io.File;
import java.io.FileInputStream;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.ReplaceWith;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CancellableContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/resourceconfig/modmanager/LiveSvgaModManagerHelper.class */
public final class LiveSvgaModManagerHelper {

    @NotNull
    public static final LiveSvgaModManagerHelper INSTANCE = new LiveSvgaModManagerHelper();

    @NotNull
    public static final String TAG = "LiveSvgaModManagerHelper";

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/resourceconfig/modmanager/LiveSvgaModManagerHelper$a.class */
    public static final class a implements SVGAParser.ParseCompletion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final FileInputStream f86246a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Function1<SVGAVideoEntity, Unit> f86247b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Function0<Unit> f86248c;

        public a(FileInputStream fileInputStream, Function1<? super SVGAVideoEntity, Unit> function1, Function0<Unit> function0) {
            this.f86246a = fileInputStream;
            this.f86247b = function1;
            this.f86248c = function0;
        }

        public final void onCacheExist() {
        }

        public final void onComplete(SVGAVideoEntity sVGAVideoEntity) {
            IOUtils.closeQuietly(this.f86246a);
            this.f86247b.invoke(sVGAVideoEntity);
        }

        public final void onError() {
            IOUtils.closeQuietly(this.f86246a);
            this.f86248c.invoke();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/resourceconfig/modmanager/LiveSvgaModManagerHelper$b.class */
    public static final class b implements SVGAParser.ParseCompletion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final FileInputStream f86249a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Function1<SVGADrawable, Unit> f86250b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Function0<Unit> f86251c;

        public b(FileInputStream fileInputStream, Function1<? super SVGADrawable, Unit> function1, Function0<Unit> function0) {
            this.f86249a = fileInputStream;
            this.f86250b = function1;
            this.f86251c = function0;
        }

        public final void onCacheExist() {
        }

        public final void onComplete(SVGAVideoEntity sVGAVideoEntity) {
            IOUtils.closeQuietly(this.f86249a);
            this.f86250b.invoke(new SVGADrawable(sVGAVideoEntity));
        }

        public final void onError() {
            IOUtils.closeQuietly(this.f86249a);
            this.f86251c.invoke();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/resourceconfig/modmanager/LiveSvgaModManagerHelper$c.class */
    public static final class c implements Function1<SVGADrawable, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CancellableContinuationImpl f86252a;

        public c(CancellableContinuationImpl cancellableContinuationImpl) {
            this.f86252a = cancellableContinuationImpl;
        }

        public final Object invoke(Object obj) {
            this.f86252a.resumeWith(Result.constructor-impl((SVGADrawable) obj));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/resourceconfig/modmanager/LiveSvgaModManagerHelper$d.class */
    public static final class d implements Function0<Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CancellableContinuationImpl f86253a;

        public d(CancellableContinuationImpl cancellableContinuationImpl) {
            this.f86253a = cancellableContinuationImpl;
        }

        public final Object invoke() {
            this.f86253a.resumeWith(Result.constructor-impl((Object) null));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/resourceconfig/modmanager/LiveSvgaModManagerHelper$e.class */
    public static final class e implements SVGAParser.ParseCompletion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final FileInputStream f86254a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final SVGAImageView f86255b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f86256c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f86257d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Function0<Unit> f86258e;

        public e(FileInputStream fileInputStream, SVGAImageView sVGAImageView, boolean z6, String str, Function0<Unit> function0) {
            this.f86254a = fileInputStream;
            this.f86255b = sVGAImageView;
            this.f86256c = z6;
            this.f86257d = str;
            this.f86258e = function0;
        }

        public final void onCacheExist() {
        }

        public final void onComplete(SVGAVideoEntity sVGAVideoEntity) {
            IOUtils.closeQuietly(this.f86254a);
            SVGAImageView sVGAImageView = this.f86255b;
            sVGAImageView.setVideoItem(sVGAVideoEntity);
            if (this.f86256c) {
                sVGAImageView.startAnimation();
            }
            BLog.e(LiveFileModManagerHelper.TAG, "parse " + this.f86257d + " success");
        }

        public final void onError() {
            IOUtils.closeQuietly(this.f86254a);
            this.f86258e.invoke();
            BLog.e(LiveFileModManagerHelper.TAG, "parse " + this.f86257d + " error");
        }
    }

    @JvmStatic
    public static final void getSvgaFilePath(@NotNull String str, @NotNull String str2, @NotNull Function1<? super File, Unit> function1, @NotNull Function0<Unit> function0) {
        File fileRetrieveFile;
        ModResource modResource = ModResourceClient.getInstance().get(BiliContext.application(), "live", str);
        if (!modResource.isAvailable()) {
            function0.invoke();
            return;
        }
        try {
            fileRetrieveFile = modResource.retrieveFile(str2);
        } catch (Exception e7) {
            Log.e(TAG, String.valueOf(e7.getMessage()));
            fileRetrieveFile = null;
        }
        if (fileRetrieveFile != null) {
            function1.invoke(fileRetrieveFile);
        } else {
            function0.invoke();
        }
    }

    public static /* synthetic */ void getSvgaFilePath$default(String str, String str2, Function1 function1, Function0 function0, int i7, Object obj) {
        if ((i7 & 8) != 0) {
            function0 = new f(0);
        }
        getSvgaFilePath(str, str2, function1, function0);
    }

    @JvmStatic
    @JvmOverloads
    public static final void parseSvga(@NotNull String str, @NotNull String str2, @NotNull SVGAImageView sVGAImageView) {
        parseSvga$default(str, str2, sVGAImageView, false, null, 24, null);
    }

    @JvmStatic
    @JvmOverloads
    public static final void parseSvga(@NotNull String str, @NotNull String str2, @NotNull SVGAImageView sVGAImageView, boolean z6) {
        parseSvga$default(str, str2, sVGAImageView, z6, null, 16, null);
    }

    @JvmStatic
    @JvmOverloads
    public static final void parseSvga(@NotNull String str, @NotNull final String str2, @NotNull final SVGAImageView sVGAImageView, final boolean z6, @NotNull final Function0<Unit> function0) {
        try {
            getSvgaFilePath(str, str2, new Function1(sVGAImageView, str2, z6, function0) { // from class: Js0.g

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final SVGAImageView f11680a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final String f11681b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final boolean f11682c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final Function0 f11683d;

                {
                    this.f11680a = sVGAImageView;
                    this.f11681b = str2;
                    this.f11682c = z6;
                    this.f11683d = function0;
                }

                public final Object invoke(Object obj) {
                    LiveSvgaModManagerHelper liveSvgaModManagerHelper = LiveSvgaModManagerHelper.INSTANCE;
                    FileInputStream fileInputStream = new FileInputStream((File) obj);
                    SVGAImageView sVGAImageView2 = this.f11680a;
                    SVGAParser sVGAParser = new SVGAParser(sVGAImageView2.getContext());
                    Function0 function02 = this.f11683d;
                    boolean z7 = this.f11682c;
                    String str3 = this.f11681b;
                    sVGAParser.parse(fileInputStream, str3, new LiveSvgaModManagerHelper.e(fileInputStream, sVGAImageView2, z7, str3, function02));
                    return Unit.INSTANCE;
                }
            }, function0);
        } catch (Exception e7) {
            function0.invoke();
            BLog.e(LiveFileModManagerHelper.TAG, "parse " + str2 + " error");
        }
    }

    public static /* synthetic */ void parseSvga$default(String str, String str2, SVGAImageView sVGAImageView, boolean z6, Function0 function0, int i7, Object obj) {
        if ((i7 & 8) != 0) {
            z6 = true;
        }
        if ((i7 & 16) != 0) {
            function0 = new Js0.c(0);
        }
        parseSvga(str, str2, sVGAImageView, z6, function0);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "该方法只构造了Mod请求，没有真实请求。但目前可以正常下载资源，可能是其他地方触发了该Mod的更新。暂不做改动，但不建议继续使用", replaceWith = @ReplaceWith(expression = "ModResourceClient.getInstance().update", imports = {}))
    @JvmStatic
    public static final void synHighPrioritySvgaRes() {
        new ModUpdateRequest.Builder("live", "liveHighSVGA").isImmediate(true).build();
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "该方法只构造了Mod请求，没有真实请求。但目前可以正常下载资源，可能是其他地方触发了该Mod的更新。暂不做改动，但不建议继续使用", replaceWith = @ReplaceWith(expression = "ModResourceClient.getInstance().update", imports = {}))
    @JvmStatic
    public static final void synStandardSvgaRes() {
        new ModUpdateRequest.Builder("live", "liveStandardSVGA").isImmediate(true).build();
    }

    public final void getSVGAVideoItem(@NotNull String str, @NotNull String str2, @NotNull Function1<? super SVGAVideoEntity, Unit> function1, @NotNull final Function0<Unit> function0) {
        final int i7 = 0;
        getSvgaFilePath(str, str2, new h(function0, 0, str2, function1), new Function0(function0, i7) { // from class: Js0.i

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f11688a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Function0 f11689b;

            {
                this.f11688a = i7;
                this.f11689b = function0;
            }

            public final Object invoke() {
                Function0 function02 = this.f11689b;
                switch (this.f11688a) {
                    case 0:
                        LiveSvgaModManagerHelper liveSvgaModManagerHelper = LiveSvgaModManagerHelper.INSTANCE;
                        function02.invoke();
                        break;
                    default:
                        function02.invoke();
                        break;
                }
                return Unit.INSTANCE;
            }
        });
    }

    @Nullable
    public final Object getSvgaDrawable(@NotNull String str, @NotNull String str2, @NotNull Continuation<? super SVGADrawable> continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        INSTANCE.getSvgaDrawable(str, str2, new c(cancellableContinuationImpl), new d(cancellableContinuationImpl));
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    public final void getSvgaDrawable(@NotNull String str, @NotNull final String str2, @NotNull final Function1<? super SVGADrawable, Unit> function1, @NotNull final Function0<Unit> function0) {
        final int i7 = 0;
        getSvgaFilePath(str, str2, new Function1(str2, function1, function0) { // from class: Js0.d

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Function0 f11674a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f11675b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final Function1 f11676c;

            {
                this.f11674a = function0;
                this.f11675b = str2;
                this.f11676c = function1;
            }

            public final Object invoke(Object obj) {
                LiveSvgaModManagerHelper liveSvgaModManagerHelper = LiveSvgaModManagerHelper.INSTANCE;
                FileInputStream fileInputStream = new FileInputStream((File) obj);
                Application application = BiliContext.application();
                Function0 function02 = this.f11674a;
                if (application != null) {
                    new SVGAParser(application).parse(fileInputStream, this.f11675b, new LiveSvgaModManagerHelper.b(fileInputStream, this.f11676c, function02));
                } else {
                    function02.invoke();
                }
                return Unit.INSTANCE;
            }
        }, new Function0(function0, i7) { // from class: Js0.e

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f11677a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Function0 f11678b;

            {
                this.f11677a = i7;
                this.f11678b = function0;
            }

            public final Object invoke() {
                Function0 function02 = this.f11678b;
                switch (this.f11677a) {
                    case 0:
                        LiveSvgaModManagerHelper liveSvgaModManagerHelper = LiveSvgaModManagerHelper.INSTANCE;
                        function02.invoke();
                        break;
                    default:
                        function02.invoke();
                        break;
                }
                return Unit.INSTANCE;
            }
        });
    }
}
