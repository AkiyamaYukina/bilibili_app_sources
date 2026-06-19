package com.bilibili.studio.videoeditor.capturev3.draft;

import android.graphics.Point;
import androidx.annotation.Keep;
import java.io.File;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/capturev3/draft/CaptureCooperateBean.class */
@Keep
public class CaptureCooperateBean {
    private int mCaptureMode;
    private boolean mIsPreviewFront;
    private String mMaterialPath;
    private Point mMaterialPoint;
    private int mOrientationWhenCaptured = 0;
    private int mPosition = 0;
    private int mStyle;
    private boolean mUseBmmSdk;

    public boolean cooperateAvailable() {
        if (this.mMaterialPath == null) {
            return false;
        }
        return new File(this.mMaterialPath).exists();
    }

    public int getCaptureMode() {
        return this.mCaptureMode;
    }

    public String getMaterialPath() {
        return this.mMaterialPath;
    }

    public Point getMaterialPoint() {
        return this.mMaterialPoint;
    }

    public int getOrientationWhenCaptured() {
        return this.mOrientationWhenCaptured;
    }

    public int getPosition() {
        return this.mPosition;
    }

    public int getStyle() {
        return this.mStyle;
    }

    public boolean getUseBmmSdk() {
        return this.mUseBmmSdk;
    }

    public boolean isPreviewFront() {
        return this.mIsPreviewFront;
    }

    public void setCaptureMode(int i7) {
        this.mCaptureMode = i7;
    }

    public void setMaterialPath(String str) {
        this.mMaterialPath = str;
    }

    public void setMaterialPoint(Point point) {
        this.mMaterialPoint = point;
    }

    public void setOrientationWhenCaptured(int i7) {
        this.mOrientationWhenCaptured = i7;
    }

    public void setPosition(int i7) {
        this.mPosition = i7;
    }

    public void setPreviewFront(boolean z6) {
        this.mIsPreviewFront = z6;
    }

    public void setStyle(int i7) {
        this.mStyle = i7;
    }

    public void setUseBmmSdk(boolean z6) {
        this.mUseBmmSdk = z6;
    }
}
