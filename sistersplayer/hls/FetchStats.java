package com.bilibili.sistersplayer.hls;

import androidx.fragment.app.D;
import androidx.media3.common.G;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/hls/FetchStats.class */
public final class FetchStats {

    @NotNull
    public static final Companion Companion = new Companion(null);
    private static final Pattern REGEX_FILENAME = Pattern.compile("(?:index\\.m3u8|[^\\/]+\\.m4s)(?=\\?)");
    private final int dataSize;
    private final long duration;
    private final int httpCode;

    @NotNull
    private final String msg;
    private final boolean ok;

    @NotNull
    private final String url;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/hls/FetchStats$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public FetchStats(@NotNull String str, int i7, boolean z6, @NotNull String str2, int i8, long j7) {
        this.url = str;
        this.dataSize = i7;
        this.ok = z6;
        this.msg = str2;
        this.httpCode = i8;
        this.duration = j7;
    }

    public final int getDataSize() {
        return this.dataSize;
    }

    public final long getDuration() {
        return this.duration;
    }

    public final int getHttpCode() {
        return this.httpCode;
    }

    @NotNull
    public final String getMsg() {
        return this.msg;
    }

    public final boolean getOk() {
        return this.ok;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    @NotNull
    public String toString() {
        Matcher matcher = REGEX_FILENAME.matcher(this.url);
        String strGroup = matcher.find() ? matcher.group() : this.url;
        int i7 = this.httpCode;
        long j7 = this.duration;
        int i8 = this.dataSize;
        String str = this.msg;
        StringBuilder sb = new StringBuilder();
        sb.append(strGroup);
        sb.append("#");
        sb.append(i7);
        sb.append("-");
        G.a(i8, j7, "ms-", sb);
        return D.a("B, '", str, "'", sb);
    }
}
