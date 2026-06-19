package com.bilibili.playerbizcommonv2.widget.quality;

import android.content.SharedPreferences;

/* JADX INFO: renamed from: com.bilibili.playerbizcommonv2.widget.quality.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/quality/w.class */
public final class C5825w extends AbstractC5824v {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SharedPreferences f82890c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f82891d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5825w(long j7, SharedPreferences sharedPreferences, String str) {
        super(str);
        this.f82890c = sharedPreferences;
        this.f82891d = j7;
    }

    @Override // com.bilibili.playerbizcommonv2.widget.quality.AbstractC5824v
    public final void a() {
        SharedPreferences.Editor editorEdit = this.f82890c.edit();
        editorEdit.putInt("player.qn_4k_tip_repeat", 1);
        editorEdit.putLong("last_4k_hint_show_timestamp", this.f82891d);
        editorEdit.apply();
    }
}
