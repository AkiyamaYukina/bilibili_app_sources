package com.bilibili.studio.videoeditor.editor.preview;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/editor/preview/EditTabItem.class */
@Keep
public class EditTabItem implements Comparable<EditTabItem> {
    public static int DISPLAY_STYLE_DISABLED = 1;
    public static int DISPLAY_STYLE_ENABLED;
    private int mDisplayStyle;
    private String mErrorMsg;
    private String mLottieFile;
    private int mRank;
    private int mResIdIcon;
    private String mResIdIconString;
    private int mResIdLabel;
    private String mResIdLabelString;
    private int mTabType;

    public EditTabItem(int i7, int i8, int i9, int i10) {
        this.mResIdLabelString = null;
        this.mResIdIconString = null;
        this.mDisplayStyle = DISPLAY_STYLE_ENABLED;
        this.mLottieFile = "";
        this.mTabType = i7;
        this.mResIdLabel = i8;
        this.mResIdIcon = i9;
        this.mRank = i10;
    }

    public EditTabItem(int i7, String str, String str2, int i8, int i9, int i10) {
        this.mDisplayStyle = DISPLAY_STYLE_ENABLED;
        this.mLottieFile = "";
        this.mTabType = i7;
        this.mResIdLabelString = str;
        this.mResIdIconString = str2;
        this.mRank = i8;
        this.mResIdLabel = i9;
        this.mResIdIcon = i10;
    }

    @Override // java.lang.Comparable
    public int compareTo(@NonNull EditTabItem editTabItem) {
        return this.mRank - editTabItem.getRank();
    }

    public String getErrorMsg() {
        return this.mErrorMsg;
    }

    public String getLottieFile() {
        return this.mLottieFile;
    }

    public int getRank() {
        return this.mRank;
    }

    public int getResIdIcon() {
        return this.mResIdIcon;
    }

    public String getResIdIconString() {
        return this.mResIdIconString;
    }

    public int getResIdLabel() {
        return this.mResIdLabel;
    }

    public String getResIdLabelString() {
        return this.mResIdLabelString;
    }

    public int getTabType() {
        return this.mTabType;
    }

    public boolean isDisplayStateEnabled() {
        return this.mDisplayStyle == DISPLAY_STYLE_ENABLED;
    }

    public void setDisplayState(boolean z6) {
        if (z6) {
            this.mDisplayStyle = DISPLAY_STYLE_ENABLED;
        } else {
            this.mDisplayStyle = DISPLAY_STYLE_DISABLED;
        }
    }

    public void setErrorMsg(String str) {
        this.mErrorMsg = str;
    }

    public void setLottieFile(String str) {
        this.mLottieFile = str;
    }

    public void setRank(int i7) {
        this.mRank = i7;
    }
}
