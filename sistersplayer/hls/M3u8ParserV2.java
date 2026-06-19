package com.bilibili.sistersplayer.hls;

import G.p;
import androidx.appcompat.widget.C3259x;
import androidx.compose.runtime.snapshots.z;
import androidx.compose.ui.text.font.C4496a;
import com.bilibili.sistersplayer.hls.BasicM3u8Parser;
import com.bilibili.sistersplayer.hls.model.HLSStreamInf;
import com.bilibili.sistersplayer.p2p.utils.P2PLogger;
import com.bilibili.sistersplayer.p2p.utils.PLog;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/hls/M3u8ParserV2.class */
public final class M3u8ParserV2 {

    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int PARSED_AS_MASTER = 1;
    public static final int PARSED_ERROR_INIT = -2;
    public static final int PARSED_ERROR_VERSION = -1;
    public static final int PARSED_OK = 0;

    @NotNull
    public static final String TAG = "M3u8ParserV2";
    public static final int URL_UN_INIT = -3;
    private long _lastSeq;
    private boolean _needTrimStart;

    @Nullable
    private NextPlaylist _nextPlaylist;
    private long _nextSequence;

    @NotNull
    private String _queryParams;

    @NotNull
    private String _relativePath;
    private long _remainDuration;
    private int _totalCount;
    private long _totalDuration;

    @Nullable
    private String _url;
    private boolean endOfStream;

    @NotNull
    private final P2PLogger logger;

    @NotNull
    private final List<String> m4sQueryParams;

    @Nullable
    private Function1<? super PlaylistItem, Unit> onPlaylistUpdate;

    @Nullable
    private Function3<? super Boolean, ? super String, ? super String, Unit> onSwitchBack;

    @Nullable
    private Function4<? super Boolean, ? super String, ? super HLSStreamInf, ? super PlaylistItem, Unit> onSwitchToNextPlaylist;
    private final int trimStartKeepTimeMs;

    @Nullable
    private HashMap<String, String> steering = new HashMap<>();

    @NotNull
    private List<String> streamUrls = new ArrayList();

    @NotNull
    private ArrayList<HashMap<String, String>> streamInfMaps = new ArrayList<>();

    @NotNull
    private final Set<String> _initUris = new LinkedHashSet();

    @NotNull
    private String _lastUri = "";

