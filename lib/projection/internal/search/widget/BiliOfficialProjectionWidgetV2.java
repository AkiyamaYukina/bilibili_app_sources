package com.bilibili.lib.projection.internal.search.widget;

import Be0.C1423a;
import Ce0.C1513a;
import android.content.Context;
import android.graphics.Typeface;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bilibili.lib.image2.BiliImageLoader;
import com.bilibili.lib.image2.view.BiliImageView;
import com.bilibili.lib.projection.internal.api.model.ListUiBean;
import com.bilibili.lib.ui.util.MultipleThemeUtils;
import ge0.InterfaceC7274d;
import he0.C7432a;
import ie0.C7564c;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import le0.C7838f;
import le0.InterfaceC7845m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;
import tv.danmaku.bili.widget.RecyclerView;
import tv.danmaku.bili.widget.dialog.CommonDialogUtilsKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/search/widget/BiliOfficialProjectionWidgetV2.class */
public final class BiliOfficialProjectionWidgetV2 extends LinearLayout {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f63820r = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public RecyclerView f63821a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public Ae0.c f63822b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public BiliImageView f63823c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public TextView f63824d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public WidgetV2Type f63825e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public ListUiBean f63826f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public LinearLayout f63827g;

    @Nullable
    public LinearLayout h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public TextView f63828i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public TextView f63829j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f63830k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f63831l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f63832m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public List<? extends InterfaceC7274d> f63833n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    public List<? extends InterfaceC7274d> f63834o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    public b f63835p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Nullable
    public c f63836q;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/search/widget/BiliOfficialProjectionWidgetV2$DeviceShowInfoV2Type.class */
    public static final class DeviceShowInfoV2Type {
        private static final EnumEntries $ENTRIES;
        private static final DeviceShowInfoV2Type[] $VALUES;
        public static final DeviceShowInfoV2Type BiliEmpty = new DeviceShowInfoV2Type("BiliEmpty", 0, 0);
        public static final DeviceShowInfoV2Type CommonDevice = new DeviceShowInfoV2Type("CommonDevice", 1, 1);
        public static final DeviceShowInfoV2Type Unknown = new DeviceShowInfoV2Type("Unknown", 2, -1);
        private final int value;

        private static final /* synthetic */ DeviceShowInfoV2Type[] $values() {
            return new DeviceShowInfoV2Type[]{BiliEmpty, CommonDevice, Unknown};
        }

        static {
            DeviceShowInfoV2Type[] deviceShowInfoV2TypeArr$values = $values();
            $VALUES = deviceShowInfoV2TypeArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(deviceShowInfoV2TypeArr$values);
        }

        private DeviceShowInfoV2Type(String str, int i7, int i8) {
            this.value = i8;
        }

        @NotNull
        public static EnumEntries<DeviceShowInfoV2Type> getEntries() {
            return $ENTRIES;
        }

        public static DeviceShowInfoV2Type valueOf(String str) {
            return (DeviceShowInfoV2Type) Enum.valueOf(DeviceShowInfoV2Type.class, str);
        }

        public static DeviceShowInfoV2Type[] values() {
            return (DeviceShowInfoV2Type[]) $VALUES.clone();
        }

        public final int getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/search/widget/BiliOfficialProjectionWidgetV2$WidgetV2Type.class */
    public static final class WidgetV2Type {
        private static final EnumEntries $ENTRIES;
        private static final WidgetV2Type[] $VALUES;
        private final int value;
        public static final WidgetV2Type Bili = new WidgetV2Type("Bili", 0, 0);
        public static final WidgetV2Type Vehicle = new WidgetV2Type("Vehicle", 1, 1);
        public static final WidgetV2Type ThirdParty = new WidgetV2Type("ThirdParty", 2, 2);
        public static final WidgetV2Type Unknown = new WidgetV2Type("Unknown", 3, -1);

        private static final /* synthetic */ WidgetV2Type[] $values() {
            return new WidgetV2Type[]{Bili, Vehicle, ThirdParty, Unknown};
        }

        static {
            WidgetV2Type[] widgetV2TypeArr$values = $values();
            $VALUES = widgetV2TypeArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(widgetV2TypeArr$values);
        }

        private WidgetV2Type(String str, int i7, int i8) {
            this.value = i8;
        }

        @NotNull
        public static EnumEntries<WidgetV2Type> getEntries() {
            return $ENTRIES;
        }

