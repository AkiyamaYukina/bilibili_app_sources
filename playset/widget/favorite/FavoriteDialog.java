package com.bilibili.playset.widget.favorite;

import I.E;
import J3.C2345h0;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.activity.ComponentActivity;
import androidx.activity.ComponentDialog;
import androidx.activity.result.ActivityResultLauncher;
import androidx.appcompat.app.AlertDialog;
import androidx.compose.animation.core.I;
import androidx.compose.foundation.C3554n0;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.res.ResourcesCompat;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.RecyclerView;
import androidx.window.core.layout.WindowSizeClass;
import c6.P;
import com.bilibili.api.BiliApiException;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.app.screen.adjust.utils.ScreenAdjustUtilsKt;
import com.bilibili.biligame.card.GameCardButton;
import com.bilibili.droid.BundleUtil;
import com.bilibili.droid.DimenUtilsKt;
import com.bilibili.droid.ToastHelper;
import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.lib.blconfig.ConfigManager;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.foundation.FoundationAlias;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.lib.theme.R$color;
import com.bilibili.magicasakura.utils.ThemeUtils;
import com.bilibili.magicasakura.widgets.TintCheckBox;
import com.bilibili.moduleservice.account.AccountService;
import com.bilibili.playset.widget.favorite.FavSnackBarUtil;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kntr.common.screen.adjust.KScreenAdjustUtilsKt;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;
import tv.danmaku.bili.widget.LoadingImageView;
import tv.danmaku.bili.widget.RecyclerView;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/widget/favorite/FavoriteDialog.class */
@StabilityInferred(parameters = 0)
public final class FavoriteDialog extends ComponentDialog implements View.OnClickListener {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f85683u = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ComponentActivity f85684a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final b f85685b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final ActivityResultLauncher<Intent> f85686c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public View f85687d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public View f85688e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public RecyclerView f85689f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public LoadingImageView f85690g;

    @Nullable
    public TintCheckBox h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public View f85691i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public View f85692j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public View f85693k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public ImageView f85694l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final c f85695m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f85696n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f85697o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f85698p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f85699q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f85700r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public final Lazy f85701s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    public k f85702t;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/widget/favorite/FavoriteDialog$BizType.class */
    public static final class BizType {
        private static final EnumEntries $ENTRIES;
        private static final BizType[] $VALUES;
        public static final BizType UGC = new BizType("UGC", 0);
        public static final BizType OGV_EPID = new BizType("OGV_EPID", 1);
        public static final BizType OGV_AVID = new BizType("OGV_AVID", 2);

        private static final /* synthetic */ BizType[] $values() {
            return new BizType[]{UGC, OGV_EPID, OGV_AVID};
        }

        static {
            BizType[] bizTypeArr$values = $values();
            $VALUES = bizTypeArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(bizTypeArr$values);
        }

        private BizType(String str, int i7) {
        }

        @NotNull
        public static EnumEntries<BizType> getEntries() {
            return $ENTRIES;
        }

        public static BizType valueOf(String str) {
            return (BizType) Enum.valueOf(BizType.class, str);
        }