    @NotNull
    private List<PlaylistItem> _dataUrls = new ArrayList();

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/hls/M3u8ParserV2$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        PLog.INSTANCE.getTags().put(TAG, Boolean.TRUE);
    }

    public M3u8ParserV2(int i7, @NotNull P2PLogger p2PLogger) {
        this.trimStartKeepTimeMs = i7;
        this.logger = p2PLogger;
        this._needTrimStart = i7 > 0;
        this._relativePath = "";
        this._queryParams = "";
        this.m4sQueryParams = CollectionsKt.mutableListOf(new String[]{"trid"});
    }

    private final void _appendEntry(PlaylistItem playlistItem) {
        playlistItem.setUri(buildM4sUrl(playlistItem.getName()));
        this._dataUrls.add(playlistItem);
        Function1<? super PlaylistItem, Unit> function1 = this.onPlaylistUpdate;
        if (function1 != null) {
            function1.invoke(playlistItem);
        }
        long j7 = this._remainDuration;
        Long duration = playlistItem.getDuration();
        this._remainDuration = j7 + (duration != null ? duration.longValue() : 0L);
        this._totalCount++;
        long j8 = this._totalDuration;
        Long duration2 = playlistItem.getDuration();
        long jLongValue = 0;
        if (duration2 != null) {
            jLongValue = duration2.longValue();
        }
        this._totalDuration = j8 + jLongValue;
    }

    public static /* synthetic */ int _mergeNextList$default(M3u8ParserV2 m3u8ParserV2, BasicM3u8Parser basicM3u8Parser, boolean z6, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            z6 = false;
        }
        return m3u8ParserV2._mergeNextList(basicM3u8Parser, z6);
    }

    private final boolean _removeEntries(int i7) {
        if (i7 > this._dataUrls.size()) {
            return false;
        }
        int size = this._dataUrls.size();
        for (int i8 = i7; i8 < size; i8++) {
            PlaylistItem playlistItem = this._dataUrls.get(i8);
            long j7 = this._remainDuration;
            Long duration = playlistItem.getDuration();
            this._remainDuration = j7 - (duration != null ? duration.longValue() : 0L);
            this._totalCount--;
            long j8 = this._totalDuration;
            Long duration2 = playlistItem.getDuration();
            long jLongValue = 0;
            if (duration2 != null) {
                jLongValue = duration2.longValue();
            }
            this._totalDuration = j8 - jLongValue;
        }
        long j9 = size - i7;
        this._nextSequence -= j9;
        this._lastSeq -= j9;
        this._dataUrls.subList(i7, size).clear();
        return true;
    }

    private final String buildM4sUrl(String str) {
        String string = StringsKt.A(StringsKt.trim(str).toString(), "://", 0, false, 6) != -1 ? StringsKt.trim(str).toString() : p.a(this._relativePath, StringsKt.trim(str).toString());
        String strA = string;
        if (this._queryParams.length() > 0) {
            strA = p.a(string, StringsKt.A(str, "?", 0, false, 6) != -1 ? C4496a.a("&", this._queryParams.substring(1)) : this._queryParams);
        }
        return strA;
    }

    public final boolean _doPlaylistSwitch() {
        Integer numValueOf;
        Integer num;
        Integer numValueOf2;
        NextPlaylist nextPlaylist = this._nextPlaylist;
        if (nextPlaylist == null) {
            return false;
        }
        BasicM3u8Parser parser = nextPlaylist.getParser();
        HLSStreamInf streamInf = nextPlaylist.getStreamInf();
        int size = parser.getFiles().size();
        int i7 = 0;
        Integer num2 = null;
        Integer num3 = null;
        while (true) {
            Integer num4 = num3;
            numValueOf = num2;
            num = num4;
            if (i7 >= size) {
                break;
            }
            PlaylistItem playlistItem = parser.getFiles().get(i7);
            Integer num5 = num2;
            Integer num6 = num4;
            if (playlistItem.getSeq() != null) {
                num5 = num2;
                num6 = num4;
                if (Intrinsics.areEqual(playlistItem.getAux().getKeyframe(), "K")) {
                    if (playlistItem.getAux().getPts() != null) {
                        numValueOf = Integer.valueOf(i7);
                        int size2 = this._dataUrls.size();
                        int i8 = 0;
                        while (true) {
                            numValueOf2 = num4;
                            if (i8 >= size2) {
                                break;
                            }
                            Long pts = this._dataUrls.get(i8).getAux().getPts();
                            if (pts != null) {
                                long jLongValue = pts.longValue();
                                Long pts2 = playlistItem.getAux().getPts();
                                if (pts2 != null) {
                                    long jLongValue2 = pts2.longValue();
                                    if (jLongValue == jLongValue2) {
                                        numValueOf2 = Integer.valueOf(i8);
                                        P2PLogger p2PLogger = this.logger;
                                        StringBuilder sbA = z.a(jLongValue, "localPts= ", " remotePts= ");
                                        sbA.append(jLongValue2);
                                        P2PLogger.logI$default(p2PLogger, TAG, sbA.toString(), null, 4, null);
                                        break;
                                    }
                                } else {
                                    continue;
                                }
                            }
                            i8++;
                        }
                        num5 = numValueOf;
                        num6 = numValueOf2;
                        if (numValueOf2 != null) {
                            num = numValueOf2;
                            break;
                        }
                    } else {
                        num5 = num2;
                        num6 = num4;
                    }
                } else {
                    continue;
                }
            }
            i7++;
            num2 = num5;
            num3 = num6;
        }
        for (PlaylistItem playlistItem2 : parser.getFiles()) {
            P2PLogger.logI$default(this.logger, TAG, "remote:" + playlistItem2.getName() + " " + playlistItem2.getTitle() + " " + playlistItem2.getAux().getKeyframe() + " " + playlistItem2.getAux().getPts(), null, 4, null);
        }
        for (PlaylistItem playlistItem3 : this._dataUrls) {
            P2PLogger.logI$default(this.logger, TAG, "local:" + playlistItem3.getName() + " " + playlistItem3.getTitle() + " " + playlistItem3.getAux().getKeyframe() + " " + playlistItem3.getAux().getPts(), null, 4, null);
        }
        P2PLogger.logI$default(this.logger, TAG, "find remote count " + parser.getFiles().size() + " index: " + numValueOf + ", local count " + this._dataUrls.size() + " index: " + num, null, 4, null);
        if (numValueOf == null) {
            P2PLogger.logW$default(this.logger, TAG, "findRemoteIndex == null no switch point found " + streamInf, null, 4, null);
            return false;
        }
        PlaylistItem playlistItem4 = parser.getFiles().get(numValueOf.intValue());
        if (num == null) {
            return false;
        }
        _removeEntries(num.intValue());
        String str = this._url;
        String str2 = str;
        if (str == null) {
            str2 = "";
        }
        setUrl(streamInf.getUrl());
        Long seq = playlistItem4.getSeq();
        this._nextSequence = seq != null ? seq.longValue() : 0L;
        boolean z6 = _mergeNextList$default(this, parser, false, 2, null) == 0;
        Function4<? super Boolean, ? super String, ? super HLSStreamInf, ? super PlaylistItem, Unit> function4 = this.onSwitchToNextPlaylist;
        if (function4 != null) {
            function4.invoke(Boolean.valueOf(z6), str2, streamInf, playlistItem4);
        }
        P2PLogger.logI$default(this.logger, TAG, "switch to next playlist: " + streamInf, null, 4, null);
        return true;
    }

    public final boolean _doPlaylistSwitchSeek(boolean z6, boolean z7) {
        Integer numValueOf;
        PlaylistItem playlistItem;
        BiLiAUX aux;
        BiLiAUX aux2;
        Long pts;
        Integer num;
        Integer num2;
        BasicM3u8Parser basicM3u8Parser;
        Long pts2;
        NextPlaylist nextPlaylist = this._nextPlaylist;
        if (nextPlaylist == null) {
            return false;
        }
        BasicM3u8Parser parser = nextPlaylist.getParser();
        HLSStreamInf streamInf = nextPlaylist.getStreamInf();
        int size = parser.getFiles().size();
        int i7 = 0;
        Integer num3 = null;
        Integer num4 = null;
        while (true) {
            numValueOf = num4;
            if (i7 >= size) {
                break;
            }
            PlaylistItem playlistItem2 = parser.getFiles().get(i7);
            if (playlistItem2.getSeq() != null && Intrinsics.areEqual(playlistItem2.getAux().getKeyframe(), "K") && playlistItem2.getAux().getPts() != null) {
                Integer numValueOf2 = Integer.valueOf(i7);
                int size2 = this._dataUrls.size();
                for (int i8 = 0; i8 < size2; i8++) {
                    PlaylistItem playlistItem3 = this._dataUrls.get(i8);
                    if (Intrinsics.areEqual(playlistItem3.getAux().getKeyframe(), "K") && (pts2 = playlistItem3.getAux().getPts()) != null) {
                        long jLongValue = pts2.longValue();
                        Long pts3 = playlistItem2.getAux().getPts();
                        if (pts3 != null) {
                            long jLongValue2 = pts3.longValue();
                            if (jLongValue == jLongValue2 || (z7 && Intrinsics.areEqual(playlistItem3.getSeq(), playlistItem2.getSeq()))) {
                                numValueOf = Integer.valueOf(i8);
                                P2PLogger p2PLogger = this.logger;
                                StringBuilder sbA = z.a(jLongValue, "localPts= ", " remotePts= ");
                                sbA.append(jLongValue2);
                                sbA.append(" ");
                                sbA.append(z7);
                                P2PLogger.logI$default(p2PLogger, TAG, sbA.toString(), null, 4, null);
                                break;
                            }
                        } else {
                            continue;
                        }
                    }
                }
                num = numValueOf2;
                num2 = numValueOf;
                basicM3u8Parser = parser;
                if (numValueOf != null) {
                    num3 = numValueOf2;
                    break;
                }
            } else {
                num = num3;
                num2 = numValueOf;
                basicM3u8Parser = parser;
            }
            i7++;
            parser = basicM3u8Parser;
            num3 = num;
            num4 = num2;
        }
        for (PlaylistItem playlistItem4 : parser.getFiles()) {
            P2PLogger.logI$default(this.logger, TAG, "remote:" + playlistItem4.getName() + " " + playlistItem4.getTitle() + " " + playlistItem4.getAux().getKeyframe() + " " + playlistItem4.getAux().getPts(), null, 4, null);
        }
        for (PlaylistItem playlistItem5 : this._dataUrls) {
            P2PLogger.logI$default(this.logger, TAG, "local:" + playlistItem5.getName() + " " + playlistItem5.getTitle() + " " + playlistItem5.getAux().getKeyframe() + " " + playlistItem5.getAux().getPts(), null, 4, null);
        }
        P2PLogger.logI$default(this.logger, TAG, "find remote count " + parser.getFiles().size() + " index: " + num3 + ", local count " + this._dataUrls.size() + " index: " + numValueOf, null, 4, null);
        if (num3 == null) {
            P2PLogger.logW$default(this.logger, TAG, "findRemoteIndex == null no switch point found " + streamInf, null, 4, null);
            return false;
        }
        PlaylistItem playlistItem6 = parser.getFiles().get(num3.intValue());
        if (numValueOf == null && z6) {
            PlaylistItem playlistItem7 = (PlaylistItem) CollectionsKt.firstOrNull(this._dataUrls);
            PlaylistItem playlistItemSeekPTS$default = BasicM3u8Parser.Companion.seekPTS$default(BasicM3u8Parser.Companion, parser.getFiles(), (playlistItem7 == null || (aux2 = playlistItem7.getAux()) == null || (pts = aux2.getPts()) == null) ? 0L : pts.longValue(), false, this.logger, 4, null);
            if (playlistItemSeekPTS$default == null) {
                P2PLogger.logW$default(this.logger, TAG, "findLocalIndex == null no switch point found " + streamInf, null, 4, null);
                return false;
            }
            this._dataUrls.clear();
            P2PLogger.logI$default(this.logger, TAG, " seek to last pts " + ((playlistItem7 == null || (aux = playlistItem7.getAux()) == null) ? null : aux.getPts()) + " ", null, 4, null);
            playlistItem = playlistItemSeekPTS$default;
        } else {
            if (numValueOf == null) {
                return false;
            }
            _removeEntries(numValueOf.intValue());
            playlistItem = playlistItem6;
        }
        String str = this._url;
        String str2 = str;
        if (str == null) {
            str2 = "";
        }
        setUrl(streamInf.getUrl());
        Long seq = playlistItem.getSeq();
        this._nextSequence = seq != null ? seq.longValue() : 0L;
        boolean z8 = _mergeNextList$default(this, parser, false, 2, null) == 0;
        Function4<? super Boolean, ? super String, ? super HLSStreamInf, ? super PlaylistItem, Unit> function4 = this.onSwitchToNextPlaylist;
        if (function4 != null) {
            function4.invoke(Boolean.valueOf(z8), str2, streamInf, playlistItem);
        }
        P2PLogger.logI$default(this.logger, TAG, "switch to next playlist: " + streamInf, null, 4, null);
        return true;
    }

    public final int _mergeNextList(@NotNull BasicM3u8Parser basicM3u8Parser, boolean z6) {
        boolean z7;
        boolean z8;
        this.endOfStream = basicM3u8Parser.getEndOfStream();
        boolean z9 = false;
        loop0: while (true) {
            z7 = z9;
            z8 = z7;
            for (PlaylistItem playlistItem : basicM3u8Parser.getFiles()) {
                if (playlistItem.getSeq() == null) {
                    if (!this._initUris.contains(playlistItem.getUri())) {
                        break;
                    }
                    z8 = true;
                }
            }
            z9 = true;
        }
        if (!z6 && !z8 && !basicM3u8Parser.getEndOfStream()) {
            P2PLogger.logE$default(this.logger, TAG, "missing #EXT-X-MAP URI", null, 4, null);
            return -2;
        }
        if (this._nextSequence == basicM3u8Parser.getNextSequence() && !z7) {
            return 0;
        }
        if (this._nextSequence == 0) {
            this._nextSequence = basicM3u8Parser.getSequence();
        }
        if (this._nextSequence < basicM3u8Parser.getSequence() && this._nextSequence + ((long) 30) >= basicM3u8Parser.getSequence() && this._lastUri.length() > 0) {
            P2PLogger p2PLogger = this.logger;
            long j7 = this._nextSequence;
            long sequence = basicM3u8Parser.getSequence();
            StringBuilder sbA = z.a(j7, "lost sequence: ", " -> ");
            sbA.append(sequence);
            P2PLogger.logW$default(p2PLogger, TAG, sbA.toString(), null, 4, null);
            long averageDuration = getAverageDuration();
            long sequence2 = basicM3u8Parser.getSequence() - 1;
            long j8 = this._nextSequence;
            if (j8 <= sequence2) {
                while (true) {
                    String strL = StringsKt.L(this._lastUri, String.valueOf(this._lastSeq), String.valueOf(sequence2));
                    if (strL.length() != 0) {
                        List<PlaylistItem> files = basicM3u8Parser.getFiles();
                        Title title = new Title("");
                        BiLiAUX biLiAUX = new BiLiAUX("");
                        String str = this._url;
                        if (str == null) {
                            str = "";
                        }
                        files.add(0, new PlaylistItem(strL, strL, Long.valueOf(averageDuration), title, biLiAUX, false, null, str));
                    }
                    if (sequence2 == j8) {
                        break;
                    }
                    sequence2--;
                }
            }
        }
        for (PlaylistItem playlistItem2 : basicM3u8Parser.getFiles()) {
            Long seq = playlistItem2.getSeq();
            if ((seq != null ? seq.longValue() : 0L) >= this._nextSequence || playlistItem2.getSeq() == null) {
                if (playlistItem2.getSeq() == null) {
                    if (!this._initUris.contains(playlistItem2.getUri())) {
                        this._initUris.add(playlistItem2.getUri());
                    }
                }
                if (playlistItem2.getDuration() == null) {
                    playlistItem2.setDuration(Long.valueOf(getAverageDuration()));
                }
                _appendEntry(playlistItem2);
            }
        }
        if (this._nextSequence >= basicM3u8Parser.getNextSequence()) {
            return 0;
        }
        this._nextSequence = basicM3u8Parser.getNextSequence();
        return 0;
    }

    public final void cancelSwitchToNextPlaylist() {
        this._nextPlaylist = null;
    }

    public final long getAverageDuration() {
        return this._totalCount > 0 ? (long) Math.floor((this._totalDuration * 1.0f) / r0) : 0L;
    }

    public final int getCount() {
        return this._dataUrls.size();
    }

    public final boolean getEndOfStream() {
        return this.endOfStream;
    }

    public final long getLastSequence() {
        long j7 = this._nextSequence;
        long j8 = 0;
        if (j7 > 0) {
            j8 = j7 - 1;
        }
        return j8;
    }

    @Nullable
    public final Function1<PlaylistItem, Unit> getOnPlaylistUpdate() {
        return this.onPlaylistUpdate;
    }

    @Nullable
    public final Function3<Boolean, String, String, Unit> getOnSwitchBack() {
        return this.onSwitchBack;
    }

    @Nullable
    public final Function4<Boolean, String, HLSStreamInf, PlaylistItem, Unit> getOnSwitchToNextPlaylist() {
        return this.onSwitchToNextPlaylist;
    }

    public final long getRemainDuration() {
        return this._remainDuration;
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
    public final List<String> getStreamUrls() {
        return this.streamUrls;
    }

    public final int parse(@NotNull String str) {
        NextPlaylist nextPlaylist;
        String str2 = this._url;
        if (str2 == null) {
            return -3;
        }
        BasicM3u8Parser basicM3u8Parser = new BasicM3u8Parser(this.logger);
        int i7 = basicM3u8Parser.parse(str, str2);
        if (i7 != 0) {
            return i7;
        }
        this.streamUrls = basicM3u8Parser.getStreams();
        this.streamInfMaps = basicM3u8Parser.getStreamInfMaps();
        this.steering = basicM3u8Parser.getSteering();
        if (this.streamUrls.size() > 0) {
            return 1;
        }
        if (basicM3u8Parser.getVersion() < 7) {
            P2PLogger.logE$default(this.logger, TAG, "wrong #EXT-X-VERSION: " + basicM3u8Parser + ".version", null, 4, null);
            return -1;
        }
        boolean pickSeq = false;
        if (this._needTrimStart) {
            this._needTrimStart = false;
            BasicM3u8Parser.Companion.keepLastTimeGOP(basicM3u8Parser.getFiles(), this.trimStartKeepTimeMs, this.logger);
        }
        int i_mergeNextList$default = _mergeNextList$default(this, basicM3u8Parser, false, 2, null);
        if (i_mergeNextList$default != 0) {
            return i_mergeNextList$default;
        }
        NextPlaylist nextPlaylist2 = this._nextPlaylist;
        if ((nextPlaylist2 == null || !nextPlaylist2.getSeek()) && ((nextPlaylist = this._nextPlaylist) == null || !nextPlaylist.getPickSeq())) {
            _doPlaylistSwitch();
        } else {
            NextPlaylist nextPlaylist3 = this._nextPlaylist;
            boolean seek = nextPlaylist3 != null ? nextPlaylist3.getSeek() : false;
            NextPlaylist nextPlaylist4 = this._nextPlaylist;
            if (nextPlaylist4 != null) {
                pickSeq = nextPlaylist4.getPickSeq();
            }
            _doPlaylistSwitchSeek(seek, pickSeq);
        }
        this._nextPlaylist = null;
        return i_mergeNextList$default;
    }

    public final boolean replaceM3u8(@NotNull String str, @NotNull BasicM3u8Parser basicM3u8Parser) {
        int i7;
        BiLiAUX aux;
        BiLiAUX aux2;
        PlaylistItem playlistItem = (PlaylistItem) CollectionsKt.firstOrNull(this._dataUrls);
        if (this._totalCount > 0 && playlistItem == null) {
            Function3<? super Boolean, ? super String, ? super String, Unit> function3 = this.onSwitchBack;
            if (function3 != null) {
                function3.invoke(Boolean.FALSE, this._url, str);
            }
            P2PLogger.logW$default(this.logger, TAG, C3259x.a(this._totalCount, "replaceM3u8 last is null,  _totalCount = "), null, 4, null);
            return false;
        }
        Iterator<T> it = basicM3u8Parser.getFiles().iterator();
        int i8 = 0;
        int i9 = -1;
        while (true) {
            i7 = i9;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (i8 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            PlaylistItem playlistItem2 = (PlaylistItem) next;
            int i10 = i7;
            if (Intrinsics.areEqual(playlistItem2.getAux().getPts(), (playlistItem == null || (aux2 = playlistItem.getAux()) == null) ? null : aux2.getPts())) {
                i10 = i7;
                if (!playlistItem2.isInit()) {
                    i10 = i7;
                    if (Intrinsics.areEqual((playlistItem == null || (aux = playlistItem.getAux()) == null) ? null : aux.getSize(), playlistItem2.getAux().getSize())) {
                        Long crc = null;
                        if (playlistItem != null) {
                            BiLiAUX aux3 = playlistItem.getAux();
                            crc = null;
                            if (aux3 != null) {
                                crc = aux3.getCrc();
                            }
                        }
                        i10 = i7;
                        if (Intrinsics.areEqual(crc, playlistItem2.getAux().getCrc())) {
                            i10 = i8;
                        }
                    }
                }
            }
            i8++;
            i9 = i10;
        }
        if (this._totalCount > 0 && i7 == -1) {
            Function3<? super Boolean, ? super String, ? super String, Unit> function32 = this.onSwitchBack;
            if (function32 != null) {
                function32.invoke(Boolean.FALSE, this._url, str);
            }
            P2PLogger.logW$default(this.logger, TAG, "replaceM3u8 finIndex is -1", null, 4, null);
            return false;
        }
        basicM3u8Parser.setFiles(CollectionsKt.toMutableList(basicM3u8Parser.getFiles().subList(i7 + 1, basicM3u8Parser.getFiles().size())));
        String str2 = this._url;
        setUrl(str);
        for (PlaylistItem playlistItem3 : this._dataUrls) {
            playlistItem3.setUri(buildM4sUrl(playlistItem3.getName()));
            playlistItem3.setSrc(str);
        }
        if (_mergeNextList(basicM3u8Parser, true) == 0) {
            Function3<? super Boolean, ? super String, ? super String, Unit> function33 = this.onSwitchBack;
            if (function33 == null) {
                return true;
            }
            function33.invoke(Boolean.TRUE, str2, str);
            return true;
        }
        Function3<? super Boolean, ? super String, ? super String, Unit> function34 = this.onSwitchBack;
        if (function34 == null) {
            return false;
        }
        function34.invoke(Boolean.FALSE, str2, str);
        return false;
    }

    public final void setEndOfStream(boolean z6) {
        this.endOfStream = z6;
    }

    public final void setOnPlaylistUpdate(@Nullable Function1<? super PlaylistItem, Unit> function1) {
        this.onPlaylistUpdate = function1;
    }

    public final void setOnSwitchBack(@Nullable Function3<? super Boolean, ? super String, ? super String, Unit> function3) {
        this.onSwitchBack = function3;
    }

    public final void setOnSwitchToNextPlaylist(@Nullable Function4<? super Boolean, ? super String, ? super HLSStreamInf, ? super PlaylistItem, Unit> function4) {
        this.onSwitchToNextPlaylist = function4;
    }

    public final void setSteering(@Nullable HashMap<String, String> map) {
        this.steering = map;
    }

    public final void setStreamInfMaps(@NotNull ArrayList<HashMap<String, String>> arrayList) {
        this.streamInfMaps = arrayList;
    }

    public final void setStreamUrls(@NotNull List<String> list) {
        this.streamUrls = list;
    }

    public final void setUrl(@NotNull String str) {
        int iD = StringsKt.D(str, "/", 0, 6);
        int iD2 = StringsKt.D(str, "?", 0, 6);
        this._relativePath = str.substring(0, iD + 1);
        this._queryParams = "";
        if (!this.m4sQueryParams.isEmpty() && iD2 > 0) {
            this._queryParams = str.substring(iD2);
        }
        this._url = str;
        this._initUris.clear();
        this._lastSeq = 0L;
        this._lastUri = "";
        this._nextSequence = 0L;
        this._nextPlaylist = null;
    }

    @Nullable
    public final PlaylistItem shift() {
        PlaylistItem playlistItemRemove = this._dataUrls.size() > 0 ? this._dataUrls.remove(0) : null;
        if (playlistItemRemove != null) {
            long j7 = this._remainDuration;
            Long duration = playlistItemRemove.getDuration();
            this._remainDuration = j7 - (duration != null ? duration.longValue() : 0L);
        }
        return playlistItemRemove;
    }

    public final boolean switchToNextPlaylist(@NotNull HLSStreamInf hLSStreamInf, @NotNull BasicM3u8Parser basicM3u8Parser, boolean z6, boolean z7) {
        P2PLogger.logI$default(this.logger, TAG, C4496a.a("pre =  ", hLSStreamInf.getUrl()), null, 4, null);
        if (hLSStreamInf.getUrl().length() > 0) {
            this._nextPlaylist = new NextPlaylist(basicM3u8Parser, hLSStreamInf, z6, z7);
            return true;
        }
        this._nextPlaylist = null;
        return false;
    }
}
