package com.bilibili.pegasus.ext.view;

import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import com.bilibili.app.comm.list.common.data.StoryCardIcon;
import com.bilibili.app.comm.list.widget.image.AutoTintBiliImageView;
import com.bilibili.app.comm.list.widget.image.IUrlGetter;
import com.bilibili.app.comm.list.widget.image.TintBadgeView;
import com.bilibili.app.comm.list.widget.tag.GifTagView;
import com.bilibili.app.comm.list.widget.tag.TagView;
import com.bilibili.app.comm.list.widget.tag.base.IImageTag;
import com.bilibili.app.comm.list.widget.tag.tagtinttext.TagSpanTextView;
import com.bilibili.app.comm.list.widget.tag.tagtinttext.TagTintTextView;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.pegasus.data.component.MultiplyDescData;
import java.util.List;
import jp0.C7716a;
import jp0.e;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sp0.C8614c;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/ext/view/TagExtKt.class */
public final class TagExtKt {

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/ext/view/TagExtKt$a.class */
    public static final class a implements IImageTag {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final e f77431a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f77432b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f77433c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f77434d;

        public a(e eVar, int i7, int i8, boolean z6) {
            this.f77431a = eVar;
            this.f77432b = z6;
            this.f77433c = i7;
            this.f77434d = i8;
        }

        public final boolean drawIconAtViewVerticalCenter() {
            return this.f77432b;
        }

        public final int getIconHeight() {
            e eVar = this.f77431a;
            return eVar.g() > 0 ? eVar.g() : 12;
        }

        public final String getIconNightUrl() {
            return this.f77431a.h();
        }

        public final String getIconUrl() {
            return this.f77431a.j();
        }

        public final int getIconWidth() {
            e eVar = this.f77431a;
            return eVar.k() > 0 ? eVar.k() : 12;
        }

        public final int getLeftSpacing() {
            return this.f77433c;
        }

