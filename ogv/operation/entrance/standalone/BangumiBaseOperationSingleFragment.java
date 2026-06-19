package com.bilibili.ogv.operation.entrance.standalone;

import QT.h;
import SQ.f;
import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.bapis.bilibili.account.interfaces.v1.g;
import com.bilibili.bplus.followinglist.detail.DynamicDetailFragment;
import com.bilibili.bplus.im.dao.gen.DaoSession;
import com.bilibili.bplus.im.entity.MessageRange;
import com.bilibili.inline.panel.listeners.CardScrollListener;
import com.bilibili.lib.fasthybrid.uimodule.widget.playet.SAAlbumPlayerView;
import com.bilibili.lib.fasthybrid.uimodule.widget.playet.player.SAAlbumLandscapeController;
import com.bilibili.lib.ui.BaseToolbarFragment;
import com.bilibili.lib.ui.garb.Garb;
import com.bilibili.lib.ui.garb.GarbManager;
import com.bilibili.lib.ui.util.MultipleThemeUtils;
import com.bilibili.lib.ui.util.StatusBarCompat;
import com.bilibili.magicasakura.utils.ThemeUtils;
import com.bilibili.magicasakura.widgets.TintToolbar;
import com.bilibili.ogv.operation.entrance.standalone.BangumiBaseOperationSingleFragment;
import com.bilibili.ogvcommon.deprecated.EmptyStateView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation/entrance/standalone/BangumiBaseOperationSingleFragment.class */
@StabilityInferred(parameters = 0)
public class BangumiBaseOperationSingleFragment extends BaseToolbarFragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public EmptyStateView f70200b;

    public final void mf() {
        Context context;
        int colorById;
        int secondaryPageColor;
        int colorById2;
        Garb curGarb = GarbManager.getCurGarb();
        if (curGarb.isPrimaryOnly() || (context = getContext()) == null) {
            return;
        }
        if (curGarb.isPure()) {
            colorById = ThemeUtils.getColorById(context, 2131103911);
            secondaryPageColor = MultipleThemeUtils.isWhiteTheme(context) ? ThemeUtils.getColorById(context, 2131103971) : ThemeUtils.getColorById(context, 2131103271);
            colorById2 = ThemeUtils.getColorById(context, 2131103914);
            if (MultipleThemeUtils.isWhiteTheme(context)) {
                StatusBarCompat.setStatusBarDarkMode(p3());
            } else {
                StatusBarCompat.setStatusBarLightMode(p3());
            }
        } else {
            colorById = ThemeUtils.getColorById(context, R.color.white);
            secondaryPageColor = curGarb.getSecondaryPageColor();
            colorById2 = ThemeUtils.getColorById(context, R.color.white);
            if (curGarb.isWhite()) {
                StatusBarCompat.setStatusBarDarkMode(p3());
            } else {
                StatusBarCompat.setStatusBarLightMode(p3());
            }
        }
        TintToolbar mToolbar = getMToolbar();
        if (mToolbar != null) {
            mToolbar.setElevation(0.0f);
        }
        TintToolbar mToolbar2 = getMToolbar();
        if (mToolbar2 != null) {
            mToolbar2.setBackgroundColor(secondaryPageColor);
            mToolbar2.setTitleTextColor(colorById2);
            Drawable navigationIcon = mToolbar2.getNavigationIcon();
            if (navigationIcon != null) {
                mToolbar2.setNavigationIcon(navigationIcon, colorById);
            }
            int size = mToolbar2.getMenu().size();
            for (int i7 = 0; i7 < size; i7++) {
                Drawable icon = mToolbar2.getMenu().getItem(i7).getIcon();
                if (icon != null) {
                    mToolbar2.getMenu().getItem(i7).setIcon(ThemeUtils.tintDrawable(icon, colorById));
                }
            }
        }
        StatusBarCompat.tintStatusBar(p3(), secondaryPageColor);
    }

    @Override // com.bilibili.lib.ui.BaseToolbarFragment
    public void onCreateToolbarMenu(@NotNull Menu menu, @NotNull MenuInflater menuInflater) {
        super.onCreateToolbarMenu(menu, menuInflater);
        menuInflater.inflate(2131558444, menu);
        final MenuItem menuItemFindItem = menu.findItem(2131310963);
        menuItemFindItem.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener(this, menuItemFindItem) { // from class: Jk0.b

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final BangumiBaseOperationSingleFragment f11497a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final MenuItem f11498b;

            {
                this.f11497a = this;
                this.f11498b = menuItemFindItem;
            }

            @Override // android.view.MenuItem.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                return this.f11497a.onOptionsItemSelected(this.f11498b);
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    public final boolean onOptionsItemSelected(@NotNull MenuItem menuItem) {
        if (menuItem.getItemId() == 2131310963) {
            g.a(null, "bilibili://search", 2, null);
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // com.bilibili.lib.ui.BaseToolbarFragment, com.bilibili.lib.ui.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f70200b = (EmptyStateView) view.findViewById(2131301025);
        final int i7 = 0;
        view.post(new Runnable(this, i7) { // from class: Jk0.a

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f11495a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Object f11496b;

            {
                this.f11495a = i7;
                this.f11496b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                SAAlbumPlayerView sAAlbumPlayerView;
                switch (this.f11495a) {
                    case 0:
                        ((BangumiBaseOperationSingleFragment) this.f11496b).mf();
                        break;
                    case 1:
                        DynamicDetailFragment dynamicDetailFragment = (DynamicDetailFragment) this.f11496b;
                        RecyclerView recyclerViewNf = dynamicDetailFragment.nf();
                        if (recyclerViewNf != null) {
                            RecyclerView recyclerViewNf2 = dynamicDetailFragment.nf();
                            if (recyclerViewNf2 != null) {
                                SQ.d dVarF = dynamicDetailFragment.o.f();
                                CardScrollListener cardScrollListener = dVarF.g;
                                if (cardScrollListener != null) {
                                    cardScrollListener.onScrollStateChanged(recyclerViewNf2, 0);
                                }
                                f fVar = dVarF.h;
                                if (fVar != null) {
                                    fVar.onScrollStateChanged(recyclerViewNf2, 0);
                                }
                            }
                            dynamicDetailFragment.w.onScrollStateChanged(recyclerViewNf, 0);
                            dynamicDetailFragment.x.onScrollStateChanged(recyclerViewNf, 0);
                            dynamicDetailFragment.G.onScrollStateChanged(recyclerViewNf, 0);
                            dynamicDetailFragment.F.onScrollStateChanged(recyclerViewNf, 0);
                        }
                        break;
                    case 2:
                        MessageRange messageRange = (MessageRange) this.f11496b;
                        if (!h.b(messageRange.getTalkerId(), messageRange.getType(), messageRange.getBeginSeqNo(), messageRange.getEndSeqNo())) {
                            DaoSession daoSessionA = QT.b.a();
                            if (daoSessionA != null) {
                                daoSessionA.insert(messageRange);
                            }
                            BLog.d("im-messageManager", "try insertRange from send =" + messageRange);
                        }
                        break;
                    default:
                        SAAlbumLandscapeController sAAlbumLandscapeController = (SAAlbumLandscapeController) this.f11496b;
                        if (sAAlbumLandscapeController.U && (sAAlbumPlayerView = sAAlbumLandscapeController.r0) != null && sAAlbumPlayerView.getState() == 4) {
                            sAAlbumLandscapeController.hide();
                            break;
                        }
                        break;
                }
            }
        });
    }
}
