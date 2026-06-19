package com.bilibili.studio.kaleidoscope.sdk.montage;

import androidx.annotation.NonNull;
import com.bilibili.montage.avinfo.MontageArbitraryData;
import com.bilibili.studio.kaleidoscope.sdk.ArbitraryData;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/kaleidoscope/sdk/montage/MonArbitraryDataImpl.class */
public final class MonArbitraryDataImpl implements ArbitraryData {
    private MontageArbitraryData mMontageArbitraryData;

    private MonArbitraryDataImpl(@NonNull MontageArbitraryData montageArbitraryData) {
        this.mMontageArbitraryData = montageArbitraryData;
    }

    @NonNull
    public static ArbitraryData box(@NonNull MontageArbitraryData montageArbitraryData) {
        return new MonArbitraryDataImpl(montageArbitraryData);
    }

    @NonNull
    public static MontageArbitraryData unbox(@NonNull ArbitraryData arbitraryData) {
        return (MontageArbitraryData) arbitraryData.getArbitraryData();
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.ArbitraryData
    public Object getArbitraryData() {
        return this.mMontageArbitraryData;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.ArbitraryData
    public void setArbitraryData(Object obj) {
        this.mMontageArbitraryData = (MontageArbitraryData) obj;
    }
}
