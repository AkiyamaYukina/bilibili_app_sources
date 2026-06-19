package com.bilibili.sistersplayer.p2p.utils;

import androidx.compose.ui.text.font.C4496a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import kotlin.text.MatchGroup;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/utils/UrlUtils.class */
public final class UrlUtils {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static final String TAG = "UrlUtils";

    @NotNull
    private final P2PLogger logger;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/utils/UrlUtils$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/utils/UrlUtils$UrlParseResult.class */
    public static final class UrlParseResult {

        @NotNull
        private final String domain;

        @NotNull
        private final String httpType;
        private final boolean ok;

        @NotNull
        private final String parseMsg;

        @NotNull
        private final String queryParams;

        @NotNull
        private final String streamName;

        public UrlParseResult(boolean z6, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
            this.ok = z6;
            this.parseMsg = str;
            this.httpType = str2;
            this.domain = str3;
            this.streamName = str4;
            this.queryParams = str5;
        }

        @NotNull
        public final String getDomain() {
            return this.domain;
        }

        @NotNull
        public final String getHttpType() {
            return this.httpType;
        }

        public final boolean getOk() {
            return this.ok;
        }

        @NotNull
        public final String getParseMsg() {
            return this.parseMsg;
        }

        @NotNull
        public final String getQueryParams() {
            return this.queryParams;
        }

        @NotNull
        public final String getStreamName() {
            return this.streamName;
        }
    }

    static {
        PLog.INSTANCE.getTags().put(TAG, Boolean.TRUE);
    }

    public UrlUtils(@NotNull P2PLogger p2PLogger) {
        this.logger = p2PLogger;
    }

    @NotNull
    public final String parseDomain(@NotNull String str) {
        MatchGroup matchGroup;
        try {
            Sequence sequenceFindAll$default = Regex.findAll$default(new Regex("\\w*://([^/]*)/.*"), str, 0, 2, (Object) null);
            if (SequencesKt.count(sequenceFindAll$default) <= 0 || (matchGroup = ((MatchResult) SequencesKt.first(sequenceFindAll$default)).getGroups().get(1)) == null) {
                return "";
            }
            String value = matchGroup.getValue();
            return value != null ? value : "";
        } catch (Exception e7) {
            this.logger.logE(TAG, "[LiveP2PProblem][m3u8_error=parseUrlDomain]" + e7.getMessage(), e7);
            return "";
        }
    }

    @NotNull
    public final String parseHttpType(@NotNull String str) {
        MatchGroup matchGroup;
        try {
            Sequence sequenceFindAll$default = Regex.findAll$default(new Regex("(\\w*)://.*"), str, 0, 2, (Object) null);
            if (SequencesKt.count(sequenceFindAll$default) <= 0 || (matchGroup = ((MatchResult) SequencesKt.first(sequenceFindAll$default)).getGroups().get(1)) == null) {
                return "";
            }
            String value = matchGroup.getValue();
            return value != null ? value : "";
        } catch (Exception e7) {
            this.logger.logE(TAG, "[LiveP2PProblem][m3u8_error=parseHttpType]" + e7.getMessage(), e7);
            return "";
        }
    }

    @NotNull
    public final String parseParams(@NotNull String str) {
        MatchGroup matchGroup;
        try {
            MatchResult matchResultFind$default = Regex.find$default(new Regex("\\?(.*)"), str, 0, 2, (Object) null);
            if (matchResultFind$default == null || matchResultFind$default.getGroups().isEmpty() || (matchGroup = matchResultFind$default.getGroups().get(0)) == null) {
                return "";
            }
            String value = matchGroup.getValue();
            return value != null ? value : "";
        } catch (Exception e7) {
            this.logger.logE(TAG, "[LiveP2PProblem][m3u8_error=parseParams]" + e7.getMessage(), e7);
            return "";
        }
    }

    @Nullable
    public final String parseStreamName(@NotNull String str) {
        MatchGroup matchGroup;
        try {
            Sequence sequenceFindAll$default = Regex.findAll$default(new Regex("\\/(live_.*?)(\\/|\\.(flv|m3u8|mpd))"), str, 0, 2, (Object) null);
            if (SequencesKt.count(sequenceFindAll$default) <= 0 || (matchGroup = ((MatchResult) SequencesKt.first(sequenceFindAll$default)).getGroups().get(1)) == null) {
                return null;
            }
            String value = matchGroup.getValue();
            if (value != null) {
                return value;
            }
            return null;
        } catch (Exception e7) {
            this.logger.logE(TAG, "[LiveP2PProblem][m3u8_error=parseStreamName]" + e7.getMessage(), e7);
            return null;
        }
    }

    @NotNull
    public final UrlParseResult parseUrl(@NotNull String str) {
        String streamName = parseStreamName(str);
        String str2 = streamName;
        if (streamName == null) {
            str2 = "";
        }
        String params = parseParams(str);
        String httpType = parseHttpType(str);
        String domain = parseDomain(str);
        if (str2.length() != 0 && params.length() != 0 && httpType.length() != 0 && domain.length() != 0) {
            return new UrlParseResult(true, "ok", httpType, domain, str2, params);
        }
        P2PLogger.logE$default(this.logger, TAG, C4496a.a("[LiveP2PProblem][m3u8_error=parseUrl]", str), null, 4, null);
        return new UrlParseResult(false, "parse error", httpType, domain, str2, params);
    }
}
