package com.bilibili.ogv.kmm.operation.banner;

import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.bilibili.lib.foundation.Foundation;
import com.bilibili.lib.image2.BiliImageLoader;
import com.bilibili.lib.image2.BiliImageLoaderHelper;
import com.bilibili.lib.image2.bean.ScaleType;
import com.bilibili.lib.image2.view.BiliImageView;
import com.bilibili.studio.editor.moudle.caption.v1.CaptionListItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/banner/D.class */
public final /* synthetic */ class D implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f68023a;

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f68023a) {
            case 0:
                Composer composer = (Composer) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                if (composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1864186963, iIntValue, -1, "com.bilibili.ogv.kmm.operation.banner.ComposableSingletons$BannerModuleSupportModuleKt.lambda$-1864186963.<anonymous> (BannerModuleSupportModule.kt:150)");
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                break;
            default:
                View view = (View) obj;
                ((Integer) obj2).intValue();
                CaptionListItem captionListItem = (CaptionListItem) obj3;
                BiliImageView biliImageViewFindViewById = view.findViewById(2131298306);
                ImageView imageView = (ImageView) view.findViewById(2131298305);
                ProgressBar progressBar = (ProgressBar) view.findViewById(2131300293);
                if (captionListItem.isLocal()) {
                    Cs.k.a(biliImageViewFindViewById, BiliImageLoader.INSTANCE, BiliImageLoaderHelper.resourceToUri(bi.b.a(Foundation.Companion), captionListItem.getImageLocal()), biliImageViewFindViewById);
                } else if (biliImageViewFindViewById.getTag() == null || !biliImageViewFindViewById.getTag().equals(captionListItem.getImageHttp())) {
                    BiliImageLoader.INSTANCE.with(biliImageViewFindViewById.getContext()).url(captionListItem.getImageHttp()).actualImageScaleType(ScaleType.FIT_CENTER).useOrigin().into(biliImageViewFindViewById);
                    biliImageViewFindViewById.setTag(captionListItem.getImageHttp());
                }
                if (captionListItem.isDownloaded()) {
                    imageView.setVisibility(8);
                } else {
                    imageView.setVisibility(0);
                }
                if (captionListItem.isDownloading()) {
                    progressBar.setVisibility(0);
                    imageView.setVisibility(8);
                } else {
                    progressBar.setVisibility(8);
                }
                view.setSelected(captionListItem.isSelected());
                break;
        }
        return Unit.INSTANCE;
    }
}
