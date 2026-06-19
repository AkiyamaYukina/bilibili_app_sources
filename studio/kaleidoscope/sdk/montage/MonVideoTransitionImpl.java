package com.bilibili.studio.kaleidoscope.sdk.montage;

import androidx.annotation.NonNull;
import com.bilibili.montage.FX.MontageVideoTransition;
import com.bilibili.studio.kaleidoscope.sdk.VideoTransition;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/kaleidoscope/sdk/montage/MonVideoTransitionImpl.class */
public final class MonVideoTransitionImpl extends MonFxImpl implements VideoTransition {
    private static final String TAG = "Mon.VT.Impl";
    private MontageVideoTransition mMontageVideoTransition;

    private MonVideoTransitionImpl(@NonNull MontageVideoTransition montageVideoTransition) {
        super(montageVideoTransition);
        this.mMontageVideoTransition = montageVideoTransition;
    }

    @NonNull
    public static VideoTransition box(@NonNull MontageVideoTransition montageVideoTransition) {
        return new MonVideoTransitionImpl(montageVideoTransition);
    }

    @NonNull
    public static MontageVideoTransition unbox(@NonNull VideoTransition videoTransition) {
        return (MontageVideoTransition) videoTransition.getVideoTransition();
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.VideoTransition
    public String getBuiltinVideoTransitionName() {
        return this.mMontageVideoTransition.getBuiltinVideoTransitionName();
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.VideoTransition
    public Object getVideoTransition() {
        return this.mMontageVideoTransition;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.VideoTransition
    public long getVideoTransitionDuration() {
        return this.mMontageVideoTransition.getVideoTransitionDuration();
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.VideoTransition
    public int getVideoTransitionType() {
        return this.mMontageVideoTransition.getVideoTransitionType();
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.VideoTransition
    public void setVideoTransition(Object obj) {
        this.mMontageVideoTransition = (MontageVideoTransition) obj;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.VideoTransition
    public void setVideoTransitionDuration(long j7, int i7) {
        this.mMontageVideoTransition.setVideoTransitionDuration(j7, i7);
    }
}