        public final int getRightSpacing() {
            e eVar = this.f77431a;
            return eVar.i() > 0 ? eVar.i() : this.f77434d;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/ext/view/TagExtKt$b.class */
    public static final class b implements IImageTag {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final StoryCardIcon f77435a;

        public b(StoryCardIcon storyCardIcon) {
            this.f77435a = storyCardIcon;
        }

        public final boolean drawIconAtViewVerticalCenter() {
            return true;
        }

        public final int getIconHeight() {
            return this.f77435a.iconHeight;
        }

        public final String getIconNightUrl() {
            String str = this.f77435a.iconNightUrl;
            String str2 = str;
            if (str == null) {
                str2 = "";
            }
            return str2;
        }

        public final String getIconUrl() {
            String str = this.f77435a.iconUrl;
            String str2 = str;
            if (str == null) {
                str2 = "";
            }
            return str2;
        }

        public final int getIconWidth() {
            return this.f77435a.iconWidth;
        }
    }

    @ColorInt
    public static final int a(String str) {
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

    public static final void adjustTagSpacing(@NotNull TagView tagView, boolean z6, boolean z7) {
        if (z6) {
            ViewGroup.LayoutParams layoutParams = tagView.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams == null) {
                return;
            }
            marginLayoutParams.rightMargin = ListExtentionsKt.toPx(z7 ? 4.0f : 6.0f);
        }
    }

    public static final int b(int i7) {
        return i7 != 1 ? i7 != 4 ? ListExtentionsKt.toPx(10) : ListExtentionsKt.toPx(12) : ListExtentionsKt.toPx(11);
    }

    public static final void displayBadge(@NotNull TintBadgeView tintBadgeView, @Nullable C7716a c7716a) {
        if (c7716a == null || c7716a.d() <= 0 || c7716a.a() <= 0) {
            tintBadgeView.hideBadgeView();
        } else {
            tintBadgeView.setImageWidthAndHeight(ListExtentionsKt.toPx(c7716a.d()), ListExtentionsKt.toPx(c7716a.a()));
            tintBadgeView.showBadgeView(c7716a.c(), c7716a.b());
        }
    }

    public static final boolean displaySpanTag(@NotNull TagSpanTextView tagSpanTextView, @Nullable e eVar, @Nullable CharSequence charSequence, @Nullable Function0<Unit> function0, boolean z6, boolean z7, boolean z8, @Nullable Function0<Unit> function02, @Nullable IImageTag iImageTag, @Nullable IUrlGetter iUrlGetter, int i7, int i8) {
        if (eVar == null && iImageTag == null) {
            if (z6) {
                tagSpanTextView.setVisibility(8);
            }
            if (function0 == null) {
                return false;
            }
            function0.invoke();
            return false;
        }
        TagSpanTextView.TagBuilder tagBuilder = tagSpanTextView.tagBuilder();
        if (iImageTag != null) {
            tagBuilder.setImageIcon(iImageTag, iUrlGetter, 2131237005).appendImage(0, ListExtentionsKt.toPx(i8));
        }
        tagBuilder.clear();
        if (eVar != null) {
            TagSpanTextView.TagBuilder.appendTag$default(tagBuilder.setTagText(eVar.l()).setTagTextColor(eVar.m()).setTagBackgroundColor(eVar.a()).setTagBorderColor(eVar.d()).setTagNightTextColor(eVar.n()).setTagNightBackgroundColor(eVar.b()).setTagNightBorderColor(eVar.e()).setTagBackgroundStyle(eVar.c()).setBorderlessPaddingLeft(0).setBorderlessPaddingRight(0).setTagRightSpacing(ListExtentionsKt.toPx(i7)), false, z8, 1, (Object) null);
        }
        if (charSequence != null) {
            tagBuilder.appendText(charSequence);
        }
        tagBuilder.applyToView(z7);
        if (function02 == null) {
            return true;
        }
        function02.invoke();
        return true;
    }

    public static /* synthetic */ boolean displaySpanTag$default(TagSpanTextView tagSpanTextView, e eVar, CharSequence charSequence, Function0 function0, boolean z6, boolean z7, boolean z8, Function0 function02, IImageTag iImageTag, IUrlGetter iUrlGetter, int i7, int i8, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            charSequence = null;
        }
        if ((i9 & 4) != 0) {
            function0 = null;
        }
        if ((i9 & 8) != 0) {
            z6 = false;
        }
        if ((i9 & 16) != 0) {
            z7 = true;
        }
        if ((i9 & 32) != 0) {
            z8 = false;
        }
        if ((i9 & 64) != 0) {
            function02 = null;
        }
        if ((i9 & 128) != 0) {
            iImageTag = null;
        }
        if ((i9 & 256) != 0) {
            iUrlGetter = null;
        }
        if ((i9 & 512) != 0) {
            i7 = 6;
        }
        if ((i9 & 1024) != 0) {
            i8 = 4;
        }
        return displaySpanTag(tagSpanTextView, eVar, charSequence, function0, z6, z7, z8, function02, iImageTag, iUrlGetter, i7, i8);
    }

    public static final boolean displaySpanTags(@NotNull TagSpanTextView tagSpanTextView, @Nullable List<e> list, @NotNull CharSequence charSequence, int i7, int i8, boolean z6, boolean z7, boolean z8, @Nullable Function0<Unit> function0, @Nullable Function0<Unit> function02, boolean z9) {
        List<e> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            if (function0 != null) {
                function0.invoke();
            }
            if (!z6) {
                return false;
            }
            tagSpanTextView.setVisibility(8);
            return false;
        }
        TagSpanTextView.TagBuilder tagBuilder = tagSpanTextView.tagBuilder();
        tagBuilder.clear();
        for (e eVar : list) {
            if (eVar != null) {
                if (z9) {
                    int iC = eVar.c();
                    if (iC == 1) {
                        tagBuilder.setTagTextSize(tagBuilder.getContext().getResources().getDimensionPixelSize(2131167101));
                        tagBuilder.setTagHeight(tagBuilder.getContext().getResources().getDimensionPixelSize(2131167100));
                    } else if (iC == 2) {
                        tagBuilder.setTagTextSize(tagBuilder.getContext().getResources().getDimensionPixelSize(2131167103));
                        tagBuilder.setTagHeight(tagBuilder.getContext().getResources().getDimensionPixelSize(2131167102));
                    }
                }
                tagBuilder.setTagText(eVar.l());
                tagBuilder.setTagTextColor(eVar.m());
                tagBuilder.setTagBackgroundColor(eVar.a());
                tagBuilder.setTagBorderColor(eVar.d());
                tagBuilder.setTagNightTextColor(eVar.n());
                tagBuilder.setTagNightBackgroundColor(eVar.b());
                tagBuilder.setTagNightBorderColor(eVar.e());
                tagBuilder.setTagBackgroundStyle(eVar.c());
                tagBuilder.setTagLeftSpacing(i7);
                tagBuilder.setTagRightSpacing(i8);
                tagBuilder.setBorderlessPaddingLeft(0);
                tagBuilder.setBorderlessPaddingRight(0);
                TagSpanTextView.TagBuilder.appendTag$default(tagBuilder, false, z8, 1, (Object) null);
            }
            if (function02 != null) {
                function02.invoke();
            }
        }
        tagBuilder.appendText(charSequence);
        tagBuilder.applyToView(z7);
        return true;
    }

