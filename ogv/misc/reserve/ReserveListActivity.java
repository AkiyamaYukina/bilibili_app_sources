package com.bilibili.ogv.misc.reserve;

import Ri0.C2851g;
import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteDiskIOException;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.activity.OnBackPressedCallback;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.widget.Toolbar;
import androidx.collection.ArrayMap;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.lib.tribe.core.internal.Hooks;
import com.bilibili.lib.ui.BaseToolbarActivity;
import com.bilibili.lib.ui.garb.Garb;
import com.bilibili.lib.ui.garb.GarbManager;
import com.bilibili.lib.ui.util.MultipleThemeUtils;
import com.bilibili.ogv.misc.reserve.c;
import com.bilibili.ogv.pub.reserve.VipReserveDatabase;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;
import tv.danmaku.bili.widget.LoadingImageView;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/reserve/ReserveListActivity.class */
@StabilityInferred(parameters = 0)
public final class ReserveListActivity extends BaseToolbarActivity {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final int f69165O = 0;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    @Nullable
    public RecyclerView f69166D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    @Nullable
    public ViewGroup f69167E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    @Nullable
    public MenuItem f69168F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    @Nullable
    public l f69169G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    @Nullable
    public FrameLayout f69170H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    @Nullable
    public c f69171I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    @Nullable
    public LoadingImageView f69172J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    @NotNull
    public final List<com.bilibili.ogv.pub.reserve.l> f69173K = new ArrayList();

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    @NotNull
    public final b f69174L = new b(this);

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    @NotNull
    public final a f69175M = new a(this);

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public boolean f69176N;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/reserve/ReserveListActivity$a.class */
    public static final class a extends OnBackPressedCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ReserveListActivity f69177a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ReserveListActivity reserveListActivity) {
            super(true);
            this.f69177a = reserveListActivity;
        }

        @Override // androidx.activity.OnBackPressedCallback
        public final void handleOnBackPressed() throws Exception {
            int i7 = ReserveListActivity.f69165O;
            this.f69177a.U6();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/reserve/ReserveListActivity$b.class */
    public static final class b extends c.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ReserveListActivity f69178a;

        public b(ReserveListActivity reserveListActivity) {
            this.f69178a = reserveListActivity;
        }

        @Override // com.bilibili.ogv.misc.reserve.c.a
        public final void a(boolean z6) {
            Neurons.reportClick$default(false, "pgc.order-cache-manage.all-check.0.click", (Map) null, 4, (Object) null);
            l lVar = this.f69178a.f69169G;
            if (lVar != null) {
                ArrayMap arrayMap = lVar.f69199e;
                arrayMap.clear();
                if (z6) {
                    for (com.bilibili.ogv.pub.reserve.l lVar2 : (ArrayList) lVar.f69195a) {
                        arrayMap.put(Long.valueOf(lVar2.f71679b), lVar2);
                    }
                }
                h hVar = lVar.f69196b;
                if (hVar != null) {
                    hVar.a(arrayMap.size(), lVar.N());
                }
                lVar.notifyDataSetChanged();
            }
        }

        @Override // com.bilibili.ogv.misc.reserve.c.a
        public final void b() {
            Neurons.reportClick$default(false, "pgc.order-cache-manage.delete.0.click", (Map) null, 4, (Object) null);
            final ReserveListActivity reserveListActivity = this.f69178a;
            new AlertDialog.Builder(reserveListActivity, 2131886137).setMessage(2131834017).setNegativeButton(2131824233, (DialogInterface.OnClickListener) null).setPositiveButton(2131824043, new DialogInterface.OnClickListener(reserveListActivity) { // from class: com.bilibili.ogv.misc.reserve.j

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final ReserveListActivity f69193a;

                {
                    this.f69193a = reserveListActivity;
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i7) throws Exception {
                    List<com.bilibili.ogv.pub.reserve.l> mutableList;
                    String message;
                    StringBuilder sb;
                    Throwable th;
                    ReserveListActivity reserveListActivity2 = this.f69193a;
                    l lVar = reserveListActivity2.f69169G;
                    if (lVar != null && (mutableList = CollectionsKt.toMutableList(lVar.f69199e.values())) != null && !mutableList.isEmpty()) {
                        try {
                            VipReserveDatabase.f71657a.e().b(mutableList);
                        } catch (SQLiteCantOpenDatabaseException e7) {
                            message = e7.getMessage();
                            sb = new StringBuilder("[ogv-pub-VipReserveCacheStorage-delete] ");
                            th = e7;
                            sb.append(message);
                            BLog.e("VipReserveCacheStorage-delete", sb.toString(), th);
                        } catch (SQLiteDiskIOException e8) {
                            message = e8.getMessage();
                            sb = new StringBuilder("[ogv-pub-VipReserveCacheStorage-delete] ");
                            th = e8;
                            sb.append(message);
                            BLog.e("VipReserveCacheStorage-delete", sb.toString(), th);
                        }
                        l lVar2 = reserveListActivity2.f69169G;
                        if (lVar2 != null) {
                            ((ArrayList) lVar2.f69195a).removeAll(lVar2.f69199e.values());
                            h hVar = lVar2.f69196b;
                            if (hVar != null) {
                                int size = ((ArrayList) lVar2.f69195a).size();
                                ReserveListActivity reserveListActivity3 = hVar.f69191a;
                                if (size > 0) {
                                    int i8 = ReserveListActivity.f69165O;
                                    reserveListActivity3.S6(true);
                                } else {
                                    int i9 = ReserveListActivity.f69165O;
                                    reserveListActivity3.S6(false);
                                    reserveListActivity3.T6();
                                }
                            }
                        }
                    }
                    reserveListActivity2.U6();
                }
            }).show();
        }
    }

    public final LoadingImageView Q6() {
        if (this.f69172J == null) {
            this.f69172J = new LoadingImageView(this);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 17;
            FrameLayout frameLayout = this.f69170H;
            if (frameLayout != null) {
                frameLayout.addView((View) this.f69172J, (ViewGroup.LayoutParams) layoutParams);
            }
        }
        return this.f69172J;
    }

    public final void R6() {
        View view = this.f69172J;
        if (view != null) {
            FrameLayout frameLayout = this.f69170H;
            if (frameLayout != null) {
                frameLayout.removeView(view);
            }
            this.f69172J = null;
        }
    }

    public final void S6(boolean z6) {
        MenuItem menuItem = this.f69168F;
        if (menuItem != null) {
            menuItem.setVisible(z6);
            if (z6) {
                Garb curGarb = GarbManager.getCurGarb();
                MultipleThemeUtils.refreshMenuTitleTint(this, getToolbar(), menuItem, curGarb.isPure() ? 0 : curGarb.getFontColor());
            }
        }
    }

    public final void T6() {
        LoadingImageView loadingImageViewQ6 = Q6();
        if (loadingImageViewQ6 != null) {
            loadingImageViewQ6.setRefreshComplete();
            loadingImageViewQ6.setImageResource(2131235613);
            loadingImageViewQ6.showEmptyTips(2131834018);
        }
    }

    public final void U6() throws Exception {
        c cVar;
        if (this.f69169G == null) {
            return;
        }
        boolean z6 = this.f69176N;
        boolean z7 = !z6;
        if (z6 != z7) {
            this.f69176N = z7;
            a aVar = this.f69175M;
            if (z6) {
                aVar.remove();
            } else {
                getOnBackPressedDispatcher().addCallback(aVar);
            }
        }
        MenuItem menuItem = this.f69168F;
        if (menuItem != null) {
            menuItem.setTitle(this.f69176N ? 2131824233 : 2131824045);
        }
        int fontColor = 0;
        if (this.f69176N) {
            if (this.f69171I == null) {
                this.f69171I = new c(this);
            }
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            ViewGroup viewGroup = this.f69167E;
            if (viewGroup != null && (cVar = this.f69171I) != null) {
                cVar.f69184e = this.f69174L;
                viewGroup.addView(cVar, 2, layoutParams);
                cVar.c(0, false);
            }
        } else {
            c cVar2 = this.f69171I;
            if (cVar2 != null) {
                cVar2.f69184e = null;
                cVar2.f69182c.setChecked(false);
                cVar2.c(0, false);
                ((ViewGroup) cVar2.getParent()).removeView(cVar2);
            }
        }
        l lVar = this.f69169G;
        if (lVar != null) {
            boolean z8 = this.f69176N;
            lVar.f69198d = z8;
            ArrayMap arrayMap = lVar.f69199e;
            if (z8) {
                h hVar = lVar.f69196b;
                if (hVar != null) {
                    hVar.a(arrayMap.size(), lVar.N());
                }
            } else {
                arrayMap.clear();
            }
            lVar.notifyDataSetChanged();
        }
        Garb curGarb = GarbManager.getCurGarb();
        MenuItem menuItem2 = this.f69168F;
        if (menuItem2 != null) {
            Toolbar toolbar = getToolbar();
            if (!curGarb.isPure()) {
                fontColor = curGarb.getFontColor();
            }
            MultipleThemeUtils.refreshMenuTitleTint(this, toolbar, menuItem2, fontColor);
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, lf0.ActivityC7846a, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(Hooks.hookAttachContext(this, context));
        Hooks.hookAfterAttachContext(this);
    }

    @Override // com.bilibili.lib.ui.BaseToolbarActivity, com.bilibili.lib.ui.BaseAppCompatActivity, com.bilibili.lib.spy.generated.a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, lf0.ActivityC7846a, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2131493006);
        ensureToolbar();
        showBackButton();
        setTitle(getResources().getString(2131821862));
        RecyclerView recyclerView = this.f69166D;
        if (recyclerView != null) {
            recyclerView.setVisibility(8);
        }
        LoadingImageView loadingImageViewQ6 = Q6();
        if (loadingImageViewQ6 != null) {
            loadingImageViewQ6.setRefreshing();
        }
        this.f69170H = (FrameLayout) findViewById(R.id.content);
        this.f69166D = (RecyclerView) findViewById(2131306580);
        this.f69167E = (ViewGroup) findViewById(2131298614);
        this.f69169G = new l(this.f69173K, new h(this), new C2851g(this, 3));
        RecyclerView recyclerView2 = (RecyclerView) findViewById(2131306580);
        recyclerView2.setLayoutManager(new LinearLayoutManager(this));
        recyclerView2.addItemDecoration(new i(this));
        recyclerView2.setAdapter(this.f69169G);
        this.f69166D = recyclerView2;
        S6(false);
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), (CoroutineContext) null, (CoroutineStart) null, new ReserveListActivity$initData$1(this, null), 3, (Object) null);
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(@NotNull Menu menu) {
        getMenuInflater().inflate(2131558401, menu);
        this.f69168F = menu.findItem(2131307376);
        l lVar = this.f69169G;
        if (lVar == null || (lVar != null && lVar.f69195a.size() == 0)) {
            S6(false);
        }
        return super.onCreateOptionsMenu(menu);
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(@NotNull MenuItem menuItem) throws Exception {
        if (menuItem.getItemId() == 2131307376) {
            U6();
        }
        if (this.f69176N) {
            Neurons.reportClick$default(false, "pgc.order-cache.manage.0.click", (Map) null, 4, (Object) null);
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // com.bilibili.lib.ui.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, lf0.ActivityC7846a, android.app.Activity
    public final void onStop() {
        Neurons.reportPageView(false, "pgc.order-cache.0.0.pv", "", 0, 0L, MapsKt.emptyMap(), 0L, 0L);
        super.onStop();
    }
}
