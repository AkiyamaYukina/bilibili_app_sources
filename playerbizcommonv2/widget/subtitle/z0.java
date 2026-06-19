package com.bilibili.playerbizcommonv2.widget.subtitle;

import android.util.Log;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.lib.media.resource.LanguageItem;
import com.bilibili.playerbizcommonv2.widget.setting.C5830b;
import com.bilibili.playerbizcommonv2.widget.subtitle.q0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.ScreenModeType;
import tv.danmaku.biliplayerv2.service.AbsFunctionWidgetService;
import tv.danmaku.biliplayerv2.service.FunctionWidgetToken;
import tv.danmaku.biliplayerv2.widget.IFunctionContainer;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/subtitle/z0.class */
@StabilityInferred(parameters = 1)
public final class z0 {

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/subtitle/z0$a.class */
    @StabilityInferred(parameters = 0)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final String f83827a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final String f83828b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public final List<LanguageItem> f83829c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public final LanguageItem f83830d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public final String f83831e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        public final Function2<Integer, LanguageItem, Unit> f83832f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @NotNull
        public final Function1<Integer, Unit> f83833g;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@NotNull String str, @NotNull String str2, @Nullable List<LanguageItem> list, @Nullable LanguageItem languageItem, @NotNull String str3, @NotNull Function2<? super Integer, ? super LanguageItem, Unit> function2, @NotNull Function1<? super Integer, Unit> function1) {
            this.f83827a = str;
            this.f83828b = str2;
            this.f83829c = list;
            this.f83830d = languageItem;
            this.f83831e = str3;
            this.f83832f = function2;
            this.f83833g = function1;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/subtitle/z0$b.class */
    @StabilityInferred(parameters = 1)
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f83834a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final String f83835b;

        public b(boolean z6, @NotNull String str) {
            this.f83834a = z6;
            this.f83835b = str;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f83834a == bVar.f83834a && Intrinsics.areEqual(this.f83835b, bVar.f83835b);
        }

        public final int hashCode() {
            return this.f83835b.hashCode() + (Boolean.hashCode(this.f83834a) * 31);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("OnlySubtitleConfig(badgeEnabled=");
            sb.append(this.f83834a);
            sb.append(", widgetText=");
            return C8770a.a(sb, this.f83835b, ")");
        }
    }

    @Nullable
    public static FunctionWidgetToken a(@NotNull ScreenModeType screenModeType, @NotNull AbsFunctionWidgetService absFunctionWidgetService, @NotNull q0 q0Var, @Nullable a aVar) {
        Class cls;
        int i7;
        FunctionWidgetToken functionWidgetTokenShowWidget;
        q0.a aVar2 = q0.a.f83765a;
        cls = D.class;
        if (!Intrinsics.areEqual(q0Var, aVar2) && !Intrinsics.areEqual(q0Var, q0.b.f83766a)) {
            if (!(q0Var instanceof q0.d)) {
                return null;
            }
            return absFunctionWidgetService.showWidget(Intrinsics.areEqual(q0Var, aVar2) ? x0.class : D.class, screenModeType == ScreenModeType.LANDSCAPE_FULLSCREEN ? new IFunctionContainer.LayoutParams(-1, -1, 4) : new IFunctionContainer.LayoutParams(-1, -2, 8), new v0(q0Var, null));
        }
        if (aVar == null) {
            return null;
        }
        List<LanguageItem> list = aVar.f83829c;
        if (list == null) {
            functionWidgetTokenShowWidget = null;
        } else {
            Log.i("SubtitleAndAiFuncWidgetHelper-showAiRelatedFuncWidgetInternal", "[playerbizcommonv2-SubtitleAndAiFuncWidgetHelper-showAiRelatedFuncWidgetInternal] showAiFunctionWidget");
            boolean z6 = screenModeType == ScreenModeType.VERTICAL_FULLSCREEN;
            IFunctionContainer.LayoutParams layoutParams = z6 ? new IFunctionContainer.LayoutParams(-1, -2, 8) : new IFunctionContainer.LayoutParams(-1, -1, 4);
            layoutParams.setLayoutType(z6 ? 8 : 4);
            List<LanguageItem> list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            int i8 = 0;
            Class cls2 = cls;
            for (Object obj : list2) {
                if (i8 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                final LanguageItem languageItem = (LanguageItem) obj;
                String title = languageItem.getTitle();
                final Function2<Integer, LanguageItem, Unit> function2 = aVar.f83832f;
                final int i9 = i8;
                arrayList.add(new C5830b(i8, title, new Function1(function2, i9, languageItem) { // from class: com.bilibili.playerbizcommonv2.widget.subtitle.y0

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final Function2 f83822a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final int f83823b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final LanguageItem f83824c;

                    {
                        this.f83822a = function2;
                        this.f83823b = i9;
                        this.f83824c = languageItem;
                    }

                    public final Object invoke(Object obj2) {
                        ((Integer) obj2).intValue();
                        this.f83822a.invoke(Integer.valueOf(this.f83823b), this.f83824c);
                        return Unit.INSTANCE;
                    }
                }));
                i8++;
            }
            List mutableList = CollectionsKt.toMutableList(arrayList);
            if (!z6) {
                mutableList.add(0, new C5830b(-1, aVar.f83831e, aVar.f83833g));
            }
            Iterator<LanguageItem> it = list.iterator();
            int i10 = 0;
            while (true) {
                i7 = -1;
                if (!it.hasNext()) {
                    break;
                }
                if (sb0.b.b(it.next(), aVar.f83830d)) {
                    i7 = i10;
                    break;
                }
                i10++;
            }
            v0 v0Var = new v0(q0Var, new u0(mutableList, i7, aVar.f83827a, aVar.f83828b));
            if (Intrinsics.areEqual(q0Var, aVar2)) {
                cls2 = x0.class;
            }
            functionWidgetTokenShowWidget = absFunctionWidgetService.showWidget(cls2, layoutParams, v0Var);
        }
        return functionWidgetTokenShowWidget;
    }
}