    public static /* synthetic */ boolean displaySpanTags$default(TagSpanTextView tagSpanTextView, List list, CharSequence charSequence, int i7, int i8, boolean z6, boolean z7, boolean z8, Function0 function0, Function0 function02, boolean z9, int i9, Object obj) {
        if ((i9 & 4) != 0) {
            i7 = 0;
        }
        if ((i9 & 8) != 0) {
            i8 = 0;
        }
        if ((i9 & 16) != 0) {
            z6 = false;
        }
        if ((i9 & 32) != 0) {
            z7 = true;
        }
        if ((i9 & 64) != 0) {
            z8 = false;
        }
        if ((i9 & 128) != 0) {
            function0 = null;
        }
        if ((i9 & 256) != 0) {
            function02 = null;
        }
        if ((i9 & 512) != 0) {
            z9 = false;
        }
        return displaySpanTags(tagSpanTextView, list, charSequence, i7, i8, z6, z7, z8, function0, function02, z9);
    }

    public static final boolean displayTag(@NotNull GifTagView gifTagView, @Nullable e eVar, boolean z6, boolean z7, boolean z8) {
        String strL;
        if (eVar == null || (strL = eVar.l()) == null || StringsKt.isBlank(strL)) {
            if (!z6) {
                return false;
            }
            gifTagView.setVisibility(8);
            return false;
        }
        String strL2 = eVar.l();
        if (strL2 == null || StringsKt.isBlank(strL2)) {
            gifTagView.setVisibility(8);
            return false;
        }
        gifTagView.setVisibility(0);
        gifTagView.tagBuilder().setText(eVar.l()).setTextDayColor(a(eVar.m())).setTextNightColor(a(eVar.n())).setGifTagDayBackground(a(eVar.a())).setGifTagNightBackground(a(eVar.b())).setGifTagDayBorder(a(eVar.d())).setGifTagNightBorder(a(eVar.e())).setGifTagBackgroundStyle(eVar.c()).setGifImageUrl(eVar.j(), true).setIncludeFontPadding(z7).setHideImageWhenLoadFailed(z8).build();
        return true;
    }

    @JvmOverloads
    public static final boolean displayTag(@NotNull TagView tagView, @Nullable e eVar) {
        return displayTag$default(tagView, eVar, false, null, false, null, 30, null);
    }

    @JvmOverloads
    public static final boolean displayTag(@NotNull TagView tagView, @Nullable e eVar, boolean z6) {
        return displayTag$default(tagView, eVar, z6, null, false, null, 28, null);
    }

    @JvmOverloads
    public static final boolean displayTag(@NotNull TagView tagView, @Nullable e eVar, boolean z6, @Nullable Function0<Unit> function0) {
        return displayTag$default(tagView, eVar, z6, function0, false, null, 24, null);
    }

    @JvmOverloads
    public static final boolean displayTag(@NotNull TagView tagView, @Nullable e eVar, boolean z6, @Nullable Function0<Unit> function0, boolean z7) {
        return displayTag$default(tagView, eVar, z6, function0, z7, null, 16, null);
    }

    @JvmOverloads
    public static final boolean displayTag(@NotNull TagView tagView, @Nullable e eVar, boolean z6, @Nullable Function0<Unit> function0, boolean z7, @Nullable Function0<Unit> function02) {
        String strL;
        if (eVar != null && (strL = eVar.l()) != null && !StringsKt.isBlank(strL)) {
            tagView.tagBuilder().setTagText(eVar.l()).setTagTextColor(eVar.m()).setTagBackgroundColor(eVar.a()).setTagBorderColor(eVar.d()).setTagNightTextColor(eVar.n()).setTagNightBackgroundColor(eVar.b()).setTagNightBorderColor(eVar.e()).setTagBackgroundStyle(eVar.c()).setTagTextSize(b(eVar.c())).setTagBorderlessTextSize(b(eVar.c())).setBorderlessPaddingLeft(0).setBorderlessPaddingRight(0).applyToView(z7);
            if (function02 == null) {
                return true;
            }
            function02.invoke();
            return true;
        }
        if (z6) {
            tagView.setVisibility(8);
        }
        if (function0 == null) {
            return false;
        }
        function0.invoke();
        return false;
    }

