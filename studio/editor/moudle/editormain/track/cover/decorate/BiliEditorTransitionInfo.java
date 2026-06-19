package com.bilibili.studio.editor.moudle.editormain.track.cover.decorate;

import androidx.annotation.Keep;
import com.bilibili.studio.editor.moudle.editormain.track.beans.BiliEditorBaseMaterialInfo;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/track/cover/decorate/BiliEditorTransitionInfo.class */
@Keep
public final class BiliEditorTransitionInfo extends BiliEditorBaseMaterialInfo {

    @Nullable
    private String imgUrl;
    private boolean isFakeClip;
    private boolean isSelected;

    @Nullable
    private String nextBClipId;
    private int overlap;

    @Nullable
    private String preBClipId;
    private int roleInTheme;
    private int selectId;
    private long timeOutPoint;

    @Nullable
    private String transitionPackageId;

    public BiliEditorTransitionInfo() {
        super(null, null, 3, null);
        this.selectId = -1;
    }

    @Nullable
    public final String getImgUrl() {
        return this.imgUrl;
    }

    @Nullable
    public final String getNextBClipId() {
        return this.nextBClipId;
    }

    public final int getOverlap() {
        return this.overlap;
    }

    @Nullable
    public final String getPreBClipId() {
        return this.preBClipId;
    }

    public final int getRoleInTheme() {
        return this.roleInTheme;
    }

    public final int getSelectId() {
        return this.selectId;
    }

    public final long getTimeOutPoint() {
        return this.timeOutPoint;
    }

    @Nullable
    public final String getTransitionPackageId() {
        return this.transitionPackageId;
    }

    public final boolean hasTransition() {
        String str;
        String str2 = this.imgUrl;
        return ((str2 == null || str2.length() == 0) && ((str = this.transitionPackageId) == null || str.length() == 0)) ? false : true;
    }

    public final boolean isFakeClip() {
        return this.isFakeClip;
    }

    public final boolean isSelected() {
        return this.isSelected;
    }

    public final void setFakeClip(boolean z6) {
        this.isFakeClip = z6;
    }

    public final void setImgUrl(@Nullable String str) {
        this.imgUrl = str;
    }

    public final void setNextBClipId(@Nullable String str) {
        this.nextBClipId = str;
    }

    public final void setOverlap(int i7) {
        this.overlap = i7;
    }

    public final void setPreBClipId(@Nullable String str) {
        this.preBClipId = str;
    }

    public final void setRoleInTheme(int i7) {
        this.roleInTheme = i7;
    }

    public final void setSelectId(int i7) {
        this.selectId = i7;
    }

    public final void setSelected(boolean z6) {
        this.isSelected = z6;
    }

    public final void setTimeOutPoint(long j7) {
        this.timeOutPoint = j7;
    }

    public final void setTransitionPackageId(@Nullable String str) {
        this.transitionPackageId = str;
    }
}
