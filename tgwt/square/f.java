package com.bilibili.tgwt.square;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.app.gemini.ui.UIComponent;
import com.bilibili.framework.exposure.core.ExposureEntry;
import com.bilibili.framework.exposure.core.collecter.ViewExposureLayoutInfoCollectorKt;
import com.bilibili.lib.image2.BiliImageLoader;
import com.bilibili.lib.image2.ImageRequestBuilder;
import com.bilibili.lib.image2.bean.IThumbnailSizeController;
import com.bilibili.lib.image2.bean.RoundingParams;
import com.bilibili.lib.image2.bean.ThumbUrlTransformStrategyUtils;
import com.bilibili.lib.image2.view.BiliImageView;
import com.bilibili.lib.image2.view.IGenericProperties;
import com.bilibili.ogvcommon.widget.AvatarAnimatorLayout;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/square/f.class */
@StabilityInferred(parameters = 0)
public final class f implements UIComponent<g> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CommonCard f112119a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f112120b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final ExposureEntry f112121c = new ExposureEntry(Pl0.b.f19035a, new Be1.s(this, 3));

    public f(@NotNull CommonCard commonCard, @NotNull String str) {
        this.f112119a = commonCard;
        this.f112120b = str;
    }

    public final Object bindToView(UIComponent.ViewEntry viewEntry, Continuation continuation) {
        List<RecentWatcher> list;
        List<RecentWatcher> list2;
        g gVar = (g) viewEntry;
        Context context = gVar.f112122a.getContext();
        ViewExposureLayoutInfoCollectorKt.setExposureLayoutInfoReceiver(gVar.f112122a, this.f112121c);
        BiliImageView biliImageView = gVar.f112123b;
        ImageRequestBuilder imageRequestBuilderThumbnailUrlTransformStrategy = BiliImageLoader.INSTANCE.with(biliImageView.getContext()).thumbnailUrlTransformStrategy(ThumbUrlTransformStrategyUtils.stylingStrategy$default("common-ogv", (IThumbnailSizeController) null, 2, (Object) null));
        CommonCard commonCard = this.f112119a;
        imageRequestBuilderThumbnailUrlTransformStrategy.url(commonCard.f112020b).into(biliImageView);
        int i7 = commonCard.f112025g;
        BiliImageView biliImageView2 = gVar.f112130j;
        AvatarAnimatorLayout avatarAnimatorLayout = gVar.f112127f;
        if (i7 != 5) {
            gVar.f112124c.setVisibility(0);
            gVar.f112125d.setVisibility(0);
            gVar.f112126e.setVisibility(0);
            gVar.f112128g.setVisibility(0);
            gVar.f112124c.setText(commonCard.f112019a);
            gVar.f112125d.setText(commonCard.f112021c);
            Kl0.a.a(gVar.f112126e, commonCard.b(), true, false);
            biliImageView2.setVisibility(8);
            gVar.h.setVisibility(8);
            gVar.f112129i.setVisibility(8);
            gVar.f112131k.setVisibility(8);
            RoomInfo roomInfo = commonCard.f112027j;
            if (((roomInfo == null || (list2 = roomInfo.f112090a) == null) ? 0 : list2.size()) < 3) {
                avatarAnimatorLayout.setVisibility(8);
            } else {
                avatarAnimatorLayout.setVisibility(0);
                avatarAnimatorLayout.removeAllViews();
                RoomInfo roomInfo2 = commonCard.f112027j;
                if (roomInfo2 != null && (list = roomInfo2.f112090a) != null) {
                    for (RecentWatcher recentWatcher : list) {
                        BiliImageView biliImageView3 = new BiliImageView(context);
                        IGenericProperties genericProperties = biliImageView3.getGenericProperties();
                        genericProperties.setPlaceholderImage(2131233999);
                        genericProperties.setRoundingParams(RoundingParams.Companion.asCircle().setBorder(-1, Uj0.c.a(1.5f, context)));
                        BiliImageLoader.INSTANCE.with(context).thumbnailUrlTransformStrategy(ThumbUrlTransformStrategyUtils.stylingStrategy$default("common-ogv", (IThumbnailSizeController) null, 2, (Object) null)).url(recentWatcher.a()).into(biliImageView3);
                        avatarAnimatorLayout.addView(biliImageView3);
                    }
                }
            }
        } else {
            gVar.f112124c.setVisibility(8);
            gVar.f112125d.setVisibility(8);
            gVar.f112126e.setVisibility(8);
            avatarAnimatorLayout.setVisibility(8);
            gVar.f112128g.setVisibility(8);
            biliImageView2.setVisibility(0);
            gVar.h.setVisibility(0);
            gVar.f112129i.setVisibility(0);
            gVar.f112131k.setVisibility(0);
            gVar.f112129i.setText(commonCard.f112021c);
            gVar.h.setText(commonCard.f112019a);
            Nl0.f.d(biliImageView2, commonCard.h);
        }
        gVar.f112122a.setOnClickListener(new Hs0.c(this, 1));
        return Unit.INSTANCE;
    }

    public final UIComponent.ViewEntry createViewEntry(Context context, ViewGroup viewGroup) {
        return new g(LayoutInflater.from(context).inflate(2131500196, viewGroup, false));
    }
}