    @JvmOverloads
    public static final boolean displayTag(@NotNull TagTintTextView tagTintTextView, @Nullable e eVar) {
        return displayTag$default(tagTintTextView, eVar, null, null, false, false, false, null, null, null, false, 1022, null);
    }

    @JvmOverloads
    public static final boolean displayTag(@NotNull TagTintTextView tagTintTextView, @Nullable e eVar, @Nullable CharSequence charSequence) {
        return displayTag$default(tagTintTextView, eVar, charSequence, null, false, false, false, null, null, null, false, 1020, null);
    }

    @JvmOverloads
    public static final boolean displayTag(@NotNull TagTintTextView tagTintTextView, @Nullable e eVar, @Nullable CharSequence charSequence, @Nullable Function0<Unit> function0) {
        return displayTag$default(tagTintTextView, eVar, charSequence, function0, false, false, false, null, null, null, false, 1016, null);
    }

    @JvmOverloads
    public static final boolean displayTag(@NotNull TagTintTextView tagTintTextView, @Nullable e eVar, @Nullable CharSequence charSequence, @Nullable Function0<Unit> function0, boolean z6) {
        return displayTag$default(tagTintTextView, eVar, charSequence, function0, z6, false, false, null, null, null, false, 1008, null);
    }

    @JvmOverloads
    public static final boolean displayTag(@NotNull TagTintTextView tagTintTextView, @Nullable e eVar, @Nullable CharSequence charSequence, @Nullable Function0<Unit> function0, boolean z6, boolean z7) {
        return displayTag$default(tagTintTextView, eVar, charSequence, function0, z6, z7, false, null, null, null, false, 992, null);
    }

    @JvmOverloads
    public static final boolean displayTag(@NotNull TagTintTextView tagTintTextView, @Nullable e eVar, @Nullable CharSequence charSequence, @Nullable Function0<Unit> function0, boolean z6, boolean z7, boolean z8) {
        return displayTag$default(tagTintTextView, eVar, charSequence, function0, z6, z7, z8, null, null, null, false, 960, null);
    }

    @JvmOverloads
    public static final boolean displayTag(@NotNull TagTintTextView tagTintTextView, @Nullable e eVar, @Nullable CharSequence charSequence, @Nullable Function0<Unit> function0, boolean z6, boolean z7, boolean z8, @Nullable Function0<Unit> function02) {
        return displayTag$default(tagTintTextView, eVar, charSequence, function0, z6, z7, z8, function02, null, null, false, 896, null);
    }

    @JvmOverloads
    public static final boolean displayTag(@NotNull TagTintTextView tagTintTextView, @Nullable e eVar, @Nullable CharSequence charSequence, @Nullable Function0<Unit> function0, boolean z6, boolean z7, boolean z8, @Nullable Function0<Unit> function02, @Nullable IImageTag iImageTag) {
        return displayTag$default(tagTintTextView, eVar, charSequence, function0, z6, z7, z8, function02, iImageTag, null, false, 768, null);
    }

    @JvmOverloads
    public static final boolean displayTag(@NotNull TagTintTextView tagTintTextView, @Nullable e eVar, @Nullable CharSequence charSequence, @Nullable Function0<Unit> function0, boolean z6, boolean z7, boolean z8, @Nullable Function0<Unit> function02, @Nullable IImageTag iImageTag, @Nullable IUrlGetter iUrlGetter) {
        return displayTag$default(tagTintTextView, eVar, charSequence, function0, z6, z7, z8, function02, iImageTag, iUrlGetter, false, 512, null);
    }

