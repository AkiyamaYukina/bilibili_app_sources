package com.bilibili.pegasus.utils;

import OS0.M;
import OS0.N;
import UR0.S;
import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.fragment.app.FragmentActivity;
import com.alibaba.fastjson.JSON;
import com.bilibili.app.comm.list.common.data.StoryCardIcon;
import com.bilibili.app.comm.list.widget.image.IUrlGetter;
import com.bilibili.app.comm.list.widget.tag.TagView;
import com.bilibili.app.comm.list.widget.tag.base.IImageTag;
import com.bilibili.app.comm.list.widget.tag.tagtinttext.TagSpanTextView;
import com.bilibili.app.comm.list.widget.tag.tagtinttext.TagTintTextView;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.droid.ActivityUtils;
import com.bilibili.lib.blconfig.ConfigManager;
import com.bilibili.lib.blconfig.Contract;
import com.bilibili.lib.image2.BiliImageLoader;
import com.bilibili.lib.image2.ImageRequestBuilder;
import com.bilibili.lib.image2.bean.BitmapTransformation;
import com.bilibili.lib.image2.bean.IThumbnailSizeController;
import com.bilibili.lib.image2.bean.ImageLoadingListener;
import com.bilibili.lib.image2.bean.RoundingParams;
import com.bilibili.lib.image2.bean.ScaleType;
import com.bilibili.lib.image2.bean.StylingTransformStrategy;
import com.bilibili.lib.image2.bean.ThumbUrlTransformStrategyUtils;
import com.bilibili.lib.image2.bean.ThumbnailUrlTransformStrategy;
import com.bilibili.lib.image2.view.BiliImageView;
import com.bilibili.lib.imageviewer.utils.ImageExtentionKt;
import com.bilibili.pegasus.api.modelv2.MultiplyDesc;
import com.bilibili.pegasus.api.modelv2.Tag;
import com.tencent.bugly.crashreport.CrashReport;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/utils/x.class */
public final class x {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public static List<Integer> f78894b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f78893a = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final List<Integer> f78895c = CollectionsKt.listOf(new Integer[]{2160, 1440, 1080, 720, 540, 360, 180, 90, 48});

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/utils/x$a.class */
    public static final class a implements IUrlGetter {
        public final ThumbnailUrlTransformStrategy getTransformStrategy(boolean z6) {
            return ThumbUrlTransformStrategyUtils.stylingStrategy$default(z6 ? "pegasus-android-gif" : "pegasus-android-v1", (IThumbnailSizeController) null, 2, (Object) null);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.bilibili.pegasus.utils.x$a, java.lang.Object] */
    static {
    }

    public static final boolean a(@NotNull Context context) {
        Activity wrapperActivity = ActivityUtils.getWrapperActivity(context);
        FragmentActivity fragmentActivity = wrapperActivity instanceof FragmentActivity ? (FragmentActivity) wrapperActivity : null;
        return fragmentActivity == null || fragmentActivity.isFinishing() || fragmentActivity.isDestroyed();
    }

    public static final void b(@NotNull TagView tagView, boolean z6, boolean z7) {
        if (z6) {
            ViewGroup.LayoutParams layoutParams = tagView.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams == null) {
                return;
            }
            marginLayoutParams.rightMargin = ListExtentionsKt.toPx(z7 ? 4.0f : 6.0f);
        }
    }

    public static final void c(@NotNull BiliImageView biliImageView, @Nullable String str, @Nullable Integer num, float f7, int i7, int i8) {
        if (str == null || StringsKt.isBlank(str)) {
            ImageRequestBuilder.placeholderImageResId$default(X9.n.a(biliImageView, BiliImageLoader.INSTANCE, (String) null), 2131237005, (ScaleType) null, 2, (Object) null).into(biliImageView);
            return;
        }
        ImageRequestBuilder imageRequestBuilderA = X9.n.a(biliImageView, BiliImageLoader.INSTANCE, str);
        RoundingParams roundingParams = biliImageView.getGenericProperties().getRoundingParams();
        RoundingParams roundingParams2 = roundingParams;
        if (roundingParams == null) {
            roundingParams2 = new RoundingParams();
        }
        if (num != null && num.intValue() == 1) {
            roundingParams2.setRoundAsCircle(false);
            roundingParams2.setCornersRadius(f7);
            biliImageView.setAspectRatio(1.0f);
        } else if (num != null && num.intValue() == 2) {
            roundingParams2.setRoundAsCircle(false);
            roundingParams2.setCornersRadius(f7);
            biliImageView.setAspectRatio(0.75f);
        } else {
            roundingParams2.setRoundAsCircle(true);
            biliImageView.setAspectRatio(1.0f);
        }
        if (i8 > 0 && i7 > 0) {
            roundingParams2.setBorderId(biliImageView.getContext(), i8, i7);
            roundingParams2.setScaleDownInsideBorders(true);
        }
        StylingTransformStrategy stylingTransformStrategyStylingStrategy$default = ThumbUrlTransformStrategyUtils.stylingStrategy$default("pegasus-android-v1", (IThumbnailSizeController) null, 2, (Object) null);
        String lowerCase = str.toLowerCase(Locale.ROOT);
        if (lowerCase != null && StringsKt.w(lowerCase, ".gif")) {
            stylingTransformStrategyStylingStrategy$default.forceFirstFrame();
        }
        imageRequestBuilderA.thumbnailUrlTransformStrategy(stylingTransformStrategyStylingStrategy$default);
        imageRequestBuilderA.roundingParams(roundingParams2).into(biliImageView);
    }

