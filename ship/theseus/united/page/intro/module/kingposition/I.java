package com.bilibili.ship.theseus.united.page.intro.module.kingposition;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.ImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.commons.io.IOUtils;
import com.bilibili.droid.ScreenUtil;
import com.bilibili.lib.mod.ModResource;
import com.bilibili.lib.mod.ModResourceClient;
import com.opensource.svgaplayer.SVGACallback;
import com.opensource.svgaplayer.SVGAImageView;
import com.opensource.svgaplayer.SVGAParser;
import com.opensource.svgaplayer.SVGAVideoEntity;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.lang.ref.WeakReference;
import java.net.URL;
import kntr.base.android.legacy.context.ContextUtilKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/kingposition/I.class */
@StabilityInferred(parameters = 0)
public final class I implements com.bilibili.ship.theseus.united.page.popupwindow.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final WeakReference<View> f100225a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f100226b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final String f100227c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public SVGAImageView f100228d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public com.bilibili.ship.theseus.united.page.popupwindow.g f100229e;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/kingposition/I$a.class */
    public static final class a implements SVGAParser.ParseCompletion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final FileInputStream f100230a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final SVGAImageView f100231b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final com.bilibili.ship.theseus.united.page.popupwindow.g f100232c;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.kingposition.I$a$a, reason: collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/kingposition/I$a$a.class */
        public static final class C1001a implements SVGACallback {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final com.bilibili.ship.theseus.united.page.popupwindow.g f100233a;

            public C1001a(com.bilibili.ship.theseus.united.page.popupwindow.g gVar) {
                this.f100233a = gVar;
            }

            public final void onFinished() {
                this.f100233a.dismiss();
            }

            public final void onPause() {
            }

            public final void onPreStart() {
            }

            public final void onRepeat() {
            }

            public final void onStep(int i7, double d7) {
            }
        }

        public a(FileInputStream fileInputStream, SVGAImageView sVGAImageView, com.bilibili.ship.theseus.united.page.popupwindow.g gVar) {
            this.f100230a = fileInputStream;
            this.f100231b = sVGAImageView;
            this.f100232c = gVar;
        }

        public final void onCacheExist() {
        }

        public final void onComplete(SVGAVideoEntity sVGAVideoEntity) {
            IOUtils.closeQuietly(this.f100230a);
            SVGAImageView sVGAImageView = this.f100231b;
            sVGAImageView.setLoops(1);
            sVGAImageView.setVideoItem(sVGAVideoEntity);
            sVGAImageView.setCallback(new C1001a(this.f100232c));
            sVGAImageView.stepToFrame(0, true);
        }

        public final void onError() {
            IOUtils.closeQuietly(this.f100230a);
        }
    }

    public I(@NotNull WeakReference<View> weakReference, long j7, @Nullable String str) {
        this.f100225a = weakReference;
        this.f100226b = j7;
        this.f100227c = str;
    }

    @Override // com.bilibili.ship.theseus.united.page.popupwindow.b
    @NotNull
    public final com.bilibili.ship.theseus.united.page.popupwindow.g a(@NotNull Context context) {
        com.bilibili.ship.theseus.united.page.popupwindow.g gVar = new com.bilibili.ship.theseus.united.page.popupwindow.g(context);
        SVGAImageView sVGAImageView = new SVGAImageView(context);
        sVGAImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        gVar.setContentView(sVGAImageView);
        int iDip2px = ScreenUtil.dip2px(context, 96.0f);
        gVar.setWidth(iDip2px);
        gVar.setHeight(iDip2px);
        gVar.setOutsideTouchable(true);
        gVar.setBackgroundDrawable(new ColorDrawable(0));
        gVar.setClippingEnabled(false);
        gVar.setFocusable(false);
        gVar.f102445f = true;
        this.f100228d = sVGAImageView;
        this.f100229e = gVar;
        return gVar;
    }

    @Override // com.bilibili.ship.theseus.united.page.popupwindow.b
    public final void b() {
        View view;
        SVGAImageView sVGAImageView;
        com.bilibili.ship.theseus.united.page.popupwindow.g gVar;
        Activity activityFindActivityOrNull;
        String str = this.f100227c;
        if (str == null || str.length() == 0) {
            try {
                c();
                return;
            } catch (FileNotFoundException e7) {
                e7.printStackTrace();
                return;
            }
        }
        if (str.length() == 0 || (view = this.f100225a.get()) == null || (sVGAImageView = this.f100228d) == null || (gVar = this.f100229e) == null || (activityFindActivityOrNull = ContextUtilKt.findActivityOrNull(view.getContext())) == null) {
            return;
        }
        new SVGAParser(activityFindActivityOrNull).parse(new URL(str), new J(sVGAImageView, gVar));
        int iB = Uj0.c.b(96.0f, activityFindActivityOrNull);
        gVar.showAsDropDown(view, (view.getWidth() - iB) / 2, -(view.getHeight() + iB));
    }

    public final void c() {
        com.bilibili.ship.theseus.united.page.popupwindow.g gVar;
        SVGAImageView sVGAImageView;
        File file;
        View view = this.f100225a.get();
        if (view == null || (gVar = this.f100229e) == null || (sVGAImageView = this.f100228d) == null) {
            return;
        }
        Context context = view.getContext();
        long j7 = this.f100226b;
        if (j7 <= 99) {
            file = null;
        } else {
            String str = j7 <= 999 ? "video_detail_like_animation_v2_1.svga" : "video_detail_like_animation_v2_2.svga";
            ModResource modResource = ModResourceClient.getInstance().get(context, "pink", "video_detail_like_animation");
            if (modResource.isAvailable()) {
                File fileRetrieveFile = modResource.retrieveFile(str);
                file = null;
                if (fileRetrieveFile != null) {
                    file = !fileRetrieveFile.exists() ? null : fileRetrieveFile;
                }
            } else {
                file = null;
            }
        }
        if (file == null) {
            return;
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        new SVGAParser(context).parse(fileInputStream, file.getName(), new a(fileInputStream, sVGAImageView, gVar));
        int iB = Uj0.c.b(96.0f, context);
        gVar.showAsDropDown(view, (view.getWidth() - iB) / 2, -(view.getHeight() + iB));
    }

    @Override // com.bilibili.ship.theseus.united.page.popupwindow.b
    public final int getType() {
        return 3;
    }
}
