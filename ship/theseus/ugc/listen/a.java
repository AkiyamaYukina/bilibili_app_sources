package com.bilibili.ship.theseus.ugc.listen;

import Oi1.d;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.ship.theseus.ugc.toolbar.actionview.listen.ToolbarListenRepository;
import com.bilibili.ship.theseus.united.page.toolbar.C6418b;
import javax.inject.Inject;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.service.setting.IPlayerSettingService;
import tv.danmaku.biliplayerv2.service.setting.b;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/listen/a.class */
@StabilityInferred(parameters = 0)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f97952a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final IPlayerSettingService f97953b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final ToolbarListenRepository f97954c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final StateFlow<Boolean> f97955d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final StateFlow<Boolean> f97956e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final C0899a f97957f = new C0899a(this);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public C6418b f97958g;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.listen.a$a, reason: collision with other inner class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/listen/a$a.class */
    public static final class C0899a implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a f97959a;

        public C0899a(a aVar) {
            this.f97959a = aVar;
        }

        public final void c() {
            a.a(this.f97959a);
        }
    }

    @Inject
    public a(@NotNull CoroutineScope coroutineScope, @NotNull IPlayerSettingService iPlayerSettingService, @NotNull ToolbarListenRepository toolbarListenRepository, @NotNull StateFlow<Boolean> stateFlow, @NotNull StateFlow<Boolean> stateFlow2) {
        this.f97952a = coroutineScope;
        this.f97953b = iPlayerSettingService;
        this.f97954c = toolbarListenRepository;
        this.f97955d = stateFlow;
        this.f97956e = stateFlow2;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new DetailListenSuppressService$observeCloudConfig$1(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new DetailListenSuppressService$observeTeenagersMode$1(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new DetailListenSuppressService$observeLessonsMode$1(this, null), 3, (Object) null);
    }

    public static final void a(a aVar) {
        IPlayerSettingService iPlayerSettingService = aVar.f97953b;
        boolean zE = iPlayerSettingService.getCloudConfig().E();
        ToolbarListenRepository toolbarListenRepository = aVar.f97954c;
        if (zE) {
            toolbarListenRepository.b("cloudConfigSuppressor");
        } else {
            toolbarListenRepository.a("cloudConfigSuppressor");
        }
        d.a aVarL = iPlayerSettingService.getCloudConfig().l();
        if (aVarL != null) {
            if (!aVarL.a) {
                C6418b c6418b = aVar.f97958g;
                if (c6418b != null) {
                    toolbarListenRepository.f98534i.remove(c6418b);
                    toolbarListenRepository.f98535j.setValue(Boolean.valueOf(!toolbarListenRepository.f98534i.isEmpty()));
                    return;
                }
                return;
            }
            String str = aVarL.c;
            C6418b c6418b2 = str != null ? new C6418b(str) : null;
            aVar.f97958g = c6418b2;
            if (c6418b2 != null) {
                toolbarListenRepository.f98534i.add(c6418b2);
                toolbarListenRepository.f98535j.setValue(Boolean.valueOf(!toolbarListenRepository.f98534i.isEmpty()));
            }
        }
    }
}
