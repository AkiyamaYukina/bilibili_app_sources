package com.bilibili.search2.share;

import Yt0.Z;
import Yt0.c0;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.window.core.layout.WindowSizeClass;
import com.bilibili.app.comm.list.common.api.FavoriteService;
import com.bilibili.app.comm.list.common.data.InlineThreePointPanel;
import com.bilibili.app.comm.list.common.data.SharePlane;
import com.bilibili.app.comm.list.common.router.LoginScopeKt;
import com.bilibili.app.comm.list.common.utils.share.ListShareHelper;
import com.bilibili.app.comm.list.common.widget.ListCommonMenuWindow;
import com.bilibili.app.comm.list.common.widget.PromoToast;
import com.bilibili.app.comm.supermenu.core.IMenu;
import com.bilibili.app.comm.supermenu.core.IMenuItem;
import com.bilibili.app.comm.supermenu.core.MenuImpl;
import com.bilibili.app.comm.supermenu.share.v2.MenuItemHandler;
import com.bilibili.app.comm.supermenu.share.v2.ShareContentProvider;
import com.bilibili.app.comm.supermenu.share.v2.SharePanelWrapper;
import com.bilibili.app.comm.supermenu.share.v2.ShareTargetTask;
import com.bilibili.lib.blrouter.RouteRequest;
import com.bilibili.lib.sharewrapper.SocializeMedia;
import com.bilibili.lib.sharewrapper.online.ShareOnlineParams;
import com.bilibili.lib.ui.menu.BottomDialogMenu;
import com.bilibili.lib.ui.menu.CheckMenuItem;
import com.bilibili.okretro.ServiceGenerator;
import com.bilibili.search2.api.BaseSearchItem;
import com.bilibili.search2.inline.TrafficConfig;
import com.bilibili.search2.utils.B;
import com.bilibili.search2.utils.SearchInlineSpeedSetDialog;
import dt0.AbstractC6841d;
import dt0.AbstractC6842e;
import dt0.AbstractC6843f;
import dt0.InterfaceC6845h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.video.bilicardplayer.ICardPlayerContext;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/share/r.class */
@StabilityInferred(parameters = 0)
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final r f88699a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final Set<String> f88700b = SetsKt.setOf(new String[]{SocializeMedia.BILI_DYNAMIC, SocializeMedia.BILI_IM});

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final Lazy f88701c = LazyKt.lazy(new Hv.a(7));

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/share/r$a.class */
    @StabilityInferred(parameters = 0)
    public static final class a extends MenuItemHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final AbstractC6843f<?> f88702a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final View f88703b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Context f88704c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public final InterfaceC6845h f88705d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        public final AbstractC6842e<?, ?> f88706e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final long f88707f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @Nullable
        public final InlineThreePointPanel f88708g;

        @Nullable
        public final SharePlane h;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@NotNull AbstractC6843f<?> abstractC6843f, @NotNull View view) {
            this.f88702a = abstractC6843f;
            this.f88703b = view;
            this.f88704c = abstractC6843f.itemView.getContext();
            Object data = abstractC6843f.getData();
            InterfaceC6845h interfaceC6845h = data instanceof InterfaceC6845h ? (InterfaceC6845h) data : null;
            this.f88705d = interfaceC6845h;
            this.f88706e = abstractC6843f instanceof AbstractC6842e ? (AbstractC6842e) abstractC6843f : null;
            this.f88707f = interfaceC6845h != null ? interfaceC6845h.getAvId() : 0L;
            this.f88708g = interfaceC6845h != null ? interfaceC6845h.getThreePointMeta() : null;
            this.h = interfaceC6845h != null ? interfaceC6845h.getSharePanel() : null;
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /* JADX WARN: Removed duplicated region for block: B:76:0x02b8  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final boolean handleClick(@org.jetbrains.annotations.NotNull com.bilibili.app.comm.supermenu.core.IMenuItem r19) {
            /*
                Method dump skipped, instruction units count: 759
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.search2.share.r.a.handleClick(com.bilibili.app.comm.supermenu.core.IMenuItem):boolean");
        }

        /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.jvm.functions.Function1] */
        public final void onMenuList(@NotNull List<IMenu> list) {
            List list2;
            Sequence sequenceAsSequence;
            Sequence sequenceFilter;
            Sequence map;
            List list3;
            super.onMenuList(list);
            MenuImpl menuImpl = new MenuImpl(this.f88704c);
            InlineThreePointPanel inlineThreePointPanel = this.f88708g;
            if (inlineThreePointPanel == null || (list2 = inlineThreePointPanel.items) == null || (sequenceAsSequence = CollectionsKt.asSequence(list2)) == null || (sequenceFilter = SequencesKt.filter(sequenceAsSequence, (Function1) new Object())) == null || (map = SequencesKt.map(sequenceFilter, new XK0.f(this, 1))) == null || (list3 = SequencesKt.toList(map)) == null || list3.isEmpty()) {
                return;
            }
            menuImpl.setMenuItems(list3);
            list.add(menuImpl);
        }

        @Nullable
        public final IMenuItem onPrepareShow(@NotNull IMenuItem iMenuItem) {
            if (Intrinsics.areEqual(iMenuItem.getItemId(), SocializeMedia.MENU_ID_SYS_DOWNLOAD)) {
                iMenuItem.setShowNewTip(Boolean.FALSE);
            }
            return super.onPrepareShow(iMenuItem);
        }

        @NotNull
        public final String[] registerActionMenuItems() {
            return new String[]{"fav", "auto_play", "player_speed", "watch_later", "dislike", SocializeMedia.PIC, SocializeMedia.MENU_ID_SYS_DOWNLOAD};
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/share/r$b.class */
    public static final class b implements ShareContentProvider {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final InterfaceC6845h f88709a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final FragmentActivity f88710b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f88711c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f88712d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f88713e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final boolean f88714f;

        public b(InterfaceC6845h interfaceC6845h, FragmentActivity fragmentActivity, String str, int i7, boolean z6, boolean z7) {
            this.f88709a = interfaceC6845h;
            this.f88710b = fragmentActivity;
            this.f88711c = str;
            this.f88712d = i7;
            this.f88713e = z6;
            this.f88714f = z7;
        }

        public final Bundle getShareContent(String str) {
            ListShareHelper listShareHelper = ListShareHelper.INSTANCE;
            InterfaceC6845h interfaceC6845h = this.f88709a;
            Bundle shareContent$default = ListShareHelper.getShareContent$default(listShareHelper, this.f88710b, interfaceC6845h.getSharePanel(), str, this.f88711c, this.f88712d, (String) null, (Integer) null, (Long) null, false, this.f88713e, this.f88714f, interfaceC6845h.getOgvSubType(), WindowSizeClass.HEIGHT_DP_MEDIUM_LOWER_BOUND, (Object) null);
            Bundle bundle = shareContent$default;
            if (shareContent$default == null) {
                bundle = new Bundle();
            }
            return bundle;
        }
    }

    public static c0 a(BaseSearchItem.FeedbackSection feedbackSection, BaseSearchItem baseSearchItem, Context context, Function1 function1) {
        ArrayList arrayList = null;
        if (feedbackSection == null) {
            return null;
        }
        List<BaseSearchItem.FeedbackItem> items = feedbackSection.getItems();
        if (items == null) {
            return null;
        }
        if (items.size() <= 0) {
            items = null;
        }
        if (items == null) {
            return null;
        }
        String title = feedbackSection.getTitle();
        String str = title;
        if (title == null) {
            str = "";
        }
        List<BaseSearchItem.FeedbackItem> items2 = feedbackSection.getItems();
        if (items2 != null) {
            List<BaseSearchItem.FeedbackItem> list = items2;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (true) {
                arrayList = arrayList2;
                if (!it.hasNext()) {
                    break;
                }
                String text = ((BaseSearchItem.FeedbackItem) it.next()).getText();
                String str2 = text;
                if (text == null) {
                    str2 = "";
                }
                arrayList2.add(str2);
            }
        }
        return new c0(str, arrayList, new com.bilibili.bplus.im.business.client.manager.r(function1, baseSearchItem, context, items, feedbackSection));
    }

    public static InlineThreePointPanel.ButtonMeta b(InlineThreePointPanel inlineThreePointPanel, boolean z6) {
        InlineThreePointPanel.ShareButtonItem shareButtonItem;
        InlineThreePointPanel.ButtonMeta buttonMeta;
        Object next;
        Object next2;
        Object next3;
        List list = inlineThreePointPanel.items;
        if (list != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next3 = null;
                    break;
                }
                next3 = it.next();
                if (((InlineThreePointPanel.ShareButtonItem) next3).type == 3) {
                    break;
                }
            }
            shareButtonItem = (InlineThreePointPanel.ShareButtonItem) next3;
        } else {
            shareButtonItem = null;
        }
        if (z6) {
            buttonMeta = null;
            if (shareButtonItem != null) {
                List list2 = shareButtonItem.buttonMetas;
                buttonMeta = null;
                if (list2 != null) {
                    Iterator it2 = list2.iterator();
                    do {
                        next2 = null;
                        if (!it2.hasNext()) {
                            break;
                        }
                        next2 = it2.next();
                    } while (!Intrinsics.areEqual(((InlineThreePointPanel.ButtonMeta) next2).status, "collected"));
                    buttonMeta = (InlineThreePointPanel.ButtonMeta) next2;
                }
            }
        } else {
            buttonMeta = null;
            if (shareButtonItem != null) {
                List list3 = shareButtonItem.buttonMetas;
                buttonMeta = null;
                if (list3 != null) {
                    Iterator it3 = list3.iterator();
                    do {
                        next = null;
                        if (!it3.hasNext()) {
                            break;
                        }
                        next = it3.next();
                    } while (!Intrinsics.areEqual(((InlineThreePointPanel.ButtonMeta) next).status, "collect"));
                    buttonMeta = (InlineThreePointPanel.ButtonMeta) next;
                }
            }
        }
        return buttonMeta;
    }

    public static InlineThreePointPanel.ButtonMeta c(InlineThreePointPanel inlineThreePointPanel, float f7) {
        Object next;
        Object next2;
        String str;
        String strL;
        Float floatOrNull;
        float f8 = f7;
        if (f7 <= 0.0f) {
            f8 = 1.0f;
        }
        List list = inlineThreePointPanel.items;
        InlineThreePointPanel.ButtonMeta buttonMeta = null;
        if (list != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((InlineThreePointPanel.ShareButtonItem) next).type == 4) {
                    break;
                }
            }
            InlineThreePointPanel.ShareButtonItem shareButtonItem = (InlineThreePointPanel.ShareButtonItem) next;
            buttonMeta = null;
            if (shareButtonItem != null) {
                List list2 = shareButtonItem.buttonMetas;
                buttonMeta = null;
                if (list2 != null) {
                    Iterator it2 = list2.iterator();
                    do {
                        next2 = null;
                        if (!it2.hasNext()) {
                            break;
                        }
                        next2 = it2.next();
                        f88699a.getClass();
                        str = ((InlineThreePointPanel.ButtonMeta) next2).status;
                    } while (((str == null || (strL = StringsKt.L(str, "x", "")) == null || (floatOrNull = StringsKt.toFloatOrNull(strL)) == null) ? -1.0f : floatOrNull.floatValue()) != f8);
                    buttonMeta = (InlineThreePointPanel.ButtonMeta) next2;
                }
            }
        }
        return buttonMeta;
    }

    public static void d(@NotNull FragmentActivity fragmentActivity, @NotNull String str, @NotNull ShareContentProvider shareContentProvider, @NotNull ShareOnlineParams shareOnlineParams) {
        ShareTargetTask.Companion.with(fragmentActivity).shareContentProvider(shareContentProvider).shareOnlineParams(shareOnlineParams).shareTo(str);
    }

    public static boolean e(@Nullable BaseSearchItem.Feedback feedback) {
        Object next;
        boolean z6 = false;
        if (feedback != null) {
            List<BaseSearchItem.FeedbackSection> sections = feedback.getSections();
            z6 = false;
            if (sections != null) {
                Iterator<T> it = sections.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    List<BaseSearchItem.FeedbackItem> items = ((BaseSearchItem.FeedbackSection) next).getItems();
                    if ((items != null ? items.size() : 0) > 0) {
                        break;
                    }
                }
                z6 = false;
                if (((BaseSearchItem.FeedbackSection) next) != null) {
                    z6 = true;
                }
            }
        }
        return z6;
    }

    public static void f(final long j7, @Nullable final AbstractC6842e abstractC6842e, @Nullable final Fragment fragment) {
        if (j7 <= 0 || abstractC6842e == null || fragment == null) {
            return;
        }
        if (((InterfaceC6845h) abstractC6842e.getData()).isFavorite()) {
            LoginScopeKt.loginRequire$default(false, (Lifecycle) null, (RouteRequest) null, 0L, new Function0(j7, abstractC6842e, fragment) { // from class: com.bilibili.search2.share.o

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final long f88693a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final AbstractC6842e f88694b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final Fragment f88695c;

                {
                    this.f88693a = j7;
                    this.f88694b = abstractC6842e;
                    this.f88695c = fragment;
                }

                public final Object invoke() {
                    r.f88699a.getClass();
                    Fragment fragment2 = this.f88695c;
                    AbstractC6842e abstractC6842e2 = this.f88694b;
                    long j8 = this.f88693a;
                    ((FavoriteService) ServiceGenerator.createService(FavoriteService.class)).removeFavorite(j8, 2).enqueue(new t(fragment2, abstractC6842e2, j8, false));
                    return Unit.INSTANCE;
                }
            }, 14, (Object) null);
        } else {
            LoginScopeKt.loginRequire$default(false, (Lifecycle) null, (RouteRequest) null, 0L, new Function0(j7, abstractC6842e, fragment) { // from class: com.bilibili.search2.share.p

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final long f88696a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final AbstractC6842e f88697b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final Fragment f88698c;

                {
                    this.f88696a = j7;
                    this.f88697b = abstractC6842e;
                    this.f88698c = fragment;
                }

                public final Object invoke() {
                    r.f88699a.getClass();
                    Fragment fragment2 = this.f88698c;
                    AbstractC6842e abstractC6842e2 = this.f88697b;
                    long j8 = this.f88696a;
                    ((FavoriteService) ServiceGenerator.createService(FavoriteService.class)).addFavorite(j8, 2, 0).enqueue(new t(fragment2, abstractC6842e2, j8, true));
                    return Unit.INSTANCE;
                }
            }, 14, (Object) null);
        }
    }

    public static void g(AbstractC6842e abstractC6842e) {
        AbstractC6841d abstractC6841d;
        TrafficConfig trafficConfig;
        if (abstractC6842e == null || (abstractC6841d = (AbstractC6841d) abstractC6842e.getBindData()) == null || (trafficConfig = abstractC6841d.getTrafficConfig()) == null) {
            return;
        }
        B.B(abstractC6842e.getFragment(), trafficConfig, abstractC6842e.f116704c, abstractC6842e.f116705d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void h(AbstractC6843f abstractC6843f) {
        FragmentActivity fragmentActivityP3;
        String shareId;
        String shareOrigin;
        Fragment fragment = abstractC6843f.getFragment();
        if (fragment == null || (fragmentActivityP3 = fragment.p3()) == null) {
            return;
        }
        Object data = abstractC6843f.getData();
        InterfaceC6845h interfaceC6845h = data instanceof InterfaceC6845h ? (InterfaceC6845h) data : null;
        if (interfaceC6845h == null || (shareId = interfaceC6845h.getShareId()) == null || (shareOrigin = interfaceC6845h.getShareOrigin()) == null) {
            return;
        }
        String strValueOf = String.valueOf(interfaceC6845h.getOid());
        String shareFrom = interfaceC6845h.getShareFrom();
        String shareId2 = interfaceC6845h.getShareId();
        int shareType = interfaceC6845h.getShareType();
        boolean z6 = interfaceC6845h.getShareBusiness() == 2;
        boolean z7 = interfaceC6845h.getShareBusiness() == 3;
        interfaceC6845h.getShareBusiness();
        ShareOnlineParams shareOnlineParams$default = ListShareHelper.getShareOnlineParams$default(ListShareHelper.INSTANCE, shareId, shareOrigin, strValueOf, interfaceC6845h.getSid(), interfaceC6845h.isHot(), true, (Integer) null, (Integer) null, shareType, shareFrom, shareId2, z6, z7, (String) null, 8384, (Object) null);
        SharePanelWrapper.Companion.with(fragmentActivityP3).shareOnlineParams(shareOnlineParams$default).shareCallback(new s(strValueOf, fragmentActivityP3)).shareContentProvider(new b(interfaceC6845h, fragmentActivityP3, shareFrom, shareType, z7, z6)).menuItemHandler(new a(abstractC6843f, abstractC6843f.itemView)).show();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void i(final dt0.AbstractC6843f r20) {
        /*
            Method dump skipped, instruction units count: 668
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.search2.share.r.i(dt0.f):void");
    }

    public static void j(View view, final AbstractC6842e abstractC6842e) {
        ICardPlayerContext cardPlayerContext;
        if (abstractC6842e == null) {
            return;
        }
        final Context context = view.getContext();
        Panel panel = abstractC6842e.f116702a;
        float playSpeed = (panel == 0 || (cardPlayerContext = panel.getCardPlayerContext()) == null) ? 1.0f : cardPlayerContext.getPlaySpeed();
        boolean zG = com.bilibili.search2.component.e.g(context);
        Lazy lazy = f88701c;
        if (zG) {
            float[] fArr = (float[]) lazy.getValue();
            ArrayList arrayList = new ArrayList(fArr.length);
            int length = fArr.length;
            for (int i7 = 0; i7 < length; i7++) {
                float f7 = fArr[i7];
                arrayList.add(new Z(f7, f7 == playSpeed));
            }
            new SearchInlineSpeedSetDialog(abstractC6842e.getFragment(), arrayList, new GH0.h(1, abstractC6842e, context)).a();
            return;
        }
        float[] fArr2 = (float[]) lazy.getValue();
        ArrayList arrayList2 = new ArrayList(fArr2.length);
        int length2 = fArr2.length;
        for (int i8 = 0; i8 < length2; i8++) {
            final float f8 = fArr2[i8];
            arrayList2.add(new CheckMenuItem(String.valueOf(f8), f8 == playSpeed, new CheckMenuItem.OnMenuClickListener(abstractC6842e, f8, context) { // from class: com.bilibili.search2.share.b

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final AbstractC6842e f88660a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final float f88661b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final Context f88662c;

                {
                    this.f88660a = abstractC6842e;
                    this.f88661b = f8;
                    this.f88662c = context;
                }

                @Override // com.bilibili.lib.ui.menu.CheckMenuItem.OnMenuClickListener
                public final void onMenuClick(View view2) {
                    ICardPlayerContext cardPlayerContext2;
                    Context context2 = this.f88662c;
                    AbstractC6842e abstractC6842e2 = this.f88660a;
                    Panel panel2 = abstractC6842e2.f116702a;
                    int playerState = (panel2 == 0 || (cardPlayerContext2 = panel2.getCardPlayerContext()) == null) ? 0 : cardPlayerContext2.getPlayerState();
                    if (4 > playerState || playerState >= 7) {
                        PromoToast.showMidToast(context2, 2131841703);
                    } else {
                        abstractC6842e2.setPlaySpeed(this.f88661b);
                    }
                }
            }));
        }
        ListCommonMenuWindow.showBottomUpMenu(context, arrayList2, new BottomDialogMenu.OnCloseClickListener(abstractC6842e) { // from class: com.bilibili.search2.share.c

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final AbstractC6842e f88663a;

            {
                this.f88663a = abstractC6842e;
            }

            @Override // com.bilibili.lib.ui.menu.BottomDialogMenu.OnCloseClickListener
            public final void onCloseClick() {
                AbstractC6842e abstractC6842e2 = this.f88663a;
                Xs0.b.i("search.search-result.search-card.all.click", null, abstractC6842e2.getModuleType(), (BaseSearchItem) abstractC6842e2.getData(), null, null, Xs0.b.b(abstractC6842e2.getModuleType(), "player-speed"), "cancel", null, null, false, null, 7936);
            }
        });
    }

    public static /* synthetic */ void l(r rVar, AbstractC6843f abstractC6843f, Context context, com.bilibili.search2.share.a aVar, boolean z6, int i7) {
        if ((i7 & 8) != 0) {
            aVar = null;
        }
        if ((i7 & 16) != 0) {
            z6 = false;
        }
        rVar.k(abstractC6843f, context, null, aVar, z6);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0117  */
    /* JADX WARN: Type inference failed for: r0v131, types: [Yt0.l, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final <T extends com.bilibili.search2.api.BaseSearchItem> void k(@org.jetbrains.annotations.NotNull final dt0.AbstractC6843f<T> r13, @org.jetbrains.annotations.NotNull android.content.Context r14, @org.jetbrains.annotations.Nullable final kotlin.jvm.functions.Function0<kotlin.Unit> r15, @org.jetbrains.annotations.Nullable final com.bilibili.search2.share.a r16, boolean r17) {
        /*
            Method dump skipped, instruction units count: 960
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.search2.share.r.k(dt0.f, android.content.Context, kotlin.jvm.functions.Function0, com.bilibili.search2.share.a, boolean):void");
    }
}
