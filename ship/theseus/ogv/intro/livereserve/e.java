package com.bilibili.ship.theseus.ogv.intro.livereserve;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.app.gemini.ui.RunningUIComponent;
import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.ship.theseus.ogv.intro.livereserve.b;
import com.bilibili.ship.theseus.ogv.season.OgvSeason;
import com.bilibili.ship.theseus.united.page.intro.IntroContentSizeRepository;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import javax.inject.Inject;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/livereserve/e.class */
@StabilityInferred(parameters = 0)
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f93319a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final BiliAccounts f93320b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final OgvSeason f93321c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.ogv.web.b f93322d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final PageReportService f93323e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final a f93324f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final IntroContentSizeRepository f93325g;

    @NotNull
    public final CoroutineScope h;

    @Inject
    public e(@NotNull Context context, @NotNull BiliAccounts biliAccounts, @NotNull OgvSeason ogvSeason, @NotNull com.bilibili.ship.theseus.ogv.web.b bVar, @NotNull PageReportService pageReportService, @NotNull a aVar, @NotNull IntroContentSizeRepository introContentSizeRepository, @NotNull CoroutineScope coroutineScope) {
        this.f93319a = context;
        this.f93320b = biliAccounts;
        this.f93321c = ogvSeason;
        this.f93322d = bVar;
        this.f93323e = pageReportService;
        this.f93324f = aVar;
        this.f93325g = introContentSizeRepository;
        this.h = coroutineScope;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(com.bilibili.ship.theseus.ogv.intro.livereserve.e r9, com.bilibili.ship.theseus.ogv.intro.livereserve.b.a r10, kotlin.coroutines.jvm.internal.ContinuationImpl r11) {
        /*
            Method dump skipped, instruction units count: 477
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ogv.intro.livereserve.e.a(com.bilibili.ship.theseus.ogv.intro.livereserve.e, com.bilibili.ship.theseus.ogv.intro.livereserve.b$a, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @NotNull
    public final RunningUIComponent b() {
        b.a aVar = new b.a(new c(this, 0), new d(this));
        return new RunningUIComponent(new b(aVar), 0, new OgvLiveReserveUIComponentService$create$1(this, aVar, null), 2);
    }
}
