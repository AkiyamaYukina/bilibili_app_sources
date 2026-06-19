package com.bilibili.search2.result.all;

import android.net.Uri;
import android.widget.ImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.lib.image2.bean.ImageInfo;
import com.bilibili.lib.image2.bean.ImageLoadingListener;
import com.bilibili.lib.image2.view.legacy.ScalableImageView2;
import com.bilibili.lib.imageviewer.utils.ImageExtentionKt;
import com.bilibili.magicasakura.widgets.TintTextView;
import com.bilibili.search2.api.SearchSpecialGuideItem;
import dt0.AbstractC6843f;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/all/J.class */
@StabilityInferred(parameters = 0)
public final class J extends AbstractC6843f<SearchSpecialGuideItem> implements Et0.a, Et0.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public ScalableImageView2 f87133a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public TintTextView f87134b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public TintTextView f87135c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public TintTextView f87136d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public TintTextView f87137e;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/all/J$a.class */
    public static final class a implements ImageLoadingListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final J f87138a;

        public a(J j7) {
            this.f87138a = j7;
        }

        public final void onImageLoadFailed(Throwable th) {
        }

        public final void onImageLoading(Uri uri) {
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [Z7.c, androidx.recyclerview.widget.RecyclerView$ViewHolder, com.bilibili.search2.result.all.J, java.lang.Object] */
        public final void onImageSet(ImageInfo imageInfo) {
            ?? r02 = this.f87138a;
            if (com.bilibili.search2.component.e.g(r02.itemView.getContext()) && r02.f87133a.isAttachedToWindow()) {
                r02.f87133a.post(new OS0.r((Object) r02, 1));
            }
            String title = ((SearchSpecialGuideItem) r02.getData()).getTitle();
            TintTextView tintTextView = r02.f87134b;
            tintTextView.setText(title);
            tintTextView.getPaint().setFakeBoldText(true);
            String desc = ((SearchSpecialGuideItem) r02.getData()).getDesc();
            TintTextView tintTextView2 = r02.f87135c;
            tintTextView2.setText(desc);
            String string = r02.itemView.getResources().getString(2131847759, ((SearchSpecialGuideItem) r02.getData()).getPhone());
            TintTextView tintTextView3 = r02.f87137e;
            tintTextView3.setText(string);
            tintTextView.setVisibility(0);
            tintTextView2.setVisibility(0);
            tintTextView3.setVisibility(0);
            r02.f87136d.setVisibility(0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // dt0.AbstractC6839b
    public final void bind() {
        int px = ListExtentionsKt.toPx(com.bilibili.search2.component.e.b(this.itemView.getContext()).f86404e);
        TintTextView tintTextView = this.f87134b;
        com.bilibili.search2.utils.B.w(tintTextView, px);
        com.bilibili.search2.utils.B.x(tintTextView, px);
        TintTextView tintTextView2 = this.f87135c;
        com.bilibili.search2.utils.B.w(tintTextView2, px);
        com.bilibili.search2.utils.B.x(tintTextView2, px);
        TintTextView tintTextView3 = this.f87137e;
        com.bilibili.search2.utils.B.w(tintTextView3, px);
        TintTextView tintTextView4 = this.f87136d;
        com.bilibili.search2.utils.B.w(tintTextView4, px);
        boolean zG = com.bilibili.search2.component.e.g(this.itemView.getContext());
        ImageView imageView = this.f87133a;
        ImageView imageView2 = imageView != null ? imageView : null;
        if (imageView2 != null) {
            if (zG) {
                imageView2.setHeightRatio(0.0d);
                imageView2.setScaleViewType(0);
                ((ScalableImageView2) imageView2).mAspectRadioWidth = 0;
                ((ScalableImageView2) imageView2).mAspectRadioHeight = 0;
                imageView2.getLayoutParams().height = ListExtentionsKt.toPx(240);
                imageView2.setScaleType(ImageView.ScaleType.MATRIX);
            } else {
                imageView2.setScaleViewType(1);
                ((ScalableImageView2) imageView2).mAspectRadioWidth = 375;
                ((ScalableImageView2) imageView2).mAspectRadioHeight = 240;
                imageView2.getLayoutParams().height = -2;
            }
        }
        tintTextView.setVisibility(8);
        tintTextView2.setVisibility(8);
        tintTextView3.setVisibility(8);
        tintTextView4.setVisibility(8);
        String cover = ((SearchSpecialGuideItem) getData()).getCover();
        if (cover == null || StringsKt.w(cover, ".gif")) {
            ImageExtentionKt.displayDefaultImage(imageView);
        } else {
            com.bilibili.search2.utils.extension.c.a(imageView, ((SearchSpecialGuideItem) getData()).getCover(), null, false, new a(this), null, 0, 0, 246);
            imageView.setTintableCallback(new I(this));
        }
    }

    @Override // Et0.a
    public final boolean isNeedDrawDivider() {
        return false;
    }

    @Override // Et0.d
    public final boolean needWideScreenMargin() {
        return false;
    }
}
