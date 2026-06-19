package com.bilibili.sistersplayer.p2p.fragment;

import G0.b;
import H0.e;
import X0.c;
import com.bilibili.search2.api.SearchBangumiItem;
import com.bilibili.sistersplayer.hls.ErrorMsg;
import com.bilibili.sistersplayer.p2p.FetchErrorType;
import com.bilibili.sistersplayer.p2p.P2PContext;
import com.bilibili.sistersplayer.p2p.P2PDataCollection;
import com.bilibili.sistersplayer.p2p.WastedDataType;
import com.bilibili.sistersplayer.p2p.peer.NyaPeerManager;
import com.bilibili.sistersplayer.p2p.peer.PeerRole;
import com.bilibili.sistersplayer.p2p.utils.P2PLogger;
import com.bilibili.sistersplayer.p2p.utils.PLog;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.zip.CRC32;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.IntRange;
import kotlin.text.CharsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/fragment/LiveFragment.class */
public final class LiveFragment {

    @NotNull
    public static final String CRC32_TAG = "LiveFragmentCRC32";

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    public static final String TAG = "LiveFragment";
    private int blockCount;
    private int blockFinishCount;
    private int blockSize;

    @NotNull
    private final List<LiveFragmentBlock> blocks;

    @Nullable
    private byte[] buffer;

    @NotNull
    private final CRC32 crc32;

    @Nullable
    private Function0<Unit> crcErrorCallback;

    @NotNull
    private final List<Integer> distances;

    @Nullable
    private String fragEndErrorMsg;

    @NotNull
    private FragmentDataStat fragStat;

    @NotNull
    private final String fragmentName;
    private int fragmentSize;

    @NotNull
    private final Future<LiveFragment> future;
    private boolean isCrcErrorToRefetch;

    @NotNull
    private final P2PLogger logger;

    @NotNull
    private final P2PContext p2pContext;
    private int queryServerNum;
    private boolean requestDownloadToSeedbox;

    @NotNull
    private final List<Integer> roleArray;
    private int shareQuota;
    private int shareSize;

    @NotNull
    private final Map<Integer, Pair<Integer, Integer>> sliceBlockRangeRecord;

    @NotNull
    private final Set<Integer> sliceIdsInCharge;

    @NotNull
    private final List<SliceProgress> sliceProgressArray;

    @NotNull
    private final List<Integer> statArray;

    @Nullable
    private final Long trustedCrc;

