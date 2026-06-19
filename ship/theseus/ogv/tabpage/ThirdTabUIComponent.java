package com.bilibili.ship.theseus.ogv.tabpage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.databinding.ViewDataBinding;
import com.bilibili.app.gemini.ui.DataBindingComponent;
import com.bilibili.framework.exposure.core.ExposureEntry;
import com.bilibili.ship.theseus.ogv.tabpage.ActivityTab;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import zu0.AbstractC9255t0;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/tabpage/ThirdTabUIComponent.class */
@StabilityInferred(parameters = 0)
public final class ThirdTabUIComponent extends DataBindingComponent<AbstractC9255t0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final a f94560a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final ColorStateList f94561b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/tabpage/ThirdTabUIComponent$ResType.class */
    public static final class ResType {
        private static final EnumEntries $ENTRIES;
        private static final ResType[] $VALUES;
        public static final ResType TEXT = new ResType("TEXT", 0);
        public static final ResType PNG = new ResType("PNG", 1);

        private static final /* synthetic */ ResType[] $values() {
            return new ResType[]{TEXT, PNG};
        }

        static {
            ResType[] resTypeArr$values = $values();
            $VALUES = resTypeArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(resTypeArr$values);
        }

        private ResType(String str, int i7) {
        }

        @NotNull
        public static EnumEntries<ResType> getEntries() {
            return $ENTRIES;
        }

        public static ResType valueOf(String str) {
            return (ResType) Enum.valueOf(ResType.class, str);
        }

        public static ResType[] values() {
            return (ResType[]) $VALUES.clone();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/tabpage/ThirdTabUIComponent$a.class */
    @StabilityInferred(parameters = 0)
    public static final class a extends androidx.databinding.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final ExposureEntry f94562a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public ResType f94563b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public ResType f94564c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public String f94565d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public String f94566e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        public String f94567f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @NotNull
        public ResType f94568g;
        public boolean h;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.tabpage.ThirdTabUIComponent$a$a, reason: collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/tabpage/ThirdTabUIComponent$a$a.class */
        public static final /* synthetic */ class C0747a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final int[] f94569a;

            static {
                int[] iArr = new int[ActivityTab.Type.values().length];
                try {
                    iArr[ActivityTab.Type.WEB.ordinal()] = 1;
                } catch (NoSuchFieldError e7) {
                }
                try {
                    iArr[ActivityTab.Type.CHAT_HALL.ordinal()] = 2;
                } catch (NoSuchFieldError e8) {
                }
                f94569a = iArr;
            }
        }

        public a(@NotNull ExposureEntry exposureEntry) {
            this.f94562a = exposureEntry;
            ResType resType = ResType.TEXT;
            this.f94563b = resType;
            this.f94564c = resType;
            this.f94565d = "";
            this.f94566e = "";
            this.f94567f = "";
            this.f94568g = resType;
        }
    }

    public ThirdTabUIComponent(@NotNull a aVar, @Nullable ColorStateList colorStateList) {
        this.f94560a = aVar;
        this.f94561b = colorStateList;
    }

    public final Object b(ViewDataBinding viewDataBinding, Continuation continuation) {
        AbstractC9255t0 abstractC9255t0 = (AbstractC9255t0) viewDataBinding;
        abstractC9255t0.q(this.f94560a);
        ColorStateList colorStateList = this.f94561b;
        if (colorStateList != null) {
            abstractC9255t0.f130888x.setTextColor(colorStateList);
        }
        abstractC9255t0.executePendingBindings();
        return Unit.INSTANCE;
    }

    public final ViewDataBinding d(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return AbstractC9255t0.inflate(layoutInflater, viewGroup, false);
    }
}
