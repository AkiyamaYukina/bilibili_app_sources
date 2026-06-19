package com.bilibili.mobile.model;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/mobile/model/BLHumanAction.class */
public class BLHumanAction {
    public int bodyCount;
    public BLMobileBodyInfo[] bodys;
    public int bufIndex;
    public int faceCount;
    public BLMobileFaceInfo[] faces;
    public int handCount;
    public BLMobileHandInfo[] hands;
    private BLHumanActionSegments humanActionSegments;

    public static native BLHumanAction humanActionMirror(int i7, boolean z6, BLHumanAction bLHumanAction);

    public static native BLHumanAction humanActionResize(float f7, BLHumanAction bLHumanAction);

    public static native BLHumanAction humanActionRotate(int i7, int i8, int i9, boolean z6, BLHumanAction bLHumanAction);

    public static BLHumanAction humanActionRotateAndMirror(BLHumanAction bLHumanAction, int i7, int i8, int i9, int i10) {
        BLHumanAction bLHumanActionHumanActionRotate;
        if (bLHumanAction == null) {
            return null;
        }
        if (i9 != 1 && i9 != 0) {
            return bLHumanAction;
        }
        if (i10 == 0) {
            bLHumanActionHumanActionRotate = humanActionRotate(i7, i8, 0, false, bLHumanAction);
        } else if (i10 == 90) {
            bLHumanActionHumanActionRotate = humanActionRotate(i7, i8, 1, false, bLHumanAction);
        } else if (i10 == 180) {
            bLHumanActionHumanActionRotate = humanActionRotate(i7, i8, 2, false, bLHumanAction);
        } else {
            if (i10 != 270) {
                return bLHumanAction;
            }
            bLHumanActionHumanActionRotate = humanActionRotate(i7, i8, 3, false, bLHumanAction);
        }
        BLHumanAction bLHumanActionHumanActionMirror = bLHumanActionHumanActionRotate;
        if (i9 == 1) {
            bLHumanActionHumanActionMirror = humanActionMirror(i7, true, bLHumanActionHumanActionRotate);
        }
        return bLHumanActionHumanActionMirror;
    }

    public int getFaceCount() {
        return this.faceCount;
    }

    public BLMobileFaceInfo[] getFaceInfos() {
        if (this.faceCount == 0) {
            return null;
        }
        return this.faces;
    }

    public BLMobileHandInfo[] getHandInfos() {
        if (this.handCount == 0) {
            return null;
        }
        return this.hands;
    }

    public BLHumanActionSegments getHumanActionSegments() {
        return this.humanActionSegments;
    }

    public BLMobile106[] getMobileFaces() {
        int i7 = this.faceCount;
        if (i7 == 0) {
            return null;
        }
        BLMobile106[] bLMobile106Arr = new BLMobile106[i7];
        for (int i8 = 0; i8 < this.faceCount; i8++) {
            bLMobile106Arr[i8] = this.faces[i8].face106;
        }
        return bLMobile106Arr;
    }

    public boolean replaceMobile106(BLMobile106[] bLMobile106Arr) {
        if (bLMobile106Arr == null || bLMobile106Arr.length == 0 || this.faces == null || this.faceCount != bLMobile106Arr.length) {
            return false;
        }
        for (int i7 = 0; i7 < bLMobile106Arr.length; i7++) {
            this.faces[i7].face106 = bLMobile106Arr[i7];
        }
        return true;
    }

    public void setHumanActionSegments(BLHumanActionSegments bLHumanActionSegments) {
        this.humanActionSegments = bLHumanActionSegments;
    }
}
