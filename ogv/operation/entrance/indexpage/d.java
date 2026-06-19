package com.bilibili.ogv.operation.entrance.indexpage;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.LeadingMarginSpan;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.content.ContextCompat;
import com.bilibili.iconfont.IconFont;
import com.bilibili.lib.image2.BiliImageLoader;
import com.bilibili.lib.image2.bean.IThumbnailSizeController;
import com.bilibili.lib.image2.bean.ThumbUrlTransformStrategyUtils;
import com.bilibili.lib.image2.view.BiliImageView;
import com.bilibili.lib.theme.R$color;
import com.bilibili.ogv.operation.entrance.indexpage.BangumiCategoryResult;
import com.bilibili.ogvcommon.bangumibadge.BangumiBadgeInfo;
import java.util.ArrayList;
import java.util.List;
import tv.danmaku.bili.widget.section.adapter.BaseSectionAdapter;
import tv.danmaku.bili.widget.section.holder.BaseViewHolder;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation/entrance/indexpage/d.class */
public final class d extends tv.danmaku.bili.widget.section.adapter.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List<BangumiCategoryResult.ResultBean> f70171f = new ArrayList();

    public final void fillSection(BaseSectionAdapter.SectionManager sectionManager) {
        sectionManager.addSectionWithNone(((ArrayList) this.f70171f).size(), 100);
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, com.bilibili.ogv.operation.entrance.indexpage.e, java.lang.Object] */
    public final void onBindHolder(BaseViewHolder baseViewHolder, int i7, View view) {
        if (baseViewHolder instanceof e) {
            int adapterPosition = baseViewHolder.getAdapterPosition();
            ?? r02 = (e) baseViewHolder;
            BangumiCategoryResult.ResultBean resultBean = (BangumiCategoryResult.ResultBean) ((ArrayList) this.f70171f).get(adapterPosition);
            if (resultBean == null) {
                r02.getClass();
                return;
            }
            Context context = r02.itemView.getContext();
            String str = resultBean.cover;
            BiliImageView biliImageView = r02.f70172b;
            Nl0.f.c(biliImageView, context, str);
            biliImageView.getGenericProperties().setOverlayImage((Drawable) null);
            if (TextUtils.isEmpty(resultBean.subtitle)) {
                r02.f70174d.setVisibility(8);
            } else {
                r02.f70174d.setText(resultBean.subtitle);
                r02.f70174d.setVisibility(0);
            }
            if (TextUtils.isEmpty(resultBean.titleIcon)) {
                r02.f70173c.setText(resultBean.title);
                r02.f70176f.setVisibility(8);
            } else {
                r02.f70176f.setVisibility(0);
                TextView textView = r02.f70173c;
                String str2 = resultBean.titleIcon;
                String str3 = resultBean.title;
                Context context2 = r02.itemView.getContext();
                SpannableString spannableString = new SpannableString(str3);
                float length = str2.length();
                float dimension = context2.getResources().getDimension(2131165372);
                float f7 = 8.0f;
                if (Float.isNaN(8.0f)) {
                    f7 = 0.0f;
                }
                spannableString.setSpan(new LeadingMarginSpan.Standard(Math.min((int) context2.getResources().getDimension(2131165355), (int) (TypedValue.applyDimension(1, f7, context2.getResources().getDisplayMetrics()) + (dimension * length))) + 8, 0), 0, str3.length(), 17);
                textView.setText(spannableString);
                r02.f70176f.setText(resultBean.titleIcon);
            }
            if (TextUtils.isEmpty(resultBean.score)) {
                r02.f70178i.setVisibility(8);
            } else {
                r02.f70178i.setText(resultBean.score);
                r02.f70178i.setVisibility(0);
            }
            if (TextUtils.isEmpty(resultBean.orderIcon)) {
                r02.f70179j.setVisibility(8);
            } else {
                r02.f70179j.setVisibility(0);
                ImageView imageView = r02.f70179j;
                imageView.setImageDrawable(IconFont.getAssetIconDrawable(resultBean.orderIcon, ContextCompat.getColor(imageView.getContext(), R$color.Graph_white)));
            }
            if (TextUtils.isEmpty(resultBean.order)) {
                r02.f70175e.setVisibility(4);
            } else {
                r02.f70175e.setText(resultBean.order);
                r02.f70175e.setVisibility(0);
                if (r02.itemView.getContext() != null) {
                    biliImageView.getGenericProperties().setOverlayImage(AppCompatResources.getDrawable(r02.itemView.getContext(), 2131231049));
                }
            }
            BangumiBadgeInfo bangumiBadgeInfo = resultBean.badgeInfo;
            BiliImageView biliImageView2 = r02.h;
            if (bangumiBadgeInfo == null || TextUtils.isEmpty(bangumiBadgeInfo.b())) {
                biliImageView2.setVisibility(8);
                r02.f70177g.setVisibility(0);
                Kl0.a.a(r02.f70177g, resultBean.badgeInfo, true, false);
            } else {
                BiliImageLoader.INSTANCE.with(biliImageView2.getContext()).thumbnailUrlTransformStrategy(ThumbUrlTransformStrategyUtils.stylingStrategy$default("common-ogv", (IThumbnailSizeController) null, 2, (Object) null)).useOrigin().url(resultBean.badgeInfo.b()).into(biliImageView2);
                biliImageView2.setVisibility(0);
                r02.f70177g.setVisibility(8);
                r02.f70177g.setVisibility(8);
            }
            r02.itemView.setTag(2131312914, resultBean);
            r02.itemView.setTag(2131312952, Integer.valueOf(adapterPosition));
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.bilibili.ogv.operation.entrance.indexpage.e, tv.danmaku.bili.widget.section.holder.BaseViewHolder] */
    public final BaseViewHolder onCreateHolder(ViewGroup viewGroup, int i7) {
        View viewA = p.a(viewGroup, 2131499622, viewGroup, false);
        ?? baseViewHolder = new BaseViewHolder(viewA, this);
        baseViewHolder.f70172b = viewA.findViewById(2131298941);
        baseViewHolder.f70173c = (TextView) viewA.findViewById(2131308958);
        baseViewHolder.f70174d = (TextView) viewA.findViewById(2131312539);
        baseViewHolder.f70175e = (TextView) viewA.findViewById(2131303548);
        TextView textView = (TextView) viewA.findViewById(2131315164);
        baseViewHolder.f70178i = textView;
        baseViewHolder.f70177g = (TextView) viewA.findViewById(2131297143);
        baseViewHolder.f70176f = (TextView) viewA.findViewById(2131315209);
        baseViewHolder.h = viewA.findViewById(2131310568);
        baseViewHolder.f70179j = (ImageView) viewA.findViewById(2131303642);
        textView.setTypeface(Typeface.createFromAsset(textView.getContext().getAssets(), "din-Medium.otf"));
        return baseViewHolder;
    }
}