        public static BizType[] values() {
            return (BizType[]) $VALUES.clone();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/widget/favorite/FavoriteDialog$a.class */
    public static final class a extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f85703b = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final es0.h f85704a;

        public a(@NotNull es0.h hVar) {
            super(hVar.f117417a);
            this.f85704a = hVar;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/widget/favorite/FavoriteDialog$b.class */
    @StabilityInferred(parameters = 0)
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f85705a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f85706b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final BizType f85707c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f85708d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f85709e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final boolean f85710f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f85711g;
        public final boolean h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @NotNull
        public final Map<String, String> f85712i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @NotNull
        public final String f85713j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        @NotNull
        public final String f85714k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        @NotNull
        public final String f85715l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        @NotNull
        public final FavSnackBarUtil.Scene f85716m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        @Nullable
        public final Boolean f85717n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final boolean f85718o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final boolean f85719p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        @NotNull
        public final String f85720q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        @NotNull
        public final String f85721r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        @Nullable
        public final Long f85722s;

        public b() {
            throw null;
        }

        public b(long j7, long j8, BizType bizType, boolean z6, int i7, boolean z7, boolean z8, boolean z9, Map map, String str, String str2, String str3, FavSnackBarUtil.Scene scene, Boolean bool, boolean z10, boolean z11, String str4, String str5, Long l7, int i8) {
            bool = (i8 & 8192) != 0 ? Boolean.FALSE : bool;
            z10 = (i8 & 16384) != 0 ? false : z10;
            z11 = (32768 & i8) != 0 ? false : z11;
            str4 = (65536 & i8) != 0 ? "" : str4;
            str5 = (131072 & i8) != 0 ? "" : str5;
            l7 = (i8 & 262144) != 0 ? null : l7;
            this.f85705a = j7;
            this.f85706b = j8;
            this.f85707c = bizType;
            this.f85708d = z6;
            this.f85709e = i7;
            this.f85710f = z7;
            this.f85711g = z8;
            this.h = z9;
            this.f85712i = map;
            this.f85713j = str;
            this.f85714k = str2;
            this.f85715l = str3;
            this.f85716m = scene;
            this.f85717n = bool;
            this.f85718o = z10;
            this.f85719p = z11;
            this.f85720q = str4;
            this.f85721r = str5;
            this.f85722s = l7;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f85705a == bVar.f85705a && this.f85706b == bVar.f85706b && this.f85707c == bVar.f85707c && this.f85708d == bVar.f85708d && this.f85709e == bVar.f85709e && this.f85710f == bVar.f85710f && this.f85711g == bVar.f85711g && this.h == bVar.h && Intrinsics.areEqual(this.f85712i, bVar.f85712i) && Intrinsics.areEqual(this.f85713j, bVar.f85713j) && Intrinsics.areEqual(this.f85714k, bVar.f85714k) && Intrinsics.areEqual(this.f85715l, bVar.f85715l) && this.f85716m == bVar.f85716m && Intrinsics.areEqual(this.f85717n, bVar.f85717n) && this.f85718o == bVar.f85718o && this.f85719p == bVar.f85719p && Intrinsics.areEqual(this.f85720q, bVar.f85720q) && Intrinsics.areEqual(this.f85721r, bVar.f85721r) && Intrinsics.areEqual(this.f85722s, bVar.f85722s);
        }

        public final int hashCode() {
            int iA = E.a(E.a(E.a(J2.g.a(androidx.compose.animation.z.a(androidx.compose.animation.z.a(androidx.compose.animation.z.a(I.a(this.f85709e, androidx.compose.animation.z.a((this.f85707c.hashCode() + C3554n0.a(Long.hashCode(this.f85705a) * 31, 31, this.f85706b)) * 31, 31, this.f85708d), 31), 31, this.f85710f), 31, this.f85711g), 31, this.h), this.f85712i, 31), 31, this.f85713j), 31, this.f85714k), 31, this.f85715l);
            int iHashCode = this.f85716m.hashCode();
            Boolean bool = this.f85717n;
            int iA2 = E.a(E.a(androidx.compose.animation.z.a(androidx.compose.animation.z.a((((iHashCode + iA) * 31) + (bool == null ? 0 : bool.hashCode())) * 31, 31, this.f85718o), 31, this.f85719p), 31, this.f85720q), 31, this.f85721r);
            Long l7 = this.f85722s;
            return iA2 + (l7 == null ? 0 : l7.hashCode());
        }

        @NotNull
        public final String toString() {
            boolean z6 = this.f85708d;
            boolean z7 = this.f85711g;
            Map<String, String> map = this.f85712i;
            StringBuilder sb = new StringBuilder("ExtraParams(resourceId=");
            sb.append(this.f85705a);
            sb.append(", cid=");
            sb.append(this.f85706b);
            sb.append(", bizType=");
            sb.append(this.f85707c);
            sb.append(", isFavorite=");
            sb.append(z6);
            sb.append(", requestCode=");
            sb.append(this.f85709e);
            sb.append(", needToast=");
            P.a(", seasonChecked=", ", seasonVisible=", sb, this.f85710f, z7);
            sb.append(this.h);
            sb.append(", extraMap=");
            sb.append(map);
            sb.append(", jumpFrom=");
            sb.append(this.f85713j);
            sb.append(", spmid=");
            sb.append(this.f85714k);
            sb.append(", fromSpmid=");
            sb.append(this.f85715l);
            sb.append(", scene=");
            sb.append(this.f85716m);
            sb.append(", isInteract=");
            sb.append(this.f85717n);
            sb.append(", isFromModifyFav=");
            sb.append(this.f85718o);
            sb.append(", isBatchManage=");
            sb.append(this.f85719p);
            sb.append(", resources=");
            sb.append(this.f85720q);
            sb.append(", action=");
            sb.append(this.f85721r);
            sb.append(", fid=");
            return com.bilibili.adcommon.utils.c.a(sb, this.f85722s, ")");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/widget/favorite/FavoriteDialog$c.class */
    public static final class c extends RecyclerView.Adapter<a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public FavoriteDialog f85723a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final List<PlaySet> f85724b = new ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final List<PlaySet> f85725c = new ArrayList();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final Map<Long, Boolean> f85726d = new LinkedHashMap();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f85727e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Nullable
        public Long f85728f;

        public final int N() {
            int i7 = 0;
            if (this.f85726d.isEmpty()) {
                return 0;
            }
            Iterator it = ((LinkedHashMap) this.f85726d).values().iterator();
            while (it.hasNext()) {
                if (((Boolean) it.next()).booleanValue()) {
                    i7++;
                }
            }
            return i7;
        }

        @NotNull
        public final List<PlaySet> O() {
            ArrayList arrayList = new ArrayList();
            for (PlaySet playSet : this.f85724b) {
                Map<Long, Boolean> map = this.f85726d;
                long id = playSet.getId();
                boolean zBooleanValue = ((Boolean) ((LinkedHashMap) map).getOrDefault(Long.valueOf(id), Boolean.FALSE)).booleanValue();
                if (playSet.hasCurrentVideo() != zBooleanValue && !zBooleanValue) {
                    arrayList.add(playSet);
                }
            }
            return arrayList;
        }

        @NotNull
        public final List<PlaySet> P() {
            ArrayList arrayList = new ArrayList();
            for (PlaySet playSet : this.f85724b) {
                Map<Long, Boolean> map = this.f85726d;
                long id = playSet.getId();
                boolean zBooleanValue = ((Boolean) ((LinkedHashMap) map).getOrDefault(Long.valueOf(id), Boolean.FALSE)).booleanValue();
                if (playSet.hasCurrentVideo() != zBooleanValue && zBooleanValue) {
                    arrayList.add(playSet);
                }
            }
            return arrayList;
        }

        public final boolean Q() {
            Object next;
            if (this.f85726d.isEmpty()) {
                return false;
            }
            Iterator<T> it = this.f85724b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((PlaySet) next).isDefault()) {
                    break;
                }
            }
            PlaySet playSet = (PlaySet) next;
            return playSet != null && this.f85726d.containsKey(Long.valueOf(playSet.getId()));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemCount() {
            return ((ArrayList) this.f85724b).size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i7) {
            a aVar = (a) viewHolder;
            List<PlaySet> list = this.f85724b;
            final Map<Long, Boolean> map = this.f85726d;
            Long l7 = this.f85728f;
            aVar.getClass();
            final PlaySet playSet = (PlaySet) CollectionsKt.getOrNull(list, i7);
            if (playSet != null) {
                String title = playSet.getTitle();
                es0.h hVar = aVar.f85704a;
                hVar.f117423g.setText(title);
                hVar.f117420d.setVisibility(playSet.isKidPlaylist() ? 0 : 8);
                if (playSet.isKidPlaylist()) {
                    TextView textView = hVar.f117420d;
                    String config = ConfigManager.Companion.getConfig("space.kid_playlist_tag_name", "");
                    String str = config;
                    if (config.length() == 0) {
                        str = "宝贝片单";
                    }
                    textView.setText(str);
                }
                boolean z6 = l7 != null && l7.longValue() == playSet.getId();
                boolean zIsKidPlaylist = playSet.isKidPlaylist();
                View view = aVar.itemView;
                boolean z7 = !z6;
                view.setEnabled(z7);
                TintCheckBox tintCheckBox = hVar.f117419c;
                tintCheckBox.setEnabled(z7);
                int colorById = z6 ? ThemeUtils.getColorById(aVar.itemView.getContext(), R$color.Text4) : ThemeUtils.getColorById(aVar.itemView.getContext(), R$color.Text1);
                if (z6) {
                    tintCheckBox.setButtonDrawable(2131243973);
                } else {
                    tintCheckBox.setButtonDrawable(2131239238);
                    tintCheckBox.setCompoundButtonTintList(2131237350);
                }
                hVar.f117423g.setTextColor(colorById);
                hVar.h.setTextColor(colorById);
                hVar.f117422f.setTextColor(colorById);
                hVar.f117424i.setTextColor(colorById);
                hVar.f117418b.setTextColor(colorById);
                if (zIsKidPlaylist) {
                    if (z6) {
                        hVar.f117420d.setAlpha(0.5f);
                    } else {
                        hVar.f117420d.setAlpha(1.0f);
                    }
                }
                String string = aVar.itemView.getContext().getString(2131842558);
                if (!z6) {
                    hVar.f117418b.setVisibility(8);
                } else if (playSet.isKidPlaylist()) {
                    hVar.f117418b.setVisibility(0);
                    hVar.f117418b.setText(string);
                } else {
                    bk.x.a(hVar.f117423g, title, string);
                    hVar.f117418b.setVisibility(8);
                }
                hVar.f117422f.setText(playSet.isPublic() ? 2131842623 : 2131842513);
                TextView textView2 = hVar.h;
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                textView2.setText(String.format(aVar.itemView.getContext().getString(2131842579), Arrays.copyOf(new Object[]{Integer.valueOf(playSet.getContentCounts())}, 1)));
                tintCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(map, playSet) { // from class: com.bilibili.playset.widget.favorite.i

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final Map f85756a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final PlaySet f85757b;

                    {
                        this.f85756a = map;
                        this.f85757b = playSet;
                    }

                    @Override // android.widget.CompoundButton.OnCheckedChangeListener
                    public final void onCheckedChanged(CompoundButton compoundButton, boolean z8) {
                        this.f85756a.put(Long.valueOf(this.f85757b.getId()), Boolean.valueOf(z8));
                    }
                });
                tintCheckBox.setChecked(((Boolean) ((LinkedHashMap) map).getOrDefault(Long.valueOf(playSet.getId()), Boolean.FALSE)).booleanValue());
                View view2 = hVar.f117421e;
                int i8 = 8;
                if (i7 < ((ArrayList) list).size() - 1) {
                    i8 = 0;
                }
                view2.setVisibility(i8);
                aVar.itemView.setTag(tintCheckBox);
            }
            aVar.itemView.setOnClickListener(this.f85723a);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i7) {
            int i8 = a.f85703b;
            return new a(es0.h.inflate(LayoutInflater.from(viewGroup.getContext()), viewGroup, false));
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/widget/favorite/FavoriteDialog$d.class */
    public static final /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f85729a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int[] f85730b;

        static {
            int[] iArr = new int[FavSnackBarUtil.Scene.values().length];
            try {
                iArr[FavSnackBarUtil.Scene.DetailPage.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[FavSnackBarUtil.Scene.Story.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            f85729a = iArr;
            int[] iArr2 = new int[BizType.values().length];
            try {
                iArr2[BizType.UGC.ordinal()] = 1;
            } catch (NoSuchFieldError e9) {
            }
            try {
                iArr2[BizType.OGV_AVID.ordinal()] = 2;
            } catch (NoSuchFieldError e10) {
            }
            try {
                iArr2[BizType.OGV_EPID.ordinal()] = 3;
            } catch (NoSuchFieldError e11) {
            }
            f85730b = iArr2;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.playset.widget.favorite.FavoriteDialog$onCreate$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/widget/favorite/FavoriteDialog$onCreate$3.class */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final Ref.ObjectRef<WindowSizeClass> $windowSize;
        int label;
        final FavoriteDialog this$0;

        /* JADX INFO: renamed from: com.bilibili.playset.widget.favorite.FavoriteDialog$onCreate$3$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/widget/favorite/FavoriteDialog$onCreate$3$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<WindowSizeClass, Continuation<? super Unit>, Object> {
            final Ref.ObjectRef<WindowSizeClass> $windowSize;
            Object L$0;
            int label;
            final FavoriteDialog this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(Ref.ObjectRef<WindowSizeClass> objectRef, FavoriteDialog favoriteDialog, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$windowSize = objectRef;
                this.this$0 = favoriteDialog;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$windowSize, this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            public final Object invoke(WindowSizeClass windowSizeClass, Continuation<? super Unit> continuation) {
                return create(windowSizeClass, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                WindowSizeClass windowSizeClass = (WindowSizeClass) this.L$0;
                if (!Intrinsics.areEqual(this.$windowSize.element, windowSizeClass)) {
                    this.$windowSize.element = windowSizeClass;
                    FavoriteDialog favoriteDialog = this.this$0;
                    int i7 = FavoriteDialog.f85683u;
                    favoriteDialog.m(windowSizeClass);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(FavoriteDialog favoriteDialog, Ref.ObjectRef<WindowSizeClass> objectRef, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.this$0 = favoriteDialog;
            this.$windowSize = objectRef;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass3(this.this$0, this.$windowSize, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowWindowSizeFlow = ScreenAdjustUtilsKt.windowSizeFlow(this.this$0.f85684a);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$windowSize, this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowWindowSizeFlow, anonymousClass1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public FavoriteDialog(@NotNull ComponentActivity componentActivity, @NotNull b bVar, @Nullable ActivityResultLauncher<Intent> activityResultLauncher) throws NoWhenBranchMatchedException {
        super(componentActivity, 2131886161);
        this.f85684a = componentActivity;
        this.f85685b = bVar;
        this.f85686c = activityResultLauncher;
        this.f85695m = new c();
        this.f85698p = -1L;
        this.f85701s = LazyKt.lazy(new C2345h0(8));
        this.f85696n = bVar.f85705a;
        int i7 = d.f85730b[bVar.f85707c.ordinal()];
        int i8 = 2;
        if (i7 != 1) {
            if (i7 == 2) {
                i8 = 42;
            } else {
                if (i7 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                i8 = 24;
            }
        }
        this.f85697o = i8;
    }

    public static final void j(final FavoriteDialog favoriteDialog, Throwable th) {
        int i7;
        favoriteDialog.getClass();
        boolean z6 = th instanceof BiliApiException;
        boolean z7 = true;
        if (z6 && ((i7 = ((BiliApiException) th).mCode) == -2 || i7 == -101)) {
            Context context = favoriteDialog.getContext();
            AccountService accountService = (AccountService) w8.d.a(BLRouter.INSTANCE, AccountService.class, "default");
            if (accountService != null) {
                accountService.logout("FavoriteDialog_mCallback_onError");
            }
            ToastHelper.showToastLong(context, 2131847429);
        } else if (z6) {
            int i8 = ((BiliApiException) th).mCode;
            String message = th.getMessage();
            String str = message;
            if (message == null) {
                str = "";
            }
            if (i8 == -106) {
                new AlertDialog.Builder(favoriteDialog.getContext()).setMessage(favoriteDialog.getContext().getString(2131846926)).setNegativeButton(2131841464, (DialogInterface.OnClickListener) null).setPositiveButton(2131847182, new DialogInterface.OnClickListener(favoriteDialog) { // from class: com.bilibili.playset.widget.favorite.h

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final FavoriteDialog f85755a;

                    {
                        this.f85755a = favoriteDialog;
                    }

                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i9) {
                        FavoriteDialog favoriteDialog2 = this.f85755a;
                        AccountService accountService2 = (AccountService) w8.d.a(BLRouter.INSTANCE, AccountService.class, "default");
                        if (accountService2 != null) {
                            accountService2.bindPhone(favoriteDialog2.getContext());
                        }
                        dialogInterface.cancel();
                    }
                }).create().show();
            } else if (i8 == -102) {
                new AlertDialog.Builder(favoriteDialog.getContext()).setMessage(favoriteDialog.getContext().getString(2131846723)).create().show();
            } else if (i8 != 11211) {
                Context context2 = favoriteDialog.getContext();
                String string = str;
                if (StringsKt.isBlank(str)) {
                    string = favoriteDialog.getContext().getString(2131841734);
                }
                ToastHelper.showToastShort(context2, string);
            } else if (((ArrayList) favoriteDialog.f85695m.P()).isEmpty()) {
                String string2 = str;
                if (StringsKt.isBlank(str)) {
                    string2 = favoriteDialog.getContext().getString(2131841734);
                }
                ToastHelper.showToast(FoundationAlias.getFapp(), string2, 0, 17);
            } else {
                ArrayList arrayList = (ArrayList) favoriteDialog.f85695m.P();
                if (arrayList.size() != 1 || !((PlaySet) arrayList.get(0)).isDefault()) {
                    z7 = false;
                }
                favoriteDialog.n(str, "", false, z7);
            }
        } else {
            ToastHelper.showToastShort(favoriteDialog.getContext(), 2131841734);
        }
        k kVar = favoriteDialog.f85702t;
        if (kVar != null) {
            kVar.f(null, false);
        }
        favoriteDialog.dismiss();
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        this.f85695m.f85723a = null;
        super.dismiss();
    }

    public final void k(String str) {
        Map mapCreateMapBuilder = MapsKt.createMapBuilder();
        mapCreateMapBuilder.put("spmid", this.f85685b.f85714k);
        mapCreateMapBuilder.put(GameCardButton.extraAvid, String.valueOf(this.f85685b.f85705a));
        mapCreateMapBuilder.put("cid", String.valueOf(this.f85685b.f85706b));
        mapCreateMapBuilder.put("type", o());
        mapCreateMapBuilder.put("plnum", str);
        mapCreateMapBuilder.put("action_type", "complete");
        mapCreateMapBuilder.put("is_drag_select", this.f85699q ? "1" : "0");
        PlaySet playSet = (PlaySet) CollectionsKt.getOrNull(this.f85695m.f85724b, 0);
        Object obj = "0";
        if (playSet != null) {
            obj = "0";
            if (playSet.hasCurrentVideo()) {
                obj = "1";
            }
        }
        mapCreateMapBuilder.put("is_default_select", obj);
        Neurons.reportClick(false, "community.public-community.collect-panel.complete.click", MapsKt.build(mapCreateMapBuilder));
    }

    public final void l(String str) {
        Map mapCreateMapBuilder = MapsKt.createMapBuilder();
        mapCreateMapBuilder.put("button_name", str);
        mapCreateMapBuilder.put("spmid", this.f85685b.f85714k);
        mapCreateMapBuilder.put(GameCardButton.extraAvid, String.valueOf(this.f85685b.f85705a));
        mapCreateMapBuilder.put("cid", String.valueOf(this.f85685b.f85706b));
        mapCreateMapBuilder.put("type", o());
        Neurons.reportClick(false, "community.public-community.collect-panel.button.click", MapsKt.build(mapCreateMapBuilder));
    }

    public final void m(WindowSizeClass windowSizeClass) {
        int iDpToPx = 0;
        if (!KScreenAdjustUtilsKt.isNormal(windowSizeClass)) {
            iDpToPx = DimenUtilsKt.dpToPx(KScreenAdjustUtilsKt.functionPanelMaxWith$default(windowSizeClass, 0, 1, (Object) null));
        }
        View view = this.f85688e;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
            layoutParams2.matchConstraintMaxWidth = iDpToPx;
            view.setLayoutParams(layoutParams2);
        }
        View view2 = this.f85692j;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams3 = view2.getLayoutParams();
            if (layoutParams3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.LayoutParams layoutParams4 = (ConstraintLayout.LayoutParams) layoutParams3;
            layoutParams4.matchConstraintMaxWidth = iDpToPx;
            view2.setLayoutParams(layoutParams4);
        }
        BLog.i("FavoriteDialog", "onCreate: windowSize=" + windowSizeClass + ", maxWidth=" + iDpToPx);
    }

    public final void n(String str, String str2, boolean z6, boolean z7) {
        if (!z6) {
            k kVar = this.f85702t;
            if (kVar != null) {
                kVar.g(2131851776, str, "", false);
                return;
            }
            return;
        }
        String strA = (((Boolean) this.f85701s.getValue()).booleanValue() || !com.bilibili.playset.utils.b.d()) ? z7 ? "bilibili://main/favorite?expand=default" : "bilibili://main/favorite?expand=created" : StringsKt.n(str2, ",") ? "bilibili://adaptive/favourite2/?is_container_mode=true" : android.support.v4.media.a.a("bilibili://adaptive/favourite/detail/?id=", str2, "&is_container_mode=true");
        k kVar2 = this.f85702t;
        if (kVar2 != null) {
            kVar2.g(2131851777, str, strA, true);
        }
    }

    public final String o() {
        return d.f85730b[this.f85685b.f85707c.ordinal()] == 1 ? "3" : "4";
    }

    /* JADX WARN: Removed duplicated region for block: B:140:0x04a8  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x04cf  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02de  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onClick(@org.jetbrains.annotations.NotNull android.view.View r13) {
        /*
            Method dump skipped, instruction units count: 1740
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playset.widget.favorite.FavoriteDialog.onClick(android.view.View):void");
    }

    @Override // androidx.activity.ComponentDialog, android.app.Dialog
    public final void onCreate(@Nullable Bundle bundle) {
        View view;
        super.onCreate(bundle);
        requestWindowFeature(1);
        Window window = getWindow();
        if (window != null) {
            window.setSoftInputMode(51);
        }
        if (bundle != null) {
            this.f85696n = BundleUtil.getLong(bundle, "key:resource_id", new long[]{-1});
            this.f85698p = BundleUtil.getLong(bundle, "key:season_id", new long[]{-1});
            this.f85697o = BundleUtil.getInteger(bundle, "key:type_id", new Integer[]{-1}).intValue();
        }
        if (this.f85696n < 0) {
            ToastHelper.showToastShort(getContext(), "invalid params");
            dismiss();
            return;
        }
        c cVar = this.f85695m;
        b bVar = this.f85685b;
        cVar.f85727e = bVar.f85718o;
        cVar.f85728f = bVar.f85722s;
        setContentView(2131496436);
        this.f85687d = findViewById(2131299396);
        this.f85689f = findViewById(2131306580);
        this.f85690g = findViewById(2131303626);
        this.h = (TintCheckBox) findViewById(2131310964);
        this.f85691i = findViewById(2131316529);
        this.f85692j = findViewById(2131297591);
        this.f85688e = findViewById(2131317574);
        this.f85693k = findViewById(2131300250);
        this.f85694l = (ImageView) findViewById(2131317046);
        View view2 = this.f85687d;
        if (view2 != null) {
            BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(view2);
            ListExtentionsKt.visible(this.f85694l);
            bottomSheetBehaviorFrom.setPeekHeight((int) TypedValue.applyDimension(1, 335.0f, getContext().getResources().getDisplayMetrics()));
            bottomSheetBehaviorFrom.addBottomSheetCallback(new j(this));
        }
        View view3 = this.f85687d;
        if (view3 != null) {
            view3.setBackgroundTintList(ColorStateList.valueOf(ResourcesCompat.getColor(getContext().getResources(), R$color.Bg2, null)));
        }
        tv.danmaku.bili.widget.RecyclerView recyclerView = this.f85689f;
        if (recyclerView != null) {
            recyclerView.setBackgroundTintList(ColorStateList.valueOf(ResourcesCompat.getColor(getContext().getResources(), R$color.f64616Wh0, null)));
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) findViewById(2131297837);
        if (constraintLayout != null) {
            constraintLayout.setBackgroundTintList(ColorStateList.valueOf(ResourcesCompat.getColor(getContext().getResources(), R$color.Bg1_float, null)));
        }
        TextView textView = (TextView) findViewById(2131307839);
        if (textView != null) {
            textView.setOnClickListener(this);
        }
        TintCheckBox tintCheckBox = this.h;
        if (tintCheckBox != null) {
            tintCheckBox.setOnClickListener(this);
        }
        View viewFindViewById = findViewById(2131306968);
        if (viewFindViewById != null) {
            viewFindViewById.setOnClickListener(new AR0.b(this, 2));
        }
        if (constraintLayout != null) {
            constraintLayout.setOnClickListener(this);
        }
        View view4 = this.f85691i;
        if (view4 != null) {
            view4.setOnClickListener(this);
        }
        TintCheckBox tintCheckBox2 = this.h;
        if (tintCheckBox2 != null) {
            tintCheckBox2.setChecked(this.f85685b.f85711g);
        }
        if (Intrinsics.areEqual(this.f85685b.f85717n, Boolean.TRUE) && (view = this.f85691i) != null) {
            view.setVisibility(8);
        }
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        WindowSizeClass windowSizeClassWindowSize = ScreenAdjustUtilsKt.windowSize(this.f85684a);
        objectRef.element = windowSizeClassWindowSize;
        m(windowSizeClassWindowSize);
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass3(this, objectRef, null), 3, (Object) null);
        c cVar2 = this.f85695m;
        cVar2.f85723a = this;
        tv.danmaku.bili.widget.RecyclerView recyclerView2 = this.f85689f;
        if (recyclerView2 != null) {
            recyclerView2.setAdapter(cVar2);
        }
        p();
    }

    @Override // androidx.activity.ComponentDialog, android.app.Dialog
    @NotNull
    public final Bundle onSaveInstanceState() {
        Bundle bundleOnSaveInstanceState = super.onSaveInstanceState();
        bundleOnSaveInstanceState.putLong("key:resource_id", this.f85696n);
        bundleOnSaveInstanceState.putLong("key:season_id", this.f85698p);
        bundleOnSaveInstanceState.putInt("key:type_id", this.f85697o);
        return bundleOnSaveInstanceState;
    }

    @Override // androidx.activity.ComponentDialog, android.app.Dialog
    public final void onStart() {
        super.onStart();
        Window window = getWindow();
        if (window != null) {
            window.setLayout(-1, -1);
            window.setDimAmount(0.5f);
        }
    }

    public final void p() {
        BiliAccounts biliAccounts = BiliAccounts.get(getContext());
        if (biliAccounts.isLogin()) {
            LoadingImageView loadingImageView = this.f85690g;
            if (loadingImageView != null) {
                loadingImageView.setVisibility(0);
                loadingImageView.setRefreshing();
            }
            BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), (CoroutineContext) null, (CoroutineStart) null, new FavoriteDialog$updateFavBoxList$1(biliAccounts, this, null), 3, (Object) null);
        }
    }
}
