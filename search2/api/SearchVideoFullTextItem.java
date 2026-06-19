package com.bilibili.search2.api;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.annotation.JSONField;
import com.bapis.bilibili.polymer.app.search.v1.FullTextResult;
import com.bilibili.app.comm.list.common.utils.ColorTagHandler;
import com.bilibili.app.comm.list.widget.tag.base.IImageTag;
import com.bilibili.commons.StringUtils;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/api/SearchVideoFullTextItem.class */
@StabilityInferred(parameters = 0)
@Keep
public final class SearchVideoFullTextItem implements IImageTag {
    public static final int $stable = 8;

    @NotNull
    public static final a Companion = new Object();
    public static final int TYPE_ASR = 2;
    public static final int TYPE_CHAPTER = 1;
    public static final int TYPE_COMMENT = 6;
    public static final int TYPE_DANMAKU = 4;
    public static final int TYPE_NOTE = 3;
    public static final int TYPE_SPLIT = 5;

    @JSONField(name = "ahead_prefix_text")
    @Nullable
    private String aheadPrefixText;

    @JSONField(name = "avatar_cover")
    @Nullable
    private String avatarCover;
    private boolean comment43ExpEnable;
    private boolean disablePrefix;

    @JSONField(name = "icon")
    @Nullable
    private String icon;

    @JSONField(name = "icon_night")
    @Nullable
    private String iconNight;

    @JSONField(name = "id")
    @Nullable
    private String id;

    @JSONField(name = "jump_start_progress")
    private long jumpStartProgress;

    @JSONField(name = "jump_uri")
    @Nullable
    private String jumpUri;

    @JSONField(name = "like_count")
    @Nullable
    private String likeCount;

    @JSONField(name = "prefix")
    @Nullable
    private String prefix;
    private boolean pureCommenterAvatar;

    @JSONField(name = "show_text")
    @Nullable
    private String showText;

    @JSONField(name = "text")
    @Nullable
    private String text;

    @JSONField(name = "type")
    private int type;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/api/SearchVideoFullTextItem$a.class */
    public static final class a {
    }

    public SearchVideoFullTextItem() {
        this.jumpStartProgress = -1L;
    }

    public SearchVideoFullTextItem(@NotNull FullTextResult fullTextResult, boolean z6, boolean z7) {
        this.jumpStartProgress = -1L;
        this.type = fullTextResult.getType();
        this.showText = fullTextResult.getShowText();
        this.jumpStartProgress = fullTextResult.getJumpStartProgress();
        this.jumpUri = fullTextResult.getJumpUri();
        this.icon = fullTextResult.getIcon();
        this.iconNight = fullTextResult.getIconForNight();
        this.prefix = fullTextResult.getPrefix();
        this.text = fullTextResult.getText();
        if (fullTextResult.getId() > 0) {
            this.id = String.valueOf(fullTextResult.getId());
        }
        this.comment43ExpEnable = z6;
        this.pureCommenterAvatar = z7;
        this.aheadPrefixText = fullTextResult.getAheadPrefixText();
        this.likeCount = fullTextResult.getLikeCount();
        this.avatarCover = fullTextResult.getAvatarCover();
    }

    public /* synthetic */ SearchVideoFullTextItem(FullTextResult fullTextResult, boolean z6, boolean z7, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(fullTextResult, (i7 & 2) != 0 ? false : z6, (i7 & 4) != 0 ? false : z7);
    }

    public final boolean boldPrefix() {
        return isAsr() || isNote() || isComment();
    }

    public final void disablePrefix(boolean z6) {
        this.disablePrefix = z6;
    }

    @Nullable
    public final String getAheadPrefixText() {
        return this.aheadPrefixText;
    }

    @Nullable
    public final String getAvatarCover() {
        return this.avatarCover;
    }

    public final boolean getComment43ExpEnable() {
        return this.comment43ExpEnable;
    }

