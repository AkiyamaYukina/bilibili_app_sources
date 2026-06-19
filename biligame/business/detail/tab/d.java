package com.bilibili.biligame.business.detail.tab;

import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.biligame.api.bean.gamedetail.GameDetailContent;
import com.bilibili.biligame.utils.GameImageExtensionsKt;
import com.bilibili.biligame.utils.GameUtilExtensionsKt;
import com.bilibili.biligame.utils.NumUtils;
import com.bilibili.biligame.widget.viewholder.BaseExposeViewHolder;
import com.bilibili.lib.image2.view.BiliImageView;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.bili.widget.section.adapter.BaseAdapter;
import tv.danmaku.bili.widget.section.holder.BaseViewHolder;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/business/detail/tab/d.class */
@StabilityInferred(parameters = 0)
public final class d extends BaseAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final List<GameDetailContent.ScreenShot> f62591a;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/business/detail/tab/d$a.class */
    @StabilityInferred(parameters = 0)
    public static final class a extends BaseExposeViewHolder {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @NotNull
        public final BiliImageView f62592g;
        public final int h;

        public a(View view, d dVar) {
            super(view, dVar);
            this.f62592g = view.findViewById(2131304470);
            this.h = GameUtilExtensionsKt.toPx(176);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d(@NotNull List<? extends GameDetailContent.ScreenShot> list) {
        this.f62591a = list;
    }

    public final void bindHolder(@NotNull BaseViewHolder baseViewHolder, int i7, @NotNull View view) {
        if (baseViewHolder instanceof a) {
            a aVar = (a) baseViewHolder;
            GameDetailContent.ScreenShot screenShot = this.f62591a.get(i7);
            aVar.getClass();
            float f7 = NumUtils.parseFloat(screenShot.width) / NumUtils.parseFloat(screenShot.height);
            BiliImageView biliImageView = aVar.f62592g;
            ViewGroup.LayoutParams layoutParams = biliImageView.getLayoutParams();
            if (layoutParams != null) {
                int i8 = aVar.h;
                layoutParams.width = (int) (i8 * f7);
                layoutParams.height = i8;
                biliImageView.setLayoutParams(layoutParams);
            }
            biliImageView.setTag(screenShot);
            GameImageExtensionsKt.displayGameImage(biliImageView, screenShot.url);
        }
    }

    @NotNull
    public final BaseViewHolder createHolder(@NotNull ViewGroup viewGroup, int i7) {
        return new a(p.a(viewGroup, 2131496916, viewGroup, false), this);
    }

    public final int getItemCount() {
        return this.f62591a.size();
    }
}
