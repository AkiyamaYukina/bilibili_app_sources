package com.bilibili.ship.theseus.united.page.intro.module.staffs;

import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.compose.foundation.text.K1;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.NotificationCompat;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.bilibili.app.comm.vipconfig.VipThemeConfigManager;
import com.bilibili.framework.exposure.core.ExposureEntry;
import com.bilibili.framework.exposure.core.collecter.ViewExposureLayoutInfoCollectorKt;
import com.bilibili.lib.accountinfo.model.VipUserInfo;
import com.bilibili.lib.avatar.widget.RoundBorderImageView;
import com.bilibili.lib.foundation.FoundationAlias;
import com.bilibili.lib.image2.BiliImageLoader;
import com.bilibili.lib.image2.ImageRequestBuilder;
import com.bilibili.lib.image2.bean.RoundingParams;
import com.bilibili.lib.image2.bean.ScaleType;
import com.bilibili.lib.image2.view.BiliImageView;
import com.bilibili.lib.theme.R$color;
import com.bilibili.relation.widget.FollowButton;
import com.bilibili.relation.widget.FollowButtonConfig;
import com.bilibili.ship.theseus.united.page.intro.module.staffs.StaffsNewComponent;
import com.bilibili.ship.theseus.united.page.intro.module.staffs.StaffsService;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import com.bilibili.studio.editor.moudle.sticker.v1.EditCustomizeSticker;
import dv0.C6872j0;
import dv0.C6874k0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;
import wg0.C8883a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/staffs/A.class */
@StabilityInferred(parameters = 0)
public final class A extends com.bilibili.ship.theseus.united.page.floatlayer.bottomsheet.c<C6874k0> {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final StaffsService.b f101744l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.screensize.a f101745m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final a f101746n = new a(this);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f101747o = sh1.c.a(0.5f);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f101748p = sh1.c.b(64);

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/staffs/A$a.class */
    public final class a extends RecyclerView.Adapter<b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final List<Staff> f101749a = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final com.bilibili.pegasus.api.y f101750b = new com.bilibili.pegasus.api.y(1);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final A f101751c;