    @JSONField(deserialize = false, serialize = false)
    @Nullable
    public final CharSequence getDisplayText(@Nullable Context context) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        CharSequence charSequenceDecode$default = ColorTagHandler.decode$default(context, this.prefix, 0, 4, (Object) null);
        if (!TextUtils.isEmpty(charSequenceDecode$default) && !this.disablePrefix) {
            if (boldPrefix()) {
                SpannableString spannableString = new SpannableString(charSequenceDecode$default);
                spannableString.setSpan(new StyleSpan(1), 0, charSequenceDecode$default.length(), 33);
                spannableStringBuilder.append((CharSequence) spannableString);
            } else {
                spannableStringBuilder.append(charSequenceDecode$default);
            }
        }
        CharSequence charSequenceDecode$default2 = ColorTagHandler.decode$default(context, this.text, 0, 4, (Object) null);
        if (!TextUtils.isEmpty(charSequenceDecode$default2)) {
            spannableStringBuilder.append(charSequenceDecode$default2);
        }
        return spannableStringBuilder;
    }

    @Nullable
    public final String getIcon() {
        return this.icon;
    }

    public int getIconHeight() {
        return this.comment43ExpEnable ? 14 : 16;
    }

    @Nullable
    public final String getIconNight() {
        return this.iconNight;
    }

    @Nullable
    public String getIconNightUrl() {
        return this.pureCommenterAvatar ? this.avatarCover : this.iconNight;
    }

    @Nullable
    public String getIconUrl() {
        return this.pureCommenterAvatar ? this.avatarCover : this.icon;
    }

    public int getIconWidth() {
        return this.comment43ExpEnable ? 14 : 16;
    }

    @Nullable
    public final String getId() {
        return this.id;
    }

    public final long getJumpStartProgress() {
        return this.jumpStartProgress;
    }

    @Nullable
    public final String getJumpUri() {
        return this.jumpUri;
    }

    @Nullable
    public final String getLikeCount() {
        return this.likeCount;
    }

    @Nullable
    public final String getPrefix() {
        return this.prefix;
    }

    @Nullable
    public final String getShowText() {
        return this.showText;
    }

    @Nullable
    public final String getText() {
        return this.text;
    }

    public final int getType() {
        return this.type;
    }

    @JSONField(serialize = false)
    public final boolean hasJumpStartProgress() {
        return isValid() && this.jumpStartProgress >= 0;
    }

    @JSONField(serialize = false)
    public final boolean isAsr() {
        return isValid() && this.type == 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    @com.alibaba.fastjson.annotation.JSONField(serialize = false)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean isChapter() {
        /*
            r3 = this;
            r0 = r3
            boolean r0 = r0.isValid()
            if (r0 == 0) goto L16
            r0 = r3
            int r0 = r0.type
            r4 = r0
            r0 = 1
            r5 = r0
            r0 = r4
            r1 = 1
            if (r0 != r1) goto L16
            goto L18
        L16:
            r0 = 0
            r5 = r0
        L18:
            r0 = r5
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.search2.api.SearchVideoFullTextItem.isChapter():boolean");
    }

    public final boolean isComment() {
        return isValid() && this.type == 6;
    }

    @JSONField(serialize = false)
    public final boolean isNote() {
        return isValid() && this.type == 3;
    }

    @JSONField(serialize = false)
    public final boolean isValid() {
        return isValidType() && !(StringUtils.isBlank(this.prefix) && StringUtils.isBlank(this.text));
    }

    public final boolean isValidIcon() {
        return (StringUtils.isBlank(this.icon) || StringUtils.isBlank(this.iconNight)) ? false : true;
    }

    public final boolean isValidType() {
        int i7 = this.type;
        boolean z6 = true;
        if (i7 != 1) {
            z6 = true;
            if (i7 != 2) {
                z6 = true;
                if (i7 != 3) {
                    z6 = true;
                    if (i7 != 4) {
                        z6 = true;
                        if (i7 != 5) {
                            z6 = i7 == 6;
                        }
                    }
                }
            }
        }
        return z6;
    }

    public final void setAheadPrefixText(@Nullable String str) {
        this.aheadPrefixText = str;
    }

    public final void setAvatarCover(@Nullable String str) {
        this.avatarCover = str;
    }

    public final void setComment43ExpEnable(boolean z6) {
        this.comment43ExpEnable = z6;
    }

    public final void setIcon(@Nullable String str) {
        this.icon = str;
    }

    public final void setIconNight(@Nullable String str) {
        this.iconNight = str;
    }

    public final void setId(@Nullable String str) {
        this.id = str;
    }

    public final void setJumpStartProgress(long j7) {
        this.jumpStartProgress = j7;
    }

    public final void setJumpUri(@Nullable String str) {
        this.jumpUri = str;
    }

    public final void setLikeCount(@Nullable String str) {
        this.likeCount = str;
    }

    public final void setPrefix(@Nullable String str) {
        this.prefix = str;
    }

    public final void setShowText(@Nullable String str) {
        this.showText = str;
    }

    public final void setText(@Nullable String str) {
        this.text = str;
    }

    public final void setType(int i7) {
        this.type = i7;
    }
}
