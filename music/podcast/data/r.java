package com.bilibili.music.podcast.data;

import android.os.Bundle;
import android.text.TextUtils;
import com.bilibili.biligame.card.GameCardButton;
import com.bilibili.droid.BundleUtil;
import java.util.UUID;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/data/r.class */
public final class r implements j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f66489b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public Bundle f66488a = new Bundle();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f66490c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f66491d = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public String f66492e = "";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final MusicPagerReportData f66493f = new MusicPagerReportData();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final s f66494g = new s();

    @Override // com.bilibili.music.podcast.data.j
    @NotNull
    public final MusicPagerReportData a() {
        return this.f66493f;
    }

    @Override // com.bilibili.music.podcast.data.j
    public final void b(@NotNull Bundle bundle) {
        this.f66488a = bundle;
        String string = bundle.getString("continue_play", "false");
        this.f66489b = string != null ? Boolean.parseBoolean(string) : false;
        this.f66490c = BundleUtil.getInteger(this.f66488a, "share_id", new Integer[]{-1}).intValue();
        this.f66492e = BundleUtil.getString(this.f66488a, "from_route", new String[]{""});
        this.f66491d = BundleUtil.getBoolean(this.f66488a, "expand_top_car", new boolean[]{true});
        this.f66488a.remove("share_id");
        String string2 = this.f66488a.getString("router_pager_report_pv");
        MusicPagerReportData musicPagerReportData = this.f66493f;
        musicPagerReportData.f66425d = string2;
        musicPagerReportData.f66424c = this.f66488a.getString("router_pager_report_spmid");
        musicPagerReportData.f66423b = this.f66488a.getString("from_spmid");
        musicPagerReportData.h = this.f66488a.getString("from_module");
        musicPagerReportData.f66427f = this.f66488a.getString("from_route");
        musicPagerReportData.f66428g = this.f66488a.getString(GameCardButton.extraParamSource);
        musicPagerReportData.f66426e = this.f66488a.getString("content_session_id");
    }

    @Override // com.bilibili.music.podcast.data.j
    @NotNull
    public final Pair<String, String> c() {
        MusicPagerReportData musicPagerReportData = this.f66493f;
        String str = musicPagerReportData.f66426e;
        String string = UUID.randomUUID().toString();
        musicPagerReportData.f66426e = string;
        Pair<String, String> pair = new Pair<>(str, string);
        if (!TextUtils.isEmpty(this.f66488a.getString("content_session_id"))) {
            Bundle bundle = this.f66488a;
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
        return str == null ? this.f66488a.getString("oid") : this.f66488a.getString("oid", str);
    }

    @Override // com.bilibili.music.podcast.data.j
    public final void e() {
        boolean zAreEqual = Intrinsics.areEqual("from_spmid", "from_spmid");
        MusicPagerReportData musicPagerReportData = this.f66493f;
        if (zAreEqual) {
            musicPagerReportData.f66423b = "";
        } else if (Intrinsics.areEqual("from_spmid", "from_module")) {
            musicPagerReportData.h = "";
        }
        this.f66488a.putString("from_spmid", "");
    }

    @Override // com.bilibili.music.podcast.data.j
    @NotNull
    public final s f() {
        return this.f66494g;
    }
}
