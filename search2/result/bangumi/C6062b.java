package com.bilibili.search2.result.bangumi;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.DrawableRes;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.vectordrawable.graphics.drawable.VectorDrawableCompat;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.lib.image2.BiliImageLoader;
import com.bilibili.lib.image2.DrawableAcquireRequestBuilder;
import com.bilibili.lib.image2.bean.IThumbnailSizeController;
import com.bilibili.lib.image2.bean.ResizeOption;
import com.bilibili.lib.image2.bean.ThumbUrlTransformStrategyUtils;
import com.bilibili.lib.image2.view.BiliImageView;
import com.bilibili.lib.theme.R$color;
import com.bilibili.magicasakura.utils.ThemeUtils;
import com.bilibili.search2.api.SearchBangumiItem;
import com.facebook.common.executors.UiThreadImmediateExecutorService;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.bilibili.search2.result.bangumi.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/bangumi/b.class */
@StabilityInferred(parameters = 0)
public final class C6062b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f87387a = com.bilibili.search2.utils.B.C(16.0f);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f87388b = 2131236687;

    public static void a(BiliImageView biliImageView) {
        VectorDrawableCompat vectorDrawableCompatCreate = VectorDrawableCompat.create(biliImageView.getResources(), f87388b, null);
        if (vectorDrawableCompatCreate == null) {
            return;
        }
        Drawable drawableWrap = DrawableCompat.wrap(vectorDrawableCompatCreate);
        DrawableCompat.setTint(drawableWrap.mutate(), ThemeUtils.getColorById(biliImageView.getContext(), 2131103284));
        biliImageView.setImageDrawable(drawableWrap);
    }

    public static void b(@NotNull BiliImageView biliImageView, @Nullable String str, boolean z6) {
        if (z6) {
            ListExtentionsKt.gone(biliImageView);
            return;
        }
        ListExtentionsKt.visible(biliImageView);
        biliImageView.setImageDrawable((Drawable) null);
        if (str == null || StringsKt.isBlank(str)) {
            a(biliImageView);
            return;
        }
        Context context = biliImageView.getContext();
        DrawableAcquireRequestBuilder drawableAcquireRequestBuilderUrl = BiliImageLoader.INSTANCE.acquire(biliImageView).useOrigin().asDrawable().url(str);
        int i7 = f87387a;
        drawableAcquireRequestBuilderUrl.resizeOption(new ResizeOption(i7, i7)).thumbnailUrlTransformStrategy(ThumbUrlTransformStrategyUtils.stylingStrategy$default("search-normal-fill-android", (IThumbnailSizeController) null, 2, (Object) null)).submit().subscribe(new C6061a(context, biliImageView), UiThreadImmediateExecutorService.getInstance());
    }

    public static void c(@NotNull View view, @NotNull TextView textView, boolean z6, @NotNull SearchBangumiItem searchBangumiItem, @DrawableRes int i7, @DrawableRes @Nullable Integer num) {
        String str;
        if (searchBangumiItem.hasFollowTextFromNetwork()) {
            view.setVisibility(0);
        } else {
            view.setVisibility(8);
        }
        if (z6) {
            SearchBangumiItem.FollowButton followButton = searchBangumiItem.getFollowButton();
            str = "";
            if (followButton != null) {
                SearchBangumiItem.FollowButtonTexts texts = followButton.getTexts();
                str = "";
                if (texts != null) {
                    String selected = texts.getSelected();
                    str = selected;
                    if (selected == null) {
                        str = "";
                    }
                }
            }
        } else {
            SearchBangumiItem.FollowButton followButton2 = searchBangumiItem.getFollowButton();
            str = "";
            if (followButton2 != null) {
                SearchBangumiItem.FollowButtonTexts texts2 = followButton2.getTexts();
                str = "";
                if (texts2 != null) {
                    String unselect = texts2.getUnselect();
                    str = unselect;
                    if (unselect == null) {
                        str = "";
                    }
                }
            }
        }
        textView.setText(str);
        textView.setTextColor(ThemeUtils.getColorById(textView.getContext(), z6 ? R$color.Ga5 : 2131103284));
        if (z6) {
            i7 = num.intValue();
        }
        view.setBackgroundResource(i7);
    }
}
