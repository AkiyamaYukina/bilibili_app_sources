package com.bilibili.biligame.card.newcard.bean;

import java.util.Map;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/card/newcard/bean/GameCardClickData.class */
public final class GameCardClickData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public String f62861a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public Map<String, String> f62862b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public Map<String, String> f62863c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public Map<String, String> f62864d;

    @JvmOverloads
    public GameCardClickData() {
        this(null, null, null, null, 15, null);
    }

    @JvmOverloads
    public GameCardClickData(@Nullable String str) {
        this(str, null, null, null, 14, null);
    }

    @JvmOverloads
    public GameCardClickData(@Nullable String str, @Nullable Map<String, String> map) {
        this(str, map, null, null, 12, null);
    }

    @JvmOverloads
    public GameCardClickData(@Nullable String str, @Nullable Map<String, String> map, @Nullable Map<String, String> map2) {
        this(str, map, map2, null, 8, null);
    }

    @JvmOverloads
    public GameCardClickData(@Nullable String str, @Nullable Map<String, String> map, @Nullable Map<String, String> map2, @Nullable Map<String, String> map3) {
        this.f62861a = str;
        this.f62862b = map;
        this.f62863c = map2;
        this.f62864d = map3;
    }

    public /* synthetic */ GameCardClickData(String str, Map map, Map map2, Map map3, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? "" : str, (i7 & 2) != 0 ? null : map, (i7 & 4) != 0 ? null : map2, (i7 & 8) != 0 ? null : map3);
    }

    @Nullable
    public final String getEventId() {
        return this.f62861a;
    }

    @Nullable
    public final Map<String, String> getOriginExtra() {
        return this.f62863c;
    }

    @Nullable
    public final Map<String, String> getReportExtra() {
        return this.f62862b;
    }

    @Nullable
    public final Map<String, String> getRouterExtra() {
        return this.f62864d;
    }

    public final void setEventId(@Nullable String str) {
        this.f62861a = str;
    }

    public final void setOriginExtra(@Nullable Map<String, String> map) {
        this.f62863c = map;
    }

    public final void setReportExtra(@Nullable Map<String, String> map) {
        this.f62862b = map;
    }

    public final void setRouterExtra(@Nullable Map<String, String> map) {
        this.f62864d = map;
    }
}
