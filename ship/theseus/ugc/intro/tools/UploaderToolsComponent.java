package com.bilibili.ship.theseus.ugc.intro.tools;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.ComposeView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.bapis.bilibili.app.viewunite.common.BadgeInfo;
import com.bilibili.app.gemini.ui.m;
import com.bilibili.lib.image2.BiliImageLoader;
import com.bilibili.lib.image2.ImageRequestBuilder;
import com.bilibili.lib.theme.R$color;
import com.bilibili.magicasakura.utils.ThemeUtils;
import com.bilibili.playerbizcommonv2.utils.p;
import com.bilibili.ship.theseus.ugc.intro.tools.UploaderToolsComponent;
import com.bilibili.ship.theseus.ugc.intro.tools.UploaderToolsComponent$bind$2;
import dv0.q0;
import dv0.r0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.NewPlayerUtilsKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/tools/UploaderToolsComponent.class */
@StabilityInferred(parameters = 0)
public final class UploaderToolsComponent extends m<r0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final StateFlow<b> f97183a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final StateFlow<Integer> f97184b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<a> f97185c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final SharedFlow<a> f97186d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final c f97187e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.ugc.intro.tools.a f97188f;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/tools/UploaderToolsComponent$a.class */
    public interface a {

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.tools.UploaderToolsComponent$a$a, reason: collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/tools/UploaderToolsComponent$a$a.class */
        @StabilityInferred(parameters = 0)
        public static final class C0850a implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public final com.bilibili.ship.theseus.ugc.intro.tools.b f97189a;

            public C0850a(@NotNull com.bilibili.ship.theseus.ugc.intro.tools.b bVar) {
                this.f97189a = bVar;
            }

            public final boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0850a) && Intrinsics.areEqual(this.f97189a, ((C0850a) obj).f97189a);
            }

            public final int hashCode() {
                return this.f97189a.hashCode();
            }

            @NotNull
            public final String toString() {
                return "OnClick(tool=" + this.f97189a + ")";
            }
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/tools/UploaderToolsComponent$a$b.class */
        @StabilityInferred(parameters = 0)
        public static final class b implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public final List<String> f97190a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @NotNull
            public final List<Map<String, String>> f97191b;

            /* JADX WARN: Multi-variable type inference failed */
            public b(@NotNull List<String> list, @NotNull List<? extends Map<String, String>> list2) {
                this.f97190a = list;
                this.f97191b = list2;
            }

            public final boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return Intrinsics.areEqual(this.f97190a, bVar.f97190a) && Intrinsics.areEqual(this.f97191b, bVar.f97191b);
            }

            public final int hashCode() {
                return this.f97191b.hashCode() + (this.f97190a.hashCode() * 31);
            }

            @NotNull
            public final String toString() {
                return b6.c.a("OnExposure(uploaderToolList=", ", reportList=", ")", this.f97190a, this.f97191b);
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/tools/UploaderToolsComponent$b.class */
    @StabilityInferred(parameters = 0)
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public final g f97192a;

        public b(@Nullable g gVar) {
            this.f97192a = gVar;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Intrinsics.areEqual(this.f97192a, ((b) obj).f97192a);
        }

        public final int hashCode() {
            g gVar = this.f97192a;
            return gVar == null ? 0 : gVar.hashCode();
        }

        @NotNull
        public final String toString() {
            return "ComponentState(data=" + this.f97192a + ")";
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/tools/UploaderToolsComponent$c.class */
    public static final class c extends RecyclerView.Adapter<a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final List<com.bilibili.ship.theseus.ugc.intro.tools.b> f97195a = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public UploaderToolsComponent$bind$2.AnonymousClass3.AnonymousClass1.a f97196b;

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/tools/UploaderToolsComponent$c$a.class */
        public final class a extends RecyclerView.ViewHolder {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public final q0 f97197a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final c f97198b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(@NotNull c cVar, q0 q0Var) {
                super(q0Var.f117107a);
                this.f97198b = cVar;
                this.f97197a = q0Var;
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemCount() {
            return ((ArrayList) this.f97195a).size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i7) {
            final a aVar = (a) viewHolder;
            final com.bilibili.ship.theseus.ugc.intro.tools.b bVar = (com.bilibili.ship.theseus.ugc.intro.tools.b) CollectionsKt.getOrNull(this.f97195a, i7);
            if (bVar != null) {
                aVar.getClass();
                ImageRequestBuilder imageRequestBuilderUrl = BiliImageLoader.INSTANCE.with(aVar.itemView.getContext()).url(bVar.f97212c);
                q0 q0Var = aVar.f97197a;
                imageRequestBuilderUrl.into(q0Var.f117108b);
                q0Var.f117109c.setText(bVar.f97211b);
                BadgeInfo badgeInfo = bVar.f97214e;
                String text = badgeInfo != null ? badgeInfo.getText() : null;
                if (text != null && text.length() != 0) {
                    ComposeView composeView = q0Var.f117110d;
                    composeView.setVisibility(0);
                    composeView.setContent(ComposableLambdaKt.composableLambdaInstance(96634289, true, new Function2(aVar, bVar) { // from class: com.bilibili.ship.theseus.ugc.intro.tools.c

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final UploaderToolsComponent.c.a f97216a;

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final b f97217b;

                        {
                            this.f97216a = aVar;
                            this.f97217b = bVar;
                        }

                        public final Object invoke(Object obj, Object obj2) {
                            Composer composer = (Composer) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(96634289, iIntValue, -1, "com.bilibili.ship.theseus.ugc.intro.tools.UploaderToolsComponent.ToolsAdapter.ToolHolder.bind.<anonymous>.<anonymous> (UploaderToolsComponent.kt:148)");
                                }
                                UploaderToolsComponent.c.a aVar2 = this.f97216a;
                                String strM = p.m(ThemeUtils.getColorById(aVar2.itemView.getContext(), R$color.Bg1));
                                String strM2 = p.m(ThemeUtils.getColorById(aVar2.itemView.getContext(), R$color.Text2));
                                String strM3 = p.m(ThemeUtils.getColorById(aVar2.itemView.getContext(), R$color.Line_regular));
                                BadgeInfo badgeInfo2 = this.f97217b.f97214e;
                                String text2 = badgeInfo2.getText();
                                String textColor = badgeInfo2.getTextColor();
                                if (StringsKt.isBlank(textColor)) {
                                    textColor = strM2;
                                }
                                String textColorNight = badgeInfo2.getTextColorNight();
                                if (!StringsKt.isBlank(textColorNight)) {
                                    strM2 = textColorNight;
                                }
                                String bgColor = badgeInfo2.getBgColor();
                                if (StringsKt.isBlank(bgColor)) {
                                    bgColor = strM;
                                }
                                String bgColorNight = badgeInfo2.getBgColorNight();
                                if (!StringsKt.isBlank(bgColorNight)) {
                                    strM = bgColorNight;
                                }
                                String borderColor = badgeInfo2.getBorderColor();
                                if (StringsKt.isBlank(borderColor)) {
                                    borderColor = strM3;
                                }
                                String borderColorNight = badgeInfo2.getBorderColorNight();
                                if (!StringsKt.isBlank(borderColorNight)) {
                                    strM3 = borderColorNight;
                                }
                                Jr0.e.a(new Jr0.f(badgeInfo2.getBgStyle(), 0, text2, textColor, strM2, bgColor, strM, borderColor, strM3, ""), 14, 8, 4, 8, false, composer, 28080, 32);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            } else {
                                composer.skipToGroupEnd();
                            }
                            return Unit.INSTANCE;
                        }
                    }));
                }
                final c cVar = aVar.f97198b;
                q0Var.f117107a.setOnClickListener(new View.OnClickListener(cVar, bVar) { // from class: com.bilibili.ship.theseus.ugc.intro.tools.d

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final UploaderToolsComponent.c f97218a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final b f97219b;

                    {
                        this.f97218a = cVar;
                        this.f97219b = bVar;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        UploaderToolsComponent.c cVar2 = this.f97218a;
                        b bVar2 = this.f97219b;
                        UploaderToolsComponent$bind$2.AnonymousClass3.AnonymousClass1.a aVar2 = cVar2.f97196b;
                        if (aVar2 != null) {
                            aVar2.f97193a.trySend-JP2dKIU(new UploaderToolsComponent.a.C0850a(bVar2));
                        }
                    }
                });
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i7) {
            return new a(this, q0.inflate(LayoutInflater.from(viewGroup.getContext()), viewGroup, false));
        }
    }

    public UploaderToolsComponent(@NotNull StateFlow<b> stateFlow, @NotNull StateFlow<Integer> stateFlow2) {
        this.f97183a = stateFlow;
        this.f97184b = stateFlow2;
        MutableSharedFlow<a> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 1, (BufferOverflow) null, 5, (Object) null);
        this.f97185c = mutableSharedFlowMutableSharedFlow$default;
        this.f97186d = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        this.f97187e = new c();
        this.f97188f = new com.bilibili.ship.theseus.ugc.intro.tools.a(NewPlayerUtilsKt.toPx(8), NewPlayerUtilsKt.toPx(8));
    }

    public final ViewBinding b(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return r0.inflate(layoutInflater, viewGroup, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0026  */
    /* JADX WARN: Type inference failed for: r0v11, types: [dv0.r0] */
    /* JADX WARN: Type inference failed for: r7v0, types: [kotlin.coroutines.Continuation, kotlin.coroutines.Continuation<? super kotlin.Unit>] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v8 */
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(@org.jetbrains.annotations.NotNull dv0.r0 r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
        /*
            Method dump skipped, instruction units count: 261
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ugc.intro.tools.UploaderToolsComponent.a(dv0.r0, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