    public static /* synthetic */ void d(BiliImageView biliImageView, String str, Integer num, float f7, int i7, int i8, int i9) {
        if ((i9 & 4) != 0) {
            f7 = ListExtentionsKt.toPx(4.0f);
        }
        if ((i9 & 8) != 0) {
            i7 = 0;
        }
        if ((i9 & 16) != 0) {
            i8 = 0;
        }
        c(biliImageView, str, num, f7, i7, i8);
    }

    public static final void e(@NotNull BiliImageView biliImageView, @Nullable String str) {
        ImageExtentionKt.displayImageBlurNative$default(biliImageView, str, 0, 0, ThumbUrlTransformStrategyUtils.stylingStrategy$default("pegasus-android-v1", (IThumbnailSizeController) null, 2, (Object) null), 6, (Object) null);
    }

    public static void f(BiliImageView biliImageView, String str) {
        m(biliImageView, str, null, false, 4);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean g(com.bilibili.lib.image2.view.BiliImageView r14, java.lang.String r15, android.view.View r16, int r17) {
        /*
            r0 = r17
            r1 = 4
            r0 = r0 & r1
            if (r0 == 0) goto Lb
            r0 = 0
            r16 = r0
            goto Lb
        Lb:
            r0 = r14
            r1 = r15
            java.lang.String r2 = "pegasus-android-v2"
            r3 = 0
            r4 = 2
            r5 = 0
            com.bilibili.lib.image2.bean.StylingTransformStrategy r2 = com.bilibili.lib.image2.bean.ThumbUrlTransformStrategyUtils.stylingStrategy$default(r2, r3, r4, r5)
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 1016(0x3f8, float:1.424E-42)
            r12 = 0
            com.bilibili.lib.imageviewer.utils.ImageExtentionKt.displayImage$default(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r0 = 0
            r17 = r0
            r0 = r15
            if (r0 == 0) goto L4a
            r0 = r15
            java.util.Locale r1 = java.util.Locale.ROOT
            java.lang.String r0 = r0.toLowerCase(r1)
            r14 = r0
            r0 = r14
            if (r0 == 0) goto L4a
            r0 = r14
            java.lang.String r1 = ".gif"
            boolean r0 = kotlin.text.StringsKt.w(r0, r1)
            r19 = r0
            r0 = 1
            r18 = r0
            r0 = r19
            r1 = 1
            if (r0 != r1) goto L4a
            goto L4d
        L4a:
            r0 = 0
            r18 = r0
        L4d:
            r0 = r16
            if (r0 == 0) goto L61
            r0 = r18
            if (r0 == 0) goto L59
            goto L5c
        L59:
            r0 = 8
            r17 = r0
        L5c:
            r0 = r16
            r1 = r17
            r0.setVisibility(r1)
        L61:
            r0 = r18
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.utils.x.g(com.bilibili.lib.image2.view.BiliImageView, java.lang.String, android.view.View, int):boolean");
    }

    public static void h(BiliImageView biliImageView, String str, String str2, String str3, int i7, int i8, View view, ImageLoadingListener imageLoadingListener, int i9) {
        String str4 = (i9 & 4) != 0 ? "pegasus-android-v1" : str3;
        if ((i9 & 8) != 0) {
            i7 = 0;
        }
        if ((i9 & 16) != 0) {
            i8 = 0;
        }
        ImageLoadingListener imageLoadingListener2 = null;
        if ((i9 & 32) != 0) {
            view = null;
        }
        if ((i9 & 64) == 0) {
            imageLoadingListener2 = imageLoadingListener;
        }
        ImageLoadingListener wVar = imageLoadingListener2;
        if (imageLoadingListener2 == null) {
            wVar = new w(view);
        }
        ImageExtentionKt.displayImageWithGif$default(biliImageView, str, str2, new M(str4, 4), new N("pegasus-android-gif", 5), i7, i8, wVar, (ImageLoadingListener) null, false, 384, (Object) null);
        if (view != null) {
            view.setVisibility(8);
        }
    }

    public static final void i(@NotNull BiliImageView biliImageView, @Nullable String str) {
        m(biliImageView, str, null, false, 14);
    }

    public static void j(TagSpanTextView tagSpanTextView, Tag tag, CharSequence charSequence, Function0 function0, StoryCardIcon storyCardIcon, a aVar, int i7) {
        if ((i7 & 2) != 0) {
            charSequence = null;
        }
        if ((i7 & 4) != 0) {
            function0 = null;
        }
        if ((i7 & 128) != 0) {
            storyCardIcon = null;
        }
        if ((i7 & 256) != 0) {
            aVar = null;
        }
        int i8 = (i7 & 512) != 0 ? 6 : 0;
        if (tag == null && storyCardIcon == null) {
            if (function0 != null) {
                function0.invoke();
                return;
            }
            return;
        }
        TagSpanTextView.TagBuilder tagBuilder = tagSpanTextView.tagBuilder();
        if (storyCardIcon != null) {
            tagBuilder.setImageIcon(storyCardIcon, aVar, 2131237005).appendImage(0, ListExtentionsKt.toPx(4));
        }
        tagBuilder.clear();
        if (tag != null) {
            TagSpanTextView.TagBuilder.appendTag$default(tagBuilder.setTagText(tag.text).setTagTextColor(tag.textColor).setTagBackgroundColor(tag.bgColor).setTagBorderColor(tag.borderColor).setTagNightTextColor(tag.textColorNight).setTagNightBackgroundColor(tag.bgColorNight).setTagNightBorderColor(tag.borderColorNight).setTagBackgroundStyle(tag.bgStyle).setBorderlessPaddingLeft(0).setBorderlessPaddingRight(0).setTagRightSpacing(ListExtentionsKt.toPx(i8)), false, false, 1, (Object) null);
        }
        if (charSequence != null) {
            tagBuilder.appendText(charSequence);
        }
        tagBuilder.applyToView(true);
    }

    public static boolean k(TagView tagView, Tag tag, Aa.g gVar, S s7, int i7) {
        boolean z6;
        String str;
        if ((i7 & 4) != 0) {
            gVar = null;
        }
        if ((i7 & 16) != 0) {
            s7 = null;
        }
        if (tag == null || (str = tag.text) == null || StringsKt.isBlank(str)) {
            tagView.setVisibility(8);
            z6 = false;
            if (gVar != null) {
                gVar.invoke();
                z6 = false;
            }
        } else {
            tagView.tagBuilder().setTagText(tag.text).setTagTextColor(tag.textColor).setTagBackgroundColor(tag.bgColor).setTagBorderColor(tag.borderColor).setTagNightTextColor(tag.textColorNight).setTagNightBackgroundColor(tag.bgColorNight).setTagNightBorderColor(tag.borderColorNight).setTagBackgroundStyle(tag.bgStyle).setBorderlessPaddingLeft(0).setBorderlessPaddingRight(0).applyToView(true);
            z6 = true;
            if (s7 != null) {
                s7.invoke();
                z6 = true;
            }
        }
        return z6;
    }

    public static boolean l(TagTintTextView tagTintTextView, Tag tag, CharSequence charSequence, Function0 function0, boolean z6, int i7) {
        boolean z7;
        if ((i7 & 2) != 0) {
            charSequence = null;
        }
        if ((i7 & 4) != 0) {
            function0 = null;
        }
        if ((i7 & 8) != 0) {
            z6 = false;
        }
        if (tag == null) {
            if (z6) {
                tagTintTextView.setVisibility(8);
            }
            z7 = false;
            if (function0 != null) {
                function0.invoke();
                z7 = false;
            }
        } else {
            TagTintTextView.TagBuilder iconTag = tagTintTextView.tagBuilder().setTextContent(charSequence).setIconTag((IImageTag) null, (IUrlGetter) null);
            if (tag != null) {
                iconTag.setTagText(tag.text).setTagTextColor(tag.textColor).setTagBackgroundColor(tag.bgColor).setTagBorderColor(tag.borderColor).setTagNightTextColor(tag.textColorNight).setTagNightBackgroundColor(tag.bgColorNight).setTagNightBorderColor(tag.borderColorNight).setTagBackgroundStyle(tag.bgStyle).setBorderlessPaddingLeft(0).setBorderlessPaddingRight(0).setDrawOnFontCenter(false);
            }
            iconTag.applyToView(true, false);
            z7 = true;
        }
        return z7;
    }

    public static void m(BiliImageView biliImageView, String str, ImageLoadingListener imageLoadingListener, boolean z6, int i7) {
        if ((i7 & 2) != 0) {
            imageLoadingListener = null;
        }
        if ((i7 & 8) != 0) {
            z6 = false;
        }
        ImageExtentionKt.displayImage$default(biliImageView, str, ThumbUrlTransformStrategyUtils.stylingStrategy$default("pegasus-android-v1", (IThumbnailSizeController) null, 2, (Object) null), imageLoadingListener, 0, 0, z6, false, (ScaleType) null, (BitmapTransformation) null, false, 728, (Object) null);
    }

    public static final float n(@NotNull Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(2130970030, typedValue, true);
        return TypedValue.complexToDimension(typedValue.data, context.getResources().getDisplayMetrics());
    }

    public static final int o(int i7) {
        Object next;
        List<Integer> array;
        List<Integer> list = f78894b;
        List<Integer> list2 = list;
        if (list == null) {
            String str = (String) Contract.get$default(ConfigManager.Companion.config(), "pegasus.card_image_width_level", (Object) null, 2, (Object) null);
            if (str != null) {
                try {
                    array = JSON.parseArray(str, Integer.TYPE);
                    f78894b = array;
                } catch (Exception e7) {
                    CrashReport.postCatchedException(new IllegalArgumentException("Illegal fawkes config, check the value of pegasus.card_image_width_level", e7));
                    array = f78895c;
                }
            } else {
                array = null;
            }
            list2 = array;
            if (array == null) {
                list2 = f78895c;
            }
        }
        Iterator<T> it = list2.iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                int iAbs = Math.abs(((Number) next).intValue() - i7);
                Object obj = next;
                do {
                    Object next2 = it.next();
                    int iAbs2 = Math.abs(((Number) next2).intValue() - i7);
                    next = obj;
                    int i8 = iAbs;
                    if (iAbs > iAbs2) {
                        next = next2;
                        i8 = iAbs2;
                    }
                    obj = next;
                    iAbs = i8;
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        Integer num = (Integer) next;
        if (num != null) {
            i7 = num.intValue();
        }
        return i7;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String p(int r3) {
        /*
            android.app.Application r0 = com.bilibili.base.BiliContext.application()
            r4 = r0
            r0 = r4
            if (r0 == 0) goto L14
            r0 = r4
            r1 = r3
            java.lang.String r0 = r0.getString(r1)
            r5 = r0
            r0 = r5
            r4 = r0
            r0 = r5
            if (r0 != 0) goto L18
        L14:
            java.lang.String r0 = ""
            r4 = r0
        L18:
            r0 = r4
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.utils.x.p(int):java.lang.String");
    }

    public static final boolean q(@Nullable List<?> list) {
        return list == null || list.isEmpty();
    }

    @ColorInt
    public static final int r(@Nullable String str) {
        int color = 0;
        if (str != null) {
            if (StringsKt.isBlank(str)) {
                color = 0;
            } else {
                try {
                    color = Color.parseColor(str);
                } catch (Exception e7) {
                    color = 0;
                }
            }
        }
        return color;
    }

    @JvmOverloads
    public static final void s(@NotNull TagTintTextView tagTintTextView, @Nullable CharSequence charSequence, @Nullable String str, int i7, int i8) {
        CharSequence charSequenceBuild$default = charSequence;
        if (str != null) {
            if (str.length() == 0) {
                charSequenceBuild$default = charSequence;
            } else {
                int iR = r(str);
                charSequenceBuild$default = charSequence;
                if (iR != 0) {
                    charSequenceBuild$default = TagTintTextView.TagBuilder.build$default(tagTintTextView.tagBuilder().setTagText(charSequence).setTagBackgroundColor(iR).setTextContent((CharSequence) null), false, 1, (Object) null);
                }
            }
        }
        ListExtentionsKt.setTextWithIcon$default(tagTintTextView, charSequenceBuild$default, i7, i8, 0.0f, 0.0f, 48, (Object) null);
    }

    public static final void t(@NotNull TextView textView, @NotNull TextView textView2, @Nullable MultiplyDesc multiplyDesc, @Nullable String str) {
        String str2 = multiplyDesc != null ? multiplyDesc.authorName : null;
        if (str2 == null || StringsKt.isBlank(str2)) {
            textView.setVisibility(8);
            ListExtentionsKt.setText(textView2, str);
            return;
        }
        if (multiplyDesc == null || !multiplyDesc.isNormal()) {
            textView.setPadding(0, 0, ListExtentionsKt.toPx(4), 0);
        } else {
            textView.setPadding(0, 0, 0, 0);
        }
        ListExtentionsKt.setText(textView, multiplyDesc != null ? multiplyDesc.authorName : null);
        String str3 = null;
        if (multiplyDesc != null) {
            str3 = multiplyDesc.extra;
        }
        ListExtentionsKt.setText(textView2, str3);
    }

    public static final long u(@Nullable Long l7) {
        return l7 != null ? l7.longValue() : 0L;
    }
}
