package com.bilibili.ship.theseus.ugc.intro.uprecommend;

import com.bilibili.biligame.card.GameCardButton;
import com.bilibili.lib.blrouter.MutableBundleLike;
import com.bilibili.studio.editor.moudle.sticker.v1.EditCustomizeSticker;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/uprecommend/h.class */
public final /* synthetic */ class h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f97830a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f97831b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f97832c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f97833d;

    public /* synthetic */ h(long j7, String str, String str2, String str3) {
        this.f97830a = j7;
        this.f97831b = str;
        this.f97832c = str2;
        this.f97833d = str3;
    }

    public final Object invoke(Object obj) {
        MutableBundleLike mutableBundleLike = (MutableBundleLike) obj;
        mutableBundleLike.put(EditCustomizeSticker.TAG_MID, String.valueOf(this.f97830a));
        mutableBundleLike.put("name", this.f97831b);
        mutableBundleLike.put("from", this.f97832c);
        mutableBundleLike.put("defaultTab", "video");
        mutableBundleLike.put(GameCardButton.extraAvid, this.f97833d);
        return Unit.INSTANCE;
    }
}