    @Nullable
    private String url;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/fragment/LiveFragment$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        PLog pLog = PLog.INSTANCE;
        pLog.getTags().put(TAG, Boolean.FALSE);
        pLog.getTags().put(CRC32_TAG, Boolean.TRUE);
    }

    public LiveFragment(@NotNull P2PContext p2PContext, @NotNull String str, int i7, @Nullable Long l7) {
        this.p2pContext = p2PContext;
        this.fragmentName = str;
        this.fragmentSize = i7;
        this.trustedCrc = l7;
        this.logger = p2PContext.getLogger();
        FragmentDataStat fragmentDataStat = FragmentDataStat.NULL;
        this.fragStat = fragmentDataStat;
        this.blocks = new ArrayList();
        this.sliceProgressArray = new ArrayList();
        this.future = new Future<>();
        this.statArray = new ArrayList();
        this.roleArray = new ArrayList();
        this.sliceBlockRangeRecord = new LinkedHashMap();
        this.sliceIdsInCharge = new LinkedHashSet();
        this.distances = new ArrayList();
        this.crc32 = new CRC32();
        this.requestDownloadToSeedbox = true;
        this.fragStat = fragmentDataStat;
        for (DataSourceType dataSourceType : DataSourceType.values()) {
            this.statArray.add(dataSourceType.ordinal(), 0);
        }
        for (DataRoleType dataRoleType : DataRoleType.values()) {
            this.roleArray.add(dataRoleType.ordinal(), 0);
        }
        int i8 = this.p2pContext.getSistersConfiguration().sliceCount;
        for (int i9 = 0; i9 < i8; i9++) {
            this.sliceProgressArray.add(i9, new SliceProgress());
        }
        this.blockFinishCount = 0;
        initFragmentBySize(this.fragmentSize);
    }

    public /* synthetic */ LiveFragment(P2PContext p2PContext, String str, int i7, Long l7, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this(p2PContext, str, i7, (i8 & 8) != 0 ? null : l7);
    }

    private final void addShareQuotaBytes(int i7) {
        this.shareQuota += i7;
    }

    private final void initFragmentBySize(int i7) {
        this.fragmentSize = i7;
        if (i7 < this.p2pContext.getSistersConfiguration().blockSize * this.p2pContext.getSistersConfiguration().sliceCount) {
            this.blockCount = this.p2pContext.getSistersConfiguration().sliceCount;
            this.blockSize = (int) Math.ceil((i7 * 1.0f) / r0);
        } else {
            this.blockSize = this.p2pContext.getSistersConfiguration().blockSize;
            this.blockCount = (int) Math.ceil((i7 * 1.0f) / r0);
        }
        this.buffer = new byte[i7];
        this.distances.clear();
        int i8 = this.blockCount;
        for (int i9 = 0; i9 < i8; i9++) {
            this.distances.add(Integer.valueOf(SearchBangumiItem.TYPE_FULLNET_BANGUMI));
        }
        Iterator<Integer> it = this.sliceIdsInCharge.iterator();
        while (it.hasNext()) {
            Pair<Integer, Integer> sliceBlockRange = getSliceBlockRange(it.next().intValue());
            int iIntValue = ((Number) sliceBlockRange.getSecond()).intValue();
            for (int iIntValue2 = ((Number) sliceBlockRange.getFirst()).intValue(); iIntValue2 < iIntValue; iIntValue2++) {
                List<Integer> list = this.distances;
                list.set(iIntValue2, Integer.valueOf(list.get(iIntValue2).intValue() | 128));
            }
        }
        int i10 = (int) (this.p2pContext.getSistersConfiguration().fragmentShareOverride * i7);
        this.shareQuota = i10;
        if (i10 > this.p2pContext.getSistersConfiguration().fragmentShareOverrideMaxBytes) {
            this.shareQuota = this.p2pContext.getSistersConfiguration().fragmentShareOverrideMaxBytes;
        }
        addShareQuotaBytes(this.p2pContext.getShareQuotaController().takeShareQuato((int) Math.floor(r0 * this.p2pContext.getSistersConfiguration().fragmentExtraShareRatio)));
        int i11 = this.p2pContext.getSistersConfiguration().sliceCount;
        int i12 = 0;
        while (true) {
            int i13 = i12;
            if (i13 >= i11) {
                break;
            }
            this.sliceBlockRangeRecord.put(Integer.valueOf(i13), new Pair<>(Integer.valueOf((int) Math.floor(((this.blockCount * 1.0f) / this.p2pContext.getSistersConfiguration().sliceCount) * i13)), Integer.valueOf((int) Math.floor(((this.blockCount * 1.0f) / this.p2pContext.getSistersConfiguration().sliceCount) * r0))));
            i12 = i13 + 1;
        }
        this.blocks.clear();
        int i14 = this.blockCount;
        for (int i15 = 0; i15 < i14; i15++) {
            Pair<Integer, Integer> blockByteRange = getBlockByteRange(i15);
            this.blocks.add(i15, new LiveFragmentBlock(ByteBuffer.wrap(this.buffer, ((Number) blockByteRange.getFirst()).intValue(), ((Number) blockByteRange.getSecond()).intValue() - ((Number) blockByteRange.getFirst()).intValue())));
        }
        int i16 = this.p2pContext.getSistersConfiguration().sliceCount;
        for (int i17 = 0; i17 < i16; i17++) {
            Pair<Integer, Integer> sliceBlockRange2 = getSliceBlockRange(i17);
            this.sliceProgressArray.get(i17).setCurCount(0);
            this.sliceProgressArray.get(i17).setMaxCount(((Number) sliceBlockRange2.getSecond()).intValue() - ((Number) sliceBlockRange2.getFirst()).intValue());
            this.sliceProgressArray.get(i17).setStartBlockId(((Number) sliceBlockRange2.getFirst()).intValue());
            this.sliceProgressArray.get(i17).setNextFinishedBlockId(((Number) sliceBlockRange2.getFirst()).intValue());
            Pair<Integer, Integer> sliceByteRange = getSliceByteRange(i17);
            this.sliceProgressArray.get(i17).setSliceSize(((Number) sliceByteRange.getSecond()).intValue() - ((Number) sliceByteRange.getFirst()).intValue());
            this.sliceProgressArray.get(i17).setShareSize(0);
        }
    }

    public static /* synthetic */ boolean setBlockData$default(LiveFragment liveFragment, int i7, byte[] bArr, DataSourceType dataSourceType, DataRoleType dataRoleType, String str, int i8, Object obj) {
        if ((i8 & 16) != 0) {
            str = null;
        }
        return liveFragment.setBlockData(i7, bArr, dataSourceType, dataRoleType, str);
    }

    public static /* synthetic */ void setFragmentData$default(LiveFragment liveFragment, byte[] bArr, ErrorMsg errorMsg, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            errorMsg = null;
        }
        liveFragment.setFragmentData(bArr, errorMsg);
    }

    public final void addShareData(int i7, int i8) {
        SliceProgress sliceProgress = this.sliceProgressArray.get(getBlockBelongSlice(i7));
        sliceProgress.setShareSize(sliceProgress.getShareSize() + i8);
        this.shareSize += i8;
    }

    public final boolean canShare() {
        return this.shareSize < this.shareQuota;
    }

    public final void destroy() {
        if (this.fragStat == FragmentDataStat.NULL) {
            setFragmentData$default(this, null, null, 2, null);
        }
    }

    public final void doOnceQueryServer() {
        this.queryServerNum++;
    }

    @Nullable
    public final LiveFragmentBlock getBlock(@Nullable Integer num) {
        if (num == null || num.intValue() < 0 || num.intValue() >= this.blockCount || num.intValue() >= this.blocks.size()) {
            return null;
        }
        return this.blocks.get(num.intValue());
    }

    public final int getBlockBelongSlice(int i7) {
        if (i7 < 0 || i7 >= this.blockCount) {
            return -1;
        }
        int i8 = this.p2pContext.getSistersConfiguration().sliceCount;
        for (int i9 = 0; i9 < i8; i9++) {
            Pair<Integer, Integer> pair = this.sliceBlockRangeRecord.get(Integer.valueOf(i9));
            if (pair != null && i7 < ((Number) pair.getSecond()).intValue()) {
                return i9;
            }
        }
        return -1;
    }

    @NotNull
    public final Pair<Integer, Integer> getBlockByteRange(int i7) {
        if (i7 < 0 || i7 >= this.blockCount) {
            return new Pair<>(0, 0);
        }
        int i8 = this.blockSize;
        int i9 = i7 * i8;
        return new Pair<>(Integer.valueOf(i9), Integer.valueOf(Math.min(this.fragmentSize, i8 + i9)));
    }

    public final int getBlockCount() {
        return this.blockCount;
    }

    public final int getBlockSize() {
        return this.blockSize;
    }

    @NotNull
    public final List<Integer> getDistance() {
        return this.distances;
    }

    @Nullable
    public final String getFragEndErrorMsg() {
        return this.fragEndErrorMsg;
    }

    @NotNull
    public final FragmentDataStat getFragStat() {
        return this.fragStat;
    }

    @Nullable
    public final byte[] getFragmentData() {
        return this.fragStat == FragmentDataStat.END_SUCCESS ? this.buffer : null;
    }

    @NotNull
    public final String getFragmentName() {
        return this.fragmentName;
    }

    public final int getFragmentSize() {
        return this.fragmentSize;
    }

    @NotNull
    public final P2PContext getP2pContext() {
        return this.p2pContext;
    }

    public final int getQueryServerNum() {
        return this.queryServerNum;
    }

    public final int getRemainingShareQuotaBytes() {
        return Math.max(0, this.shareQuota - this.shareSize);
    }

    public final boolean getRequestDownloadToSeedbox() {
        return this.requestDownloadToSeedbox;
    }

    @NotNull
    public final List<Integer> getRoleArray() {
        return this.roleArray;
    }

    public final float getRoleRatioForSlice(@NotNull DataRoleType dataRoleType, int i7) {
        if (i7 < 0 || i7 >= this.p2pContext.getSistersConfiguration().sliceCount) {
            return 0.0f;
        }
        SliceProgress sliceProgress = this.sliceProgressArray.get(i7);
        if (sliceProgress.getSliceSize() == 0) {
            return 0.0f;
        }
        return (sliceProgress.getRoleArray().get(dataRoleType.ordinal()).floatValue() * 1.0f) / sliceProgress.getSliceSize();
    }

    public final int getShareSize() {
        return this.shareSize;
    }

    public final float getSharedRatio() {
        int i7 = this.fragmentSize;
        if (i7 == 0) {
            return 0.0f;
        }
        return (this.shareSize * 1.0f) / i7;
    }

    @NotNull
    public final Pair<Integer, Integer> getSliceBlockRange(int i7) {
        Pair<Integer, Integer> pair = this.sliceBlockRangeRecord.get(Integer.valueOf(i7));
        return (i7 < 0 || i7 >= this.p2pContext.getSistersConfiguration().sliceCount || pair == null) ? new Pair<>(0, 0) : pair;
    }

    @NotNull
    public final Pair<Integer, Integer> getSliceByteRange(int i7) {
        Pair<Integer, Integer> sliceBlockRange = getSliceBlockRange(i7);
        if (((Number) sliceBlockRange.getFirst()).intValue() == ((Number) sliceBlockRange.getSecond()).intValue()) {
            return new Pair<>(0, 0);
        }
        Pair<Integer, Integer> blockByteRange = getBlockByteRange(((Number) sliceBlockRange.getFirst()).intValue());
        Pair<Integer, Integer> blockByteRange2 = getBlockByteRange(((Number) sliceBlockRange.getSecond()).intValue() - 1);
        return (((Number) blockByteRange.getFirst()).intValue() == ((Number) blockByteRange.getSecond()).intValue() || ((Number) blockByteRange2.getFirst()).intValue() == ((Number) blockByteRange2.getSecond()).intValue()) ? new Pair<>(0, 0) : new Pair<>(blockByteRange.getFirst(), blockByteRange2.getSecond());
    }

    @NotNull
    public final Set<Integer> getSliceIds() {
        return this.sliceIdsInCharge;
    }

    public final float getSliceSharedRatio(int i7) {
        float f7 = 0.0f;
        if (i7 >= 0) {
            if (i7 >= this.p2pContext.getSistersConfiguration().sliceCount) {
                f7 = 0.0f;
            } else {
                if (this.sliceProgressArray.get(i7).getSliceSize() == 0 || this.fragmentSize == 0) {
                    return 0.0f;
                }
                float shareSize = (r0.getShareSize() * 1.0f) / r0.getSliceSize();
                float f8 = this.fragmentSize * this.p2pContext.getSistersConfiguration().fragmentShareOverride;
                f7 = shareSize;
                if (f8 > this.p2pContext.getSistersConfiguration().fragmentShareOverrideMaxBytes) {
                    f7 = (shareSize * f8) / this.p2pContext.getSistersConfiguration().fragmentShareOverrideMaxBytes;
                }
            }
        }
        return f7;
    }

    public final float getSourceRatioForSlice(@NotNull DataSourceType dataSourceType, int i7) {
        if (i7 < 0 || i7 >= this.p2pContext.getSistersConfiguration().sliceCount) {
            return 0.0f;
        }
        SliceProgress sliceProgress = this.sliceProgressArray.get(i7);
        if (sliceProgress.getSliceSize() == 0) {
            return 0.0f;
        }
        return (sliceProgress.getStatArray().get(dataSourceType.ordinal()).floatValue() * 1.0f) / sliceProgress.getSliceSize();
    }

    @NotNull
    public final List<Integer> getStatArray() {
        return this.statArray;
    }

    @Nullable
    public final String getUrl() {
        return this.url;
    }

    public final boolean isBlockFinished(int i7) {
        LiveFragmentBlock block = getBlock(Integer.valueOf(i7));
        if (block == null) {
            return false;
        }
        return block.isSucceed();
    }

    public final boolean isFinished() {
        return this.fragStat == FragmentDataStat.END_SUCCESS;
    }

    public final boolean isSliceFinished(int i7) {
        return this.sliceProgressArray.get(i7).getCurCount() == this.sliceProgressArray.get(i7).getMaxCount();
    }

    public final boolean onBlockFinished(int i7, @NotNull Function1<? super byte[], Unit> function1) {
        LiveFragmentBlock block = getBlock(Integer.valueOf(i7));
        if (block == null) {
            return false;
        }
        block.onDataResolved(function1);
        return true;
    }

    public final void onFinished(@NotNull Function1<? super LiveFragment, Unit> function1) {
        this.future.onResolved(function1);
    }

    public final boolean setBlockData(int i7, @NotNull byte[] bArr, @NotNull DataSourceType dataSourceType, @NotNull DataRoleType dataRoleType, @Nullable String str) {
        String ghostPeerId;
        LiveFragmentBlock block = getBlock(Integer.valueOf(i7));
        if (block == null) {
            P2PLogger.logE$default(this.logger, TAG, "[LiveP2PProblem][p2p_error=set_block] fragment: set data block is nil.", null, 4, null);
            return false;
        }
        if (block.isSucceed()) {
            P2PLogger.logE$default(this.logger, TAG, "[LiveP2PProblem][p2p_error=set_block] fragment: set data block is already success", null, 4, null);
            return false;
        }
        if (block.setData(bArr, dataSourceType, str) != DataSettingStat.SUCCESS) {
            P2PLogger.logE$default(this.logger, TAG, "[LiveP2PProblem][p2p_error=set_data] set data error", null, 4, null);
            return false;
        }
        List<Integer> list = this.statArray;
        int iOrdinal = dataSourceType.ordinal();
        list.set(iOrdinal, Integer.valueOf(list.get(iOrdinal).intValue() + bArr.length));
        List<Integer> list2 = this.roleArray;
        int iOrdinal2 = dataRoleType.ordinal();
        list2.set(iOrdinal2, Integer.valueOf(list2.get(iOrdinal2).intValue() + bArr.length));
        this.p2pContext.getP2pDataCollection().addDownloadSizeRealtime(bArr.length, dataSourceType);
        int blockBelongSlice = getBlockBelongSlice(i7);
        SliceProgress sliceProgress = this.sliceProgressArray.get(blockBelongSlice);
        sliceProgress.setCurCount(sliceProgress.getCurCount() + 1);
        List<Integer> statArray = this.sliceProgressArray.get(blockBelongSlice).getStatArray();
        int iOrdinal3 = dataSourceType.ordinal();
        statArray.set(iOrdinal3, Integer.valueOf(statArray.get(iOrdinal3).intValue() + bArr.length));
        List<Integer> roleArray = this.sliceProgressArray.get(blockBelongSlice).getRoleArray();
        int iOrdinal4 = dataRoleType.ordinal();
        roleArray.set(iOrdinal4, Integer.valueOf(roleArray.get(iOrdinal4).intValue() + bArr.length));
        if (this.isCrcErrorToRefetch && (ghostPeerId = block.getGhostPeerId()) != null && ghostPeerId.length() != 0) {
            this.p2pContext.getGhostPeerIds().add(block.getGhostPeerId());
            NyaPeerManager rtcManager = this.p2pContext.getRtcManager();
            if (rtcManager != null) {
                rtcManager.closePeer(block.getGhostPeerId());
            }
        }
        List<Integer> list3 = this.distances;
        list3.set(i7, Integer.valueOf(list3.get(i7).intValue() & 128));
        int i8 = this.blockFinishCount + 1;
        this.blockFinishCount = i8;
        if (i8 != this.blockCount) {
            return true;
        }
        setFragmentData$default(this, this.buffer, null, 2, null);
        return true;
    }

    public final void setCrcErrorCallback(@NotNull Function0<Unit> function0) {
        this.crcErrorCallback = function0;
    }

    public final void setFragmentData(@Nullable byte[] bArr, @Nullable ErrorMsg errorMsg) {
        byte[] bArr2;
        if (bArr != null && (this.fragmentSize == 0 || (bArr2 = this.buffer) == null || bArr2.length == bArr.length)) {
            byte[] bArr3 = this.buffer;
            if (bArr3 != null && bArr3.length == 0) {
                this.fragmentSize = bArr.length;
                initFragmentBySize(bArr.length);
                int i7 = this.blockCount;
                for (int i8 = 0; i8 < i7; i8++) {
                    Pair<Integer, Integer> blockByteRange = getBlockByteRange(i8);
                    setBlockData$default(this, i8, ArraysKt.sliceArray(bArr, new IntRange(((Number) blockByteRange.getFirst()).intValue(), ((Number) blockByteRange.getSecond()).intValue() - 1)), DataSourceType.SERVER, this.p2pContext.getPeerRole() == PeerRole.PEER ? DataRoleType.SEED : DataRoleType.LACKED, null, 16, null);
                }
                return;
            }
            if (bArr3 != null && bArr.length == bArr3.length) {
                if (this.trustedCrc != null && this.p2pContext.getSistersConfiguration().crcVerifyEnable) {
                    this.crc32.update(bArr);
                    long value = this.crc32.getValue();
                    this.crc32.reset();
                    Long l7 = this.trustedCrc;
                    if (l7 == null || value != l7.longValue()) {
                        P2PLogger p2PLogger = this.logger;
                        String str = this.fragmentName;
                        String string = Long.toString(value, CharsKt.checkRadix(16));
                        String string2 = Long.toString(this.trustedCrc.longValue(), CharsKt.checkRadix(16));
                        int length = bArr.length;
                        byte[] bArr4 = this.buffer;
                        Integer numValueOf = bArr4 != null ? Integer.valueOf(bArr4.length) : null;
                        List<Integer> list = this.statArray;
                        DataSourceType dataSourceType = DataSourceType.P2P;
                        Integer num = list.get(dataSourceType.ordinal());
                        List<Integer> list2 = this.statArray;
                        DataSourceType dataSourceType2 = DataSourceType.SERVER;
                        Integer num2 = list2.get(dataSourceType2.ordinal());
                        StringBuilder sbA = b.a("[LiveP2PProblem][segment_error=segment_crc] ", str, ": crc is error dataCrc32: ", string, " != trustedCrc32: ");
                        e.b(length, string2, "dataSize:", ", trustedSize", sbA);
                        sbA.append(numValueOf);
                        sbA.append(" dataSource: ");
                        sbA.append(num);
                        sbA.append(" from p2p, ");
                        P2PLogger.logE$default(p2PLogger, CRC32_TAG, c.b(sbA, num2, " from server"), null, 4, null);
                        if (this.statArray.get(dataSourceType.ordinal()).intValue() > 0) {
                            this.isCrcErrorToRefetch = true;
                            int i9 = this.p2pContext.getSistersConfiguration().sliceCount;
                            for (int i10 = 0; i10 < i9; i10++) {
                                if (!this.sliceIdsInCharge.contains(Integer.valueOf(i10))) {
                                    Pair<Integer, Integer> sliceBlockRange = getSliceBlockRange(i10);
                                    SliceProgress sliceProgress = this.sliceProgressArray.get(i10);
                                    List<Integer> list3 = this.statArray;
                                    DataSourceType dataSourceType3 = DataSourceType.P2P;
                                    int iOrdinal = dataSourceType3.ordinal();
                                    list3.set(iOrdinal, Integer.valueOf(list3.get(iOrdinal).intValue() - sliceProgress.getStatArray().get(dataSourceType3.ordinal()).intValue()));
                                    P2PDataCollection.addWastedDataSize$default(this.p2pContext.getP2pDataCollection(), sliceProgress.getStatArray().get(dataSourceType3.ordinal()).intValue(), WastedDataType.ERROR_DATA, null, null, 12, null);
                                    sliceProgress.getStatArray().set(dataSourceType3.ordinal(), 0);
                                    int iIntValue = ((Number) sliceBlockRange.getSecond()).intValue();
                                    for (int iIntValue2 = ((Number) sliceBlockRange.getFirst()).intValue(); iIntValue2 < iIntValue; iIntValue2++) {
                                        LiveFragmentBlock block = getBlock(Integer.valueOf(iIntValue2));
                                        if (block != null && block.resetStatus()) {
                                            this.blockFinishCount--;
                                            sliceProgress.setCurCount(sliceProgress.getCurCount() - 1);
                                        }
                                    }
                                }
                            }
                            Function0<Unit> function0 = this.crcErrorCallback;
                            if (function0 != null) {
                                function0.invoke();
                                return;
                            }
                            return;
                        }
                        this.p2pContext.getP2pDataCollection().addCrc32ErrorNum();
                        P2PLogger p2PLogger2 = this.logger;
                        String str2 = this.fragmentName;
                        String string3 = Long.toString(value, CharsKt.checkRadix(16));
                        String string4 = Long.toString(this.trustedCrc.longValue(), CharsKt.checkRadix(16));
                        int length2 = bArr.length;
                        byte[] bArr5 = this.buffer;
                        Integer numValueOf2 = bArr5 != null ? Integer.valueOf(bArr5.length) : null;
                        Integer num3 = this.statArray.get(dataSourceType.ordinal());
                        Integer num4 = this.statArray.get(dataSourceType2.ordinal());
                        StringBuilder sbA2 = b.a("[LiveP2PProblem][segment_error=segment_crc] ", str2, ": all from server , but crc is still error  dataCrc32: ", string3, " != trustedCrc32: ");
                        e.b(length2, string4, "dataSize:", ", trustedSize", sbA2);
                        sbA2.append(numValueOf2);
                        sbA2.append(" dataSource: ");
                        sbA2.append(num3);
                        sbA2.append(" from p2p, ");
                        P2PLogger.logE$default(p2PLogger2, CRC32_TAG, c.b(sbA2, num4, " from server"), null, 4, null);
                    }
                }
                this.fragStat = FragmentDataStat.END_SUCCESS;
            }
        } else {
            if (this.fragStat != FragmentDataStat.NULL) {
                this.p2pContext.getP2pDataCollection().addFetchError(FetchErrorType.ERROR_NO_EFFECT);
                return;
            }
            int i11 = this.blockCount;
            for (int i12 = 0; i12 < i11; i12++) {
                LiveFragmentBlock block2 = getBlock(Integer.valueOf(i12));
                if (block2 != null && !block2.isSucceed()) {
                    LiveFragmentBlock.setData$default(block2, null, null, null, 6, null);
                }
            }
            this.fragStat = FragmentDataStat.END_ERROR;
            this.fragEndErrorMsg = errorMsg != null ? errorMsg.toString() : null;
        }
        this.future.setResult(this);
    }

    public final void setFragmentSize(int i7) {
        this.fragmentSize = i7;
    }

    public final void setRequestDownloadToSeedbox(boolean z6) {
        this.requestDownloadToSeedbox = z6;
    }

    public final void setSliceIds(@NotNull Set<Integer> set) {
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            this.sliceIdsInCharge.add(Integer.valueOf(((Number) it.next()).intValue()));
        }
    }

    public final void setUrl(@Nullable String str) {
        this.url = str;
    }
}
