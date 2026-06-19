package com.bilibili.biligame.api.comment;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.biligame.utils.NumberExtensionsKt;
import com.bilibili.bplus.followinglist.opus.h;
import com.bilibili.bplus.im.customer.q;
import com.bilibili.live.streaming.source.TextSource;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/comment/CommentTopNotice.class */
@StabilityInferred(parameters = 0)
@Keep
public class CommentTopNotice {
    public static final int $stable = 8;

    @NotNull
    public static final a Companion = new Object();

    @NotNull
    public static final String SP_KEY_COMMENT_NOTICE_PREFIX = "key_comment_notice_prefix_";

    @JSONField(name = TextSource.CFG_CONTENT)
    @Nullable
    private String content;

    @Nullable
    private String gameBaseId;

    @JSONField(name = "id")
    private long id;

    @JSONField(name = "landing_page")
    @Nullable
    private String url;

    @JSONField(name = "is_show_official")
    private int showOfficial = 1;

    @NotNull
    private final Lazy spKey$delegate = LazyKt.lazy(new q(this, 5));

    @NotNull
    private final Lazy reportParams$delegate = LazyKt.lazy(new h(this, 2));

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/comment/CommentTopNotice$a.class */
    public static final class a {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map reportParams_delegate$lambda$0(CommentTopNotice commentTopNotice) {
        String str = commentTopNotice.gameBaseId;
        String str2 = str;
        if (str == null) {
            str2 = "";
        }
        Pair pair = TuplesKt.to("game_base_id", str2);
        Pair pair2 = TuplesKt.to("banner_id", String.valueOf(commentTopNotice.id));
        String str3 = commentTopNotice.content;
        String str4 = str3;
        if (str3 == null) {
            str4 = "";
        }
        Pair pair3 = TuplesKt.to("banner_content", str4);
        Pair pair4 = TuplesKt.to("system_type", "1");
        String str5 = commentTopNotice.url;
        if (str5 == null) {
            str5 = "";
        }
        return MapsKt.mapOf(new Pair[]{pair, pair2, pair3, pair4, TuplesKt.to("page_url", str5)});
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String spKey_delegate$lambda$0(CommentTopNotice commentTopNotice) {
        return SP_KEY_COMMENT_NOTICE_PREFIX + commentTopNotice.id + com.bilibili.adcommon.utils.a.a();
    }

    @Nullable
    public final String getContent() {
        return this.content;
    }

    @Nullable
    public final String getGameBaseId() {
        return this.gameBaseId;
    }

    public final long getId() {
        return this.id;
    }

    @NotNull
    public final Map<String, String> getReportParams() {
        return (Map) this.reportParams$delegate.getValue();
    }

    public final int getShowOfficial() {
        return this.showOfficial;
    }

    @NotNull
    public final String getSpKey() {
        return (String) this.spKey$delegate.getValue();
    }

    @Nullable
    public final String getUrl() {
        return this.url;
    }

    public final boolean isHighPriority() {
        return !NumberExtensionsKt.toBoolean(Integer.valueOf(this.showOfficial));
    }

    public final boolean isValid() {
        String str = this.content;
        return !(str == null || StringsKt.isBlank(str));
    }

    public final void setContent(@Nullable String str) {
        this.content = str;
    }

    public final void setGameBaseId(@Nullable String str) {
        this.gameBaseId = str;
    }

    public final void setId(long j7) {
        this.id = j7;
    }

    public final void setShowOfficial(int i7) {
        this.showOfficial = i7;
    }

    public final void setUrl(@Nullable String str) {
        this.url = str;
    }
}
