package com.bilibili.playerbizcommonv2.widget.quality;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.I0;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.app.gemini.ui.UIComponent;
import com.bilibili.lib.foundation.FoundationAlias;
import com.bilibili.lib.mod.ModErrorInfo;
import com.bilibili.lib.mod.ModResource;
import com.bilibili.lib.mod.ModResourceClient;
import com.bilibili.lib.mod.request.ModUpdateRequest;
import com.bilibili.lib.resmanager.ResDownloadRequest;
import com.bilibili.lib.resmanager.ResManager;
import com.bilibili.playerbizcommon.utils.ModGetHelper;
import com.opensource.svgaplayer.SVGAImageView;
import com.opensource.svgaplayer.SVGAVideoEntity;
import java.io.File;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: renamed from: com.bilibili.playerbizcommonv2.widget.quality.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/quality/k.class */
@StabilityInferred(parameters = 0)
public final class C5814k implements UIComponent<b> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static boolean f82847d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static boolean f82848e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final HDRType f82849a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final String f82850b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public SVGAVideoEntity f82851c;

    /* JADX INFO: renamed from: com.bilibili.playerbizcommonv2.widget.quality.k$a */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/quality/k$a.class */
    public static final class a {

        /* JADX INFO: renamed from: com.bilibili.playerbizcommonv2.widget.quality.k$a$a, reason: collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/quality/k$a$a.class */
        public static final class C0544a implements ModResourceClient.OnUpdateCallback {
            public final void onFail(ModUpdateRequest modUpdateRequest, ModErrorInfo modErrorInfo) {
            }

            public final void onSuccess(ModResource modResource) {
            }
        }

        /* JADX WARN: Type inference failed for: r3v0, types: [com.bilibili.lib.mod.ModResourceClient$OnUpdateCallback, java.lang.Object] */
        public static boolean a() {
            File[] fileArrListFiles;
            if (C5814k.f82847d) {
                return true;
            }
            ModResource modeResource = ModGetHelper.getModeResource(FoundationAlias.getFapp(), "mainSiteAndroid", "hdr_instruction_res");
            if (modeResource != null && modeResource.isAvailable() && modeResource.getResourceDirPath() != null) {
                File file = new File(modeResource.getResourceDirPath());
                if (file.exists() && (fileArrListFiles = file.listFiles()) != null && fileArrListFiles.length != 0) {
                    for (File file2 : fileArrListFiles) {
                        if (file2.isDirectory()) {
                            File[] fileArrListFiles2 = file2.listFiles();
                            if (fileArrListFiles2 != null && fileArrListFiles2.length != 0) {
                                for (File file3 : fileArrListFiles2) {
                                    if (file3.isFile() && StringsKt.n(file3.getPath(), "hdr_loading")) {
                                        C5814k.f82847d = true;
                                        return true;
                                    }
                                }
                            }
                        } else if (StringsKt.n(file2.getPath(), "hdr_loading")) {
                            C5814k.f82847d = true;
                            return true;
                        }
                    }
                }
            }
            if (!C5814k.f82848e && !C5814k.f82847d) {
                C5814k.f82848e = true;
                ModResourceClient.getInstance().update(FoundationAlias.getFapp(), I0.a("mainSiteAndroid", "hdr_instruction_res", true), (ModResourceClient.OnUpdateCallback) new Object());
            }
            return C5814k.f82847d;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.playerbizcommonv2.widget.quality.k$b */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/quality/k$b.class */
    @StabilityInferred(parameters = 0)
    public static final class b extends UIComponent.b<View> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final SVGAImageView f82852b;

        public b(@NotNull View view, @NotNull SVGAImageView sVGAImageView) {
            super(view);
            this.f82852b = sVGAImageView;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.playerbizcommonv2.widget.quality.k$c */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/quality/k$c.class */
    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f82853a;

        static {
            int[] iArr = new int[HDRType.values().length];
            try {
                iArr[HDRType.HDR.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[HDRType.HDRVIVID.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            f82853a = iArr;
        }
    }

    public C5814k(@NotNull HDRType hDRType, @Nullable String str) {
        this.f82849a = hDRType;
        this.f82850b = str;
    }

    public final Object bindToView(UIComponent.ViewEntry viewEntry, Continuation continuation) {
        b bVar = (b) viewEntry;
        String str = this.f82850b;
        if (str == null || str.length() == 0) {
            if (this.f82851c == null) {
                ModResource modeResource = ModGetHelper.getModeResource(FoundationAlias.getFapp(), "mainSiteAndroid", "hdr_instruction_res");
                if (modeResource != null) {
                    int i7 = c.f82853a[this.f82849a.ordinal()];
                    ModGetHelper.getSvgaFileFromMod(FoundationAlias.getFapp(), modeResource, i7 != 1 ? i7 != 2 ? "hdr_loading.svga" : "hdrvivid_loading.svga" : "hdr_loading.svga", new C5815l(bVar, this));
                } else {
                    BLog.e("hdr anim load fail");
                }
            } else {
                bVar.f82852b.startAnimation();
            }
        } else if (this.f82851c != null || str.length() == 0) {
            bVar.f82852b.startAnimation();
        } else {
            ResManager.download(new ResDownloadRequest(str, null, 2, null), new C5816m(bVar, this));
        }
        return Unit.INSTANCE;
    }

    public final UIComponent.ViewEntry createViewEntry(Context context, ViewGroup viewGroup) {
        View viewInflate = LayoutInflater.from(context).inflate(2131496496, viewGroup, false);
        return new b(viewInflate, viewInflate.findViewById(2131309757));
    }
}
