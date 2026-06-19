package com.bilibili.sistersplayer.p2p.fragment;

import java.nio.ByteBuffer;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/fragment/LiveFragmentBlock.class */
public final class LiveFragmentBlock {

    @NotNull
    private final ByteBuffer blockData;
    private final int dataSize;

    @Nullable
    private String dataSourcePeerId;

    @Nullable
    private DataSourceType dataSourceType;

    @NotNull
    private DataSettingStat status = DataSettingStat.NULL;

    @NotNull
    private Future<byte[]> future = new Future<>();

    public LiveFragmentBlock(@NotNull ByteBuffer byteBuffer) {
        this.blockData = byteBuffer;
        this.dataSize = byteBuffer.limit() - byteBuffer.position();
        byteBuffer.mark();
    }

    public static /* synthetic */ DataSettingStat setData$default(LiveFragmentBlock liveFragmentBlock, byte[] bArr, DataSourceType dataSourceType, String str, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            bArr = null;
        }
        if ((i7 & 2) != 0) {
            dataSourceType = null;
        }
        if ((i7 & 4) != 0) {
            str = null;
        }
        return liveFragmentBlock.setData(bArr, dataSourceType, str);
    }

    @Nullable
    public final String getGhostPeerId() {
        return this.dataSourcePeerId;
    }

    public final boolean isSucceed() {
        return this.status == DataSettingStat.SUCCESS;
    }

    public final void onDataResolved(@NotNull Function1<? super byte[], Unit> function1) {
        this.future.onResolved(function1);
    }

    public final boolean resetStatus() {
        if (this.dataSourceType != DataSourceType.P2P) {
            return false;
        }
        this.status = DataSettingStat.REVERTED_DUE_P2P;
        return true;
    }

    @NotNull
    public final DataSettingStat setData(@Nullable byte[] bArr, @Nullable DataSourceType dataSourceType, @Nullable String str) {
        DataSettingStat dataSettingStat = this.status;
        DataSettingStat dataSettingStat2 = DataSettingStat.SUCCESS;
        if (dataSettingStat == dataSettingStat2) {
            return DataSettingStat.REPEAT_SETTINGS;
        }
        if (bArr == null || bArr.length == 0) {
            this.status = DataSettingStat.UNDEFINED;
            this.future.setResult(null);
        } else {
            if ((bArr.length == 0) || bArr.length == this.dataSize) {
                boolean z6 = false;
                if (bArr.length == 0) {
                    z6 = true;
                }
                if (!z6 && bArr.length == this.dataSize) {
                    if (str != null) {
                        this.dataSourcePeerId = str;
                    }
                    if (dataSettingStat == DataSettingStat.REVERTED_DUE_P2P) {
                        this.dataSourcePeerId = null;
                        this.blockData.reset();
                    }
                    this.blockData.put(bArr);
                    this.dataSourceType = dataSourceType;
                    this.status = dataSettingStat2;
                    this.future.setResult(bArr);
                }
            } else {
                this.status = DataSettingStat.DATALENGTH_ERROR;
            }
        }
        return this.status;
    }
}