        public a(A a7) {
            this.f101751c = a7;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemCount() {
            return ((ArrayList) this.f101749a).size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i7) {
            b bVar = (b) viewHolder;
            final Staff staff = (Staff) CollectionsKt.getOrNull(this.f101749a, i7);
            if (staff == null) {
                return;
            }
            Context context = bVar.itemView.getContext();
            int i8 = staff.a().type;
            RoundBorderImageView roundBorderImageView = bVar.f101753b;
            Context context2 = roundBorderImageView.getContext();
            if (i8 == 1) {
                StaffsService.a.a(roundBorderImageView, context2, 2131234424);
            } else if (i8 == 0) {
                StaffsService.a.a(roundBorderImageView, context2, 2131234430);
            } else {
                roundBorderImageView.setVisibility(8);
            }
            ImageRequestBuilder imageRequestBuilderFailureImageResId$default = ImageRequestBuilder.failureImageResId$default(ImageRequestBuilder.placeholderImageResId$default(BiliImageLoader.INSTANCE.with(context).url(staff.f101790e).roundingParams(RoundingParams.Companion.asCircle()), 2131241194, (ScaleType) null, 2, (Object) null), 2131241194, (ScaleType) null, 2, (Object) null);
            BiliImageView biliImageView = bVar.f101752a;
            imageRequestBuilderFailureImageResId$default.into(biliImageView);
            bVar.f101755d.setText(staff.f101788c);
            bVar.f101755d.setTextColor(ContextCompat.getColor(bVar.itemView.getContext(), staff.b() ? 2131104338 : R$color.Ga5));
            bVar.f101755d.setBackground(staff.b() ? AppCompatResources.getDrawable(bVar.itemView.getContext(), 2131231019) : null);
            int iB = staff.b() ? sh1.c.b(4) : 0;
            bVar.f101755d.setPadding(iB, 0, iB, 0);
            VipUserInfo vipUserInfo = staff.f101792g;
            boolean zIsEffectiveYearVip = vipUserInfo.isEffectiveYearVip();
            Application fapp = FoundationAlias.getFapp();
            VipUserInfo.VipLabel label = vipUserInfo.getLabel();
            String labelTheme = null;
            if (label != null) {
                labelTheme = label.getLabelTheme();
            }
            int vipNicknameColor = (labelTheme == null || labelTheme.length() == 0) ? 0 : VipThemeConfigManager.getVipNicknameColor(fapp, labelTheme, Cj0.a.a(fapp));
            if (vipNicknameColor != 0) {
                bVar.f101754c.setTextColor(vipNicknameColor);
            } else {
                TextView textView = bVar.f101754c;
                textView.setTextColor(ContextCompat.getColor(textView.getContext(), zIsEffectiveYearVip ? R$color.Brand_pink : 2131103296));
            }
            bVar.f101754c.setText(C8883a.b(staff.f101789d, context, staff.f101794j, new K1(bVar, 4)));
            int i9 = staff.f101787b;
            FollowButton followButton = bVar.f101756e;
            if (i9 == 1) {
                followButton.updateUI(true);
            } else {
                followButton.updateUI(false);
            }
            int i10 = 8;
            if (staff.f101786a != com.bilibili.ship.theseus.united.utils.e.c()) {
                i10 = 0;
            }
            followButton.setVisibility(i10);
            final A a7 = this.f101751c;
            StaffsService staffsService = a7.f101744l.f101857a;
            followButton.bind(new FollowButtonConfig.Builder(staff.f101786a, staff.c(), 174, new L(staff, staffsService)).setIsGuestAttention(false).setSpmid("united.player-video-detail.joint-submission.0").setFromSpmid(staffsService.f101837f.a().f123881c).setExtendContent(staffsService.d()).setClickReportExtras(staffsService.c(staff)).build());
            biliImageView.setOnClickListener(new View.OnClickListener(a7, staff) { // from class: com.bilibili.ship.theseus.united.page.intro.module.staffs.w

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final A f101901a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Staff f101902b;

                {
                    this.f101901a = a7;
                    this.f101902b = staff;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    A a8 = this.f101901a;
                    a8.f101744l.a(this.f101902b, StaffsNewComponent.StaffArea.HEAD);
                }
            });
            bVar.f101754c.setOnClickListener(new View.OnClickListener(a7, staff) { // from class: com.bilibili.ship.theseus.united.page.intro.module.staffs.x

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final A f101903a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Staff f101904b;

                {
                    this.f101903a = a7;
                    this.f101904b = staff;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    A a8 = this.f101903a;
                    a8.f101744l.a(this.f101904b, StaffsNewComponent.StaffArea.INFO);
                }
            });
            bVar.f101755d.setOnClickListener(new View.OnClickListener(a7, staff) { // from class: com.bilibili.ship.theseus.united.page.intro.module.staffs.y

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final A f101905a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Staff f101906b;

                {
                    this.f101905a = a7;
                    this.f101906b = staff;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    A a8 = this.f101905a;
                    a8.f101744l.a(this.f101906b, StaffsNewComponent.StaffArea.INFO);
                }
            });
            final int i11 = 0;
            ViewExposureLayoutInfoCollectorKt.setExposureLayoutInfoReceiver(bVar.itemView, new ExposureEntry(this.f101750b, new Function0(i11, a7, staff) { // from class: com.bilibili.ship.theseus.united.page.intro.module.staffs.z

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final int f101907a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Object f101908b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final Object f101909c;

                {
                    this.f101907a = i11;
                    this.f101908b = a7;
                    this.f101909c = staff;
                }

                public final Object invoke() {
                    Object obj = this.f101909c;
                    Object obj2 = this.f101908b;
                    switch (this.f101907a) {
                        case 0:
                            StaffsService.b bVar2 = ((A) obj2).f101744l;
                            Staff staff2 = (Staff) obj;
                            StaffsService staffsService2 = bVar2.f101857a;
                            ArrayList<Long> arrayList = staffsService2.f101829D;
                            long j7 = staff2.f101786a;
                            if (!arrayList.contains(Long.valueOf(j7))) {
                                staffsService2.f101829D.add(Long.valueOf(j7));
                                String strC = UR0.D.c(staff2.c(), false);
                                HashMap map = new HashMap();
                                PageReportService pageReportService = staffsService2.f101844n;
                                map.putAll(pageReportService.a(null));
                                map.put("spmid", "united.player-video-detail.joint-submission.0");
                                map.put(NotificationCompat.CATEGORY_STATUS, strC);
                                map.put(EditCustomizeSticker.TAG_MID, String.valueOf(j7));
                                map.put("player_is_vertical", Intrinsics.areEqual(staffsService2.f101847q.f(), Boolean.TRUE) ? "1" : "2");
                                UR0.D.e(map);
                                Map mapCreateMapBuilder = MapsKt.createMapBuilder();
                                mapCreateMapBuilder.put("page_area", "2");
                                Unit unit = Unit.INSTANCE;
                                PageReportService.i(pageReportService, "united.player-video-detail.up-joint-submission.head.show", MapsKt.build(mapCreateMapBuilder), 4);
                            }
                            break;
                        default:
                            ((MutableState) obj2).setValue(Boolean.FALSE);
                            ((MutableState) obj).setValue(null);
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i7) {
            return new b(C6872j0.inflate(LayoutInflater.from(viewGroup.getContext()), viewGroup, false));
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/staffs/A$b.class */
    @StabilityInferred(parameters = 0)
    public static final class b extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final BiliImageView f101752a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final RoundBorderImageView f101753b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final TextView f101754c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final TextView f101755d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public final FollowButton f101756e;

        public b(@NotNull C6872j0 c6872j0) {
            super(c6872j0.f117027a);
            this.f101752a = c6872j0.f117028b;
            this.f101753b = c6872j0.f117032f;
            this.f101754c = c6872j0.f117031e;
            this.f101755d = c6872j0.f117029c;
            this.f101756e = c6872j0.f117030d;
        }
    }

    public A(@NotNull StaffsService.b bVar, @NotNull com.bilibili.ship.theseus.united.page.screensize.a aVar) {
        this.f101744l = bVar;
        this.f101745m = aVar;
        l(0.5625f);
    }

    public static final void m(TextView textView, Context context, final A a7, RecyclerView recyclerView) {
        Resources resources = context.getResources();
        int size = ((ArrayList) a7.f101744l.f101857a.f101855y).size();
        StaffsService.b bVar = a7.f101744l;
        textView.setText(resources.getQuantityString(2131689564, size, Integer.valueOf(((ArrayList) bVar.f101857a.f101855y).size())));
        List<Staff> list = bVar.f101857a.f101855y;
        a aVar = a7.f101746n;
        ((ArrayList) aVar.f101749a).clear();
        ((ArrayList) aVar.f101749a).addAll(list);
        if (recyclerView.isComputingLayout()) {
            recyclerView.post(new Runnable(a7) { // from class: com.bilibili.ship.theseus.united.page.intro.module.staffs.v

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final A f101900a;

                {
                    this.f101900a = a7;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f101900a.f101746n.notifyDataSetChanged();
                }
            });
        } else {
            aVar.notifyDataSetChanged();
        }
    }

    @Override // com.bilibili.ship.theseus.united.page.floatlayer.bottomsheet.c
    public final Object d(ViewBinding viewBinding, Continuation continuation) {
        C6874k0 c6874k0 = (C6874k0) viewBinding;
        Context context = c6874k0.f117035a.getContext();
        TextView textView = c6874k0.f117038d;
        Bt0.b bVar = new Bt0.b(this, 2);
        AppCompatImageView appCompatImageView = c6874k0.f117036b;
        appCompatImageView.setOnClickListener(bVar);
        C c7 = new C(context, this);
        c7.setDrawable(new ColorDrawable(0));
        RecyclerView recyclerView = c6874k0.f117037c;
        recyclerView.addItemDecoration(c7);
        recyclerView.setAdapter(this.f101746n);
        m(textView, context, this, recyclerView);
        this.f101744l.f101857a.f101826A = new B(textView, context, this, recyclerView);
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new StaffsPanelBottomSheetComponent$bindContent$4(this, recyclerView, appCompatImageView, null), continuation);
        if (objCoroutineScope != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            objCoroutineScope = Unit.INSTANCE;
        }
        return objCoroutineScope;
    }

    @Override // com.bilibili.ship.theseus.united.page.floatlayer.bottomsheet.c
    public final ViewBinding e(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C6874k0.inflate(layoutInflater, viewGroup, false);
    }

    @Override // com.bilibili.ship.theseus.united.page.floatlayer.bottomsheet.c
    public final boolean i() {
        return false;
    }

    @Override // com.bilibili.ship.theseus.united.page.floatlayer.bottomsheet.c
    @NotNull
    public final Drawable k(@NotNull Context context) {
        return ((Boolean) this.f99720d.getValue()).booleanValue() ? com.bilibili.playerbizcommonv2.utils.p.o(ContextCompat.getColor(context, R$color.Bg2), 12) : new ColorDrawable(ContextCompat.getColor(context, R$color.Bg2));
    }
}
