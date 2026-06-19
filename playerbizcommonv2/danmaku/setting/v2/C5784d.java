package com.bilibili.playerbizcommonv2.danmaku.setting.v2;

import android.content.Context;
import android.view.ViewGroup;
import androidx.annotation.DrawableRes;
import androidx.annotation.StringRes;
import androidx.compose.runtime.C4277b;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.ViewCompositionStrategy;
import com.bilibili.app.gemini.ui.UIComponent;
import com.bilibili.compose.theme.BiliThemeKt;
import com.bilibili.compose.theme.ThemeStrategy;
import com.bilibili.lib.theme.R$color;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.bili.ui.main2.mineV2.MineTeenagersFragment;

/* JADX INFO: renamed from: com.bilibili.playerbizcommonv2.danmaku.setting.v2.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/setting/v2/d.class */
@StabilityInferred(parameters = 0)
public final class C5784d implements UIComponent<UIComponent.b<ComposeView>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final a f81406a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Function1<Integer, Unit> f81407b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Function0<Unit> f81408c;

    /* JADX INFO: renamed from: com.bilibili.playerbizcommonv2.danmaku.setting.v2.d$a */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/setting/v2/d$a.class */
    @StabilityInferred(parameters = 0)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final String f81409a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f81410b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final String f81411c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final MutableStateFlow f81412d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public final DanmakuSettingsStyle f81413e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f81414f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f81415g;
        public final int h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final int f81416i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final int f81417j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final int f81418k;

        public a() {
            throw null;
        }

        public a(String str, MutableStateFlow mutableStateFlow, DanmakuSettingsStyle danmakuSettingsStyle, int i7, int i8, int i9, int i10, int i11, int i12) {
            i7 = (i12 & 32) != 0 ? R$color.Bg1_float : i7;
            i8 = (i12 & 64) != 0 ? R$color.Text1 : i8;
            i9 = (i12 & 128) != 0 ? R$color.Graph_bg_thin_float : i9;
            i10 = (i12 & 256) != 0 ? R$color.Text1 : i10;
            int i13 = R$color.Brand_pink;
            i11 = (i12 & 1024) != 0 ? R$color.Line_regular : i11;
            this.f81409a = str;
            this.f81410b = 0;
            this.f81411c = "帮助";
            this.f81412d = mutableStateFlow;
            this.f81413e = danmakuSettingsStyle;
            this.f81414f = i7;
            this.f81415g = i8;
            this.h = i9;
            this.f81416i = i10;
            this.f81417j = i13;
            this.f81418k = i11;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.areEqual(this.f81409a, aVar.f81409a) && this.f81410b == aVar.f81410b && Intrinsics.areEqual(this.f81411c, aVar.f81411c) && Intrinsics.areEqual(this.f81412d, aVar.f81412d) && this.f81413e == aVar.f81413e && this.f81414f == aVar.f81414f && this.f81415g == aVar.f81415g && this.h == aVar.h && this.f81416i == aVar.f81416i && this.f81417j == aVar.f81417j && this.f81418k == aVar.f81418k;
        }

        public final int hashCode() {
            int iA = I.E.a(androidx.compose.animation.core.I.a(this.f81410b, this.f81409a.hashCode() * 31, 31), 31, this.f81411c);
            int iHashCode = this.f81412d.hashCode();
            return Integer.hashCode(this.f81418k) + androidx.compose.animation.core.I.a(this.f81417j, androidx.compose.animation.core.I.a(this.f81416i, androidx.compose.animation.core.I.a(this.h, androidx.compose.animation.core.I.a(this.f81415g, androidx.compose.animation.core.I.a(this.f81414f, (this.f81413e.hashCode() + ((iHashCode + iA) * 31)) * 31, 31), 31), 31), 31), 31);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("DanmakuBlockConfig(title=");
            sb.append(this.f81409a);
            sb.append(", icon=");
            sb.append(this.f81410b);
            sb.append(", iconDesc=");
            sb.append(this.f81411c);
            sb.append(", list=");
            sb.append(this.f81412d);
            sb.append(", style=");
            sb.append(this.f81413e);
            sb.append(", bgColor=");
            sb.append(this.f81414f);
            sb.append(", titleTextColor=");
            sb.append(this.f81415g);
            sb.append(", itemBgColor=");
            sb.append(this.h);
            sb.append(", itemTextColor=");
            sb.append(this.f81416i);
            sb.append(", itemSelectedColor=");
            sb.append(this.f81417j);
            sb.append(", dividerColor=");
            return C4277b.a(this.f81418k, ")", sb);
        }
    }

    /* JADX INFO: renamed from: com.bilibili.playerbizcommonv2.danmaku.setting.v2.d$b */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/setting/v2/d$b.class */
    @StabilityInferred(parameters = 1)
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f81419a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f81420b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f81421c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f81422d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f81423e;

        public b(@DrawableRes int i7, @DrawableRes int i8, @StringRes int i9, boolean z6) {
            this.f81419a = i7;
            this.f81420b = i8;
            this.f81421c = i9;
            this.f81422d = z6;
            this.f81423e = z6 ? i8 : i7;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f81419a == bVar.f81419a && this.f81420b == bVar.f81420b && this.f81421c == bVar.f81421c && this.f81422d == bVar.f81422d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f81422d) + androidx.compose.animation.core.I.a(this.f81421c, androidx.compose.animation.core.I.a(this.f81420b, Integer.hashCode(this.f81419a) * 31, 31), 31);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("Item(enableIcon=");
            sb.append(this.f81419a);
            sb.append(", disableIcon=");
            sb.append(this.f81420b);
            sb.append(", text=");
            sb.append(this.f81421c);
            sb.append(", checked=");
            return androidx.appcompat.app.i.a(sb, this.f81422d, ")");
        }
    }

    public C5784d(a aVar, Function1 function1) {
        S3.u uVar = new S3.u(3);
        this.f81406a = aVar;
        this.f81407b = function1;
        this.f81408c = uVar;
    }

    public final Object bindToView(UIComponent.ViewEntry viewEntry, Continuation continuation) {
        final int i7 = 0;
        ((ComposeView) ((UIComponent.b) viewEntry).a).setContent(ComposableLambdaKt.composableLambdaInstance(1023374194, true, new Function2(this, i7) { // from class: com.bilibili.playerbizcommonv2.danmaku.setting.v2.a

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f81400a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Object f81401b;

            {
                this.f81400a = i7;
                this.f81401b = this;
            }

            public final Object invoke(Object obj, Object obj2) {
                switch (this.f81400a) {
                    case 0:
                        Composer composer = (Composer) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1023374194, iIntValue, -1, "com.bilibili.playerbizcommonv2.danmaku.setting.v2.DanmakuSettingsBlockComponent.bindToView.<anonymous> (DanmakuSettingsBlockComponent.kt:54)");
                            }
                            final C5784d c5784d = (C5784d) this.f81401b;
                            final int i8 = 0;
                            BiliThemeKt.BiliTheme((ThemeStrategy) null, false, ComposableLambdaKt.rememberComposableLambda(1285981482, true, new Function2(c5784d, i8) { // from class: com.bilibili.playerbizcommonv2.danmaku.setting.v2.b

                                /* JADX INFO: renamed from: a, reason: collision with root package name */
                                public final int f81402a;

                                /* JADX INFO: renamed from: b, reason: collision with root package name */
                                public final Object f81403b;

                                {
                                    this.f81402a = i8;
                                    this.f81403b = c5784d;
                                }

                                /* JADX WARN: Removed duplicated region for block: B:105:0x071e  */
                                /* JADX WARN: Removed duplicated region for block: B:22:0x00e9  */
                                /* JADX WARN: Removed duplicated region for block: B:78:0x04a8  */
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                                */
                                public final java.lang.Object invoke(java.lang.Object r27, java.lang.Object r28) {
                                    /*
                                        Method dump skipped, instruction units count: 2288
                                        To view this dump change 'Code comments level' option to 'DEBUG'
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playerbizcommonv2.danmaku.setting.v2.C5782b.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
                                }
                            }, composer, 54), composer, 384, 3);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        } else {
                            composer.skipToGroupEnd();
                        }
                        break;
                    default:
                        Composer composer2 = (Composer) obj;
                        int iIntValue2 = ((Integer) obj2).intValue();
                        if (composer2.shouldExecute((iIntValue2 & 3) != 2, iIntValue2 & 1)) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1062143725, iIntValue2, -1, "tv.danmaku.bili.ui.main2.mineV2.MineTeenagersFragment.onCreateView.<anonymous>.<anonymous> (MineTeenagersFragment.kt:44)");
                            }
                            final MineTeenagersFragment mineTeenagersFragment = (MineTeenagersFragment) this.f81401b;
                            final int i9 = 2;
                            BiliThemeKt.BiliTheme((ThemeStrategy) null, false, ComposableLambdaKt.rememberComposableLambda(1117096539, true, new Function2(mineTeenagersFragment, i9) { // from class: com.bilibili.playerbizcommonv2.danmaku.setting.v2.b

                                /* JADX INFO: renamed from: a, reason: collision with root package name */
                                public final int f81402a;

                                /* JADX INFO: renamed from: b, reason: collision with root package name */
                                public final Object f81403b;

                                {
                                    this.f81402a = i9;
                                    this.f81403b = mineTeenagersFragment;
                                }

                                /* JADX WARN: Removed duplicated region for block: B:105:0x071e  */
                                /* JADX WARN: Removed duplicated region for block: B:22:0x00e9  */
                                /* JADX WARN: Removed duplicated region for block: B:78:0x04a8  */
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                                */
                                public final java.lang.Object invoke(java.lang.Object r27, java.lang.Object r28) {
                                    /*
                                        Method dump skipped, instruction units count: 2288
                                        To view this dump change 'Code comments level' option to 'DEBUG'
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playerbizcommonv2.danmaku.setting.v2.C5782b.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
                                }
                            }, composer2, 54), composer2, 384, 3);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        } else {
                            composer2.skipToGroupEnd();
                        }
                        break;
                }
                return Unit.INSTANCE;
            }
        }));
        return Unit.INSTANCE;
    }

    @NotNull
    public final Object contentEqualityKey() {
        Iterable iterable = (Iterable) this.f81406a.f81412d.getValue();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(Boolean.valueOf(((b) it.next()).f81422d));
        }
        return arrayList.toArray(new Boolean[0]);
    }

    public final UIComponent.ViewEntry createViewEntry(Context context, ViewGroup viewGroup) {
        ComposeView composeView = new ComposeView(context, null, 0, 6, null);
        composeView.setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnDetachedFromWindowOrReleasedFromPool.INSTANCE);
        return new UIComponent.b(composeView);
    }

    @NotNull
    public final Object identityEqualityKey() {
        return this.f81406a.f81409a;
    }
}
