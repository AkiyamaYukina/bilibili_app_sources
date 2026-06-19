package com.bilibili.playerbizcommonv2.danmaku.setting.v2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.annotation.ColorRes;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.viewbinding.ViewBinding;
import com.bilibili.lib.theme.R$color;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/setting/v2/I.class */
@StabilityInferred(parameters = 0)
public final class I extends com.bilibili.app.gemini.ui.m<Dr0.d> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final a f81349a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Function0<Unit> f81350b;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/setting/v2/I$a.class */
    @StabilityInferred(parameters = 0)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final String f81351a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final String f81352b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final StateFlow<Boolean> f81353c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f81354d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f81355e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f81356f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f81357g;
        public final int h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final int f81358i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final int f81359j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        @NotNull
        public final DanmakuSettingsStyle f81360k;

        public a(@NotNull String str, @NotNull String str2, @NotNull StateFlow<Boolean> stateFlow, @ColorRes int i7, @ColorRes int i8, @ColorRes int i9, @ColorRes int i10, @ColorRes int i11, @ColorRes int i12, @ColorRes int i13, @NotNull DanmakuSettingsStyle danmakuSettingsStyle) {
            this.f81351a = str;
            this.f81352b = str2;
            this.f81353c = stateFlow;
            this.f81354d = i7;
            this.f81355e = i8;
            this.f81356f = i9;
            this.f81357g = i10;
            this.h = i11;
            this.f81358i = i12;
            this.f81359j = i13;
            this.f81360k = danmakuSettingsStyle;
        }

        public /* synthetic */ a(String str, String str2, StateFlow stateFlow, int i7, int i8, int i9, int i10, int i11, int i12, int i13, DanmakuSettingsStyle danmakuSettingsStyle, int i14) {
            this(str, (i14 & 2) != 0 ? "" : str2, stateFlow, (i14 & 8) != 0 ? R$color.Text1 : i7, (i14 & 16) != 0 ? R$color.Text2 : i8, (i14 & 32) != 0 ? R$color.Bg1_float : i9, (i14 & 64) != 0 ? R$color.Graph_white : i10, (i14 & 128) != 0 ? R$color.Pi5 : i11, (i14 & 256) != 0 ? R$color.Graph_bg_thick : i12, (i14 & 512) != 0 ? R$color.Line_regular : i13, (i14 & 1024) != 0 ? DanmakuSettingsStyle.MIDDLE : danmakuSettingsStyle);
        }
    }

    public I(@NotNull a aVar, @NotNull Function0<Unit> function0) {
        this.f81349a = aVar;
        this.f81350b = function0;
    }

    public final Object a(ViewBinding viewBinding, Continuation continuation) {
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new DanmakuSettingsSwitchComponent$bind$2((Dr0.d) viewBinding, this, null), continuation);
        if (objCoroutineScope != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            objCoroutineScope = Unit.INSTANCE;
        }
        return objCoroutineScope;
    }

    public final ViewBinding b(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return Dr0.d.inflate(LayoutInflater.from(context), viewGroup, false);
    }

    @NotNull
    public final Object contentEqualityKey() {
        a aVar = this.f81349a;
        return new Pair(aVar.f81353c.getValue(), aVar.f81360k);
    }

    @NotNull
    public final Object identityEqualityKey() {
        return this.f81349a.f81351a;
    }
}
