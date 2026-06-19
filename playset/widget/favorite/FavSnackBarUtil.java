package com.bilibili.playset.widget.favorite;

import I.E;
import android.R;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.activity.ComponentActivity;
import androidx.compose.animation.core.I;
import androidx.compose.foundation.C3554n0;
import androidx.compose.runtime.C4277b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.res.ResourcesCompat;
import androidx.window.core.layout.WindowSizeClass;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.biligame.card.GameCardButton;
import com.bilibili.droid.DimenUtilsKt;
import com.bilibili.droid.ScreenUtil;
import com.bilibili.iconfont.KtxKt;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.lib.theme.R$color;
import com.bilibili.playset.widget.favorite.snackbar.SnackBarManager;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.MapsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/widget/favorite/FavSnackBarUtil.class */
@StabilityInferred(parameters = 1)
public final class FavSnackBarUtil {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/widget/favorite/FavSnackBarUtil$Scene.class */
    public static final class Scene {
        private static final EnumEntries $ENTRIES;
        private static final Scene[] $VALUES;
        public static final Scene DetailPage = new Scene("DetailPage", 0);
        public static final Scene DetailPlayer = new Scene("DetailPlayer", 1);
        public static final Scene Story = new Scene("Story", 2);
        public static final Scene Podcast = new Scene("Podcast", 3);

        private static final /* synthetic */ Scene[] $values() {
            return new Scene[]{DetailPage, DetailPlayer, Story, Podcast};
        }

        static {
            Scene[] sceneArr$values = $values();
            $VALUES = sceneArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(sceneArr$values);
        }

        private Scene(String str, int i7) {
        }

        @NotNull
        public static EnumEntries<Scene> getEntries() {
            return $ENTRIES;
        }

        public static Scene valueOf(String str) {
            return (Scene) Enum.valueOf(Scene.class, str);
        }

