package com.bilibili.pegasus.utils;

import com.bapis.bilibili.app.card.v1.Card;

/* JADX INFO: renamed from: com.bilibili.pegasus.utils.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/utils/b.class */
public final /* synthetic */ class C5758b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f78867a;

    static {
        int[] iArr = new int[Card.ItemCase.values().length];
        try {
            iArr[Card.ItemCase.SMALL_COVER_V5.ordinal()] = 1;
        } catch (NoSuchFieldError e7) {
        }
        try {
            iArr[Card.ItemCase.TOPIC_LIST.ordinal()] = 2;
        } catch (NoSuchFieldError e8) {
        }
        try {
            iArr[Card.ItemCase.LARGE_COVER_V1.ordinal()] = 3;
        } catch (NoSuchFieldError e9) {
        }
        try {
            iArr[Card.ItemCase.RCMD_ONE_ITEM.ordinal()] = 4;
        } catch (NoSuchFieldError e10) {
        }
        try {
            iArr[Card.ItemCase.MIDDLE_COVER_V3.ordinal()] = 5;
        } catch (NoSuchFieldError e11) {
        }
        try {
            iArr[Card.ItemCase.POPULAR_TOP_ENTRANCE.ordinal()] = 6;
        } catch (NoSuchFieldError e12) {
        }
        try {
            iArr[Card.ItemCase.SMALL_COVER_V5_AD.ordinal()] = 7;
        } catch (NoSuchFieldError e13) {
        }
        try {
            iArr[Card.ItemCase.ITEM_NOT_SET.ordinal()] = 8;
        } catch (NoSuchFieldError e14) {
        }
        f78867a = iArr;
    }
}