        public static WidgetV2Type valueOf(String str) {
            return (WidgetV2Type) Enum.valueOf(WidgetV2Type.class, str);
        }

        public static WidgetV2Type[] values() {
            return (WidgetV2Type[]) $VALUES.clone();
        }

        public final int getValue() {
            return this.value;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/search/widget/BiliOfficialProjectionWidgetV2$a.class */
    public static final class a {
        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        /* JADX WARN: Type inference failed for: r0v1, types: [android.widget.LinearLayout, com.bilibili.lib.projection.internal.search.widget.BiliOfficialProjectionWidgetV2] */
        @Nullable
        public static BiliOfficialProjectionWidgetV2 a(@Nullable Context context, @NotNull WidgetV2Type widgetV2Type, int i7, boolean z6, @NotNull b bVar) throws NoWhenBranchMatchedException {
            if (context == null) {
                return null;
            }
            ?? linearLayout = new LinearLayout(context);
            linearLayout.f63825e = WidgetV2Type.Unknown;
            linearLayout.setOrientation(1);
            linearLayout.setGravity(17);
            linearLayout.removeAllViews();
            linearLayout.f63835p = bVar;
            LinearLayout linearLayout2 = new LinearLayout(linearLayout.getContext());
            linearLayout2.setOrientation(0);
            linearLayout2.setGravity(3);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            layoutParams.topMargin = (int) C7432a.a(linearLayout2.getContext(), 10.0f);
            linearLayout2.setPadding((int) C7432a.a(linearLayout2.getContext(), 12.0f), 0, 0, 0);
            linearLayout2.setLayoutParams(layoutParams);
            linearLayout.f63827g = linearLayout2;
            BiliImageView biliImageView = new BiliImageView(linearLayout.getContext());
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams((int) C7432a.a(biliImageView.getContext(), 18.0f), (int) C7432a.a(biliImageView.getContext(), 16.0f));
            biliImageView.setScaleType(ImageView.ScaleType.CENTER);
            biliImageView.getGenericProperties().setPlaceholderImage(2131232623);
            layoutParams2.rightMargin = (int) C7432a.a(biliImageView.getContext(), 2.0f);
            biliImageView.setLayoutParams(layoutParams2);
            linearLayout.f63823c = biliImageView;
            TextView textView = new TextView(linearLayout.getContext());
            textView.setTextSize(12.0f);
            textView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            textView.setGravity(48);
            textView.setTypeface(Typeface.DEFAULT_BOLD);
            linearLayout.f63824d = textView;
            LinearLayout linearLayout3 = linearLayout.f63827g;
            if (linearLayout3 != null) {
                linearLayout3.addView(linearLayout.f63823c);
            }
            LinearLayout linearLayout4 = linearLayout.f63827g;
            if (linearLayout4 != null) {
                linearLayout4.addView(linearLayout.f63824d);
            }
            linearLayout.addView(linearLayout.f63827g);
            if (linearLayout.f63821a == null) {
                RecyclerView recyclerView = new RecyclerView(linearLayout.getContext());
                if (MultipleThemeUtils.isNightTheme(recyclerView.getContext())) {
                    recyclerView.setBackgroundResource(2131238593);
                } else {
                    recyclerView.setBackgroundResource(2131238594);
                }
                Ae0.c cVar = new Ae0.c(i7, z6, bVar);
                cVar.f279e = linearLayout.f63826f;
                cVar.notifyDataSetChanged();
                cVar.setHasStableIds(true);
                linearLayout.f63822b = cVar;
                recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 1, false));
                LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
                layoutParams3.setMargins((int) C7432a.a(recyclerView.getContext(), 12.0f), (int) C7432a.a(recyclerView.getContext(), 14.0f), (int) C7432a.a(recyclerView.getContext(), 12.0f), (int) C7432a.a(recyclerView.getContext(), 12.0f));
                recyclerView.setLayoutParams(layoutParams3);
                recyclerView.setAdapter(linearLayout.f63822b);
                linearLayout.f63821a = recyclerView;
                linearLayout.addView(recyclerView);
            }
            linearLayout.f63830k = i7;
            linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            linearLayout.setWidgetType(widgetV2Type);
            return linearLayout;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/search/widget/BiliOfficialProjectionWidgetV2$b.class */
    public interface b {
        void a(@NotNull String str);

        void b(@Nullable InterfaceC7274d interfaceC7274d, @NotNull WidgetV2Type widgetV2Type);
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/search/widget/BiliOfficialProjectionWidgetV2$c.class */
    public interface c {
        void a(boolean z6);

        void b();
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/search/widget/BiliOfficialProjectionWidgetV2$d.class */
    public static final /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f63837a;

        static {
            int[] iArr = new int[WidgetV2Type.values().length];
            try {
                iArr[WidgetV2Type.Bili.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[WidgetV2Type.Vehicle.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            try {
                iArr[WidgetV2Type.ThirdParty.ordinal()] = 3;
            } catch (NoSuchFieldError e9) {
            }
            try {
                iArr[WidgetV2Type.Unknown.ordinal()] = 4;
            } catch (NoSuchFieldError e10) {
            }
            f63837a = iArr;
        }
    }

    private final InterfaceC7274d getCurrentDevice() {
        C7838f.a aVarI;
        InterfaceC7845m interfaceC7845mH = C7564c.f121625a.h(this.f63830k);
        return (interfaceC7845mH == null || (aVarI = interfaceC7845mH.i()) == null) ? null : aVarI.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final void setWidgetType(WidgetV2Type widgetV2Type) throws NoWhenBranchMatchedException {
        this.f63825e = widgetV2Type;
        int i7 = d.f63837a[widgetV2Type.ordinal()];
        if (i7 == 1 || i7 == 2) {
            TextView textView = this.f63824d;
            if (textView != null) {
                textView.setTypeface(Typeface.DEFAULT_BOLD);
                return;
            }
            return;
        }
        if (i7 != 3 && i7 != 4) {
            throw new NoWhenBranchMatchedException();
        }
        TextView textView2 = this.f63824d;
        if (textView2 != null) {
            textView2.setTypeface(Typeface.DEFAULT);
        }
    }

    @Nullable
    public final void b() {
        synchronized (this) {
            Ae0.c cVar = this.f63822b;
            if (cVar != null) {
                Map<Integer, List<C1423a>> map = C1513a.f1596a;
                List<C1423a> list = (List) ((LinkedHashMap) C1513a.f1596a).get(Integer.valueOf(this.f63825e.getValue()));
                List<C1423a> listEmptyList = list;
                if (list == null) {
                    listEmptyList = CollectionsKt.emptyList();
                }
                cVar.N(listEmptyList, this.f63825e);
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    public final void c(@Nullable List<? extends InterfaceC7274d> list, @Nullable List<? extends InterfaceC7274d> list2, boolean z6) {
        synchronized (this) {
            this.f63833n = list;
            this.f63834o = list2;
            if (!z6 && !this.f63832m) {
                int i7 = d.f63837a[this.f63825e.ordinal()];
                if (i7 == 1) {
                    d(list, list2);
                } else if (i7 == 2) {
                    g(list);
                } else if (i7 == 3) {
                    e(list);
                } else if (i7 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0220 A[Catch: all -> 0x0173, TRY_ENTER, TryCatch #0 {, blocks: (B:26:0x00b9, B:28:0x00c0, B:30:0x00df, B:32:0x011b, B:34:0x0124, B:36:0x012d, B:38:0x0136, B:40:0x013d, B:42:0x0144, B:45:0x0177, B:47:0x0182, B:49:0x018b, B:51:0x0194, B:53:0x019d, B:57:0x01ac, B:59:0x01b3, B:61:0x01bb, B:65:0x01cd, B:67:0x01d6, B:69:0x01df, B:71:0x01e7, B:73:0x01f0, B:75:0x01f9, B:77:0x0202, B:88:0x0220, B:90:0x0227, B:92:0x0254, B:94:0x025e, B:96:0x0267, B:98:0x0270, B:100:0x0279, B:104:0x0288, B:106:0x028f, B:109:0x029a, B:112:0x02a7, B:114:0x02b0, B:116:0x02b9, B:118:0x02c3, B:120:0x02d4, B:122:0x02dc, B:124:0x02e2, B:126:0x02ea, B:128:0x02f1, B:130:0x02fb, B:131:0x0303, B:131:0x0303), top: B:166:0x00b9 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(java.util.List<? extends ge0.InterfaceC7274d> r9, java.util.List<? extends ge0.InterfaceC7274d> r10) {
        /*
            Method dump skipped, instruction units count: 968
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.lib.projection.internal.search.widget.BiliOfficialProjectionWidgetV2.d(java.util.List, java.util.List):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(java.util.List<? extends ge0.InterfaceC7274d> r9) {
        /*
            Method dump skipped, instruction units count: 207
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.lib.projection.internal.search.widget.BiliOfficialProjectionWidgetV2.e(java.util.List):void");
    }

    public final void f(String str, boolean z6, String str2, Integer num) {
        BiliImageView biliImageView;
        Context context;
        TextView textView = this.f63824d;
        if (textView != null) {
            textView.setText(str2);
        }
        int iIntValue = num.intValue();
        TextView textView2 = this.f63824d;
        if (textView2 != null) {
            textView2.setTextColor(iIntValue);
        }
        if (!z6) {
            BiliImageView biliImageView2 = this.f63823c;
            if (biliImageView2 != null) {
                CommonDialogUtilsKt.setVisibility(biliImageView2, false);
                return;
            }
            return;
        }
        if (str == null || str.length() <= 0 || (biliImageView = this.f63823c) == null || (context = biliImageView.getContext()) == null) {
            return;
        }
        BiliImageView biliImageView3 = this.f63823c;
        if (biliImageView3 != null) {
            CommonDialogUtilsKt.setVisibility(biliImageView3, true);
        }
        BiliImageLoader.INSTANCE.with(context).url(str).into(this.f63823c);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g(java.util.List<? extends ge0.InterfaceC7274d> r9) {
        /*
            r8 = this;
            java.util.LinkedList r0 = new java.util.LinkedList
            r1 = r0
            r1.<init>()
            r12 = r0
            r0 = r8
            ge0.d r0 = r0.getCurrentDevice()
            r13 = r0
            r0 = r9
            if (r0 == 0) goto L85
            r0 = r9
            java.util.Iterator r0 = r0.iterator()
            r14 = r0
        L1b:
            r0 = r14
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L85
            r0 = r14
            java.lang.Object r0 = r0.next()
            ge0.d r0 = (ge0.InterfaceC7274d) r0
            r15 = r0
            r0 = 0
            r11 = r0
            r0 = r13
            if (r0 == 0) goto L43
            r0 = r13
            java.lang.String r0 = r0.getUuid()
            r9 = r0
            goto L45
        L43:
            r0 = 0
            r9 = r0
        L45:
            r0 = r15
            if (r0 == 0) goto L52
            r0 = r15
            java.lang.String r0 = r0.getUuid()
            r11 = r0
        L52:
            r0 = r9
            r1 = r11
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            r10 = r0
            r0 = r15
            if (r0 == 0) goto L6b
            r0 = r15
            java.lang.String r0 = r0.getDisplayName()
            r11 = r0
            r0 = r11
            r9 = r0
            r0 = r11
            if (r0 != 0) goto L6e
        L6b:
            java.lang.String r0 = ""
            r9 = r0
        L6e:
            r0 = r12
            Be0.a r1 = new Be0.a
            r2 = r1
            r3 = r15
            com.bilibili.lib.projection.internal.search.widget.BiliOfficialProjectionWidgetV2$DeviceShowInfoV2Type r4 = com.bilibili.lib.projection.internal.search.widget.BiliOfficialProjectionWidgetV2.DeviceShowInfoV2Type.CommonDevice
            r5 = r9
            r6 = r10
            r2.<init>(r3, r4, r5, r6)
            boolean r0 = r0.add(r1)
            goto L1b
        L85:
            r0 = r12
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L95
            r0 = r8
            r1 = 0
            tv.danmaku.bili.widget.dialog.CommonDialogUtilsKt.setVisibility(r0, r1)
            goto Lac
        L95:
            r0 = r8
            r1 = 1
            tv.danmaku.bili.widget.dialog.CommonDialogUtilsKt.setVisibility(r0, r1)
            r0 = r8
            Ae0.c r0 = r0.f63822b
            r9 = r0
            r0 = r9
            if (r0 == 0) goto Lac
            r0 = r9
            r1 = r12
            com.bilibili.lib.projection.internal.search.widget.BiliOfficialProjectionWidgetV2$WidgetV2Type r2 = com.bilibili.lib.projection.internal.search.widget.BiliOfficialProjectionWidgetV2.WidgetV2Type.Vehicle
            r0.N(r1, r2)
        Lac:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.lib.projection.internal.search.widget.BiliOfficialProjectionWidgetV2.g(java.util.List):void");
    }

    @Nullable
    public final List<InterfaceC7274d> getBiliList() {
        return this.f63833n;
    }

    public final void h() {
        synchronized (this) {
            BLog.d("BiliWidgetV2", "-------- bili widget v2 refreshWithSaveLastList, type: " + this.f63825e + ", list1:" + this.f63833n + ", list2: " + this.f63834o + " -------");
            c(this.f63833n, this.f63834o, false);
            Unit unit = Unit.INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x002b A[Catch: all -> 0x0044, all -> 0x0044, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0002, B:7:0x0015, B:11:0x001c, B:23:0x002f, B:24:0x0032, B:18:0x0028, B:20:0x002a, B:21:0x002b, B:9:0x0017), top: B:32:0x0002, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i(@org.jetbrains.annotations.NotNull com.bilibili.lib.projection.internal.search.widget.BiliOfficialProjectionWidgetV2.WidgetV2Type r5) {
        /*
            r4 = this;
            r0 = r4
            monitor-enter(r0)
            java.util.Map<java.lang.Integer, java.util.List<Be0.a>> r0 = Ce0.C1513a.f1596a     // Catch: java.lang.Throwable -> L44
            r7 = r0
            r0 = r5
            int r0 = r0.getValue()     // Catch: java.lang.Throwable -> L44
            r6 = r0
            r0 = r4
            Ae0.c r0 = r0.f63822b     // Catch: java.lang.Throwable -> L44
            r5 = r0
            r0 = r5
            if (r0 == 0) goto L2b
            r0 = r5
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L44
            r0 = r5
            java.util.List<Be0.a> r0 = r0.f278d     // Catch: java.lang.Throwable -> L26
            r7 = r0
            r0 = r5
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L44
            r0 = r7
            r5 = r0
            r0 = r7
            if (r0 != 0) goto L2f
            goto L2b
        L26:
            r7 = move-exception
            r0 = r5
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L44
            r0 = r7
            throw r0     // Catch: java.lang.Throwable -> L44
        L2b:
            java.util.List r0 = kotlin.collections.CollectionsKt.emptyList()     // Catch: java.lang.Throwable -> L44 java.lang.Throwable -> L44
            r5 = r0
        L2f:
            java.util.Map<java.lang.Integer, java.util.List<Be0.a>> r0 = Ce0.C1513a.f1596a     // Catch: java.lang.Throwable -> L44 java.lang.Throwable -> L44
            r1 = r6
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L44
            r2 = r5
            java.lang.Object r0 = r0.put(r1, r2)     // Catch: java.lang.Throwable -> L44
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L44
            r5 = r0
            r0 = r4
            monitor-exit(r0)
            return
        L44:
            r5 = move-exception
            r0 = r4
            monitor-exit(r0)
            r0 = r5
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.lib.projection.internal.search.widget.BiliOfficialProjectionWidgetV2.i(com.bilibili.lib.projection.internal.search.widget.BiliOfficialProjectionWidgetV2$WidgetV2Type):void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeAllViews();
        this.f63825e = WidgetV2Type.Unknown;
        this.f63826f = null;
    }

    public final void setFrozenUi(boolean z6) {
        this.f63832m = z6;
    }

    public final void setIV2ExposeAction(@NotNull c cVar) {
        this.f63836q = cVar;
        Ae0.c cVar2 = this.f63822b;
        if (cVar2 != null) {
            cVar2.f284k = cVar;
        }
    }

    public final void setNewMarginTop(float f7) {
        LinearLayout linearLayout = this.f63827g;
        LinearLayout.LayoutParams layoutParams = null;
        ViewGroup.LayoutParams layoutParams2 = linearLayout != null ? linearLayout.getLayoutParams() : null;
        if (layoutParams2 instanceof LinearLayout.LayoutParams) {
            layoutParams = (LinearLayout.LayoutParams) layoutParams2;
        }
        if (layoutParams != null) {
            layoutParams.topMargin = (int) C7432a.a(getContext(), f7);
            LinearLayout linearLayout2 = this.f63827g;
            if (linearLayout2 != null) {
                linearLayout2.setLayoutParams(layoutParams);
            }
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x015e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void setUiBean(@org.jetbrains.annotations.Nullable com.bilibili.lib.projection.internal.api.model.ListUiBean r7) throws kotlin.NoWhenBranchMatchedException {
        /*
            Method dump skipped, instruction units count: 374
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.lib.projection.internal.search.widget.BiliOfficialProjectionWidgetV2.setUiBean(com.bilibili.lib.projection.internal.api.model.ListUiBean):void");
    }
}
