package com.bilibili.playerbizcommonv2.widget.quality;

import android.content.SharedPreferences;

/* JADX INFO: renamed from: com.bilibili.playerbizcommonv2.widget.quality.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/quality/x.class */
public final class C5826x extends AbstractC5824v {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SharedPreferences f82892c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f82893d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5826x(int i7, SharedPreferences sharedPreferences, String str) {
        super(str);
        this.f82892c = sharedPreferences;
        this.f82893d = i7;
    }

    @Override // com.bilibili.playerbizcommonv2.widget.quality.AbstractC5824v
    public final void a() {
        SharedPreferences.Editor editorEdit = this.f82892c.edit();
        editorEdit.putInt("player.qn_4k_tip_repeat", this.f82893d + 1);
        editorEdit.apply();
    }
}
