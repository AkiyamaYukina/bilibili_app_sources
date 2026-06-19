package com.bilibili.ship.theseus.united.page.tab;

import android.content.res.ColorStateList;
import androidx.core.app.NotificationCompat;
import com.bilibili.app.gemini.ui.RunningUIComponent;
import com.bilibili.player.tangram.basic.CompoundPlayStateProviderKt;
import com.bilibili.player.tangram.basic.PlayerAvailability;
import com.bilibili.ship.theseus.united.page.AutoPlayService;
import com.bilibili.ship.theseus.united.page.comment.TheseusCommentFragment;
import com.bilibili.ship.theseus.united.page.tab.TabPage;
import com.bilibili.ship.theseus.united.page.tab.f;
import com.bilibili.ship.theseus.united.page.view.RelationRepository;
import java.util.Arrays;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.StringCompanionObject;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/tab/c.class */
public final class c implements TabPage {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RelationRepository f103169a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CommentTab f103170b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.bilibili.ship.theseus.keel.player.h f103171c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AutoPlayService f103172d;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/tab/c$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f103173a;

        static {
            int[] iArr = new int[PlayerAvailability.values().length];
            try {
                iArr[PlayerAvailability.READY.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[PlayerAvailability.COMPLETED.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            f103173a = iArr;
        }
    }

    public c(RelationRepository relationRepository, CommentTab commentTab, com.bilibili.ship.theseus.keel.player.h hVar, AutoPlayService autoPlayService) {
        this.f103169a = relationRepository;
        this.f103170b = commentTab;
        this.f103171c = hVar;
        this.f103172d = autoPlayService;
    }

    @Override // com.bilibili.ship.theseus.united.page.tab.TabPage
    public final Qj0.d a() {
        return new Qj0.d(TheseusCommentFragment.class, null);
    }

    @Override // com.bilibili.ship.theseus.united.page.tab.TabPage
    public final TabPage.LocatableTag b() {
        return TabPage.LocatableTag.Comment;
    }

    @Override // com.bilibili.ship.theseus.united.page.tab.TabPage
    public final RunningUIComponent c(TheseusTabPagerService$_init_$lambda$1$$inlined$map$1 theseusTabPagerService$_init_$lambda$1$$inlined$map$1, ColorStateList colorStateList, boolean z6) {
        f.a aVar = new f.a();
        MutableStateFlow<Long> mutableStateFlow = aVar.f103180b;
        RelationRepository relationRepository = this.f103169a;
        mutableStateFlow.setValue(Long.valueOf(relationRepository.b()));
        CommentTab commentTab = this.f103170b;
        aVar.f103181c = commentTab.a();
        aVar.f103183e = colorStateList;
        aVar.f103184f = commentTab.b();
        aVar.f103185g = commentTab.c();
        if (z6) {
            aVar.h = 15.0f;
            aVar.f103186i = 12.0f;
            aVar.f103187j = true;
        }
        TabControl tabControlB = commentTab.b();
        if (tabControlB != null) {
            MutableStateFlow<Boolean> mutableStateFlow2 = aVar.f103179a;
            boolean z7 = true;
            if (!tabControlB.e()) {
                z7 = tabControlB.b();
            }
            mutableStateFlow2.setValue(Boolean.valueOf(z7));
        }
        return new RunningUIComponent(new f(aVar), 0, new CommentTabPageProvider$comment$1$1$newTabUIComponent$2(relationRepository, aVar, theseusTabPagerService$_init_$lambda$1$$inlined$map$1, null), 2);
    }

    @Override // com.bilibili.ship.theseus.united.page.tab.TabPage
    public final TabControl d() {
        return this.f103170b.b();
    }

    @Override // com.bilibili.ship.theseus.united.page.tab.TabPage
    public final Map<String, String> e() {
        Long lH;
        com.bilibili.ship.theseus.keel.player.h hVar = this.f103171c;
        com.bilibili.ship.theseus.keel.player.j jVarJ = hVar.j();
        long jL = jVarJ != null ? jVarJ.L() : 0L;
        com.bilibili.ship.theseus.keel.player.j jVarJ2 = hVar.j();
        long jLongValue = (jVarJ2 == null || (lH = jVarJ2.h()) == null) ? 0L : lH.longValue();
        float f7 = jLongValue > 0 ? jL / jLongValue : 0.0f;
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        Pair pair = TuplesKt.to(NotificationCompat.CATEGORY_PROGRESS, String.format("%.2f", Arrays.copyOf(new Object[]{Float.valueOf(f7)}, 1)));
        CommentTab commentTab = this.f103170b;
        Pair pair2 = TuplesKt.to("tab_name", commentTab.c());
        int i7 = a.f103173a[hVar.f91107a.k().ordinal()];
        String str = "1";
        if (i7 != 1) {
            if (i7 == 2) {
                str = "4";
            }
        } else if (this.f103172d.h) {
            str = CompoundPlayStateProviderKt.c(hVar) ? "2" : "3";
        }
        Pair pair3 = TuplesKt.to("playing_status", str);
        CommentTabStyle commentTabStyleA = commentTab.a();
        return MapsKt.mapOf(new Pair[]{pair, pair2, pair3, TuplesKt.to("is_intro_style", String.valueOf(commentTabStyleA != null ? commentTabStyleA.f103123c : 0))});
    }
}
