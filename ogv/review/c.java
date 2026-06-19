package com.bilibili.ogv.review;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.bilibili.lib.image2.BiliImageLoader;
import com.bilibili.ogv.review.reviewpublish.ShortReviewPublishFragment;
import tv.danmaku.android.util.AppResUtil;
import tv.danmaku.bili.widget.BaseDialog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/review/c.class */
public final class c extends BaseDialog<c> implements View.OnClickListener {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ShortReviewPublishFragment.b f72211e;

    public c(Context context, @Nullable ShortReviewPublishFragment.b bVar) {
        super(context);
        widthScale(0.85f);
        this.f72211e = bVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int id = view.getId();
        if (id == 2131298076) {
            dismiss();
        } else if (id == 2131298124) {
            ShortReviewPublishFragment.b bVar = this.f72211e;
            if (bVar != null) {
                bVar.f72514a.of(null);
            }
            dismiss();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final View onCreateView() {
        View viewInflate = LayoutInflater.from(getContext()).inflate(2131499845, (ViewGroup) null);
        TextView textView = (TextView) viewInflate.findViewById(2131298076);
        TextView textView2 = (TextView) viewInflate.findViewById(2131298124);
        BiliImageLoader.INSTANCE.with(getContext()).url(AppResUtil.getImageUrl("bili_2233_bangumi_review_rating_5.webp")).into(viewInflate.findViewById(2131301895));
        textView.setOnClickListener(this);
        textView2.setOnClickListener(this);
        return viewInflate;
    }

    public final void setUiBeforeShow() {
    }
}
