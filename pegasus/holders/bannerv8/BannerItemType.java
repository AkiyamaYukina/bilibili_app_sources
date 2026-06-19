package com.bilibili.pegasus.holders.bannerv8;

import J3.C2324a0;
import J3.C2327b0;
import J3.C2330c0;
import J3.C2333d0;
import J3.W;
import J3.X;
import J3.Y;
import J3.Z;
import com.alipay.blueshield.IDeviceColorModule;
import com.bapis.bilibili.main.community.reply.v1.KReplyInfo;
import com.bilibili.app.comm.list.widget.banneradapter.BannerItem;
import com.bilibili.bplus.im.share.IMShareEntryActivity;
import com.bilibili.gripper.api.ad.biz.GAdBizKt;
import com.bilibili.lib.blrouter.MutableBundleLike;
import com.bilibili.lib.fasthybrid.runtime.IRuntime;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlinx.serialization.json.JsonBuilder;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/holders/bannerv8/BannerItemType.class */
public final class BannerItemType {
    private static final EnumEntries $ENTRIES;
    private static final BannerItemType[] $VALUES;

    @NotNull
    private final Function0<BannerItem<gp0.b, ?>> creator;

    @NotNull
    private final String type;
    private final int viewType;
    public static final BannerItemType STATIC = new BannerItemType("STATIC", 0, IDeviceColorModule.UPDATE_LABEL_SCENE_STATIC, -892481938, new W(8));
    public static final BannerItemType INLINE_AV = new BannerItemType("INLINE_AV", 1, "inline_av", 2103319451, new X(7));
    public static final BannerItemType INLINE_OGV = new BannerItemType("INLINE_OGV", 2, "inline_pgc", 778407590, new Y(8));
    public static final BannerItemType INLINE_LIVE = new BannerItemType("INLINE_LIVE", 3, "inline_live", -1639285038, new Z(7));
    public static final BannerItemType AD = new BannerItemType("AD", 4, "ad", 3107, new C2324a0(6));
    public static final BannerItemType AD_INLINE = new BannerItemType("AD_INLINE", 5, "ad_inline", 482424373, new C2327b0(6));
    public static final BannerItemType AD_INLINE_LIVE = new BannerItemType("AD_INLINE_LIVE", 6, "ad_inline_live", 963562678, new C2330c0(7));
    public static final BannerItemType AD_INLINE_AV = new BannerItemType("AD_INLINE_AV", 7, "ad_inline_av", 944018047, new C2333d0(8));

    private static final /* synthetic */ BannerItemType[] $values() {
        return new BannerItemType[]{STATIC, INLINE_AV, INLINE_OGV, INLINE_LIVE, AD, AD_INLINE, AD_INLINE_LIVE, AD_INLINE_AV};
    }

    static {
        BannerItemType[] bannerItemTypeArr$values = $values();
        $VALUES = bannerItemTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(bannerItemTypeArr$values);
    }

    private BannerItemType(String str, int i7, String str2, int i8, Function0 function0) {
        this.type = str2;
        this.viewType = i8;
        this.creator = function0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BannerItem _init_$lambda$0() {
        return new BannerItem();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BannerItem _init_$lambda$1() {
        return new com.bilibili.pegasus.holders.bannerv8.items.o();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BannerItem _init_$lambda$2() {
        return new com.bilibili.pegasus.holders.bannerv8.items.o();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BannerItem _init_$lambda$3() {
        return new com.bilibili.pegasus.holders.bannerv8.items.o();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BannerItem _init_$lambda$4() {
        final int i7 = 0;
        return new pi.b(GAdBizKt.getGAdPegasus().getBanner().getBannerItem(), new Function1(i7) { // from class: com.bilibili.pegasus.holders.bannerv8.k

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f77813a;

            {
                this.f77813a = i7;
            }

            public final Object invoke(Object obj) {
                switch (this.f77813a) {
                    case 0:
                        return ((gp0.b) obj).f120534m;
                    default:
                        return String.valueOf(((KReplyInfo) obj).getId());
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BannerItem _init_$lambda$5() {
        final int i7 = 0;
        return new pi.b(GAdBizKt.getGAdPegasus().getBanner().getBannerItem(), new Function1(i7) { // from class: com.bilibili.pegasus.holders.bannerv8.i

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f77746a;

            {
                this.f77746a = i7;
            }

            public final Object invoke(Object obj) {
                switch (this.f77746a) {
                    case 0:
                        return ((gp0.b) obj).f120534m;
                    case 1:
                        int i8 = IMShareEntryActivity.K;
                        ((MutableBundleLike) obj).put(IDeviceColorModule.EDGE_MODE_KEY, String.valueOf(2));
                        return null;
                    default:
                        ((JsonBuilder) obj).setIgnoreUnknownKeys(true);
                        return Unit.INSTANCE;
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BannerItem _init_$lambda$6() {
        final int i7 = 0;
        return new pi.b(GAdBizKt.getGAdPegasus().getBanner().getBannerItem(), new Function1(i7) { // from class: com.bilibili.pegasus.holders.bannerv8.j

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f77812a;

            {
                this.f77812a = i7;
            }

            public final Object invoke(Object obj) {
                switch (this.f77812a) {
                    case 0:
                        return ((gp0.b) obj).f120534m;
                    default:
                        return Boolean.valueOf(((IRuntime.a) obj) instanceof IRuntime.a.d);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BannerItem _init_$lambda$7() {
        return new pi.b(GAdBizKt.getGAdPegasus().getBanner().getBannerItem(), new com.bilibili.bplus.followinglist.quick.consume.h(1));
    }

    @NotNull
    public static EnumEntries<BannerItemType> getEntries() {
        return $ENTRIES;
    }

    public static BannerItemType valueOf(String str) {
        return (BannerItemType) Enum.valueOf(BannerItemType.class, str);
    }

    public static BannerItemType[] values() {
        return (BannerItemType[]) $VALUES.clone();
    }

    @NotNull
    public final Function0<BannerItem<gp0.b, ?>> getCreator() {
        return this.creator;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    public final int getViewType() {
        return this.viewType;
    }
}