    @JvmOverloads
    public static final boolean displayTag(@NotNull TagTintTextView tagTintTextView, @Nullable e eVar, @Nullable CharSequence charSequence, @Nullable Function0<Unit> function0, boolean z6, boolean z7, boolean z8, @Nullable Function0<Unit> function02, @Nullable IImageTag iImageTag, @Nullable IUrlGetter iUrlGetter, boolean z9) {
        if (eVar == null && iImageTag == null) {
            if (z6) {
                tagTintTextView.setVisibility(8);
            }
            if (function0 == null) {
                return false;
            }
            function0.invoke();
            return false;
        }
        TagTintTextView.TagBuilder iconTag = tagTintTextView.tagBuilder().setTextContent(charSequence).setIconTag(iImageTag, iUrlGetter);
        if (eVar != null) {
            iconTag.setTagText(eVar.l()).setTagTextColor(eVar.m()).setTagBackgroundColor(eVar.a()).setTagBorderColor(eVar.d()).setTagNightTextColor(eVar.n()).setTagNightBackgroundColor(eVar.b()).setTagNightBorderColor(eVar.e()).setTagBackgroundStyle(eVar.c()).setTagTextSize(b(eVar.c())).setTagBorderlessTextSize(b(eVar.c())).setTagHeight(ListExtentionsKt.toPx(16)).setBorderlessPaddingLeft(0).setBorderlessPaddingRight(0).setDrawOnFontCenter(z9);
        }
        iconTag.applyToView(z7, z8);
        if (function02 == null) {
            return true;
        }
        function02.invoke();
        return true;
    }

