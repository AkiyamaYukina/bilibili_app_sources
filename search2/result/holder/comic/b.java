package com.bilibili.search2.result.holder.comic;

import android.graphics.drawable.Drawable;
import android.widget.TextView;
import androidx.annotation.ColorRes;
import androidx.annotation.DrawableRes;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.vectordrawable.graphics.drawable.VectorDrawableCompat;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.lib.image2.BiliImageLoader;
import com.bilibili.lib.image2.bean.IThumbnailSizeController;
import com.bilibili.lib.image2.bean.ResizeOption;
import com.bilibili.lib.image2.bean.ThumbUrlTransformStrategyUtils;
import com.bilibili.lib.image2.view.BiliImageView;
import com.bilibili.lib.theme.R$color;
import com.bilibili.magicasakura.utils.ThemeUtils;
import com.bilibili.magicasakura.widgets.TintLinearLayout;
import com.bilibili.search2.api.FollowButtonTexts;
import com.bilibili.search2.api.FollowButtonV2;
import com.bilibili.search2.api.SearchComicItem;
import com.bilibili.search2.utils.B;
import com.facebook.common.executors.UiThreadImmediateExecutorService;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/holder/comic/b.class */
@StabilityInferred(parameters = 0)
public final class b {
    public static void a(@ColorRes int i7, @NotNull BiliImageView biliImageView, @Nullable String str, boolean z6) {
        if (z6) {
            ListExtentionsKt.gone(biliImageView);
            return;
        }
        ListExtentionsKt.visible(biliImageView);
        biliImageView.setImageDrawable((Drawable) null);
        if (str != null && !StringsKt.isBlank(str)) {
            BiliImageLoader.INSTANCE.acquire(biliImageView).useOrigin().asDrawable().url(str).resizeOption(new ResizeOption(B.C(16.0f), B.C(16.0f))).thumbnailUrlTransformStrategy(ThumbUrlTransformStrategyUtils.stylingStrategy$default("search-normal-fill-android", (IThumbnailSizeController) null, 2, (Object) null)).submit().subscribe(new a(biliImageView.getContext(), i7, biliImageView), UiThreadImmediateExecutorService.getInstance());
            return;
        }
        VectorDrawableCompat vectorDrawableCompatCreate = VectorDrawableCompat.create(biliImageView.getResources(), 2131236687, null);
        if (vectorDrawableCompatCreate == null) {
            return;
        }
        Drawable drawableWrap = DrawableCompat.wrap(vectorDrawableCompatCreate);
        DrawableCompat.setTint(drawableWrap.mutate(), ThemeUtils.getColorById(biliImageView.getContext(), i7));
        biliImageView.setImageDrawable(drawableWrap);
    }

    public static void b(@NotNull TintLinearLayout tintLinearLayout, @NotNull TextView textView, boolean z6, @NotNull SearchComicItem searchComicItem, @DrawableRes int i7, @ColorRes int i8, @DrawableRes int i9, @ColorRes int i10) {
        String str;
        if (searchComicItem.hasFollowTextFromNetwork()) {
            tintLinearLayout.setVisibility(0);
        } else {
            tintLinearLayout.setVisibility(8);
        }
        if (z6) {
            FollowButtonV2 followButton = searchComicItem.getFollowButton();
            str = "";
            if (followButton != null) {
                FollowButtonTexts texts = followButton.getTexts();
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
            FollowButtonV2 followButton2 = searchComicItem.getFollowButton();
            str = "";
            if (followButton2 != null) {
                FollowButtonTexts texts2 = followButton2.getTexts();
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
        if (z6) {
            i8 = R$color.Text3;
        }
        textView.setTextColor(ThemeUtils.getColorById(textView.getContext(), i8));
        if (z6) {
            i7 = i9;
        }
        tintLinearLayout.setBackgroundResource(i7);
        if (z6) {
            tintLinearLayout.setBackgroundTintList(i10);
        }
    }
}
