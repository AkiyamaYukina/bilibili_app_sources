package com.bilibili.playerbizcommonv2.widget.quality;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.I0;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.app.gemini.ui.UIComponent;
import com.bilibili.lib.foundation.FoundationAlias;
import com.bilibili.lib.mod.ModResource;
import com.bilibili.lib.mod.ModResourceClient;
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

/* JADX INFO: renamed from: com.bilibili.playerbizcommonv2.widget.quality.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/quality/g.class */
@StabilityInferred(parameters = 0)
public final class C5810g implements UIComponent<b> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f82819b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f82820c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public SVGAVideoEntity f82821a;

    /* JADX INFO: renamed from: com.bilibili.playerbizcommonv2.widget.quality.g$a */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/quality/g$a.class */
    public static final class a {
        public static boolean a() {
            File[] fileArrListFiles;
            if (C5810g.f82819b) {
                return true;
            }
            ModResource modeResource = ModGetHelper.getModeResource(FoundationAlias.getFapp(), "mainSiteAndroid", "dolby_vision_instruction_res");
            if (modeResource != null && modeResource.isAvailable() && modeResource.getResourceDirPath() != null) {
                File file = new File(modeResource.getResourceDirPath());
                if (file.exists() && (fileArrListFiles = file.listFiles()) != null) {
                    for (File file2 : fileArrListFiles) {
                        if (file2.isDirectory()) {
                            File[] fileArrListFiles2 = file2.listFiles();
                            if (fileArrListFiles2 != null) {
                                for (File file3 : fileArrListFiles2) {
                                    if (file3.isFile() && StringsKt.n(file3.getPath(), "dolby_vision_loading")) {
                                        C5810g.f82819b = true;
                                        return true;
                                    }
                                }
                            } else {
                                continue;
                            }
                        } else if (StringsKt.n(file2.getPath(), "dolby_vision_loading")) {
                            C5810g.f82819b = true;
                            return true;
                        }
                    }
                }
            }
            if (!C5810g.f82820c && !C5810g.f82819b) {
                C5810g.f82820c = true;
                ModResourceClient.getInstance().update(FoundationAlias.getFapp(), I0.a("mainSiteAndroid", "dolby_vision_instruction_res", true), (ModResourceClient.OnUpdateCallback) null);
            }
            return C5810g.f82819b;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.playerbizcommonv2.widget.quality.g$b */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/quality/g$b.class */
    @StabilityInferred(parameters = 0)
    public static final class b extends UIComponent.b<View> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final SVGAImageView f82822b;

        public b(@NotNull View view, @NotNull SVGAImageView sVGAImageView) {
            super(view);
            this.f82822b = sVGAImageView;
        }
    }

    public final Object bindToView(UIComponent.ViewEntry viewEntry, Continuation continuation) {
        b bVar = (b) viewEntry;
        if (this.f82821a == null) {
            ModResource modeResource = ModGetHelper.getModeResource(FoundationAlias.getFapp(), "mainSiteAndroid", "dolby_vision_instruction_res");
            if (modeResource != null) {
                ModGetHelper.getSvgaFileFromMod(FoundationAlias.getFapp(), modeResource, "dolby_vision_loading.svga", new C5811h(this, bVar));
            } else {
                BLog.e("dolby_vision anim load fail");
            }
        } else {
            bVar.f82822b.startAnimation();
        }
        return Unit.INSTANCE;
    }

    public final UIComponent.ViewEntry createViewEntry(Context context, ViewGroup viewGroup) {
        View viewInflate = LayoutInflater.from(context).inflate(2131496493, viewGroup, false);
        return new b(viewInflate, viewInflate.findViewById(2131309752));
    }
}