        public static Scene[] values() {
            return (Scene[]) $VALUES.clone();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/widget/favorite/FavSnackBarUtil$a.class */
    @JvmInline
    public static final class a {
        public static final boolean a(int i7, int i8) {
            return i7 == i8;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/widget/favorite/FavSnackBarUtil$b.class */
    public interface b {
        void onClick();

        default void onDismiss() {
        }

        default void onShow() {
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/widget/favorite/FavSnackBarUtil$c.class */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final Scene f85670a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f85671b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final String f85672c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f85673d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public final FavFrom f85674e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        public final String f85675f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final long f85676g;
        public final long h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @Nullable
        public final String f85677i;

        public c(Scene scene, int i7, String str, boolean z6, FavFrom favFrom, String str2, long j7, long j8, String str3) {
            this.f85670a = scene;
            this.f85671b = i7;
            this.f85672c = str;
            this.f85673d = z6;
            this.f85674e = favFrom;
            this.f85675f = str2;
            this.f85676g = j7;
            this.h = j8;
            this.f85677i = str3;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f85670a == cVar.f85670a && a.a(this.f85671b, cVar.f85671b) && Intrinsics.areEqual(this.f85672c, cVar.f85672c) && this.f85673d == cVar.f85673d && this.f85674e == cVar.f85674e && Intrinsics.areEqual(this.f85675f, cVar.f85675f) && this.f85676g == cVar.f85676g && this.h == cVar.h && Intrinsics.areEqual(this.f85677i, cVar.f85677i);
        }

        public final int hashCode() {
            int iA = C3554n0.a(C3554n0.a(E.a((this.f85674e.hashCode() + androidx.compose.animation.z.a(E.a(I.a(this.f85671b, this.f85670a.hashCode() * 31, 31), 31, this.f85672c), 31, this.f85673d)) * 31, 31, this.f85675f), 31, this.f85676g), 31, this.h);
            String str = this.f85677i;
            return iA + (str == null ? 0 : str.hashCode());
        }

        @NotNull
        public final String toString() {
            String strA = C4277b.a(this.f85671b, ")", new StringBuilder("ButtonType(content="));
            String strA2 = C8770a.a(new StringBuilder("VideoType(type="), this.f85675f, ")");
            StringBuilder sb = new StringBuilder("Params(scene=");
            sb.append(this.f85670a);
            sb.append(", type=");
            sb.append(strA);
            sb.append(", toast=");
            sb.append(this.f85672c);
            sb.append(", favSuccess=");
            sb.append(this.f85673d);
            sb.append(", favFrom=");
            sb.append(this.f85674e);
            sb.append(", videoType=");
            sb.append(strA2);
            sb.append(", avid=");
            sb.append(this.f85676g);
            sb.append(", cid=");
            sb.append(this.h);
            sb.append(", spmid=");
            return C8770a.a(sb, this.f85677i, ")");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/widget/favorite/FavSnackBarUtil$d.class */
    public static final /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f85678a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int[] f85679b;

        static {
            int[] iArr = new int[Scene.values().length];
            try {
                iArr[Scene.DetailPage.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[Scene.DetailPlayer.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            try {
                iArr[Scene.Story.ordinal()] = 3;
            } catch (NoSuchFieldError e9) {
            }
            try {
                iArr[Scene.Podcast.ordinal()] = 4;
            } catch (NoSuchFieldError e10) {
            }
            f85678a = iArr;
            int[] iArr2 = new int[FavFrom.values().length];
            try {
                iArr2[FavFrom.Fav.ordinal()] = 1;
            } catch (NoSuchFieldError e11) {
            }
            try {
                iArr2[FavFrom.Triple.ordinal()] = 2;
            } catch (NoSuchFieldError e12) {
            }
            try {
                iArr2[FavFrom.Dialog.ordinal()] = 3;
            } catch (NoSuchFieldError e13) {
            }
            f85679b = iArr2;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/widget/favorite/FavSnackBarUtil$e.class */
    public static final class e implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f85680a;

        public e(b bVar) {
            this.f85680a = bVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            BLog.i("FavSnackBarUtil", "dismiss cause of click btn");
            SnackBarManager.a();
            this.f85680a.onClick();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/widget/favorite/FavSnackBarUtil$f.class */
    public static final class f implements com.bilibili.playset.widget.favorite.snackbar.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f85681a;

        public f(b bVar) {
            this.f85681a = bVar;
        }

        @Override // com.bilibili.playset.widget.favorite.snackbar.a
        public final void onDismiss() {
            this.f85681a.onDismiss();
        }

        @Override // com.bilibili.playset.widget.favorite.snackbar.a
        public final void onShow() {
            this.f85681a.onShow();
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void a(boolean z6, c cVar) throws NoWhenBranchMatchedException {
        Object obj;
        int i7 = cVar.f85671b;
        String str = a.a(i7, 2131851777) ? "1" : a.a(i7, 2131851776) ? "2" : "";
        int i8 = d.f85679b[cVar.f85674e.ordinal()];
        if (i8 == 1) {
            obj = "collect";
        } else if (i8 == 2) {
            obj = "highlyrec";
        } else {
            if (i8 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            obj = "modify";
        }
        String str2 = cVar.f85673d ? "1" : "0";
        Map mapCreateMapBuilder = MapsKt.createMapBuilder();
        String str3 = cVar.f85677i;
        mapCreateMapBuilder.put("spmid", str3 != null ? str3 : "");
        mapCreateMapBuilder.put("from_action", obj);
        mapCreateMapBuilder.put(GameCardButton.extraAvid, String.valueOf(cVar.f85676g));
        mapCreateMapBuilder.put("cid", String.valueOf(cVar.h));
        mapCreateMapBuilder.put("type", cVar.f85675f);
        mapCreateMapBuilder.put("from_action_status", str2);
        mapCreateMapBuilder.put("goto", str);
        Map mapBuild = MapsKt.build(mapCreateMapBuilder);
        if (z6) {
            Neurons.reportExposure$default(false, "community.public-community.snackbar-collect-succeed.0.show", mapBuild, (List) null, 8, (Object) null);
        } else {
            Neurons.reportClick(false, "community.public-community.snackbar-collect-succeed.0.click", mapBuild);
        }
    }

    public static void b(@NotNull String str, @NotNull String str2, @NotNull ComponentActivity componentActivity, @NotNull b bVar) {
        if (StringsKt.isBlank(str) || StringsKt.isBlank(str2)) {
            BLog.w("FavSnackBarUtil", "showNormalSnackBar content is empty");
            return;
        }
        ViewGroup viewGroup = (ViewGroup) componentActivity.findViewById(R.id.content);
        if (viewGroup == null) {
            BLog.w("FavSnackBarUtil", "parent is null");
        }
        es0.i iVarInflate = es0.i.inflate(LayoutInflater.from(componentActivity), viewGroup, false);
        if (iVarInflate.f117426b.getLayoutParams() != null) {
            ConstraintLayout constraintLayout = iVarInflate.f117426b;
            ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            int screenWidth = ScreenUtil.getScreenWidth(componentActivity);
            int screenHeight = ScreenUtil.getScreenHeight(componentActivity);
            BLog.i("FavSnackBarUtil", androidx.compose.runtime.collection.d.a(screenWidth, screenHeight, "screenWidth & screenHeight : [", ", ", "]"));
            layoutParams.width = RangesKt.coerceAtMost(RangesKt.coerceAtMost(screenWidth, screenHeight) - ListExtentionsKt.toPx(24), DimenUtilsKt.dpToPx(WindowSizeClass.HEIGHT_DP_MEDIUM_LOWER_BOUND));
            constraintLayout.setLayoutParams(layoutParams);
        }
        Drawable appCompatDrawable = KtxKt.getAppCompatDrawable(componentActivity, 2131238784);
        if (appCompatDrawable != null) {
            iVarInflate.f117428d.setImageDrawable(appCompatDrawable);
            iVarInflate.f117428d.setImageTintList(ColorStateList.valueOf(ResourcesCompat.getColor(componentActivity.getResources(), R$color.Brand_pink, null)));
        }
        iVarInflate.f117430f.setText(str);
        iVarInflate.f117429e.setText(str2);
        e eVar = new e(bVar);
        ConstraintLayout constraintLayout2 = iVarInflate.f117425a;
        constraintLayout2.setOnClickListener(eVar);
        SnackBarManager.b(componentActivity, new SnackBarManager.a(constraintLayout2, viewGroup, 0, 60), new f(bVar));
    }

    public static void c(@NotNull ComponentActivity componentActivity, @NotNull Scene scene, @NotNull String str, int i7, boolean z6, @NotNull FavFrom favFrom, @NotNull String str2, long j7, long j8, @Nullable String str3, @NotNull b bVar) {
        int i8;
        int px;
        int i9;
        int i10;
        c cVar = new c(scene, i7, str, z6, favFrom, str2, j7, j8, str3);
        if (str.length() == 0) {
            BLog.w("FavSnackBarUtil", "toast is empty");
            return;
        }
        ViewGroup viewGroup = (ViewGroup) componentActivity.findViewById(R.id.content);
        if (viewGroup == null) {
            BLog.w("FavSnackBarUtil", "parent is null");
        }
        es0.i iVarInflate = es0.i.inflate(LayoutInflater.from(componentActivity), viewGroup, false);
        if (iVarInflate.f117426b.getLayoutParams() != null) {
            ConstraintLayout constraintLayout = iVarInflate.f117426b;
            ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            int screenWidth = ScreenUtil.getScreenWidth(componentActivity);
            int screenHeight = ScreenUtil.getScreenHeight(componentActivity);
            BLog.i("FavSnackBarUtil", androidx.compose.runtime.collection.d.a(screenWidth, screenHeight, "screenWidth & screenHeight : [", ", ", "]"));
            layoutParams.width = RangesKt.coerceAtMost(RangesKt.coerceAtMost(screenWidth, screenHeight) - ListExtentionsKt.toPx(24), DimenUtilsKt.dpToPx(WindowSizeClass.HEIGHT_DP_MEDIUM_LOWER_BOUND));
            constraintLayout.setLayoutParams(layoutParams);
            Resources resources = componentActivity.getResources();
            int i11 = d.f85678a[scene.ordinal()];
            if (i11 == 1) {
                i10 = R$color.Bg1_float;
            } else {
                if (i11 != 2 && i11 != 3 && i11 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                i10 = R$color.Ga9_u;
            }
            constraintLayout.setBackgroundTintList(ColorStateList.valueOf(ResourcesCompat.getColor(resources, i10, null)));
        }
        View view = iVarInflate.f117427c;
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        if (layoutParams2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        int screenWidth2 = ScreenUtil.getScreenWidth(componentActivity);
        int screenHeight2 = ScreenUtil.getScreenHeight(componentActivity);
        BLog.i("FavSnackBarUtil", androidx.compose.runtime.collection.d.a(screenWidth2, screenHeight2, "screenWidth & screenHeight : [", ", ", "]"));
        layoutParams2.width = RangesKt.coerceAtMost(RangesKt.coerceAtMost(screenWidth2, screenHeight2), DimenUtilsKt.dpToPx(520));
        view.setLayoutParams(layoutParams2);
        Drawable appCompatDrawable = KtxKt.getAppCompatDrawable(componentActivity, z6 ? 2131238784 : 2131239039);
        if (appCompatDrawable != null) {
            iVarInflate.f117428d.setImageDrawable(appCompatDrawable);
            ImageView imageView = iVarInflate.f117428d;
            Resources resources2 = componentActivity.getResources();
            if (z6) {
                int i12 = d.f85678a[scene.ordinal()];
                if (i12 == 1) {
                    i9 = R$color.Brand_pink;
                } else {
                    if (i12 != 2 && i12 != 3 && i12 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i9 = R$color.Wh0_u;
                }
            } else {
                i9 = R$color.Graph_medium;
            }
            imageView.setImageTintList(ColorStateList.valueOf(ResourcesCompat.getColor(resources2, i9, null)));
        }
        iVarInflate.f117430f.setText(str);
        TextView textView = iVarInflate.f117430f;
        Resources resources3 = componentActivity.getResources();
        int[] iArr = d.f85678a;
        int i13 = iArr[scene.ordinal()];
        if (i13 == 1) {
            i8 = R$color.Text1;
        } else {
            if (i13 != 2 && i13 != 3 && i13 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            i8 = R$color.Wh0_u;
        }
        textView.setTextColor(ResourcesCompat.getColor(resources3, i8, null));
        iVarInflate.f117429e.setText(componentActivity.getString(i7));
        com.bilibili.playset.widget.favorite.b bVar2 = new com.bilibili.playset.widget.favorite.b(cVar, bVar);
        ConstraintLayout constraintLayout2 = iVarInflate.f117425a;
        constraintLayout2.setOnClickListener(bVar2);
        int i14 = iArr[scene.ordinal()];
        if (i14 == 1) {
            px = 0;
        } else if (i14 == 2) {
            px = ListExtentionsKt.toPx(22);
        } else if (i14 == 3) {
            px = ListExtentionsKt.toPx(58);
        } else {
            if (i14 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            px = ListExtentionsKt.toPx(101);
        }
        SnackBarManager.b(componentActivity, new SnackBarManager.a(constraintLayout2, viewGroup, px, 28), new com.bilibili.playset.widget.favorite.c(cVar, bVar));
    }
}
