package com.bilibili.sistersplayer.hls;

import Hr.l;
import androidx.compose.ui.text.font.C4496a;
import com.bilibili.sistersplayer.p2p.utils.P2PLogger;
import com.bilibili.sistersplayer.p2p.utils.PLog;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/hls/BasicM3u8Parser.class */
public final class BasicM3u8Parser {
    public static final int PARSED_AS_MASTER = 1;
    public static final int PARSED_ERROR_INIT = -2;
    public static final int PARSED_ERROR_VERSION = -1;
    public static final int PARSED_OK = 0;

    @NotNull
    public static final String TAG = "BasicM3u8Parser";

    @NotNull
    private static final String TAG_BILI_AUX = "#EXT-BILI-AUX";

    @NotNull
    private static final String TAG_BILI_CONTENTS_TEERING = "#EXT-X-CONTENT-STEERING";

    @NotNull
    private static final String TAG_ENDLIST = "#EXT-X-ENDLIST";

    @NotNull
    private static final String TAG_INIT_SEGMENT = "#EXT-X-MAP";

    @NotNull
    private static final String TAG_MEDIA_DURATION = "#EXTINF";

    @NotNull
    private static final String TAG_MEDIA_SEQUENCE = "#EXT-X-MEDIA-SEQUENCE";

    @NotNull
    private static final String TAG_STREAM_INF = "#EXT-X-STREAM-INF";

    @NotNull
    private static final String TAG_VERSION = "#EXT-X-VERSION";
    private long _lastSeq;
    private boolean endOfStream;

    @NotNull
    private final P2PLogger logger;
    private long nextSequence;
    private long sequence;
    private int version;

    @NotNull
    public static final Companion Companion = new Companion(null);
    private static final Pattern REGEX_MEDIA_DURATION = Pattern.compile("#EXTINF:([\\d\\.]+)\\b");
    private static final Pattern REGEX_MEDIA_TITLE = Pattern.compile("#EXTINF:[\\d\\.]+\\b,(.+)");
    private static final Pattern REGEX_BILI_AUX = Pattern.compile("#EXT-BILI-AUX:(.*)");
    private static final Pattern REGEX_VERSION = Pattern.compile("#EXT-X-VERSION:(\\d+)\\b");
    private static final Pattern REGEX_MEDIA_SEQUENCE = Pattern.compile("#EXT-X-MEDIA-SEQUENCE:(\\d+)\\b");
    private static final Pattern REGEX_URI = Pattern.compile("URI=\"(.+?)\"");

    @NotNull
    private static final String BOOLEAN_TRUE = "YES";

    @NotNull
    private static final String BOOLEAN_FALSE = "NO";
    private static final Pattern REGEX_VARIABLE_REFERENCE = Pattern.compile("\\{\\$([a-zA-Z0-9\\-_]+)\\}");

    @Nullable
    private HashMap<String, String> steering = new HashMap<>();

    @NotNull
    private List<PlaylistItem> files = new ArrayList();

    @NotNull
    private List<String> streams = new ArrayList();

    @NotNull
    private ArrayList<HashMap<String, String>> streamInfMaps = new ArrayList<>();

