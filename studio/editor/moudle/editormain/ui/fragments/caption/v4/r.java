package com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.v4;

import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.bilibili.lib.foundation.Foundation;
import com.bilibili.lib.image2.BiliImageLoader;
import com.bilibili.lib.image2.BiliImageLoaderHelper;
import com.bilibili.lib.image2.bean.ScaleType;
import com.bilibili.lib.image2.view.BiliImageView;
import com.bilibili.studio.editor.moudle.caption.v1.CaptionListItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/ui/fragments/caption/v4/r.class */
public final /* synthetic */ class r implements Function3 {
    public final Object invoke(Object obj, Object obj2, Object obj3) {
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
        return Unit.INSTANCE;
    }
}
