package com.bilibili.sistersplayer.p2p;

import com.bilibili.sistersplayer.p2p.fragment.DataRoleType;
import com.bilibili.sistersplayer.p2p.fragment.DataSourceType;
import com.bilibili.sistersplayer.p2p.fragment.LiveFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/P2PDataCollection.class */
public final class P2PDataCollection {
    private volatile int crc32ErrorNum;

    @NotNull
    private final List<Long> fetchErrorArray;

    @NotNull
    private final List<String> fetchRepeatFragmentNameList;
    private int fragNum;
    private int largestQPF;

    @NotNull
    private String lastestDeleteFragName;
    private float lastestDeleteFragShareRatio;

    @NotNull
    private String lastestFragName;
    private float lastestSaveRatio;
    private float lastestShareRatio;

    @NotNull
    private String newestFragName;
    private long p2pSendSizeRealtime;
    private int queryNum;
    private long shareSize;

    @NotNull
    private final List<Long> statRealtimeArray;

    @NotNull
    private final List<Long> statisticsArray;

    @NotNull
    private final List<Long> wastedDataArray;

    @NotNull
    private final List<Long> statArray = new ArrayList();

    @NotNull
    private final List<Long> roleArray = new ArrayList();

    public P2PDataCollection() {
        ArrayList arrayList = new ArrayList();
        Iterator it = DataRoleType.getEntries().iterator();
        while (it.hasNext()) {
            arrayList.add(((DataRoleType) it.next()).ordinal(), 0L);
        }
        this.statisticsArray = arrayList;
        this.lastestDeleteFragName = "--";
        this.statRealtimeArray = new ArrayList();
        this.lastestFragName = "--";
        this.newestFragName = "--";
        this.wastedDataArray = new ArrayList();
        this.fetchRepeatFragmentNameList = new ArrayList();
        this.fetchErrorArray = new ArrayList();
        initToEmpty();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void addWastedDataSize$default(P2PDataCollection p2PDataCollection, int i7, WastedDataType wastedDataType, String str, Set set, int i8, Object obj) {
        if ((i8 & 4) != 0) {
            str = null;
        }
        if ((i8 & 8) != 0) {
            set = null;
        }
        p2PDataCollection.addWastedDataSize(i7, wastedDataType, str, set);
    }

    private final void initToEmpty() {
        for (DataSourceType dataSourceType : DataSourceType.values()) {
            this.statArray.add(dataSourceType.ordinal(), 0L);
            this.statRealtimeArray.add(dataSourceType.ordinal(), 0L);
        }
        for (DataRoleType dataRoleType : DataRoleType.values()) {
            this.roleArray.add(dataRoleType.ordinal(), 0L);
        }
        this.shareSize = 0L;
        this.p2pSendSizeRealtime = 0L;
        for (WastedDataType wastedDataType : WastedDataType.values()) {
            this.wastedDataArray.add(wastedDataType.ordinal(), 0L);
        }
        for (FetchErrorType fetchErrorType : FetchErrorType.values()) {
            this.fetchErrorArray.add(fetchErrorType.ordinal(), 0L);
        }
        this.fetchRepeatFragmentNameList.clear();
        this.fragNum = 0;
        this.queryNum = 0;
        this.largestQPF = 0;
    }

    public final void addCrc32ErrorNum() {
        this.crc32ErrorNum++;
    }

    public final void addDownloadSizeDataCollection(int i7, @NotNull DataSourceType dataSourceType, @NotNull DataRoleType dataRoleType) {
        long j7 = i7;
        this.statArray.set(dataSourceType.ordinal(), Long.valueOf(this.statArray.get(dataSourceType.ordinal()).longValue() + j7));
        this.roleArray.set(dataRoleType.ordinal(), Long.valueOf(this.roleArray.get(dataRoleType.ordinal()).longValue() + j7));
    }

    public final void addDownloadSizeRealtime(int i7, @NotNull DataSourceType dataSourceType) {
        long j7 = i7;
        this.statRealtimeArray.set(dataSourceType.ordinal(), Long.valueOf(this.statRealtimeArray.get(dataSourceType.ordinal()).longValue() + j7));
        this.statisticsArray.set(dataSourceType.ordinal(), Long.valueOf(this.statisticsArray.get(dataSourceType.ordinal()).longValue() + j7));
    }

    public final void addFetchError(@NotNull FetchErrorType fetchErrorType) {
        List<Long> list = this.fetchErrorArray;
        int iOrdinal = fetchErrorType.ordinal();
        list.set(iOrdinal, Long.valueOf(list.get(iOrdinal).longValue() + 1));
    }

    public final void addFragmentDataCollection(@NotNull LiveFragment liveFragment) {
        int i7 = 0;
        for (Object obj : liveFragment.getStatArray()) {
            if (i7 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            int iIntValue = ((Number) obj).intValue();
            List<Long> list = this.statArray;
            list.set(i7, Long.valueOf(list.get(i7).longValue() + ((long) iIntValue)));
            i7++;
        }
        int i8 = 0;
        for (Object obj2 : liveFragment.getRoleArray()) {
            if (i8 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            int iIntValue2 = ((Number) obj2).intValue();
            List<Long> list2 = this.roleArray;
            list2.set(i8, Long.valueOf(list2.get(i8).longValue() + ((long) iIntValue2)));
            i8++;
        }
        this.shareSize += (long) liveFragment.getShareSize();
        this.lastestDeleteFragName = liveFragment.getFragmentName();
        this.lastestDeleteFragShareRatio = liveFragment.getSharedRatio();
    }

    public final void addLastestFragmentDataCollection(@NotNull LiveFragment liveFragment) {
        this.lastestFragName = liveFragment.getFragmentName();
        if (liveFragment.getFragmentSize() == 0) {
            this.lastestSaveRatio = 0.0f;
            this.lastestShareRatio = 0.0f;
        } else {
            this.lastestShareRatio = liveFragment.getSharedRatio();
            this.lastestSaveRatio = (liveFragment.getStatArray().get(DataSourceType.P2P.ordinal()).floatValue() * 1.0f) / liveFragment.getFragmentSize();
        }
        this.fragNum++;
        this.queryNum = liveFragment.getQueryServerNum() + this.queryNum;
        if (liveFragment.getQueryServerNum() > this.largestQPF) {
            this.largestQPF = liveFragment.getQueryServerNum();
        }
    }

    public final void addP2PSendSizeRealtime(int i7) {
        this.p2pSendSizeRealtime += (long) i7;
    }

    public final void addWastedDataSize(int i7, @NotNull WastedDataType wastedDataType, @Nullable String str, @Nullable Set<Integer> set) {
        this.wastedDataArray.set(wastedDataType.ordinal(), Long.valueOf(this.wastedDataArray.get(wastedDataType.ordinal()).longValue() + ((long) i7)));
        if (str == null || str.length() == 0 || wastedDataType != WastedDataType.CDN_REPEAT) {
            return;
        }
        this.fetchRepeatFragmentNameList.add(str + " , " + (set != null ? CollectionsKt.p(set, (CharSequence) null, (CharSequence) null, (CharSequence) null, (Function1) null, 63) : null));
    }

    public final void clearP2PDataInfo() {
        initToEmpty();
    }

    public final int getCrc32ErrorNum() {
        return this.crc32ErrorNum;
    }

    public final long getFetchErrorNum(@NotNull FetchErrorType fetchErrorType) {
        return this.fetchErrorArray.get(fetchErrorType.ordinal()).longValue();
    }

    @NotNull
    public final String getFetchRepeatFragnameListInfo() {
        return CollectionsKt.p(this.fetchRepeatFragmentNameList, (CharSequence) null, (CharSequence) null, (CharSequence) null, (Function1) null, 63);
    }

    @NotNull
    public final String getLastestDeleteFragmentName() {
        return this.lastestDeleteFragName;
    }

    public final float getLastestDeleteFragmentShareRatio() {
        return this.lastestDeleteFragShareRatio;
    }

    @NotNull
    public final String getLastestFragmentName() {
        return this.lastestFragName;
    }

    public final float getLastestFragmentSaveRatio() {
        return this.lastestSaveRatio;
    }

    public final float getLastestFragmentShareRatio() {
        return this.lastestShareRatio;
    }

    @NotNull
    public final String getNewestFragName() {
        return this.newestFragName;
    }

    public final long getP2PDownload() {
        return this.statArray.get(DataSourceType.P2P.ordinal()).longValue();
    }

    public final long getP2PDownloadSizeRealtime() {
        return this.statRealtimeArray.get(DataSourceType.P2P.ordinal()).longValue();
    }

    public final float getP2PSaveRatio() {
        List<Long> list = this.statArray;
        DataSourceType dataSourceType = DataSourceType.P2P;
        long jLongValue = this.statArray.get(DataSourceType.SERVER.ordinal()).longValue() + list.get(dataSourceType.ordinal()).longValue();
        if (jLongValue == 0) {
            return 0.0f;
        }
        return (this.statArray.get(dataSourceType.ordinal()).floatValue() * 1.0f) / jLongValue;
    }

    public final long getP2PSend() {
        return this.shareSize;
    }

    public final long getP2PSendSizeRealtime() {
        return this.p2pSendSizeRealtime;
    }

    public final float getP2PShareRatio() {
        long jLongValue = this.statArray.get(DataSourceType.SERVER.ordinal()).longValue() + this.statArray.get(DataSourceType.P2P.ordinal()).longValue();
        if (jLongValue == 0) {
            return 0.0f;
        }
        return (this.shareSize * 1.0f) / jLongValue;
    }

    public final int getQueryServerFragNum() {
        return this.fragNum;
    }

    public final int getQueryServerQueryNum() {
        return this.queryNum;
    }

    public final int getQueryServerlargestQPF() {
        return this.largestQPF;
    }

    public final long getRoleDataSize(@NotNull DataRoleType dataRoleType) {
        return this.roleArray.get(dataRoleType.ordinal()).longValue();
    }

    public final long getServerDownload() {
        return this.statArray.get(DataSourceType.SERVER.ordinal()).longValue();
    }

    public final long getServerSizeRealtime() {
        return this.statRealtimeArray.get(DataSourceType.SERVER.ordinal()).longValue();
    }

    public final long getStatisticsP2PDownload() {
        return this.statisticsArray.get(DataSourceType.P2P.ordinal()).longValue();
    }

    public final long getStatisticsServerDownload() {
        return this.statisticsArray.get(DataSourceType.SERVER.ordinal()).longValue();
    }

    public final long getWastedDataSize(@NotNull WastedDataType wastedDataType) {
        return this.wastedDataArray.get(wastedDataType.ordinal()).longValue();
    }

    public final void setNewestFragName(@NotNull String str) {
        this.newestFragName = str;
    }
}
