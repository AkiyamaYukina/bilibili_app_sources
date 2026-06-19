package com.bilibili.ship.theseus.ogv.intro.floatlayer.uicomponent;

import X50.h0;
import android.view.View;
import com.bilibili.lib.fasthybrid.ability.file.FileBaseException;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import i60.p0;
import i60.t;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import rx.functions.Action1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/floatlayer/uicomponent/a.class */
public final /* synthetic */ class a implements TabLayoutMediator.TabConfigurationStrategy, Action1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f93014a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f93015b;

    public /* synthetic */ a(Object obj, Object obj2) {
        this.f93014a = obj;
        this.f93015b = obj2;
    }

    public void call(Object obj) {
        FileBaseException fileBaseException = (Throwable) obj;
        boolean z6 = fileBaseException instanceof FileBaseException;
        t tVar = (t) this.f93014a;
        if (!z6) {
            tVar.invoke(((p0) this.f93015b).d);
            return;
        }
        FileBaseException fileBaseException2 = fileBaseException;
        int code = fileBaseException2.getCode();
        String reason = fileBaseException2.getReason();
        A80.c cVar = (A80.c) tVar.a.get();
        if (cVar != null) {
            cVar.c(h0.d(code, reason, h0.a), tVar.b);
        }
        Unit unit = Unit.INSTANCE;
    }

    public void onConfigureTab(TabLayout.Tab tab, final int i7) {
        tab.setText((CharSequence) ((ArrayList) this.f93014a).get(i7));
        TabLayout.TabView tabView = tab.view;
        final c cVar = (c) this.f93015b;
        tabView.setOnClickListener(new View.OnClickListener(cVar, i7) { // from class: com.bilibili.ship.theseus.ogv.intro.floatlayer.uicomponent.b

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final c f93016a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final int f93017b;

            {
                this.f93016a = cVar;
                this.f93017b = i7;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Function0<Unit> function0;
                c cVar2 = this.f93016a;
                int i8 = this.f93017b;
                if (cVar2.f93018a.f93034j != i8 || (function0 = cVar2.f93022e.get(i8).f93025b) == null) {
                    return;
                }
                function0.invoke();
            }
        });
    }
}
