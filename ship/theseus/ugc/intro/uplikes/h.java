package com.bilibili.ship.theseus.ugc.intro.uplikes;

import I.E;
import K7.M;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.ship.theseus.ugc.intro.uplikes.UgcUpLikesPanelComponent;
import com.bilibili.ship.theseus.ugc.intro.uplikes.c;
import com.bilibili.ship.theseus.united.page.view.RelationRepository;
import java.util.List;
import javax.inject.Inject;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import mv0.C8043a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/uplikes/h.class */
@StabilityInferred(parameters = 0)
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.view.a f97735a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final RelationRepository f97736b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final C8043a f97737c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<c.b> f97738d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final StateFlow<c.b> f97739e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Boolean> f97740f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final StateFlow<Boolean> f97741g;

    @NotNull
    public final MutableStateFlow<UgcUpLikesPanelComponent.b> h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final StateFlow<UgcUpLikesPanelComponent.b> f97742i;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/uplikes/h$a.class */
    @StabilityInferred(parameters = 0)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final List<User> f97743a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final String f97744b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f97745c;

        public a(@NotNull List<User> list, @NotNull String str, boolean z6) {
            this.f97743a = list;
            this.f97744b = str;
            this.f97745c = z6;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.areEqual(this.f97743a, aVar.f97743a) && Intrinsics.areEqual(this.f97744b, aVar.f97744b) && this.f97745c == aVar.f97745c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f97745c) + E.a(this.f97743a.hashCode() * 31, 31, this.f97744b);
        }

        @NotNull
        public final String toString() {
            StringBuilder sbA = M.a("LikesPanelData(list=", ", title=", this.f97743a);
            sbA.append(this.f97744b);
            sbA.append(", isError=");
            return androidx.appcompat.app.i.a(sbA, this.f97745c, ")");
        }
    }

    @Inject
    public h(@NotNull com.bilibili.ship.theseus.united.page.view.a aVar, @NotNull RelationRepository relationRepository, @NotNull C8043a c8043a) {
        this.f97735a = aVar;
        this.f97736b = relationRepository;
        this.f97737c = c8043a;
        MutableStateFlow<c.b> MutableStateFlow = StateFlowKt.MutableStateFlow(c.b.C0890b.f97719a);
        this.f97738d = MutableStateFlow;
        this.f97739e = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<Boolean> MutableStateFlow2 = StateFlowKt.MutableStateFlow(Boolean.FALSE);
        this.f97740f = MutableStateFlow2;
        this.f97741g = FlowKt.asStateFlow(MutableStateFlow2);
        MutableStateFlow<UgcUpLikesPanelComponent.b> MutableStateFlow3 = StateFlowKt.MutableStateFlow(new UgcUpLikesPanelComponent.b((List<User>) CollectionsKt.emptyList(), false, 0L, UgcUpLikesPanelComponent.LoadingState.LOADING, c8043a.a().f123881c, ""));
        this.h = MutableStateFlow3;
        this.f97742i = FlowKt.asStateFlow(MutableStateFlow3);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002c  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(@org.jetbrains.annotations.NotNull java.util.List r13, boolean r14, @org.jetbrains.annotations.NotNull kotlin.coroutines.jvm.internal.ContinuationImpl r15) {
        /*
            Method dump skipped, instruction units count: 373
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ugc.intro.uplikes.h.a(java.util.List, boolean, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
