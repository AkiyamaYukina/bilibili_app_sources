package com.bilibili.opd.app.bizcommon.imageselector.page;

import Hm0.C2138a;
import android.graphics.BitmapFactory;
import android.os.Handler;
import android.os.Looper;
import androidx.fragment.app.FragmentActivity;
import com.bilibili.boxing.model.entity.BaseMedia;
import com.bilibili.boxing.model.entity.impl.ImageMedia;
import com.bilibili.droid.ToastHelper;
import java.io.File;
import java.util.Locale;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* JADX INFO: renamed from: com.bilibili.opd.app.bizcommon.imageselector.page.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/imageselector/page/t.class */
public final /* synthetic */ class RunnableC5566t implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BaseMedia f73926a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MallMediaPreviewFragment f73927b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f73928c;

    public /* synthetic */ RunnableC5566t(BaseMedia baseMedia, MallMediaPreviewFragment mallMediaPreviewFragment, int i7) {
        this.f73926a = baseMedia;
        this.f73927b = mallMediaPreviewFragment;
        this.f73928c = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long length;
        final ImageMedia imageMedia = this.f73926a;
        final MallMediaPreviewFragment mallMediaPreviewFragment = this.f73927b;
        final int i7 = this.f73928c;
        final Ref.IntRef intRef = new Ref.IntRef();
        intRef.element = -1;
        if (!new File(imageMedia.getPath()).exists()) {
            intRef.element = 2131829896;
        } else if (imageMedia instanceof ImageMedia) {
            ImageMedia imageMedia2 = imageMedia;
            String compressPath = imageMedia2.getCompressPath();
            String str = compressPath;
            if (compressPath == null) {
                str = "";
            }
            if (C2138a.d(imageMedia2.getWidth(), imageMedia2.getHeight(), str)) {
                intRef.element = 2131829900;
            } else {
                String compressPath2 = imageMedia2.getCompressPath();
                String str2 = compressPath2;
                if (compressPath2 == null) {
                    str2 = "";
                }
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeFile(str2, options);
                defpackage.a.b("getImageMimeType -> mimeType: ", options.outMimeType, "MallMediaImageHelper");
                options.inJustDecodeBounds = false;
                String str3 = options.outMimeType;
                String str4 = str3;
                if (str3 == null) {
                    str4 = "";
                }
                if (!ArraysKt.contains(C2138a.f8729b, str4.toLowerCase(Locale.ROOT))) {
                    intRef.element = 2131829897;
                } else if (imageMedia2.isGif()) {
                    String compressPath3 = imageMedia2.getCompressPath();
                    if (compressPath3 == null) {
                        compressPath3 = "";
                    }
                    try {
                        length = new File(compressPath3).length();
                    } catch (Exception e7) {
                        length = 0;
                    }
                    double d7 = 1000;
                    if (((length * 1.0d) / d7) / d7 > 20) {
                        intRef.element = 2131829898;
                    }
                }
            }
        }
        Runnable runnable = new Runnable(mallMediaPreviewFragment, intRef, imageMedia, i7) { // from class: com.bilibili.opd.app.bizcommon.imageselector.page.u

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final MallMediaPreviewFragment f73929a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Ref.IntRef f73930b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final BaseMedia f73931c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final int f73932d;

            {
                this.f73929a = mallMediaPreviewFragment;
                this.f73930b = intRef;
                this.f73931c = imageMedia;
                this.f73932d = i7;
            }

            @Override // java.lang.Runnable
            public final void run() {
                MallMediaPreviewFragment mallMediaPreviewFragment2 = this.f73929a;
                Ref.IntRef intRef2 = this.f73930b;
                BaseMedia baseMedia = this.f73931c;
                int i8 = this.f73932d;
                if (mallMediaPreviewFragment2.f73844o.size() >= mallMediaPreviewFragment2.f73846q.getMaxImageCount()) {
                    FragmentActivity fragmentActivityP3 = mallMediaPreviewFragment2.p3();
                    if (fragmentActivityP3 != null) {
                        ToastHelper.showToastShort(fragmentActivityP3, fragmentActivityP3.getString(2131829906, new Object[]{String.valueOf(mallMediaPreviewFragment2.f73846q.getMaxImageCount())}));
                        return;
                    }
                    return;
                }
                if (-1 != intRef2.element) {
                    ToastHelper.showToastShort(mallMediaPreviewFragment2.getContext(), intRef2.element);
                } else {
                    mallMediaPreviewFragment2.f73844o.add(baseMedia);
                    mallMediaPreviewFragment2.qf(i8);
                }
            }
        };
        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
            runnable.run();
            return;
        }
        try {
            new Handler(Looper.getMainLooper()).post(runnable);
        } catch (Exception e8) {
            com.bilibili.biligame.router.j.a("update UI task fail. ", e8.getMessage());
        }
    }
}
