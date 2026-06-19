package com.bilibili.search2.main.ogv;

import HG0.C2068a0;
import UR0.O;
import UR0.e0;
import US0.y;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.appcompat.app.i;
import androidx.compose.animation.core.I;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.font.C4496a;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.alibaba.fastjson.JSONObject;
import com.bapis.bilibili.ad.v1.KBrandPauseLoopImageItemDto;
import com.bilibili.bililive.api.multivoice.ApplyUser;
import com.bilibili.bililive.biz.rights.mystery.TrulyCenterImageSpan;
import com.bilibili.lib.biliweb.share.JSCallback;
import com.bilibili.lib.biliweb.share.WebShareImpl;
import com.bilibili.lib.gson.GsonKt;
import com.bilibili.lib.image2.BiliImageLoader;
import com.bilibili.lib.image2.bean.ScaleType;
import com.bilibili.lib.image2.view.BiliImageView;
import com.bilibili.lib.ui.util.MultipleThemeUtils;
import com.bilibili.search2.halfscreen.g;
import com.bilibili.search2.halfscreen.m;
import com.bilibili.search2.main.BiliMainSearchCoreFragment;
import com.bilibili.search2.main.C6040g;
import com.bilibili.search2.main.ogv.OgvThemeState;
import com.bilibili.search2.main.ogv.a;
import com.bilibili.search2.main.ogv.d;
import com.bilibili.search2.main.ogv.e;
import com.bilibili.search2.main.ogv.f;
import com.bilibili.search2.main.ogv.g;
import com.bilibili.search2.result.ogv.OgvThemeColorHelper;
import com.bilibili.search2.result.ogv.SearchColorModel;
import com.bilibili.search2.utils.B;
import java.util.Map;
import kotlin.Function;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/main/ogv/g.class */
@StabilityInferred(parameters = 0)
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final LifecycleOwner f86887a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final OgvThemeColorHelper f86888b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final a f86889c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final C6040g f86890d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final y f86891e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<OgvThemeState> f86892f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final StateFlow<OgvThemeState> f86893g;

    @NotNull
    public final Channel<e> h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final Flow<e> f86894i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @ColorInt
    public int f86895j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public Drawable f86896k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f86897l;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/main/ogv/g$a.class */
    @StabilityInferred(parameters = 0)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public final Drawable f86898a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public final Drawable f86899b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f86900c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f86901d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f86902e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Nullable
        public final Drawable f86903f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @Nullable
        public final Drawable f86904g;

        @Nullable
        public final Drawable h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final boolean f86905i;

        public a(@Nullable Drawable drawable, @Nullable Drawable drawable2, @ColorInt int i7, @ColorInt int i8, @ColorInt int i9, @Nullable Drawable drawable3, @Nullable Drawable drawable4, @Nullable Drawable drawable5, boolean z6) {
            this.f86898a = drawable;
            this.f86899b = drawable2;
            this.f86900c = i7;
            this.f86901d = i8;
            this.f86902e = i9;
            this.f86903f = drawable3;
            this.f86904g = drawable4;
            this.h = drawable5;
            this.f86905i = z6;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.areEqual(this.f86898a, aVar.f86898a) && Intrinsics.areEqual(this.f86899b, aVar.f86899b) && this.f86900c == aVar.f86900c && this.f86901d == aVar.f86901d && this.f86902e == aVar.f86902e && Intrinsics.areEqual(this.f86903f, aVar.f86903f) && Intrinsics.areEqual(this.f86904g, aVar.f86904g) && Intrinsics.areEqual(this.h, aVar.h) && this.f86905i == aVar.f86905i;
        }

        public final int hashCode() {
            Drawable drawable = this.f86898a;
            int iHashCode = 0;
            int iHashCode2 = drawable == null ? 0 : drawable.hashCode();
            Drawable drawable2 = this.f86899b;
            int iA = I.a(this.f86902e, I.a(this.f86901d, I.a(0, I.a(this.f86900c, ((iHashCode2 * 31) + (drawable2 == null ? 0 : drawable2.hashCode())) * 31, 31), 31), 31), 31);
            Drawable drawable3 = this.f86903f;
            int iHashCode3 = drawable3 == null ? 0 : drawable3.hashCode();
            Drawable drawable4 = this.f86904g;
            int iHashCode4 = drawable4 == null ? 0 : drawable4.hashCode();
            Drawable drawable5 = this.h;
            if (drawable5 != null) {
                iHashCode = drawable5.hashCode();
            }
            return Boolean.hashCode(this.f86905i) + ((((((iA + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode) * 31);
        }

        @NotNull
        public final String toString() {
            Drawable drawable = this.f86898a;
            Drawable drawable2 = this.f86899b;
            Drawable drawable3 = this.f86903f;
            Drawable drawable4 = this.f86904g;
            Drawable drawable5 = this.h;
            StringBuilder sb = new StringBuilder("InitDrawables(initInputBarDrawable=");
            sb.append(drawable);
            sb.append(", ogvInputBarDrawable=");
            sb.append(drawable2);
            sb.append(", initSearchLayoutColor=");
            sb.append(this.f86900c);
            sb.append(", transitionColor=0, initSearchTextColor=");
            sb.append(this.f86901d);
            sb.append(", ogvSearchTextColor=");
            sb.append(this.f86902e);
            sb.append(", initCancelDrawable=");
            sb.append(drawable3);
            sb.append(", ogvCancelDrawable=");
            sb.append(drawable4);
            sb.append(", immerseCancelDrawable=");
            sb.append(drawable5);
            sb.append(", initAiIconDay=");
            return i.a(sb, this.f86905i, ")");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/main/ogv/g$b.class */
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f86906a;

        static {
            int[] iArr = new int[SearchColorModel.StateSource.values().length];
            try {
                iArr[SearchColorModel.StateSource.SLIDE.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[SearchColorModel.StateSource.LOADING.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            try {
                iArr[SearchColorModel.StateSource.DRAW.ordinal()] = 3;
            } catch (NoSuchFieldError e9) {
            }
            f86906a = iArr;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/main/ogv/g$c.class */
    public static final /* synthetic */ class c implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Function1 f86907a;

        public c(Function1 function1) {
            this.f86907a = function1;
        }

        public final boolean equals(@Nullable Object obj) {
            boolean zAreEqual = false;
            if (obj instanceof Observer) {
                zAreEqual = false;
                if (obj instanceof FunctionAdapter) {
                    zAreEqual = Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                }
            }
            return zAreEqual;
        }

        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f86907a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f86907a.invoke(obj);
        }
    }

    public g(@NotNull LifecycleOwner lifecycleOwner, @NotNull OgvThemeColorHelper ogvThemeColorHelper, @NotNull OgvThemeState ogvThemeState, @NotNull a aVar, @Nullable C6040g c6040g, @NotNull y yVar) {
        this.f86887a = lifecycleOwner;
        this.f86888b = ogvThemeColorHelper;
        this.f86889c = aVar;
        this.f86890d = c6040g;
        this.f86891e = yVar;
        MutableStateFlow<OgvThemeState> MutableStateFlow = StateFlowKt.MutableStateFlow(ogvThemeState);
        this.f86892f = MutableStateFlow;
        this.f86893g = FlowKt.asStateFlow(MutableStateFlow);
        Channel<e> channelChannel$default = ChannelKt.Channel$default(Integer.MAX_VALUE, (BufferOverflow) null, (Function1) null, 6, (Object) null);
        this.h = channelChannel$default;
        this.f86894i = FlowKt.receiveAsFlow(channelChannel$default);
        this.f86895j = aVar.f86900c;
        this.f86896k = aVar.f86903f;
        this.f86897l = aVar.f86905i;
        final SearchColorModel searchColorModelB = ogvThemeColorHelper.b();
        searchColorModelB.f88292b.observe(lifecycleOwner, new c(new O(1, this, searchColorModelB)));
        searchColorModelB.f88293c.observe(lifecycleOwner, new c(new Function1(this, searchColorModelB) { // from class: Vs0.a

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final g f25690a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final SearchColorModel f25691b;

            {
                this.f25690a = this;
                this.f25691b = searchColorModelB;
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
            public final Object invoke(Object obj) throws NoWhenBranchMatchedException {
                Unit unit;
                Object value;
                m mVarJf;
                SearchColorModel.a aVar2 = (SearchColorModel.a) obj;
                g gVar = this.f25690a;
                if (gVar.f86888b.d() && aVar2 != null) {
                    SearchColorModel searchColorModel = this.f25691b;
                    Integer value2 = searchColorModel.f88292b.getValue();
                    OgvThemeColorHelper ogvThemeColorHelper2 = gVar.f86888b;
                    int iS = B.s(ogvThemeColorHelper2.f88267b, "#363E53");
                    Bitmap bitmap = ogvThemeColorHelper2.f88270e;
                    float f7 = aVar2.f88306a;
                    if (value2 != null && value2.intValue() == 0) {
                        boolean zAreEqual = Intrinsics.areEqual(searchColorModel.f88299j.getValue(), Boolean.TRUE);
                        C6040g c6040g2 = gVar.f86890d;
                        if (bitmap != null) {
                            int i7 = aVar2.f88307b;
                            gVar.h.trySend-JP2dKIU(new e.b(bitmap, i7));
                            if (c6040g2 != null && (mVarJf = c6040g2.f86832a.jf()) != null) {
                                mVarJf.J0(new g.h(i7));
                            }
                        }
                        if (zAreEqual) {
                            gVar.d(f7, iS, SearchColorModel.StateSource.SLIDE);
                        } else {
                            int iA = f7 >= 1.0f ? iS : f7 <= 0.0f ? 0 : com.bilibili.search2.utils.m.a(f7, iS);
                            gVar.f86895j = iA;
                            MutableStateFlow<OgvThemeState> mutableStateFlow = gVar.f86892f;
                            com.bilibili.search2.main.ogv.d dVar = ((OgvThemeState) mutableStateFlow.getValue()).f86854g;
                            com.bilibili.search2.main.ogv.d dVarA = dVar;
                            if (dVar instanceof d.b) {
                                dVarA = d.b.a((d.b) dVar, 0, Integer.valueOf(iS), Float.valueOf(RangesKt.coerceIn(f7, 0.0f, 1.0f)), 3);
                            }
                            do {
                                value = mutableStateFlow.getValue();
                            } while (!mutableStateFlow.compareAndSet(value, OgvThemeState.a((OgvThemeState) value, gVar.g(iA), null, 0, null, false, false, dVarA, null, null, 446)));
                            if (c6040g2 != null) {
                                c6040g2.d(dVarA);
                            }
                            if (c6040g2 != null) {
                                c6040g2.b(true);
                            }
                        }
                    } else {
                        gVar.d(f7, iS, SearchColorModel.StateSource.SLIDE);
                    }
                    unit = Unit.INSTANCE;
                } else {
                    unit = Unit.INSTANCE;
                }
                return unit;
            }
        }));
        searchColorModelB.f88297g.observe(lifecycleOwner, new c(new Function1(this, searchColorModelB) { // from class: Vs0.b

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final com.bilibili.search2.main.ogv.g f25692a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final SearchColorModel f25693b;

            {
                this.f25692a = this;
                this.f25693b = searchColorModelB;
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
            public final Object invoke(Object obj) throws NoWhenBranchMatchedException {
                Unit unit;
                MutableStateFlow<OgvThemeState> mutableStateFlow;
                Object value;
                Boolean bool = (Boolean) obj;
                com.bilibili.search2.main.ogv.g gVar = this.f25692a;
                if (gVar.f86888b.d() && bool != null) {
                    SearchColorModel searchColorModel = this.f25693b;
                    Integer value2 = searchColorModel.f88292b.getValue();
                    boolean zAreEqual = Intrinsics.areEqual(searchColorModel.f88299j.getValue(), Boolean.TRUE);
                    boolean zBooleanValue = bool.booleanValue();
                    OgvThemeColorHelper ogvThemeColorHelper2 = gVar.f86888b;
                    if (zBooleanValue) {
                        if (((value2 != null && value2.intValue() == 0) || value2 == null) && !zAreEqual) {
                            Bitmap bitmap = ogvThemeColorHelper2.f88270e;
                            if (bitmap != null) {
                                gVar.f86895j = 0;
                                d.b bVar = new d.b(bitmap, 0, null, null);
                                do {
                                    mutableStateFlow = gVar.f86892f;
                                    value = mutableStateFlow.getValue();
                                } while (!mutableStateFlow.compareAndSet(value, OgvThemeState.a((OgvThemeState) value, gVar.g(0), null, 0, null, false, false, bVar, null, null, 446)));
                                C6040g c6040g2 = gVar.f86890d;
                                if (c6040g2 != null) {
                                    c6040g2.d(bVar);
                                }
                                if (c6040g2 != null) {
                                    c6040g2.b(true);
                                }
                                gVar.h.trySend-JP2dKIU(new e.h(bitmap));
                            }
                        } else {
                            gVar.d(0.0f, 0, SearchColorModel.StateSource.DRAW);
                        }
                        gVar.h();
                    } else if (((value2 != null && value2.intValue() == 0) || value2 == null) && !zAreEqual) {
                        gVar.e(ogvThemeColorHelper2.f88269d);
                    } else {
                        gVar.d(0.0f, ogvThemeColorHelper2.f88269d, SearchColorModel.StateSource.LOADING);
                    }
                    unit = Unit.INSTANCE;
                } else {
                    unit = Unit.INSTANCE;
                }
                return unit;
            }
        }));
        searchColorModelB.h.observe(lifecycleOwner, new c(new Function1(this, searchColorModelB) { // from class: Vs0.c

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final com.bilibili.search2.main.ogv.g f25694a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final SearchColorModel f25695b;

            {
                this.f25694a = this;
                this.f25695b = searchColorModelB;
            }

            public final Object invoke(Object obj) {
                Unit unit;
                MutableStateFlow<OgvThemeState> mutableStateFlow;
                Object value;
                OgvThemeState ogvThemeState2;
                int iG;
                OgvThemeState.InputBarStyle inputBarStyle;
                g.a aVar2;
                Drawable drawable;
                Boolean bool = (Boolean) obj;
                com.bilibili.search2.main.ogv.g gVar = this.f25694a;
                if (gVar.f86888b.d()) {
                    Integer value2 = this.f25695b.f88292b.getValue();
                    if ((value2 == null || value2.intValue() == 0) && bool != null) {
                        boolean zBooleanValue = bool.booleanValue();
                        OgvThemeColorHelper ogvThemeColorHelper2 = gVar.f86888b;
                        if (zBooleanValue) {
                            int iS = B.s(ogvThemeColorHelper2.f88267b, "#363E53");
                            d.c cVar = new d.c(iS);
                            do {
                                mutableStateFlow = gVar.f86892f;
                                value = mutableStateFlow.getValue();
                                ogvThemeState2 = (OgvThemeState) value;
                                iG = gVar.g(iS);
                                inputBarStyle = OgvThemeState.InputBarStyle.OGV;
                                aVar2 = gVar.f86889c;
                                Drawable drawable2 = aVar2.f86904g;
                                drawable = drawable2;
                                if (ogvThemeColorHelper2.e()) {
                                    drawable = aVar2.h;
                                    if (drawable == null) {
                                        drawable = drawable2;
                                    }
                                }
                            } while (!mutableStateFlow.compareAndSet(value, OgvThemeState.a(ogvThemeState2, iG, inputBarStyle, aVar2.f86902e, drawable, true, true, cVar, null, null, 384)));
                            C6040g c6040g2 = gVar.f86890d;
                            if (c6040g2 != null) {
                                c6040g2.d(cVar);
                            }
                            if (c6040g2 != null) {
                                c6040g2.b(true);
                            }
                        } else {
                            gVar.i(ogvThemeColorHelper2.f88270e);
                        }
                        unit = Unit.INSTANCE;
                    } else {
                        unit = Unit.INSTANCE;
                    }
                } else {
                    unit = Unit.INSTANCE;
                }
                return unit;
            }
        }));
        final int i7 = 0;
        searchColorModelB.f88298i.observe(lifecycleOwner, new c(new Function1(i7, searchColorModelB, this) { // from class: Vs0.d

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f25696a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Object f25697b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final Object f25698c;

            {
                this.f25696a = i7;
                this.f25697b = searchColorModelB;
                this.f25698c = this;
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
            /* JADX WARN: Multi-variable type inference failed */
            public final Object invoke(Object obj) throws NoWhenBranchMatchedException {
                Unit unit;
                switch (this.f25696a) {
                    case 0:
                        Boolean bool = (Boolean) obj;
                        if (bool != null) {
                            SearchColorModel searchColorModel = (SearchColorModel) this.f25697b;
                            Integer value = searchColorModel.f88292b.getValue();
                            boolean zAreEqual = Intrinsics.areEqual(searchColorModel.f88299j.getValue(), Boolean.TRUE);
                            boolean zBooleanValue = bool.booleanValue();
                            com.bilibili.search2.main.ogv.g gVar = (com.bilibili.search2.main.ogv.g) this.f25698c;
                            if (!zBooleanValue) {
                                gVar.c();
                                gVar.b();
                                gVar.a();
                            } else if (((value != null && value.intValue() == 0) || value == null) && !zAreEqual) {
                                gVar.e(gVar.f86888b.f88269d);
                                gVar.f();
                                gVar.h();
                            } else {
                                gVar.d(0.0f, gVar.f86888b.f88269d, SearchColorModel.StateSource.LOADING);
                            }
                            unit = Unit.INSTANCE;
                        } else {
                            unit = Unit.INSTANCE;
                        }
                        break;
                    case 1:
                        BiliImageView biliImageView = (BiliImageView) obj;
                        MutableState mutableState = (MutableState) this.f25698c;
                        String str = (String) mutableState.getValue();
                        KBrandPauseLoopImageItemDto kBrandPauseLoopImageItemDto = (KBrandPauseLoopImageItemDto) this.f25697b;
                        if (!Intrinsics.areEqual(str, kBrandPauseLoopImageItemDto.getUrl())) {
                            BiliImageLoader.INSTANCE.with(biliImageView.getContext()).actualImageScaleType(ScaleType.CENTER_CROP).useRaw().url(kBrandPauseLoopImageItemDto.getUrl()).into(biliImageView);
                            mutableState.setValue(kBrandPauseLoopImageItemDto.getUrl());
                        }
                        break;
                    case 2:
                        TextView textView = (TextView) this.f25698c;
                        Drawable drawable = (Drawable) obj;
                        SpannableString spannableString = new SpannableString(C4496a.a("imgPlaceholder ", ((ApplyUser) this.f25697b).userName));
                        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
                        spannableString.setSpan(new TrulyCenterImageSpan(drawable), 0, 14, 17);
                        textView.setText(spannableString);
                        break;
                    default:
                        boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                        JSCallback jSCallback = (JSCallback) this.f25697b;
                        if (jSCallback != null) {
                            String str2 = (String) this.f25698c;
                            String str3 = str2;
                            if (str2 == null) {
                                str3 = "";
                            }
                            jSCallback.callbackToJs(new Object[]{str3, new JSONObject((Map<String, Object>) MapsKt.mapOf(TuplesKt.to("state", Integer.valueOf(!zBooleanValue2 ? 1 : 0))))});
                        }
                        break;
                }
                return Unit.INSTANCE;
            }
        }));
        final int i8 = 0;
        searchColorModelB.f88299j.observe(lifecycleOwner, new c(new Function1(i8, this, searchColorModelB) { // from class: Vs0.e

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f25699a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Object f25700b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final Object f25701c;

            {
                this.f25699a = i8;
                this.f25700b = this;
                this.f25701c = searchColorModelB;
            }

            public final Object invoke(Object obj) {
                Integer value;
                Unit unit;
                switch (this.f25699a) {
                    case 0:
                        Boolean bool = (Boolean) obj;
                        com.bilibili.search2.main.ogv.g gVar = (com.bilibili.search2.main.ogv.g) this.f25700b;
                        if (gVar.f86888b.d() && (value = ((SearchColorModel) this.f25701c).f88292b.getValue()) != null && value.intValue() == 0) {
                            OgvThemeColorHelper ogvThemeColorHelper2 = gVar.f86888b;
                            if (ogvThemeColorHelper2.f88278n && bool != null) {
                                if (bool.booleanValue()) {
                                    gVar.c();
                                    gVar.b();
                                    gVar.a();
                                } else {
                                    gVar.i(ogvThemeColorHelper2.f88270e);
                                    gVar.f();
                                    gVar.h();
                                }
                                unit = Unit.INSTANCE;
                            } else {
                                unit = Unit.INSTANCE;
                            }
                        } else {
                            unit = Unit.INSTANCE;
                        }
                        break;
                    case 1:
                        ((TextView) this.f25700b).setText(((ApplyUser) this.f25701c).userName);
                        break;
                    default:
                        String str = (String) obj;
                        JSCallback jSCallback = (JSCallback) this.f25700b;
                        if (jSCallback != null) {
                            String str2 = (String) this.f25701c;
                            String str3 = str2;
                            if (str2 == null) {
                                str3 = "";
                            }
                            jSCallback.callbackToJs(new Object[]{str3, GsonKt.getSGlobalGson().fromJson(GsonKt.toJsonString(MapsKt.mapOf(TuplesKt.to("extMsg", str))), new WebShareImpl.b().getType())});
                        }
                        break;
                }
                return Unit.INSTANCE;
            }
        }));
        searchColorModelB.f88300k.observe(lifecycleOwner, new c(new Vs0.f(this, 0)));
        searchColorModelB.f88305p.observe(lifecycleOwner, new c(new C2068a0(this, 1)));
        searchColorModelB.f88301l.observe(lifecycleOwner, new c(new Ff1.m(this, 2)));
        searchColorModelB.f88304o.observe(lifecycleOwner, new c(new e0(this, 1)));
    }

    public final void a() {
        MutableStateFlow<OgvThemeState> mutableStateFlow;
        Object value;
        OgvThemeState ogvThemeState;
        a.C0582a c0582a;
        do {
            mutableStateFlow = this.f86892f;
            value = mutableStateFlow.getValue();
            ogvThemeState = (OgvThemeState) value;
            c0582a = a.C0582a.f86856a;
        } while (!mutableStateFlow.compareAndSet(value, OgvThemeState.a(ogvThemeState, 0, null, 0, null, false, false, null, null, c0582a, 255)));
        C6040g c6040g = this.f86890d;
        if (c6040g != null) {
            c6040g.a(c0582a);
        }
    }

    public final void b() {
        MutableStateFlow<OgvThemeState> mutableStateFlow;
        Object value;
        OgvThemeState ogvThemeState;
        f.a aVar;
        do {
            mutableStateFlow = this.f86892f;
            value = mutableStateFlow.getValue();
            ogvThemeState = (OgvThemeState) value;
            aVar = f.a.f86884a;
        } while (!mutableStateFlow.compareAndSet(value, OgvThemeState.a(ogvThemeState, 0, null, 0, null, false, false, null, aVar, null, 383)));
        C6040g c6040g = this.f86890d;
        if (c6040g != null) {
            c6040g.c(aVar);
        }
    }

    public final void c() {
        MutableStateFlow<OgvThemeState> mutableStateFlow;
        Object value;
        OgvThemeState ogvThemeState;
        a aVar;
        OgvThemeState.InputBarStyle inputBarStyle;
        Drawable drawable;
        d.a aVar2;
        do {
            mutableStateFlow = this.f86892f;
            value = mutableStateFlow.getValue();
            ogvThemeState = (OgvThemeState) value;
            aVar = this.f86889c;
            inputBarStyle = OgvThemeState.InputBarStyle.INIT;
            drawable = aVar.f86903f;
            aVar2 = d.a.f86868a;
        } while (!mutableStateFlow.compareAndSet(value, OgvThemeState.a(ogvThemeState, aVar.f86900c, inputBarStyle, aVar.f86901d, drawable, aVar.f86905i, false, aVar2, null, a.C0582a.f86856a, 128)));
        C6040g c6040g = this.f86890d;
        if (c6040g != null) {
            c6040g.d(aVar2);
        }
        if (c6040g != null) {
            c6040g.b(false);
        }
        this.h.trySend-JP2dKIU(e.a.f86874a);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final void d(float f7, @ColorInt int i7, SearchColorModel.StateSource stateSource) throws NoWhenBranchMatchedException {
        int i8 = b.f86906a[stateSource.ordinal()];
        if (i8 == 1) {
            this.f86895j = com.bilibili.search2.utils.m.a(f7, i7);
            return;
        }
        a aVar = this.f86889c;
        if (i8 == 2) {
            this.f86895j = i7;
            this.f86896k = aVar.f86904g;
            this.f86897l = true;
        } else {
            if (i8 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            this.f86895j = 0;
            this.f86896k = aVar.f86904g;
            this.f86897l = true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(@androidx.annotation.ColorInt int r15) {
        /*
            r14 = this;
            r0 = r14
            com.bilibili.search2.main.ogv.g$a r0 = r0.f86889c
            r18 = r0
            r0 = r14
            r1 = 0
            r0.f86895j = r1
            r0 = r14
            r1 = r18
            android.graphics.drawable.Drawable r1 = r1.f86904g
            r0.f86896k = r1
            r0 = r14
            r1 = 1
            r0.f86897l = r1
            com.bilibili.search2.main.ogv.d$c r0 = new com.bilibili.search2.main.ogv.d$c
            r1 = r0
            r2 = r15
            r1.<init>(r2)
            r17 = r0
        L22:
            r0 = r14
            kotlinx.coroutines.flow.MutableStateFlow<com.bilibili.search2.main.ogv.OgvThemeState> r0 = r0.f86892f
            r24 = r0
            r0 = r24
            java.lang.Object r0 = r0.getValue()
            r23 = r0
            r0 = r23
            com.bilibili.search2.main.ogv.OgvThemeState r0 = (com.bilibili.search2.main.ogv.OgvThemeState) r0
            r25 = r0
            r0 = r14
            r1 = 0
            int r0 = r0.g(r1)
            r16 = r0
            com.bilibili.search2.main.ogv.OgvThemeState$InputBarStyle r0 = com.bilibili.search2.main.ogv.OgvThemeState.InputBarStyle.OGV
            r22 = r0
            r0 = r18
            android.graphics.drawable.Drawable r0 = r0.f86904g
            r21 = r0
            r0 = r14
            com.bilibili.search2.result.ogv.OgvThemeColorHelper r0 = r0.f86888b
            boolean r0 = r0.e()
            if (r0 == 0) goto L64
            r0 = r18
            android.graphics.drawable.Drawable r0 = r0.h
            r20 = r0
            r0 = r20
            r19 = r0
            r0 = r20
            if (r0 != 0) goto L68
        L64:
            r0 = r21
            r19 = r0
        L68:
            r0 = r24
            r1 = r23
            r2 = r25
            r3 = r16
            r4 = r22
            r5 = r18
            int r5 = r5.f86902e
            r6 = r19
            r7 = 1
            r8 = 1
            r9 = r17
            r10 = 0
            r11 = 0
            r12 = 384(0x180, float:5.38E-43)
            com.bilibili.search2.main.ogv.OgvThemeState r2 = com.bilibili.search2.main.ogv.OgvThemeState.a(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            boolean r0 = r0.compareAndSet(r1, r2)
            if (r0 == 0) goto Lbc
            r0 = r14
            com.bilibili.search2.main.g r0 = r0.f86890d
            r18 = r0
            r0 = r18
            if (r0 == 0) goto L9c
            r0 = r18
            r1 = r17
            r0.d(r1)
        L9c:
            r0 = r18
            if (r0 == 0) goto La7
            r0 = r18
            r1 = 1
            r0.b(r1)
        La7:
            com.bilibili.search2.main.ogv.e$i r0 = new com.bilibili.search2.main.ogv.e$i
            r1 = r0
            r2 = r15
            r1.<init>(r2)
            r17 = r0
            r0 = r14
            kotlinx.coroutines.channels.Channel<com.bilibili.search2.main.ogv.e> r0 = r0.h
            r1 = r17
            java.lang.Object r0 = r0.trySend-JP2dKIU(r1)
            return
        Lbc:
            goto L22
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.search2.main.ogv.g.e(int):void");
    }

    public final void f() {
        MutableStateFlow<OgvThemeState> mutableStateFlow;
        Object value;
        Context context = ((BiliMainSearchCoreFragment) this.f86891e.b).getContext();
        if (context == null) {
            return;
        }
        OgvThemeColorHelper ogvThemeColorHelper = this.f86888b;
        Boolean value2 = ogvThemeColorHelper.b().f88298i.getValue();
        Boolean bool = Boolean.TRUE;
        if (!Intrinsics.areEqual(value2, bool) || ((!MultipleThemeUtils.isNightTheme(context) || !ogvThemeColorHelper.b().f88291a) && !Intrinsics.areEqual(ogvThemeColorHelper.b().f88301l.getValue(), bool))) {
            b();
            return;
        }
        f.b bVar = new f.b(ogvThemeColorHelper.f88277m, ogvThemeColorHelper.b().f88302m);
        do {
            mutableStateFlow = this.f86892f;
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, OgvThemeState.a((OgvThemeState) value, 0, null, 0, null, false, false, null, bVar, null, 383)));
        C6040g c6040g = this.f86890d;
        if (c6040g != null) {
            c6040g.c(bVar);
        }
    }

    @ColorInt
    public final int g(@ColorInt int i7) {
        int i8 = i7;
        if (i7 == 0) {
            OgvThemeColorHelper ogvThemeColorHelper = this.f86888b;
            i8 = i7;
            if (ogvThemeColorHelper.f88266a != null) {
                i8 = i7;
                if (Intrinsics.areEqual(ogvThemeColorHelper.b().h.getValue(), Boolean.TRUE)) {
                    i8 = ((OgvThemeState) this.f86892f.getValue()).f86848a;
                }
            }
        }
        return i8;
    }

    public final void h() {
        MutableStateFlow<OgvThemeState> mutableStateFlow;
        Object value;
        OgvThemeColorHelper ogvThemeColorHelper = this.f86888b;
        if (!ogvThemeColorHelper.d()) {
            a();
            return;
        }
        Integer value2 = ogvThemeColorHelper.b().f88292b.getValue();
        if (value2 == null || value2.intValue() != 0 || Intrinsics.areEqual(ogvThemeColorHelper.b().f88299j.getValue(), Boolean.TRUE)) {
            a();
            return;
        }
        com.bilibili.search2.main.ogv.a value3 = ogvThemeColorHelper.b().f88304o.getValue();
        com.bilibili.search2.main.ogv.a aVar = value3;
        if (value3 == null) {
            aVar = a.C0582a.f86856a;
        }
        do {
            mutableStateFlow = this.f86892f;
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, OgvThemeState.a((OgvThemeState) value, 0, null, 0, null, false, false, null, null, aVar, 255)));
        C6040g c6040g = this.f86890d;
        if (c6040g != null) {
            c6040g.a(aVar);
        }
    }

    public final void i(Bitmap bitmap) {
        d cVar;
        Object c0583e;
        MutableStateFlow<OgvThemeState> mutableStateFlow;
        Object value;
        OgvThemeState ogvThemeState;
        int iG;
        OgvThemeState.InputBarStyle inputBarStyle;
        a aVar;
        Drawable drawable;
        m mVarJf;
        OgvThemeColorHelper ogvThemeColorHelper = this.f86888b;
        boolean zAreEqual = Intrinsics.areEqual(ogvThemeColorHelper.b().f88297g.getValue(), Boolean.TRUE);
        C6040g c6040g = this.f86890d;
        if (zAreEqual) {
            Float f7 = null;
            d.b bVar = (c6040g == null || (mVarJf = c6040g.f86832a.jf()) == null) ? null : mVarJf.f86615g;
            if (bitmap != null) {
                int i7 = bVar != null ? bVar.f86870b : 0;
                Integer num = bVar != null ? bVar.f86871c : null;
                if (bVar != null) {
                    f7 = bVar.f86872d;
                }
                cVar = new d.b(bitmap, i7, num, f7);
            } else {
                cVar = d.a.f86868a;
            }
            c0583e = new e.C0583e(bitmap);
        } else {
            cVar = new d.c(this.f86895j);
            c0583e = e.f.f86880a;
        }
        boolean z6 = !(cVar instanceof d.a);
        do {
            mutableStateFlow = this.f86892f;
            value = mutableStateFlow.getValue();
            ogvThemeState = (OgvThemeState) value;
            iG = g(this.f86895j);
            inputBarStyle = OgvThemeState.InputBarStyle.OGV;
            aVar = this.f86889c;
            Drawable drawable2 = this.f86896k;
            drawable = drawable2;
            if (ogvThemeColorHelper.e()) {
                drawable = aVar.h;
                if (drawable == null) {
                    drawable = drawable2;
                }
            }
        } while (!mutableStateFlow.compareAndSet(value, OgvThemeState.a(ogvThemeState, iG, inputBarStyle, aVar.f86902e, drawable, this.f86897l, true, cVar, null, null, 384)));
        if (c6040g != null) {
            c6040g.d(cVar);
        }
        if (c6040g != null) {
            c6040g.b(z6);
        }
        this.h.trySend-JP2dKIU(c0583e);
    }
}
