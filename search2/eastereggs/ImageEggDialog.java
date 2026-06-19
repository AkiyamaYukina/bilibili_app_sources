package com.bilibili.search2.eastereggs;

import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.lib.blkv.SharedPrefX;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.blrouter.RouteRequest;
import com.bilibili.lib.image2.BiliImageLoader;
import com.bilibili.lib.image2.ImageRequestBuilder;
import com.bilibili.lib.image2.bean.AnimationListener;
import com.bilibili.lib.image2.bean.BiliAnimatable;
import com.bilibili.lib.image2.bean.ImageInfo;
import com.bilibili.lib.image2.bean.ImageLoadingListener;
import com.bilibili.lib.image2.view.BiliImageView;
import com.bilibili.lib.image2.view.IGenericProperties;
import com.bilibili.search2.api.SearchResultAll;
import java.io.File;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/eastereggs/ImageEggDialog.class */
@StabilityInferred(parameters = 0)
public final class ImageEggDialog extends EggDialogFragment {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public BiliImageView f86495e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public ImageView f86496f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public p f86497g;

    @NotNull
    public final b h = new b(this);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final a f86498i = new a(this);

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/eastereggs/ImageEggDialog$a.class */
    public static final class a implements AnimationListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ImageEggDialog f86499a;

        public a(ImageEggDialog imageEggDialog) {
            this.f86499a = imageEggDialog;
        }

        public final void onAnimationLastFrame(BiliAnimatable biliAnimatable) {
            ImageEggDialog imageEggDialog = this.f86499a;
            imageEggDialog.getClass();
            if (biliAnimatable != null && biliAnimatable.isRunning()) {
                biliAnimatable.stop();
                biliAnimatable.setAnimationListener((AnimationListener) null);
            }
            imageEggDialog.dismissAllowingStateLoss();
        }

        public final void onAnimationStart(BiliAnimatable biliAnimatable) {
        }

        public final void onAnimationStop(BiliAnimatable biliAnimatable) {
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/eastereggs/ImageEggDialog$b.class */
    public static final class b implements ImageLoadingListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ImageEggDialog f86500a;

        public b(ImageEggDialog imageEggDialog) {
            this.f86500a = imageEggDialog;
        }

        public final void onImageLoadFailed(Throwable th) {
            ImageEggDialog imageEggDialog = this.f86500a;
            k.a("image egg show failed", imageEggDialog.m8670if().getResUrl(imageEggDialog.getContext()));
            imageEggDialog.dismissAllowingStateLoss();
        }

        public final void onImageSet(ImageInfo imageInfo) {
            IGenericProperties genericProperties;
            ImageEggDialog imageEggDialog = this.f86500a;
            k.a("image egg show success", imageEggDialog.m8670if().getResUrl(imageEggDialog.getContext()));
            BiliImageView biliImageView = imageEggDialog.f86495e;
            BiliAnimatable animatable = (biliImageView == null || (genericProperties = biliImageView.getGenericProperties()) == null) ? null : genericProperties.getAnimatable();
            if (animatable == null) {
                p pVar = new p(imageEggDialog, ((long) imageEggDialog.m8670if().getShowTime()) * 1000, ((long) imageEggDialog.m8670if().getShowTime()) * 1000);
                imageEggDialog.f86497g = pVar;
                pVar.start();
            } else {
                if (animatable.isRunning()) {
                    return;
                }
                animatable.resetToFirstFrame();
                animatable.setAnimationListener(imageEggDialog.f86498i);
                animatable.start();
            }
        }
    }

    @Override // com.bilibili.search2.eastereggs.EggDialogFragment
    public final int hf() {
        return 2131494758;
    }

    @Override // com.bilibili.search2.eastereggs.EggDialogFragment
    public final void initViews(@NotNull View view) {
        this.f86495e = view.findViewById(2131303535);
        this.f86496f = (ImageView) view.findViewById(2131298371);
    }

