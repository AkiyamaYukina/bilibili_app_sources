package com.bilibili.ship.theseus.united.page.color;

import android.graphics.Color;
import androidx.annotation.ColorInt;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bapis.bilibili.app.viewunite.v1.ActivityResource;
import com.bapis.bilibili.app.viewunite.v1.ViewReply;
import com.google.gson.reflect.TypeToken;
import javax.inject.Inject;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/color/ActivityColorRepository.class */
@StabilityInferred(parameters = 0)
public final class ActivityColorRepository {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f99180a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final c f99181b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f99182c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<a> f99183d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow f99184e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<a> f99185f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow f99186g;

    @NotNull
    public final MutableStateFlow<a> h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow f99187i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<a> f99188j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow f99189k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<a> f99190l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow f99191m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<a> f99192n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow f99193o;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.color.ActivityColorRepository$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/color/ActivityColorRepository$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;
        final ActivityColorRepository this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.color.ActivityColorRepository$1$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/color/ActivityColorRepository$1$a.class */
        public static final class a extends TypeToken<ThemeConfig> {
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ActivityColorRepository activityColorRepository, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = activityColorRepository;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:46:0x011e  */
        /* JADX WARN: Removed duplicated region for block: B:50:0x014b  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                Method dump skipped, instruction units count: 348
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.color.ActivityColorRepository.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/color/ActivityColorRepository$a.class */
    @StabilityInferred(parameters = 1)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f99194a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final String f99195b;

        public a(@ColorInt int i7, @NotNull String str) {
            this.f99194a = i7;
            this.f99195b = str;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f99194a == aVar.f99194a && Intrinsics.areEqual(this.f99195b, aVar.f99195b);
        }

        public final int hashCode() {
            return this.f99195b.hashCode() + (Integer.hashCode(this.f99194a) * 31);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("ActivityColor(colorInt=");
            sb.append(this.f99194a);
            sb.append(", colorStr=");
            return C8770a.a(sb, this.f99195b, ")");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/color/ActivityColorRepository$b.class */
    public static final class b {
        public static final String a(String str) {
            String strConcat;
            if (str == null || StringsKt.isBlank(str)) {
                strConcat = "";
            } else {
                strConcat = str;
                if (!StringsKt.n(str, "#")) {
                    strConcat = StringsKt.n(str, "%23") ? str : "#".concat(str);
                }
            }
            return strConcat;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/color/ActivityColorRepository$c.class */
    @StabilityInferred(parameters = 1)
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public final String f99196a;

        public c(@Nullable String str) {
            this.f99196a = str;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && Intrinsics.areEqual(this.f99196a, ((c) obj).f99196a);
        }

        public final int hashCode() {
            String str = this.f99196a;
            return str == null ? 0 : str.hashCode();
        }

        @NotNull
        public final String toString() {
            return C8770a.a(new StringBuilder("Initial(themeConfig="), this.f99196a, ")");
        }
    }

    @Inject
    public ActivityColorRepository(@NotNull CoroutineScope coroutineScope, @NotNull c cVar) {
        this.f99180a = coroutineScope;
        this.f99181b = cVar;
        MutableStateFlow<a> MutableStateFlow = StateFlowKt.MutableStateFlow((Object) null);
        this.f99183d = MutableStateFlow;
        this.f99184e = MutableStateFlow;
        MutableStateFlow<a> MutableStateFlow2 = StateFlowKt.MutableStateFlow((Object) null);
        this.f99185f = MutableStateFlow2;
        this.f99186g = MutableStateFlow2;
        MutableStateFlow<a> MutableStateFlow3 = StateFlowKt.MutableStateFlow((Object) null);
        this.h = MutableStateFlow3;
        this.f99187i = MutableStateFlow3;
        MutableStateFlow<a> MutableStateFlow4 = StateFlowKt.MutableStateFlow((Object) null);
        this.f99188j = MutableStateFlow4;
        this.f99189k = MutableStateFlow4;
        MutableStateFlow<a> MutableStateFlow5 = StateFlowKt.MutableStateFlow((Object) null);
        this.f99190l = MutableStateFlow5;
        this.f99191m = MutableStateFlow5;
        MutableStateFlow<a> MutableStateFlow6 = StateFlowKt.MutableStateFlow((Object) null);
        this.f99192n = MutableStateFlow6;
        this.f99193o = MutableStateFlow6;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
    }

    public static a b(String str) {
        a aVar = null;
        if (str != null) {
            if (StringsKt.isBlank(str)) {
                aVar = null;
            } else {
                try {
                    aVar = new a(Color.parseColor(str), str);
                } catch (IllegalArgumentException e7) {
                    aVar = null;
                }
            }
        }
        return aVar;
    }

    @Nullable
    public final Integer a() {
        a aVar = (a) this.f99183d.getValue();
        return aVar != null ? Integer.valueOf(aVar.f99194a) : null;
    }

    @Nullable
    public final Integer c() {
        a aVar = (a) this.f99190l.getValue();
        return aVar != null ? Integer.valueOf(aVar.f99194a) : null;
    }

    @Nullable
    public final Integer d() {
        a aVar = (a) this.f99192n.getValue();
        return aVar != null ? Integer.valueOf(aVar.f99194a) : null;
    }

    @Nullable
    public final Integer e() {
        a aVar = (a) this.f99188j.getValue();
        return aVar != null ? Integer.valueOf(aVar.f99194a) : null;
    }

    @Nullable
    public final Integer f() {
        a aVar = (a) this.f99185f.getValue();
        return aVar != null ? Integer.valueOf(aVar.f99194a) : null;
    }

    @Nullable
    public final a g() {
        return (a) this.h.getValue();
    }

    @Nullable
    public final Integer h() {
        a aVarG = g();
        return aVarG != null ? Integer.valueOf(aVarG.f99194a) : null;
    }

    public final void i(@NotNull ViewReply viewReply) {
        boolean zHasViewBase = viewReply.hasViewBase();
        MutableStateFlow<a> mutableStateFlow = this.f99192n;
        MutableStateFlow<a> mutableStateFlow2 = this.f99190l;
        MutableStateFlow<a> mutableStateFlow3 = this.f99188j;
        MutableStateFlow<a> mutableStateFlow4 = this.h;
        MutableStateFlow<a> mutableStateFlow5 = this.f99185f;
        MutableStateFlow<a> mutableStateFlow6 = this.f99183d;
        if (!zHasViewBase || !viewReply.getViewBase().hasActivityResource()) {
            this.f99182c = false;
            mutableStateFlow6.setValue((Object) null);
            mutableStateFlow5.setValue((Object) null);
            mutableStateFlow4.setValue((Object) null);
            mutableStateFlow3.setValue((Object) null);
            mutableStateFlow2.setValue((Object) null);
            mutableStateFlow.setValue((Object) null);
            return;
        }
        this.f99182c = true;
        ActivityResource activityResource = viewReply.getViewBase().getActivityResource();
        String bgColor = activityResource.getBgColor();
        String selectedBgColor = activityResource.getSelectedBgColor();
        String textColor = activityResource.getTextColor();
        String lightTextColor = activityResource.getLightTextColor();
        String darkTextColor = activityResource.getDarkTextColor();
        String dividerColor = activityResource.getDividerColor();
        mutableStateFlow6.setValue(b(bgColor));
        mutableStateFlow5.setValue(b(selectedBgColor));
        mutableStateFlow4.setValue(b(textColor));
        mutableStateFlow3.setValue(b(lightTextColor));
        mutableStateFlow2.setValue(b(darkTextColor));
        mutableStateFlow.setValue(b(dividerColor));
    }
}
