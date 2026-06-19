package com.bilibili.biligame.card2;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.biligame.ui.gift.v3.dialog.GiftDialogData;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/card2/a.class */
@StabilityInferred(parameters = 0)
public final class a implements GiftDialogData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public String f62899a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public String f62900b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public String f62901c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public String f62902d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public String f62903e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public String f62904f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f62905g;

    @NotNull
    public final String getDGameBaseId() {
        return this.f62899a;
    }

    @NotNull
    public final String getDGameName() {
        return this.f62900b;
    }

    @NotNull
    public final String getDGiftIds() {
        return this.f62903e;
    }

    @NotNull
    public final String getDPkgName() {
        return this.f62901c;
    }

    @NotNull
    public final String getDVipGiftIds() {
        return this.f62902d;
    }

    @NotNull
    public final String getDVipGiftType() {
        return this.f62904f;
    }

    public final boolean hasBookVersion() {
        return this.f62905g;
    }
}
