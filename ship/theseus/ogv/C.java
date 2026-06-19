package com.bilibili.ship.theseus.ogv;

import com.bapis.bilibili.app.viewunite.common.ModuleType;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/C.class */
public final /* synthetic */ class C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f91213a;

    static {
        int[] iArr = new int[ModuleType.values().length];
        try {
            iArr[ModuleType.POSITIVE.ordinal()] = 1;
        } catch (NoSuchFieldError e7) {
        }
        try {
            iArr[ModuleType.SECTION.ordinal()] = 2;
        } catch (NoSuchFieldError e8) {
        }
        try {
            iArr[ModuleType.PUGV.ordinal()] = 3;
        } catch (NoSuchFieldError e9) {
        }
        try {
            iArr[ModuleType.RELATE.ordinal()] = 4;
        } catch (NoSuchFieldError e10) {
        }
        try {
            iArr[ModuleType.SPONSOR.ordinal()] = 5;
        } catch (NoSuchFieldError e11) {
        }
        try {
            iArr[ModuleType.OGV_SEASONS.ordinal()] = 6;
        } catch (NoSuchFieldError e12) {
        }
        try {
            iArr[ModuleType.OGV_LIVE_RESERVE.ordinal()] = 7;
        } catch (NoSuchFieldError e13) {
        }
        f91213a = iArr;
    }
}