    @NotNull
    private String _lastFragment = "";

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/hls/BasicM3u8Parser$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final Pattern compileBooleanAttrPattern(String str) {
            StringBuilder sbA = l.a(str, "=(", BasicM3u8Parser.BOOLEAN_FALSE, "|", BasicM3u8Parser.BOOLEAN_TRUE);
            sbA.append(")");
            return Pattern.compile(sbA.toString());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final double parseDoubleAttr(String str, Pattern pattern) {
            return Double.parseDouble(parseStringAttr(str, pattern, MapsKt.emptyMap()));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int parseIntAttr(String str, Pattern pattern) {
            return Integer.parseInt(parseStringAttr(str, pattern, MapsKt.emptyMap()));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final long parseLongAttr(String str, Pattern pattern) {
            return Long.parseLong(parseStringAttr(str, pattern, MapsKt.emptyMap()));
        }

        private final boolean parseOptionalBooleanAttribute(String str, Pattern pattern, boolean z6) {
            Matcher matcher = pattern.matcher(str);
            if (matcher.find()) {
                z6 = Intrinsics.areEqual(BasicM3u8Parser.BOOLEAN_TRUE, matcher.group(1));
            }
            return z6;
        }

        private final int parseOptionalIntAttr(String str, Pattern pattern, int i7) {
            Matcher matcher = pattern.matcher(str);
            int i8 = i7;
            if (matcher.find()) {
                String strGroup = matcher.group(1);
                i8 = i7;
                if (strGroup != null) {
                    i8 = Integer.parseInt(strGroup);
                }
            }
            return i8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String parseOptionalStringAttr(String str, Pattern pattern, String str2, Map<String, String> map) {
            Matcher matcher = pattern.matcher(str);
            if (matcher.find()) {
                str2 = matcher.group(1);
            }
            String strReplaceVariableReferences = str2;
            if (map != null) {
                strReplaceVariableReferences = map.isEmpty() ? str2 : replaceVariableReferences(str2, map);
            }
            return strReplaceVariableReferences;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String parseStringAttr(String str, Pattern pattern, Map<String, String> map) {
            return parseOptionalStringAttr(str, pattern, "", map);
        }

        private final String replaceVariableReferences(String str, Map<String, String> map) {
            Matcher matcher = BasicM3u8Parser.REGEX_VARIABLE_REFERENCE.matcher(str);
            StringBuffer stringBuffer = new StringBuffer();
            while (matcher.find()) {
                String strGroup = matcher.group(1);
                if (map != null && map.containsKey(strGroup)) {
                    matcher.appendReplacement(stringBuffer, Matcher.quoteReplacement(map.get(strGroup)));
                }
            }
            matcher.appendTail(stringBuffer);
            return stringBuffer.toString();
        }

        public static /* synthetic */ PlaylistItem seekPTS$default(Companion companion, List list, long j7, boolean z6, P2PLogger p2PLogger, int i7, Object obj) {
            if ((i7 & 4) != 0) {
                z6 = true;
            }
            return companion.seekPTS(list, j7, z6, p2PLogger);
        }

        @Nullable
        public final PlaylistItem keepLastTimeGOP(@NotNull List<PlaylistItem> list, int i7, @NotNull P2PLogger p2PLogger) {
            ListIterator<PlaylistItem> listIterator = list.listIterator(list.size());
            boolean z6 = false;
            long j7 = 0;
            PlaylistItem playlistItem = null;
            boolean z7 = false;
            while (listIterator.hasPrevious()) {
                PlaylistItem playlistItemPrevious = listIterator.previous();
                if (!z6) {
                    Long duration = playlistItemPrevious.getDuration();
                    long jLongValue = j7 + (duration != null ? duration.longValue() : 0L);
                    if (Intrinsics.areEqual(playlistItemPrevious.getAux().getKeyframe(), "K")) {
                        j7 = jLongValue;
                        if (jLongValue >= i7) {
                            P2PLogger.logI$default(p2PLogger, BasicM3u8Parser.TAG, androidx.core.content.c.b(jLongValue, "keepLastTimeGOP keyFrame ", playlistItemPrevious.getName(), " timeRemaining = "), null, 4, null);
                            playlistItem = playlistItemPrevious;
                            z6 = true;
                            j7 = jLongValue;
                        }
                    } else {
                        j7 = jLongValue;
                    }
                } else if (!playlistItemPrevious.isInit() || z7) {
                    P2PLogger.logI$default(p2PLogger, BasicM3u8Parser.TAG, "keepLastTimeGOP remove " + playlistItemPrevious.getName() + " " + playlistItemPrevious.getDuration() + " " + playlistItemPrevious.getAux().getPts(), null, 4, null);
                    listIterator.remove();
                } else {
                    P2PLogger.logI$default(p2PLogger, BasicM3u8Parser.TAG, C4496a.a("keepLastTimeGOP keep head ", playlistItemPrevious.getName()), null, 4, null);
                    z7 = true;
                }
            }
            return playlistItem;
        }

        @Nullable
        public final PlaylistItem seekPTS(@NotNull List<PlaylistItem> list, long j7, boolean z6, @NotNull P2PLogger p2PLogger) {
            if (j7 <= 0) {
                return keepLastTimeGOP(list, 0, p2PLogger);
            }
            ListIterator<PlaylistItem> listIterator = list.listIterator(list.size());
            PlaylistItem playlistItem = null;
            boolean z7 = false;
            boolean z8 = false;
            while (listIterator.hasPrevious()) {
                PlaylistItem playlistItemPrevious = listIterator.previous();
                if (z7) {
                    if (!playlistItemPrevious.isInit() || z8) {
                        P2PLogger.logI$default(p2PLogger, BasicM3u8Parser.TAG, "seekPTS remove " + playlistItemPrevious.getName() + " " + playlistItemPrevious.getDuration() + " " + playlistItemPrevious.getAux().getPts(), null, 4, null);
                        listIterator.remove();
                    } else {
                        P2PLogger.logI$default(p2PLogger, BasicM3u8Parser.TAG, C4496a.a("seekPTS keep head ", playlistItemPrevious.getName()), null, 4, null);
                        z8 = true;
                    }
                } else if (Intrinsics.areEqual(playlistItemPrevious.getAux().getKeyframe(), "K") || !z6) {
                    Long pts = playlistItemPrevious.getAux().getPts();
                    if ((pts != null ? pts.longValue() : 0L) >= j7) {
                        P2PLogger.logI$default(p2PLogger, BasicM3u8Parser.TAG, "seekPTS keyFrame " + playlistItemPrevious.getName() + " " + playlistItemPrevious.getAux().getPts(), null, 4, null);
                        playlistItem = playlistItemPrevious;
                        z7 = true;
                    }
                }
            }
            return !z7 ? keepLastTimeGOP(list, 0, p2PLogger) : playlistItem;
        }
    }

    static {
        PLog.INSTANCE.getTags().put(TAG, Boolean.TRUE);
    }

    public BasicM3u8Parser(@NotNull P2PLogger p2PLogger) {
        this.logger = p2PLogger;
    }

    public final void clear() {
        this.streamInfMaps.clear();
        this.streams.clear();
        this.files.clear();
        HashMap<String, String> map = this.steering;
        if (map != null) {
            map.clear();
        }
        this.endOfStream = false;
        this.nextSequence = 0L;
        this.sequence = 0L;
        this.version = 0;
    }

    public final boolean getEndOfStream() {
        return this.endOfStream;
    }

    @NotNull
    public final List<PlaylistItem> getFiles() {
        return this.files;
    }

    public final long getNextSequence() {
        return this.nextSequence;
    }

    public final long getSequence() {
        return this.sequence;
    }

    @Nullable
    public final HashMap<String, String> getSteering() {
        return this.steering;
    }

    @NotNull
    public final ArrayList<HashMap<String, String>> getStreamInfMaps() {
        return this.streamInfMaps;
    }

    @NotNull
    public final List<String> getStreams() {
        return this.streams;
    }

    public final int getVersion() {
        return this.version;
    }

    public final int parse(@NotNull String str, @NotNull String str2) {
        char c7;
        HashMap<String, String> multiKV = null;
        HashMap<String, String> multiKV2 = null;
        while (true) {
            String optionalStringAttr = "";
            String optionalStringAttr2 = "";
            char c8 = 0;
            long doubleAttr = 0;
            for (String str3 : StringsKt.lines(str)) {
                if (str3.length() == 0) {
                    c7 = c8;
                } else if (StringsKt.Z(str3, TAG_MEDIA_DURATION)) {
                    Companion companion = Companion;
                    doubleAttr = (long) (companion.parseDoubleAttr(str3, REGEX_MEDIA_DURATION) * ((double) 1000));
                    optionalStringAttr2 = companion.parseOptionalStringAttr(str3, REGEX_MEDIA_TITLE, "", null);
                    c8 = 1;
                } else if (StringsKt.Z(str3, TAG_BILI_AUX)) {
                    optionalStringAttr = Companion.parseOptionalStringAttr(str3, REGEX_BILI_AUX, "", null);
                } else if (StringsKt.Z(str3, TAG_VERSION)) {
                    this.version = Companion.parseIntAttr(str3, REGEX_VERSION);
                    c7 = c8;
                } else if (StringsKt.Z(str3, TAG_MEDIA_SEQUENCE)) {
                    long longAttr = Companion.parseLongAttr(str3, REGEX_MEDIA_SEQUENCE);
                    this.sequence = longAttr;
                    this.nextSequence = longAttr;
                    c7 = c8;
                } else if (StringsKt.Z(str3, TAG_INIT_SEGMENT)) {
                    String string = StringsKt.trim(Companion.parseStringAttr(str3, REGEX_URI, null)).toString();
                    if (string.length() == 0) {
                        P2PLogger.logE$default(this.logger, TAG, "wrong ".concat(str3), null, 4, null);
                        return -2;
                    }
                    this.files.add(new PlaylistItem(string, string, null, new Title(""), new BiLiAUX(""), true, null, str2));
                    c7 = c8;
                } else if (StringsKt.Z(str3, TAG_STREAM_INF)) {
                    multiKV = parseMultiKV(str3);
                    c8 = 2;
                } else if (StringsKt.Z(str3, TAG_BILI_CONTENTS_TEERING)) {
                    multiKV2 = parseMultiKV(str3);
                } else if (Intrinsics.areEqual(str3, TAG_ENDLIST)) {
                    this.endOfStream = true;
                    c7 = c8;
                } else {
                    if (c8 == 1) {
                        break;
                    }
                    c7 = c8;
                    if (c8 == 2) {
                        this.streams.add(str3);
                        if (multiKV != null) {
                            this.streamInfMaps.add(multiKV);
                        }
                        this.steering = multiKV2;
                        c7 = 0;
                    }
                }
                c8 = c7;
            }
            return 0;
            long j7 = this.nextSequence;
            this.nextSequence = j7 + 1;
            this._lastSeq = j7;
            String string2 = StringsKt.trim(str3).toString();
            this._lastFragment = string2;
            this.files.add(new PlaylistItem(string2, string2, Long.valueOf(doubleAttr), new Title(optionalStringAttr2), new BiLiAUX(optionalStringAttr), false, Long.valueOf(this._lastSeq), str2));
        }
    }

    @NotNull
    public final HashMap<String, String> parseMultiKV(@NotNull String str) {
        HashMap<String, String> map = new HashMap<>();
        Iterator it = Regex.findAll$default(new Regex("(\\w+(?:-\\w+)*)=(\"[^\"]+\"|\\w+)"), str, 0, 2, (Object) null).iterator();
        while (it.hasNext()) {
            MatchResult.Destructured destructured = ((MatchResult) it.next()).getDestructured();
            map.put((String) destructured.getMatch().getGroupValues().get(1), StringsKt.trim((String) destructured.getMatch().getGroupValues().get(2), new char[]{'\"'}));
        }
        return map;
    }

    public final void setEndOfStream(boolean z6) {
        this.endOfStream = z6;
    }

    public final void setFiles(@NotNull List<PlaylistItem> list) {
        this.files = list;
    }

    public final void setNextSequence(long j7) {
        this.nextSequence = j7;
    }

    public final void setSequence(long j7) {
        this.sequence = j7;
    }

    public final void setSteering(@Nullable HashMap<String, String> map) {
        this.steering = map;
    }

    public final void setStreamInfMaps(@NotNull ArrayList<HashMap<String, String>> arrayList) {
        this.streamInfMaps = arrayList;
    }

    public final void setStreams(@NotNull List<String> list) {
        this.streams = list;
    }

    public final void setVersion(int i7) {
        this.version = i7;
    }
}
