package com.bilibili.music.podcast.data;

import android.os.Bundle;
import android.text.TextUtils;
import com.bilibili.biligame.card.GameCardButton;
import java.util.UUID;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/data/q.class */
public final class q implements j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f66485b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public Bundle f66484a = new Bundle();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final MusicPagerReportData f66486c = new MusicPagerReportData();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final s f66487d = new s();

    @Override // com.bilibili.music.podcast.data.j
    @NotNull
    public final MusicPagerReportData a() {
        return this.f66486c;
    }

    @Override // com.bilibili.music.podcast.data.j
    public final void b(@NotNull Bundle bundle) {
        this.f66484a = bundle;
        String string = bundle.getString("continue_play", "false");
        this.f66485b = string != null ? Boolean.parseBoolean(string) : false;
        String string2 = this.f66484a.getString("router_pager_report_pv");
        MusicPagerReportData musicPagerReportData = this.f66486c;
        musicPagerReportData.f66425d = string2;
        musicPagerReportData.f66424c = this.f66484a.getString("router_pager_report_spmid");
        musicPagerReportData.f66423b = this.f66484a.getString("from_spmid");
        musicPagerReportData.f66427f = this.f66484a.getString("from_route");
        musicPagerReportData.f66428g = this.f66484a.getString(GameCardButton.extraParamSource);
        musicPagerReportData.f66426e = this.f66484a.getString("content_session_id");
    }

    @Override // com.bilibili.music.podcast.data.j
    @NotNull
    public final Pair<String, String> c() {
        MusicPagerReportData musicPagerReportData = this.f66486c;
        String str = musicPagerReportData.f66426e;
        String string = UUID.randomUUID().toString();
        musicPagerReportData.f66426e = string;
        Pair<String, String> pair = new Pair<>(str, string);
        if (!TextUtils.isEmpty(this.f66484a.getString("content_session_id"))) {
            Bundle bundle = this.f66484a;
            String str2 = (String) pair.getSecond();
            String str3 = str2;
            if (str2 == null) {
                str3 = "";
            }
            bundle.putString("content_session_id", str3);
        }
        return pair;
    }

    @Override // com.bilibili.music.podcast.data.j
    @Nullable
    public final String d(@Nullable String str) {
        return str == null ? this.f66484a.getString("oid") : this.f66484a.getString("oid", str);
    }

    @Override // com.bilibili.music.podcast.data.j
    public final void e() {
        if (Intrinsics.areEqual("from_spmid", "from_spmid")) {
            this.f66486c.f66423b = "";
        }
        this.f66484a.putString("from_spmid", "");
    }

    @Override // com.bilibili.music.podcast.data.j
    @NotNull
    public final s f() {
        return this.f66487d;
    }
}
