package com.bilibili.montage.avinfo;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/montage/avinfo/MontageControlPointPair.class */
public class MontageControlPointPair {
    public MontagePointD backwardControlPoint;
    public MontagePointD forwardControlPoint;

    public MontageControlPointPair() {
    }

    public MontageControlPointPair(MontagePointD montagePointD, MontagePointD montagePointD2) {
        this.backwardControlPoint = montagePointD;
        this.forwardControlPoint = montagePointD2;
    }
}
