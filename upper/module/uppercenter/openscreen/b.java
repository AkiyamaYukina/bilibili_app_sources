package com.bilibili.upper.module.uppercenter.openscreen;

import GA0.a;
import aJ0.d;
import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.upper.module.uppercenter.openscreen.CountDownView;
import com.opensource.svgaplayer.SVGACallback;
import com.opensource.svgaplayer.SVGADrawable;
import com.opensource.svgaplayer.SVGAImageView;
import com.opensource.svgaplayer.SVGAParser;
import com.opensource.svgaplayer.SVGAVideoEntity;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/uppercenter/openscreen/b.class */
public final class b implements SVGAParser.ParseCompletion {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f114128a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f114129b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f114130c;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/uppercenter/openscreen/b$a.class */
    public static final class a implements SVGACallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f114131a;

        /* JADX INFO: renamed from: com.bilibili.upper.module.uppercenter.openscreen.b$a$a, reason: collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/uppercenter/openscreen/b$a$a.class */
        public static final class C1234a implements CountDownView.a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final d f114132a;

            public C1234a(d dVar) {
                this.f114132a = dVar;
            }

            @Override // com.bilibili.upper.module.uppercenter.openscreen.CountDownView.a
            public final void onFinish() {
                this.f114132a.dismiss();
            }
        }

        public a(d dVar) {
            this.f114131a = dVar;
        }

        public final void onFinished() {
        }

        public final void onPause() {
        }

        public final void onPreStart() {
            d dVar = this.f114131a;
            CountDownView countDownView = dVar.f31130d;
            CountDownView countDownView2 = countDownView;
            if (countDownView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("countDownView");
                countDownView2 = null;
            }
            countDownView2.setVisibility(0);
            CountDownView countDownView3 = dVar.f31130d;
            CountDownView countDownView4 = countDownView3;
            if (countDownView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("countDownView");
                countDownView4 = null;
            }
            if (!countDownView4.f114126d) {
                com.bilibili.upper.module.uppercenter.openscreen.a aVar = new com.bilibili.upper.module.uppercenter.openscreen.a(countDownView4);
                countDownView4.f114124b = aVar;
                aVar.cancel();
                countDownView4.f114124b.start();
                countDownView4.f114126d = true;
            }
            CountDownView countDownView5 = dVar.f31130d;
            if (countDownView5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("countDownView");
                countDownView5 = null;
            }
            countDownView5.setCountDownListener(new C1234a(dVar));
        }

        public final void onRepeat() {
        }

        public final void onStep(int i7, double d7) {
        }
    }

    public b(long j7, d dVar, String str) {
        this.f114128a = dVar;
        this.f114129b = j7;
        this.f114130c = str;
    }

    public final void onCacheExist() {
    }

    public final void onComplete(SVGAVideoEntity sVGAVideoEntity) {
        final d dVar = this.f114128a;
        Activity ownerActivity = dVar.getOwnerActivity();
        if (ownerActivity == null || !ownerActivity.isFinishing()) {
            ImageView imageView = dVar.f31131e;
            ImageView imageView2 = imageView;
            if (imageView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("svgaImg");
                imageView2 = null;
            }
            imageView2.setVisibility(0);
            CountDownView countDownView = dVar.f31130d;
            CountDownView countDownView2 = countDownView;
            if (countDownView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("countDownView");
                countDownView2 = null;
            }
            countDownView2.setVisibility(8);
            final long j7 = this.f114129b;
            d.a(j7, dVar, "svga");
            final String str = this.f114130c;
            if (str != null) {
                ImageView imageView3 = dVar.f31131e;
                ImageView imageView4 = imageView3;
                if (imageView3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("svgaImg");
                    imageView4 = null;
                }
                imageView4.setOnClickListener(new View.OnClickListener(j7, dVar, str) { // from class: aJ0.a

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final d f31117a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final String f31118b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final long f31119c;

                    {
                        this.f31117a = dVar;
                        this.f31118b = str;
                        this.f31119c = j7;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        d dVar2 = this.f31117a;
                        String str2 = this.f31118b;
                        long j8 = this.f31119c;
                        a.C0040a.b(GA0.a.f6978a, dVar2.getContext(), str2);
                        HashMap mapA = VF0.b.a(TE0.b.f24088a);
                        mapA.put("id", String.valueOf(j8));
                        mapA.put("type", "svga");
                        Neurons.reportClick(false, "creation.creation-center.main-page.0.click", mapA);
                        dVar2.f31134i = true;
                    }
                });
            }
            int height = (int) sVGAVideoEntity.getVideoSize().getHeight();
            int width = (int) sVGAVideoEntity.getVideoSize().getWidth();
            if (height > 0 && width > 0) {
                ImageView imageView5 = dVar.f31131e;
                ImageView imageView6 = imageView5;
                if (imageView5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("svgaImg");
                    imageView6 = null;
                }
                imageView6.getLayoutParams().width = dVar.f31132f - (dVar.getContext().getResources().getDimensionPixelSize(2131167254) * 2);
                ImageView imageView7 = dVar.f31131e;
                ImageView imageView8 = imageView7;
                if (imageView7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("svgaImg");
                    imageView8 = null;
                }
                ViewGroup.LayoutParams layoutParams = imageView8.getLayoutParams();
                ImageView imageView9 = dVar.f31131e;
                ImageView imageView10 = imageView9;
                if (imageView9 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("svgaImg");
                    imageView10 = null;
                }
                layoutParams.height = Math.min((imageView10.getLayoutParams().width * height) / width, dVar.f31133g - (dVar.getContext().getResources().getDimensionPixelSize(2131167254) * 2));
                ImageView imageView11 = dVar.f31131e;
                ImageView imageView12 = imageView11;
                if (imageView11 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("svgaImg");
                    imageView12 = null;
                }
                imageView12.requestLayout();
            }
            Drawable sVGADrawable = new SVGADrawable(sVGAVideoEntity);
            ImageView imageView13 = dVar.f31131e;
            ImageView imageView14 = imageView13;
            if (imageView13 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("svgaImg");
                imageView14 = null;
            }
            imageView14.setImageDrawable(sVGADrawable);
            SVGAImageView sVGAImageView = dVar.f31131e;
            SVGAImageView sVGAImageView2 = sVGAImageView;
            if (sVGAImageView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("svgaImg");
                sVGAImageView2 = null;
            }
            sVGAImageView2.setLoops(1);
            SVGAImageView sVGAImageView3 = dVar.f31131e;
            SVGAImageView sVGAImageView4 = sVGAImageView3;
            if (sVGAImageView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("svgaImg");
                sVGAImageView4 = null;
            }
            sVGAImageView4.setClearsAfterStop(false);
            SVGAImageView sVGAImageView5 = dVar.f31131e;
            SVGAImageView sVGAImageView6 = sVGAImageView5;
            if (sVGAImageView5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("svgaImg");
                sVGAImageView6 = null;
            }
            sVGAImageView6.setCallback(new a(dVar));
            SVGAImageView sVGAImageView7 = dVar.f31131e;
            if (sVGAImageView7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("svgaImg");
                sVGAImageView7 = null;
            }
            sVGAImageView7.startAnimation();
        }
    }

    public final void onError() {
    }
}