    public static /* synthetic */ boolean displayTag$default(GifTagView gifTagView, e eVar, boolean z6, boolean z7, boolean z8, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            z6 = true;
        }
        if ((i7 & 4) != 0) {
            z7 = false;
        }
        if ((i7 & 8) != 0) {
            z8 = false;
        }
        return displayTag(gifTagView, eVar, z6, z7, z8);
    }

    public static /* synthetic */ boolean displayTag$default(TagView tagView, e eVar, boolean z6, Function0 function0, boolean z7, Function0 function02, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            z6 = true;
        }
        if ((i7 & 4) != 0) {
            function0 = null;
        }
        if ((i7 & 8) != 0) {
            z7 = true;
        }
        if ((i7 & 16) != 0) {
            function02 = null;
        }
        return displayTag(tagView, eVar, z6, (Function0<Unit>) function0, z7, (Function0<Unit>) function02);
    }

    public static /* synthetic */ boolean displayTag$default(TagTintTextView tagTintTextView, e eVar, CharSequence charSequence, Function0 function0, boolean z6, boolean z7, boolean z8, Function0 function02, IImageTag iImageTag, IUrlGetter iUrlGetter, boolean z9, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            charSequence = null;
        }
        if ((i7 & 4) != 0) {
            function0 = null;
        }
        if ((i7 & 8) != 0) {
            z6 = false;
        }
        if ((i7 & 16) != 0) {
            z7 = true;
        }
        if ((i7 & 32) != 0) {
            z8 = false;
        }
        if ((i7 & 64) != 0) {
            function02 = null;
        }
        if ((i7 & 128) != 0) {
            iImageTag = null;
        }
        if ((i7 & 256) != 0) {
            iUrlGetter = null;
        }
        if ((i7 & 512) != 0) {
            z9 = false;
        }
        return displayTag(tagTintTextView, eVar, charSequence, function0, z6, z7, z8, function02, iImageTag, iUrlGetter, z9);
    }

    @JvmOverloads
    public static final void setCoverLabelText(@NotNull TagTintTextView tagTintTextView, @Nullable CharSequence charSequence, @Nullable String str) {
        setCoverLabelText$default(tagTintTextView, charSequence, str, null, 0, 0, 56, null);
    }

    @JvmOverloads
    public static final void setCoverLabelText(@NotNull TagTintTextView tagTintTextView, @Nullable CharSequence charSequence, @Nullable String str, @Nullable CharSequence charSequence2) {
        setCoverLabelText$default(tagTintTextView, charSequence, str, charSequence2, 0, 0, 48, null);
    }

    @JvmOverloads
    public static final void setCoverLabelText(@NotNull TagTintTextView tagTintTextView, @Nullable CharSequence charSequence, @Nullable String str, @Nullable CharSequence charSequence2, int i7) {
        setCoverLabelText$default(tagTintTextView, charSequence, str, charSequence2, i7, 0, 32, null);
    }

    @JvmOverloads
    public static final void setCoverLabelText(@NotNull TagTintTextView tagTintTextView, @Nullable CharSequence charSequence, @Nullable String str, @Nullable CharSequence charSequence2, int i7, int i8) {
        CharSequence charSequenceBuild$default = charSequence;
        if (str != null) {
            if (str.length() == 0) {
                charSequenceBuild$default = charSequence;
            } else {
                int colorInt$default = ListExtentionsKt.toColorInt$default(str, 0, 1, (Object) null);
                charSequenceBuild$default = charSequence;
                if (colorInt$default != 0) {
                    charSequenceBuild$default = TagTintTextView.TagBuilder.build$default(tagTintTextView.tagBuilder().setTagText(charSequence).setTagBackgroundColor(colorInt$default).setTextContent(charSequence2), false, 1, (Object) null);
                }
            }
        }
        ListExtentionsKt.setTextWithIcon$default(tagTintTextView, charSequenceBuild$default, i7, i8, 0.0f, 0.0f, 48, (Object) null);
    }

    public static /* synthetic */ void setCoverLabelText$default(TagTintTextView tagTintTextView, CharSequence charSequence, String str, CharSequence charSequence2, int i7, int i8, int i9, Object obj) {
        if ((i9 & 8) != 0) {
            charSequence2 = null;
        }
        if ((i9 & 16) != 0) {
            i7 = 0;
        }
        if ((i9 & 32) != 0) {
            i8 = 0;
        }
        setCoverLabelText(tagTintTextView, charSequence, str, charSequence2, i7, i8);
    }

    public static final void setMultiplyDesc(@NotNull TextView textView, @NotNull TextView textView2, @Nullable MultiplyDescData multiplyDescData, @Nullable String str) {
        String authorName = multiplyDescData != null ? multiplyDescData.getAuthorName() : null;
        if (authorName == null || StringsKt.isBlank(authorName)) {
            textView.setVisibility(8);
            ListExtentionsKt.setText(textView2, str);
            return;
        }
        if (multiplyDescData == null || !multiplyDescData.isNormal()) {
            textView.setPadding(0, 0, ListExtentionsKt.toPx(4), 0);
        } else {
            textView.setPadding(0, 0, 0, 0);
        }
        ListExtentionsKt.setText(textView, multiplyDescData != null ? multiplyDescData.getAuthorName() : null);
        String extra = null;
        if (multiplyDescData != null) {
            extra = multiplyDescData.getExtra();
        }
        ListExtentionsKt.setText(textView2, extra);
    }

    public static final void showStoryTag(@NotNull ViewStub viewStub, @NotNull View view, @Nullable StoryCardIcon storyCardIcon) {
        if (storyCardIcon == null) {
            viewStub.setVisibility(8);
            return;
        }
        viewStub.setVisibility(0);
        ViewGroup.LayoutParams layoutParams = viewStub.getLayoutParams();
        layoutParams.width = ListExtentionsKt.toPx(storyCardIcon.iconWidth);
        layoutParams.height = ListExtentionsKt.toPx(storyCardIcon.iconHeight);
        viewStub.setLayoutParams(layoutParams);
        AutoTintBiliImageView autoTintBiliImageViewFindViewById = view.findViewById(2131312414);
        if (autoTintBiliImageViewFindViewById != null) {
            autoTintBiliImageViewFindViewById.setIconUrl(storyCardIcon.iconUrl);
            autoTintBiliImageViewFindViewById.setNightUrl(storyCardIcon.iconNightUrl);
            autoTintBiliImageViewFindViewById.setUrlGetter(C8614c.f127321c);
            autoTintBiliImageViewFindViewById.startLoad();
        }
    }

    @Nullable
    public static final IImageTag toImageTag(@Nullable StoryCardIcon storyCardIcon) {
        String str;
        String str2;
        if (storyCardIcon == null || (str = storyCardIcon.iconNightUrl) == null || StringsKt.isBlank(str) || (str2 = storyCardIcon.iconUrl) == null || StringsKt.isBlank(str2)) {
            return null;
        }
        return new b(storyCardIcon);
    }

    @Nullable
    public static final IImageTag toImageTag(@Nullable e eVar, int i7, int i8, boolean z6) {
        String strH;
        String strJ;
        if (eVar == null || (strH = eVar.h()) == null || StringsKt.isBlank(strH) || (strJ = eVar.j()) == null || StringsKt.isBlank(strJ)) {
            return null;
        }
        return new a(eVar, i7, i8, z6);
    }

    public static /* synthetic */ IImageTag toImageTag$default(e eVar, int i7, int i8, boolean z6, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            i7 = 0;
        }
        if ((i9 & 2) != 0) {
            i8 = 0;
        }
        if ((i9 & 4) != 0) {
            z6 = false;
        }
        return toImageTag(eVar, i7, i8, z6);
    }
}