    @Override // com.bilibili.search2.eastereggs.EggDialogFragment
    public final void jf(@NotNull final SearchResultAll.EasterEgg easterEgg) {
        SharedPrefX sharedPrefX = SearchLocalDataManager.f86501a;
        File fileA = SearchLocalDataManager.j(easterEgg.getResUrl(getContext()), easterEgg.getSourceMd5()).a();
        if (fileA == null || !fileA.exists()) {
            k.a("egg res file not found", easterEgg.getResUrl(getContext()));
            dismissAllowingStateLoss();
            return;
        }
        k.a("egg res file found", easterEgg.getResUrl(getContext()));
        int picType = easterEgg.getPicType();
        if (picType == 1) {
            BiliImageView biliImageView = this.f86495e;
            if (biliImageView != null) {
                BiliImageLoader.INSTANCE.with(this).uri(Uri.fromFile(fileA)).imageLoadingListener(this.h).into(biliImageView);
            }
        } else if (picType != 2) {
            dismissAllowingStateLoss();
        } else {
            BiliImageView biliImageView2 = this.f86495e;
            if (biliImageView2 != null) {
                ImageRequestBuilder.enableAnimate$default(BiliImageLoader.INSTANCE.with(biliImageView2.getContext()).uri(Uri.fromFile(fileA)), true, (Boolean) null, 2, (Object) null).imageLoadingListener(this.h).into(biliImageView2);
            }
        }
        BiliImageView biliImageView3 = this.f86495e;
        if (biliImageView3 != null) {
            biliImageView3.setOnClickListener(new View.OnClickListener(easterEgg, this) { // from class: com.bilibili.search2.eastereggs.n

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final SearchResultAll.EasterEgg f86521a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final ImageEggDialog f86522b;

                {
                    this.f86521a = easterEgg;
                    this.f86522b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SearchResultAll.EasterEgg easterEgg2 = this.f86521a;
                    ImageEggDialog imageEggDialog = this.f86522b;
                    String url = easterEgg2.getUrl();
                    if (url == null) {
                        return;
                    }
                    BLRouter.routeTo(new RouteRequest.Builder(Uri.parse(url)).build(), imageEggDialog.getContext());
                    imageEggDialog.kf();
                }
            });
        }
        ImageView imageView = this.f86496f;
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener(this) { // from class: com.bilibili.search2.eastereggs.o

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final ImageEggDialog f86523a;

                {
                    this.f86523a = this;
                }

                /* JADX WARN: Type inference failed for: r0v4, types: [com.bilibili.search2.eastereggs.EggDialogFragment$a, com.bilibili.search2.eastereggs.a] */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ImageEggDialog imageEggDialog = this.f86523a;
                    imageEggDialog.dismissAllowingStateLoss();
                    ?? r02 = imageEggDialog.f86494d;
                    if (r02 != 0) {
                        r02.onCloseClick();
                    }
                }
            });
        }
    }

    @Override // com.bilibili.search2.eastereggs.EggDialogFragment, androidx.fragment.app.DialogFragment
    @NotNull
    public final Dialog onCreateDialog(@Nullable Bundle bundle) {
        Dialog dialogOnCreateDialog = super.onCreateDialog(bundle);
        String mask_color = m8670if().getMask_color();
        String str = mask_color;
        if (mask_color == null) {
            str = "";
        }
        int maskTransparency = m8670if().getMaskTransparency();
        try {
            ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor(str));
            colorDrawable.setAlpha((maskTransparency * 255) / 100);
            Window window = dialogOnCreateDialog.getWindow();
            if (window != null) {
                window.setBackgroundDrawable(colorDrawable);
            }
        } catch (IllegalArgumentException e7) {
            BLog.w(e7.getMessage());
        }
        return dialogOnCreateDialog;
    }

    @Override // com.bilibili.search2.eastereggs.EggDialogFragment, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(@NotNull DialogInterface dialogInterface) {
        p pVar = this.f86497g;
        if (pVar != null) {
            pVar.cancel();
        }
        super.onDismiss(dialogInterface);
    }
}
