package com.bilibili.biligame.bean.task;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/bean/task/SignInBanner.class */
@StabilityInferred(parameters = 0)
public final class SignInBanner {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f62231a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public String f62232b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public String f62233c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public String f62234d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public String f62235e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public String f62236f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f62237g;
    public int h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public TaskItem f62238i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public String f62239j;

    public SignInBanner() {
        this(0, null, null, null, null, null, 0, 0, null, null, 1023, null);
    }

    public SignInBanner(int i7, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, int i8, int i9, @Nullable TaskItem taskItem, @Nullable String str6) {
        this.f62231a = i7;
        this.f62232b = str;
        this.f62233c = str2;
        this.f62234d = str3;
        this.f62235e = str4;
        this.f62236f = str5;
        this.f62237g = i8;
        this.h = i9;
        this.f62238i = taskItem;
        this.f62239j = str6;
    }

    public /* synthetic */ SignInBanner(int i7, String str, String str2, String str3, String str4, String str5, int i8, int i9, TaskItem taskItem, String str6, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? 0 : i7, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? null : str2, (i10 & 8) != 0 ? null : str3, (i10 & 16) != 0 ? null : str4, (i10 & 32) != 0 ? null : str5, (i10 & 64) != 0 ? 0 : i8, (i10 & 128) != 0 ? 0 : i9, (i10 & 256) != 0 ? null : taskItem, (i10 & 512) != 0 ? null : str6);
    }

    @Nullable
    public final String getImage() {
        return this.f62235e;
    }

    @Nullable
    public final String getJumpUrl() {
        return this.f62236f;
    }

    public final int getRewardNum() {
        return this.h;
    }

    @Nullable
    public final String getShowText() {
        return this.f62239j;
    }

    @Nullable
    public final String getSubTitle() {
        return this.f62234d;
    }

    @Nullable
    public final String getTaskId() {
        return this.f62232b;
    }

    @Nullable
    public final TaskItem getTaskItem() {
        return this.f62238i;
    }

    public final int getTaskStatus() {
        return this.f62237g;
    }

    @Nullable
    public final String getTitle() {
        return this.f62233c;
    }

    public final int getType() {
        return this.f62231a;
    }

    public final void setImage(@Nullable String str) {
        this.f62235e = str;
    }

    public final void setJumpUrl(@Nullable String str) {
        this.f62236f = str;
    }

    public final void setRewardNum(int i7) {
        this.h = i7;
    }

    public final void setShowText(@Nullable String str) {
        this.f62239j = str;
    }

    public final void setSubTitle(@Nullable String str) {
        this.f62234d = str;
    }

    public final void setTaskId(@Nullable String str) {
        this.f62232b = str;
    }

    public final void setTaskItem(@Nullable TaskItem taskItem) {
        this.f62238i = taskItem;
    }

    public final void setTaskStatus(int i7) {
        this.f62237g = i7;
    }

    public final void setTitle(@Nullable String str) {
        this.f62233c = str;
    }

    public final void setType(int i7) {
        this.f62231a = i7;
    }
}
